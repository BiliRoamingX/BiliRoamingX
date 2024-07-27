package app.revanced.bilibili.settings.fragments

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.Layout
import android.util.Base64
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.FrameLayout
import androidx.annotation.Keep
import androidx.preference.Preference
import app.revanced.bilibili.http.HttpClient
import app.revanced.bilibili.integrations.BuildConfig
import app.revanced.bilibili.patches.okhttp.hooks.Upgrade
import app.revanced.bilibili.settings.Setting
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.*
import java.io.File
import java.nio.file.attribute.FileTime
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

@SettingFragment("biliroaming_setting_about")
class AboutFragment : BiliRoamingBaseSettingFragment() {
    @Keep
    private var checkUpdateMethod = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findPreference<Preference>("version")?.run {
            summary =
                Utils.getString("biliroaming_version_summary_pattern", BuildConfig.VERSION_NAME)
            onClick { onVersionClick(); true }
        }
        findPreference<Preference>("debug")?.summary =
            Utils.getString("biliroaming_debug_summary", logFile.absolutePath)
        findPreference<Preference>("feedback")?.onClick {
            val uri = Uri.parse(Utils.getString("biliroaming_feedback_url"))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            true
        }
        findPreference<Preference>("project_url")?.onClick {
            val uri = Uri.parse(Utils.getString("biliroaming_project_url"))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            true
        }
        findPreference<Preference>("tg_link")?.onClick {
            val uri = Uri.parse(Utils.getString("biliroaming_tg_url"))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            true
        }
        findPreference<Preference>("share_log")?.run {
            onClick { Utils.async { shareLog() }; true }
        }
        checkVersion()
    }

    private fun shareLog() = runCatching {
        val zippedLogFile = zippedLogFile.also {
            it.parentFile?.mkdirs(); it.delete()
        }
        val context = Utils.getContext()
        val tombstonesDir = File(context.filesDir, "tombstones")
        val tombstonesFiles = tombstonesDir.listFiles().orEmpty()
            .sortedByDescending { it.lastModified() }.take(5)
        ZipOutputStream(zippedLogFile.outputStream()).use { zipOutput ->
            tombstonesFiles.forEach { file ->
                val zipEntry = ZipEntry("tombstones/${file.name}")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                    zipEntry.lastModifiedTime = FileTime.fromMillis(file.lastModified())
                zipOutput.putNextEntry(zipEntry)
                file.inputStream().use { it.copyTo(zipOutput) }
            }
            if (logFile.isFile) {
                zipOutput.putNextEntry(ZipEntry(logFile.name))
                logFile.inputStream().use { it.copyTo(zipOutput) }
            }
            if (oldLogFile.isFile) {
                zipOutput.putNextEntry(ZipEntry(oldLogFile.name))
                oldLogFile.inputStream().use { it.copyTo(zipOutput) }
            }
            mapOf(
                "os_ver" to Build.VERSION.RELEASE,
                "api_level" to Build.VERSION.SDK_INT,
                "device" to Build.MANUFACTURER + " " + Build.MODEL,
                "abi_list" to Build.SUPPORTED_ABIS.joinToString(","),
                "os_arch64" to isOsArch64,
                "prebuilt" to isPrebuilt,
                "app_id" to context.packageName,
                "app_ver_name" to versionName,
                "app_ver_code" to versionCode,
                "app_arch64" to isAppArch64,
                "module_ver_name" to BuildConfig.VERSION_NAME,
                "module_ver_code" to BuildConfig.VERSION_CODE,
                "module_settings" to Setting.all.associate { it.key to it() }
            ).toJSONObject().toString(2).run {
                zipOutput.putNextEntry(ZipEntry("info.json"))
                zipOutput.write(toByteArray())
            }
        }
    }.onSuccess {
        Utils.runOnMainThread {
            val uri = Uri.Builder()
                .scheme("content")
                .encodedAuthority("${Utils.getContext().packageName}.fileprovider")
                .path("/internal/${zippedLogFile.name}")
                .build()
            Intent.createChooser(Intent(Intent.ACTION_SEND).apply {
                putExtra(Intent.EXTRA_STREAM, uri)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                setType("application/zip")
            }, Utils.getString("biliroaming_share_log_title")).also { startActivity(it) }
        }
    }.onFailure {
        Logger.error(it) { "Failed to share log" }
        Toasts.showShortWithId("biliroaming_log_share_failed")
    }

    private fun onVersionClick() {
        if (Upgrade.customUpdate(fromSelf = true)) {
            runCatching {
                val (serviceClass, checkUpdateMethod) = checkUpdateMethod.split('#', limit = 2)
                Upgrade.fromSelf = true
                Class.forName(serviceClass).new().callMethod(checkUpdateMethod, hostActivity)
            }.onFailure {
                Upgrade.fromSelf = false
                Logger.error(it) { "Update check failed" }
            }
        } else checkLatestRelease()
    }

    private fun checkVersion() = Utils.async {
        val lastCheckTime = cachePrefs.getLong("version_last_check_time", 0L)
        val now = System.currentTimeMillis()
        if (now - lastCheckTime < 1 * 60 * 1000)
            return@async
        cachePrefs.edit { putLong("version_last_check_time", now) }
        val (tag, _, _) = latestRelease()
            ?: return@async
        val version = tag.removePrefix("v")
        if (!isNewVersion(version))
            return@async
        Utils.runOnMainThread {
            if (isRemoving || isDetached)
                return@runOnMainThread
            val prefs = findPreference<Preference>("version")
            if (prefs != null) {
                val newVersion = Utils.getString("biliroaming_found_new_version", version)
                prefs.summary = prefs.summary?.toString().orEmpty() + newVersion
            }
        }
    }

    private fun isNewVersion(version: String): Boolean {
        val parts = version.split('.')
        val mVersion = BuildConfig.VERSION_NAME
        val mParts = mVersion.split('.')
        if (mParts.size <= 3)
            return mVersion != version
        if (parts.size >= 3 && parts[0] == mParts[0] && parts[1] == mParts[1] && parts[2] == mParts[2])
            return false
        return true
    }

    private fun checkLatestRelease() = Utils.async {
        val (tag, title, changelog) = latestRelease() ?: run {
            Toasts.showShort("检查更新失败，请稍后再试/(ㄒoㄒ)/~~")
            return@async
        }
        val version = tag.removePrefix("v")
        if (!isNewVersion(version)) {
            Toasts.showShort("未发现新版本")
            return@async
        }
        Utils.runOnMainThread {
            if (isRemoving || isDetached)
                return@runOnMainThread
            val webView = WebView(hostContext)
            webView.setBackgroundColor(Color.TRANSPARENT)
            webView.settings.apply {
                mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
            }
            val textColor = Utils.getColor(hostContext, "theme_color_text_primary")
                .toHexColor(alpha = false)
            val html =
                """<!DOCTYPE html><html><head><style>body{color:#$textColor;}h1,h2,h3,h4,h5,h6,strong{font-weight:500;}a{color:#2196F3;}</style></head><body>$changelog</body></html>"""
            val encodedHtml = Base64.encodeToString(html.toByteArray(), Base64.NO_PADDING)
            webView.loadData(encodedHtml, "text/html", "base64")
            val styledTitle = buildSpannedString {
                align(Layout.Alignment.ALIGN_CENTER) {
                    absoluteSize(20.sp) { append(title) }
                }
            }
            val wrapperView = FrameLayout(hostContext).apply {
                addView(
                    webView, FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT,
                        FrameLayout.LayoutParams.MATCH_PARENT
                    ).apply { topMargin = 8.dp }
                )
            }
            AlertDialog.Builder(context)
                .setTitle(styledTitle)
                .setView(wrapperView)
                .setPositiveButton(Utils.getString("biliroaming_view")) { _, _ ->
                    val tagUrl = "https://github.com/BiliRoamingX/BiliRoamingX/releases/tag/$tag"
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(tagUrl))
                    startActivity(intent)
                }
                .create().constraintSize(maxHeight = -1)
                .show()
        }
    }

    private fun latestRelease() = runCatching {
        val releaseUrl = "https://api.github.com/repos/BiliRoamingX/BiliRoamingX/releases/latest"
        val response = HttpClient.get(releaseUrl)?.json()
            ?: return@runCatching null
        val tag = response.optString("tag_name")
        val title = response.optString("name")
        val body = response.optString("body")
            .replace("\r\n", "\n")
        val changelog = MarkdownParser().text(body)
        Triple(tag, title, changelog)
    }.onFailure {
        Logger.error(it) { "Failed to get latest release." }
    }.getOrNull()
}
