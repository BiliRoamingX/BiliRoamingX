package app.revanced.bilibili.patches.protobuf

import android.util.Pair
import app.revanced.bilibili.api.BiliRoamingApi.getThaiSeason
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.FAIL_CODE
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.isBangumiWithWatchPermission
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.lastSeasonInfo
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.subtitlesCache
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import app.revanced.bilibili.utils.asSequence
import app.revanced.bilibili.utils.orEmpty
import app.revanced.bilibili.utils.toJSONObject
import app.revanced.twitter.patches.hook.twifucker.TwiFuckerUtils.forEach
import com.bapis.bilibili.app.viewunite.common.*
import com.bapis.bilibili.app.viewunite.pgcanymodel.*
import com.bapis.bilibili.app.viewunite.pgcanymodel.Rights
import com.bapis.bilibili.app.viewunite.pgcanymodel.Stat
import com.bapis.bilibili.app.viewunite.v1.*
import com.bapis.bilibili.playershared.BizType
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.NetworkException
import com.google.protobuf.Any
import org.json.JSONObject

object ViewUniteReplyHook {
    private const val VIEW_PGC_ANY_TYPE_URL =
        "type.googleapis.com/bilibili.app.viewunite.pgcanymodel.ViewPgcAny"

    @JvmStatic
    fun hook(viewReq: ViewReq, viewReply: ViewReply?, error: MossException?): ViewReply? {
        if (error is NetworkException)
            throw error
        if (viewReply != null) {
            val aid = viewReply.arc.aid
            val like = viewReply.reqUser.like
            AutoLikePatch.detail = Pair.create(aid, like)
            hookArc(viewReply)
            hookTabModules(viewReply)
            hookSupplement(viewReply)
        }
        if (viewReply == null && Settings.UNLOCK_AREA_LIMIT.boolean)
            return unlockThaiBangumi(viewReq)
        if (error != null) throw error else return viewReply
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
                                it.toBuilder().unlock().build()
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
        if (Settings.BLOCK_VIDEO_COMMENT.boolean) {
            val replyTabIndex = viewReply.tab.tabModuleList.indexOfFirst { it.hasReply() }
            if (replyTabIndex != -1)
                TabEx.removeTabModule(viewReply.tab, replyTabIndex)
        }
    }

    private fun ViewEpisode.Builder.unlock() = apply {
        badgeInfo = badgeInfo.toBuilder().apply {
            if (text == "受限") {
                bgColor = "#FB7299"
                bgColorNight = "#BB5B76"
                text = if (status == 13) "会员" else ""
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

    private fun unlockThaiBangumi(viewReq: ViewReq): ViewReply? {
        val extraContent = viewReq.extraContentMap
        if (extraContent.containsKey("ep_id")) {
            lastSeasonInfo.clear()
            lastSeasonInfo["ep_id"] = extraContent["ep_id"]
        }
        if (extraContent.containsKey("season_id")) {
            lastSeasonInfo.clear()
            lastSeasonInfo["season_id"] = extraContent["season_id"]
        }
        LogHelper.info { "Info: $lastSeasonInfo" }
        val (newCode, newResult) = getThaiSeason(lastSeasonInfo)?.toJSONObject()?.let {
            it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
        } ?: (FAIL_CODE to null)
        LogHelper.debug { "unlockThaiBangumi, newCode: $newCode, newResult: $newResult" }
        if (isBangumiWithWatchPermission(newResult, newCode)) {
            val seasonId = newResult.optString("season_id")
            lastSeasonInfo["title"] = newResult.optString("title")
            lastSeasonInfo["season_id"] = seasonId
            return ViewReply.newBuilder().apply {
                supplement = Any.newBuilder().apply {
                    typeUrl = VIEW_PGC_ANY_TYPE_URL
                    value = ViewPgcAny.newBuilder().apply {
                        ogvData = reconstructOgvData(newResult)
                    }.build().toByteString()
                }.build()
                tab = Tab.newBuilder().apply {
                    TabModule.newBuilder().apply {
                        tabType = TabType.TAB_INTRODUCTION
                        introduction = reconstructIntroduction(newResult)
                    }.build().let { addTabModule(it) }
                }.build()
                viewBase = ViewBase.newBuilder().apply {
                    bizType = BizType.BIZ_TYPE_PGC
                    config = Config.newBuilder().build()
                    control = PageControl.newBuilder().apply {
                        materialShow = Control.newBuilder().build()
                        toastShow = Control.newBuilder().build()
                        upShow = Control.newBuilder().build()
                    }.build()
                }.build()
            }.build().also { LogHelper.debug { "unlockThaiBangumi, reconstruct view: $it" } }
        }
        return null
    }

    private fun reconstructOgvData(result: JSONObject) = OgvData.newBuilder().apply {
        aid = 0
        cover = result.optString("cover")
        horizontalCover169 = result.optString("horizon_cover")
        val positiveEpisodes = result.optJSONArray("modules").orEmpty()
            .asSequence<JSONObject>().find {
                it.optString("style") == "positive"
            }?.optJSONObject("data")?.optJSONArray("episodes").orEmpty()
        hasCanPlayEp = if (positiveEpisodes.length() > 0) 1 else 0
        mediaId = result.optInt("season_id")
        mode = 2
        newEp = NewEp.newBuilder().apply {
            result.optJSONObject("new_ep")?.run {
                desc = optString("new_ep_display")
                id = optInt("id")
                title = optString("title")
            }
        }.build()
        ogvSwitch = OgvSwitch.newBuilder().apply {
            mergePreviewSection = 1
        }.build()
        playStrategy = PlayStrategy.newBuilder().apply {
            autoPlayToast = "即将播放："
            recommendShowStrategy = 1
            addStrategies("common_section-formal_first_ep")
            addStrategies("common_section-common_section")
            addStrategies("common_section-next_season")
            addStrategies("formal-finish-next_season")
            addStrategies("formal-end-other_section")
            addStrategies("formal-end-next_season")
            addStrategies("ord")
        }.build()
        publish = Publish.newBuilder().apply {
            result.optJSONObject("publish")?.run {
                isFinish = optInt("is_finish")
                isStarted = optInt("is_started")
                pubTime = optString("pub_time")
                pubTimeShow = optString("pub_time_show")
                releaseDateShow = optString("release_date_show")
                timeLengthShow = optString("time_length_show")
                unknowPubDate = optInt("unknow_pub_date")
                weekday = optInt("weekday")
            }
        }.build()
        rights = Rights.newBuilder().apply {
            result.optJSONObject("rights")?.run {
                allowBp = optInt("allow_bp")
                allowBpRank = optInt("allow_bp_rank")
                allowReview = optInt("allow_review")
                areaLimit = optInt("area_limit")
                banAreaShow = optInt("ban_area_show")
                canWatch = optInt("can_watch")
                copyright = optString("copyright")
                forbidPre = optInt("forbidPre")
                isPreview = optInt("is_preview")
                onlyVipDownload = optInt("onlyVipDownload")
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
            }
        }.build()
        seasonId = result.optLong("season_id")
        seasonType = result.optInt("type")
        shareUrl = result.optString("share_url")
        shortLink = result.optString("short_link")
        showSeasonType = result.optInt("type")
        squareCover = result.optString("square_cover")
        stat = Stat.newBuilder().apply {
            followers = result.optJSONObject("stat")?.optString("followers")
            playData = StatInfo.newBuilder().apply {
                icon = "playdata-square-line@500"
                pureText = result.optJSONObject("stat_format")?.optString("play")
                text = pureText?.replace("播放", "")
                value = result.optJSONObject("stat")?.optLong("views") ?: 0
            }.build()
        }.build()
        status = result.optInt("status")
        if (Settings.CN_SERVER_ACCESS_KEY.string.isNotEmpty())
            if (status == 13) status = 2
        title = result.optString("title")
        totalEp = positiveEpisodes.length()
        userStatus = UserStatus.newBuilder().apply {
            result.optJSONObject("user_status")?.run {
                follow = optInt("follow")
                vip = optInt("vip")
                (positiveEpisodes.optJSONObject(0))?.let { episode ->
                    watchProgress = WatchProgress.newBuilder().apply {
                        lastEpId = episode.optLong("id")
                        lastEpIndex = episode.optString("index")
                        lastTime = 0L
                    }.build()
                }
            }
        }.build()
    }.build()

    private fun reconstructIntroduction(result: JSONObject) = IntroductionTab.newBuilder().apply {
        title = "简介"

        // ogvTitle
        Module.newBuilder().apply {
            type = ModuleType.OGV_TITLE
            ogvTitle = OgvTitle.newBuilder().apply {
                badgeInfo = BadgeInfo.newBuilder().build()
                reserveId = 0
                title = result.optString("title")
            }.build()
        }.build().let { addModules(it) }

        // ogvIntroduction
        Module.newBuilder().apply {
            type = ModuleType.OGV_INTRODUCTION
            ogvIntroduction = OgvIntroduction.newBuilder().apply {
                followers = result.optJSONObject("stat")?.optString("followers")
                playData = StatInfo.newBuilder().apply {
                    icon = "playdata-square-line@500"
                    pureText = result.optJSONObject("stat_format")?.optString("play")
                    text = pureText?.replace("播放", "")
                    value = result.optJSONObject("stat")?.optLong("views") ?: 0
                }.build()
            }.build()
        }.build().let { addModules(it) }

        // seasons
        result.optJSONObject("series")?.optJSONArray("seasons")?.takeIf { it.length() > 0 }?.run {
            Module.newBuilder().apply {
                type = ModuleType.OGV_SEASONS
                ogvSeasons = OgvSeasons.newBuilder().apply {
                    forEach { season ->
                        SerialSeason.newBuilder().apply {
                            seasonId = season.optInt("season_id")
                            seasonTitle = season.optString("quarter_title")
                        }.let { addSerialSeason(it) }
                    }
                }.build()
            }.let { addModules(it) }
        }

        // episodes
        result.optJSONArray("modules")?.forEach { module ->
            val style = module.optString("style")
            val seasonId = result.optString("season_id")
            if (style == "positive") {
                Module.newBuilder().apply {
                    type = ModuleType.POSITIVE
                    sectionData = reconstructSection(module, seasonId, true)
                }.build().let { addModules(it) }
            } else if (style == "section") {
                Module.newBuilder().apply {
                    type = ModuleType.SECTION
                    sectionData = reconstructSection(module, seasonId, false)
                }.build().let { addModules(it) }
            }
        }
    }.build()

    private fun reconstructSection(
        module: JSONObject,
        seasonId: String,
        positive: Boolean,
    ) = SectionData.newBuilder().apply {
        id = module.optInt("id")
        moduleStyle = Style.newBuilder().apply {
            module.optJSONObject("module_style")?.run {
                hidden = optInt("hidden")
                line = optInt("line")
                optJSONArray("show_pages")?.asSequence<String>()
                    ?.forEach { addShowPages(it) }
            }
        }.build()
        more = if (positive) "由于会串评至正常视频，勿发弹幕" else module.optString("more")
        sectionId = module.optJSONObject("data")?.optInt("id") ?: 0
        title = module.optString("title")
        module.optJSONObject("data")?.optJSONArray("episodes")?.forEach { episode ->
            ViewEpisode.newBuilder().apply {
                aid = episode.optLong("aid")
                badgeInfo = BadgeInfo.newBuilder().apply {
                    episode.optJSONObject("badge_info")?.run {
                        bgColor = optString("bg_color")
                        bgColorNight = optString("bg_color_night")
                        text = optString("text")
                    }
                }.build()
                cid = episode.optLong("cid")
                cover = episode.optString("cover")
                dimension = Dimension.newBuilder().apply {
                    episode.optJSONObject("dimension")?.run {
                        width = optLong("width")
                        rotate = optLong("rotate")
                        height = optLong("height")
                    }
                }.build()
                epId = episode.optLong("id")
                epIndex = episode.optInt("index")
                from = episode.optString("from")
                link = episode.optString("link")
                longTitle = episode.optString("long_title")
                rights = com.bapis.bilibili.app.viewunite.common.Rights.newBuilder().apply {
                    episode.optJSONObject("rights")?.run {
                        allowDemand = optInt("allow_demand")
                        allowDm = optInt("allow_dm")
                        allowDownload = optInt("allow_download")
                        areaLimit = optInt("area_limit")
                    }
                    if (Settings.UNLOCK_AREA_LIMIT.boolean)
                        areaLimit = 0
                    if (Settings.ALLOW_DOWNLOAD.boolean)
                        allowDownload = 1
                }.build()
                sectionIndex = episode.optInt("section_index")
                shareUrl = episode.optString("share_url")
                statForUnity = com.bapis.bilibili.app.viewunite.common.Stat.newBuilder().build()
                status = episode.optInt("status")
                title = episode.optString("title")
                if (Settings.CN_SERVER_ACCESS_KEY.string.isNotEmpty())
                    if (status == 13) status = 2
            }.build().let { addEpisodes(it) }

            if (episode.has("cid") && episode.has("id")) {
                val cid = episode.optInt("cid").toString()
                val epId = episode.optInt("id").toString()
                lastSeasonInfo[cid] = epId
                lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
                episode.optJSONArray("subtitles")?.takeIf { it.length() > 0 }?.let {
                    subtitlesCache.compute(seasonId) { _, v ->
                        (v ?: hashMapOf()).apply { this[cid] = it }
                    }
                }
            }
        }
    }.build()
}
