package app.revanced.bilibili.settings.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.constraintSize
import app.revanced.bilibili.utils.onClick
import app.revanced.bilibili.utils.onShow
import app.revanced.bilibili.utils.showKeyboard

@SettingFragment("biliroaming_setting_external_downloader")
class ExternalDownloaderFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("package_name")?.onClick {
            val editText = EditText(context)
            editText.inputType = EditorInfo.TYPE_CLASS_TEXT
            editText.imeOptions = EditorInfo.IME_ACTION_DONE
            editText.setText(Settings.ExternalDownloaderName())
            val dialog = AlertDialog.Builder(context)
                .setView(editText)
                .setTitle(it.title)
                .setNegativeButton(android.R.string.cancel, null)
                .setPositiveButton(android.R.string.ok) { _, _ ->
                    val newName = editText.text.toString().trim()
                    Settings.ExternalDownloaderName.save(newName)
                }.create().constraintSize().onShow {
                    editText.setSelection(editText.text.length)
                    editText.showKeyboard()
                }.apply { show() }
            editText.setOnEditorActionListener { v, actionId, event ->
                if (actionId == EditorInfo.IME_ACTION_DONE || event.keyCode == KeyEvent.KEYCODE_ENTER) {
                    val newName = v.text.toString().trim()
                    Settings.ExternalDownloaderName.save(newName)
                    dialog.dismiss()
                    true
                } else false
            }
            true
        }
    }
}
