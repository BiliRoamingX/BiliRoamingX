package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import app.revanced.bilibili.utils.Utils

class CustomizeSearchFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_customize_search") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        disablePreference("search_type", PrefsDisableReason.APP_VERSION) {
            Utils.isHd()
        }
    }
}
