package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray

object VipAds : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Utils.isHd() && Settings.RemoveVipSection() && status.isOk
                && url.contains("/x/vip/ads/materials")
                && url.contains("position=3")
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
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
