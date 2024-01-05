package app.revanced.bilibili.patches.protobuf

import android.util.Pair
import app.revanced.bilibili.api.BiliRoamingApi.getThaiSeason
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.FAIL_CODE
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.isBangumiWithWatchPermission
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.lastSeasonInfo
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.subtitlesCache
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.app.viewunite.common.*
import com.bapis.bilibili.app.viewunite.pgcanymodel.*
import com.bapis.bilibili.app.viewunite.pgcanymodel.Rights
import com.bapis.bilibili.app.viewunite.pgcanymodel.Stat
import com.bapis.bilibili.app.viewunite.v1.*
import com.bapis.bilibili.playershared.BizType
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.NetworkException
import org.json.JSONObject

object ViewUniteReplyHook {
    private const val VIEW_PGC_ANY_TYPE_URL =
        "type.googleapis.com/bilibili.app.viewunite.pgcanymodel.ViewPgcAny"

    @JvmStatic
    val viewMap = mutableMapOf<Int, com.bapis.bilibili.app.view.v1.ViewReply>()

    @JvmStatic
    val viewUniteMap = mutableMapOf<Int, ViewReply>()

    @JvmStatic
    fun hook(viewReq: ViewReq, viewReply: ViewReply?, error: MossException?): ViewReply? {
        if (error is NetworkException)
            throw error
        if (viewReply != null) {
            val aid = viewReply.arc.aid
            val like = viewReply.reqUser.like
            AutoLikePatch.detail = Pair.create(aid, like)
            if (viewReply.viewBase.bizType == BizType.BIZ_TYPE_UGC) {
                AutoLikePatch.autoLikeUnite()
                val topActivity = ApplicationDelegate.getTopActivity()
                if (topActivity != null)
                    viewUniteMap[topActivity.hashCode()] = viewReply
            }
            if (Settings.REMOVE_ELEC_BUTTON.boolean)
                viewReply.reqUser.clearElecPlusBtn()
            hookArc(viewReply)
            hookTabModules(viewReply)
            hookSupplement(viewReply)
        }
        if (viewReply == null && Settings.UNLOCK_AREA_LIMIT.boolean)
            return unlockThaiBangumi(viewReq)
        if (error != null) throw error else return viewReply
    }

    private fun hookArc(viewReply: ViewReply) {
        if (Settings.ALLOW_DOWNLOAD.boolean) {
            viewReply.arc.right.run {
                download = true
                onlyVipDownload = false
            }
        }
    }

    private fun hookSupplement(viewReply: ViewReply) {
        val supplementAny = viewReply.supplement
        if (supplementAny.typeUrl != VIEW_PGC_ANY_TYPE_URL)
            return
        lastSeasonInfo.clear()
        val viewPgcAny = ViewPgcAny.parseFrom(supplementAny.value)
        if (!viewPgcAny.hasOgvData()) return
        viewPgcAny.ogvData.run {
            lastSeasonInfo["title"] = title
            lastSeasonInfo["season_id"] = seasonId.toString()
            rights.run {
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
        }
        val newSupplement = newAny(VIEW_PGC_ANY_TYPE_URL, viewPgcAny)
        viewReply.supplement = newSupplement
    }

    private fun hookTabModules(viewReply: ViewReply) {
        viewReply.tab.tabModuleList.forEach { tabModule ->
            if (tabModule.hasIntroduction()) {
                val toRemoveIndexes = mutableListOf<Int>()
                tabModule.introduction.modulesList.forEachIndexed { index, module ->
                    if (module.hasLikeComment()) {
                        if (Settings.BLOCK_COMMENT_GUIDE.boolean)
                            toRemoveIndexes.add(index)
                    } else if (module.hasActivityEntranceModule()) {
                        if (Settings.BLOCK_BANGUMI_PAGE_ADS.boolean)
                            toRemoveIndexes.add(index)
                    } else if (module.hasSectionData()) {
                        module.sectionData.episodesList.forEach { it.unlock() }
                    } else if (module.hasRelates()) {
                        PegasusPatch.filterViewUniteRelates(module, viewReply.viewBase.bizType)
                    } else if (module.hasCovenanter()) {
                        if (Settings.BLOCK_FAN_GUIDE.boolean)
                            toRemoveIndexes.add(index)
                    } else if (module.hasLiveOrder()) {
                        if (Settings.BLOCK_LIVE_ORDER.boolean)
                            toRemoveIndexes.add(index)
                    }
                }
                toRemoveIndexes.asReversed().forEach {
                    tabModule.introduction.removeModules(it)
                }
            } else if (tabModule.hasReply()) {
                if (Settings.BLOCK_COMMENT_GUIDE.boolean)
                    tabModule.reply.replyStyle.clearBadgeType()
            }
        }
        if (Settings.BLOCK_VIDEO_COMMENT.boolean) {
            val replyTabIndex = viewReply.tab.tabModuleList.indexOfFirst { it.hasReply() }
            if (replyTabIndex != -1)
                viewReply.tab.removeTabModule(replyTabIndex)
        }
        if (Settings.BLOCK_ACTIVITY_TAB.boolean) {
            val activityTabIndex = viewReply.tab.tabModuleList.indexOfFirst { it.hasActivityTab() }
            if (activityTabIndex != -1)
                viewReply.tab.removeTabModule(activityTabIndex)
        }
    }

    private fun ViewEpisode.unlock() = run {
        badgeInfo.run {
            if (text == "受限") {
                bgColor = "#FB7299"
                bgColorNight = "#BB5B76"
                text = if (status == 13) "会员" else ""
            }
        }
        rights.run {
            if (Settings.UNLOCK_AREA_LIMIT.boolean) {
                areaLimit = 0
                canWatch = 1
                allowDm = 1
            }
            if (Settings.ALLOW_DOWNLOAD.boolean) {
                allowDownload = 1
            }
        }
        if (cid != 0L && epId != 0L) {
            val cid = cid.toString()
            val epId = epId.toString()
            lastSeasonInfo[cid] = epId
            lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
        }
    }

    private fun unlockThaiBangumi(viewReq: ViewReq): ViewReply? {
        val extraContent = viewReq.extraContentMap
        val reqEpId = extraContent.getOrDefault("ep_id", "0")
        val reqSeasonId = extraContent.getOrDefault("season_id", "0")
        if (reqEpId != "0") {
            lastSeasonInfo.clear()
            lastSeasonInfo["ep_id"] = reqEpId
        }
        if (reqSeasonId != "0") {
            lastSeasonInfo.clear()
            lastSeasonInfo["season_id"] = reqSeasonId
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
            return ViewReply().apply {
                supplement = newAny(VIEW_PGC_ANY_TYPE_URL, ViewPgcAny().apply {
                    ogvData = reconstructOgvData(newResult)
                })
                tab = Tab().apply {
                    TabModule().apply {
                        tabType = TabType.TAB_INTRODUCTION
                        introduction = reconstructIntroduction(newResult)
                    }.let { addTabModule(it) }
                }
                viewBase = ViewBase().apply {
                    bizType = BizType.BIZ_TYPE_PGC
                    config = Config()
                    control = PageControl().apply {
                        materialShow = Control()
                        toastShow = Control()
                        upShow = Control()
                    }
                }
            }.also { LogHelper.debug { "unlockThaiBangumi, reconstruct view: $it" } }
        }
        return null
    }

    private fun reconstructOgvData(result: JSONObject) = OgvData().apply {
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
        newEp = NewEp().apply {
            result.optJSONObject("new_ep")?.run {
                desc = optString("new_ep_display")
                id = optInt("id")
                title = optString("title")
            }
        }
        ogvSwitch = OgvSwitch().apply {
            mergePreviewSection = 1
        }
        playStrategy = PlayStrategy().apply {
            autoPlayToast = "即将播放："
            recommendShowStrategy = 1
            addStrategies("common_section-formal_first_ep")
            addStrategies("common_section-common_section")
            addStrategies("common_section-next_season")
            addStrategies("formal-finish-next_season")
            addStrategies("formal-end-other_section")
            addStrategies("formal-end-next_season")
            addStrategies("ord")
        }
        publish = Publish().apply {
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
        }
        rights = Rights().apply {
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
        }
        seasonId = result.optLong("season_id")
        seasonType = result.optInt("type")
        shareUrl = result.optString("share_url")
        shortLink = result.optString("short_link")
        showSeasonType = result.optInt("type")
        squareCover = result.optString("square_cover")
        stat = Stat().apply {
            // followers = result.optJSONObject("stat")?.optString("followers")
            followers = result.optJSONObject("stat_format")?.optString("likes")
            playData = StatInfo().apply {
                icon = "playdata-square-line@500"
                pureText = result.optJSONObject("stat_format")?.optString("play")
                text = pureText?.replace("播放", "")
                value = result.optJSONObject("stat")?.optLong("views") ?: 0
            }
        }
        status = result.optInt("status")
        title = result.optString("title")
        totalEp = positiveEpisodes.length()
        userStatus = UserStatus().apply {
            result.optJSONObject("user_status")?.run {
                follow = optInt("follow")
                vip = optInt("vip")
                (positiveEpisodes.optJSONObject(0))?.let { episode ->
                    watchProgress = WatchProgress().apply {
                        lastEpId = episode.optLong("id")
                        lastEpIndex = episode.optString("index")
                        lastTime = 0L
                    }
                }
            }
        }
    }

    private fun reconstructIntroduction(result: JSONObject) = IntroductionTab().apply {
        title = "简介"

        // ogvTitle
        Module().apply {
            type = ModuleType.OGV_TITLE
            ogvTitle = OgvTitle().apply {
                badgeInfo = BadgeInfo()
                reserveId = 0
                title = result.optString("title")
            }
        }.let { addModules(it) }

        // ogvIntroduction
        Module().apply {
            type = ModuleType.OGV_INTRODUCTION
            ogvIntroduction = OgvIntroduction().apply {
                // followers = result.optJSONObject("stat")?.optString("followers")
                followers = result.optJSONObject("stat_format")?.optString("likes")
                playData = StatInfo().apply {
                    icon = "playdata-square-line@500"
                    pureText = result.optJSONObject("stat_format")?.optString("play")
                    text = pureText?.replace("播放", "")
                    value = result.optJSONObject("stat")?.optLong("views") ?: 0
                }
            }
        }.let { addModules(it) }

        // seasons
        result.optJSONObject("series")?.optJSONArray("seasons")?.takeIf { it.length() > 0 }?.run {
            Module().apply {
                type = ModuleType.OGV_SEASONS
                ogvSeasons = OgvSeasons().apply {
                    asSequence<JSONObject>().forEach { season ->
                        SerialSeason().apply {
                            seasonId = season.optInt("season_id")
                            seasonTitle = season.optString("quarter_title")
                        }.let { addSerialSeason(it) }
                    }
                }
            }.let { addModules(it) }
        }

        // episodes
        result.optJSONArray("modules")?.asSequence<JSONObject>()?.forEach { module ->
            val style = module.optString("style")
            val seasonId = result.optString("season_id")
            if (style == "positive") {
                Module().apply {
                    type = ModuleType.POSITIVE
                    sectionData = reconstructSection(module, seasonId)
                }.let { addModules(it) }
            } else if (style == "section") {
                Module().apply {
                    type = ModuleType.SECTION
                    sectionData = reconstructSection(module, seasonId)
                }.let { addModules(it) }
            }
        }
    }

    private fun reconstructSection(
        module: JSONObject,
        seasonId: String,
    ) = SectionData().apply {
        id = module.optInt("id")
        moduleStyle = Style().apply {
            module.optJSONObject("module_style")?.run {
                hidden = optInt("hidden")
                line = optInt("line")
                optJSONArray("show_pages")?.asSequence<String>()
                    ?.forEach { addShowPages(it) }
            }
        }
        more = module.optString("more")
        sectionId = module.optJSONObject("data")?.optInt("id") ?: 0
        title = module.optString("title")
        val episodes = module.optJSONObject("data")?.optJSONArray("episodes")
        episodes?.asSequence<JSONObject>()?.forEach { episode ->
            ViewEpisode().apply {
                aid = episode.optLong("aid")
                badgeInfo = BadgeInfo().apply {
                    episode.optJSONObject("badge_info")?.run {
                        bgColor = optString("bg_color")
                        bgColorNight = optString("bg_color_night")
                        text = optString("text")
                    }
                }
                cid = episode.optLong("cid")
                cover = episode.optString("cover")
                dimension = Dimension().apply {
                    episode.optJSONObject("dimension")?.run {
                        width = optLong("width")
                        rotate = optLong("rotate")
                        height = optLong("height")
                    }
                }
                duration = episode.optInt("duration")
                epId = episode.optLong("id")
                epIndex = episode.optInt("index")
                from = episode.optString("from")
                link = episode.optString("link")
                longTitle = episode.optString("long_title")
                rights = com.bapis.bilibili.app.viewunite.common.Rights().apply {
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
                }
                sectionIndex = episode.optInt("section_index")
                shareUrl = episode.optString("share_url")
                statForUnity = com.bapis.bilibili.app.viewunite.common.Stat()
                status = episode.optInt("status")
                title = episode.optString("title")
            }.let { addEpisodes(it) }

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
    }
}
