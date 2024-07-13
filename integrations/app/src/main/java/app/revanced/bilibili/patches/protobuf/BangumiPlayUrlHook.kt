package app.revanced.bilibili.patches.protobuf

import android.util.SparseArray
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.api.BiliRoamingApi.getPlayUrl
import app.revanced.bilibili.api.BiliRoamingApi.getSeason
import app.revanced.bilibili.api.CustomServerException
import app.revanced.bilibili.patches.TrialQualityPatch
import app.revanced.bilibili.patches.VideoQualityPatch
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.bangumiInfoCache
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.utils.UposReplacer.isPCdnUpos
import app.revanced.bilibili.utils.UposReplacer.replaceUpos
import app.revanced.bilibili.utils.UposReplacer.uposBackups
import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReq
import com.bapis.bilibili.app.playerunite.v1.PlayerMoss
import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny
import com.bapis.bilibili.app.viewunite.v1.ViewMoss
import com.bapis.bilibili.app.viewunite.v1.ViewReq
import com.bapis.bilibili.pgc.gateway.player.v2.*
import com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfo
import com.bapis.bilibili.pgc.gateway.player.v2.DashItem
import com.bapis.bilibili.pgc.gateway.player.v2.DashVideo
import com.bapis.bilibili.pgc.gateway.player.v2.ImageInfo
import com.bapis.bilibili.pgc.gateway.player.v2.Stream
import com.bapis.bilibili.pgc.gateway.player.v2.StreamInfo
import com.bapis.bilibili.pgc.gateway.player.v2.ViewInfo
import com.bapis.bilibili.playershared.*
import com.bapis.bilibili.playershared.CodeType
import com.bapis.bilibili.playershared.Dialog
import com.bapis.bilibili.playershared.Dimension
import com.bapis.bilibili.playershared.LimitActionType
import com.bapis.bilibili.playershared.TextInfo
import com.bapis.bilibili.playershared.Toast
import com.bilibili.lib.moss.api.BusinessException
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.NetworkException
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import kotlin.math.abs
import kotlin.math.ceil

object BangumiPlayUrlHook {
    private const val PGC_ANY_MODEL_TYPE_URL =
        "type.googleapis.com/bilibili.app.playerunite.pgcanymodel.PGCAnyModel"
    private val codecMap = mapOf(
        CodeType.CODE264.ordinal to 7,
        CodeType.CODE265.ordinal to 12,
        CodeType.CODEAV1.ordinal to 13
    )
    private val supportedPlayArcIndices = arrayOf(
        ConfType.FLIPCONF.number,
        ConfType.CASTCONF.number,
        ConfType.FEEDBACK.number,
        ConfType.SUBTITLE.number,
        ConfType.PLAYBACKRATE.number,
        ConfType.TIMEUP.number,
        ConfType.PLAYBACKMODE.number,
        ConfType.SCALEMODE.number,
        ConfType.BACKGROUNDPLAY.number,
        ConfType.LIKE.number,
        ConfType.COIN.number,
        ConfType.SHARE.number,
        ConfType.SCREENSHOT.number,
        ConfType.LOCKSCREEN.number,
        ConfType.RECOMMEND.number,
        ConfType.PLAYBACKSPEED.number,
        ConfType.DEFINITION.number,
        ConfType.SELECTIONS.number,
        ConfType.NEXT.number,
        ConfType.EDITDM.number,
        ConfType.SMALLWINDOW.number,
        ConfType.OUTERDM.number,
        ConfType.INNERDM.number,
        ConfType.COLORFILTER.number,
        ConfType.SKIPOPED.number,
        ConfType.RECORDSCREEN.number,
        ConfType.LISTEN.number,
    )

    var isDownloadPGC = false
        private set
    private var allowDownloadPGC = false

    var isDownloadUnite = false
        private set
    private var allowDownloadUnite = false

    @JvmStatic
    fun hookPlayViewPGCBefore(req: PlayViewReq) {
        VideoQualityPatch.unlockLimit(req)
        isDownloadPGC = req.download >= 1
        if (!Settings.UnlockAreaLimit()) return
        allowDownloadPGC = Settings.AllowDownload() && isDownloadPGC
        if (allowDownloadPGC) {
            req.fnval = Constants.MAX_FNVAL
            req.fourk = true
            req.download = 0
        }
    }

    @JvmStatic
    fun hookPlayViewUniteBefore(req: PlayViewUniteReq) {
        VideoQualityPatch.unlockLimit(req)
        if (Settings.TrialVipQuality() && !Accounts.isEffectiveVip) {
            runCatching {
                req.vod.isNeedTrial = true
            }.recoverCatching {
                val fields = SparseArray<Any>()
                fields.put(VideoVod.IS_NEED_TRIAL_FIELD_NUMBER, true)
                req.vod.setUnknownFields(fields.toUnknownFields())
            }.onFailure {
                Logger.error(it) { "Failed to set need trial filed" }
            }
        }
        isDownloadUnite = req.vod.download >= 1
        if (!Settings.UnlockAreaLimit()) return
        allowDownloadUnite = Settings.AllowDownload() && isDownloadUnite
        if (allowDownloadUnite) {
            req.vod.run {
                fnval = Constants.MAX_FNVAL
                fourk = true
                download = 0
            }
        }
        val extraContent = req.extraContentMap
        val epId = extraContent.getOrDefault("ep_id", "0").toLong()
        val seasonId = extraContent.getOrDefault("season_id", "0").toLong()
        if (epId != 0L && epId == req.vod.cid || seasonId != 0L && seasonId == req.vod.aid) {
            req.vod.cid = 0L
            req.vod.aid = 0L
        }
        if (isDownloadUnite)
            tryFixAidThailandRequest(req)
    }

    @JvmStatic
    fun hookPlayViewPGCAfter(
        req: PlayViewReq,
        reply: PlayViewReply?,
        error: MossException?
    ): PlayViewReply? {
        if (error is NetworkException)
            throw error
        reply?.playExtConf?.allowCloseSubtitle = true
        val response = reply ?: PlayViewReply()
        if (Settings.UnlockAreaLimit() && needProxy(response)) {
            return try {
                val seasonId = req.seasonId.takeIf { it != 0L }
                    ?: bangumiInfoCache.firstNotNullOfOrNull {
                        if (it.value.keys.contains(req.epId)) it.key else null
                    } ?: VideoInfoHolder.currentSeason()?.id ?: 0L
                val (thaiSeason, thaiEp) = getThaiSeason(seasonId, req.epId)
                val seasonTitle = response.business.episodeInfo.seasonInfo.title.ifEmpty {
                    VideoInfoHolder.currentSeason()?.title.orEmpty()
                }
                val content = getPlayUrl(
                    reconstructQuery(req, response, thaiEp),
                    seasonId = seasonId,
                    seasonTitle = seasonTitle
                )
                if (content == null) {
                    throw CustomServerException(mapOf("未知错误" to "请检查哔哩漫游设置中解析服务器设置。"))
                } else {
                    reconstructResponse(
                        req, response, content, allowDownloadPGC, thaiSeason, thaiEp
                    )
                }
            } catch (e: CustomServerException) {
                showPlayerError(response, "请求解析服务器发生错误(点此查看更多)\n${e.message}")
            }
        } else if (error == null && allowDownloadPGC) {
            return fixDownloadProto(response)
        } else if (error == null && (Settings.BlockBangumiPageAds() || Settings.RemoveCmdDms())) {
            return purifyViewInfo(response)
        }
        if (error != null) throw error else return reply
    }

    private fun fixDefaultQuality(error: MossException?, req: PlayViewUniteReq, response: PlayViewUniteReply) {
        if (error == null && !isDownloadUnite && (VideoQualityPatch.halfScreenQuality() != 0 || VideoQualityPatch.getMatchedFullScreenQuality() != 0)) {
            val requestQn = req.vod.qn
            if (requestQn > 0 && response.hasVodInfo() && response.vodInfo.quality.toLong() != requestQn) {
                response.vodInfo.streamListList.filter { it.hasDashVideo() || it.hasSegmentVideo() }
                    .asReversed().minByOrNull { abs(requestQn - it.streamInfo.quality) }?.let {
                        response.vodInfo.quality = it.streamInfo.quality
                    }
            }
        }
    }

    @JvmStatic
    fun hookPlayViewUniteAfter(
        req: PlayViewUniteReq,
        reply: PlayViewUniteReply?,
        error: MossException?
    ): PlayViewUniteReply? {
        if (error is NetworkException)
            throw error
        hookPlayViewUniteAfterExtraActions(reply)
        var finalError = error
        val response = reply ?: tryFixAidPGC(isDownloadUnite, req, error)
            ?.also { finalError = null } ?: PlayViewUniteReply()
        fixDefaultQuality(finalError, req, response)
        val supplementAny = response.supplement
        val typeUrl = supplementAny.typeUrl
        // Only handle pgc video
        if (reply != null && typeUrl != PGC_ANY_MODEL_TYPE_URL)
            finalError?.let { throw it } ?: run {
                if (allowDownloadUnite)
                    return fixDownloadProtoUnite(response)
                return reply
            }
        val extraContent = req.extraContentMap
        val reqEpId = extraContent.getOrDefault("ep_id", "0").toLong()
        val seasonId = extraContent.getOrDefault("season_id", "0").toLong()
            .takeIf { it != 0L } ?: bangumiInfoCache.firstNotNullOfOrNull {
            if (it.value.keys.contains(reqEpId)) it.key else null
        } ?: VideoInfoHolder.currentSeason()?.id ?: 0L
        if (seasonId == 0L && reqEpId == 0L)
            finalError?.let { throw it } ?: run {
                if (allowDownloadUnite)
                    return fixDownloadProtoUnite(response)
                return reply
            }
        val supplement = PlayViewReply.parseFrom(supplementAny.value.toByteArray())
        if (Settings.UnlockAreaLimit() && needProxyUnite(response, supplement)) {
            return try {
                val (thaiSeason, thaiEp) = getThaiSeason(seasonId, reqEpId)
                val seasonTitle = supplement.business.episodeInfo.seasonInfo.title.ifEmpty {
                    VideoInfoHolder.currentSeason()?.title.orEmpty()
                }
                val content = getPlayUrl(
                    reconstructQueryUnite(req, supplement, thaiEp),
                    seasonId = seasonId,
                    seasonTitle = seasonTitle
                )
                if (content == null) {
                    throw CustomServerException(mapOf("未知错误" to "请检查哔哩漫游设置中解析服务器设置。"))
                } else {
                    reconstructResponseUnite(
                        req, response, supplement, content, allowDownloadUnite, thaiSeason, thaiEp
                    )
                }
            } catch (e: CustomServerException) {
                showPlayerErrorUnite(
                    response, supplement, "请求解析服务器发生错误\n${e.message}"
                )
            }
        } else if (finalError == null) {
            if (allowDownloadUnite)
                return fixDownloadProtoUnite(response)
            var newReply = response
            if (Settings.BlockBangumiPageAds() || Settings.RemoveCmdDms())
                newReply = purifyViewInfoUnite(newReply, supplement)
            return newReply
        }
        finalError?.let { throw it } ?: return reply
    }

    // 主要用于修复8.4.0+版本泰区番剧下载
    private fun tryFixAidThailandRequest(req: PlayViewUniteReq) {
        if (!Settings.UnlockAreaLimit())
            return
        if (req.extraContentMap.any { it.key == "season_id" } || req.extraContentMap.any { it.key == "ep_id" })
            return
        val reqAid = req.vod.aid.toString()
        val reqCid = req.vod.cid.toString()
        if (reqAid == "0" && reqCid == "0")
            return
        if (maybeThailand(reqAid, reqCid)) {
            req.vod.aid = 0L
            req.vod.cid = 0L
            req.mutableExtraContentMap.apply {
                put("season_id", reqAid)
                put("ep_id", reqCid)
            }
        }
    }

    private fun tryFixAidPGC(
        isDownload: Boolean,
        req: PlayViewUniteReq,
        error: MossException?
    ): PlayViewUniteReply? {
        if (!Settings.UnlockAreaLimit())
            return null
        if (error == null || error !is BusinessException || error.code != 6002003/* 抱歉您所在地区不可观看！*/)
            return null
        val aid = req.vod.aid
        if (aid == 0L) return null
        if (req.extraContentMap.any { it.key == "season_id" } || req.extraContentMap.any { it.key == "ep_id" })
            return null
        val viewReq = ViewReq().apply {
            this.aid = aid
            this.playerArgs = PlayerArgs().apply {
                fnval = req.vod.fnval.toLong()
                fnver = req.vod.fnver.toLong()
                qn = req.vod.qn
                forceHost = req.vod.forceHost.toLong()
                voiceBalance = req.vod.voiceBalance
            }
        }
        val viewReply = ViewMoss().runCatchingOrNull { view(viewReq) }
            ?: return null
        val supplement = viewReply.supplement
        if (supplement.typeUrl != ViewUniteReplyHook.VIEW_PGC_ANY_TYPE_URL)
            return null
        val viewPgcAny = ViewPgcAny.parseFrom(supplement.value)
        val seasonId = viewPgcAny.ogvData.seasonId
        val reqCid = req.vod.cid.let { if (it == 0L) viewReply.arc.cid else it }
        val epId = viewReply.tab.tabModuleList.find { it.hasIntroduction() }
            ?.introduction?.modulesList?.asSequence()?.filter { it.hasSectionData() }
            ?.flatMap { it.sectionData.episodesList }
            ?.find { it.cid == reqCid }?.epId
        req.mutableExtraContentMap["season_id"] = seasonId.toString()
        epId?.let { req.mutableExtraContentMap["ep_id"] = it.toString() }
        val newReq = PlayViewUniteReq().apply {
            adExtra = req.adExtra
            mutableExtraContentMap.apply {
                this["is_need_view_info"] = "true"
                this["security_level"] = "LEVEL_L1"
                this["season_id"] = seasonId.toString()
                epId?.let { this["ep_id"] = it.toString() }
            }
            fromSpmid = "normal"
            fromSpmid = "0.0.0.0"
            spmid = "united.player-video-detail.0.0"
            vod = VideoVod().apply {
                fnval = req.vod.fnval
                fnver = req.vod.fnver
                fourk = req.vod.fourk
                preferCodecType = req.vod.preferCodecType
                qn = req.vod.qn
                voiceBalance = req.vod.voiceBalance
                if (isDownload)
                    download = 1
            }
        }
        return PlayerMoss().runCatchingOrNull { playViewUnite(newReq) }
    }

    private fun hookPlayViewUniteAfterExtraActions(playReply: PlayViewUniteReply?) {
        if (playReply == null) return
        if (Settings.RememberLosslessSetting()) {
            playReply.playDeviceConf.deviceConfsMap.asSequence().find {
                it.key == ConfType.LOSSLESS.number
            }?.value?.confValue?.switchVal = Settings.LosslessEnabled()
        }
        if (Settings.UnlockPlayLimit()) {
            if (playReply.playArcConf.arcConfsMap.asSequence().find {
                    it.key == ConfType.BACKGROUNDPLAY.number
                }?.value?.disabled == true) {
                playReply.playDeviceConf.deviceConfsMap.asSequence().find {
                    it.key == ConfType.BACKGROUNDPLAY.number
                }?.value?.confValue?.switchVal = Settings.BgPlayingEnabled()
            }
            val supportedConf = ArcConf().apply {
                isSupport = true
                disabled = false
            }
            val arcConfs = playReply.playArcConf.mutableArcConfsMap
            for (key in intArrayOf(
                ConfType.CASTCONF.number,
                ConfType.BACKGROUNDPLAY.number,
                ConfType.SMALLWINDOW.number,
                ConfType.LISTEN.number
            )) arcConfs[key] = supportedConf
        }
        if (!isDownloadUnite && !Accounts.isEffectiveVip
            && Settings.TrialVipQuality()
        ) TrialQualityPatch.makeVipFree(playReply)
        if (Settings.RemoveCmdDms()) {
            playReply.viewInfo.toastsList.withIndex().filter { (_, toast) ->
                toast.type == ToastType.VIP_DEFINITION_REMIND || toast.type == ToastType.VIP_CONTENT_REMIND
            }.map { it.index }.asReversed().forEach {
                playReply.viewInfo.removeToasts(it)
            }
        }
        if (Versions.ge7_64_0() && playReply.hasVideoCtrl() && playReply.videoCtrl.hasAutoQnCtl()) {
            playReply.videoCtrl.autoQnCtl.run {
                val halfScreenQuality = VideoQualityPatch.halfScreenQuality()
                val fullScreenQuality = VideoQualityPatch.fullScreenQuality()
                val mobileFullScreenQuality = VideoQualityPatch.mobileFullScreenQuality()
                if (fullScreenQuality != 0) {
                    loginFull = fullScreenQuality.toLong()
                    nologinFull = fullScreenQuality.toLong()
                }
                if (Versions.ge7_68_0() && mobileFullScreenQuality != 0) {
                    mobileLoginFull = mobileFullScreenQuality.toLong()
                    mobileNologinFull = mobileFullScreenQuality.toLong()
                }
                if (halfScreenQuality == 1) {
                    // follow fullscreen quality
                    if (Versions.ge7_68_0()) {
                        val wifiConnected = isWifiConnected()
                        loginHalf = if (wifiConnected) loginFull else mobileLoginFull
                        nologinHalf = if (wifiConnected) nologinFull else mobileNologinFull
                    } else {
                        loginHalf = loginFull
                        nologinHalf = nologinFull
                    }
                } else if (halfScreenQuality != 0) {
                    loginHalf = halfScreenQuality.toLong()
                    nologinHalf = halfScreenQuality.toLong()
                }
            }
        }
    }

    private fun getThaiSeason(
        seasonId: Long, reqEpId: Long
    ): Pair<Lazy<JSONObject>, Lazy<JSONObject>> {
        val season = lazy {
            getSeason(seasonId, reqEpId)?.toJSONObject()?.optJSONObject("result")
                ?: throw CustomServerException(mapOf("解析服务器错误" to "无法获取剧集信息"))
        }
        val ep = lazy {
            val s = season.value
            val allEps = s.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
                it.optJSONObject("data")?.optJSONArray("episodes")
                    .orEmpty().asSequence<JSONObject>()
            }.toList()
            var episode: JSONObject? = null
            if (reqEpId != 0L) {
                // located to the request episode
                episode = allEps.firstOrNull { it.optLong("ep_id") == reqEpId }
            } else {
                val (lastEpId, histories) = getVideoHistory(s.optInt("season_id"))
                val last = histories.find { it.epId == lastEpId }
                if (Settings.SaveThailandHistory() && last != null && last.progress == -1L) {
                    val lastEpIdx = allEps.indexOfFirst {
                        it.optInt("ep_id") == last.epId
                    }
                    if (lastEpIdx != -1 && lastEpIdx + 1 < allEps.size) {
                        val nextEp = allEps[lastEpIdx + 1]
                        val nextEpId = nextEp.optInt("ep_id")
                        // if last episode is watched over and next episode never watched,
                        // located to the next episode
                        if (histories.none { it.epId == nextEpId })
                            episode = nextEp
                    }
                }
                // try located to the last watching episode
                if (Settings.SaveThailandHistory() && episode == null && last != null)
                    episode = allEps.firstOrNull { it.optInt("ep_id") == last.epId }
                // fallback located to the first episode
                if (episode == null)
                    episode = allEps.firstOrNull()
            }
            episode ?: throw CustomServerException(mapOf("解析服务器错误" to "无法获取剧集信息"))
        }
        return season to ep
    }

    private fun fixDownloadProto(response: PlayViewReply) = response.apply {
        videoInfo.fixDownloadProto()
    }

    private fun fixDownloadProtoUnite(response: PlayViewUniteReply) = response.apply {
        val videoInfo = VideoInfo.parseFrom(response.vodInfo.toByteArray()).apply { fixDownloadProto() }
        vodInfo = VodInfo.parseFrom(videoInfo.toByteArray())
    }

    private fun purifyViewInfo(response: PlayViewReply) = response.apply {
        if (Settings.BlockBangumiPageAds()) {
            playExtConf.clearFreyaConfig()
            viewInfo.run {
                clearAnimation()
                clearCouponInfo()
                if (endPage.dialog.type != "pay")
                    clearEndPage()
                clearHighDefinitionTrialInfo()
                clearPayTip()
                if (popWin.buttonList.all { it.actionType != "pay" })
                    clearPopWin()
                if (toast.button.actionType != "pay")
                    clearToast()
                if (tryWatchPromptBar.buttonList.all { it.actionType != "pay" })
                    clearTryWatchPromptBar()
                mutableExtToastMap.clear()
            }
        }
        if (Settings.RemoveCmdDms())
            business.clearRecordInfo()
    }

    private fun purifyViewInfoUnite(
        response: PlayViewUniteReply,
        supplement: PlayViewReply
    ) = response.apply {
        this.supplement = newAny(PGC_ANY_MODEL_TYPE_URL, purifyViewInfo(supplement))
        if (Settings.BlockBangumiPageAds()) {
            if (viewInfo.promptBar.buttonList.any { it.actionType == ButtonAction.VIP })
                viewInfo.clearPromptBar()
        }
    }

    private fun needProxy(response: PlayViewReply): Boolean {
        if (!response.hasVideoInfo()) return true

        val viewInfo = response.viewInfo
        if (viewInfo.dialog.type == "area_limit") return true
        if (viewInfo.endPage.dialog.type == "area_limit") return true
        return false
    }

    private fun needProxyUnite(response: PlayViewUniteReply, supplement: PlayViewReply): Boolean {
        if (!response.hasVodInfo()) return true

        val viewInfo = supplement.viewInfo
        if (viewInfo.dialog.type == "area_limit") return true
        if (viewInfo.endPage.dialog.type == "area_limit") return true
        return false
    }

    private fun reconstructQuery(
        req: PlayViewReq,
        resp: PlayViewReply,
        thaiEp: Lazy<JSONObject>,
    ) = buildMap {
        val episodeInfo = resp.business.episodeInfo
        put("ep_id", req.epId.let {
            if (it != 0L) it else episodeInfo.epId.toLong()
        }.let {
            if (it != 0L) it else thaiEp.value.optLong("ep_id")
        }.toString())
        put("qn", req.qn.toString())
        put("fnver", req.fnver.toString())
        put("fnval", req.fnval.toString())
        put("force_host", req.forceHost.toString())
        put("fourk", if (req.fourk) "1" else "0")
    }

    private fun reconstructQueryUnite(
        req: PlayViewUniteReq,
        supplement: PlayViewReply,
        thaiEp: Lazy<JSONObject>,
    ) = buildMap {
        val episodeInfo = supplement.business.episodeInfo
        put("ep_id", req.extraContentMap["ep_id"].let {
            if (!it.isNullOrEmpty() && it != "0") it.toLong() else episodeInfo.epId.toLong()
        }.let {
            if (it != 0L) it else thaiEp.value.optLong("ep_id")
        }.toString())
        put("qn", req.vod.qn.toString())
        put("fnver", req.vod.fnver.toString())
        put("fnval", req.vod.fnval.toString())
        put("force_host", req.vod.forceHost.toString())
        put("fourk", if (req.vod.fourk) "1" else "0")
    }

    private fun showPlayerError(response: PlayViewReply, message: String) =
        runCatchingOrNull { response.toErrorReply(message) } ?: response

    private fun showPlayerErrorUnite(
        response: PlayViewUniteReply,
        supplement: PlayViewReply,
        message: String
    ) = runCatchingOrNull {
        response.apply {
            this.supplement = newAny(PGC_ANY_MODEL_TYPE_URL, supplement.toErrorReply(message))
            clearVodInfo()
        }.apply {
            if (Versions.ge7_39_0()) toErrorReply(message)
        }
    } ?: response

    private fun PlayViewUniteReply.toErrorReply(message: String) = apply {
        val errorDialog = Dialog().apply {
            backgroundInfo = BackgroundInfo().apply {
                drawableBitmapUrl =
                    "https://i0.hdslb.com/bfs/album/08d5ce2fef8da8adf91024db4a69919b8d02fd5c.png"
                effects = Effects.GAUSSIAN_BLUR
            }
            styleType = GuideStyle.VERTICAL_TEXT
            val (titleText, messageText) = message.split('\n', limit = 2)
            title = TextInfo().apply {
                text = titleText
                textColor = "#ffffff"
            }
            subtitle = TextInfo().apply {
                text = messageText
                textColor = "#ffffff"
            }
            limitActionType = LimitActionType.SHOW_LIMIT_DIALOG
        }
        viewInfo = com.bapis.bilibili.playershared.ViewInfo().apply {
            mutableDialogMapMap["start_playing"] = errorDialog
        }
    }

    private fun PlayViewReply.toErrorReply(message: String) = apply {
        viewInfo.dialog = com.bapis.bilibili.pgc.gateway.player.v2.Dialog().apply {
            msg = "获取播放地址失败"
            title = com.bapis.bilibili.pgc.gateway.player.v2.TextInfo().apply {
                text = message
                textColor = "#ffffff"
            }
            image = ImageInfo().apply {
                url = "https://i0.hdslb.com/bfs/album/08d5ce2fef8da8adf91024db4a69919b8d02fd5c.png"
            }
            code = 6002003L
            styleType = "horizontal_image"
            type = "area_limit"
        }
        viewInfo.clearEndPage()
        clearVideoInfo()
    }

    private fun reconstructResponse(
        req: PlayViewReq,
        response: PlayViewReply,
        content: String,
        isDownload: Boolean,
        thaiSeason: Lazy<JSONObject>,
        thaiEp: Lazy<JSONObject>,
    ) = runCatching {
        var jsonContent = content.toJSONObject()
        if (jsonContent.has("result")) {
            // For kghost server
            val result = jsonContent.opt("result")
            if (result != null && result !is String)
                jsonContent = jsonContent.getJSONObject("result")
        }
        response.apply {
            videoInfo = jsonContent.toVideoInfo(req.qn, req.preferCodecType.ordinal, isDownload)
            fixBusinessProto(thaiSeason, thaiEp, jsonContent)
            viewInfo = ViewInfo()
            playConf = PlayAbilityConf().apply {
                dislikeDisable = true
                likeDisable = true
                elecDisable = true
                freyaEnterDisable = true
                freyaFullDisable = true
            }
            if (hasPlayExtConf()) {
                playExtConf.allowCloseSubtitle = true
            } else {
                playExtConf = PlayAbilityExtConf().apply {
                    allowCloseSubtitle = true
                }
            }
        }
    }.onFailure { Logger.error(it) { "Failed to reconstruct response" } }
        .getOrDefault(response)
        .also { Logger.debug { "playurl reconstruct response: $it" } }

    private fun reconstructResponseUnite(
        req: PlayViewUniteReq,
        response: PlayViewUniteReply,
        supplement: PlayViewReply,
        content: String,
        isDownload: Boolean,
        thaiSeason: Lazy<JSONObject>,
        thaiEp: Lazy<JSONObject>,
    ) = runCatching {
        var jsonContent = content.toJSONObject()
        if (jsonContent.has("result")) {
            // For kghost server
            val result = jsonContent.opt("result")
            if (result != null && result !is String)
                jsonContent = jsonContent.getJSONObject("result")
        }
        response.apply {
            vodInfo = VodInfo.parseFrom(
                jsonContent.toVideoInfo(req.vod.qn, req.vod.preferCodecType.ordinal, isDownload).toByteArray()
            )
            val thai = !hasPlayArc()
            if (thai) {
                playArc = PlayArc().apply {
                    val episode = thaiEp.value
                    aid = episode.optLong("aid")
                    cid = episode.optLong("cid")
                    videoType = BizType.BIZ_TYPE_PGC
                    episode.optJSONObject("dimension")?.run {
                        dimension = Dimension().apply {
                            width = optLong("width")
                            height = optLong("height")
                            rotate = optLong("rotate")
                        }
                    }
                    val timeLength = jsonContent.optLong("timelength")
                    val durationS = ceil(timeLength / 1000.0).toLong()
                    runCatchingOrNull {
                        watchTimeLength = durationS * 1000
                        durationMs = timeLength
                    }
                    duration = durationS
                }
            }
            val newSupplement = supplement.apply {
                fixBusinessProto(thaiSeason, thaiEp, jsonContent)
                viewInfo = ViewInfo()
                // in fact, unite player does not case about "allowCloseSubtitle" field
                if (hasPlayExtConf()) {
                    playExtConf.allowCloseSubtitle = true
                } else {
                    playExtConf = PlayAbilityExtConf().apply {
                        allowCloseSubtitle = true
                    }
                }
            }
            this.supplement = newAny(PGC_ANY_MODEL_TYPE_URL, newSupplement)
            playArcConf = PlayArcConf().apply {
                val supportedConf = ArcConf().apply {
                    isSupport = true
                }
                supportedPlayArcIndices.filterNot {
                    if (thai) {
                        it == ConfType.LIKE.number || it == ConfType.COIN.number || it == ConfType.SHARE.number
                    } else false
                }.associateWith { supportedConf }.let {
                    mutableArcConfsMap.putAll(it)
                }
                runCatchingOrNull {
                    // introduced in 7.80.0
                    mutableArcConfsMap.put(ConfType.WATCH_LATER.number, supportedConf)
                }
            }
            if (thai) {
                history = History().apply {
                    if (Settings.SaveThailandHistory()) {
                        val season = thaiSeason.value
                        val seasonId = season.optInt("season_id")
                        val episode = thaiEp.value
                        val currentEp = episode.optInt("ep_id")
                        val (current, last) = getHistory(season, seasonId, currentEp)
                        current?.let { currentVideo = it }
                        last?.let { relatedVideo = it }
                    }
                }
            }
        }
    }.onFailure { Logger.error(it) { "Failed to reconstruct unite response" } }
        .getOrDefault(response)
        .also { Logger.debug { "playurl reconstruct unite response: $it" } }

    private fun JSONObject.toVideoInfo(
        requestQn: Long, preferCodec: Int, isDownload: Boolean
    ) = VideoInfo().apply {
        val type = optString("type")
        val videoCodecId = optInt("video_codecid")
        val formatMap = HashMap<Int, JSONObject>()
        for (format in optJSONArray("support_formats").orEmpty())
            formatMap[format.optInt("quality")] = format

        timelength = optLong("timelength")
        videoCodecid = videoCodecId
        quality = optInt("quality")
        format = optString("format")

        if (type == "DASH") {
            val audioIds = ArrayList<Int>()
            optJSONObject("dash")?.optJSONArray("audio")
                .orEmpty().asSequence<JSONObject>().map { audio ->
                    DashItem().apply {
                        audio.run {
                            baseUrl = optString("base_url")
                            id = optInt("id")
                            audioIds.add(id)
                            md5 = optString("md5")
                            size = optLong("size")
                            codecid = optInt("codecid")
                            bandwidth = optInt("bandwidth")
                            optJSONArray("backup_url").orEmpty()
                                .asSequence<String>().toList()
                                .let { addAllBackupUrl(it) }
                        }
                    }
                }.toList().let { addAllDashAudio(it) }
            val preferCodecId = codecMap[preferCodec] ?: videoCodecId
            val videos = optJSONObject("dash")?.optJSONArray("video")
                ?.asSequence<JSONObject>()?.toList().orEmpty()
            val availableQns = videos.map { it.optInt("id") }.toSet()
            val preferVideos = videos.filter { it.optInt("codecid") == preferCodecId }
                .takeIf { l -> l.map { it.optInt("id") }.containsAll(availableQns) }
                ?: videos.filter { it.optInt("codecid") == videoCodecId }
            preferVideos.map { video ->
                val dashVideo = DashVideo().apply {
                    video.run {
                        baseUrl = optString("base_url")
                        optJSONArray("backup_url").orEmpty()
                            .asSequence<String>().toList()
                            .let { addAllBackupUrl(it) }
                        bandwidth = optInt("bandwidth")
                        codecid = optInt("codecid")
                        md5 = optString("md5")
                        size = optLong("size")
                    }
                    audioId = audioIds.maxOrNull() ?: audioIds[0]
                    noRexcode = optInt("no_rexcode") != 0
                }
                val streamInfo = StreamInfo().apply {
                    quality = video.optInt("id")
                    intact = true
                    attribute = 0
                    formatMap[quality]?.run {
                        description = optString("description")
                        format = optString("format")
                        needVip = optBoolean("need_vip", false)
                        needLogin = optBoolean("need_login", false)
                        newDescription = optString("new_description")
                        superscript = optString("superscript")
                        displayDesc = optString("display_desc")
                    }
                }
                Stream().apply {
                    this.dashVideo = dashVideo
                    this.streamInfo = streamInfo
                }
            }.let { addAllStreamList(it) }
            val qn = if (requestQn > 0) requestQn.toInt() else quality
            quality = preferVideos.asReversed().minByOrNull {
                abs(it.optInt("id") - qn)
            }?.optInt("id") ?: qn
        }
        replaceUpos()
        if (isDownload) {
            fixDownloadProto(true)
        }
    }

    private fun VideoInfo.fixDownloadProto(checkBaseUrl: Boolean = false) {
        var audioId = 0
        var setted = false
        val checkConnection = fun(url: String) = runCatchingOrNull {
            val connection = URL(url).openConnection() as HttpURLConnection
            connection.requestMethod = "HEAD"
            connection.connectTimeout = 1000
            connection.readTimeout = 1000
            connection.connect()
            connection.responseCode == HttpURLConnection.HTTP_OK
        } ?: false
        streamListList.forEach { s ->
            if (s.streamInfo.quality != quality || setted) {
                s.clearContent()
            } else {
                audioId = s.dashVideo.audioId
                setted = true
                if (checkBaseUrl) s.dashVideo.run {
                    if (!checkConnection(baseUrl))
                        backupUrlList.find(checkConnection)?.let {
                            baseUrl = it
                        }
                }
            }
        }
        val audio = (dashAudioList.find {
            it.id == audioId
        } ?: dashAudioList.first()).let { a ->
            if (checkBaseUrl) a.apply {
                if (!checkConnection(baseUrl))
                    backupUrlList.find(checkConnection)?.let {
                        baseUrl = it
                    }
            } else a
        }
        clearDashAudio()
        addDashAudio(audio)
    }

    private fun getHistory(
        season: JSONObject,
        seasonId: Int,
        currentEp: Int
    ): Pair<HistoryInfo?, HistoryInfo?> {
        val (lastEpId, histories) = getVideoHistory(seasonId)
        val current = histories.find { it.epId == currentEp }
        val last = histories.find { it.epId == lastEpId }
        if (current == null && last == null)
            return null to null
        val allEps = season.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
            it.optJSONObject("data")?.optJSONArray("episodes")
                .orEmpty().asSequence<JSONObject>()
        }.toList()
        val toastWithoutTime = Toast().apply {
            button = Button().apply { text = "跳转播放" }
            text = "你有最近观看的进度 "
        }
        val currentHistory = current?.run {
            HistoryInfo().apply {
                val episode = allEps.first { it.optInt("ep_id") == epId }
                lastPlayCid = episode.optLong("cid")
                lastPlayAid = episode.optLong("aid")
                progress = this@run.progress
                if (progress != -1L) {
                    this.toastWithoutTime = toastWithoutTime
                    toast = Toast().apply {
                        button = Button()
                        text = "已为您定位至上次观看位置"
                    }
                }
            }
        }
        val lastHistory = last?.run {
            HistoryInfo().apply {
                val episode = allEps.first { it.optInt("ep_id") == epId }
                val title = episode.optString("title")
                lastPlayCid = episode.optLong("cid")
                lastPlayAid = episode.optLong("aid")
                progress = this@run.progress
                if (progress != -1L) {
                    this.toastWithoutTime = toastWithoutTime
                    toast = Toast().apply {
                        button = Button().apply { text = "跳转播放" }
                        val lastTitle = if (title.toIntOrNull() != null) "第${title}话" else title
                        text = "上次看到$lastTitle ${progress.secondFormat()} "
                    }
                }
            }
        }
        return currentHistory to lastHistory
    }

    private fun getWatchProgress(
        season: JSONObject,
        seasonId: Int,
        currentEp: Int
    ): Pair<WatchProgress?, WatchProgress?> {
        val (lastEpId, histories) = getVideoHistory(seasonId)
        val current = histories.find { it.epId == currentEp }
        val last = histories.find { it.epId == lastEpId }
        if (current == null && last == null)
            return null to null
        val allEps = season.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
            it.optJSONObject("data")?.optJSONArray("episodes")
                .orEmpty().asSequence<JSONObject>()
        }.toList()
        val toastWithoutTime = com.bapis.bilibili.pgc.gateway.player.v2.Toast().apply {
            button = ButtonInfo().apply {
                text = "跳转播放"
                textColor = "#FF6699"
            }
            toastText = com.bapis.bilibili.pgc.gateway.player.v2.TextInfo().apply {
                text = "你有最近观看的进度 "
                textColor = "#FFFFFF"
            }
        }
        val currentProgress = current?.run {
            WatchProgress().apply {
                val episode = allEps.first { it.optInt("ep_id") == epId }
                val title = episode.optString("title")
                this.lastEpId = epId
                lastEpIndex = title
                lastPlayCid = episode.optLong("cid")
                lastPlayAid = episode.optLong("aid")
                progress = this@run.progress
                if (progress != -1L) {
                    this.toastWithoutTime = toastWithoutTime
                    toast = com.bapis.bilibili.pgc.gateway.player.v2.Toast().apply {
                        toastText = com.bapis.bilibili.pgc.gateway.player.v2.TextInfo().apply {
                            text = "已为您定位至上次观看位置"
                            textColor = "#FFFFFF"
                        }
                    }
                }
            }
        }
        val lastProgress = last?.run {
            WatchProgress().apply {
                val episode = allEps.first { it.optInt("ep_id") == epId }
                val title = episode.optString("title")
                this.lastEpId = epId
                lastEpIndex = title
                lastPlayCid = episode.optLong("cid")
                lastPlayAid = episode.optLong("aid")
                progress = this@run.progress
                if (progress != -1L) {
                    this.toastWithoutTime = toastWithoutTime
                    toast = com.bapis.bilibili.pgc.gateway.player.v2.Toast().apply {
                        button = ButtonInfo().apply {
                            text = "跳转播放"
                            textColor = "#FF6699"
                        }
                        val lastTitle = if (title.toIntOrNull() != null) "第${title}话" else title
                        toastText = com.bapis.bilibili.pgc.gateway.player.v2.TextInfo().apply {
                            text = "上次看到$lastTitle ${progress.secondFormat()} "
                            textColor = "#FFFFFF"
                        }
                    }
                }
            }
        }
        return currentProgress to lastProgress
    }

    private fun PlayViewReply.fixBusinessProto(
        thaiSeason: Lazy<JSONObject>,
        thaiEp: Lazy<JSONObject>,
        jsonContent: JSONObject,
    ) {
        if (hasBusiness()) {
            business.run {
                isPreview = jsonContent.optInt("is_preview", 0) == 1
                episodeInfo.seasonInfo.rights = Rights().apply { canWatch = 1 }
                if (Settings.AllowMiniPlay())
                    inlineType = InlineType.TYPE_WHOLE
            }
        } else {
            // thai or tw&hk on play client
            business = PlayViewBusinessInfo().apply {
                val season = thaiSeason.value
                val episode = thaiEp.value
                val epId = episode.optInt("ep_id")
                val seasonId = season.optInt("season_id")
                isPreview = jsonContent.optInt("is_preview", 0) == 1
                episodeInfo = EpisodeInfo().apply {
                    this.epId = epId
                    cid = episode.optLong("cid")
                    aid = episode.optLong("aid")
                    epStatus = episode.optInt("status")
                    cover = episode.optString("cover")
                    title = episode.optString("title")
                    seasonInfo = SeasonInfo().apply {
                        this.seasonId = seasonId
                        seasonType = season.optInt("type")
                        seasonStatus = season.optInt("status")
                        cover = season.optString("cover")
                        title = season.optString("title")
                        rights = Rights().apply { canWatch = 1 }
                    }
                }
                episode.optJSONObject("dimension")?.run {
                    dimension = com.bapis.bilibili.pgc.gateway.player.v2.Dimension().apply {
                        width = optInt("width")
                        height = optInt("height")
                        rotate = optInt("rotate")
                    }
                }
                val timeLength = jsonContent.optInt("timelength")
                val durationMs = ceil(timeLength / 1000.0).toInt() * 1000
                epWholeDuration = durationMs
                runCatchingOrNull {
                    watchTimeLength = durationMs.toLong()
                }
                if (Settings.AllowMiniPlay())
                    inlineType = InlineType.TYPE_WHOLE
                val clipInfo = bangumiInfoCache[seasonId.toLong()]
                    ?.get(epId.toLong())?.clipInfo
                if (clipInfo != null) {
                    clipInfo.optJSONObject("op")?.let { op ->
                        addClipInfo(ClipInfo().apply {
                            clipType = ClipType.CLIP_TYPE_OP
                            start = op.optInt("start")
                            end = op.optInt("end")
                            toastText = "即将跳过片头"
                        })
                    }
                    clipInfo.optJSONObject("ed")?.let { ed ->
                        addClipInfo(ClipInfo().apply {
                            clipType = ClipType.CLIP_TYPE_ED
                            start = ed.optInt("start")
                            end = ed.optInt("end")
                            toastText = "即将跳过片尾"
                        })
                    }
                }
                userStatus = UserStatus().apply {
                    if (Settings.SaveThailandHistory()) {
                        val (current, last) = getWatchProgress(season, seasonId, epId)
                        current?.let { aidWatchProgress = it }
                        last?.let { watchProgress = it }
                    }
                }
            }
        }
    }

    private fun VideoInfo.replaceUpos() {
        if (!replaceUpos) return
        streamListList.forEach { it.dashVideo.replaceDashVideoUpos() }
        dashAudioList.forEach { it.replaceDashItemUpos() }
    }

    private fun DashVideo.replaceDashVideoUpos() {
        if (baseUrl.isEmpty()) return
        val (newBaseUrl, newBackupUrls) = replaceUpos(baseUrl, backupUrlList)
        baseUrl = newBaseUrl
        clearBackupUrl()
        addAllBackupUrl(newBackupUrls)
    }

    private fun DashItem.replaceDashItemUpos() {
        if (baseUrl.isEmpty()) return
        val (newBaseUrl, newBackupUrls) = replaceUpos(baseUrl, backupUrlList)
        baseUrl = newBaseUrl
        clearBackupUrl()
        addAllBackupUrl(newBackupUrls)
    }

    private fun replaceUpos(
        baseUrl: String, backupUrls: List<String>
    ): Pair<String, List<String>> {
        val rawUrl = backupUrls.firstOrNull { !it.isPCdnUpos() }
        return if (baseUrl.isPCdnUpos()) {
            if (rawUrl != null) {
                rawUrl.replaceUpos() to listOf(rawUrl.replaceUpos(uposBackups[0]), baseUrl)
            } else baseUrl to backupUrls
        } else {
            val url = rawUrl ?: baseUrl
            baseUrl.replaceUpos() to listOf(
                url.replaceUpos(uposBackups[0]),
                url.replaceUpos(uposBackups[1])
            )
        }
    }
}
