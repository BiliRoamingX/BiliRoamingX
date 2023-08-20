package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

class CustomizeVideoDetailFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_customize_video_detail") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference(Settings.BLOCK_FAN_GUIDE.key, PrefsDisableReason.NEW_PLAYER) {
            !Utils.newPlayerEnabled
        }
    }
}
