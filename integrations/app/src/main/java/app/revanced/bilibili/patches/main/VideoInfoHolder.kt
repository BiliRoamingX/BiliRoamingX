package app.revanced.bilibili.patches.main

import android.app.Activity
import app.revanced.bilibili.meta.Season
import app.revanced.bilibili.meta.VideoInfo
import app.revanced.bilibili.patches.CopyEnhancePatch
import app.revanced.bilibili.patches.protobuf.ViewUniteReplyHook
import app.revanced.bilibili.utils.asSequence
import app.revanced.bilibili.utils.orEmpty
import app.revanced.bilibili.utils.toJSONObject
import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny
import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny
import com.bapis.bilibili.app.viewunite.v1.ViewReply
import com.bapis.bilibili.playershared.BizType
import org.json.JSONObject
import java.util.concurrent.ConcurrentHashMap

object VideoInfoHolder {
    @JvmStatic
    private val cache = ConcurrentHashMap<Int, VideoInfo>()

    @JvmStatic
    val current: VideoInfo?
        get() = ApplicationDelegate.getTopActivity()?.let { cache[it.hashCode()] }

    @JvmStatic
    fun removeCache(activity: Activity) {
        cache.remove(activity.hashCode())
    }

    @JvmStatic
    fun clearCache() {
        cache.clear()
    }

    @JvmStatic
    fun updateCurrent(savedInfo: (VideoInfo?) -> VideoInfo) {
        val topActivity = ApplicationDelegate.getTopActivity()
        if (topActivity != null)
            cache.compute(topActivity.hashCode()) { _, v ->
                savedInfo(v).also { judgeAiConclusionIfNeeded(it) }
            }
    }

    @JvmStatic
    private fun judgeAiConclusionIfNeeded(info: VideoInfo) {
        val (cid, view) = info
        if (cid == 0L) return
        if (view is com.bapis.bilibili.app.view.v1.ViewReply) {
            val aid = view.arc.aid
            val mid = view.arc.author.mid
            CopyEnhancePatch.judgeAiConclusion(aid, mid, cid)
        } else if (view is ViewReply && view.viewBase.bizType == BizType.BIZ_TYPE_UGC) {
            val aid = view.arc.aid
            val mid = view.owner.mid
            CopyEnhancePatch.judgeAiConclusion(aid, mid, cid)
        }
    }

    @JvmStatic
    fun currentTitle(): Pair<String, String>? {
        val (cid, view) = current ?: return null
        if (cid == 0L || view == null)
            return null
        when (view) {
            // old player ugc
            is com.bapis.bilibili.app.view.v1.ViewReply -> {
                val mainTitle = view.arc.title
                val episodeTitle = if (view.pagesList.size > 1) {
                    view.pagesList.find { it.page.cid == cid }?.page?.part.orEmpty()
                } else ""
                return mainTitle to episodeTitle
            }

            // old player pgc
            is String -> {
                val data = view.toJSONObject().optJSONObject("data")
                    ?: return null
                val mainTitle = data.optString("title")
                val episodeTitle = data.optJSONArray("modules").orEmpty()
                    .asSequence<JSONObject>().flatMap {
                        it.optJSONObject("data")?.optJSONArray("episodes")
                            .orEmpty().asSequence<JSONObject>()
                    }.find { it.optLong("cid") == cid }?.optString("title").orEmpty()
                if (mainTitle.isEmpty() && episodeTitle.isEmpty())
                    return null
                return mainTitle to episodeTitle
            }

            // unite player
            is ViewReply -> {
                var mainTitle = ""
                var episodeTitle = ""
                val supplement = view.supplement
                when (supplement.typeUrl) {
                    ViewUniteReplyHook.VIEW_UGC_ANY_TYPE_URL -> {
                        mainTitle = view.arc.title
                        val viewUgcAny = ViewUgcAny.parseFrom(supplement.value)
                        episodeTitle = if (viewUgcAny.pagesList.size > 1) {
                            viewUgcAny.pagesList.find { it.cid == cid }?.part.orEmpty()
                        } else ""
                    }

                    ViewUniteReplyHook.VIEW_PGC_ANY_TYPE_URL -> {
                        val modules = view.tab.tabModuleList.find { it.hasIntroduction() }
                            ?.introduction?.modulesList.orEmpty()
                        mainTitle = modules.find { it.hasOgvTitle() }?.ogvTitle?.title.orEmpty()
                        episodeTitle = modules.filter { it.hasSectionData() }.asSequence().flatMap {
                            it.sectionData.episodesList
                        }.find { it.cid == cid }?.title.orEmpty()
                    }
                }
                if (mainTitle.isEmpty() && episodeTitle.isEmpty())
                    return null
                return mainTitle to episodeTitle
            }
        }
        return null
    }

    @JvmStatic
    fun currentSeason(): Season? {
        val view = current?.view ?: return null
        when (view) {
            is String -> {
                val data = view.toJSONObject().optJSONObject("data")
                    ?: return null
                val id = data.optLong("season_id")
                val title = data.optString("title")
                return Season(id, title)
            }

            is ViewReply -> {
                val supplement = view.supplement
                if (supplement.typeUrl == ViewUniteReplyHook.VIEW_PGC_ANY_TYPE_URL) {
                    val id = ViewPgcAny.parseFrom(supplement.value).ogvData.seasonId
                    val modules = view.tab.tabModuleList.find { it.hasIntroduction() }
                        ?.introduction?.modulesList.orEmpty()
                    val title = modules.find { it.hasOgvTitle() }?.ogvTitle?.title.orEmpty()
                    return Season(id, title)
                }
            }
        }
        return null
    }

    @JvmStatic
    fun currentVideoUrl(): String? {
        val (cid, view) = current ?: return null
        if (cid == 0L || view == null)
            return null
        return when (view) {
            is com.bapis.bilibili.app.view.v1.ViewReply -> {
                val aid = view.arc.aid
                val p = view.pagesList.indexOfFirst {
                    it.page.cid == cid
                }.let { if (it == -1) 0 else it } + 1
                "https://www.bilibili.com/video/av$aid".let {
                    if (p == 1) it else "$it?p=$p"
                }
            }

            is String -> {
                val data = view.toJSONObject().optJSONObject("data")
                    ?: return null
                val epId = data.optJSONArray("modules").orEmpty()
                    .asSequence<JSONObject>().flatMap {
                        it.optJSONObject("data")?.optJSONArray("episodes")
                            .orEmpty().asSequence<JSONObject>()
                    }.find { it.optLong("cid") == cid }?.optString("ep_id")
                    .orEmpty().ifEmpty { return null }
                val th = data.optString("link").startsWith("https://www.bilibili.tv")
                if (th) {
                    val seasonId = data.optString("season_id")
                    "https://www.bilibili.tv/en/play/$seasonId/$epId"
                } else {
                    "https://www.bilibili.com/bangumi/play/ep$epId"
                }
            }

            is ViewReply -> {
                val supplement = view.supplement
                when (supplement.typeUrl) {
                    ViewUniteReplyHook.VIEW_UGC_ANY_TYPE_URL -> {
                        val aid = view.arc.aid
                        val viewUgcAny = ViewUgcAny.parseFrom(supplement.value)
                        val p = viewUgcAny.pagesList.indexOfFirst {
                            it.cid == cid
                        }.let { if (it == -1) 0 else it } + 1
                        "https://www.bilibili.com/video/av$aid".let {
                            if (p == 1) it else "$it?p=$p"
                        }
                    }

                    ViewUniteReplyHook.VIEW_PGC_ANY_TYPE_URL -> {
                        val epId = view.tab.tabModuleList.find { it.hasIntroduction() }
                            ?.introduction?.modulesList.orEmpty().filter { it.hasSectionData() }
                            .asSequence().flatMap { it.sectionData.episodesList }
                            .find { it.cid == cid }?.epId ?: return null
                        val ogvData = ViewPgcAny.parseFrom(supplement.value).ogvData
                        val th = ogvData.shareUrl.startsWith("https://www.bilibili.tv")
                        if (th) {
                            val seasonId = ogvData.seasonId
                            "https://www.bilibili.tv/en/play/$seasonId/$epId"
                        } else {
                            "https://www.bilibili.com/bangumi/play/ep$epId"
                        }
                    }

                    else -> null
                }
            }

            else -> null
        }
    }
}
