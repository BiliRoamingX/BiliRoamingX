package app.revanced.bilibili.patches.protobuf

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getPlayUrl
import app.revanced.bilibili.api.CustomServerException
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
import com.bapis.bilibili.playershared.*
import com.bapis.bilibili.playershared.CodeType
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
        1, // FILPCONF
        2, // CASTCONF
        3, // FEEDBACK
        4, // SUBTITLE
        5, // PLAYBACKRATE
        6, // TIMEUP
        7, // PLAYBACKMODE
        8, // SCALEMODE
        9, // BACKGROUNDPLAY
        10, // LIKE
        12, // COIN
        14, // SHARE
        15, // SCREENSHOT
        16, // LOCKSCREEN
        17, // RECOMMEND
        18, // PLAYBACKSPEED
        19, // DEFINITION
        20, // SELECTIONS
        21, // NEXT
        22, // EDITDM
        23, // SMALLWINDOW
        25, // OUTERDM
        26, // INNERDM
        29, // COLORFILTER
        34, // RECORDSCREEN
    )

    private var isDownloadPGC = false
    private var isDownloadUnite = false

    @JvmStatic
    fun hookPlayViewPGCBefore(req: PlayViewReq) {
        if (!Settings.UNLOCK_AREA_LIMIT.boolean) return
        isDownloadPGC = Settings.ALLOW_DOWNLOAD.boolean && req.download >= 1
        if (isDownloadPGC) {
            PlayViewReqEx.setFnval(req, Constants.MAX_FNVAL)
            PlayViewReqEx.setFourk(req, true)
            PlayViewReqEx.setDownload(req, 0)
        }
    }

    @JvmStatic
    fun hookPlayViewUniteBefore(req: PlayViewUniteReq) {
        if (!Settings.UNLOCK_AREA_LIMIT.boolean) return
        isDownloadUnite = Settings.ALLOW_DOWNLOAD.boolean && req.vod.download >= 1
        if (isDownloadUnite) {
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
        if (!Settings.UNLOCK_AREA_LIMIT.boolean) {
            if (error != null) throw error
            else return reply
        }
        if (error is NetworkException)
            throw error
        val response = reply ?: PlayViewReply.newBuilder().build()
        if (needProxy(response)) {
            return try {
                val content = getPlayUrl(reconstructQuery(req, response))
                    ?: throw CustomServerException(mapOf("未知错误" to "请检查哔哩漫游设置中解析服务器设置。"))
                reconstructResponse(req, response, content, isDownloadPGC)
            } catch (e: CustomServerException) {
                showPlayerError(response, "请求解析中服务器发生错误(点此查看更多)\n${e.message}")
            }
        }
        return response
    }

    @JvmStatic
    fun hookPlayViewUniteAfter(
        req: PlayViewUniteReq,
        reply: PlayViewUniteReply?,
        error: MossException?
    ): PlayViewUniteReply? {
        if (!Settings.UNLOCK_AREA_LIMIT.boolean) {
            if (error != null) throw error
            else return reply
        }
        if (error is NetworkException)
            throw error
        val response = reply ?: PlayViewUniteReply.newBuilder().build()
        val supplementAny = response.supplement
        val typeUrl = supplementAny.typeUrl
        // Only handle pgc video
        if (reply != null && typeUrl != PGC_ANY_MODEL_TYPE_URL)
            return reply
        val extraContent = req.extraContentMap
        val seasonId = extraContent.getOrDefault("season_id", "0")
        val reqEpId = extraContent.getOrDefault("ep_id", "0").toLong()
        if (seasonId == "0" && reqEpId == 0L)
            return reply
        val supplement = PlayViewReply.parseFrom(supplementAny.value.toByteArray())
        if (needProxyUnite(response, supplement)) {
            return try {
                val content = getPlayUrl(reconstructQueryUnite(req, supplement))
                    ?: throw CustomServerException(mapOf("未知错误" to "请检查哔哩漫游设置中解析服务器设置。"))
                reconstructResponseUnite(req, response, supplement, content, isDownloadUnite)
            } catch (e: CustomServerException) {
                showPlayerErrorUnite(
                    response, supplement, "请求解析中服务器发生错误(点此查看更多)\n${e.message}"
                )
            }
        }
        return response
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

    private fun reconstructQuery(req: PlayViewReq, resp: PlayViewReply): String? {
        val episodeInfo = resp.business.episodeInfo
        return Uri.Builder().run {
            appendQueryParameter("ep_id", req.epId.let {
                if (it != 0L) it else episodeInfo.epId
            }.toString())
            appendQueryParameter("cid", req.cid.let {
                if (it != 0L) it else episodeInfo.cid
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
    ): String? {
        val episodeInfo = supplement.business.episodeInfo
        return Uri.Builder().run {
            appendQueryParameter("ep_id", req.extraContentMap["ep_id"].let {
                if (!it.isNullOrEmpty() && it != "0") it.toLong() else episodeInfo.epId
            }.toString())
            appendQueryParameter("cid", req.vod.cid.let {
                if (it != 0L) it else episodeInfo.cid
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
        }.build()
    } ?: response

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
        isDownload: Boolean
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
            fixBusinessProto(jsonContent)
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

    private fun reconstructResponseUnite(
        req: PlayViewUniteReq,
        response: PlayViewUniteReply,
        supplement: PlayViewReply,
        content: String,
        isDownload: Boolean,
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
            val newSupplement = supplement.toBuilder().apply {
                fixBusinessProto(jsonContent)
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
