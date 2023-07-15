package app.revanced.bilibili.settings.fragments;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import app.revanced.bilibili.meta.BottomItem;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Constants;
import app.revanced.bilibili.utils.Utils;
import app.revanced.bilibili.widget.CheckBoxGroupPreference;

public abstract class BaseDynamicItemsFragment extends BiliRoamingBaseSettingFragment {
    private final Settings setting;
    private final List<BottomItem> allItems;
    private boolean hintShown = false;

    public BaseDynamicItemsFragment(String prefsXmlName, Settings setting, List<BottomItem> allItems) {
        super(prefsXmlName);
        this.setting = setting;
        this.allItems = allItems;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CheckBoxGroupPreference preference = findPreference(setting.key);
        if (preference == null) return;
        Set<String> showingItems = setting.getStringSet();
        List<String> values = new ArrayList<>();
        List<String> entries = new ArrayList<>();
        for (BottomItem drawerItem : allItems) {
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

    @Override
    public void onResume() {
        super.onResume();
        if (hintShown) return;
        if (allItems.isEmpty()) {
            hintShown = true;
            new AlertDialog.Builder(requireContext())
                    .setMessage(Utils.getString("biliroaming_hint_open_from_mine"))
                    .setPositiveButton(Utils.getString("biliroaming_get_it"), null)
                    .show();
        }
    }
}
