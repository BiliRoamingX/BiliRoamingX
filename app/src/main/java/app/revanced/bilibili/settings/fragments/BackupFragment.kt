@file:Suppress("DEPRECATION")

package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.content.BiliDocumentsProvider
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.lsposed.hiddenapibypass.HiddenApiBypass
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class BackupFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_backup") {
    companion object {
        private const val REQ_CODE_BACKUP = 0x158
        private const val REQ_CODE_RESTORE = 0x159
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("backup")?.onClick {
            val intent = Intent(Intent.ACTION_CREATE_DOCUMENT).apply {
                type = "application/zip"
                val time = SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault())
                    .format(Date(System.currentTimeMillis()))
                val title = "BiliRoamingX_backup_$time.zip"
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
            val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
                type = "application/zip"
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
                    LogHelper.error({ "backup failed" }, it)
                    Toasts.showShortWithId("biliroaming_toast_backup_failed")
                }
            }
        } else if (requestCode == REQ_CODE_RESTORE) {
            Utils.async {
                runCatching {
                    resolver.openInputStream(uri)?.use { input ->
                        BackupHelper.restore(input)
                    }
                }.onSuccess {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
                        HiddenApiBypass.addHiddenApiExemptions("Landroid")
                    Utils.getContext().callMethod("reloadSharedPreferences")
                    Settings.reload()
                    afterRestore()
                    Utils.runOnMainThread { showNeedRebootDialog() }
                }.onFailure {
                    LogHelper.error({ "restore failed" }, it)
                    Toasts.showShortWithId("biliroaming_toast_restore_failed")
                }
            }
        }
    }

    private fun showNeedRebootDialog() {
        val message = Utils.getString("biliroaming_dialog_msg_restore_success")
        val confirm = Utils.getString("biliroaming_need_reboot_dialog_confirm")
        val later = Utils.getString("biliroaming_need_reboot_dialog_later")
        AlertDialog.Builder(requireContext())
            .setMessage(message)
            .setNegativeButton(later, null)
            .setPositiveButton(confirm) { _, _ -> Utils.reboot() }
            .show()
    }

    /**
     * do something after backup restore finished.
     *
     * notice: you can get a restored settings here.
     */
    private fun afterRestore() {
        if (Settings.BLOCK_TOP_ACTIVITY.boolean)
            blkvPrefs.edit {
                putString("PREF_KEY_ENTRANCE_CACHE", "")
            }
        if (Settings.PURIFY_SPLASH.boolean)
            Utils.clearSplashConfigCache()
        changeComponentState(BiliDocumentsProvider::class.java, Settings.ENABLE_DOC_PROVIDER.boolean)
    }
}
