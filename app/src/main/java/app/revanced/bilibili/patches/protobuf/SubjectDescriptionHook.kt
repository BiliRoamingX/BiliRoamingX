package app.revanced.bilibili.patches.protobuf

import com.bapis.bilibili.main.community.reply.v2.EmptyPage
import com.bapis.bilibili.main.community.reply.v2.EmptyPageEx
import com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply
import com.bapis.bilibili.main.community.reply.v2.TextStyle

object SubjectDescriptionHook {

    @JvmStatic
    fun blockCommentGuide(reply: SubjectDescriptionReply) {
        val emptyPage = reply.emptyPage
        EmptyPageEx.clearLeftButton(emptyPage)
        EmptyPageEx.clearRightButton(emptyPage)
        if (emptyPage.textsList.size > 1) {
            EmptyPageEx.clearTexts(emptyPage)
            val textStyle = TextStyle.newBuilder()
                .setFontSize(14)
                .setTextDayColor("#FF61666D")
                .setTextNightColor("#FFA2A7AE")
                .build()
            val text = EmptyPage.Text.newBuilder()
                .setRaw("还没有评论哦")
                .setStyle(textStyle)
                .build()
            EmptyPageEx.addTexts(emptyPage, text)
        }
    }
}
