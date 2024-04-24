package app.revanced.bilibili.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import app.revanced.bilibili.settings.Settings

/**
 * sync module settings to vice processes
 */
class SettingsSyncHelper : BroadcastReceiver() {
    companion object {
        private const val ACTION = "biliroamingx.action.sync_settings"
        private const val EXTRA_SETTINGS = "settings"

        @JvmStatic
        fun register() {
            Utils.getContext().registerReceiverCompat(SettingsSyncHelper(), IntentFilter(ACTION))
        }

        @JvmStatic
        fun sync(vararg prefs: Pair<String, Any?>) {
            val context = Utils.getContext()
            context.sendBroadcast(Intent(ACTION).apply {
                `package` = context.packageName
                putExtra(EXTRA_SETTINGS, ArrayList(prefs.asList()))
            })
        }
    }

    override fun onReceive(context: Context, intent: Intent) {
        val settings = intent.serializableExtra<ArrayList<Pair<String, Any?>>>(EXTRA_SETTINGS)
        Logger.debug { "SettingsSyncHelper, received sync settings request, pname: ${Utils.currentProcessName()}, settings: $settings" }
        settings?.forEach { (k, v) ->
            Settings.notifySettingsChangedForViceProcess(k, v)
        }
    }
}
