package app.revanced.bilibili.settings.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.preference.Preference
import app.revanced.bilibili.settings.fragments.BiliRoamingBaseSettingFragment
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.widget.SearchBar

class SearchResultFragment : BiliRoamingBaseSettingFragment("biliroaming_search_result") {
    override val showSearchMenu: Boolean
        get() = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = super.onCreateView(inflater, container, savedInstanceState) as ViewGroup
        val insertIndex = if (Utils.isHd()) 1 else 0
        val searchBar = SearchBar(hostContext)
        rootView.addView(searchBar, insertIndex)
        searchBar.onSearch = { search(it) }
        return rootView
    }

    private fun search(keyword: String) {
        val root = preferenceScreen
        if (keyword.isEmpty()) {
            root.removeAll()
            return
        }
        Utils.async {
            SearchManager.search(keyword).map { p ->
                Preference(hostContext).apply {
                    title = p.title
                    summary = buildSpannedString {
                        val ps = p.summary
                        if (ps.isNotEmpty())
                            append(ps)
                        val route = p.route()
                        if (ps.isNotEmpty() && route.isNotEmpty())
                            appendLine()
                        if (route.isNotEmpty())
                            relativeSize(0.8f) { append(route) }
                    }
                    extras.putString(EXTRA_LOCATION, p.key)
                    onClick { navigation(it, p); true }
                }
            }.also { preferences ->
                Utils.runOnMainThread {
                    root.removeAll()
                    preferences.forEach {
                        root.addPreference(it)
                    }
                }
            }
        }
    }

    @SuppressLint("CommitTransaction")
    private fun navigation(preference: Preference, item: PreferenceItem) {
        val fragmentManager = parentFragmentManager
        // hold activity instance temporarily before popBackStack
        val hostActivity = hostActivity
        val enterAnimResId = enterAnimResId
        // keep BiliRoamingSettingsFragment
        repeat(fragmentManager.backStackEntryCount - 1) {
            fragmentManager.popBackStack()
        }
        fragmentManager.executePendingTransactions()
        val title = item.parent?.title ?: Utils.getString("biliroaming_settings_title")
        hostActivity.title = title
        val contentId = Utils.getResId("content_layout", "id")
        val fragment = item.belongFragment.new().apply {
            arguments = preference.peekExtras()
        }
        fragmentManager.beginTransaction()
            .setCustomAnimations(enterAnimResId, 0, 0, 0)
            .replace(contentId, fragment, item.belongFragment.name)
            .addToBackStack("stack:tag:biliPreferences")
            .setBreadCrumbTitle(title)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commitAllowingStateLoss()
    }
}
