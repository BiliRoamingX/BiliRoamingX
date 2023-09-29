package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.patches.protobuf.ViewUniteReplyHook
import app.revanced.bilibili.utils.Versions
import com.bapis.bilibili.app.viewunite.v1.ViewReply
import com.bapis.bilibili.app.viewunite.v1.ViewReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewUnite : MossHook<ViewReq, ViewReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return Versions.ge7_39_0() && req is ViewReq
    }

    override fun hookAfter(req: ViewReq, reply: ViewReply?, error: MossException?): ViewReply? {
        return ViewUniteReplyHook.hook(req, reply, error)
    }
}
