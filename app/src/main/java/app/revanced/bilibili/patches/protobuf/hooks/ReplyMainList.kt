package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.ArrayUtils
import com.bapis.bilibili.main.community.reply.v1.*
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ReplyMainList : MossHook<MainListReq, MainListReply>() {
    private val onlyAtRegex = Regex("^(@\\S+\\s?)+$")

    private var cachedUpSet = emptySet<String>()
    private var cachedUpRegexes = emptyList<Regex>()
    private var cachedContentSet = emptySet<String>()
    private var cachedContentRegexes = emptyList<Regex>()

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
        if (reply != null)
            filterReplies(reply)
        return super.hookAfter(req, reply, error)
    }

    private fun filterReplies(reply: MainListReply) {
        val onlyAt = Settings.BLOCK_ONLY_AT_COMMENT.boolean
        val goods = Settings.BLOCK_COMMENT_GOODS.boolean
        val uidSet = Settings.BLOCK_COMMENT_UID.stringSet
        val uids = ArrayUtils.toLongArray(uidSet)
        val upRegexMode = Settings.BLOCK_COMMENT_UP_REGEX_MODE.boolean
        val ups = Settings.BLOCK_COMMENT_UP.stringSet
        val upRegexes = if (upRegexMode && cachedUpSet == ups) {
            cachedUpRegexes
        } else if (upRegexMode) {
            cachedUpSet = HashSet(ups)
            ups.map { it.toRegex() }.also { cachedUpRegexes = it }
        } else listOf()
        val contentRegexMode = Settings.BLOCK_COMMENT_CONTENT_REGEX_MODE.boolean
        val contents = Settings.BLOCK_COMMENT_CONTENT.stringSet
        val contentRegexes = if (contentRegexMode && cachedContentSet == contents) {
            cachedContentRegexes
        } else if (contentRegexMode) {
            cachedContentSet = HashSet(contents)
            contents.map { it.toRegex() }.also { cachedContentRegexes = it }
        } else listOf()

        if (!onlyAt && !goods && uids.isEmpty() && ups.isEmpty() && contents.isEmpty())
            return

        if (reply.upTop.needRemove(
                onlyAt,
                goods,
                uids,
                upRegexMode,
                ups,
                upRegexes,
                contentRegexMode,
                contents,
                contentRegexes
            )
        ) reply.clearUpTop()
        if (reply.adminTop.needRemove(
                onlyAt,
                goods,
                uids,
                upRegexMode,
                ups,
                upRegexes,
                contentRegexMode,
                contents,
                contentRegexes
            )
        ) reply.clearAdminTop()
        if (reply.voteTop.needRemove(
                onlyAt,
                goods,
                uids,
                upRegexMode,
                ups,
                upRegexes,
                contentRegexMode,
                contents,
                contentRegexes
            )
        ) reply.clearVoteTop()

        reply.topRepliesList.withIndex().filter { (_, r) ->
            r.needRemove(
                onlyAt,
                goods,
                uids,
                upRegexMode,
                ups,
                upRegexes,
                contentRegexMode,
                contents,
                contentRegexes
            )
        }.map { it.index }.asReversed().forEach { reply.removeTopReplies(it) }
        reply.repliesList.withIndex().filter { (_, r) ->
            r.needRemove(
                onlyAt,
                goods,
                uids,
                upRegexMode,
                ups,
                upRegexes,
                contentRegexMode,
                contents,
                contentRegexes
            )
        }.map { it.index }.asReversed().forEach { reply.removeReplies(it) }
    }

    private fun ReplyInfo.needRemove(
        onlyAt: Boolean,
        goods: Boolean,
        uids: LongArray,
        upRegexMode: Boolean,
        ups: Set<String>,
        upRegexes: List<Regex>,
        contentRegexMode: Boolean,
        contents: Set<String>,
        contentRegexes: List<Regex>,
    ): Boolean {
        val message = content.message
        val uid = member.mid
        val upName = member.name
        if (uids.isNotEmpty() && uids.contains(uid))
            return true
        if (goods && content.urlsMap.values.map { it.extra.goodsCmControl }.any { it != 0L })
            return true
        if (ups.isNotEmpty() && upName.isNotEmpty())
            if (!upRegexMode && ups.any { upName.contains(it) })
                return true
            else if (upRegexMode && upRegexes.any { upName.contains(it) })
                return true
        if (onlyAt && message.isNotEmpty() && message.matches(onlyAtRegex))
            return true
        if (contents.isNotEmpty() && message.isNotEmpty())
            if (!contentRegexMode && contents.any { message.contains(it) })
                return true
            else if (contentRegexMode && contentRegexes.any { message.contains(it) })
                return true
        return false
    }
}
