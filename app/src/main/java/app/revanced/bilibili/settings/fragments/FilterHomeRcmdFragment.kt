package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference

class FilterHomeRcmdFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_filter_home") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("filter_home_recommend_by_keyword")
            ?.extras?.putString(FilterHomeRcmdByKeywordFragment.EXTRA_FROM, "home")
    }
}
