package app.revanced.bilibili.patches.okhttp

import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.asSequence
import app.revanced.bilibili.utils.orEmpty
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONObject

object BangumiSeasonHook {
    val lastSeasonInfo = hashMapOf<String, String?>()

    @JvmStatic
    fun unlockBangumi(response: String): String {
        if (!Settings.UNLOCK_AREA_LIMIT.boolean)
            return response
        val jo = response.toJSONObject()
        jo.optInt("code").takeIf { it == 0 }
            ?: return response
        val data = jo.optJSONObject("data")
        lastSeasonInfo["title"] = data?.optString("title")
        lastSeasonInfo["season_id"] = data?.optString("season_id")
        data?.optJSONObject("rights")?.run {
            put("area_limit", 0)
            if (Settings.ALLOW_DOWNLOAD.boolean) {
                put("allow_download", 1)
                put("only_vip_download", 0)
            }
        }
        val badgeColor = "#FB7299"
        val badgeNightColor = "#BB5B76"
        data?.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
            it.optJSONObject("data")?.optJSONArray("episodes").orEmpty().asSequence<JSONObject>()
        }.forEach { episode ->
            val badge = episode.optString("badge")
            val badgeInfo = episode.optJSONObject("badge_info")
            val badgeInfoText = badgeInfo?.optString("text")
            if (badge != badgeInfoText) {
                badgeInfo?.run {
                    put("bg_color", badgeColor)
                    put("bg_color_night", badgeNightColor)
                    put("text", badge)
                }
            }
            episode.optJSONObject("rights")?.run {
                put("area_limit", 0)
                put("allow_dm", 1)
                if (Settings.ALLOW_DOWNLOAD.boolean)
                    put("allow_download", 1)
            }
            if (episode.has("cid") && episode.has("id")) {
                val cid = episode.optInt("cid").toString()
                val epId = episode.optInt("id").toString()
                lastSeasonInfo[cid] = epId
                lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
            }
        }
        return jo.toString()
    }
}
