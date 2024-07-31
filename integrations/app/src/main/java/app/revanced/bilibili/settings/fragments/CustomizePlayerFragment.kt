package app.revanced.bilibili.settings.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.*

@SettingFragment("biliroaming_setting_customize_player")
class CustomizePlayerFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("default_speed")?.onClick { onPlaybackSpeedClick(false) }
        findPreference<Preference>("long_press_speed")?.onClick { onPlaybackSpeedClick(true) }
        findPreference<Preference>("override_speed")?.onClick { onPlaybackSpeedOverrideClick() }
        findPreference<Preference>("custom_access_key")?.onClick { onCustomAccessKey() }
    }

    private fun onPlaybackSpeedClick(longPress: Boolean): Boolean {
        val titleId = if (longPress) "biliroaming_long_press_speed_title"
        else "biliroaming_default_speed_title"
        val setting = if (longPress) Settings.LongPressPlaybackSpeed
        else Settings.DefaultPlaybackSpeed
        val editText = EditText(context)
        editText.hint = Utils.getString("biliroaming_default_speed_hint")
        editText.setText(setting.takeIf { !it.isSetToDefault() }?.get()?.toString().orEmpty())
        editText.inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL
        AlertDialog.Builder(context)
            .setTitle(Utils.getString(titleId))
            .setView(editText)
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(android.R.string.cancel, null)
            .create().constraintSize().onShow {
                getButton(Dialog.BUTTON_POSITIVE)?.onClick {
                    val text = editText.text.toString().trim()
                    if (text.isEmpty()) {
                        setting.restoreToDefault()
                        dismiss()
                        Toasts.showShortWithId("biliroaming_save_ok")
                        return@onClick
                    }
                    val speed = text.toFloatOrNull()
                    if (speed == null || speed <= 0f || !speed.isFinite()) {
                        Toasts.showShortWithId("biliroaming_speed_invalid")
                    } else {
                        setting.save(speed)
                        Toasts.showShortWithId("biliroaming_save_ok")
                        dismiss()
                    }
                }
            }.show()
        return true
    }

    private fun onPlaybackSpeedOverrideClick(): Boolean {
        val editText = EditText(context)
        editText.inputType = InputType.TYPE_CLASS_TEXT
        editText.hint = Utils.getString("biliroaming_speed_override_hint")
        editText.setText(Settings.OverridePlaybackSpeed())
        AlertDialog.Builder(context)
            .setTitle(Utils.getString("biliroaming_speed_override_title"))
            .setView(editText)
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(android.R.string.cancel, null)
            .create().constraintSize().onShow {
                getButton(Dialog.BUTTON_POSITIVE)?.onClick {
                    val text = editText.text.toString().trim()
                    if (text.isEmpty()) {
                        Settings.OverridePlaybackSpeed.restoreToDefault()
                        dismiss()
                        Toasts.showShortWithId("biliroaming_save_ok")
                        return@onClick
                    }
                    val speedList = text.runCatchingOrNull {
                        split(' ').filter { it.isNotBlank() }
                            .map { it.toFloat() }.filter { it > 0f && it.isFinite() }
                    }
                    if (speedList == null) {
                        Toasts.showShortWithId("biliroaming_speed_invalid")
                    } else if (!speedList.contains(1f)) {
                        Toasts.showShortWithId("biliroaming_speed_override_must")
                    } else {
                        val formatSpeedText = speedList.joinToString(" ")
                        Settings.OverridePlaybackSpeed.save(formatSpeedText)
                        dismiss()
                        Toasts.showShortWithId("biliroaming_save_ok")
                    }
                }
            }.show()
        return true
    }

    private fun onCustomAccessKey(): Boolean {
        val layout = hostContext.inflateLayout("biliroaming_dialog_access_key")
        val mainEdit = layout.findView<EditText>("biliroaming_key_main")
        val thEdit = layout.findView<EditText>("biliroaming_key_th")
        mainEdit.setText(Settings.AccessKeyMain())
        thEdit.setText(Settings.AccessKeyThailand())
        AlertDialog.Builder(context)
            .setView(layout)
            .setTitle(Utils.getString("biliroaming_custom_access_key_title"))
            .setPositiveButton(android.R.string.ok) { _, _ ->
                Settings.AccessKeyMain.save(mainEdit.text.toString().trim())
                Settings.AccessKeyThailand.save(thEdit.text.toString().trim())
            }.create().constraintSize(-1).show()
        return true
    }
}
