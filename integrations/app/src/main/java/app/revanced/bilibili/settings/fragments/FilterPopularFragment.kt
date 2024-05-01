package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.settings.search.annotation.SettingFragment

@SettingFragment("biliroaming_setting_filter_popular")
class FilterPopularFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("filter_popular_by_keyword")
            ?.extras?.putString(FilterHomeRcmdByKeywordFragment.EXTRA_FROM, "popular")
    }
}
