package app.revanced.bilibili.settings.search

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.preference.Preference
import androidx.preference.PreferenceCategory
import app.revanced.bilibili.settings.fragments.BiliRoamingBaseSettingFragment
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.widget.SearchBar
import com.bilibili.lib.ui.garb.Garb

@Suppress("DEPRECATION", "UNUSED", "UNUSED_PARAMETER")
class SearchResultFragment : BiliRoamingBaseSettingFragment("biliroaming_search_result"),
    FragmentManager.OnBackStackChangedListener {
    override val showSearchBarForHd: Boolean
        get() = true
    override val showSearchMenu: Boolean
        get() = false

    private val searchBar by unsafeLazy {
        SearchBar(hostContext).apply { onSearch = { search(it) } }
    }

    override fun onBackStackChanged() {
        val backStackEntryCount = parentFragmentManager.backStackEntryCount
        if (backStackEntryCount > 0 && parentFragmentManager.getBackStackEntryAt(
                backStackEntryCount - 1
            ).breadCrumbTitle != Utils.getString("biliroaming_search")
        ) {
            searchBar.hideKeyboard()
            val toolbar = hostActivity.findView<Toolbar>("nav_top_bar")
            toolbar.removeView(searchBar)
        }
    }

    @JvmSynthetic
    fun onBackStackChangeCommitted(fragment: Fragment, pop: Boolean) {
    }

    @JvmSynthetic
    fun onBackStackChangeStarted(fragment: Fragment, pop: Boolean) {
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (!Utils.isHd()) {
            val toolbar = hostActivity.findView<Toolbar>("nav_top_bar")
            toolbar.addView(searchBar)
            parentFragmentManager.addOnBackStackChangedListener(this)
        } else {
            hdToolbar.onSearch = { search(it) }
        }
    }

    override fun onDestroyView() {
        if (!Utils.isHd()) {
            searchBar.hideKeyboard()
            val toolbar = hostActivity.findView<Toolbar>("nav_top_bar")
            toolbar.removeView(searchBar)
            parentFragmentManager.removeOnBackStackChangedListener(this)
        }
        super.onDestroyView()
    }

    override fun onSkinChanged(garb: Garb) {
        super.onSkinChanged(garb)
        if (!Utils.isHd()) {
            searchBar.tintKeywordInput(garb)
            searchBar.tintClearButton(garb)
        } else {
            hdToolbar.tintSearchBar(garb)
        }
    }

    private fun search(keyword: String) {
        val root = findPreference<PreferenceCategory>("category_search_result")
            ?: return
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

    private fun navigation(preference: Preference, item: PreferenceItem) {
        val fragmentManager = parentFragmentManager
        // hold activity instance temporarily before popBackStack
        val hostActivity = hostActivity
        val enterAnimResId = enterAnimResId
        // keep BiliRoamingSettingsFragment
        val moduleName = Utils.getString("biliroaming_settings_title")
        if (Utils.isHd()) {
            hdToolbar.hideKeyboard()
            val contentId = (requireView().parent as View).id
            var topIndex = fragmentManager.backStackEntryCount - 1
            while (topIndex >= 0 && !fragmentManager.getBackStackEntryAt(topIndex).breadCrumbTitle.isNullOrEmpty()) {
                fragmentManager.popBackStackImmediate()
                topIndex = fragmentManager.backStackEntryCount - 1
            }
            val title = item.parent?.title ?: moduleName
            val args = preference.extras.apply {
                putString(EXTRA_TITLE, title)
            }
            val fragment = item.belongFragment.new()
            fragment.arguments = args
            fragmentManager.beginTransaction()
                .replace(contentId, fragment, item.belongFragment.name)
                .addToBackStack("stack:tag:biliPreferences")
                .setBreadCrumbTitle(title)
                .commitAllowingStateLoss()
            return
        }
        val backStackEntryCount = fragmentManager.backStackEntryCount
        val popCount = if (backStackEntryCount > 0
            && fragmentManager.getBackStackEntryAt(0).breadCrumbTitle == moduleName
        ) backStackEntryCount - 1 else backStackEntryCount
        repeat(popCount) { fragmentManager.popBackStack() }
        fragmentManager.executePendingTransactions()
        val title = item.parent?.title ?: moduleName
        hostActivity.title = title
        val contentId = Utils.getResId("content_layout", "id")
        val fragment = item.belongFragment.new()
        fragment.arguments = preference.peekExtras()
        fragmentManager.beginTransaction()
            .setCustomAnimations(enterAnimResId, 0, 0, 0)
            .replace(contentId, fragment, item.belongFragment.name)
            .addToBackStack("stack:tag:biliPreferences")
            .setBreadCrumbTitle(title)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commitAllowingStateLoss()
    }
}
