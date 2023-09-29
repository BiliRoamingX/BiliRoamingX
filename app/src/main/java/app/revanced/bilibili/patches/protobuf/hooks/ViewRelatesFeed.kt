package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.protobuf.MossHook
import com.bapis.bilibili.app.view.v1.RelatesFeedReply
import com.bapis.bilibili.app.view.v1.RelatesFeedReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewRelatesFeed : MossHook<RelatesFeedReq, RelatesFeedReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is RelatesFeedReq
    }

    override fun hookAfter(
        req: RelatesFeedReq,
        reply: RelatesFeedReply?,
        error: MossException?
    ): RelatesFeedReply? {
        reply?.let { PegasusPatch.filterRelatesFeed(it) }
        return super.hookAfter(req, reply, error)
    }
}
