package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.main.community.reply.v1.ReplyInfo
import com.google.protobuf.GeneratedMessageLite

abstract class ReplyListBase<out Req : GeneratedMessageLite<*, *>, out Resp : GeneratedMessageLite<*, *>> :
    MossHook<Req, Resp>() {
    companion object {
        private var cachedUpSet = emptySet<String>()
        private var cachedUpRegexes = emptyList<Regex>()
        private var cachedContentSet = emptySet<String>()
        private var cachedContentRegexes = emptyList<Regex>()

        private val onlyAtRegex = Regex("^(@\\S+\\s?)+$")

        private val mallPackageNames = arrayOf(
            "com.taobao.taobao",
            "com.jingdong.app.mall",
            "com.xunmeng.pinduoduo",
        )
    }

    protected fun upRegexes(): List<Regex> {
        val upRegexMode = Settings.BLOCK_COMMENT_UP_REGEX_MODE.boolean
        val ups = Settings.BLOCK_COMMENT_UP.stringSet
        return if (upRegexMode && cachedUpSet == ups) {
            cachedUpRegexes
        } else if (upRegexMode) {
            cachedUpSet = HashSet(ups)
            ups.map { it.toRegex() }.also { cachedUpRegexes = it }
        } else listOf()
    }

    protected fun contentRegexes(): List<Regex> {
        val contentRegexMode = Settings.BLOCK_COMMENT_CONTENT_REGEX_MODE.boolean
        val contents = Settings.BLOCK_COMMENT_CONTENT.stringSet
        return if (contentRegexMode && cachedContentSet == contents) {
            cachedContentRegexes
        } else if (contentRegexMode) {
            cachedContentSet = HashSet(contents)
            contents.map { it.toRegex() }.also { cachedContentRegexes = it }
        } else listOf()
    }

    protected fun ReplyInfo.needRemove(
        onlyAt: Boolean,
        goods: Boolean,
        upLevel: Int,
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
        val level = member.level
        if (uids.isNotEmpty() && uids.contains(uid))
            return true
        if (upLevel != 0 && level <= upLevel)
            return true
        val urls = content.urlsMap.values
        if (goods && (urls.map { it.extra.goodsCmControl }.any { it != 0L }
                    || urls.map { it.appPackageName }.any { it in mallPackageNames }))
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
