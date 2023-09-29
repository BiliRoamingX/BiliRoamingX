package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.DynamicHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.dynamic.v2.DynTabReply
import com.bapis.bilibili.app.dynamic.v2.DynTabReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DynTab : MossHook<DynTabReq, DynTabReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DynTabReq
    }

    override fun hookAfter(
        req: DynTabReq,
        reply: DynTabReply?,
        error: MossException?
    ): DynTabReply? {
        if (Settings.DYNAMIC_PURIFY_CITY.boolean || Settings.DYNAMIC_PURIFY_CAMPUS.boolean && reply != null)
            DynamicHook.modifyDynTabs(reply)
        return super.hookAfter(req, reply, error)
    }
}
