package app.revanced.bilibili.settings.fragments

import android.content.SharedPreferences
import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.blkvPrefs
import app.revanced.bilibili.utils.edit

class CustomizeHomeFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_customize_home") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference(Settings.DRAWER.key, PrefsDisableReason.APP_VERSION) {
            Utils.isHd()
        }
    }

    override fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        super.onPreferenceChanged(sharedPreferences, key)
        if (resumed && Settings.BLOCK_TOP_ACTIVITY.key == key && Settings.BLOCK_TOP_ACTIVITY.boolean) {
            blkvPrefs.edit {
                putString("PREF_KEY_ENTRANCE_CACHE", "")
            }
        }
    }
}
