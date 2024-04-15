package app.revanced.bilibili.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import app.revanced.bilibili.settings.Settings

/**
 * update module settings from vice processes
 */
class PreferenceUpdater : BroadcastReceiver() {
    companion object {
        private const val ACTION = "biliroamingx.action.update_preferences"
        private const val EXTRA_PREFS = "prefs"

        @JvmStatic
        fun register() {
            Utils.getContext()
                .registerReceiverCompat(PreferenceUpdater(), IntentFilter(ACTION))
        }

        @JvmStatic
        fun update(vararg prefs: Pair<String, Any?>) {
            val context = Utils.getContext()
            context.sendBroadcast(Intent(ACTION).apply {
                `package` = context.packageName
                putExtra(EXTRA_PREFS, ArrayList(prefs.asList()))
            })
        }
    }

    override fun onReceive(context: Context, intent: Intent) {
        val prefs = intent.serializableExtra<ArrayList<Pair<String, Any?>>>(EXTRA_PREFS)
        LogHelper.debug { "PreferenceUpdater, received update preferences request, prefs: $prefs" }
        prefs?.forEach { (k, v) ->
            Settings.entries.find { it.key == k }?.saveValue(v)
        }
    }
}
