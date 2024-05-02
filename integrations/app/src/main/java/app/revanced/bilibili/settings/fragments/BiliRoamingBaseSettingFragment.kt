package app.revanced.bilibili.settings.fragments

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.RippleDrawable
import android.os.Bundle
import android.util.TypedValue
import android.view.*
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction
import androidx.preference.Preference
import androidx.preference.PreferenceScreen
import androidx.preference.TwoStatePreference
import androidx.recyclerview.widget.LinearLayoutManager
import app.revanced.bilibili.settings.ModulePreferenceManager
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.SearchResultFragment
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.widget.HdBaseToolbar
import com.bilibili.lib.ui.BasePreferenceFragment
import java.lang.reflect.Field

enum class PrefsDisableReason { APP_VERSION, OS_VERSION, NEW_PLAYER, OFFICIAL_SUPPORTED }

abstract class BiliRoamingBaseSettingFragment(private var prefsXmlName: String = "") :
    BasePreferenceFragment(), (Preference) -> Boolean {

    protected var resumed = false
        private set
    protected var restoring = false
    private val preferenceManager = ModulePreferenceManager(Utils.getContext(), Settings.prefs)
    private val listener = OnSharedPreferenceChangeListener { sharedPreferences, key ->
        if (!restoring)
            onPreferenceChanged(sharedPreferences, key)
    }
    private var located = false
    protected open val showSearchMenu: Boolean
        get() = true
    protected var searchMenu: MenuItem? = null
        private set

    protected val enterAnimResId by unsafeLazy {
        val windowAnimationStyleId = with(TypedValue()) {
            hostActivity.theme.resolveAttribute(android.R.attr.windowAnimationStyle, this, true)
            resourceId
        }
        val attributes = ContextThemeWrapper(context, windowAnimationStyleId)
            .obtainStyledAttributes(intArrayOf(android.R.attr.activityOpenEnterAnimation))
        val resId = attributes.getResourceId(0, 0)
        attributes.recycle()
        resId
    }

    init {
        if (prefsXmlName.isEmpty()) {
            val annotation = javaClass.getAnnotation(SettingFragment::class.java)
            if (annotation != null)
                prefsXmlName = annotation.prefsXmlName
        }
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        fixPreferenceManager()
        val resId = Utils.getResId(prefsXmlName, "xml")
        addPreferencesFromResource(resId)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // make sure listening after setting changed
        Settings.registerPreferenceChangeListener(listener)
    }

    override fun onDestroy() {
        // make sure listening after setting changed
        Settings.unregisterPreferenceChangeListener(listener)
        located = false
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
        if (Utils.isHd())
            preferenceManager.onPreferenceTreeClick(this)
    }

    override fun onStop() {
        super.onStop()
        if (Utils.isHd())
            preferenceManager.onPreferenceTreeClick(null)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = super.onCreateView(inflater, container, savedInstanceState) as ViewGroup
        if (!Utils.isHd()) return rootView
        val title = arguments?.getString(EXTRA_TITLE).orEmpty()
            .ifEmpty { Utils.getString("biliroaming_settings_title") }
        val toolbar = HdBaseToolbar(inflater.context, title) {
            parentFragmentManager.popBackStack()
        }
        rootView.addView(
            toolbar, 0, ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (!Utils.isHd()) addSearchMenu()
    }

    @SuppressLint("CommitTransaction")
    private fun addSearchMenu() {
        val toolbar = hostActivity.findView<Toolbar>("nav_top_bar")
        val menuId = Utils.getResId("biliroaming_menu_item_action_search", "id")
        val menuItem = toolbar.menu.findItem(menuId)
        if (menuItem == null) {
            val menuTitle = Utils.getString("biliroaming_search")
            searchMenu = toolbar.menu.add(Menu.NONE, menuId, Menu.NONE, menuTitle).apply {
                icon = Utils.getDrawable(context, "biliroaming_ic_search")
                setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
            }
        } else {
            searchMenu = menuItem
        }
        toolbar.onMenuItemClick {
            if (it.itemId == menuId) {
                val title = Utils.getString("biliroaming_search")
                hostActivity.title = title
                val contentId = Utils.getResId("content_layout", "id")
                val tag = SearchResultFragment::class.java.name
                parentFragmentManager.beginTransaction()
                    .setCustomAnimations(enterAnimResId, 0, 0, 0)
                    .replace(contentId, SearchResultFragment(), tag)
                    .addToBackStack("stack:tag:biliPreferences")
                    .setBreadCrumbTitle(title)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commitAllowingStateLoss()
                true
            } else false
        }
    }

    @SuppressLint("CommitTransaction")
    override fun invoke(preference: Preference): Boolean {
        preference.fragment?.let {
            val fragmentManager = parentFragmentManager
            val args = preference.extras.apply {
                putString(EXTRA_TITLE, preference.title?.toString().orEmpty())
            }
            val classLoader = Utils.getContext().classLoader
            val fragment = fragmentManager.fragmentFactory.instantiate(classLoader, it)
            fragment.arguments = args
            fragmentManager.beginTransaction()
                .replace((requireView().parent as View).id, fragment, it)
                .addToBackStack("stack:tag:biliPreferences")
                .commitAllowingStateLoss()
            return true
        }
        return false
    }

    override fun onResume() {
        super.onResume()
        resumed = true
        searchMenu?.isVisible = showSearchMenu
        if (!Utils.isHd()) tintSearchMenu()
        if (!located) {
            located = true
            val locationKey = arguments?.getString(EXTRA_LOCATION).orEmpty()
            if (locationKey.isNotEmpty()) runCatching {
                highlight(locationKey)
            }.onFailure {
                Logger.error(it) { "Failed to highlight preference, key: $locationKey" }
            }
        }
    }

    private fun tintSearchMenu() {
        val searchMenuIcon = searchMenu?.icon
        val garb = ThemeApplier.currentGarb()
        if (!garb.isPure) {
            searchMenuIcon?.setTint(garb.fontColor)
        } else if (garb.id.let { it != 1L && it != 8L }) {
            searchMenuIcon?.setTint(Color.WHITE)
        } else {
            searchMenuIcon?.setTint(Utils.getColor(context, "theme_color_primary_tr_icon"))
        }
    }

    private fun highlight(key: String) {
        val listView = listView
        val adapter = listView.callMethod("getAdapter") ?: return
        val getPositionMethod = adapter.javaClass.interfaces.firstNotNullOfOrNull { i ->
            if (i.methods.run { size == 2 && all { it.returnType == Int::class.javaPrimitiveType } }) {
                i.methods.first { ms -> ms.parameterTypes.let { it.size == 1 && it[0] == String::class.java } }
            } else null
        } ?: return
        val position = adapter.callMethodAs<Int>(getPositionMethod.name, key)
        if (position == -1) return
        listView.post {
            val layoutManager = listView.layoutManager as LinearLayoutManager
            val centerOffset = ((listView.measuredHeight - 44.dp) / 2).coerceAtLeast(0)
            layoutManager.scrollToPositionWithOffset(position, centerOffset)
        }
        var animCount = 0
        fun RippleDrawable.performAnimation(view: View) {
            setState(intArrayOf(android.R.attr.state_pressed, android.R.attr.state_enabled))
            view.postDelayed(300) {
                setState(intArrayOf())
                if (++animCount < 3) {
                    view.postDelayed(300) {
                        performAnimation(view)
                    }
                }
            }
        }
        listView.postDelayed(300) {
            runCatching {
                val holder = listView.callMethod("findViewHolderForAdapterPosition", position)
                if (holder != null) {
                    val itemView = holder.getFirstFieldByExactType<View>()
                    val foreground = itemView.getFirstFieldByExactType<Drawable>()
                    if (foreground is RippleDrawable)
                        foreground.performAnimation(listView)
                }
            }.onFailure {
                Logger.error(it) { "Failed to perform ripple animation" }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        resumed = false
    }

    private fun fixPreferenceManager() = try {
        val preferenceManagerField = Reflex.findField(javaClass, "mPreferenceManager")
        val mOnNavigateToScreenListenerField = mOnNavigateToScreenListenerField ?: run {
            preferenceManagerField.type.declaredFields.find { f ->
                f.type.isInterface && f.type.declaredMethods.let { ms ->
                    ms.size == 1 && ms[0].parameterTypes.let { ps ->
                        ps.size == 1 && ps[0] == PreferenceScreen::class.java
                    }
                }
            }?.also {
                it.isAccessible = true
                mOnNavigateToScreenListenerField = it
            }
        }
        preferenceManagerField.set(this, preferenceManager)
        mOnNavigateToScreenListenerField?.set(preferenceManager, this)
    } catch (t: Throwable) {
        Logger.error(t) { "PreferenceManager fix failed" }
    }

    protected open fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        if (!resumed) return
        for (item in Settings.entries) {
            if (item.key == key && item.needReboot) {
                val message = Utils.getString("biliroaming_need_reboot_dialog_message")
                val confirm = Utils.getString("biliroaming_need_reboot_dialog_confirm")
                val later = Utils.getString("biliroaming_need_reboot_dialog_later")
                AlertDialog.Builder(context)
                    .setMessage(message)
                    .setNegativeButton(later, null)
                    .setPositiveButton(confirm) { _, _ -> Utils.reboot() }
                    .create().constraintSize().show()
                break
            }
        }
    }

    protected fun disablePreference(
        key: String,
        reasonType: PrefsDisableReason,
        condition: (Preference) -> Boolean
    ) {
        val reason = when (reasonType) {
            PrefsDisableReason.APP_VERSION -> {
                { Utils.getString("biliroaming_app_not_support") }
            }

            PrefsDisableReason.OS_VERSION -> {
                { Utils.getString("biliroaming_os_not_support") }
            }

            PrefsDisableReason.NEW_PLAYER -> {
                { Utils.getString("biliroaming_only_support_new_player") }
            }

            PrefsDisableReason.OFFICIAL_SUPPORTED -> {
                { Utils.getString("biliroaming_official_supported") }
            }
        }
        disablePreference(key, reason to condition)
    }

    protected fun disablePreference(
        key: String,
        vararg reasons: Pair<() -> String, (Preference) -> Boolean>,
    ) {
        val preference = findPreference<Preference>(key) ?: return
        for ((reason, condition) in reasons) {
            if (condition(preference)) {
                preference.isEnabled = false
                preference.summary = reason()
                if (preference is TwoStatePreference)
                    preference.isChecked = false
                break
            }
        }
    }

    companion object {
        private var mOnNavigateToScreenListenerField: Field? = null
        const val EXTRA_TITLE = "biliroaming_extra_title"
        const val EXTRA_LOCATION = "biliroaming_extra_location"
    }
}
