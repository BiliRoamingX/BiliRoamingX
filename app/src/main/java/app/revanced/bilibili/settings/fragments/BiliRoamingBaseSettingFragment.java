package app.revanced.bilibili.settings.fragments;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.preference.PreferenceManager;

import com.bilibili.lib.ui.BasePreferenceFragment;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.ReVancedUtils;
import app.revanced.bilibili.utils.Reflex;

public abstract class BiliRoamingBaseSettingFragment extends BasePreferenceFragment {

    private final String prefsXmlName;
    private boolean resumed;

    public BiliRoamingBaseSettingFragment(String prefsXmlName) {
        this.prefsXmlName = prefsXmlName;
    }

    private final SharedPreferences.OnSharedPreferenceChangeListener listener = (sharedPreferences, key) -> {
        Settings.onPreferenceChanged(sharedPreferences, key);
        onPreferenceChanged(sharedPreferences, key);
    };

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        fixPreferenceManager();
        getPreferenceManager().setSharedPreferencesName(Settings.PREFS_NAME);
        @SuppressLint("DiscouragedApi")
        int resId = ReVancedUtils.getResId(prefsXmlName, "xml");
        addPreferencesFromResource(resId);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getPreferenceManager().getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(listener);
        }
    }

    @Override
    public void onDestroy() {
        SharedPreferences sharedPreferences = getPreferenceManager().getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(listener);
        }
        super.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        resumed = true;
    }

    @Override
    public void onPause() {
        super.onPause();
        resumed = false;
    }

    private static Method setOnNavigateToScreenListenerMethod = null;

    @SuppressLint("RestrictedApi")
    private void fixPreferenceManager() {
        try {
            Field preferenceManagerField = Reflex.findField(getClass(), "mPreferenceManager");
            if (setOnNavigateToScreenListenerMethod == null) {
                for (Method method : PreferenceManager.class.getDeclaredMethods()) {
                    if (method.getName().equals("setOnNavigateToScreenListener")) {
                        method.setAccessible(true);
                        setOnNavigateToScreenListenerMethod = method;
                        break;
                    }
                }
            }
            // not use activity context, see com.bilibili.app.preferences.BiliPreferencesActivity#getSharedPreferences
            var preferenceManager = new PreferenceManager(ReVancedUtils.getContext());
            preferenceManagerField.set(this, preferenceManager);
            if (setOnNavigateToScreenListenerMethod != null) {
                setOnNavigateToScreenListenerMethod.invoke(preferenceManager, this);
            }
        } catch (Throwable ignored) {
        }
    }

    protected void onPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (!resumed) return;
        for (Settings item : Settings.values()) {
            if (item.key.equals(key) && item.needReboot) {
                int titleId = ReVancedUtils.getResId("biliroaming_need_reboot_dialog_title", "string");
                int confirmId = ReVancedUtils.getResId("biliroaming_need_reboot_dialog_confirm", "string");
                int laterId = ReVancedUtils.getResId("biliroaming_need_reboot_dialog_later", "string");
                new AlertDialog.Builder(requireContext())
                        .setTitle(titleId)
                        .setNegativeButton(laterId, null)
                        .setPositiveButton(confirmId, (dialog, which) -> ReVancedUtils.reboot())
                        .show();
                break;
            }
        }
    }
}
