package app.revanced.bilibili.patches

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.annotation.Keep
import androidx.appcompat.app.AlertDialog
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.widget.OnClickOriginListener
import java.lang.reflect.Field

object CacheRedirectPatch {
    private var cacheMenuItemClickListenerField: Field? = null
    private var cacheMenuPanelField: Field? = null

    @Keep
    @JvmStatic
    fun onMenuClick(menuView: View, originListener: OnClickOriginListener) {
        if (!Settings.EXTERNAL_DOWNLOADER.boolean) {
            originListener.onClick_Origin(menuView)
            return
        }
        val packageName = Settings.EXTERNAL_DOWNLOADER_NAME.string.ifEmpty {
            originListener.onClick_Origin(menuView)
            return
        }
        val itemId = menuView.tag?.callMethod("getItemId")
        if (itemId == "VIDEO_DOWNLOAD" || itemId == "menu_download") {
            val videoUrl = VideoInfoHolder.currentVideoUrl() ?: run {
                originListener.onClick_Origin(menuView)
                return
            }
            dismissDialog(originListener)
            showConfirmDialog(context = menuView.context, videoUrl, packageName) {
                originListener.onClick_Origin(menuView)
            }
        } else {
            originListener.onClick_Origin(menuView)
        }
    }

    @Keep
    @JvmStatic
    fun onOgvDownload(
        service: Any,
        originMethod: String,
        context: Context,
        cacheFromType: Enum<*>
    ): Boolean {
        if (cacheFromType.name != "FROM_ACTION_TYPE")
            return false
        if (!Settings.EXTERNAL_DOWNLOADER.boolean) return false
        val packageName = Settings.EXTERNAL_DOWNLOADER_NAME.string
            .ifEmpty { return false }
        val videoUrl = VideoInfoHolder.currentVideoUrl() ?: return false
        showConfirmDialog(context, videoUrl, packageName) {
            service.callMethod(originMethod, context, cacheFromType)
        }
        return true
    }

    private fun showConfirmDialog(
        context: Context,
        videoUrl: String,
        packageName: String,
        onCancel: () -> Unit
    ) {
        val appDialogTheme = Utils.getResId("AppTheme.Dialog.Alert", "style")
        AlertDialog.Builder(context, appDialogTheme)
            .setMessage(Utils.getString("biliroaming_whether_use_external_downloader"))
            .setNegativeButton(Utils.getString("biliroaming_n")) { _, _ ->
                onCancel()
            }.setPositiveButton(Utils.getString("biliroaming_y")) { _, _ ->
                val enabled = runCatchingOrNull {
                    Utils.getContext().packageManager.getApplicationInfo(packageName, 0).enabled
                } ?: false
                if (!enabled) {
                    Toasts.showWithId(
                        "biliroaming_external_downloader_not_installed", Toast.LENGTH_LONG
                    )
                } else {
                    val intent = Intent(Intent.ACTION_SEND).apply {
                        `package` = packageName
                        type = "text/plain"
                        putExtra(Intent.EXTRA_TEXT, videoUrl)
                    }
                    context.runCatching {
                        startActivity(intent)
                    }.onFailure {
                        LogHelper.error({ "external downloader launch failed" }, it)
                    }
                }
            }.show()
    }

    private fun dismissDialog(listener: OnClickOriginListener) = runCatching {
        val menuItemClickListenerField = cacheMenuItemClickListenerField
            ?: listener.javaClass.declaredFields.find { it.type.isInterface }?.also {
                it.isAccessible = true
                cacheMenuItemClickListenerField = it
            } ?: return@runCatching
        val menuItemClickListener = menuItemClickListenerField.get(listener)
            ?: return@runCatching
        val menuPanelField = cacheMenuPanelField
            ?: menuItemClickListener.javaClass.declaredFields.find {
                it.isAccessible = true
                it.get(menuItemClickListener) is Dialog
            }?.also { cacheMenuPanelField = it } ?: return@runCatching
        val menuPanel = menuPanelField.get(menuItemClickListener) as? Dialog
        menuPanel?.dismiss()
    }.onFailure {
        LogHelper.error({ "menu dialog dismiss failed" }, it)
    }
}
