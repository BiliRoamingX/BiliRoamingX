package app.revanced.bilibili.settings.fragments

import android.app.AlertDialog
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import android.view.WindowInsets
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.constraintSize
import app.revanced.bilibili.utils.onClick
import app.revanced.bilibili.utils.systemService

class ExternalDownloaderFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_external_downloader") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("package_name")?.onClick {
            val editText = EditText(context)
            editText.inputType = EditorInfo.TYPE_CLASS_TEXT
            editText.imeOptions = EditorInfo.IME_ACTION_DONE
            editText.setText(Settings.EXTERNAL_DOWNLOADER_NAME.string)
            val dialog = AlertDialog.Builder(requireContext())
                .setView(editText)
                .setTitle(it.title)
                .setNegativeButton(android.R.string.cancel, null)
                .setPositiveButton(android.R.string.ok) { _, _ ->
                    val newName = editText.text.toString().trim()
                    Settings.EXTERNAL_DOWNLOADER_NAME.saveValue(newName)
                }.create().constraintSize().apply {
                    setOnShowListener {
                        editText.requestFocus()
                        editText.setSelection(editText.text.length)
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                            window?.decorView?.windowInsetsController?.show(WindowInsets.Type.ime())
                        } else {
                            editText.postDelayed({
                                systemService<InputMethodManager>().showSoftInput(editText, 0)
                            }, 50L)
                        }
                    }
                    show()
                }
            editText.setOnEditorActionListener { v, actionId, event ->
                if (actionId == EditorInfo.IME_ACTION_DONE || event.keyCode == KeyEvent.KEYCODE_ENTER) {
                    val newName = v.text.toString().trim()
                    Settings.EXTERNAL_DOWNLOADER_NAME.saveValue(newName)
                    dialog.dismiss()
                    true
                } else false
            }
            true
        }
    }
}
