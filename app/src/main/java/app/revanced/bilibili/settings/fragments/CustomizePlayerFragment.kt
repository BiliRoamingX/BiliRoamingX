package app.revanced.bilibili.settings.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*

class CustomizePlayerFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_customize_player") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("default_speed")?.onClick { onPlaybackSpeedClick(false) }
        findPreference<Preference>("long_press_speed")?.onClick { onPlaybackSpeedClick(true) }
        findPreference<Preference>("override_speed")?.onClick { onPlaybackSpeedOverrideClick() }
    }

    private fun onPlaybackSpeedClick(longPress: Boolean): Boolean {
        val titleId = if (longPress) "biliroaming_long_press_speed_title"
        else "biliroaming_default_speed_title"
        val settings = if (longPress) Settings.LONG_PRESS_PLAYBACK_SPEED
        else Settings.DEFAULT_PLAYBACK_SPEED
        val editText = EditText(activity)
        editText.hint = Utils.getString("biliroaming_default_speed_hint")
        editText.setText(settings.float.takeIf { it != 0f }?.toString().orEmpty())
        editText.inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL
        AlertDialog.Builder(activity)
            .setTitle(Utils.getString(titleId))
            .setView(editText)
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(android.R.string.cancel, null)
            .create().constraintSize().apply {
                setOnShowListener {
                    getButton(Dialog.BUTTON_POSITIVE)?.setOnClickListener {
                        val text = editText.text.toString().trim()
                        if (text.isEmpty()) {
                            settings.saveValue(0f)
                            dismiss()
                            Toasts.showShortWithId("biliroaming_speed_save_ok")
                            return@setOnClickListener
                        }
                        val speed = text.toFloatOrNull()
                        if (speed == null || speed <= 0f || !speed.isFinite()) {
                            Toasts.showShortWithId("biliroaming_speed_invalid")
                        } else {
                            settings.saveValue(speed)
                            Toasts.showShortWithId("biliroaming_speed_save_ok")
                            dismiss()
                        }
                    }
                }
            }.show()
        return true
    }

    private fun onPlaybackSpeedOverrideClick(): Boolean {
        val editText = EditText(activity)
        editText.inputType = InputType.TYPE_CLASS_TEXT
        editText.hint = Utils.getString("biliroaming_speed_override_hint")
        editText.setText(Settings.OVERRIDE_PLAYBACK_SPEED.string)
        AlertDialog.Builder(activity)
            .setTitle(Utils.getString("biliroaming_speed_override_title"))
            .setView(editText)
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(android.R.string.cancel, null)
            .create().constraintSize().apply {
                setOnShowListener {
                    getButton(Dialog.BUTTON_POSITIVE)?.setOnClickListener {
                        val text = editText.text.toString().trim()
                        if (text.isEmpty()) {
                            Settings.OVERRIDE_PLAYBACK_SPEED.saveValue("")
                            dismiss()
                            Toasts.showShortWithId("biliroaming_speed_save_ok")
                            return@setOnClickListener
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
                            Settings.OVERRIDE_PLAYBACK_SPEED.saveValue(formatSpeedText)
                            dismiss()
                            Toasts.showShortWithId("biliroaming_speed_save_ok")
                        }
                    }
                }
            }.show()
        return true
    }
}
