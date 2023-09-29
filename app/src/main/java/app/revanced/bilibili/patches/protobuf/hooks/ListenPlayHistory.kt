package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.ListenHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.listener.v1.PlayHistoryReq
import com.bapis.bilibili.app.listener.v1.PlayHistoryResp
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ListenPlayHistory : MossHook<PlayHistoryReq, PlayHistoryResp>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayHistoryReq
    }

    override fun hookAfter(
        req: PlayHistoryReq,
        reply: PlayHistoryResp?,
        error: MossException?
    ): PlayHistoryResp? {
        if (Settings.UNLOCK_PLAY_LIMIT.boolean && reply != null)
            ListenHook.reconstructPlaylistResponse(reply.listList)
        return super.hookAfter(req, reply, error)
    }
}
