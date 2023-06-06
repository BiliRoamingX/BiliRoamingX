package app.revanced.bilibili.settings.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import app.revanced.bilibili.meta.BottomItem;
import app.revanced.bilibili.patches.json.JSONPatch;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Constants;
import app.revanced.bilibili.widget.CheckBoxGroupPreference;

public class CustomizeDrawerFragment extends BiliRoamingBaseSettingFragment {
    public CustomizeDrawerFragment() {
        super("biliroaming_setting_customize_drawer");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CheckBoxGroupPreference preference = findPreference(Settings.SHOWING_DRAWER_ITEMS.key);
        if (preference == null) return;
        List<BottomItem> drawerItems = JSONPatch.drawerItems;
        Set<String> showingItems = Settings.SHOWING_DRAWER_ITEMS.getStringSet();
        List<String> values = new ArrayList<>();
        List<String> entries = new ArrayList<>();
        for (BottomItem drawerItem : drawerItems) {
            values.add(drawerItem.id);
            entries.add(String.format("%s (%s)", drawerItem.name, drawerItem.id));
        }
        preference.setEntries(entries.toArray(new CharSequence[0]));
        preference.setEntryValues(values.toArray(new CharSequence[0]));
        Set<String> selectedValues = new HashSet<>();
        if (showingItems.size() == 1 && showingItems.contains(Constants.ALL_VALUE)) {
            selectedValues.addAll(values);
        } else {
            selectedValues.addAll(showingItems);
        }
        preference.setValues(selectedValues);
        preference.notifyChanged();
    }
}
