package app.revanced.bilibili.patches.protobuf.hooks

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
        reply?.let { modifyTabs(it) }
        return super.hookAfter(req, reply, error)
    }

    private fun modifyTabs(reply: DynTabReply) {
        if (Settings.DynForceOldTabStyle()
            && reply.dynTabList.none { it.anchor == "video" }
            && reply.screenTabList.map { it.name }.containsAll(listOf("all", "video"))
        ) {
            reply.clearScreenTab()
            reply.addDynTab(0, com.bapis.bilibili.app.dynamic.v2.DynTab().apply {
                anchor = "video"
                title = "视频"
                uri = "bilibili://following/index/8"
            })
        }
        if (Settings.DynPurifyCity() || Settings.DynPurifyCampus()) {
            val idxList = mutableListOf<Int>()
            reply.dynTabList.withIndex().forEach { (index, tab) ->
                if (Settings.DynPurifyCity() && tab.cityId != 0L
                    || Settings.DynPurifyCampus() && tab.anchor == "campus"
                ) idxList.add(index)
            }
            idxList.asReversed().forEach { reply.removeDynTab(it) }
        }
        if (Settings.DynPreferVideoTab()) {
            val screenTabList = reply.screenTabList
            if (screenTabList.any { it.name == "video" })
                screenTabList.forEach { it.defaultTab = it.name == "video" }
        }
    }
}
