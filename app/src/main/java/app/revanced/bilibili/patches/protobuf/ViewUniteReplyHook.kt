package app.revanced.bilibili.patches.protobuf

import android.util.Pair
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.lastSeasonInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import com.bapis.bilibili.app.viewunite.common.ModuleEx
import com.bapis.bilibili.app.viewunite.common.ViewEpisode
import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny
import com.bapis.bilibili.app.viewunite.v1.ReplyStyleEx
import com.bapis.bilibili.app.viewunite.v1.ViewReply
import com.bapis.bilibili.app.viewunite.v1.ViewReplyEx
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.Any

object ViewUniteReplyHook {
    private const val VIEW_PGC_ANY_TYPE_URL =
        "type.googleapis.com/bilibili.app.viewunite.pgcanymodel.ViewPgcAny"

    @JvmStatic
    fun hook(viewReply: ViewReply?, error: MossException?): ViewReply? {
        LogHelper.debug { "ViewUniteReplyHook.hook, error: $error" }
        if (viewReply != null) {
            val aid = viewReply.arc.aid
            val like = viewReply.reqUser.like
            AutoLikePatch.detail = Pair.create(aid, like)
            hookArc(viewReply)
            hookTabModules(viewReply)
            hookSupplement(viewReply)
        }
        return viewReply
    }

    private fun hookArc(viewReply: ViewReply) {
        val newArc = viewReply.arc.toBuilder().apply {
            right = right.toBuilder().apply {
                if (Settings.ALLOW_DOWNLOAD.boolean) {
                    download = true
                    onlyVipDownload = false
                }
            }.build()
        }.build()
        ViewReplyEx.setArc(viewReply, newArc)
    }

    private fun hookSupplement(viewReply: ViewReply) {
        val supplementAny = viewReply.supplement
        if (supplementAny.typeUrl != VIEW_PGC_ANY_TYPE_URL)
            return
        lastSeasonInfo.clear()
        val viewPgcAny = ViewPgcAny.parseFrom(supplementAny.value)
        if (!viewPgcAny.hasOgvData()) return
        val newViewPgcAny = viewPgcAny.toBuilder().apply {
            ogvData = ogvData.toBuilder().apply {
                lastSeasonInfo["title"] = title
                lastSeasonInfo["season_id"] = seasonId.toString()
                rights = rights.toBuilder().apply {
                    if (Settings.UNLOCK_AREA_LIMIT.boolean) {
                        areaLimit = 0
                        banAreaShow = 1
                        canWatch = 1
                    }
                    if (Settings.ALLOW_DOWNLOAD.boolean) {
                        allowDownload = 1
                        newAllowDownload = 1
                        onlyVipDownload = 0
                    }
                }.build()
            }.build()
        }.build()
        val newSupplement = Any.newBuilder().apply {
            typeUrl = VIEW_PGC_ANY_TYPE_URL
            value = newViewPgcAny.toByteString()
        }.build()
        ViewReplyEx.setSupplement(viewReply, newSupplement)
    }

    private fun hookTabModules(viewReply: ViewReply) {
        viewReply.tab.tabModuleList.forEach { tabModule ->
            if (tabModule.hasIntroduction()) {
                for (module in tabModule.introduction.modulesList) {
                    if (module.hasLikeComment()) {
                        if (Settings.BLOCK_COMMENT_GUIDE.boolean)
                            ModuleEx.clearLikeComment(module)
                    } else if (module.hasActivityEntranceModule()) {
                        if (Settings.BLOCK_BANGUMI_PAGE_ADS.boolean)
                            ModuleEx.clearActivityEntranceModule(module)
                    } else if (module.hasSectionData()) {
                        val newSectionData = module.sectionData.toBuilder().apply {
                            episodesList.map {
                                it.toBuilder().apply {
                                    onEachEpisode(this)
                                }.build()
                            }.let {
                                clearEpisodes()
                                addAllEpisodes(it)
                            }
                        }.build()
                        ModuleEx.setSectionData(module, newSectionData)
                    }
                }
            } else if (tabModule.hasReply()) {
                if (Settings.BLOCK_COMMENT_GUIDE.boolean)
                    ReplyStyleEx.clearBadgeType(tabModule.reply.replyStyle)
            }
        }
    }

    private fun onEachEpisode(episode: ViewEpisode.Builder) = episode.apply {
        badgeInfo = badgeInfo.toBuilder().apply {
            if (text == "受限") {
                bgColor = "#FB7299"
                bgColorNight = "#BB5B76"
                text = ""
            }
        }.build()
        rights = rights.toBuilder().apply {
            if (Settings.UNLOCK_AREA_LIMIT.boolean) {
                areaLimit = 0
                canWatch = 1
                allowDm = 1
            }
            if (Settings.ALLOW_DOWNLOAD.boolean) {
                allowDownload = 1
            }
        }.build()
        if (cid != 0L && epId != 0L) {
            val cid = cid.toString()
            val epId = epId.toString()
            lastSeasonInfo[cid] = epId
            lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
        }
        if (Settings.CN_SERVER_ACCESS_KEY.string.isNotEmpty())
            if (status == 13) status = 2
    }
}
