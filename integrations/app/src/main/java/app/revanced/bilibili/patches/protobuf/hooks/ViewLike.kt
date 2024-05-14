package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.view.v1.LikeReply
import com.bapis.bilibili.app.view.v1.LikeReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewLike : MossHook<LikeReq, LikeReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is LikeReq
    }

    override fun hookAfter(req: LikeReq, reply: LikeReply?, error: MossException?): LikeReply? {
        if (Settings.AutoLike())
            reply?.clearToast()
        return super.hookAfter(req, reply, error)
    }
}
