package app.revanced.bilibili.settings.fragments

import android.content.SharedPreferences
import android.widget.Toast
import app.revanced.bilibili.patches.json.JSONPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.Toasts

class CustomizeDrawerFragment : BaseDynamicItemsFragment(
    "biliroaming_setting_customize_drawer",
    Settings.SHOWING_DRAWER_ITEMS,
    JSONPatch.drawerItems
) {
    override fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {
        super.onPreferenceChanged(sharedPreferences, key)
        if (key == Settings.SHOWING_DRAWER_ITEMS.key
            && Settings.SHOWING_DRAWER_ITEMS.stringSet.let {
                !it.contains(Constants.ALL_VALUE) && !it.contains("更多服务")
            }
        ) {
            Toasts.showWithId("biliroaming_hide_more_category_warning", Toast.LENGTH_LONG)
        }
    }
}
