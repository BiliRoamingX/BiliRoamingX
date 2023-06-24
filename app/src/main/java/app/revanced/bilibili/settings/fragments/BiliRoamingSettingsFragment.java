package app.revanced.bilibili.settings.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.preference.Preference;

import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.Utils;

public class BiliRoamingSettingsFragment extends BiliRoamingBaseSettingFragment {
    public BiliRoamingSettingsFragment() {
        super("biliroaming_settings");
    }

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        super.onCreatePreferences(savedInstanceState, rootKey);
        Preference preference = findPreference("debug");
        if (preference != null)
            preference.setSummary(Utils.getString("biliroaming_debug_summary", KtUtils.getLogFile().getAbsolutePath()));
    }
}
