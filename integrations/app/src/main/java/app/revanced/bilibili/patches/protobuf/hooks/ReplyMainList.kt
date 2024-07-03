package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.ArrayUtils
import app.revanced.bilibili.utils.BusinessException
import app.revanced.bilibili.utils.Utils
import com.bapis.bilibili.main.community.reply.v1.*
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ReplyMainList : ReplyListBase<MainListReq, MainListReply>() {

    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is MainListReq
    }

    override fun hookBefore(req: MainListReq): Any? {
        if (Settings.BlockVideoComment() && req.type == 1L)
            throw BusinessException(12061, "评论区已由漫游屏蔽")
        return null
    }

    override fun hookAfter(
        req: MainListReq,
        reply: MainListReply?,
        error: MossException?
    ): MainListReply? {
        if (Settings.BlockCommentGuide() && reply != null) {
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
        if (Settings.BlockCommentFeedback() && reply != null && reply.qoe.type == 3)
            reply.clearQoe()
        if (reply != null)
            filterReplies(reply)
        if (reply != null && !Utils.isHd() && Settings.UnlockGif())
            unlockGif(reply)
        return super.hookAfter(req, reply, error)
    }

    private fun unlockGif(reply: MainListReply) {
        reply.upTop.unlockGif()
        reply.adminTop.unlockGif()
        reply.voteTop.unlockGif()
        reply.topRepliesList.forEach { it.unlockGif() }
        reply.repliesList.forEach { it.unlockGif() }
    }

    private fun filterReplies(reply: MainListReply) {
        val onlyAt = Settings.BlockOnlyAtComment()
        val goods = Settings.BlockCommentGoods()
        val upLevel = Settings.BlockCommentUpLevel()
        val uidSet = Settings.BlockCommentUid()
        val uids = ArrayUtils.toLongArray(uidSet)
        val upRegexMode = Settings.BlockCommentUpRegexMode()
        val ups = Settings.BlockCommentUp()
        val upRegexes = upRegexes()
        val contentRegexMode = Settings.BlockCommentContentRegexMode()
        val contents = Settings.BlockCommentContent()
        val contentRegexes = contentRegexes()

        if (!onlyAt && !goods && upLevel == 0 && uids.isEmpty() && ups.isEmpty() && contents.isEmpty())
            return

        fun ReplyInfo.needRemove() = needRemove(
            onlyAt,
            goods,
            upLevel,
            uids,
            upRegexMode,
            ups,
            upRegexes,
            contentRegexMode,
            contents,
            contentRegexes
        )

        fun List<ReplyInfo>.toRemoveReversedIndexes() =
            withIndex().filter { (_, r) -> r.needRemove() }.map { it.index }.asReversed()

        if (reply.upTop.needRemove()) reply.clearUpTop()
        else reply.upTop.repliesList.toRemoveReversedIndexes()
            .forEach { reply.upTop.removeReplies(it) }

        if (reply.adminTop.needRemove()) reply.clearAdminTop()
        else reply.adminTop.repliesList.toRemoveReversedIndexes()
            .forEach { reply.adminTop.removeReplies(it) }

        if (reply.voteTop.needRemove()) reply.clearVoteTop()
        else reply.voteTop.repliesList.toRemoveReversedIndexes()
            .forEach { reply.voteTop.removeReplies(it) }

        reply.topRepliesList.toRemoveReversedIndexes().forEach { reply.removeTopReplies(it) }
        reply.topRepliesList.forEach { r ->
            r.repliesList.toRemoveReversedIndexes().forEach { r.removeReplies(it) }
        }

        reply.repliesList.toRemoveReversedIndexes().forEach { reply.removeReplies(it) }
        reply.repliesList.forEach { r ->
            r.repliesList.toRemoveReversedIndexes().forEach { r.removeReplies(it) }
        }
    }
}
