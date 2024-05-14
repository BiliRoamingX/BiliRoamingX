package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.seasonAreasCache
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Area
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.cachePrefs
import app.revanced.bilibili.utils.clearUnknownFields
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
            val seasonAreasCache = seasonAreasCache
            val sArea = seasonAreasCache[seasonId]
            val epArea = seasonAreasCache["ep$epId"]
            if (Area.Thailand.let { it == sArea || it == epArea } ||
                (cachePrefs.contains(seasonId) && Area.Thailand.value
                        == cachePrefs.getString(seasonId, null))
                || (cachePrefs.contains("ep$epId") && Area.Thailand.value
                        == cachePrefs.getString("ep$epId", null))
            ) reply.clearElems()
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
