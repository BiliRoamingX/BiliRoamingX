package app.revanced.bilibili.patches.protobuf

import com.bapis.bilibili.main.community.reply.v1.EmptyPage
import com.bapis.bilibili.main.community.reply.v1.MainListReply
import com.bapis.bilibili.main.community.reply.v1.SubjectControl
import com.bapis.bilibili.main.community.reply.v1.TextStyle
import com.bilibili.lib.moss.api.MossResponseHandler

object CommentHook {
    @JvmStatic
    fun blockVideoComment(handler: MossResponseHandler<Any>) {
        val text = EmptyPage.Text().apply {
            raw = "评论区已由漫游屏蔽"
            style = TextStyle().apply {
                fontSize = 14
                textDayColor = "#FF61666D"
                textNightColor = "#FFA2A7AE"
            }
        }
        val reply = MainListReply().apply {
            subjectControl = SubjectControl().apply {
                emptyPage = EmptyPage().apply {
                    imageUrl =
                        "https://i0.hdslb.com/bfs/app-res/android/img_holder_forbid_style1.webp"
                    addTexts(text)
                }
            }
        }
        handler.onNext(reply)
    }

    @JvmStatic
    fun blockCommentGuide(reply: MainListReply) {
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
}
