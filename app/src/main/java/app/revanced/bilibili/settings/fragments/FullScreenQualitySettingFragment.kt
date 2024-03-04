package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.Versions

class FullScreenQualitySettingFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_full_screen_quality") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        if (!Versions.ge7_68_0()) {
            findPreference<Preference>("full_screen_quality")?.title =
                Utils.getString("biliroaming_full_screen_quality_summary")
        }
    }
}
