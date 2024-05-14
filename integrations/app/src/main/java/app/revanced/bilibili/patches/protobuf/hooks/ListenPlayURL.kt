package app.revanced.bilibili.patches.protobuf.hooks

import android.net.Uri
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.runCatchingOrNull
import com.bapis.bilibili.app.listener.v1.*
import com.bapis.bilibili.app.playurl.v1.CodeType
import com.bapis.bilibili.app.playurl.v1.PlayURLMoss
import com.bapis.bilibili.app.playurl.v1.PlayViewReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite
import kotlin.math.ceil

object ListenPlayURL : MossHook<PlayURLReq, PlayURLResp>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayURLReq
    }

    override fun hookAfter(
        req: PlayURLReq,
        reply: PlayURLResp?,
        error: MossException?
    ): PlayURLResp? {
        if (Settings.UnlockPlayLimit() && reply != null)
            return reconstruct(req, reply)
        return super.hookAfter(req, reply, error)
    }

    private fun reconstruct(playURLReq: PlayURLReq, playURLResp: PlayURLResp): PlayURLResp {
        val playerInfo = playURLResp.playerInfoMap
        if (playURLResp.playable == 0 && playerInfo.isNotEmpty())
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
            playable = 0
            mutablePlayerInfoMap.putAll(newPlayerInfo)
        }
    }
}
