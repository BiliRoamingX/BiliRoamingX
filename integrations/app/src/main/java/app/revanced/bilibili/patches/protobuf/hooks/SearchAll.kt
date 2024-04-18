package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.polymer.app.search.v1.SearchAllRequest
import com.bapis.bilibili.polymer.app.search.v1.SearchAllResponse
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object SearchAll : MossHook<SearchAllRequest, SearchAllResponse>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is SearchAllRequest
    }

    override fun hookAfter(
        req: SearchAllRequest,
        reply: SearchAllResponse?,
        error: MossException?
    ): SearchAllResponse? {
        if ((Settings.SEARCH_BANGUMI.boolean
                    || Settings.SEARCH_MOVIE.boolean
                    || Settings.FILTER_SEARCH_TYPE.stringSet.isNotEmpty()) && reply != null
        ) BangumiSeasonHook.searchAllResponseHook(reply)
        return super.hookAfter(req, reply, error)
    }
}
