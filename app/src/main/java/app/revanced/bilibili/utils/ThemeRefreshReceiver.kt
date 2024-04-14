package app.revanced.bilibili.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import app.revanced.bilibili.patches.CustomThemePatch

class ThemeRefreshReceiver : BroadcastReceiver() {
    companion object {
        const val ACTION = "biliroamingx.action.refresh_theme"
        const val EXTRA_NEW_COLOR = "new_color"
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == ACTION) {
            val newColor = intent.getIntExtra(EXTRA_NEW_COLOR, 0)
            CustomThemePatch.refresh(newColor)
        }
    }
}
