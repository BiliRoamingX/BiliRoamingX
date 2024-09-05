package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONObject

object SearchDefaultWords : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return url.contains("/x/v2/search/defaultwords") && status.isOk
                && Settings.PurifySearchTypes().contains("words")
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        return response.toJSONObject().apply {
            put("data", JSONObject.NULL)
        }.toString()
    }
}
