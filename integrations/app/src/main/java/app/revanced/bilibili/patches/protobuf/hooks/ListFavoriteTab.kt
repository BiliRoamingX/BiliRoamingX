package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.polymer.list.FavoriteTabItem
import com.bapis.bilibili.polymer.list.FavoriteTabReply
import com.bapis.bilibili.polymer.list.FavoriteTabReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ListFavoriteTab : MossHook<FavoriteTabReq, FavoriteTabReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is FavoriteTabReq
    }

    override fun hookAfter(
        req: FavoriteTabReq,
        reply: FavoriteTabReply?,
        error: MossException?
    ): FavoriteTabReply? {
        if (reply != null && Settings.AddChannel()) {
            val channelUrl = "bilibili://main/favorite/channel"
            if (reply.itemsList.none { it.uri == channelUrl }) {
                reply.addItems(FavoriteTabItem().apply {
                    name = "频道"
                    type = "channel"
                    uri = channelUrl
                })
            }
        }
        return super.hookAfter(req, reply, error)
    }
}
