package app.revanced.bilibili.patches.protobuf

import android.util.Pair
import app.revanced.bilibili.api.BiliRoamingApi.getSeason
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.FAIL_CODE
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.clipInfoCache
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
        if (viewReply == null && Settings.UNLOCK_AREA_LIMIT.boolean
            && viewReq.extraContentMap.let { it.containsKey("season_id") || it.containsKey("ep_id") }
        ) return unlockThaiBangumi(viewReq)
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
        if (epId != 0L) {
            val epId = epId.toString()
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
        val (newCode, newResult) = getSeason(lastSeasonInfo)?.toJSONObject()?.let {
            it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
        } ?: (FAIL_CODE to null)
        LogHelper.debug { "unlockThaiBangumi, newCode: $newCode, newResult: $newResult" }
        if (isBangumiWithWatchPermission(newResult, newCode)) {
            val seasonId = newResult.optString("season_id")
            lastSeasonInfo["title"] = newResult.optString("title")
            lastSeasonInfo["season_id"] = seasonId
            return runCatching {
                val th = newResult.optString("link").startsWith("https://www.bilibili.tv")
                ViewReply().apply {
                    supplement = newAny(VIEW_PGC_ANY_TYPE_URL, ViewPgcAny().apply {
                        ogvData = reconstructOgvData(newResult)
                    })
                    tab = Tab().apply {
                        TabModule().apply {
                            tabType = TabType.TAB_INTRODUCTION
                            introduction = reconstructIntroduction(newResult, th)
                        }.let { addTabModule(it) }
                        if (!th && !Settings.BLOCK_VIDEO_COMMENT.boolean) {
                            TabModule().apply {
                                tabType = TabType.TAB_REPLY
                                reply = ReplyTab().apply { title = "评论" }
                            }.let { addTabModule(it) }
                        }
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
                }
            }.onFailure {
                LogHelper.error({ "unlockThaiBangumi, failed to reconstruct unite view" }, it)
            }.onSuccess {
                LogHelper.debug { "unlockThaiBangumi, reconstruct view: $it" }
            }.getOrNull()
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
        mediaId = result.optInt("media_id")
        mode = result.optInt("mode")
        newEp = NewEp().apply {
            result.optJSONObject("new_ep")?.run {
                desc = optString("desc")
                id = optInt("id")
                title = optString("title")
                indexShow = optString("index_show")
                more = optString("more")
                isNew = optInt("is_new")
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
                updateInfoDesc = optString("update_info_desc")
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
                forbidPre = optInt("forbid_pre")
                isPreview = optInt("is_preview")
                onlyVipDownload = optInt("only_vip_download")
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
        showSeasonType = result.optInt("show_season_type")
        squareCover = result.optString("square_cover")
        stat = Stat().apply {
            followers = result.optJSONObject("stat")?.optString("followers")
            playData = StatInfo().apply {
                icon = result.optJSONObject("icon_font")?.optString("name").orEmpty()
                val text = result.optJSONObject("icon_font")?.optString("text").orEmpty()
                pureText = "${text}播放"
                this.text = text
                value = result.optJSONObject("stat")?.optLong("views") ?: 0
            }
        }
        status = result.optInt("status")
        title = result.optString("title")
        totalEp = result.optInt("total")
        userStatus = UserStatus().apply {
            result.optJSONObject("user_status")?.run {
                follow = optInt("follow")
                followStatus = optInt("follow_status")
                pay = optInt("pay")
                vip = optInt("vip")
                vipFrozen = optInt("vip_frozen")
                sponsor = optInt("sponsor")
                optJSONObject("progress")?.run {
                    watchProgress = WatchProgress().apply {
                        lastEpId = optLong("last_ep_id")
                        lastEpIndex = optString("last_ep_index")
                        lastTime = optLong("last_time")
                    }
                } ?: (positiveEpisodes.optJSONObject(0))?.run {
                    watchProgress = WatchProgress().apply {
                        lastEpId = optLong("id")
                        lastEpIndex = optString("index")
                        lastTime = 0L
                    }
                }
            }
        }
    }

    private fun reconstructIntroduction(result: JSONObject, th: Boolean) = IntroductionTab().apply {
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
                followers = result.optJSONObject("stat")?.optString("followers")
                playData = StatInfo().apply {
                    icon = result.optJSONObject("icon_font")?.optString("name").orEmpty()
                    val text = result.optJSONObject("icon_font")?.optString("text").orEmpty()
                    pureText = "${text}播放"
                    this.text = text
                    value = result.optJSONObject("stat")?.optLong("views") ?: 0
                }
            }
        }.let { addModules(it) }

        // kingPosition
        if (!th) Module().apply {
            type = ModuleType.KING_POSITION
            kingPosition = KingPosition().apply {
                addKingPos(KingPos().apply {
                    type = KingPositionType.LIKE
                    like = LikeExtend().apply {
                        likeAnimation =
                            "https://i0.hdslb.com/bfs/like_animation/2c5f646c8e9d13213336828e7a6112764e1ec2e4.svga"
                        playerAnimation = PlayerAnimation()
                        tripleLike = UpLikeImg().apply {
                            type = 1
                        }
                    }
                })
                addKingPos(KingPos().apply {
                    type = KingPositionType.COIN
                    coin = CoinExtend()
                })
                addKingPos(KingPos().apply {
                    type = KingPositionType.FAV
                })
                addKingPos(KingPos().apply {
                    type = KingPositionType.CACHE
                })
                addKingPos(KingPos().apply {
                    type = KingPositionType.SHARE
                })
            }
        }.let { addModules(it) }

        // seasons
        result.optJSONObject("series")?.optJSONArray("seasons")?.takeIf { it.length() > 0 }?.run {
            Module().apply {
                type = ModuleType.OGV_SEASONS
                ogvSeasons = OgvSeasons().apply {
                    forEach { season ->
                        SerialSeason().apply {
                            seasonId = season.optInt("season_id")
                            seasonTitle = season.optString("quarter_title")
                        }.let { addSerialSeason(it) }
                    }
                }
            }.let { addModules(it) }
        }

        // episodes
        result.optJSONArray("modules")?.forEach { module ->
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
        module.optJSONObject("data")?.optJSONArray("episodes")?.forEach { episode ->
            ViewEpisode().apply {
                aid = episode.optLong("aid")
                badge = episode.optString("badge")
                badgeInfo = BadgeInfo().apply {
                    episode.optJSONObject("badge_info")?.run {
                        bgColor = optString("bg_color")
                        bgColorNight = optString("bg_color_night")
                        text = optString("text")
                    }
                }
                badgeType = episode.optInt("badge_type")
                bvid = episode.optString("bvid")
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
                epId = episode.optLong("ep_id")
                epIndex = episode.optInt("ep_index")
                from = episode.optString("from")
                link = episode.optString("link")
                longTitle = episode.optString("long_title")
                pubTime = episode.optLong("pub_time")
                pv = episode.optInt("pv")
                releaseDate = episode.optString("release_date")
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
                shareCopy = episode.optString("share_copy")
                shareUrl = episode.optString("share_url")
                shortLink = episode.optString("short_link")
                statForUnity = episode.optJSONObject("stat_for_unity")?.run {
                    com.bapis.bilibili.app.viewunite.common.Stat().apply {
                        coin = optLong("coin")
                        optJSONObject("danmaku")?.run {
                            danmaku = StatInfo().apply {
                                icon = optString("icon")
                                pureText = optString("pure_text")
                                text = optString("text")
                                value = optLong("value")
                            }
                        }
                        like = optLong("likes")
                        reply = optLong("reply")
                        optJSONObject("vt")?.run {
                            vt = StatInfo().apply {
                                icon = optString("icon")
                                pureText = optString("pure_text")
                                text = optString("text")
                                value = optLong("value")
                            }
                        }
                    }
                } ?: com.bapis.bilibili.app.viewunite.common.Stat()
                status = episode.optInt("status")
                subtitle = episode.optString("subtitle")
                title = episode.optString("title")
                vid = episode.optString("vid")
            }.let { addEpisodes(it) }

            if (episode.has("id")) {
                val epId = episode.optString("id")
                lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
                episode.optJSONArray("subtitles")?.takeIf { it.length() > 0 }?.let {
                    subtitlesCache.compute(seasonId) { _, v ->
                        (v ?: hashMapOf()).apply { this[epId] = it }
                    }
                }
                episode.optJSONObject("jump")?.let {
                    clipInfoCache.compute(seasonId) { _, v ->
                        (v ?: hashMapOf()).apply { this[epId] = it }
                    }
                }
            }
        }
    }
}
