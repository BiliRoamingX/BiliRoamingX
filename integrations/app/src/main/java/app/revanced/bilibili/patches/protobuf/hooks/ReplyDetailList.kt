package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.ArrayUtils
import app.revanced.bilibili.utils.Utils
import com.bapis.bilibili.main.community.reply.v1.DetailListReply
import com.bapis.bilibili.main.community.reply.v1.DetailListReq
import com.bapis.bilibili.main.community.reply.v1.ReplyInfo
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ReplyDetailList : ReplyListBase<DetailListReq, DetailListReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DetailListReq
    }

    override fun hookAfter(
        req: DetailListReq,
        reply: DetailListReply?,
        error: MossException?
    ): DetailListReply? {
        if (reply != null)
            filterReply(reply)
        if (reply != null && !Utils.isHd() && Settings.UnlockGif())
            reply.root.unlockGif(scale = false)
        return super.hookAfter(req, reply, error)
    }

    private fun filterReply(reply: DetailListReply) {
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

        reply.root.repliesList.toRemoveReversedIndexes().forEach { reply.root.removeReplies(it) }
    }
}
