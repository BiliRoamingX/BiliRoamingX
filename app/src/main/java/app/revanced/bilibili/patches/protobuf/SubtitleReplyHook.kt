package app.revanced.bilibili.patches.protobuf

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.seasonAreasCache
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.subtitlesCache
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.community.service.dm.v1.DmViewReply
import com.bapis.bilibili.community.service.dm.v1.DmViewReq
import com.bapis.bilibili.community.service.dm.v1.SubtitleItem
import com.bapis.bilibili.community.service.dm.v1.VideoSubtitleEx
import org.json.JSONArray
import org.json.JSONObject

object SubtitleReplyHook {
    @JvmStatic
    fun addSubtitles(dmViewReq: DmViewReq, dmViewReply: DmViewReply?): DmViewReply? {
        val result = dmViewReply ?: DmViewReply.newBuilder().build()
        val extraSubtitles = ArrayList<SubtitleItem>()
        if (Settings.UNLOCK_AREA_LIMIT.boolean && Settings.TH_SERVER.string.isNotEmpty()) {
            // when thailand, epId equals oid(cid), seasonId equals pid(aid)
            val epId = dmViewReq.oid.toString()
            val seasonId = dmViewReq.pid.toString()
            val seasonAreasCache = seasonAreasCache
            val sArea = seasonAreasCache[seasonId]
            val epArea = seasonAreasCache["ep$epId"]
            if (Area.TH.let { it == sArea || it == epArea } ||
                (cachePrefs.contains(seasonId) && Area.TH == Area.of(
                    cachePrefs.getString(seasonId, null)
                )) || (cachePrefs.contains("ep$epId") && Area.TH == Area.of(
                    cachePrefs.getString("ep$epId", null)
                ))) {
                val subtitles = subtitlesCache[seasonId]?.get(epId) ?: run {
                    val res = BiliRoamingApi.getThailandSubtitles(epId)?.toJSONObject()
                    if (res != null && res.optInt("code") == 0) {
                        res.optJSONObject("data")
                            ?.optJSONArray("subtitles").orEmpty()
                    } else JSONArray()
                }
                extraSubtitles.addAll(subtitles.toSubtitles())
            }
        }
        if (Settings.SUBTITLE_AUTO_GENERATE.boolean) {
            val subtitles = result.subtitle.subtitlesList + extraSubtitles
            if (subtitles.map { it.lan }.let { "zh-Hant" in it && "zh-CN" !in it }) {
                val hantSub = subtitles.first { it.lan == "zh-Hant" }
                val cnUrl = Uri.parse(hantSub.subtitleUrl).buildUpon()
                    .appendQueryParameter("zh_converter", "t2cn")
                    .build().toString()
                val cnId = hantSub.id + 1
                val cnSub = SubtitleItem.newBuilder()
                    .setLan("zh-CN")
                    .setLanDoc("简中（生成）")
                    .setLanDocBrief("简中")
                    .setSubtitleUrl(cnUrl)
                    .setId(cnId)
                    .setIdStr(cnId.toString())
                    .build()
                extraSubtitles.add(cnSub)
            }
        }
        if (Settings.SUBTITLE_ADD_CLOSE.boolean
            && dmViewReq.spmid.contains("pgc")
            && (result.subtitle.subtitlesList.isNotEmpty() || extraSubtitles.isNotEmpty())
        ) {
            val closeSub = SubtitleItem.newBuilder()
                .setLan("nodisplay")
                .setLanDoc(Utils.getString("Player_option_subtitle_lan_doc_nodisplay"))
                .build()
            extraSubtitles.add(closeSub)
        }
        if (extraSubtitles.isNotEmpty())
            VideoSubtitleEx.addAllSubtitles(result.subtitle, extraSubtitles)
        return result
    }

    private fun JSONArray.toSubtitles(): List<SubtitleItem> {
        val subList = mutableListOf<SubtitleItem>()
        val lanCodes = asSequence<JSONObject>().map { it.optString("key") }
        // prefer select furry cn subtitle if official not exist, then consider kktv
        val replaceable = "zh-Hans" !in lanCodes
        val replaceToFurry = replaceable && "cn" in lanCodes
        val replaceToKKTV = replaceable && !replaceToFurry && "cn.kktv" in lanCodes
        val replaceToIqiyi =
            replaceable && !replaceToFurry && !replaceToKKTV && "cn.iqiyi" in lanCodes
        for (subtitle in this) {
            SubtitleItem.newBuilder().apply {
                id = subtitle.optLong("id")
                idStr = subtitle.optLong("id").toString()
                subtitleUrl = subtitle.optString("url")
                lan = subtitle.optString("key").let {
                    if ((it == "cn" && replaceToFurry)
                        || (it == "cn.kktv" && replaceToKKTV)
                        || (it == "cn.iqiyi" && replaceToIqiyi)
                    ) "zh-Hans" else it
                }
                lanDoc = subtitle.optString("title")
            }.build().let { subList.add(it) }
        }
        return subList
    }
}
