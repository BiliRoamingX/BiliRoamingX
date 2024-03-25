package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.TrialQualityPatch
import app.revanced.bilibili.patches.VideoQualityPatch
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import com.bapis.bilibili.app.playurl.v1.PlayAbilityConf
import com.bapis.bilibili.app.playurl.v1.PlayViewReply
import com.bapis.bilibili.app.playurl.v1.PlayViewReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object PlayURLPlayViewUGC : MossHook<PlayViewReq, PlayViewReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayViewReq
    }

    override fun hookBefore(req: PlayViewReq): Any? {
        VideoQualityPatch.unlockLimit(req)
        return null
    }

    override fun hookAfter(
        req: PlayViewReq,
        reply: PlayViewReply?,
        error: MossException?
    ): PlayViewReply? {
        if (reply != null) {
            if (Settings.REMEMBER_LOSSLESS_SETTING.boolean)
                reply.playConf.takeIf(PlayAbilityConf::hasLossLessConf)?.run {
                    lossLessConf.confValue.switchVal = Settings.LOSSLESS_ENABLED.boolean
                }
            if (Settings.UNLOCK_PLAY_LIMIT.boolean) {
                if (reply.playArc.backgroundPlayConf.disabled) {
                    reply.playConf.takeIf(PlayAbilityConf::hasBackgroundPlayConf)?.run {
                        backgroundPlayConf.confValue.switchVal = Settings.BG_PLAYING_ENABLED.boolean
                    }
                }
                reply.playArc.run {
                    arrayOf(castConf, backgroundPlayConf, smallWindowConf).forEach {
                        it.isSupport = true
                        it.disabled = false
                    }
                }
            }
            if (req.download < 1 && !Utils.isEffectiveVip()
                && Settings.TRIAL_VIP_QUALITY.boolean
            ) TrialQualityPatch.makeVipFree(reply)
        }
        return super.hookAfter(req, reply, error)
    }
}
