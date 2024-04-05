package app.revanced.bilibili.patches

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.media.MediaScannerConnection
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.view.View
import android.widget.Toast
import androidx.annotation.Keep
import androidx.documentfile.provider.DocumentFile
import app.revanced.bilibili.patches.SubtitleImportSavePatch.HookInfo.getDanmakuParamsMethod
import app.revanced.bilibili.patches.SubtitleImportSavePatch.HookInfo.getDmViewReplyMethod
import app.revanced.bilibili.patches.SubtitleImportSavePatch.HookInfo.hideWidgetMethod
import app.revanced.bilibili.patches.SubtitleImportSavePatch.HookInfo.loadSubtitleMethod
import app.revanced.bilibili.patches.SubtitleImportSavePatch.HookInfo.setDmViewReplyMethod
import app.revanced.bilibili.patches.SubtitleImportSavePatch.HookInfo.widgetTokenField
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.okhttp.hooks.Subtitle
import app.revanced.bilibili.patches.protobuf.hooks.DmView
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.community.service.dm.v1.DmViewReply
import java.io.File
import java.net.URL

object SubtitleImportSavePatch {
    private val supportedSubExt = arrayOf("ass", "srt", "vtt", "json")

    private fun readAndConvertSubtitle(uri: Uri, type: String) = runCatching {
        Utils.getContext().contentResolver.openInputStream(uri)
            ?.bufferedReader()?.use { it.readText() } ?: error("read failed")
    }.onFailure {
        Utils.runOnMainThread(800L) {
            Toasts.showShort("字幕导入失败，无法读取")
        }
        LogHelper.error({ "Failed to read subtitle, type: $type, uri: $uri" }, it)
    }.mapCatching {
        when (type) {
            "ass" -> SubtitleHelper.ass2Bcc(it)
            "srt", "vtt" -> SubtitleHelper.vttOrSrt2Bcc(it)
            "json" -> it
            else -> error("unsupported")
        }
    }.onFailure {
        Utils.runOnMainThread(800L) {
            Toasts.showShort("字幕导入失败，无法转换")
        }
        LogHelper.error({ "Failed to convert subtitle, type: $type, uri: $uri" }, it)
    }.getOrNull()

    @Keep
    @JvmStatic
    @SuppressLint("InlinedApi")
    fun onCreateSubtitleWidget(widget: Any, view: View) {
        val importButton = view.findView<View>("biliroaming_import_subtitle")
        val saveButton = view.findView<View>("biliroaming_save_subtitle")
        if (!Settings.SUBTITLE_IMPORT_SAVE.boolean) {
            importButton.visibility = View.GONE
            saveButton.visibility = View.GONE
            return
        }
        importButton.visibility = View.VISIBLE
        saveButton.visibility = View.VISIBLE
        val interactLayerService = widget.getObjectField(
            "interactLayerServiceForBiliRoaming"
        ) ?: return
        val widgetService = widget.getObjectField(
            "widgetServiceForBiliRoaming"
        ) ?: return
        importButton.setOnClickListener { button ->
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
                type = "*/*"
                putExtra(
                    Intent.EXTRA_MIME_TYPES,
                    arrayOf("application/x-subrip", "application/octet-stream", "application/json")
                )
                addCategory(Intent.CATEGORY_OPENABLE)
            }
            (button.context as Activity).launchCatching(intent) { code, data ->
                val uri = data?.data
                if (code != Activity.RESULT_OK || uri == null) return@launchCatching
                val type = (DocumentFile.fromSingleUri(Utils.getContext(), uri)?.name
                    ?: uri.toString()).substringAfterLast('.').lowercase()
                if (!supportedSubExt.contains(type)) {
                    Utils.runOnMainThread(800L) {
                        Toasts.showShort("字幕导入失败，格式不支持")
                    }
                    return@launchCatching
                }
                val dmViewReply = interactLayerService.callMethod(getDanmakuParamsMethod)
                    ?.callMethodAs<DmViewReply>(getDmViewReplyMethod) ?: return@launchCatching
                val newDmViewReply = DmViewReply.parseFrom(dmViewReply.toByteArray())
                val subtitle = newDmViewReply.subtitle
                val importedSubtitles = Subtitle.importedSubtitles.second
                val index = importedSubtitles.size
                readAndConvertSubtitle(uri, type)?.let {
                    importedSubtitles.add(it)
                } ?: return@launchCatching
                val newSubtitle = DmView.newImportSubtitle(index, subtitle)
                subtitle.addSubtitles(newSubtitle)
                interactLayerService.callMethod(setDmViewReplyMethod, newDmViewReply)
                interactLayerService.callMethod(loadSubtitleMethod, newSubtitle, null)
                widgetService.callMethod(hideWidgetMethod, widget.getObjectField(widgetTokenField))
                Utils.runOnMainThread(800L) {
                    Toasts.showShort("字幕导入成功")
                }
            }.onFailure {
                Toasts.showShortWithId("biliroaming_pls_install_file_manager")
            }
        }
        saveButton.setOnClickListener { button ->
            val dmViewReply = interactLayerService.callMethod(getDanmakuParamsMethod)
                ?.callMethodAs<DmViewReply>(getDmViewReplyMethod) ?: return@setOnClickListener
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
                Utils.async { saveSubtitles(dmViewReply) }
            } else {
                (button.context as Activity).requestPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) { granted, shouldExplain ->
                    if (granted) {
                        Utils.async { saveSubtitles(dmViewReply) }
                    } else if (shouldExplain) {
                        Toasts.showShort("获取存储权限失败，请前往设置开启存储权限")
                    }
                }
            }
            widgetService.callMethod(hideWidgetMethod, widget.getObjectField(widgetTokenField))
        }
    }

    private fun saveSubtitles(dmViewReply: DmViewReply) {
        val (main, episode) = VideoInfoHolder.currentTitle() ?: return
        Toasts.showShort("字幕保存中")
        val downloadDir =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val subtitleDir = File(downloadDir, "bilibili/subtitles")
        val childPath = if (episode.isEmpty()) {
            main.toValidFatFilename()
        } else {
            "${main.toValidFatFilename()}/${episode.toValidFatFilename()}"
        }
        val saveDir = File(subtitleDir, childPath).apply { mkdirs() }
        var successCount = 0
        var failedCount = 0
        dmViewReply.subtitle.subtitlesList.forEach { sub ->
            runCatching {
                val bcc = URL(sub.subtitleUrl).readText().let { SubtitleHelper.formatBcc(it) }
                arrayOf("json", "srt").forEach { format ->
                    val filename = if (episode.isEmpty()) {
                        "$main-${sub.lan}-${sub.lanDoc}.$format"
                    } else {
                        "$main-$episode-${sub.lan}-${sub.lanDoc}.$format"
                    }.toValidFatFilename()
                    val saveFile = File(saveDir, filename)
                    if (format == "json") {
                        saveFile.writeText(bcc)
                    } else {
                        saveFile.writeText(SubtitleHelper.bccToSrt(bcc))
                    }
                }
            }.onFailure {
                LogHelper.error({ "subtitle save failed, url: ${sub.subtitleUrl}" }, it)
                failedCount++
            }.onSuccess {
                successCount++
            }
        }
        MediaScannerConnection.scanFile(
            Utils.getContext(),
            arrayOf(saveDir.path),
            null, null
        )
        if (failedCount != 0 && successCount == 0) {
            Toasts.showShort("所有字幕保存失败")
        } else if (failedCount != 0) {
            Toasts.show("部分字幕成功保存至 ${saveDir.path}", Toast.LENGTH_LONG)
        } else {
            Toasts.show("所有字幕成功保存至 ${saveDir.path}", Toast.LENGTH_LONG)
        }
    }

    object HookInfo {
        @Keep
        @JvmStatic
        var getDanmakuParamsMethod = ""

        @Keep
        @JvmStatic
        var getDmViewReplyMethod = ""

        @Keep
        @JvmStatic
        var setDmViewReplyMethod = ""

        @Keep
        @JvmStatic
        var loadSubtitleMethod = ""

        @Keep
        @JvmStatic
        var hideWidgetMethod = ""

        @Keep
        @JvmStatic
        var widgetTokenField = ""

        init {
            init()
        }

        @Keep
        @JvmStatic
        private fun init() {
        }
    }
}
