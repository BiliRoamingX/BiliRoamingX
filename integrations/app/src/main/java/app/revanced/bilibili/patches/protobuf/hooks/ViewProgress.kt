package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.forEachIndexedReversed
import com.bapis.bilibili.app.view.v1.ViewProgressReply
import com.bapis.bilibili.app.view.v1.ViewProgressReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ViewProgress : MossHook<ViewProgressReq, ViewProgressReply>() {
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
                    reply.videoGuide.clearAttention()
                val commands = arrayOf("#VOTE#", "#ATTENTION#", "#GRADE#", "#GRADESUMMARY#", "#LINK#")
                reply.videoGuide.commandDmsList.forEachIndexedReversed { index, dm ->
                    if (videoPopups.contains("vote") && dm.command == "#VOTE#")
                        reply.videoGuide.removeCommandDms(index)
                    else if (videoPopups.contains("attention") && dm.command == "#ATTENTION#")
                        reply.videoGuide.removeCommandDms(index)
                    else if (videoPopups.contains("grade") && dm.command == "#GRADE#")
                        reply.videoGuide.removeCommandDms(index)
                    else if (videoPopups.contains("gradeSummary") && dm.command == "#GRADESUMMARY#")
                        reply.videoGuide.removeCommandDms(index)
                    else if (videoPopups.contains("link") && dm.command == "#LINK#")
                        reply.videoGuide.removeCommandDms(index)
                    else if (videoPopups.contains("other") && dm.command !in commands)
                        reply.videoGuide.removeCommandDms(index)
                }
                if (videoPopups.contains("other")) {
                    reply.videoGuide.clearCardsSecond()
                    reply.videoGuide.clearContractCard()
                    reply.videoGuide.clearOperationCard()
                    reply.videoGuide.clearOperationCardNew()
                }
            }
            if (Settings.DisableSegmentedSection())
                reply.pointPermanent = false
        }
        return super.hookAfter(req, reply, error)
    }
}
