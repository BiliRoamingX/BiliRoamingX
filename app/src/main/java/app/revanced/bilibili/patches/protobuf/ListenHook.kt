package app.revanced.bilibili.patches.protobuf

import android.net.Uri
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.runCatchingOrNull
import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs
import com.bapis.bilibili.app.listener.v1.*
import com.bapis.bilibili.app.playurl.v1.CodeType
import com.bapis.bilibili.app.playurl.v1.PlayURLMoss
import com.bapis.bilibili.app.playurl.v1.PlayViewReq
import com.bapis.bilibili.app.view.v1.ViewMoss
import com.bapis.bilibili.app.view.v1.ViewReq
import kotlin.math.ceil

object ListenHook {
    @JvmStatic
    fun reconstructPlaylistResponse(items: List<DetailItem>) {
        val needPartItems = items.filter { it.playable != 0 }
            .onEach { it.playable = 0 }
            .filter { it.partsCount <= 0 }
            .ifEmpty { return }
        val viewReq = ViewReq().apply {
            fnval = Constants.MAX_FNVAL
            forceHost = 2
            fourk = 1
            playerArgs = PlayerArgs().apply {
                fnval = Constants.MAX_FNVAL.toLong()
                forceHost = 2
                qn = 64
            }
            qn = 64
        }
        val viewMoss = ViewMoss()
        for (item in needPartItems) {
            viewReq.aid = item.arc.oid
            val viewReply = runCatchingOrNull { viewMoss.view(viewReq) }
                ?: continue
            val parts = viewReply.pagesList.map { p ->
                BKArcPart().apply {
                    duration = p.page.duration
                    oid = item.arc.oid
                    page = p.page.page
                    subId = p.page.cid
                    title = p.page.part
                }
            }
            item.addAllParts(parts)
        }
    }

    @JvmStatic
    fun reconstructPlayUrlResponse(playURLReq: PlayURLReq, playURLResp: PlayURLResp): PlayURLResp {
        val playable = playURLResp.playable
        val playerInfo = playURLResp.playerInfoMap
        if (playable == 0 && playerInfo.isNotEmpty())
            return playURLResp
        val playViewReq = PlayViewReq().apply {
            aid = playURLReq.item.oid
            qn = playURLReq.playerArgs.qn
            fnval = playURLReq.playerArgs.fnval.toInt()
            forceHost = playURLReq.playerArgs.forceHost.toInt()
            fourk = true
            preferCodecType = CodeType.CODE265
        }
        val newPlayerInfo = linkedMapOf<Long, PlayInfo>()
        val playURLMoss = PlayURLMoss()
        for (subId in playURLReq.item.subIdList) {
            playViewReq.cid = subId
            val playViewReply = runCatchingOrNull { playURLMoss.playView(playViewReq) }
                ?: continue
            val videoInfo = playViewReply.getVideoInfo()
            var deadline = 0L
            val audios = videoInfo.dashAudioList.map { a ->
                if (deadline == 0L) {
                    Uri.parse(a.baseUrl).getQueryParameter("deadline")
                        ?.toLongOrNull()?.let { deadline = it }
                }
                DashItem().apply {
                    id = a.id
                    size = a.size
                    bandwidth = a.bandwidth
                    baseUrl = a.baseUrl
                    addAllBackupUrl(a.backupUrlList)
                }
            }
            val playDASH = PlayDASH().apply {
                addAllAudio(audios)
                duration = ceil(videoInfo.timelength / 1000.0).toInt()
                minBufferTime = 0.0f
            }
            val formats = videoInfo.streamListList.map { s ->
                val si = s.getStreamInfo()
                FormatDescription().apply {
                    description = si.description
                    displayDesc = si.displayDesc
                    format = si.format
                    quality = si.quality
                    superscript = si.superscript
                }
            }
            val playInfo = PlayInfo().apply {
                fnval = playURLReq.playerArgs.fnval.toInt()
                format = videoInfo.format
                length = videoInfo.timelength
                qn = videoInfo.quality
                videoCodecid = videoInfo.videoCodecid
                playDash = playDASH
                expireTime = deadline
                addAllFormats(formats)
            }
            newPlayerInfo[subId] = playInfo
        }
        return PlayURLResp().apply {
            item = playURLReq.item
            this.playable = 0
            mutablePlayerInfoMap.putAll(newPlayerInfo)
        }
    }
}
