package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.ListenHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.listener.v1.RcmdPlaylistReq
import com.bapis.bilibili.app.listener.v1.RcmdPlaylistResp
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ListenRcmdPlaylist : MossHook<RcmdPlaylistReq, RcmdPlaylistResp>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is RcmdPlaylistReq
    }

    override fun hookAfter(
        req: RcmdPlaylistReq,
        reply: RcmdPlaylistResp?,
        error: MossException?
    ): RcmdPlaylistResp? {
        if (Settings.UNLOCK_PLAY_LIMIT.boolean && reply != null)
            ListenHook.reconstructPlaylistResponse(reply.listList)
        return super.hookAfter(req, reply, error)
    }
}
