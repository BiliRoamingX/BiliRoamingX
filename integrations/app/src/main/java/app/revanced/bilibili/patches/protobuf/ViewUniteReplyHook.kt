package app.revanced.bilibili.patches.protobuf

import android.util.Pair
import app.revanced.bilibili.api.BiliRoamingApi.getSeason
import app.revanced.bilibili.patches.AutoLikePatch
import app.revanced.bilibili.patches.BLRoutePatch
import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.FAIL_CODE
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.bangumiInfoCache
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.isBangumiWithWatchPermission
import app.revanced.bilibili.patches.okhttp.EpisodeInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.app.viewunite.common.*
import com.bapis.bilibili.app.viewunite.pgcanymodel.*
import com.bapis.bilibili.app.viewunite.pgcanymodel.Rights
import com.bapis.bilibili.app.viewunite.pgcanymodel.Stat
import com.bapis.bilibili.app.viewunite.pgcanymodel.UserStatus
import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny
import com.bapis.bilibili.app.viewunite.v1.*
import com.bapis.bilibili.playershared.BizType
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.NetworkException
import org.json.JSONObject

object ViewUniteReplyHook {
    const val VIEW_PGC_ANY_TYPE_URL =
        "type.googleapis.com/bilibili.app.viewunite.pgcanymodel.ViewPgcAny"
    const val VIEW_UGC_ANY_TYPE_URL =
        "type.googleapis.com/bilibili.app.viewunite.ugcanymodel.ViewUgcAny"

    @JvmStatic
    fun hook(viewReq: ViewReq, viewReply: ViewReply?, error: MossException?): ViewReply? {
        if (error is NetworkException)
            throw error
        if (viewReply != null) {
            val aid = viewReply.arc.aid
            val like = viewReply.reqUser.like
            AutoLikePatch.detail = Pair.create(aid, like)
            if (viewReply.viewBase.bizType == BizType.BIZ_TYPE_UGC)
                AutoLikePatch.autoLikeUnite()
            if (Settings.RemoveChargeButton())
                viewReply.reqUser.clearElecPlusBtn()
            hookArc(viewReply)
            hookTabModules(viewReply)
            hookSupplement(viewReply)
            hookViewConfig(viewReply.viewBase.config)
        }
        if (Settings.UnlockAreaLimit()
            && (viewReply == null || viewReply == ViewReply.getDefaultInstance())
            && viewReq.extraContentMap.let {
                it.containsKey("season_id") || it.containsKey("ep_id")
            }
        ) return unlockThaiBangumi(viewReq)
        if (error != null) throw error else return viewReply
    }

    private fun hookViewConfig(config: Config) {
        val storyEntrance = config.storyEntrance
        if (Settings.DisableStoryFull())
            storyEntrance.arcLandscapeStory = false
        if (Settings.ReplaceStoryVideo()) {
            storyEntrance.playStory = false
            storyEntrance.arcPlayStory = false
        }
        if (config.playerIcon != PlayerIcon.getDefaultInstance() || Settings.SkinJson().isEmpty())
            return
        val playIcon = Settings.SkinJson().runCatchingOrNull {
            toJSONObject()
        }?.optJSONObject("play_icon")
        if (playIcon != null) {
            config.playerIcon = PlayerIcon().apply {
                dragLeftPng = playIcon.optString("drag_left_png")
                dragRightPng = playIcon.optString("drag_right_png")
                middlePng = playIcon.optString("middle_png")
            }
        }
    }

    private fun hookArc(viewReply: ViewReply) {
        if (Settings.AllowDownload()) {
            viewReply.arc.right.run {
                download = true
                onlyVipDownload = false
            }
        }
    }

    private fun hookSupplement(viewReply: ViewReply) {
        val supplementAny = viewReply.supplement
        if (supplementAny.typeUrl == VIEW_UGC_ANY_TYPE_URL) {
            val viewUgcAny = ViewUgcAny.parseFrom(supplementAny.value)
            runCatchingOrNull {
                viewUgcAny.experiment.run {
                    if (Settings.BlockFanGuide())
                        clearFollowGuide()
                }
            }
            viewReply.supplement = newAny(VIEW_UGC_ANY_TYPE_URL, viewUgcAny)
            return
        }
        if (supplementAny.typeUrl != VIEW_PGC_ANY_TYPE_URL)
            return
        val viewPgcAny = ViewPgcAny.parseFrom(supplementAny.value)
        if (!viewPgcAny.hasOgvData()) return
        viewPgcAny.ogvData.run {
            rights.run {
                if (Settings.UnlockAreaLimit()) {
                    areaLimit = 0
                    banAreaShow = 1
                    canWatch = 1
                }
                if (Settings.AllowDownload()) {
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
                        if (Settings.BlockCommentGuide())
                            toRemoveIndexes.add(index)
                    } else if (module.hasActivityEntranceModule()) {
                        if (Settings.BlockBangumiPageAds())
                            toRemoveIndexes.add(index)
                    } else if (module.hasSectionData()) {
                        module.sectionData.episodesList.forEach { it.unlock() }
                    } else if (module.hasRelates()) {
                        PegasusPatch.filterViewUniteRelates(module, viewReply.viewBase.bizType)
                        BLRoutePatch.removePayloadUniteIfNeeded(module.relates.cardsList)
                    } else if (module.hasCovenanter() || module.hasFollowLayer()) {
                        if (Settings.BlockFanGuide())
                            toRemoveIndexes.add(index)
                    } else if (module.hasLiveOrder()) {
                        if (Settings.BlockLiveOrder())
                            toRemoveIndexes.add(index)
                    }
                }
                toRemoveIndexes.asReversed().forEach {
                    tabModule.introduction.removeModules(it)
                }
            } else if (tabModule.hasReply()) {
                if (Settings.BlockCommentGuide())
                    tabModule.reply.replyStyle.clearBadgeType()
            }
        }
        if (Settings.BlockVideoComment()) {
            val replyTabIndex = viewReply.tab.tabModuleList.indexOfFirst { it.hasReply() }
            if (replyTabIndex != -1)
                viewReply.tab.removeTabModule(replyTabIndex)
        }
        if (Settings.BlockActivityTab()) {
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
            if (Settings.UnlockAreaLimit()) {
                areaLimit = 0
                canWatch = 1
                allowDm = 1
            }
            if (Settings.AllowDownload()) {
                allowDownload = 1
            }
        }
    }

    private fun unlockThaiBangumi(viewReq: ViewReq): ViewReply? {
        val extraContent = viewReq.extraContentMap
        val epId = extraContent.getOrDefault("ep_id", "0").toLong()
        val seasonId = extraContent.getOrDefault("season_id", "0")
            .toLong().takeIf { it != 0L } ?: bangumiInfoCache.firstNotNullOfOrNull {
            if (it.value.keys.contains(epId)) it.key else null
        } ?: VideoInfoHolder.currentSeason()?.id ?: 0L
        val (newCode, newResult) = getSeason(seasonId, epId)?.toJSONObject()?.let {
            it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
        } ?: (FAIL_CODE to null)
        Logger.debug { "unlockThaiBangumi, newCode: $newCode, newResult: $newResult" }
        if (isBangumiWithWatchPermission(newResult, newCode)) {
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
                        if (!th && !Settings.BlockVideoComment()) {
                            TabModule().apply {
                                tabType = TabType.TAB_REPLY
                                reply = ReplyTab().apply { title = "评论" }
                            }.let { addTabModule(it) }
                        }
                    }
                    viewBase = ViewBase().apply {
                        bizType = BizType.BIZ_TYPE_PGC
                        config = Config().apply {
                            hookViewConfig(this)
                            if (!th) online = Online().apply {
                                onlineShow = true
                            }
                        }
                        control = PageControl().apply {
                            materialShow = Control()
                            toastShow = Control()
                            upShow = Control()
                        }
                    }
                }
            }.onFailure {
                Logger.error(it) { "unlockThaiBangumi, failed to reconstruct unite view" }
            }.onSuccess {
                Logger.debug { "unlockThaiBangumi, reconstruct view: $it" }
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
        result.optJSONObject("new_ep")?.run {
            newEp = NewEp().apply {
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
                if (Settings.UnlockAreaLimit()) {
                    areaLimit = 0
                    banAreaShow = 1
                    canWatch = 1
                }
                if (Settings.AllowDownload()) {
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
                result.optJSONObject("badge_info")?.run {
                    badgeInfo = BadgeInfo().apply {
                        bgColor = optString("bg_color")
                        bgColorNight = optString("bg_color_night")
                        img = optString("img")
                        text = optString("text")
                    }
                }
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
                val score = result.optJSONObject("rating")?.optString("score").orEmpty()
                this.score = if (score.isNotEmpty()) "${score}分" else ""
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

        // seasons & episodes & sections
        result.optJSONArray("modules")?.forEach { module ->
            val style = module.optString("style")
            val seasonId = result.optLong("season_id")
            when (style) {
                "season" -> Module().apply {
                    type = ModuleType.OGV_SEASONS
                    ogvSeasons = reconstructSeasons(module)
                }.let { addModules(it) }

                "positive" -> Module().apply {
                    type = ModuleType.POSITIVE
                    val more = result.optJSONObject("publish")
                        ?.optString("update_info_desc").orEmpty()
                    sectionData = reconstructSection(module, seasonId, more = more)
                }.let { addModules(it) }

                "section" -> Module().apply {
                    type = ModuleType.SECTION
                    sectionData = reconstructSection(module, seasonId)
                }.let { addModules(it) }
            }
        }
    }

    private fun reconstructSeasons(module: JSONObject) = OgvSeasons().apply {
        module.optJSONObject("data")?.optJSONArray("seasons")?.forEach { season ->
            SerialSeason().apply {
                badge = season.optString("badge")
                season.optJSONObject("badge_info")?.run {
                    badgeInfo = BadgeInfo().apply {
                        bgColor = optString("bg_color")
                        bgColorNight = optString("bg_color_night")
                        text = optString("text")
                    }
                }
                badgeType = season.optInt("badge_type")
                cover = season.optString("cover")
                isNew = season.optInt("is_new")
                link = season.optString("link")
                season.optJSONObject("new_ep")?.run {
                    newEp = NewEp().apply {
                        cover = optString("cover")
                        id = optInt("id")
                        isNew = optInt("is_new")
                        title = optString("title")
                    }
                }
                resource = season.optString("resource")
                seasonId = season.optInt("season_id")
                seasonTitle = season.optString("season_title")
                title = season.optString("title")
            }.let { addSerialSeason(it) }
        }
    }

    private fun reconstructSection(
        module: JSONObject,
        seasonId: Long,
        more: String = module.optString("more"),
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
        this.more = more
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
                    if (Settings.UnlockAreaLimit())
                        areaLimit = 0
                    if (Settings.AllowDownload())
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

            if (episode.has("ep_id")) {
                val epId = episode.optLong("ep_id")
                val subtitles = episode.optJSONArray("subtitles")
                val clipInfo = episode.optJSONObject("jump")
                bangumiInfoCache.compute(seasonId) { _, v ->
                    (v ?: hashMapOf()).apply { this[epId] = EpisodeInfo(subtitles, clipInfo) }
                }
            }
        }
    }
}
