package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.settings.search.SearchManager
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.onClick

@SettingFragment("biliroaming_settings")
class BiliRoamingSettingsFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("reboot")?.onClick { Utils.reboot(); true }
    }

    override fun onDestroy() {
        SearchManager.clearPreferencesCache()
        super.onDestroy()
    }
}
