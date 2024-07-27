package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ScrollView
import androidx.preference.Preference
import app.revanced.bilibili.patches.SplashPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.*
import java.io.File

@SettingFragment("biliroaming_setting_misc")
class MiscFragment : BiliRoamingBaseSettingFragment() {
    companion object {
        private const val SELECTION_SPLASH = 222
        private const val SELECTION_LOGO = 223
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("skin_json_pref")?.onClick {
            onSkinClick()
            true
        }
        findPreference<Preference>(Settings.CustomSplash.key)?.onChange { _, newValue ->
            if (newValue == true) selectImage(SELECTION_SPLASH)
            true
        }
        findPreference<Preference>(Settings.CustomSplashLogo.key)?.onChange { _, newValue ->
            if (newValue == true) selectImage(SELECTION_LOGO)
            true
        }
        disablePreference(
            key = Settings.CustomUpdate.key,
            { Utils.getString("biliroaming_custom_update_only_64") } to { !isOsArchArm64 },
            { Utils.getString("biliroaming_custom_update_invalid_sig") } to { !isPrebuilt }
        )
        disablePreference(Settings.Skin.key, PrefsDisableReason.AppVersion) {
            Utils.isHd()
        }
    }

    override fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        super.onPreferenceChanged(sharedPreferences, key)
        if (resumed && key == Settings.Skin.key) {
            changeThemeState(Settings.Skin())
        }
        if (resumed && key == Settings.EnableDocProvider.key && Settings.EnableDocProvider()) {
            showRebootDialog()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        @Suppress("DEPRECATION")
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
                    destFile.outputStream().use { output -> input.copyTo(output) }
                }
            } catch (e: Exception) {
                Logger.error(e) { "failed to apply splash image" }
            }
        }
        if (resultCode != Activity.RESULT_OK || uri == null) return
        if (requestCode == 2336) {
            try {
                Utils.getContext().contentResolver.openInputStream(uri)?.use {
                    skinInput?.setText(it.bufferedReader().readText().trim())
                }
            } catch (e: Exception) {
                Logger.error(e) { "failed to import skin" }
            }
        }
    }

    private fun changeThemeState(
        enabled: Boolean,
        onSuccess: () -> Unit = {}
    ) = Utils.async {
        if (enabled) runCatching {
            Themes.applyCustomTheme(context)
        }.onFailure {
            Logger.error(it) { "download current theme failed" }
            Toasts.showShortWithId("biliroaming_theme_apply_failed")
        }.onSuccess {
            onSuccess()
        } else runCatching {
            Themes.unloadTheme(context)
        }.onFailure {
            Logger.error(it) { "unload theme failed" }
        }.onSuccess {
            onSuccess()
        }
    }

    private var skinInput: EditText? = null
    private fun onSkinClick() {
        val view = EditText(context)
        val layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        val wrapper = ScrollView(context)
        wrapper.addView(view, layoutParams)
        skinInput = view
        view.setText(Settings.SkinJson())
        AlertDialog.Builder(context)
            .setView(wrapper)
            .setTitle(Utils.getString("biliroaming_skin_json_pref_title"))
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(Utils.getString("biliroaming_skin_get"), null)
            .setNeutralButton(Utils.getString("biliroaming_skin_import_from_file"), null)
            .create().constraintSize(maxHeight = -1).onShow {
                getButton(Dialog.BUTTON_POSITIVE)?.onClick {
                    val text = view.text.toString().trim()
                    if (text.runCatchingOrNull { toJSONObject() } == null) {
                        Toasts.showShortWithId("biliroaming_skin_invalid")
                        return@onClick
                    }
                    Settings.SkinJson.save(text)
                    changeThemeState(true)
                    dismiss()
                }
                getButton(Dialog.BUTTON_NEUTRAL)?.onClick {
                    try {
                        @Suppress("DEPRECATION")
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
                getButton(Dialog.BUTTON_NEGATIVE)?.onClick {
                    val uri = Uri.parse("https://github.com/Rovniced/bilibili-skin")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(intent)
                }
            }.show()
    }

    private fun selectImage(request: Int) = try {
        @Suppress("DEPRECATION")
        startActivityForResult(Intent.createChooser(Intent().apply {
            action = Intent.ACTION_GET_CONTENT
            type = "image/*"
            addCategory(Intent.CATEGORY_OPENABLE)
        }, Utils.getString("biliroaming_choose_image")), request)
    } catch (ex: ActivityNotFoundException) {
        Toasts.showShortWithId("biliroaming_pls_install_file_manager")
    }
}
