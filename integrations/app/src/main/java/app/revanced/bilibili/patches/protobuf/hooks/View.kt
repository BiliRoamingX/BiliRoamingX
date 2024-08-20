package app.revanced.bilibili.patches.protobuf.hooks

import android.util.Pair
import app.revanced.bilibili.meta.VideoInfo
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.patches.BLRoutePatch
import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.runCatchingOrNull
import app.revanced.bilibili.utils.toJSONObject
import com.bapis.bilibili.app.view.v1.PlayerIcon
import com.bapis.bilibili.app.view.v1.ViewReply
import com.bapis.bilibili.app.view.v1.ViewReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object View : MossHook<ViewReq, ViewReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is ViewReq
    }

    override fun hookAfter(req: ViewReq, reply: ViewReply?, error: MossException?): ViewReply? {
        if (reply != null) {
            VideoInfoHolder.updateCurrent { videoInfo ->
                videoInfo?.apply { view = reply } ?: VideoInfo(0, reply)
            }
            AutoLikePatch.detail = Pair.create(reply.arc.aid, reply.reqUser.like)
            if (Settings.RemoveChargeButton())
                reply.reqUser.clearElecPlusBtn()
            if (Settings.UnlockPlayLimit())
                reply.config.showListenButton = true
            if (Settings.BlockLiveOrder())
                reply.clearLiveOrderInfo()
            if (Settings.BlockCommentGuide()) {
                reply.likeCustom.clearLikeComment()
                reply.replyPreface.clearBadgeType()
            }
            if (Settings.BlockVideoComment())
                reply.arc.stat.reply = 0
            if (Settings.DisableStoryFull())
                reply.config.arcLandscapeStory = false
            if (Settings.ReplaceStoryVideo()) {
                reply.config.playStory = false
                reply.config.arcPlayStory = false
            }
            if (reply.playerIcon == PlayerIcon.getDefaultInstance() && Settings.SkinJson().isNotEmpty()) {
                val playIcon = Settings.SkinJson().runCatchingOrNull {
                    toJSONObject()
                }?.optJSONObject("play_icon")
                if (playIcon != null) {
                    reply.playerIcon = PlayerIcon().apply {
                        dragLeftPng = playIcon.optString("drag_left_png")
                        dragRightPng = playIcon.optString("drag_right_png")
                        middlePng = playIcon.optString("middle_png")
                    }
                }
            }
            PegasusPatch.filterViewRelates(reply)
            BLRoutePatch.removePayloadIfNeeded(reply.relatesList)
        }
        return super.hookAfter(req, reply, error)
    }
}
