package app.revanced.bilibili.patches.protobuf

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getPlayUrl
import app.revanced.bilibili.api.BiliRoamingApi.getThaiSeason
import app.revanced.bilibili.api.CustomServerException
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.lastSeasonInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.utils.UposReplacer.isPCdnUpos
import app.revanced.bilibili.utils.UposReplacer.replaceUpos
import app.revanced.bilibili.utils.UposReplacer.uposBackups
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReq
import com.bapis.bilibili.pgc.gateway.player.v2.*
import com.bapis.bilibili.pgc.gateway.player.v2.DashItem
import com.bapis.bilibili.pgc.gateway.player.v2.DashVideo
import com.bapis.bilibili.pgc.gateway.player.v2.Stream
import com.bapis.bilibili.pgc.gateway.player.v2.StreamInfo
import com.bapis.bilibili.pgc.gateway.player.v2.ViewInfo
import com.bapis.bilibili.playershared.*
import com.bapis.bilibili.playershared.CodeType
import com.bapis.bilibili.playershared.Dialog
import com.bapis.bilibili.playershared.Dimension
import com.bapis.bilibili.playershared.LimitActionType
import com.bapis.bilibili.playershared.TextInfo
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.NetworkException
import com.google.protobuf.Any
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import kotlin.math.abs

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
        ConfType.RECORDSCREEN.number,
    )

    private var isDownloadPGC = false
    private var allowDownloadPGC = false

    private var isDownloadUnite = false
    private var allowDownloadUnite = false

    @JvmStatic
    fun hookPlayViewPGCBefore(req: PlayViewReq) {
        isDownloadPGC = req.download >= 1
        if (!Settings.UNLOCK_AREA_LIMIT.boolean) return
        allowDownloadPGC = Settings.ALLOW_DOWNLOAD.boolean && isDownloadPGC
        if (allowDownloadPGC) {
            PlayViewReqEx.setFnval(req, Constants.MAX_FNVAL)
            PlayViewReqEx.setFourk(req, true)
            PlayViewReqEx.setDownload(req, 0)
        }
    }

    @JvmStatic
    fun hookPlayViewUniteBefore(req: PlayViewUniteReq) {
        isDownloadUnite = req.vod.download >= 1
        if (!Settings.UNLOCK_AREA_LIMIT.boolean) return
        allowDownloadUnite = Settings.ALLOW_DOWNLOAD.boolean && isDownloadUnite
        if (allowDownloadUnite) {
            VideoVodEx.setFnval(req.vod, Constants.MAX_FNVAL)
            VideoVodEx.setFourk(req.vod, true)
            VideoVodEx.setDownload(req.vod, 0)
        }
    }

    @JvmStatic
    fun hookPlayViewPGCAfter(
        req: PlayViewReq,
        reply: PlayViewReply?,
        error: MossException?
    ): PlayViewReply? {
        if (error is NetworkException)
            throw error
        val response = reply ?: PlayViewReply.newBuilder().build()
        if (Settings.UNLOCK_AREA_LIMIT.boolean && needProxy(response)) {
            return try {
                val seasonId = req.seasonId.toString().takeIf { it != "0" }
                    ?: lastSeasonInfo["season_id"] ?: "0"
                val (thaiSeason, thaiEp) = getThaiSeason(seasonId, req.epId)
                val content = getPlayUrl(reconstructQuery(req, response, thaiEp))
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
        } else if (error == null && Settings.BLOCK_BANGUMI_PAGE_ADS.boolean) {
            return purifyViewInfo(response)
        }
        if (error != null) throw error else return reply
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
        val response = reply ?: PlayViewUniteReply.newBuilder().build()
        val supplementAny = response.supplement
        val typeUrl = supplementAny.typeUrl
        // Only handle pgc video
        if (reply != null && typeUrl != PGC_ANY_MODEL_TYPE_URL)
            if (error != null) throw error else return reply
        val extraContent = req.extraContentMap
        val seasonId = extraContent.getOrDefault("season_id", "0")
        val reqEpId = extraContent.getOrDefault("ep_id", "0").toLong()
        if (seasonId == "0" && reqEpId == 0L)
            if (error != null) throw error else return reply
        lastSeasonInfo["season_id"] = seasonId
        val supplement = PlayViewReply.parseFrom(supplementAny.value.toByteArray())
        if (Settings.UNLOCK_AREA_LIMIT.boolean && needProxyUnite(response, supplement)) {
            return try {
                val (thaiSeason, thaiEp) = getThaiSeason(seasonId, reqEpId)
                val content = getPlayUrl(reconstructQueryUnite(req, supplement, thaiEp))
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
        } else if (error == null && allowDownloadUnite) {
            return fixDownloadProtoUnite(response)
        } else if (error == null && Settings.BLOCK_BANGUMI_PAGE_ADS.boolean) {
            return purifyViewInfoUnite(response, supplement)
        }
        if (error != null) throw error else return reply
    }

    private fun hookPlayViewUniteAfterExtraActions(playReply: PlayViewUniteReply?) {
        if (playReply == null) return
        if (Settings.REMEMBER_LOSSLESS_SETTING.boolean) {
            playReply.playDeviceConf.deviceConfsMap.forEach { (key, deviceConf) ->
                if (key == ConfType.LOSSLESS.number) {
                    val confValue = deviceConf.confValue
                    ConfValueEx.setSwitchVal(confValue, Settings.LOSSLESS_ENABLED.boolean)
                }
            }
        }
        if (Settings.UNLOCK_PLAY_LIMIT.boolean) {
            val supportedConf = ArcConf.newBuilder()
                .setIsSupport(true).setDisabled(false).build()
            val arcConfs = PlayArcConfEx.getMutableArcConfsMap(playReply.playArcConf)
            for (key in intArrayOf(
                ConfType.CASTCONF.number,
                ConfType.BACKGROUNDPLAY.number,
                ConfType.SMALLWINDOW.number,
                ConfType.LISTEN.number
            )) arcConfs[key] = supportedConf
        }
    }

    private fun getThaiSeason(
        seasonId: String, reqEpId: Long
    ): Pair<Lazy<JSONObject>, Lazy<JSONObject>> {
        val season = lazy {
            getThaiSeason(mapOf("season_id" to seasonId, "ep_id" to reqEpId.toString()))
                ?.toJSONObject()?.optJSONObject("result")
                ?: throw CustomServerException(mapOf("解析服务器错误" to "无法获取剧集信息"))
        }
        val ep = lazy {
            season.value.let { s ->
                s.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
                    it.optJSONObject("data")?.optJSONArray("episodes")
                        .orEmpty().asSequence<JSONObject>()
                }.let { es ->
                    es.firstOrNull { if (reqEpId != 0L) it.optLong("id") == reqEpId else true }
                } ?: s.optJSONObject("new_ep")?.apply { put("status", 2L) }
            } ?: throw CustomServerException(mapOf("解析服务器错误" to "无法获取剧集信息"))
        }
        return season to ep
    }

    private fun fixDownloadProto(response: PlayViewReply) = response.toBuilder().apply {
        videoInfo = videoInfo.toBuilder().apply { fixDownloadProto() }.build()
    }.build()

    private fun fixDownloadProtoUnite(response: PlayViewUniteReply) = response.toBuilder().apply {
        val videoInfo = VideoInfo.parseFrom(response.toByteArray())
        val newVideoInfo = videoInfo.toBuilder().apply { fixDownloadProto() }.build()
        vodInfo = VodInfo.parseFrom(newVideoInfo.toByteArray())
    }.build()

    private fun purifyViewInfo(response: PlayViewReply) = run {
        response.toBuilder().apply {
            playExtConf = playExtConf.toBuilder().apply { clearFreyaConfig() }.build()
            viewInfo = viewInfo.toBuilder().apply {
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
                clearExtToast()
            }.build()
        }.build()
    }

    private fun purifyViewInfoUnite(response: PlayViewUniteReply, supplement: PlayViewReply) = run {
        response.toBuilder().apply {
            this.supplement = Any.newBuilder().apply {
                typeUrl = PGC_ANY_MODEL_TYPE_URL
                value = purifyViewInfo(supplement).toByteString()
            }.build()
        }.build()
    }

    private fun needProxy(response: PlayViewReply): Boolean {
        if (!response.hasVideoInfo()) return true

        val viewInfo = response.viewInfo
        if (viewInfo.dialog.type == "area_limit") return true
        if (viewInfo.endPage.dialog.type == "area_limit") return true

        if (Settings.CN_SERVER_ACCESS_KEY.string.isEmpty()) return false
        if (response.business.isPreview) return true
        if (viewInfo.dialog.type.isNotEmpty()) return true
        return viewInfo.endPage.dialog.type.isNotEmpty()
    }

    private fun needProxyUnite(response: PlayViewUniteReply, supplement: PlayViewReply): Boolean {
        if (!response.hasVodInfo()) return true

        val viewInfo = supplement.viewInfo
        if (viewInfo.dialog.type == "area_limit") return true
        if (viewInfo.endPage.dialog.type == "area_limit") return true

        if (Settings.CN_SERVER_ACCESS_KEY.string.isEmpty()) return false
        if (supplement.business.isPreview) return true
        if (viewInfo.dialog.type.isNotEmpty()) return true
        return viewInfo.endPage.dialog.type.isNotEmpty()
    }

    private fun reconstructQuery(
        req: PlayViewReq,
        resp: PlayViewReply,
        thaiEp: Lazy<JSONObject>,
    ): String? {
        val episodeInfo = resp.business.episodeInfo
        return Uri.Builder().run {
            appendQueryParameter("ep_id", req.epId.let {
                if (it != 0L) it else episodeInfo.epId.toLong()
            }.let {
                if (it != 0L) it else thaiEp.value.optLong("id")
            }.toString())
            appendQueryParameter("cid", req.cid.let {
                if (it != 0L) it else episodeInfo.cid
            }.let {
                if (it != 0L) it else thaiEp.value.optLong("id")
            }.toString())
            appendQueryParameter("qn", req.qn.toString())
            appendQueryParameter("fnver", req.fnver.toString())
            appendQueryParameter("fnval", req.fnval.toString())
            appendQueryParameter("force_host", req.forceHost.toString())
            appendQueryParameter("fourk", if (req.fourk) "1" else "0")
            build()
        }.query
    }

    private fun reconstructQueryUnite(
        req: PlayViewUniteReq,
        supplement: PlayViewReply,
        thaiEp: Lazy<JSONObject>,
    ): String? {
        val episodeInfo = supplement.business.episodeInfo
        return Uri.Builder().run {
            appendQueryParameter("ep_id", req.extraContentMap["ep_id"].let {
                if (!it.isNullOrEmpty() && it != "0") it.toLong() else episodeInfo.epId.toLong()
            }.let {
                if (it != 0L) it else thaiEp.value.optLong("id")
            }.toString())
            appendQueryParameter("cid", req.vod.cid.let {
                if (it != 0L) it else episodeInfo.cid
            }.let {
                if (it != 0L) it else thaiEp.value.optLong("id")
            }.toString())
            appendQueryParameter("qn", req.vod.qn.toString())
            appendQueryParameter("fnver", req.vod.fnver.toString())
            appendQueryParameter("fnval", req.vod.fnval.toString())
            appendQueryParameter("force_host", req.vod.forceHost.toString())
            appendQueryParameter("fourk", if (req.vod.fourk) "1" else "0")
            build()
        }.query
    }

    private fun showPlayerError(response: PlayViewReply, message: String) =
        runCatchingOrNull { response.toErrorReply(message) } ?: response

    private fun showPlayerErrorUnite(
        response: PlayViewUniteReply,
        supplement: PlayViewReply,
        message: String
    ) = runCatchingOrNull {
        response.toBuilder().apply {
            this.supplement = Any.newBuilder().apply {
                typeUrl = PGC_ANY_MODEL_TYPE_URL
                value = supplement.toErrorReply(message).toByteString()
            }.build()
            clearVodInfo()
        }.apply {
            if (Versions.ge7_39_0()) toErrorReply(message)
        }.build()
    } ?: response

    private fun PlayViewUniteReply.Builder.toErrorReply(message: String) = apply {
        val errorDialog = Dialog.newBuilder().apply {
            backgroundInfo = BackgroundInfo.newBuilder().apply {
                drawableBitmapUrl =
                    "https://i0.hdslb.com/bfs/album/08d5ce2fef8da8adf91024db4a69919b8d02fd5c.png"
                effects = Effects.GAUSSIAN_BLUR
            }.build()
            styleType = GuideStyle.VERTICAL_TEXT
            val (titleText, messageText) = message.split('\n', limit = 2)
            title = TextInfo.newBuilder().apply {
                text = titleText
                textColor = "#ffffff"
            }.build()
            subtitle = TextInfo.newBuilder().apply {
                text = messageText
                textColor = "#ffffff"
            }.build()
            limitActionType = LimitActionType.SHOW_LIMIT_DIALOG
        }.build()
        viewInfo = com.bapis.bilibili.playershared.ViewInfo.newBuilder().apply {
            putDialogMap("start_playing", errorDialog)
        }.build()
    }

    private fun PlayViewReply.toErrorReply(message: String) = toBuilder().apply {
        viewInfo = viewInfo.toBuilder().apply {
            if (endPage.hasDialog())
                dialog = endPage.dialog
            dialog = dialog.toBuilder().apply {
                msg = "获取播放地址失败"
                title = title.toBuilder().apply {
                    text = message
                    if (textColor.isEmpty()) textColor = "#ffffff"
                }.build()
                image = image.toBuilder().apply {
                    url =
                        "https://i0.hdslb.com/bfs/album/08d5ce2fef8da8adf91024db4a69919b8d02fd5c.png"
                }.build()
                if (code == 0L) code = 6002003L
                if (styleType.isEmpty()) styleType = "horizontal_image"
                if (type.isEmpty()) type = "area_limit"
            }.build()
            clearEndPage()
        }.build()
        clearVideoInfo()
    }.build()

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
        response.toBuilder().apply {
            videoInfo = jsonContent.toVideoInfo(req.preferCodecType.ordinal, isDownload)
            fixBusinessProto(thaiSeason, thaiEp, jsonContent)
            viewInfo = ViewInfo.newBuilder().build()
            playConf = PlayAbilityConf.newBuilder().apply {
                dislikeDisable = true
                likeDisable = true
                elecDisable = true
                freyaEnterDisable = true
                freyaFullDisable = true
            }.build()
        }.build()
    }.onFailure { LogHelper.error({ "Failed to reconstruct response" }, it) }
        .getOrDefault(response)
        .also { LogHelper.debug { "playurl reconstruct response: $it" } }

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
        response.toBuilder().apply {
            vodInfo = VodInfo.parseFrom(
                jsonContent.toVideoInfo(req.vod.preferCodecType.ordinal, isDownload).toByteArray()
            )
            if (!hasPlayArc()) {
                playArc = PlayArc.newBuilder().apply {
                    val episode = thaiEp.value
                    aid = episode.optLong("aid")
                    cid = episode.optLong("cid")
                    videoType = BizType.BIZ_TYPE_PGC
                    episode.optJSONObject("dimension")?.run {
                        dimension = Dimension.newBuilder().apply {
                            width = optLong("width")
                            height = optLong("height")
                            rotate = optLong("rotate")
                        }.build()
                    }
                }.build()
            }
            val newSupplement = supplement.toBuilder().apply {
                fixBusinessProto(thaiSeason, thaiEp, jsonContent)
                viewInfo = ViewInfo.newBuilder().build()
            }.build()
            this.supplement = Any.newBuilder().apply {
                typeUrl = PGC_ANY_MODEL_TYPE_URL
                value = newSupplement.toByteString()
            }.build()
            playArcConf = PlayArcConf.newBuilder().apply {
                val supportedConf = ArcConf.newBuilder().apply {
                    isSupport = true
                }.build()
                putAllArcConfs(supportedPlayArcIndices.associateWith { supportedConf })
            }.build()
        }.build()
    }.onFailure { LogHelper.error({ "Failed to reconstruct unite response" }, it) }
        .getOrDefault(response)
        .also { LogHelper.debug { "playurl reconstruct unite response: $it" } }

    private fun JSONObject.toVideoInfo(
        preferCodec: Int, isDownload: Boolean
    ) = VideoInfo.newBuilder().apply root@{
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
                    DashItem.newBuilder().apply {
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
                    }.build()
                }.toList().let { addAllDashAudio(it) }
            var bestMatchQn = quality
            var minDeltaQn = Int.MAX_VALUE
            val preferCodecId = codecMap[preferCodec] ?: videoCodecId
            val videos = optJSONObject("dash")?.optJSONArray("video")
                ?.asSequence<JSONObject>()?.toList().orEmpty()
            val availableQns = videos.map { it.optInt("id") }.toSet()
            val preferVideos = videos.filter { it.optInt("codecid") == preferCodecId }
                .takeIf { l -> l.map { it.optInt("id") }.containsAll(availableQns) }
                ?: videos.filter { it.optInt("codecid") == videoCodecId }
            preferVideos.map { video ->
                val dashVideo = DashVideo.newBuilder().apply {
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
                }.build()
                val streamInfo = StreamInfo.newBuilder().apply {
                    quality = video.optInt("id")
                    val deltaQn = abs(quality - this@root.quality)
                    if (deltaQn < minDeltaQn) {
                        bestMatchQn = quality
                        minDeltaQn = deltaQn
                    }
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
                }.build()
                Stream.newBuilder().apply {
                    this.dashVideo = dashVideo
                    this.streamInfo = streamInfo
                }.build()
            }.let { addAllStreamList(it) }
            quality = bestMatchQn
        }
        replaceUpos()
        if (isDownload) {
            fixDownloadProto(true)
        }
    }.build()

    private fun VideoInfo.Builder.fixDownloadProto(checkBaseUrl: Boolean = false) {
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
        val streams = streamListList.map { s ->
            if (s.streamInfo.quality != quality || setted) {
                s.toBuilder().apply { clearContent() }.build()
            } else {
                audioId = s.dashVideo.audioId
                setted = true
                if (checkBaseUrl) {
                    s.toBuilder().apply {
                        dashVideo = dashVideo.toBuilder().apply {
                            if (!checkConnection(baseUrl))
                                backupUrlList.find(checkConnection)?.let {
                                    baseUrl = it
                                }
                        }.build()
                    }.build()
                } else s
            }
        }
        val audio = (dashAudioList.find {
            it.id == audioId
        } ?: dashAudioList.first()).let { a ->
            if (checkBaseUrl) {
                a.toBuilder().apply {
                    if (!checkConnection(baseUrl))
                        backupUrlList.find(checkConnection)?.let {
                            baseUrl = it
                        }
                }.build()
            } else a
        }
        clearStreamList()
        addAllStreamList(streams)
        clearDashAudio()
        addDashAudio(audio)
    }

    private fun PlayViewReply.Builder.fixBusinessProto(
        thaiSeason: Lazy<JSONObject>,
        thaiEp: Lazy<JSONObject>,
        jsonContent: JSONObject
    ) {
        if (hasBusiness()) {
            business = business.toBuilder().apply {
                isPreview = jsonContent.optInt("is_preview", 0) == 1
                episodeInfo = episodeInfo.toBuilder().apply {
                    seasonInfo = seasonInfo.toBuilder().apply {
                        rights = Rights.newBuilder().apply {
                            canWatch = 1
                        }.build()
                    }.build()
                }.build()
            }.build()
        } else {
            // thai
            business = PlayViewBusinessInfo.newBuilder().apply {
                val season = thaiSeason.value
                val episode = thaiEp.value
                isPreview = jsonContent.optInt("is_preview", 0) == 1
                episodeInfo = EpisodeInfo.newBuilder().apply {
                    epId = episode.optInt("id")
                    cid = episode.optLong("id")
                    aid = season.optLong("season_id")
                    epStatus = episode.optInt("status")
                    cover = episode.optString("cover")
                    title = episode.optString("title")
                    seasonInfo = SeasonInfo.newBuilder().apply {
                        seasonId = season.optInt("season_id")
                        seasonType = season.optInt("type")
                        seasonStatus = season.optInt("status")
                        cover = season.optString("cover")
                        title = season.optString("title")
                        rights = Rights.newBuilder().apply {
                            canWatch = 1
                        }.build()
                    }.build()
                }.build()
            }.build()
        }
    }

    private fun VideoInfo.Builder.replaceUpos() {
        if (!replaceUpos) return
        val newStreamList = streamListList.map {
            it.toBuilder().apply { replaceStreamUpos() }.build()
        }
        val newDashAudio = dashAudioList.map {
            it.toBuilder().apply { replaceDashItemUpos() }.build()
        }
        clearStreamList()
        clearDashAudio()
        addAllStreamList(newStreamList)
        addAllDashAudio(newDashAudio)
    }

    private fun Stream.Builder.replaceStreamUpos() {
        if (hasDashVideo()) {
            dashVideo = dashVideo.toBuilder().apply {
                if (baseUrl.isEmpty()) return@apply
                val (newBaseUrl, newBackupUrls) = replaceUpos(baseUrl, backupUrlList)
                baseUrl = newBaseUrl
                clearBackupUrl()
                addAllBackupUrl(newBackupUrls)
            }.build()
        }
    }

    private fun DashItem.Builder.replaceDashItemUpos() {
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
