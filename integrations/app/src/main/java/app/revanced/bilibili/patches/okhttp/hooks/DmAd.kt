package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray

object DmAd : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.BLOCK_UP_RCMD_ADS.boolean && url.contains("/x/v2/dm/ad") && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        json.optJSONObject("data")?.put("ads", JSONArray())
        return json.toString()
    }
}
