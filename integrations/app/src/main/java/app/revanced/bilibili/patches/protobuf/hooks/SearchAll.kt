package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.ArrayUtils
import com.bapis.bilibili.polymer.app.search.v1.SearchAllRequest
import com.bapis.bilibili.polymer.app.search.v1.SearchAllResponse
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object SearchAll : MossHook<SearchAllRequest, SearchAllResponse>() {
    private var cachedUpSet = emptySet<String>()
    private var cachedUpRegexes = emptyList<Regex>()
    private var cachedContentSet = emptySet<String>()
    private var cachedContentRegexes = emptyList<Regex>()

    private fun upRegexes(ups: Set<String>, upRegexMode: Boolean): List<Regex> {
        return if (upRegexMode && cachedUpSet == ups) {
            cachedUpRegexes
        } else if (upRegexMode) {
            cachedUpSet = HashSet(ups)
            ups.map { it.toRegex() }.also { cachedUpRegexes = it }
        } else listOf()
    }

    private fun contentRegexes(contents: Set<String>, contentRegexMode: Boolean): List<Regex> {
        return if (contentRegexMode && cachedContentSet == contents) {
            cachedContentRegexes
        } else if (contentRegexMode) {
            cachedContentSet = HashSet(contents)
            contents.map { it.toRegex() }.also { cachedContentRegexes = it }
        } else listOf()
    }

    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is SearchAllRequest
    }

    override fun hookAfter(
        req: SearchAllRequest,
        reply: SearchAllResponse?,
        error: MossException?
    ): SearchAllResponse? {
        if (reply != null) {
            BangumiSeasonHook.addAreaTags(reply)
            filterSearchResult(reply)
        }
        return super.hookAfter(req, reply, error)
    }

    private fun filterSearchResult(reply: SearchAllResponse) {
        val types = Settings.FilterSearchType().toMutableSet()
        if (types.contains("bangumi")) {
            types.remove("bangumi")
            types.add("ogv_pgc")
            types.add("bgm_media")
            types.add("pgc_media")
        }
        if (types.contains("ad")) {
            types.add("product")
            types.add("special_s")
        }
        val toRemoveIndexes = mutableListOf<Int>()
        val contents = Settings.FilterSearchContent()
        val contentRegexMode = Settings.FilterSearchContentRegexMode()
        val contentsRegexes = contentRegexes(contents, contentRegexMode)
        val ups = Settings.FilterSearchUp()
        val upRegexMode = Settings.FilterSearchUpRegexMode()
        val upRegexes = upRegexes(ups, upRegexMode)
        val uids = ArrayUtils.toLongArray(Settings.FilterSearchUid())
        if (types.isEmpty() && contents.isEmpty() && ups.isEmpty() && uids.isEmpty())
            return
        fun String.removeEm() = replace("<em class=\"keyword\">", "")
            .replace("</em>", "")
        for ((index, item) in reply.itemList.withIndex()) {
            val linkType = item.linktype
            if (types.isNotEmpty() && types.any { linkType.contains(it) }) {
                toRemoveIndexes.add(index)
                continue
            }
            val content = (if (item.hasAv()) {
                item.av.title
            } else if (item.hasArticle()) {
                item.article.title
            } else if (item.hasArticleNew()) {
                item.articleNew.title
            } else if (item.hasBangumi()) {
                item.bangumi.title
            } else if (item.hasComic()) {
                item.comic.title
            } else if (item.hasChannelNew()) {
                item.channelNew.title
            } else if (item.hasDynamicNew()) {
                item.dynamicNew.title
            } else if (item.hasSubject()) {
                item.subject.title
            } else if (item.hasLive()) {
                item.live.title
            } else "").removeEm()
            if (content.isNotEmpty() && contents.isNotEmpty()) {
                if (contentRegexMode && contentsRegexes.any { content.contains(it) }) {
                    toRemoveIndexes.add(index)
                    continue
                } else if (!contentRegexMode && contents.any { content.contains(it) }) {
                    toRemoveIndexes.add(index)
                    continue
                }
            }
            val upName = if (item.hasAuthor()) {
                item.author.title.removeEm()
            } else if (item.hasAuthorNew()) {
                item.authorNew.title.removeEm()
            } else if (item.hasAv()) {
                item.av.author
            } else if (item.hasArticle()) {
                item.article.author
            } else if (item.hasArticleNew()) {
                item.articleNew.author
            } else if (item.hasDynamicNew()) {
                item.dynamicNew.upper.title
            } else ""
            if (upName.isNotEmpty() && ups.isNotEmpty()) {
                if (upRegexMode && upRegexes.any { upName.contains(it) }) {
                    toRemoveIndexes.add(index)
                    continue
                } else if (!upRegexMode && ups.any { upName.contains(it) }) {
                    toRemoveIndexes.add(index)
                    continue
                }
            }
            val uid = if (item.hasAuthor()) {
                item.author.avatarInfo.mid
            } else if (item.hasAuthorNew()) {
                item.authorNew.mid
            } else if (item.hasAv()) {
                item.av.mid
            } else if (item.hasArticle()) {
                item.article.mid
            } else if (item.hasArticleNew()) {
                item.articleNew.mid
            } else if (item.hasDynamicNew()) {
                item.dynamicNew.upper.mid
            } else 0L
            if (uid != 0L && uids.isNotEmpty() && uids.contains(uid)) {
                toRemoveIndexes.add(index)
                continue
            }
        }
        toRemoveIndexes.asReversed().forEach { reply.removeItem(it) }
    }
}
