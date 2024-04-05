package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.preference.Preference
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.onClick

class ExternalDownloaderFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_external_downloader") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("package_name")?.onClick {
            val editText = EditText(context)
            editText.hint = Utils.getString("biliroaming_external_downloader_name_hint")
            editText.setText(Settings.EXTERNAL_DOWNLOADER_NAME.string)
            AlertDialog.Builder(requireContext())
                .setView(editText)
                .setNegativeButton(android.R.string.cancel, null)
                .setPositiveButton(android.R.string.ok) { _, _ ->
                    val newName = editText.text.toString().trim()
                    Settings.EXTERNAL_DOWNLOADER_NAME.saveValue(newName)
                    updatePackageNamePrefsSummary()
                }.show()
            true
        }
        updatePackageNamePrefsSummary()
    }

    private fun updatePackageNamePrefsSummary() {
        val preference = findPreference<Preference>("package_name") ?: return
        val name = Settings.EXTERNAL_DOWNLOADER_NAME.string
        val summary = if (name.isNotEmpty()) {
            Utils.getString("biliroaming_external_downloader_name_summary", name)
        } else {
            Utils.getString("biliroaming_external_downloader_name_tips")
        }
        preference.summary = summary
    }
}
