package app.revanced.bilibili.settings.fragments;

import app.revanced.bilibili.patches.json.JSONPatch;
import app.revanced.bilibili.settings.Settings;

public class CustomizeDrawerFragment extends BaseDynamicItemsFragment {
    public CustomizeDrawerFragment() {
        super("biliroaming_setting_customize_drawer", Settings.SHOWING_DRAWER_ITEMS, JSONPatch.drawerItems);
    }
}
