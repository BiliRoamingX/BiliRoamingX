package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray

object VipAds : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Utils.isHd() && Settings.REMOVE_VIP_SECTION.boolean && code.isOk
                && url.startsWith("https://api.bilibili.com/x/vip/ads/materials")
                && url.contains("position=3")
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val jo = response.toJSONObject()
        if (jo.optInt("code") == 0) {
            jo.optJSONObject("data")?.run {
                put("list", JSONArray())
                put("list_v2", JSONArray())
            }
        }
        return jo.toString()
    }
}
