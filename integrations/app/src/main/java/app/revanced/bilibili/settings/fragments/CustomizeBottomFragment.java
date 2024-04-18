package app.revanced.bilibili.settings.fragments;

import app.revanced.bilibili.patches.json.JSONPatch;
import app.revanced.bilibili.settings.Settings;

public class CustomizeBottomFragment extends BaseDynamicItemsFragment {
    public CustomizeBottomFragment() {
        super("biliroaming_setting_customize_bottom", Settings.SHOWING_BOTTOM_ITEMS, JSONPatch.bottomItems);
    }
}
