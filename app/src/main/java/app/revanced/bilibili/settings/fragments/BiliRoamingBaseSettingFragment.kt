package app.revanced.bilibili.settings.fragments

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import androidx.preference.TwoStatePreference
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Reflex
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.onPreferenceTreeClick
import app.revanced.bilibili.widget.HdBaseToolbar
import com.bilibili.lib.ui.BasePreferenceFragment
import java.lang.reflect.Method

enum class PrefsDisableReason { APP_VERSION, OS_VERSION, NEW_PLAYER }

@Keep
abstract class BiliRoamingBaseSettingFragment(private val prefsXmlName: String) :
    BasePreferenceFragment(), (Preference) -> Boolean {

    private var resumed = false
    private val listener = OnSharedPreferenceChangeListener { sharedPreferences, key ->
        Settings.onPreferenceChanged(sharedPreferences, key)
        onPreferenceChanged(sharedPreferences, key)
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        fixPreferenceManager()
        preferenceManager.sharedPreferencesName = Settings.PREFS_NAME
        val resId = Utils.getResId(prefsXmlName, "xml")
        addPreferencesFromResource(resId)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        preferenceManager.sharedPreferences?.registerOnSharedPreferenceChangeListener(listener)
    }

    override fun onDestroy() {
        preferenceManager.sharedPreferences?.unregisterOnSharedPreferenceChangeListener(listener)
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
            val fragment = fragmentManager.fragmentFactory.instantiate(
                requireActivity().classLoader, it
            )
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

    @SuppressLint("RestrictedApi")
    private fun fixPreferenceManager() = try {
        val preferenceManagerField = Reflex.findField(javaClass, "mPreferenceManager")
        if (setOnNavigateToScreenListenerMethod == null) {
            for (method in PreferenceManager::class.java.declaredMethods) {
                if (method.name == "setOnNavigateToScreenListener") {
                    method.isAccessible = true
                    setOnNavigateToScreenListenerMethod = method
                    break
                }
            }
        }
        // not use activity context, see com.bilibili.app.preferences.BiliPreferencesActivity#getSharedPreferences
        val preferenceManager = PreferenceManager(Utils.getContext())
        preferenceManagerField.set(this, preferenceManager)
        setOnNavigateToScreenListenerMethod?.invoke(preferenceManager, this)
    } catch (_: Throwable) {
    }

    protected open fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        if (!resumed) return
        for (item in Settings.entries) {
            if (item.key == key && item.needReboot) {
                val message = Utils.getString("biliroaming_need_reboot_dialog_message")
                val confirm = Utils.getString("biliroaming_need_reboot_dialog_confirm")
                val later = Utils.getString("biliroaming_need_reboot_dialog_later")
                AlertDialog.Builder(requireContext())
                    .setMessage(message)
                    .setNegativeButton(later, null)
                    .setPositiveButton(confirm) { _, _ -> Utils.reboot() }
                    .show()
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
        disablePreference(key, reason, condition)
    }

    protected fun disablePreference(
        key: String,
        reason: () -> String,
        condition: (Preference) -> Boolean
    ) {
        val preference = findPreference<Preference>(key) ?: return
        if (condition(preference)) {
            preference.isEnabled = false
            preference.summary = reason()
            if (preference is TwoStatePreference)
                preference.isChecked = false
        }
    }

    companion object {
        private var setOnNavigateToScreenListenerMethod: Method? = null
        const val EXTRA_TITLE = "biliroaming_extra_title"
    }
}
