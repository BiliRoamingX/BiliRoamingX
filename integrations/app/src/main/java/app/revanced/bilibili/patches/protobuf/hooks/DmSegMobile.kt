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
    private val timePointRegex by lazy { Regex("""(?:(?<hours>\d{1,4})[:：])?(?<minutes>\d{1,2})[:：](?<seconds>\d{1,2})""") }

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
        val noColorfulDanmaku = Settings.NoColorfulDanmaku()
        val timeAirborne = Settings.TimeAirborne()
        reply?.elemsList?.forEach { elem ->
            if (noColorfulDanmaku) {
                if (!Utils.isHd())
                    elem.colorful = DmColorfulType.NoneType
                else {
                    elem.clearUnknownFields()
                }
            }
            if (timeAirborne && !elem.action.startsWith("airborne:")) {
                timePointRegex.find(elem.content)?.let {
                    val (_, hours, minutes, seconds) = it.groupValues
                    val totalSeconds = seconds.toInt() + minutes.toInt() * 60 + hours.ifEmpty { "0" }
                        .toInt() * 60 * 60
                    elem.action = "airborne:${totalSeconds * 1000}"
                }
            }
        }
        return super.hookAfter(req, reply, error)
    }
}
