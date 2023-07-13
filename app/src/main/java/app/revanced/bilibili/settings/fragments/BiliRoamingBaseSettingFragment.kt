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
import androidx.preference.PreferenceManager
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Reflex
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.onPreferenceTreeClick
import app.revanced.bilibili.widget.HdBaseToolbar
import com.bilibili.lib.ui.BasePreferenceFragment
import java.lang.reflect.Method

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

    protected open fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {
        if (!resumed) return
        for (item in Settings.values()) {
            if (item.key == key && item.needReboot) {
                val titleId = Utils.getResId("biliroaming_need_reboot_dialog_title", "string")
                val confirmId = Utils.getResId("biliroaming_need_reboot_dialog_confirm", "string")
                val laterId = Utils.getResId("biliroaming_need_reboot_dialog_later", "string")
                AlertDialog.Builder(requireContext())
                    .setTitle(titleId)
                    .setNegativeButton(laterId, null)
                    .setPositiveButton(confirmId) { _, _ -> Utils.reboot() }
                    .show()
                break
            }
        }
    }

    companion object {
        private var setOnNavigateToScreenListenerMethod: Method? = null
        const val EXTRA_TITLE = "biliroaming_extra_title"
    }
}
