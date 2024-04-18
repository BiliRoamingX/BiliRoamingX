package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.utils.Versions
import com.bapis.bilibili.app.viewunite.v1.RelatesFeedReply
import com.bapis.bilibili.app.viewunite.v1.RelatesFeedReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewRelatesFeedUnite : MossHook<RelatesFeedReq, RelatesFeedReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return Versions.ge7_39_0() && req is RelatesFeedReq
    }

    override fun hookAfter(
        req: RelatesFeedReq,
        reply: RelatesFeedReply?,
        error: MossException?
    ): RelatesFeedReply? {
        reply?.let { PegasusPatch.filterRelatesFeedUnite(it) }
        return super.hookAfter(req, reply, error)
    }
}
