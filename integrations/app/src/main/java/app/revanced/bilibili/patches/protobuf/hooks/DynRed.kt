package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.dynamic.v1.DynRedReply
import com.bapis.bilibili.app.dynamic.v1.DynRedReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DynRed : MossHook<DynRedReq, DynRedReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DynRedReq
    }

    override fun hookAfter(
        req: DynRedReq,
        reply: DynRedReply?,
        error: MossException?
    ): DynRedReply? {
        if (Settings.DynPreferVideoTab())
            reply?.defaultTab = "video"
        return super.hookAfter(req, reply, error)
    }
}
