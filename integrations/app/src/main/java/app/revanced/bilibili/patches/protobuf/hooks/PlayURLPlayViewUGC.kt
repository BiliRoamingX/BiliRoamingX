package app.revanced.bilibili.patches.protobuf.hooks

import android.content.pm.ActivityInfo
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.meta.VideoInfo
import app.revanced.bilibili.patches.TrialQualityPatch
import app.revanced.bilibili.patches.VideoQualityPatch
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import com.bapis.bilibili.app.playurl.v1.PlayAbilityConf
import com.bapis.bilibili.app.playurl.v1.PlayViewReply
import com.bapis.bilibili.app.playurl.v1.PlayViewReq
import com.bilibili.lib.moss.api.MossException
import com.bilibili.video.videodetail.VideoDetailsActivity
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
            if (req.download == 0) {
                VideoInfoHolder.updateCurrent { videoInfo ->
                    videoInfo?.apply { cid = req.cid } ?: VideoInfo(req.cid, null)
                }
            }
            if (Settings.RememberLosslessSetting())
                reply.playConf.takeIf(PlayAbilityConf::hasLossLessConf)?.run {
                    lossLessConf.confValue.switchVal = Settings.LosslessEnabled()
                }
            if (Settings.UnlockPlayLimit()) {
                if (reply.playArc.backgroundPlayConf.disabled) {
                    reply.playConf.takeIf(PlayAbilityConf::hasBackgroundPlayConf)?.run {
                        backgroundPlayConf.confValue.switchVal = Settings.BgPlayingEnabled()
                    }
                }
                reply.playArc.run {
                    arrayOf(castConf, backgroundPlayConf, smallWindowConf).forEach {
                        it.isSupport = true
                        it.disabled = false
                    }
                }
            }
            if (req.download < 1 && !Accounts.isEffectiveVip
                && Settings.TrialVipQuality()
            ) TrialQualityPatch.makeVipFree(reply)
            if (Utils.isHd() && Settings.NotLockOrientation()) {
                val dashVideo = reply.videoInfo.streamListList.firstNotNullOfOrNull {
                    if (it.hasDashVideo()) it.dashVideo else null
                }
                if (dashVideo != null) {
                    val width = dashVideo.width
                    val height = dashVideo.height
                    Utils.runOnMainThread {
                        val topActivity = ApplicationDelegate.getTopActivity()
                        if (topActivity is VideoDetailsActivity) {
                            val orientation = if (height > width) {
                                ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
                            } else {
                                ActivityInfo.SCREEN_ORIENTATION_BEHIND
                            }
                            topActivity.requestedOrientation = orientation
                        }
                    }
                }
            }
        }
        return super.hookAfter(req, reply, error)
    }
}
