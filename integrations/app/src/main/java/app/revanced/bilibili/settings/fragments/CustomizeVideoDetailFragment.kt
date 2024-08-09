package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.Versions

@SettingFragment("biliroaming_setting_customize_video_detail")
class CustomizeVideoDetailFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference(Settings.BlockFanGuide.key, PrefsDisableReason.NewPlayer) {
            !Utils.newPlayerEnabled()
        }
        disablePreference(Settings.DisableAutoSelect.key, PrefsDisableReason.AppVersion) {
            Versions.ge7_62_0()
        }
        disablePreference(Settings.DisableAutoSubscribe.key, PrefsDisableReason.AppVersion) {
            Versions.ge7_62_0()
        }
        disablePreference(Settings.SaveCommentImage.key, PrefsDisableReason.OfficialSupported) {
            Versions.ge7_76_0()
        }
        disablePreference(Settings.StoryUIStyle.key, PrefsDisableReason.AppVersion) {
            Versions.ge8_9_0()
        }
    }
}
