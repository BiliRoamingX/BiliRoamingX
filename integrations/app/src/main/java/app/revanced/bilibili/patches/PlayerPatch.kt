package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.utils.blkvPrefs
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.OnlineInfoChange

object PlayerPatch {
    @Keep
    @JvmStatic
    fun onOnlineInfoChanged(info: OnlineInfoChange.Request): Boolean {
        return !blkvPrefs.getBoolean("pref_player_full_screen_online_num_key", true)
    }
}
