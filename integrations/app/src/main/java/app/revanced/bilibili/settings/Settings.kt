package app.revanced.bilibili.settings

import android.graphics.Color
import app.revanced.bilibili.content.BiliDocumentsProvider
import app.revanced.bilibili.utils.*

object Settings {
    @JvmField val Debug = BooleanSetting(key = "debug", needReboot = true)
    @JvmField val ShowHint = BooleanSetting(key = "show_hint")


    // region Group: 解锁番剧限制
    @JvmField val UnlockAreaLimit = BooleanSetting(key = "main_func")
    @JvmField val AllowDownload = BooleanSetting(key = "allow_download", dependency = UnlockAreaLimit)
    @JvmField val AllowMiniPlay = BooleanSetting(key = "allow_mini_play")
    @JvmField val TaiWanServer = StringSetting(key = "tw_server")
    @JvmField val HongKongServer = StringSetting(key = "hk_server")
    @JvmField val ChinaServer = StringSetting(key = "cn_server")
    @JvmField val ThailandServer = StringSetting(key = "th_server")
    @JvmField val UposHost = StringSetting(key = "upos_host")
    @JvmField val SaveThailandHistory =
        BooleanSetting(key = "save_th_history", defValue = true, dependency = UnlockAreaLimit)
    // endregion


    // region Group: 播放器
    @JvmField val HalfScreenQuality = StringSetting(key = "half_screen_quality", defValue = "0")
    @JvmField val FullScreenQuality = StringSetting(key = "full_screen_quality", defValue = "0")
    @JvmField val MobileFullScreenQuality = StringSetting(key = "full_screen_quality_mobile", defValue = "0")
    @JvmField val PlayerVersion = StringSetting(key = "player_version", defValue = "0", needReboot = true)
    @JvmField val RememberLosslessSetting = BooleanSetting(key = "remember_lossless_setting")
    @JvmField val DefaultPlaybackSpeed = FloatSetting(key = "default_playback_speed")
    @JvmField val LongPressPlaybackSpeed = FloatSetting(key = "long_press_playback_speed")
    @JvmField val OverridePlaybackSpeed = StringSetting(key = "playback_speed_override")
    @JvmField val TrialVipQuality = BooleanSetting(key = "trial_vip_quality")
    @JvmField val DisableSegmentedSection = BooleanSetting(key = "disable_segmented_section")
    @JvmField val DisableAutoNextPlay = BooleanSetting(key = "disable_auto_next_play")
    @JvmField val DisablePlayerLongPress = BooleanSetting(key = "disable_player_long_press")
    @JvmField val ScaleToSwitchRatio = BooleanSetting(key = "scale_to_switch_ratio")
    @JvmField val ForceHwCodec = BooleanSetting(key = "force_hw_codec")
    @JvmField val DisableP2PUpload = BooleanSetting(key = "disable_p2p_upload", needReboot = true)
    @JvmField val PreferStableCdn = BooleanSetting(key = "prefer_stable_cdn", needReboot = true)
    @JvmField val AccessKeyMain = StringSetting(key = "access_key_main")
    @JvmField val AccessKeyThailand = StringSetting(key = "access_key_th")
    @JvmField val RememberPlaybackSpeed = BooleanSetting(key = "remember_playback_speed")
    // endregion


    // region Group: 首页
    @JvmField val ShowingBottomItems =
        StringSetSetting(key = "showing_bottom_items", defValue = setOf(Constants.ALL_VALUE))
    @JvmField val HidedHomeTab = StringSetSetting(key = "customize_home_tab")
    @JvmField val FilterHomeRecommend = StringSetSetting(key = "customize_home_recommend")
    @JvmField val HomeFilterApplyToVideo = BooleanSetting(key = "home_filter_apply_to_relate")
    @JvmField val HomeFilterApplyToPopular = BooleanSetting(key = "home_filter_apply_to_popular")
    @JvmField val HomeFilterApplyToStory = BooleanSetting(key = "home_filter_apply_to_story")
    @JvmField val LowPlayCountLimit = LongSetting(key = "hide_low_play_count_recommend_limit")
    @JvmField val ShortDurationLimit = IntSetting(key = "hide_short_duration_recommend_limit")
    @JvmField val LongDurationLimit = IntSetting(key = "hide_long_duration_recommend_limit")
    @JvmField val ShortDurationLimitStory = IntSetting(key = "hide_short_duration_story_limit")
    @JvmField val LongDurationLimitStory = IntSetting(key = "hide_long_duration_story_limit")
    @JvmField val HomeRcmdFilterTitle = StringSetSetting(key = "home_filter_keywords_title")
    @JvmField val HomeRcmdFilterTitleRegexMode = BooleanSetting(key = "home_filter_title_regex_mode")
    @JvmField val HomeRcmdFilterReason = StringSetSetting(key = "home_filter_keywords_reason")
    @JvmField val HomeRcmdFilterReasonRegexMode = BooleanSetting(key = "home_filter_reason_regex_mode")
    @JvmField val HomeRcmdFilterUid = StringSetSetting(key = "home_filter_keywords_uid")
    @JvmField val HomeRcmdFilterUp = StringSetSetting(key = "home_filter_keywords_up")
    @JvmField val HomeRcmdFilterUpRegexMode = BooleanSetting(key = "home_filter_up_regex_mode")
    @JvmField val HomeRcmdFilterCategory = StringSetSetting(key = "home_filter_keywords_category")
    @JvmField val HomeRcmdFilterChannel = StringSetSetting(key = "home_filter_keywords_channel")
    @JvmField val HomeDisableAutoRefresh = BooleanSetting(key = "disable_auto_refresh")
    @JvmField val AddBangumi = BooleanSetting(key = "add_bangumi", needReboot = true)
    @JvmField val AddMovie = BooleanSetting(key = "add_movie", needReboot = true)
    @JvmField val AddKorea = BooleanSetting(key = "add_korea", needReboot = true)
    @JvmField val PurifyGame = BooleanSetting(key = "purify_game", needReboot = true)
    @JvmField val Drawer = BooleanSetting(key = "drawer")
    @JvmField val DisableHomeStory = BooleanSetting(key = "disable_main_page_story", needReboot = true)
    @JvmField val BlockTopActivity =
        BooleanSetting(key = "block_top_activity", needReboot = true, onChange = { value, _ ->
            if (value) deleteTopActivityEntrance()
        })
    @JvmField val BlockRecommendGuidance = BooleanSetting(key = "block_recommend_guidance", needReboot = true)
    @JvmField val BlockPopularTopEntrance = BooleanSetting(key = "block_popular_top_entrance")
    @JvmField val BlockPopularTopicList = BooleanSetting(key = "block_popular_topic_list")
    @JvmField val BlockPopularRcmdUp = BooleanSetting(key = "block_popular_rcmd_up")
    @JvmField val BlockPopularLive = BooleanSetting(key = "block_popular_live")
    @JvmField val BlockHomeRecentUsed = BooleanSetting(key = "block_home_recent_used")
    @JvmField val PegasusCoverRatio = StringSetting(key = "pegasus_cover_ratio", defValue = "0", needReboot = true)
    // endregion


    // region Group: 动态页
    @JvmField val DynPreferVideoTab = BooleanSetting(key = "prefer_video_tab")
    @JvmField val DynPurifyCity = BooleanSetting(key = "purify_city")
    @JvmField val DynPurifyCampus = BooleanSetting(key = "purify_campus")
    @JvmField val DynRmTopicOfAll = BooleanSetting(key = "customize_dynamic_all_rm_topic")
    @JvmField val DynRmUpOfAll = BooleanSetting(key = "customize_dynamic_all_rm_up")
    @JvmField val DynRmUpOfVideo = BooleanSetting(key = "customize_dynamic_video_rm_up")
    @JvmField val DynFilterApplyTopVideo = BooleanSetting(key = "filter_apply_to_video")
    @JvmField val DynRmBlocked = BooleanSetting(key = "customize_dynamic_rm_blocked")
    @JvmField val DynRmAdLink = BooleanSetting(key = "customize_dynamic_rm_ad_link")
    @JvmField val DynRmUpReservation = BooleanSetting(key = "customize_dynamic_rm_up_reservation")
    @JvmField val DynPurifyType = StringSetSetting(key = "customize_dynamic_type")
    @JvmField val DynPurifyContent = StringSetSetting(key = "customize_dynamic_keyword_content")
    @JvmField val DynPurifyContentRegexMode = BooleanSetting(key = "dynamic_content_regex_mode")
    @JvmField val DynPurifyUp = StringSetSetting(key = "customize_dynamic_keyword_upname")
    @JvmField val DynPurifyUid = StringSetSetting(key = "customize_dynamic_keyword_uid")
    @JvmField val DynPurifyTopic = StringSetSetting(key = "customize_dynamic_keyword_topic")
    @JvmField val DynForceOldTabStyle = BooleanSetting(key = "dynamic_force_old_tab", needReboot = true)
    @JvmField val DynRmCm = BooleanSetting(key = "dynamic_rm_cm")
    @JvmField val DynRmStory = BooleanSetting(key = "dynamic_rm_story")
    @JvmField val DynNoUpRecall = BooleanSetting(key = "dynamic_no_up_recall", needReboot = true)
    // endregion


    // region Group: 我的页
    @JvmField val DrawerStyle = StringSetting(key = "drawer_style_value", defValue = "0")
    @JvmField val PurifyDrawerRedDot = BooleanSetting(key = "purify_drawer_reddot")
    @JvmField val RemoveVipSection = BooleanSetting(key = "remove_vip_section")
    @JvmField val ShowingDrawerItems =
        StringSetSetting(key = "showing_drawer_items", defValue = setOf(Constants.ALL_VALUE))
    @JvmField val SwitchDarkTipsDialog = BooleanSetting(key = "switch_dark_dialog")
    @JvmField val AddChannel = BooleanSetting(key = "add_channel", needReboot = true)
    @JvmField val AddPodcast = BooleanSetting(key = "add_podcast")
    @JvmField val BlockTips = BooleanSetting(key = "block_tips")
    // endregion


    // region Group: 直播间
    @JvmField val ForbidSwitchLiveRoom = BooleanSetting(key = "forbid_switch_live_room")
    @JvmField val DisableLiveRoomDoubleClick = BooleanSetting(key = "disable_live_room_double_click")
    @JvmField val PurifyLivePopups = StringSetSetting(key = "purify_live_popups")
    @JvmField val RemoveLiveMask = BooleanSetting(key = "remove_live_mask")
    @JvmField val DefaultMaxQn = BooleanSetting(key = "default_max_qn")
    @JvmField val DisableSlideLeft = BooleanSetting(key = "disable_slide_left")
    @JvmField val DisableAutoFloat = BooleanSetting(key = "disable_auto_float")
    @JvmField val RemoveLiveWatermark = BooleanSetting(key = "remove_live_watermark")
    // endregion


    // region Group: 视频详情页
    @JvmField val AutoLike = BooleanSetting(key = "auto_like")
    @JvmField val SaveCommentImage = BooleanSetting(key = "save_comment_image")
    @JvmField val UnlockPlayLimit = BooleanSetting(key = "play_arc_conf")
    @JvmField val ReplaceStoryVideo = BooleanSetting(key = "replace_story_video")
    @JvmField val DisableStoryFull = BooleanSetting(key = "disable_story_full")
    @JvmField val RemoveCmdDms = BooleanSetting(key = "remove_video_cmd_dms")
    @JvmField val BlockWordSearch = BooleanSetting(key = "block_word_search")
    @JvmField val BlockCommentGuide = BooleanSetting(key = "block_comment_guide")
    @JvmField val BlockVideoComment = BooleanSetting(key = "block_video_comment")
    @JvmField val BlockUpRcmdAds = BooleanSetting(key = "block_up_rcmd_ads")
    @JvmField val BlockBangumiPageAds = BooleanSetting(key = "block_bangumi_page_ads")
    @JvmField val RemoveRelatePromote = BooleanSetting(key = "remove_video_relate_promote")
    @JvmField val RemoveRelateOnlyAv =
        BooleanSetting(key = "remove_video_relate_only_av", dependency = RemoveRelatePromote)
    @JvmField val RemoveRelateNothing =
        BooleanSetting(key = "remove_video_relate_nothing", dependency = RemoveRelateOnlyAv)
    @JvmField val DisableAutoSelect = BooleanSetting(key = "disable_auto_select")
    @JvmField val DisableAutoSubscribe = BooleanSetting(key = "disable_auto_subscribe")
    @JvmField val FilterStory = StringSetSetting(key = "filter_story")
    @JvmField val BlockDmFeedback = BooleanSetting(key = "block_dm_feedback")
    @JvmField val BlockFanGuide = BooleanSetting(key = "block_fan_guide")
    @JvmField val RemoveChargeButton = BooleanSetting(key = "remove_elec_button")
    @JvmField val BlockLiveOrder = BooleanSetting(key = "block_live_order")
    @JvmField val BlockActivityTab = BooleanSetting(key = "block_activity_tab")
    @JvmField val ForceOldFav = BooleanSetting(key = "old_fav", needReboot = true)
    @JvmField val BlockOnlyAtComment = BooleanSetting(key = "block_comment_only_at")
    @JvmField val BlockCommentGoods = BooleanSetting(key = "block_comment_goods")
    @JvmField val BlockCommentUid = StringSetSetting(key = "block_comment_uid")
    @JvmField val BlockCommentUp = StringSetSetting(key = "block_comment_up")
    @JvmField val BlockCommentUpRegexMode = BooleanSetting(key = "block_comment_up_regex_mode")
    @JvmField val BlockCommentContent = StringSetSetting(key = "block_comment_content")
    @JvmField val BlockCommentContentRegexMode = BooleanSetting(key = "block_comment_content_regex_mode")
    @JvmField val BlockCommentUpLevel = IntSetting(key = "block_comment_up_level")
    @JvmField val ExternalDownloader = BooleanSetting(key = "external_downloader")
    @JvmField val ExternalDownloaderName =
        StringSetting(key = "external_downloader_name", defValue = "com.junkfood.seal")
    @JvmField val NoColorfulDanmaku = BooleanSetting(key = "no_colorful_danmaku")
    @JvmField val FakeNotInMultiWindow = BooleanSetting(key = "fake_not_in_multi_window")
    @JvmField val BlockCommentFeedback = BooleanSetting(key = "block_comment_feedback")
    @JvmField val NotLockOrientation = BooleanSetting(key = "not_lock_orientation")
    @JvmField val CheckComment = BooleanSetting(key = "check_comment")
    @JvmField val StoryUIStyle = StringSetting(key = "story_ui_style", defValue = "0")
    @JvmField val UnlockGif = BooleanSetting(key = "unlock_gif")
    // endregion


    // region Group: 用户空间页
    @JvmField val FixSpace = BooleanSetting(key = "fix_space", defValue = true)
    @JvmField val CustomizeSpace = StringSetSetting(key = "customize_space")
    @JvmField val AddArticleTab = BooleanSetting(key = "add_article_tab")
    @JvmField val IgnoreBlacklist = BooleanSetting(key = "ignore_blacklist")
    @JvmField val UidCopyNoPrefix = BooleanSetting(key = "uid_copy_no_prefix")
    // endregion


    // region Group: 搜索页
    @JvmField val PurifySearch = BooleanSetting(key = "purify_search")
    @JvmField val SearchBangumi = BooleanSetting(key = "search_area_bangumi")
    @JvmField val SearchMovie = BooleanSetting(key = "search_area_movie")
    @JvmField val FilterSearchType = StringSetSetting(key = "filter_search_type")
    @JvmField val FilterSearchContent = StringSetSetting(key = "filter_search_content")
    @JvmField val FilterSearchContentRegexMode = BooleanSetting(key = "filter_search_content_regex")
    @JvmField val FilterSearchUp = StringSetSetting(key = "filter_search_up")
    @JvmField val FilterSearchUpRegexMode = BooleanSetting(key = "filter_search_up_regex")
    @JvmField val FilterSearchUid = StringSetSetting(key = "filter_search_uid")
    // endregion


    // region Group: 字幕
    @JvmField val AutoGenerateSubtitle = BooleanSetting(key = "auto_generate_subtitle")
    @JvmField val AutoSelectAISubtitle = BooleanSetting(key = "auto_select_ai_subtitle")
    @JvmField val EnableCustomSubtitleStyle = BooleanSetting(key = "custom_subtitle")
    @JvmField val RemoveSubtitleBg = BooleanSetting(key = "subtitle_remove_bg", defValue = true)
    @JvmField val BoldSubtitleText = BooleanSetting(key = "subtitle_bold", defValue = true)
    @JvmField val SubtitleFontSizePortrait = IntSetting(key = "subtitle_font_size_portrait")
    @JvmField val SubtitleFontSizeLandscape = IntSetting(key = "subtitle_font_size_landscape")
    @JvmField val SubtitleFillColor = StringSetting(key = "subtitle_font_color2", defValue = "FFFFFFFF")
    @JvmField val SubtitleStrokeColor = StringSetting(key = "subtitle_stroke_color", defValue = "FF000000")
    @JvmField val SubtitleStrokeWidth = FloatSetting(key = "subtitle_stroke_width", defValue = 5.0f)
    @JvmField val SubtitleOffset = IntSetting(key = "subtitle_offset")
    @JvmField val SubtitleTranslateServer = StringSetting(key = "subtitle_translate_server", defValue = "microsoft")
    @JvmField val SubtitleImportSave = BooleanSetting(key = "subtitle_import_save")
    // endregion


    // region Group: 杂项
    @JvmField val DisableTeenagerDialog = BooleanSetting(key = "teenagers_mode_dialog")
    @JvmField val CommentCopy = BooleanSetting(key = "comment_copy")
    @JvmField val EnhanceCommentCopy = BooleanSetting(key = "comment_copy_enhance", dependency = CommentCopy)
    @JvmField val BlockUpdate = BooleanSetting(key = "block_update")
    @JvmField val CustomUpdate = BooleanSetting(key = "custom_update", defValue = true)
    @JvmField val BlockFollowButton = StringSetSetting(key = "block_follow_button")
    @JvmField val CustomTheme = BooleanSetting(key = "custom_theme")
    @JvmField val Skin = BooleanSetting(key = "skin")
    @JvmField val TextFoldCommentMaxLines =
        IntSetting(key = "text_fold_comment_max_lines", defValue = Constants.DEF_COMMENT_MAX_LINES)
    @JvmField val TextFoldDynMaxLines =
        IntSetting(key = "text_fold_dyn_max_lines", defValue = Constants.DEF_DYN_MAX_LINES)
    @JvmField val TextFoldDynLinesToAll =
        IntSetting(key = "text_fold_dyn_lines_to_all", defValue = Constants.DEF_DYN_LINES_TO_ALL)
    @JvmField val BlockModules = BooleanSetting(key = "block_modules", onChange = { value, async ->
        if (value) if (async) {
            Utils.async { deleteModuleResources() }
        } else {
            deleteModuleResources()
        }
    })
    @JvmField val BlockModulesException = StringSetSetting(key = "block_modules_exception", dependency = BlockModules)
    @JvmField val MusicNotification = BooleanSetting(key = "music_notification", needReboot = true)
    @JvmField val PurifyShare = BooleanSetting(key = "purify_share")
    @JvmField val FuckMiniProgram = BooleanSetting(key = "mini_program")
    @JvmField val NumberFormat = BooleanSetting(key = "number_format")
    @JvmField val AutoReceiveCoupon = BooleanSetting(key = "auto_receive_coupon")
    @JvmField val DisplaySize = StringSetting(key = "display_size", defValue = "0", needReboot = true)
    @JvmField val CustomSplash = BooleanSetting(key = "custom_splash")
    @JvmField val CustomSplashLogo = BooleanSetting(key = "custom_splash_logo")
    @JvmField val FullSplash = BooleanSetting(key = "full_splash")
    @JvmField val EnableAv = BooleanSetting(key = "enable_av", needReboot = true)
    @JvmField val EnableDocProvider = BooleanSetting(key = "enable_doc_provider", onChange = { value, _ ->
        changeComponentState(BiliDocumentsProvider::class.java, value)
    })
    @JvmField val DisableAvif = BooleanSetting(key = "disable_avif", needReboot = true)
    @JvmField val PurifySplash = BooleanSetting(key = "purify_splash", onChange = { value, async ->
        if (value) if (async) {
            Utils.async { clearSplashConfigCache() }
        } else {
            clearSplashConfigCache()
        }
    })
    @JvmField val DisallowCollectPrivacyInfo = BooleanSetting(key = "disallow_collect_privacy_info", needReboot = true)
    @JvmField val DisableWebViewNonOfficialAlert = BooleanSetting(key = "disable_non_official_alert")
    // endregion


    // region Group: 非配置项
    @JvmField val LosslessEnabled = BooleanSetting(key = "lossless_enabled")
    @JvmField val BgPlayingEnabled = BooleanSetting(key = "bg_playing_enabled")
    @JvmField val CustomColor = IntSetting(key = "biliroaming_custom_color", defValue = Color.WHITE)
    @JvmField val SkinJson = StringSetting(key = "skin_json", dependency = Skin)
    @JvmField val SelectedPlaybackSpeed = FloatSetting(key = "selected_playback_speed")
    // endregion
}
