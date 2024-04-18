package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.ArrayUtils
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
        return super.hookAfter(req, reply, error)
    }

    private fun filterReply(reply: DetailListReply) {
        val onlyAt = Settings.BLOCK_ONLY_AT_COMMENT.boolean
        val goods = Settings.BLOCK_COMMENT_GOODS.boolean
        val upLevel = Settings.BLOCK_COMMENT_UP_LEVEL.int
        val uidSet = Settings.BLOCK_COMMENT_UID.stringSet
        val uids = ArrayUtils.toLongArray(uidSet)
        val upRegexMode = Settings.BLOCK_COMMENT_UP_REGEX_MODE.boolean
        val ups = Settings.BLOCK_COMMENT_UP.stringSet
        val upRegexes = upRegexes()
        val contentRegexMode = Settings.BLOCK_COMMENT_CONTENT_REGEX_MODE.boolean
        val contents = Settings.BLOCK_COMMENT_CONTENT.stringSet
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
