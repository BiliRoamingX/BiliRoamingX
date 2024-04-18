package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.protobuf.MossHook
import com.bapis.bilibili.app.show.popular.v1.PopularReply
import com.bapis.bilibili.app.show.popular.v1.PopularResultReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object Popular : MossHook<PopularResultReq, PopularReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PopularResultReq
    }

    override fun hookAfter(
        req: PopularResultReq,
        reply: PopularReply?,
        error: MossException?
    ): PopularReply? {
        if (reply != null)
            PegasusPatch.filterPopular(reply)
        return super.hookAfter(req, reply, error)
    }
}
