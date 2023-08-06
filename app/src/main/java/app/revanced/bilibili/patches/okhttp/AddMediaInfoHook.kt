package app.revanced.bilibili.patches.okhttp

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getThaiSeason
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.FAIL_CODE
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.isBangumiWithWatchPermission
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.seasonAreasCache
import app.revanced.bilibili.utils.Area
import app.revanced.bilibili.utils.cachePrefs
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONObject

object AddMediaInfoHook {
    @JvmStatic
    fun hook(url: String, response: String): String {
        val mediaId = Uri.parse(url).getQueryParameter("media_id")
        if (JSONObject(response).optInt("code") != 0
            && (Area.TH == seasonAreasCache[mediaId] || (cachePrefs.contains(mediaId)
                    && Area.TH == Area.of(cachePrefs.getString(mediaId, null))))
        ) {
            val (newCode, newResult) = getThaiSeason(mapOf("season_id" to mediaId))
                ?.toJSONObject()?.let {
                    it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
                } ?: (FAIL_CODE to null)
            if (isBangumiWithWatchPermission(newResult, newCode)) {
                val data = JSONObject().apply {
                    put("actor", newResult.optJSONObject("actor")?.apply {
                        put("title", optString("title").ifEmpty { "角色声优" })
                    })
                    put("alias", newResult.optString("alias"))
                    put("areas", newResult.optJSONArray("areas"))
                    put("cover", newResult.optString("cover"))
                    put("evaluate", newResult.optString("evaluate"))
                    put("mediaId", mediaId)
                    put("media_title", newResult.optString("title"))
                    put("origin_name", newResult.optString("origin_name"))
                    put("publish", newResult.optJSONObject("publish"))
                    put("season_id", mediaId)
                    put("staff", newResult.optJSONObject("staff")?.apply {
                        put("title", optString("title").ifEmpty { "制作信息" })
                    })
                    put("type_name", "番剧")
                }
                return JSONObject().apply {
                    put("code", 0)
                    put("data", data)
                }.toString()
            }
        }
        return response
    }
}
