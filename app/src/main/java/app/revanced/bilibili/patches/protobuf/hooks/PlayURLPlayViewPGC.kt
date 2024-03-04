package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.BangumiPlayUrlHook
import app.revanced.bilibili.patches.protobuf.MossHook
import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply
import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object PlayURLPlayViewPGC : MossHook<PlayViewReq, PlayViewReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayViewReq
    }

    override fun hookBefore(req: PlayViewReq): Any? {
        BangumiPlayUrlHook.hookPlayViewPGCBefore(req)
        return null
    }

    override fun hookAfter(
        req: PlayViewReq,
        reply: PlayViewReply?,
        error: MossException?
    ) = BangumiPlayUrlHook.hookPlayViewPGCAfter(req, reply, error)
}
