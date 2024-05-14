package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.view.v1.ContinuousPlayReply
import com.bapis.bilibili.app.view.v1.ContinuousPlayReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewContinuousPlay : MossHook<ContinuousPlayReq, ContinuousPlayReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is ContinuousPlayReq
    }

    override fun hookAfter(
        req: ContinuousPlayReq,
        reply: ContinuousPlayReply?,
        error: MossException?
    ): ContinuousPlayReply? {
        if (reply != null && Settings.DisableAutoNextPlay())
            reply.clearRelates()
        return super.hookAfter(req, reply, error)
    }
}
