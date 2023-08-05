package app.revanced.bilibili.patches.protobuf

import android.util.Pair
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.viewunite.common.ModuleEx
import com.bapis.bilibili.app.viewunite.common.ModuleType
import com.bapis.bilibili.app.viewunite.v1.ReplyStyleEx
import com.bapis.bilibili.app.viewunite.v1.TabType
import com.bapis.bilibili.app.viewunite.v1.ViewReply

object ViewUniteReplyHook {
    @JvmStatic
    fun hook(viewReply: ViewReply): ViewReply {
        val aid = viewReply.arc.aid
        val like = viewReply.reqUser.like
        AutoLikePatch.detail = Pair.create(aid, like)
        if (Settings.BLOCK_COMMENT_GUIDE.boolean) {
            blockCommentGuide(viewReply)
        }
        return viewReply
    }

    private fun blockCommentGuide(viewReply: ViewReply) {
        viewReply.tab.tabModuleList.forEach { tabModule ->
            val tabType = tabModule.tabType
            if (tabType == TabType.TAB_INTRODUCTION) {
                for (module in tabModule.introduction.modulesList) {
                    if (module.type == ModuleType.LIKE_COMMENT) {
                        ModuleEx.clearLikeComment(module)
                        break
                    }
                }
            } else if (tabType == TabType.TAB_REPLY) {
                ReplyStyleEx.clearBadgeType(tabModule.reply.replyStyle)
            }
        }
    }
}
