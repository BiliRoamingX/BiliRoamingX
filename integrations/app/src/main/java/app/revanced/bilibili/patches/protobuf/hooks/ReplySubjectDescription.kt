package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.BusinessException
import app.revanced.bilibili.utils.Versions
import com.bapis.bilibili.main.community.reply.v2.EmptyPage
import com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply
import com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReq
import com.bapis.bilibili.main.community.reply.v2.TextStyle
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ReplySubjectDescription : MossHook<SubjectDescriptionReq, SubjectDescriptionReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return Versions.ge7_39_0() && req is SubjectDescriptionReq
    }

    override fun hookBefore(req: SubjectDescriptionReq): Any? {
        if (Settings.BlockVideoComment() && req.subjectId.type == 1L)
            throw BusinessException(12061, "评论区已由漫游屏蔽")
        return null
    }

    override fun hookAfter(
        req: SubjectDescriptionReq,
        reply: SubjectDescriptionReply?,
        error: MossException?
    ): SubjectDescriptionReply? {
        if (Settings.BlockCommentGuide() && reply != null) {
            val emptyPage = reply.emptyPage
            emptyPage.clearLeftButton()
            emptyPage.clearRightButton()
            if (emptyPage.textsList.size > 1) {
                emptyPage.clearTexts()
                val text = EmptyPage.Text().apply {
                    raw = "还没有评论哦"
                    style = TextStyle().apply {
                        fontSize = 14
                        textDayColor = "#FF61666D"
                        textNightColor = "#FFA2A7AE"
                    }
                }
                emptyPage.addTexts(text)
            }
        }
        return super.hookAfter(req, reply, error)
    }
}
