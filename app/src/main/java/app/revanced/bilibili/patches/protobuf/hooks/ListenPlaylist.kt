package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.ListenHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.listener.v1.PlaylistReq
import com.bapis.bilibili.app.listener.v1.PlaylistResp
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ListenPlaylist : MossHook<PlaylistReq, PlaylistResp>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlaylistReq
    }

    override fun hookAfter(
        req: PlaylistReq,
        reply: PlaylistResp?,
        error: MossException?
    ): PlaylistResp? {
        if (Settings.UNLOCK_PLAY_LIMIT.boolean && reply != null)
            ListenHook.reconstructPlaylistResponse(reply.listList)
        return super.hookAfter(req, reply, error)
    }
}
