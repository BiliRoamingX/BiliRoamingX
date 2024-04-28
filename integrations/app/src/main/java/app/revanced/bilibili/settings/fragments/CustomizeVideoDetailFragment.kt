package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.Versions

class CustomizeVideoDetailFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_customize_video_detail") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference(Settings.BLOCK_FAN_GUIDE.key, PrefsDisableReason.NEW_PLAYER) {
            !Utils.newPlayerEnabled()
        }
        disablePreference(Settings.DISABLE_AUTO_SELECT.key, PrefsDisableReason.APP_VERSION) {
            Versions.ge7_62_0()
        }
        disablePreference(Settings.DISABLE_AUTO_SUBSCRIBE.key, PrefsDisableReason.APP_VERSION) {
            Versions.ge7_62_0()
        }
        disablePreference(Settings.SAVE_COMMENT_IMAGE.key, PrefsDisableReason.OFFICIAL_SUPPORTED) {
            Versions.ge7_76_0()
        }
    }
}
