package app.revanced.bilibili.settings.fragments

import android.content.SharedPreferences
import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.app.distribution.Int64Value
import com.bapis.bilibili.app.distribution.setting.pegasus.PegasusDeviceWithoutFplocalConfig

class CustomizeHomeFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_customize_home") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference(Settings.DRAWER.key, PrefsDisableReason.APP_VERSION) {
            Utils.isHd()
        }
        disablePreference("customize_bottom", PrefsDisableReason.APP_VERSION) {
            Utils.isHd()
        }
        disableAutoRefreshPreferenceIfNeeded()
    }

    override fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        super.onPreferenceChanged(sharedPreferences, key)
        if (resumed && Settings.BLOCK_TOP_ACTIVITY.key == key && Settings.BLOCK_TOP_ACTIVITY.boolean) {
            blkvPrefs.edit {
                putString("PREF_KEY_ENTRANCE_CACHE", "")
            }
        }
    }

    private fun disableAutoRefreshPreferenceIfNeeded() {
        if (!Versions.ge7_76_0())
            return
        val setting = Settings.HOME_DISABLE_AUTO_REFRESH
        if (!setting.boolean) {
            disablePreference(setting.key, PrefsDisableReason.OFFICIAL_SUPPORTED) { true }
            return
        }
        val deviceSetting = getDeviceSetting<PegasusDeviceWithoutFplocalConfig>()
        if (deviceSetting != null && deviceSetting.autoRefreshState.value == 4L) {
            disablePreference(setting.key, PrefsDisableReason.OFFICIAL_SUPPORTED) { true }
            return
        }
        val message = PegasusDeviceWithoutFplocalConfig().apply {
            autoRefreshState = Int64Value().apply { value = 4L }
        }
        if (setDeviceSetting(message))
            disablePreference(setting.key, PrefsDisableReason.OFFICIAL_SUPPORTED) { true }
    }
}
