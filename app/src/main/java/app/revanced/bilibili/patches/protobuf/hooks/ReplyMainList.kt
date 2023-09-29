package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.main.community.reply.v1.*
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ReplyMainList : MossHook<MainListReq, MainListReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is MainListReq
    }

    override fun hookBefore(req: MainListReq): Any? {
        if (Settings.BLOCK_VIDEO_COMMENT.boolean && req.type == 1L) {
            val text = EmptyPage.Text().apply {
                raw = "评论区已由漫游屏蔽"
                style = TextStyle().apply {
                    fontSize = 14
                    textDayColor = "#FF61666D"
                    textNightColor = "#FFA2A7AE"
                }
            }
            return MainListReply().apply {
                subjectControl = SubjectControl().apply {
                    emptyPage = EmptyPage().apply {
                        imageUrl =
                            "https://i0.hdslb.com/bfs/app-res/android/img_holder_forbid_style1.webp"
                        addTexts(text)
                    }
                }
            }
        }
        return null
    }

    override fun hookAfter(
        req: MainListReq,
        reply: MainListReply?,
        error: MossException?
    ): MainListReply? {
        if (Settings.BLOCK_COMMENT_GUIDE.boolean && reply != null) {
            val subjectControl = reply.subjectControl
            subjectControl.clearEmptyBackgroundTextPlain()
            subjectControl.clearEmptyBackgroundTextHighlight()
            subjectControl.clearEmptyBackgroundUri()
            val emptyPage = subjectControl.emptyPage
            emptyPage.clearLeftButton()
            emptyPage.clearRightButton()
            val textsList = emptyPage.textsList
            if (textsList.size > 1) {
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
