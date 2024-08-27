package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.forEachIndexedReversed
import com.bapis.bilibili.app.viewunite.v1.ViewProgressReply
import com.bapis.bilibili.app.viewunite.v1.ViewProgressReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewProgressUnite : MossHook<ViewProgressReq, ViewProgressReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is ViewProgressReq
    }

    override fun hookAfter(
        req: ViewProgressReq,
        reply: ViewProgressReply?,
        error: MossException?
    ): ViewProgressReply? {
        if (reply != null) {
            val videoPopups = Settings.RemoveVideoPopups()
            if (videoPopups.isNotEmpty()) {
                if (videoPopups.contains("attention"))
                    reply.dm.clearAttention()
                if (videoPopups.contains("other")) {
                    reply.dm.clearCards()
                    reply.videoGuide.clearContractCard()
                }
                val commands = arrayOf("#VOTE#", "#ATTENTION#", "#GRADE#", "#GRADESUMMARY#", "#LINK#")
                reply.dm.commandDmsList.forEachIndexedReversed { index, dm ->
                    if (videoPopups.contains("vote") && dm.command == "#VOTE#")
                        reply.dm.removeCommandDms(index)
                    else if (videoPopups.contains("attention") && dm.command == "#ATTENTION#")
                        reply.dm.removeCommandDms(index)
                    else if (videoPopups.contains("grade") && dm.command == "#GRADE#")
                        reply.dm.removeCommandDms(index)
                    else if (videoPopups.contains("gradeSummary") && dm.command == "#GRADESUMMARY#")
                        reply.dm.removeCommandDms(index)
                    else if (videoPopups.contains("link") && dm.command == "#LINK#")
                        reply.dm.removeCommandDms(index)
                    else if (videoPopups.contains("other") && dm.command !in commands)
                        reply.dm.removeCommandDms(index)
                }
            }
            if (Settings.DisableSegmentedSection())
                reply.videoGuide.videoPoint.pointPermanent = false
        }
        return super.hookAfter(req, reply, error)
    }
}
