package app.revanced.bilibili.patches

import android.app.AlertDialog
import androidx.annotation.Keep
import androidx.fragment.app.Fragment
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.constraintSize
import app.revanced.bilibili.widget.OnSwitchDarkModeOriginListener

object DarkSwitchPatch {
    @Keep
    @JvmStatic
    fun switchDarkMode(listener: OnSwitchDarkModeOriginListener, report: Boolean) {
        if (!Settings.SwitchDarkTipsDialog()) {
            listener.switchDarkMode_Origin(report)
            return
        }
        if (Utils.isNightFollowSystem()) {
            val context = (listener as Fragment).context
            AlertDialog.Builder(context)
                .setMessage(Utils.getString("biliroaming_switch_dark_tips"))
                .setPositiveButton(android.R.string.ok) { _, _ ->
                    listener.switchDarkMode_Origin(report)
                }
                .setNegativeButton(android.R.string.cancel, null)
                .create().constraintSize().show()
        } else {
            listener.switchDarkMode_Origin(report)
        }
    }
}
