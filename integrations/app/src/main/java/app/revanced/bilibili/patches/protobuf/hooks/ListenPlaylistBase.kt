package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.runCatchingOrNull
import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs
import com.bapis.bilibili.app.listener.v1.BKArcPart
import com.bapis.bilibili.app.listener.v1.DetailItem
import com.bapis.bilibili.app.view.v1.ViewMoss
import com.bapis.bilibili.app.view.v1.ViewReq
import com.google.protobuf.GeneratedMessageLite

abstract class ListenPlaylistBase<out Req : GeneratedMessageLite<*, *>, out Resp : GeneratedMessageLite<*, *>> :
    MossHook<Req, Resp>() {
    protected fun reconstruct(items: List<DetailItem>) {
        val needPartItems = items.filter { it.playable != 0 }
            .onEach { it.playable = 0 }
            .filter { it.partsCount <= 0 }
            .ifEmpty { return }
        val viewReq = ViewReq().apply {
            fnval = Constants.MAX_FNVAL
            forceHost = 2
            fourk = 1
            playerArgs = PlayerArgs().apply {
                fnval = Constants.MAX_FNVAL.toLong()
                forceHost = 2
                qn = 64
            }
            qn = 64
        }
        val viewMoss = ViewMoss()
        for (item in needPartItems) {
            viewReq.aid = item.arc.oid
            val viewReply = runCatchingOrNull { viewMoss.view(viewReq) }
                ?: continue
            val parts = viewReply.pagesList.map { p ->
                BKArcPart().apply {
                    duration = p.page.duration
                    oid = item.arc.oid
                    page = p.page.page
                    subId = p.page.cid
                    title = p.page.part
                }
            }
            item.addAllParts(parts)
        }
    }
}
