@file:Suppress("DEPRECATION")

package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.settings.Setting
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.*
import java.util.Date

@SettingFragment("biliroaming_setting_backup")
class BackupFragment : BiliRoamingBaseSettingFragment() {
    companion object {
        private const val REQ_CODE_BACKUP = 0x158
        private const val REQ_CODE_RESTORE = 0x159
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("backup")?.onClick {
            val intent = Intent(Intent.ACTION_CREATE_DOCUMENT).apply {
                type = "application/zip"
                val time = Date(System.currentTimeMillis()).format("yyyyMMddHHmmss")
                val identifier = when (Utils.getMobiApp()) {
                    "android_i" -> "Play"
                    "android_hd" -> "HD"
                    "android_b" -> "Blue"
                    else -> "Pink"
                }
                val title = "BiliRoamingX_${identifier}_backup_$time.zip"
                putExtra(Intent.EXTRA_TITLE, title)
                addCategory(Intent.CATEGORY_OPENABLE)
            }
            try {
                Toasts.showShortWithId("biliroaming_toast_pls_choose_save_path")
                val title = Utils.getString("biliroaming_backup_title")
                startActivityForResult(Intent.createChooser(intent, title), REQ_CODE_BACKUP)
            } catch (ex: ActivityNotFoundException) {
                Toasts.showShortWithId("biliroaming_pls_install_file_manager")
            }
            true
        }
        findPreference<Preference>("restore")?.onClick {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
                type = "*/*"
                putExtra(Intent.EXTRA_MIME_TYPES, arrayOf("application/zip", "text/xml"))
                addCategory(Intent.CATEGORY_OPENABLE)
            }
            try {
                Toasts.showShortWithId("biliroaming_toast_pls_choose_restore_path")
                val title = Utils.getString("biliroaming_restore_title")
                startActivityForResult(Intent.createChooser(intent, title), REQ_CODE_RESTORE)
            } catch (ex: ActivityNotFoundException) {
                Toasts.showShortWithId("biliroaming_pls_install_file_manager")
            }
            true
        }
    }

    @Deprecated("Deprecated", ReplaceWith(""))
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val uri = data?.data
        if (resultCode != Activity.RESULT_OK || uri == null) return
        val resolver = Utils.getContext().contentResolver
        if (requestCode == REQ_CODE_BACKUP) {
            Utils.async {
                runCatching {
                    resolver.openOutputStream(uri)?.use { output ->
                        BackupHelper.backup(output)
                    }
                }.onSuccess {
                    Toasts.showShortWithId("biliroaming_toast_backup_success")
                }.onFailure {
                    Logger.error(it) { "backup failed" }
                    Toasts.showShortWithId("biliroaming_toast_backup_failed")
                }
            }
        } else if (requestCode == REQ_CODE_RESTORE) {
            Utils.async {
                restoring = true
                Setting.asyncExecuteOnChangeAction(false)
                runCatching {
                    (resolver.openInputStream(uri)
                        ?: error("stream open failed, uri: $uri")).use { input ->
                        BackupHelper.restore(input, uri)
                    }
                }.onSuccess {
                    Utils.runOnMainThread {
                        showNeedRebootDialog()
                    }
                }.onFailure {
                    Logger.error(it) { "restore failed" }
                    Toasts.showShortWithId("biliroaming_toast_restore_failed")
                }
                Utils.runOnMainThread {
                    Setting.asyncExecuteOnChangeAction(true)
                    restoring = false
                }
            }
        }
    }

    private fun showNeedRebootDialog() {
        val message = Utils.getString("biliroaming_dialog_msg_restore_success")
        val confirm = Utils.getString("biliroaming_need_reboot_dialog_confirm")
        val later = Utils.getString("biliroaming_need_reboot_dialog_later")
        AlertDialog.Builder(context)
            .setMessage(message)
            .setNegativeButton(later, null)
            .setPositiveButton(confirm) { _, _ -> Utils.reboot() }
            .create().constraintSize().show()
    }
}
