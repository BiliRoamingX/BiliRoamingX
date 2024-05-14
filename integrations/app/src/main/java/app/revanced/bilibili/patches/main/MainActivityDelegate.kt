package app.revanced.bilibili.patches.main

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.annotation.Keep
import app.revanced.bilibili.patches.drawer.DrawerPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.fragments.BiliRoamingSettingsFragment
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.constraintSize
import com.bilibili.app.preferences.BiliPreferencesActivity
import tv.danmaku.bili.MainActivityV2

object MainActivityDelegate {
    @Keep
    @JvmStatic
    fun onCreate(activity: MainActivityV2) {
        DrawerPatch.onMainActivityCreate(activity)
        Utils.runOnMainThread(1000L) {
            showHintIfNeeded(activity)
        }
    }

    @Keep
    @JvmStatic
    fun onStart(activity: MainActivityV2) {
        DrawerPatch.onMainActivityStart(activity)
    }

    @Keep
    @JvmStatic
    fun onBackPressed(activity: MainActivityV2): Boolean {
        return DrawerPatch.onMainActivityBackPressed(activity)
    }

    @Keep
    @JvmStatic
    fun onSaveInstanceState(activity: MainActivityV2, outState: Bundle) {
    }

    private fun showHintIfNeeded(context: Context) {
        if (Settings.ShowHint() || Utils.isHd()) return
        AlertDialog.Builder(context)
            .setTitle(Utils.getString("biliroaming_usage_hint_title"))
            .setMessage(Utils.getString("biliroaming_usage_hint_message"))
            .setPositiveButton(Utils.getString("biliroaming_jump_settings")) { _, _ ->
                Settings.ShowHint.save(true)
                val intent = Intent(context, BiliPreferencesActivity::class.java)
                intent.putExtra("extra:key:fragment", BiliRoamingSettingsFragment::class.java.name)
                intent.putExtra("extra:key:title", Utils.getString("biliroaming_settings_title"))
                context.startActivity(intent)
            }
            .setNegativeButton(Utils.getString("biliroaming_get_it")) { _, _ ->
                Settings.ShowHint.save(true)
            }.create().constraintSize().show()
    }
}
