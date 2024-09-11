package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.runCatchingOrNull
import app.revanced.bilibili.utils.toJSONObject
import com.bapis.bilibili.app.dynamic.v1.CornerType
import com.bapis.bilibili.app.dynamic.v1.DynRedReply
import com.bapis.bilibili.app.dynamic.v1.DynRedReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DynRed : MossHook<DynRedReq, DynRedReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DynRedReq
    }

    override fun hookAfter(
        req: DynRedReq,
        reply: DynRedReply?,
        error: MossException?
    ): DynRedReply? {
        if (Settings.DynPreferVideoTab())
            reply?.defaultTab = "video"
        if (Settings.DynNoUpRecall() && reply != null) {
            reply.redStyle.apply {
                clearBgType()
                clearDisplayTime()
                clearUp()
                runCatchingOrNull {
                    if (cornerInfo.cornerType == CornerType.corner_type_animation)
                        clearCornerInfo()
                }
            }
            runCatchingOrNull {
                reply.tabRecallExtra.runCatchingOrNull { toJSONObject() }?.run {
                    put("tab_track_id", "")
                    put("tab_bg_type", 0)
                    put("display_time", 0)
                    put("corner_type", 0)
                    put("tab_face_oid", 0)
                    put("tab_face_oid_type", 0)
                    reply.tabRecallExtra = toString()
                }
                reply.clearBubbleInfo()
            }
        }
        return super.hookAfter(req, reply, error)
    }
}
