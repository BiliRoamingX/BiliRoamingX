package app.revanced.bilibili.patches.protobuf.hooks

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getThailandSubtitles
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.bangumiInfoCache
import app.revanced.bilibili.patches.okhttp.hooks.Subtitle
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.community.service.dm.v1.*
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.NetworkException
import com.google.protobuf.GeneratedMessageLite
import org.json.JSONArray
import org.json.JSONObject

object DmView : MossHook<DmViewReq, DmViewReply>() {
    private val furrySubNameExtRegex = Regex("""[\[(\s]*(非官方|富睿字幕组)[])\s]*""")

    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DmViewReq
    }

    override fun hookAfter(
        req: DmViewReq,
        reply: DmViewReply?,
        error: MossException?
    ): DmViewReply? {
        if (Settings.RemoveCmdDms() && reply != null) {
            reply.clearActivityMeta()
            runCatchingOrNull {
                reply.clearCommand()
                reply.clearQoe()
                reply.dmMaskWallList.mapIndexedNotNull { index, wall ->
                    if (wall.bizType == DmMaskWallBizType.AIGC) index else null
                }.asReversed().forEach { reply.removeDmMaskWall(it) }
            }
            reply.clearUnknownFields()
        }
        if (error !is NetworkException)
            return addSubtitles(req, reply)
        return super.hookAfter(req, reply, error)
    }

    private fun addSubtitles(dmViewReq: DmViewReq, dmViewReply: DmViewReply?): DmViewReply {
        val result = dmViewReply ?: DmViewReply()
        val extraSubtitles = ArrayList<SubtitleItem>()
        if (Settings.UnlockAreaLimit() && Settings.ThailandServer().isNotEmpty()) {
            // when thailand, epId equals oid(cid), seasonId equals pid(aid)
            val epId = dmViewReq.oid
            val seasonId = dmViewReq.pid
            if (maybeThailand(seasonId.toString(), epId.toString())) {
                val subtitles = bangumiInfoCache[seasonId]?.get(epId)?.subtitles ?: run {
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
        if (Settings.AutoGenerateSubtitle()) {
            val subtitles = result.subtitle.subtitlesList + extraSubtitles
            if (subtitles.map { it.lan }.let { "zh-Hant" in it && "zh-CN" !in it }) {
                val hantSub = subtitles.first { it.lan == "zh-Hant" }
                if (!hantSub.lanDoc.contains("機翻")) {
                    val cnUrl = Uri.parse(hantSub.subtitleUrl).buildUpon()
                        .appendQueryParameter("zh_converter", "t2cn")
                        .build().toString()
                    val cnId = hantSub.id + 1
                    val cnSub = SubtitleItem().apply {
                        lan = "zh-CN"
                        lanDoc = "简中（漫游生成）"
                        lanDocBrief = "简中"
                        subtitleUrl = cnUrl
                        id = cnId
                        idStr = cnId.toString()
                    }
                    extraSubtitles.add(cnSub)
                }
            }
        }
        if (Settings.AutoGenerateSubtitle()) {
            val subtitles = result.subtitle.subtitlesList + extraSubtitles
            if (subtitles.map { it.lan }.let {
                    "zh-Hans" !in it && "zh-CN" !in it && "ai-zh" !in it && it.any { lan -> lan.startsWith("en") }
                }) {
                val enSub = subtitles.first { it.lan.startsWith("en") }
                val autoCNSub = SubtitleItem().apply {
                    aiStatus = SubtitleAiStatus.Assist
                    aiType = SubtitleAiType.Translate
                    id = enSub.id + 2233
                    idStr = id.toString()
                    lan = "ai-zh"
                    lanDoc = "简中（漫游翻译）"
                    lanDocBrief = "简中"
                    subtitleUrl = Uri.parse(enSub.subtitleUrl).buildUpon()
                        .appendQueryParameter("zh_converter", "en2cn").toString()
                    type = SubtitleType.AI
                }
                extraSubtitles.add(autoCNSub)
            }
        }
        if (extraSubtitles.isNotEmpty())
            result.subtitle.addAllSubtitles(extraSubtitles)
        val subtitle = result.subtitle
        val (cid, importedSubtitles) = Subtitle.importedSubtitles
        if (cid == dmViewReq.oid && subtitle.subtitlesList.isNotEmpty() && importedSubtitles.isNotEmpty()) {
            importedSubtitles.indices.forEach { index ->
                newImportSubtitle(index, subtitle)
                    ?.let { subtitle.addSubtitles(it) }
            }
        } else if (cid != dmViewReq.oid) {
            Subtitle.importedSubtitles = dmViewReq.oid to mutableListOf()
        }
        val subtitlesList = result.subtitle.subtitlesList
        if (Settings.AutoSelectAISubtitle() && subtitlesList.map { it.lan }
                .none { it == "zh-Hans" || it == "zh-CN" }) {
            subtitlesList.find { it.lan == "ai-zh" }?.run {
                lan = "zh-Hans"
                type = SubtitleType.CC
            }
        }
        return result
    }

    private fun JSONArray.toSubtitles(): List<SubtitleItem> {
        val subList = mutableListOf<SubtitleItem>()
        val distinct = asSequence<JSONObject>().distinctBy { it.optString("key") }.toList()
        val lanCodes = distinct.map { it.optString("key") }
        // prefer select furry cn subtitle if official hans subtitle not exist,
        // then consider kktv, iqiyi, mewatch, catchplay, friday
        var replaceable = true
        var hasCnFurry = false
        var hasCnKKTV = false
        var hasCnIqiyi = false
        var hasCnMeWatch = false
        var hasCnCatchPlay = false
        var hasCnFriday = false
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
            if (lanCode == "cn.friday")
                hasCnFriday = true
        }
        val replaceToFurry = replaceable && hasCnFurry
        val replaceToKKTV = replaceable && !replaceToFurry && hasCnKKTV
        val replaceToIqiyi = replaceable && !replaceToFurry && !replaceToKKTV && hasCnIqiyi
        val replaceToMeWatch =
            replaceable && !replaceToFurry && !replaceToKKTV && !replaceToIqiyi && hasCnMeWatch
        val replaceToCatchPlay =
            replaceable && !replaceToFurry && !replaceToKKTV && !replaceToIqiyi && !replaceToMeWatch && hasCnCatchPlay
        val replaceToFriday =
            replaceable && !replaceToFurry && !replaceToKKTV && !replaceToIqiyi && !replaceToMeWatch && !replaceToCatchPlay && hasCnFriday
        for (subtitle in distinct) {
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
                        || (it == "cn.friday" && replaceToFriday)
                    ) "zh-Hans" else it
                }
                lanDoc = subtitle.optString("title").replace(furrySubNameExtRegex, "")
            }.let { subList.add(it) }
        }
        return subList
    }

    fun newImportSubtitle(index: Int, subtitle: VideoSubtitle): SubtitleItem? {
        val order = index + 1
        val importLan = "import${order}"
        val subtitles = subtitle.subtitlesList
        if (subtitles.any { it.lan == importLan })
            return null
        return SubtitleItem().apply {
            val baseId = 114514L
            val delegateUrl = subtitles.find { s ->
                s.subtitleUrl.let { it.contains("aisubtitle") || it.contains("bstarstatic") }
            }?.subtitleUrl ?: subtitles.first().subtitleUrl
            id = baseId + index
            idStr = id.toString()
            lan = importLan
            lanDoc = "漫游导入${order}"
            lanDocBrief = "导入"
            subtitleUrl = Uri.parse(delegateUrl).buildUpon()
                .appendQueryParameter("zh_converter", "import")
                .appendQueryParameter("import_index", index.toString())
                .toString()
        }
    }
}
