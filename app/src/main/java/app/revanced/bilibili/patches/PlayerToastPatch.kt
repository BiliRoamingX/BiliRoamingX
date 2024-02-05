package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import app.revanced.bilibili.utils.Utils
import org.json.JSONObject
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast

object PlayerToastPatch {
    @Keep
    @JvmStatic
    fun onShow(playerToast: PlayerToast): Boolean {
        val title = playerToast.getExtraString("extra_title")
        val extra = playerToast.mToastExtra
        LogHelper.debug {
            "PlayerToast.onShow: ${
                JSONObject(extra.keySet().associateWith { extra.get(it)?.toString() })
            }"
        }
        return Settings.REMOVE_CMD_DMS.boolean
                && title == Utils.getString("dialog_warning_data_flow_ugc")
    }
}
