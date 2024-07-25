package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.settings.search.annotation.SettingFragment

@SettingFragment("biliroaming_setting_filter_story")
class FilterStoryFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("filter_story_by_keyword")
            ?.extras?.putString(FilterHomeRcmdByKeywordFragment.EXTRA_FROM, "story")
    }
}
