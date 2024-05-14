package app.revanced.bilibili.settings.fragments

import android.app.AlertDialog
import android.os.Bundle
import app.revanced.bilibili.meta.BottomItem
import app.revanced.bilibili.settings.StringSetSetting
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.constraintSize
import app.revanced.bilibili.widget.CheckBoxGroupPreference

abstract class BaseDynamicItemsFragment(
    private val setting: StringSetSetting,
    private val allItems: List<BottomItem>
) : BiliRoamingBaseSettingFragment() {
    private var hintShown = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val preference = findPreference<CheckBoxGroupPreference>(setting.key) ?: return
        val showingItems = setting()
        val values = mutableListOf<String>()
        val entries = mutableListOf<String>()
        for (item in allItems) {
            values.add(item.id)
            entries.add("${item.name} (${item.id})")
        }
        preference.entries = entries.toTypedArray<CharSequence>()
        preference.entryValues = values.toTypedArray<CharSequence>()
        val selectedValues = mutableSetOf<String>()
        if (showingItems.size == 1 && showingItems.contains(Constants.ALL_VALUE)) {
            selectedValues.addAll(values)
        } else {
            selectedValues.addAll(showingItems)
        }
        preference.values = selectedValues
        preference.notifyChanged()
    }

    override fun onResume() {
        super.onResume()
        if (hintShown) return
        if (allItems.isNotEmpty()) return
        hintShown = true
        AlertDialog.Builder(context)
            .setMessage(Utils.getString("biliroaming_hint_open_from_mine"))
            .setPositiveButton(Utils.getString("biliroaming_get_it"), null)
            .create().constraintSize().show()
    }
}
