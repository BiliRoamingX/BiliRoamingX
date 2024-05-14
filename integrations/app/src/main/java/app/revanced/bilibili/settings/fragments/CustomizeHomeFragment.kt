package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.Versions
import app.revanced.bilibili.utils.getDeviceSetting
import app.revanced.bilibili.utils.setDeviceSetting
import com.bapis.bilibili.app.distribution.Int64Value
import com.bapis.bilibili.app.distribution.setting.pegasus.PegasusDeviceWithoutFplocalConfig

@SettingFragment("biliroaming_setting_customize_home")
class CustomizeHomeFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference(Settings.Drawer.key, PrefsDisableReason.AppVersion) {
            Utils.isHd()
        }
        disablePreference("customize_bottom", PrefsDisableReason.AppVersion) {
            Utils.isHd()
        }
        disablePreference(
            Settings.DisableHomeStory.key,
            PrefsDisableReason.OfficialSupported
        ) { Versions.ge7_75_0() }
        disableAutoRefreshPreferenceIfNeeded()
    }

    private fun disableAutoRefreshPreferenceIfNeeded() {
        if (!Versions.ge7_76_0())
            return
        val setting = Settings.HomeDisableAutoRefresh
        if (!setting()) {
            disablePreference(setting.key, PrefsDisableReason.OfficialSupported) { true }
            return
        }
        val deviceSetting = getDeviceSetting<PegasusDeviceWithoutFplocalConfig>()
        if (deviceSetting != null && deviceSetting.autoRefreshState.value == 4L) {
            disablePreference(setting.key, PrefsDisableReason.OfficialSupported) { true }
            return
        }
        val message = PegasusDeviceWithoutFplocalConfig().apply {
            autoRefreshState = Int64Value().apply { value = 4L }
        }
        if (setDeviceSetting(message))
            disablePreference(setting.key, PrefsDisableReason.OfficialSupported) { true }
    }
}
