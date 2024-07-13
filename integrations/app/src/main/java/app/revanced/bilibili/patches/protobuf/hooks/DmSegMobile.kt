package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.clearUnknownFields
import app.revanced.bilibili.utils.maybeThailand
import com.bapis.bilibili.community.service.dm.v1.DmColorfulType
import com.bapis.bilibili.community.service.dm.v1.DmSegMobileReply
import com.bapis.bilibili.community.service.dm.v1.DmSegMobileReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DmSegMobile : MossHook<DmSegMobileReq, DmSegMobileReply>() {

    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DmSegMobileReq
    }

    override fun hookAfter(
        req: DmSegMobileReq,
        reply: DmSegMobileReply?,
        error: MossException?
    ): DmSegMobileReply? {
        if (reply != null && Settings.UnlockAreaLimit() && Settings.ThailandServer().isNotEmpty()) {
            val epId = req.oid.toString()
            val seasonId = req.pid.toString()
            if (maybeThailand(seasonId, epId))
                reply.clearElems()
        }
        if (reply != null && Settings.NoColorfulDanmaku()) {
            reply.elemsList.forEach {
                if (!Utils.isHd())
                    it.colorful = DmColorfulType.NoneType
                else {
                    it.clearUnknownFields()
                }
            }
        }
        return super.hookAfter(req, reply, error)
    }
}
