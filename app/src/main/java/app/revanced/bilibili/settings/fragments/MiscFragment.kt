package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.patches.SplashPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import java.io.File

class MiscFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_misc") {
    companion object {
        private const val SELECTION_SPLASH = 222
        private const val SELECTION_LOGO = 223
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("skin")?.onChange { _, newValue ->
            if (newValue == true) onSkinClick()
            true
        }
        findPreference<Preference>("custom_splash")?.onChange { _, newValue ->
            if (newValue == true) selectImage(SELECTION_SPLASH)
            true
        }
        findPreference<Preference>("custom_splash_logo")?.onChange { _, newValue ->
            if (newValue == true) selectImage(SELECTION_LOGO)
            true
        }
        findPreference<Preference>("purify_splash")?.onChange { _, newValue ->
            if (newValue == true) Utils.clearSplashConfigCache()
            true
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val uri = data?.data
        if (requestCode == SELECTION_SPLASH || requestCode == SELECTION_LOGO) {
            val destFile = File(
                Utils.getContext().filesDir,
                if (requestCode == SELECTION_SPLASH) SplashPatch.SPLASH_IMAGE else SplashPatch.LOGO_IMAGE
            )
            if (resultCode == Activity.RESULT_CANCELED || uri == null) {
                destFile.delete()
            } else try {
                Utils.getContext().contentResolver.openInputStream(uri)?.use { input ->
                    destFile.outputStream().use { output -> input.copyToX(output) }
                }
            } catch (e: Exception) {
                LogHelper.error({ "failed to apply splash image" }, e)
            }
        }
        if (resultCode != Activity.RESULT_OK || uri == null) return
        if (requestCode == 2336) {
            try {
                Utils.getContext().contentResolver.openInputStream(uri)?.use {
                    skinInput?.setText(it.bufferedReader().readTextX().trim())
                }
            } catch (e: Exception) {
                LogHelper.error({ "failed to import skin" }, e)
            }
        }
    }

    private var skinInput: EditText? = null
    private fun onSkinClick() {
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
    }

    private fun selectImage(request: Int) = try {
        startActivityForResult(Intent.createChooser(Intent().apply {
            action = Intent.ACTION_GET_CONTENT
            type = "image/*"
            addCategory(Intent.CATEGORY_OPENABLE)
        }, Utils.getString("biliroaming_choose_image")), request)
    } catch (ex: ActivityNotFoundException) {
        Toasts.showShortWithId("biliroaming_pls_install_file_manager")
    }
}
