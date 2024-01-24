package app.revanced.bilibili.settings.fragments

import android.content.SharedPreferences
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.blkvPrefs
import app.revanced.bilibili.utils.edit

class CustomizeHomeFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_customize_home") {
    override fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        super.onPreferenceChanged(sharedPreferences, key)
        if (Settings.BLOCK_TOP_ACTIVITY.key == key && Settings.BLOCK_TOP_ACTIVITY.boolean) {
            blkvPrefs.edit {
                putString("PREF_KEY_ENTRANCE_CACHE", "")
            }
        }
    }
}
