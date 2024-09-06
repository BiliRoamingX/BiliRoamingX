package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.forEach
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray

object SearchRecommend : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return url.contains("/x/v2/search/recommend") && status.isOk
                && Settings.PurifySearchTypes().isNotEmpty()
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        return response.toJSONObject().apply {
            optJSONObject("data")?.apply {
                if (Settings.PurifySearchTypes().contains("recommend"))
                    put("list", JSONArray())
                optJSONArray("list")?.forEach { e ->
                    e.remove("recommend_reason")
                }
            }
        }.toString()
    }
}
