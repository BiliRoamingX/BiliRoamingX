package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.logFile
import app.revanced.bilibili.utils.onClick

class BiliRoamingSettingsFragment : BiliRoamingBaseSettingFragment("biliroaming_settings") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("debug")?.summary =
            Utils.getString("biliroaming_debug_summary", logFile.absolutePath)
        findPreference<Preference>("reboot")?.onClick { Utils.reboot(); true }
    }
}
