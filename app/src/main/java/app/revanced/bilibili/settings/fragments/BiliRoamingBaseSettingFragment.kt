package app.revanced.bilibili.settings.fragments

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.Preference
import androidx.preference.PreferenceScreen
import androidx.preference.TwoStatePreference
import app.revanced.bilibili.settings.ModulePreferenceManager
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.widget.HdBaseToolbar
import com.bilibili.lib.ui.BasePreferenceFragment
import java.lang.reflect.Field

enum class PrefsDisableReason { APP_VERSION, OS_VERSION, NEW_PLAYER }

abstract class BiliRoamingBaseSettingFragment(private val prefsXmlName: String) :
    BasePreferenceFragment(), (Preference) -> Boolean {

    protected var resumed = false
        private set
    protected var restoring = false
    private val preferenceManager = ModulePreferenceManager(Utils.getContext(), Settings.prefs)
    private val listener = OnSharedPreferenceChangeListener { sharedPreferences, key ->
        if (!restoring)
            onPreferenceChanged(sharedPreferences, key)
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

    @SuppressLint("CommitTransaction")
    override fun invoke(preference: Preference): Boolean {
        preference.fragment?.let {
            val fragmentManager = parentFragmentManager
            val args = Bundle(preference.extras).apply {
                putString(EXTRA_TITLE, preference.title?.toString().orEmpty())
            }
            val classLoader = Utils.getContext().classLoader
            val fragment = fragmentManager.fragmentFactory.instantiate(classLoader, it)
            fragment.arguments = args
            fragmentManager.beginTransaction()
                .replace((requireView().parent as View).id, fragment)
                .addToBackStack(null)
                .commit()
            return true
        }
        return false
    }

    override fun onResume() {
        super.onResume()
        resumed = true
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
    }
}
