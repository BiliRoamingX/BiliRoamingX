package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.dynamic.v2.DynVideoReply
import com.bapis.bilibili.app.dynamic.v2.DynVideoReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DynVideo : DynListBase<DynVideoReq, DynVideoReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DynVideoReq
    }

    override fun hookAfter(
        req: DynVideoReq,
        reply: DynVideoReply?,
        error: MossException?
    ): DynVideoReply? {
        if (Settings.DynRmUpOfVideo())
            reply?.clearVideoUpList()
        if (Settings.DynFilterApplyTopVideo())
            reply?.dynamicList?.run {
                listList.getToRemoveIdxList().asReversed().forEach { removeList(it) }
            }
        return super.hookAfter(req, reply, error)
    }
}
