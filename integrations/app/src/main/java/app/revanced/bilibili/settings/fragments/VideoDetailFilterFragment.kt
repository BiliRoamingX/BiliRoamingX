package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.settings.search.annotation.SettingFragment

@SettingFragment("biliroaming_setting_video_detail_filter")
class VideoDetailFilterFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("relate_keyword_filter")
            ?.extras?.putString(FilterHomeRcmdByKeywordFragment.EXTRA_FROM, "video_detail")
    }
}
