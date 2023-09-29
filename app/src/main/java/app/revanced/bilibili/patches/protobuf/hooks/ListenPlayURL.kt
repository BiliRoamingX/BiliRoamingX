package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.ListenHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.listener.v1.PlayURLReq
import com.bapis.bilibili.app.listener.v1.PlayURLResp
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ListenPlayURL : MossHook<PlayURLReq, PlayURLResp>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayURLReq
    }

    override fun hookAfter(
        req: PlayURLReq,
        reply: PlayURLResp?,
        error: MossException?
    ): PlayURLResp? {
        if (Settings.UNLOCK_PLAY_LIMIT.boolean && reply != null)
            ListenHook.reconstructPlayUrlResponse(req, reply)
        return super.hookAfter(req, reply, error)
    }
}
