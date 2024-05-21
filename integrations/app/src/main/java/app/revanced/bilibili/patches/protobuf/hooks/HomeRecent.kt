package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import com.bapis.bilibili.app.home.v1.RecentReq
import com.bapis.bilibili.app.home.v1.RecentRes
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object HomeRecent : MossHook<RecentReq, RecentRes>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return !Utils.isHd() && req is RecentReq
    }

    override fun hookAfter(req: RecentReq, reply: RecentRes?, error: MossException?): RecentRes? {
        if (reply != null && Settings.BlockHomeRecentUsed())
            reply.clearRecentUsed()
        return super.hookAfter(req, reply, error)
    }
}
