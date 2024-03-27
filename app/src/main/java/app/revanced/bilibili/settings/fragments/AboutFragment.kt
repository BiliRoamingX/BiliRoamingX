package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.annotation.Keep
import androidx.preference.Preference
import app.revanced.bilibili.patches.okhttp.hooks.Upgrade
import app.revanced.bilibili.utils.*

class AboutFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_about") {
    @Keep
    private var checkUpdateMethod = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findPreference<Preference>("version")?.run {
            summary = Utils.getString("biliroaming_version_summary_pattern", Constants.VERSION)
            onClick { onVersionClick(); true }
        }
        findPreference<Preference>("debug")?.summary =
            Utils.getString("biliroaming_debug_summary", logFile.absolutePath)
        findPreference<Preference>("feedback")?.onClick {
            val uri = Uri.parse(Utils.getString("biliroaming_feedback_url"))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            true
        }
        findPreference<Preference>("project_url")?.onClick {
            val uri = Uri.parse(Utils.getString("biliroaming_project_url"))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            true
        }
        findPreference<Preference>("tg_link")?.onClick {
            val uri = Uri.parse(Utils.getString("biliroaming_tg_url"))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            true
        }
    }

    private fun onVersionClick() {
        if (Upgrade.customUpdate(fromSelf = true)) {
            runCatching {
                val (serviceClass, checkUpdateMethod) = checkUpdateMethod.split('#', limit = 2)
                val activity = requireContext() as Activity
                Upgrade.fromSelf = true
                Class.forName(serviceClass).new().callMethod(checkUpdateMethod, activity)
            }.onFailure {
                Upgrade.fromSelf = false
                LogHelper.error({ "Update check failed" }, it)
            }
        } else if (Build.SUPPORTED_64_BIT_ABIS.isEmpty()) {
            Toasts.showShortWithId("biliroaming_custom_update_only_64")
        } else if (sigMd5() != Constants.PRE_BUILD_SIG_MD5) {
            Toasts.showShortWithId("biliroaming_custom_update_invalid_sig")
        }
    }
}
