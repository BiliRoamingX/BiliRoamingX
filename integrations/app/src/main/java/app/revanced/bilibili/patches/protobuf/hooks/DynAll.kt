package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.dynamic.v2.DynAllReply
import com.bapis.bilibili.app.dynamic.v2.DynAllReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DynAll : DynListBase<DynAllReq, DynAllReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DynAllReq
    }

    override fun hookAfter(
        req: DynAllReq,
        reply: DynAllReply?,
        error: MossException?
    ): DynAllReply? {
        if (Settings.DynRmTopicOfAll())
            reply?.clearTopicList()
        if (Settings.DynRmUpOfAll())
            reply?.clearUpList()
        reply?.dynamicList?.run {
            listList.getToRemoveIdxList().asReversed().forEach { removeList(it) }
        }
        return super.hookAfter(req, reply, error)
    }
}
