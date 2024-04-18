package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference

class VideoDetailFilterFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_video_detail_filter") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("relate_keyword_filter")
            ?.extras?.putString(FilterHomeRcmdByKeywordFragment.EXTRA_FROM, "video_detail")
    }
}
