package app.revanced.bilibili.patches.protobuf.hooks

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getThailandSubtitles
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.seasonAreasCache
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.subtitlesCache
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.community.service.dm.v1.DmViewReply
import com.bapis.bilibili.community.service.dm.v1.DmViewReq
import com.bapis.bilibili.community.service.dm.v1.SubtitleItem
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.NetworkException
import com.google.protobuf.GeneratedMessageLite
import com.google.protobuf.UnknownFieldSetLite
import org.json.JSONArray
import org.json.JSONObject

object DmView : MossHook<DmViewReq, DmViewReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DmViewReq
    }

    override fun hookAfter(
        req: DmViewReq,
        reply: DmViewReply?,
        error: MossException?
    ): DmViewReply? {
        if (Settings.REMOVE_CMD_DMS.boolean && reply != null) {
            reply.clearActivityMeta()
            runCatchingOrNull {
                reply.clearCommand()
                reply.clearQoe()
            }
            reply.setUnknownFields(UnknownFieldSetLite.getDefaultInstance())
        }
        if (error !is NetworkException)
            return addSubtitles(req, reply)
        return super.hookAfter(req, reply, error)
    }

    private fun addSubtitles(dmViewReq: DmViewReq, dmViewReply: DmViewReply?): DmViewReply {
        val result = dmViewReply ?: DmViewReply()
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
                    val res = getThailandSubtitles(epId)?.toJSONObject()
                    if (res != null && res.optInt("code") == 0) {
                        res.optJSONObject("data")
                            ?.optJSONArray("subtitles").orEmpty()
                    } else JSONArray()
                }
                extraSubtitles.addAll(subtitles.toSubtitles())
                result.closed = true
                result.inputPlaceholder = "泰区禁止弹幕"
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
                val cnSub = SubtitleItem().apply {
                    lan = "zh-CN"
                    lanDoc = "简中（生成）"
                    lanDocBrief = "简中"
                    subtitleUrl = cnUrl
                    id = cnId
                    idStr = cnId.toString()
                }
                extraSubtitles.add(cnSub)
            }
        }
        if (Settings.SUBTITLE_ADD_CLOSE.boolean
            && dmViewReq.spmid.contains("pgc")
            && (result.subtitle.subtitlesList.isNotEmpty() || extraSubtitles.isNotEmpty())
        ) {
            val closeSub = SubtitleItem().apply {
                lan = "nodisplay"
                lanDoc = Utils.getString("Player_option_subtitle_lan_doc_nodisplay")
            }
            extraSubtitles.add(closeSub)
        }
        if (extraSubtitles.isNotEmpty())
            result.subtitle.addAllSubtitles(extraSubtitles)
        return result
    }

    private fun JSONArray.toSubtitles(): List<SubtitleItem> {
        val subList = mutableListOf<SubtitleItem>()
        val lanCodes = asSequence<JSONObject>().map { it.optString("key") }.toList()
        // prefer select furry cn subtitle if official hans subtitle not exist,
        // then consider kktv, iqiyi, mewatch, catchplay
        var replaceable = true
        var hasCnFurry = false
        var hasCnKKTV = false
        var hasCnIqiyi = false
        var hasCnMeWatch = false
        var hasCnCatchPlay = false
        for (lanCode in lanCodes) {
            if (lanCode == "zh-Hans")
                replaceable = false
            if (lanCode == "cn")
                hasCnFurry = true
            if (lanCode == "cn.kktv")
                hasCnKKTV = true
            if (lanCode == "cn.iqiyi")
                hasCnIqiyi = true
            if (lanCode == "cn.mewatch")
                hasCnMeWatch = true
            if (lanCode == "cn.catchplay")
                hasCnCatchPlay = true
        }
        val replaceToFurry = replaceable && hasCnFurry
        val replaceToKKTV = replaceable && !replaceToFurry && hasCnKKTV
        val replaceToIqiyi = replaceable && !replaceToFurry && !replaceToKKTV && hasCnIqiyi
        val replaceToMeWatch =
            replaceable && !replaceToFurry && !replaceToKKTV && !replaceToIqiyi && hasCnMeWatch
        val replaceToCatchPlay =
            replaceable && !replaceToFurry && !replaceToKKTV && !replaceToIqiyi && !replaceToMeWatch && hasCnCatchPlay
        for (subtitle in this) {
            SubtitleItem().apply {
                id = subtitle.optLong("id")
                idStr = subtitle.optLong("id").toString()
                subtitleUrl = subtitle.optString("url")
                lan = subtitle.optString("key").let {
                    if ((it == "cn" && replaceToFurry)
                        || (it == "cn.kktv" && replaceToKKTV)
                        || (it == "cn.iqiyi" && replaceToIqiyi)
                        || (it == "cn.mewatch" && replaceToMeWatch)
                        || (it == "cn.catchplay" && replaceToCatchPlay)
                    ) "zh-Hans" else it
                }
                lanDoc = subtitle.optString("title")
            }.let { subList.add(it) }
        }
        return subList
    }
}
