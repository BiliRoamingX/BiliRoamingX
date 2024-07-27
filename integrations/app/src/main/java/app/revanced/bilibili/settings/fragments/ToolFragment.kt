package app.revanced.bilibili.settings.fragments

import android.app.AlertDialog
import android.content.DialogInterface
import android.net.Uri
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.preference.Preference
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.*

@SettingFragment("biliroaming_setting_tool")
class ToolFragment : BiliRoamingBaseSettingFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("route")?.onClick { route();true }
        findPreference<Preference>("export_access_key")?.onClick {
            setClipboardContent(content = Accounts.accessKey)
            Toasts.showShortWithId("biliroaming_access_key_copied")
            true
        }
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
                        Toasts.showShortWithId("biliroaming_you_were_cheated")
                    }
                }.onFailure {
                    Logger.error(it) { "route failed, uri: $uri" }
                    Toasts.showShortWithId("biliroaming_open_failed")
                }
            }.create().onShow {
                getButton(DialogInterface.BUTTON_POSITIVE).isAllCaps = false
            }.constraintSize(maxHeight = -1).show()
    }
}
