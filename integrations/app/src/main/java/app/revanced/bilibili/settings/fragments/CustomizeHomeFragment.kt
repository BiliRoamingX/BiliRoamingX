package app.revanced.bilibili.settings.fragments

import android.content.SharedPreferences
import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.app.distribution.Int64Value
import com.bapis.bilibili.app.distribution.setting.pegasus.PegasusDeviceWithoutFplocalConfig

@SettingFragment("biliroaming_setting_customize_home")
class CustomizeHomeFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference(Settings.DRAWER.key, PrefsDisableReason.APP_VERSION) {
            Utils.isHd()
        }
        disablePreference("customize_bottom", PrefsDisableReason.APP_VERSION) {
            Utils.isHd()
        }
        disablePreference(
            Settings.DISABLE_MAIN_PAGE_STORY.key,
            PrefsDisableReason.OFFICIAL_SUPPORTED
        ) { Versions.ge7_75_0() }
        disableAutoRefreshPreferenceIfNeeded()
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
