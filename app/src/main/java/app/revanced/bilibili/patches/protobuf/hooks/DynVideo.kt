package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.DynamicHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.dynamic.v2.DynVideoReply
import com.bapis.bilibili.app.dynamic.v2.DynVideoReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DynVideo : MossHook<DynVideoReq, DynVideoReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DynVideoReq
    }

    override fun hookAfter(
        req: DynVideoReq,
        reply: DynVideoReply?,
        error: MossException?
    ): DynVideoReply? {
        if (Settings.DYNAMIC_RM_UP_OF_VIDEO.boolean)
            reply?.clearVideoUpList()
        if (Settings.DYNAMIC_FILTER_APPLY_TO_VIDEO.boolean)
            reply?.dynamicList?.let {
                DynamicHook.filterDynamicForVideo(it)
            }
        return super.hookAfter(req, reply, error)
    }
}
