package app.revanced.bilibili.settings.fragments

import android.content.SharedPreferences
import app.revanced.bilibili.patches.json.JSONPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.Toasts
import app.revanced.bilibili.utils.Utils

@SettingFragment("biliroaming_setting_customize_drawer")
class CustomizeDrawerFragment : BaseDynamicItemsFragment(
    Settings.ShowingDrawerItems,
    JSONPatch.drawerItems
) {
    override fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        super.onPreferenceChanged(sharedPreferences, key)
        if (resumed && !Utils.isHd() && key == Settings.ShowingDrawerItems.key
            && Settings.ShowingDrawerItems().let {
                !it.contains(Constants.ALL_VALUE) && !it.contains("更多服务")
            }
        ) Toasts.showLongWithId("biliroaming_hide_more_category_warning")
    }
}
