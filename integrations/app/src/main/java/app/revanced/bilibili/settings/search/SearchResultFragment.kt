package app.revanced.bilibili.settings.search

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsets
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.fragment.app.FragmentTransaction
import androidx.preference.Preference
import androidx.preference.PreferenceCategory
import app.revanced.bilibili.settings.fragments.BiliRoamingBaseSettingFragment
import app.revanced.bilibili.utils.*

class SearchResultFragment : BiliRoamingBaseSettingFragment("biliroaming_search_result") {
    private var editText: EditText? = null
    override val showSearchMenu: Boolean
        get() = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = super.onCreateView(inflater, container, savedInstanceState) as ViewGroup
        val insertIndex = if (Utils.isHd()) 1 else 0
        val editText = EditText(context).apply {
            layoutParams = ViewGroup.MarginLayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }
        rootView.addView(editText, insertIndex)
        this.editText = editText
        editText.doOnTextChanged { text, _, _, _ ->
            search(text?.toString().orEmpty().trim())
        }
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText?.requestFocus()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            hostActivity.window?.decorView?.windowInsetsController?.show(WindowInsets.Type.ime())
        } else {
            editText?.postDelayed(50) {
                systemService<InputMethodManager>().showSoftInput(editText, 0)
            }
        }
    }

    private fun search(keyword: String) {
        val category = findPreference<PreferenceCategory>("category_search_result")
            ?: return
        if (keyword.isEmpty()) {
            category.removeAll()
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
                    category.removeAll()
                    preferences.forEach {
                        category.addPreference(it)
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
