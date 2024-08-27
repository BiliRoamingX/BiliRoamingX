package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Logger
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.toJson
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast

object PlayerToastPatch {
    @Keep
    @JvmStatic
    fun onShow(playerToast: PlayerToast): Boolean {
        val title = playerToast.getExtraString("extra_title")
        val extra = playerToast.mToastExtra
        Logger.debug { "PlayerToast.onShow: ${extra.toJson()}" }
        return Settings.RemoveVideoPopups().contains("other")
                && title == Utils.getString("dialog_warning_data_flow_ugc")
    }
}
