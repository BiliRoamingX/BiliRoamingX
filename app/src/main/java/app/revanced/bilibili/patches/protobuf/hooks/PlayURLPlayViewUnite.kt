package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.meta.VideoInfo
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.protobuf.BangumiPlayUrlHook
import app.revanced.bilibili.patches.protobuf.MossHook
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object PlayURLPlayViewUnite : MossHook<PlayViewUniteReq, PlayViewUniteReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayViewUniteReq
    }

    override fun hookBefore(req: PlayViewUniteReq): Any? {
        BangumiPlayUrlHook.hookPlayViewUniteBefore(req)
        return null
    }

    override fun hookAfter(
        req: PlayViewUniteReq,
        reply: PlayViewUniteReply?,
        error: MossException?
    ): PlayViewUniteReply? {
        val newReply = BangumiPlayUrlHook.hookPlayViewUniteAfter(req, reply, error)
        if (newReply != null && !BangumiPlayUrlHook.isDownloadUnite) {
            val cid = newReply.playArc.cid
            VideoInfoHolder.updateCurrent { videoInfo ->
                videoInfo?.apply { this.cid = cid } ?: VideoInfo(cid, null)
            }
        }
        return newReply
    }
}
