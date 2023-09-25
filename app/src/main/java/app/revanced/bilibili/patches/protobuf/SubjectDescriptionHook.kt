package app.revanced.bilibili.patches.protobuf

import com.bapis.bilibili.main.community.reply.v2.EmptyPage
import com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply
import com.bapis.bilibili.main.community.reply.v2.TextStyle

object SubjectDescriptionHook {

    @JvmStatic
    fun blockCommentGuide(reply: SubjectDescriptionReply) {
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
}
