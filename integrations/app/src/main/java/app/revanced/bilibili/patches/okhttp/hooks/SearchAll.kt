package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook
import app.revanced.bilibili.settings.Settings
import org.json.JSONObject

/**
 * for hd
 */
object SearchAll : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return status.isOk && (Settings.SearchBangumi() || Settings.SearchMovie())
                && url.contains("/x/v2/search?")
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val jsonObject = JSONObject(response)
        if (jsonObject.optInt("code") == 0) {
            val data = jsonObject.optJSONObject("data")
                ?: return response
            BangumiSeasonHook.addAreaTagsForHd(data)
            return jsonObject.toString()
        }
        return response
    }
}
