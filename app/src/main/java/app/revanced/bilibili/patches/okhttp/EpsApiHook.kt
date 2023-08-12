package app.revanced.bilibili.patches.okhttp

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getThaiSeason
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.FAIL_CODE
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.isBangumiWithWatchPermission
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.asSequence
import app.revanced.bilibili.utils.orEmpty
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray
import org.json.JSONObject

object EpsApiHook {
    @JvmStatic
    fun hook(url: String, response: String): String {
        val json = JSONObject(response)
        if (!Settings.UNLOCK_AREA_LIMIT.boolean)
            return response
        if (json.optInt("code") == 0) {
            json.optJSONObject("data")?.optJSONArray("modules")
                .orEmpty().asSequence<JSONObject>().flatMap {
                    it.optJSONObject("data")?.optJSONArray("episodes")
                        .orEmpty().asSequence<JSONObject>()
                }.forEach { it.unlock() }
            return json.toString()
        } else {
            val seasonId = Uri.parse(url).getQueryParameter("season_id")
            val (newCode, newResult) = getThaiSeason(mapOf("season_id" to seasonId))
                ?.toJSONObject()?.let {
                    it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
                } ?: (FAIL_CODE to null)
            if (isBangumiWithWatchPermission(newResult, newCode)) {
                val episodes = newResult.optJSONArray("modules")
                    .orEmpty().asSequence<JSONObject>()
                    .find { it.optString("style") == "positive" }
                    ?.optJSONObject("data")?.optJSONArray("episodes").orEmpty()
                episodes.asSequence<JSONObject>().forEach {
                    it.optJSONObject("rights")?.run {
                        put("area_limit", 0)
                        if (Settings.ALLOW_DOWNLOAD.boolean)
                            put("allow_download", 1)
                    }
                }
                val data = JSONObject().apply {
                    put("modules", JSONArray().apply {
                        put(JSONObject().apply {
                            put("data", JSONObject().apply {
                                put("episodes", episodes)
                            })
                        })
                    })
                }
                return JSONObject().apply {
                    put("code", 0)
                    put("data", data)
                }.toString()
            }
        }
        return response
    }

    private fun JSONObject.unlock() = also { json ->
        json.optJSONObject("badge_info")?.run {
            val badge = json.optString("badge")
            val badgeText = optString("text")
            if (badge != badgeText) {
                put("bg_color", "#FB7299")
                put("bg_color_night", "#BB5B76")
                put("text", badge)
            }
        }
        json.optJSONObject("rights")?.run {
            put("allow_demand", 1)
            put("allow_dm", 1)
            put("area_limit", 0)
            if (Settings.ALLOW_DOWNLOAD.boolean)
                put("allow_download", 1)
        }
    }
}
