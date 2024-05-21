package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray
import org.json.JSONObject

object BangumiMaterial : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.BlockBangumiPageAds()
                && (url.contains("/pgc/activity/deliver/material/receive")
                || url.contains("/pgc/activity/deliver/material/receive-activity"))
                && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        if (json.optInt("code", -1) == 0) {
            val newData = JSONObject().apply {
                put("container", JSONArray())
            }
            val newResp = JSONObject().apply {
                put("code", 0)
                put("message", "success")
                put("data", newData)
            }
            json.optJSONObject("data")?.optJSONObject("watch_count_down_cfg")?.let {
                newData.put("watch_count_down_cfg", it)
            }
            return newResp.toString()
        }
        return response
    }
}
