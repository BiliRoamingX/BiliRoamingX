package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*

class MiscFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_misc") {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("skin")?.onChange { _, newValue ->
            if (newValue == true) onSkinClick() else true
        }
        findPreference<Preference>("custom_dpi")?.run {
            val dpi = Resources.getSystem().displayMetrics.densityDpi
            summary = Utils.getString("biliroaming_custom_dpi_summary", dpi)
            onClick { onCustomDpi() }
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val uri = data?.data
        if (resultCode != Activity.RESULT_OK || uri == null) return
        if (requestCode == 2336) {
            try {
                requireActivity().contentResolver.openInputStream(uri)?.use {
                    skinInput?.setText(it.bufferedReader().readTextX().trim())
                }
            } catch (e: Exception) {
                LogHelper.error({ "failed to import skin" }, e)
            }
        }
    }

    private var skinInput: EditText? = null
    private fun onSkinClick(): Boolean {
        val view = EditText(activity)
        skinInput = view
        view.setText(Settings.SKIN_JSON.string)
        AlertDialog.Builder(activity)
            .setTitle(Utils.getString("biliroaming_skin_title"))
            .setView(view)
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(Utils.getString("biliroaming_skin_get"), null)
            .setNeutralButton(Utils.getString("biliroaming_skin_import_from_file"), null)
            .create().apply {
                setOnShowListener {
                    getButton(Dialog.BUTTON_POSITIVE)?.setOnClickListener {
                        val text = view.text.toString().trim()
                        if (text.runCatchingOrNull { toJSONObject() } == null) {
                            Toasts.showShortWithId("biliroaming_skin_invalid")
                            return@setOnClickListener
                        }
                        Settings.SKIN_JSON.saveValue(text)
                        Toasts.showShortWithId("biliroaming_skin_success")
                        dismiss()
                    }
                    getButton(Dialog.BUTTON_NEUTRAL)?.setOnClickListener {
                        try {
                            startActivityForResult(
                                Intent.createChooser(Intent().apply {
                                    action = Intent.ACTION_GET_CONTENT
                                    type = "application/json"
                                    addCategory(Intent.CATEGORY_OPENABLE)
                                }, Utils.getString("biliroaming_skin_choose")),
                                2336
                            )
                        } catch (ex: ActivityNotFoundException) {
                            Toasts.showShortWithId("biliroaming_pls_install_file_manager")
                        }
                    }
                    getButton(Dialog.BUTTON_NEGATIVE)?.setOnClickListener {
                        val uri = Uri.parse("https://github.com/Rovniced/bilibili-skin")
                        val intent = Intent(Intent.ACTION_VIEW, uri)
                        startActivity(intent)
                    }
                }
            }.show()
        return true
    }

    private fun onCustomDpi(): Boolean {
        val editText = EditText(activity)
        editText.hint = Utils.getString("biliroaming_custom_dpi_hint")
        editText.setText(Settings.CUSTOM_DPI.int.toString().takeIf { it != "0" }.orEmpty())
        editText.inputType = InputType.TYPE_CLASS_NUMBER
        AlertDialog.Builder(activity)
            .setTitle(Utils.getString("biliroaming_custom_dpi_title"))
            .setView(editText)
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(android.R.string.cancel, null)
            .create().apply {
                setOnShowListener {
                    getButton(Dialog.BUTTON_POSITIVE)?.setOnClickListener {
                        val text = editText.text.toString().trim()
                        if (text.isEmpty()) {
                            Settings.CUSTOM_DPI.saveValue(0)
                        } else {
                            Settings.CUSTOM_DPI.saveValue(text.toInt())
                        }
                        dismiss()
                    }
                }
            }.show()
        return true
    }
}
