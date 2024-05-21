package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray

object DmAd : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.BlockUpRcmdAds() && url.contains("/x/v2/dm/ad") && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        json.optJSONObject("data")?.put("ads", JSONArray())
        return json.toString()
    }
}
