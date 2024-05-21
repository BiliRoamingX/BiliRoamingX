package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getSeason
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.FAIL_CODE
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.isBangumiWithWatchPermission
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.asSequence
import app.revanced.bilibili.utils.orEmpty
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONArray
import org.json.JSONObject

object Eps : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.UnlockAreaLimit()
                && url.contains("/pgc/view/v2/app/eps")
                && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val json = JSONObject(response)
        if (!Settings.UnlockAreaLimit())
            return response
        if (json.optInt("code", -1) == 0) {
            json.optJSONObject("data")?.optJSONArray("modules").orEmpty()
                .asSequence<JSONObject>().flatMap {
                    it.optJSONObject("data")?.optJSONArray("episodes")
                        .orEmpty().asSequence<JSONObject>()
                }.forEach { it.unlock() }
            return json.toString()
        } else {
            val seasonId = Uri.parse(url).getQueryParameter("season_id")?.toLong() ?: 0L
            val (newCode, newResult) = getSeason(seasonId)?.toJSONObject()?.let {
                it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
            } ?: (FAIL_CODE to null)
            if (isBangumiWithWatchPermission(newResult, newCode)) {
                val positiveModule = newResult.optJSONArray("modules").orEmpty()
                    .asSequence<JSONObject>().find { it.optString("style") == "positive" }
                positiveModule?.optJSONObject("data")?.optJSONArray("episodes").orEmpty()
                    .asSequence<JSONObject>().forEach {
                        it.optJSONObject("rights")?.run {
                            put("area_limit", 0)
                            if (Settings.AllowDownload())
                                put("allow_download", 1)
                        }
                    }
                val modules = JSONArray().apply { positiveModule?.let { put(it) } }
                val newEp = newResult.optJSONObject("new_ep")
                val publish = newResult.optJSONObject("publish")
                val rights = JSONObject().apply { put("is_cover_show", 0) }
                val showSeasonType = newResult.optInt("show_season_type")
                val data = JSONObject().apply {
                    put("modules", modules)
                    newEp?.let { put("new_ep", it) }
                    publish?.let { put("publish", it) }
                    put("rights", rights)
                    put("season_id", seasonId)
                    put("show_season_type", showSeasonType)
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
            if (Settings.AllowDownload())
                put("allow_download", 1)
        }
    }
}
