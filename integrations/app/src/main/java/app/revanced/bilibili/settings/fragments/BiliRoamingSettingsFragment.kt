package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.onClick
import com.bilibili.app.preferences.BiliPreferencesActivity

@SettingFragment("biliroaming_settings")
class BiliRoamingSettingsFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("reboot")?.onClick { Utils.reboot(); true }
    }

    override fun onDestroyView() {
        if (!Utils.isHd() && parentFragmentManager.fragments.firstOrNull() is BiliPreferencesActivity.BiliPreferencesFragment)
            searchMenu?.isVisible = false
        super.onDestroyView()
    }
}
