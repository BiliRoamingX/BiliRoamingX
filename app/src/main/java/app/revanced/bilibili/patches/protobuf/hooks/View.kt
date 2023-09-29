package app.revanced.bilibili.patches.protobuf.hooks

import android.util.Pair
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.patches.protobuf.ViewUniteReplyHook
import app.revanced.bilibili.settings.Settings
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
            AutoLikePatch.detail = Pair.create(reply.arc.aid, reply.reqUser.like)
            ApplicationDelegate.getTopActivity()?.let {
                ViewUniteReplyHook.viewMap[it.hashCode()] = reply
            }
            if (Settings.REMOVE_ELEC_BUTTON.boolean)
                reply.reqUser.clearElecPlusBtn()
            if (Settings.UNLOCK_PLAY_LIMIT.boolean)
                reply.config.showListenButton = true
            if (Settings.BLOCK_LIVE_ORDER.boolean)
                reply.clearLiveOrderInfo()
            if (Settings.BLOCK_COMMENT_GUIDE.boolean) {
                reply.likeCustom.clearLikeComment()
                reply.replyPreface.clearBadgeType()
            }
            PegasusPatch.filterViewRelates(reply)
        }
        return super.hookAfter(req, reply, error)
    }
}
