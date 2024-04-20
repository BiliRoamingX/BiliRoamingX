package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.content.BiliDocumentsProvider
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
        findPreference<Preference>("skin_json_pref")?.onClick {
            onSkinClick()
            true
        }
        findPreference<Preference>(Settings.CUSTOM_SPLASH.key)?.onChange { _, newValue ->
            if (newValue == true) selectImage(SELECTION_SPLASH)
            true
        }
        findPreference<Preference>(Settings.CUSTOM_SPLASH_LOGO.key)?.onChange { _, newValue ->
            if (newValue == true) selectImage(SELECTION_LOGO)
            true
        }
        findPreference<Preference>(Settings.PURIFY_SPLASH.key)?.onChange { _, newValue ->
            if (newValue == true) Utils.clearSplashConfigCache()
            true
        }
        findPreference<Preference>(Settings.ENABLE_DOC_PROVIDER.key)?.onChange { _, newValue ->
            changeComponentState(BiliDocumentsProvider::class.java, newValue == true)
            true
        }
        findPreference<Preference>("route")?.onClick { route();true }
        disablePreference(
            key = Settings.CUSTOM_UPDATE.key,
            { Utils.getString("biliroaming_custom_update_only_64") } to { Build.SUPPORTED_64_BIT_ABIS.isEmpty() },
            { Utils.getString("biliroaming_custom_update_invalid_sig") } to { sigMd5() != Constants.PRE_BUILD_SIG_MD5 }
        )
        disablePreference(Settings.SKIN.key, PrefsDisableReason.APP_VERSION) {
            Utils.isHd()
        }
    }

    override fun onPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        super.onPreferenceChanged(sharedPreferences, key)
        if (resumed && key == Settings.SKIN.key) {
            changeThemeState(Settings.SKIN.boolean)
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
            ThemeApplier.applyCustomTheme(context)
        }.onFailure {
            Logger.error(it) { "download current theme failed" }
            Toasts.showShort("主题设置失败！")
        }.onSuccess {
            onSuccess()
        } else runCatching {
            ThemeApplier.unloadTheme(context)
        }.onFailure {
            Logger.error(it) { "unload theme failed" }
        }.onSuccess {
            onSuccess()
        }
    }

    private var skinInput: EditText? = null
    private fun onSkinClick() {
        val view = EditText(context)
        skinInput = view
        view.setText(Settings.SKIN_JSON.string)
        AlertDialog.Builder(context)
            .setView(view)
            .setTitle(Utils.getString("biliroaming_skin_json_pref_title"))
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(Utils.getString("biliroaming_skin_get"), null)
            .setNeutralButton(Utils.getString("biliroaming_skin_import_from_file"), null)
            .create().constraintSize(maxHeight = -1).onShow {
                getButton(Dialog.BUTTON_POSITIVE)?.setOnClickListener {
                    val text = view.text.toString().trim()
                    if (text.runCatchingOrNull { toJSONObject() } == null) {
                        Toasts.showShortWithId("biliroaming_skin_invalid")
                        return@setOnClickListener
                    }
                    Settings.SKIN_JSON.saveValue(text)
                    changeThemeState(true)
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

    private fun route() {
        val editText = EditText(context)
        editText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_URI
        val hintUrl = Utils.getString("biliroaming_route_hint")
        editText.hint = hintUrl
        AlertDialog.Builder(context)
            .setView(editText)
            .setTitle(Utils.getString("biliroaming_route_title"))
            .setNegativeButton(android.R.string.cancel, null)
            .setPositiveButton("Go") { _, _ ->
                val editUrl = editText.text.toString().trim()
                val uri = Uri.parse(editUrl.ifEmpty { hintUrl })
                runCatching {
                    Utils.routeTo(uri, context)
                    if (editUrl.isEmpty()) Utils.runOnMainThread(300) {
                        Toasts.showShort("你被骗啦")
                    }
                }.onFailure {
                    Logger.error(it) { "route failed, uri: $uri" }
                    Toasts.showShort("打开失败")
                }
            }.create().onShow {
                getButton(DialogInterface.BUTTON_POSITIVE).isAllCaps = false
            }.constraintSize(maxHeight = -1).show()
    }
}
