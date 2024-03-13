package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook
import app.revanced.bilibili.patches.protobuf.MossHook
import com.bapis.bilibili.polymer.app.search.v1.SearchByTypeRequest
import com.bapis.bilibili.polymer.app.search.v1.SearchByTypeResponse
import com.google.protobuf.GeneratedMessageLite

object SearchByType : MossHook<SearchByTypeRequest, SearchByTypeResponse>() {
    override val async: Boolean = true

    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is SearchByTypeRequest && BangumiSeasonHook.extraSearchHandleable(req.type)
    }

    override fun hookBefore(req: SearchByTypeRequest): Any {
        return BangumiSeasonHook.handleExtraSearch(req)
    }
}
