package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.viewunite.v1.ViewProgressReply
import com.bapis.bilibili.app.viewunite.v1.ViewProgressReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewProgressUnite : MossHook<ViewProgressReq, ViewProgressReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is ViewProgressReq
    }

    override fun hookAfter(
        req: ViewProgressReq,
        reply: ViewProgressReply?,
        error: MossException?
    ): ViewProgressReply? {
        if (reply != null) {
            if (Settings.RemoveCmdDms()) {
                reply.clearDm()
                reply.videoGuide.clearContractCard()
            }
            if (Settings.DisableSegmentedSection())
                reply.videoGuide.videoPoint.pointPermanent = false
        }
        return super.hookAfter(req, reply, error)
    }
}
