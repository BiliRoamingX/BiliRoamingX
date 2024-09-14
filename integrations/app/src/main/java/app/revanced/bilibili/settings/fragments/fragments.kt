package app.revanced.bilibili.settings.fragments

import app.revanced.bilibili.patches.json.JSONPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.search.annotation.SettingFragment

@SettingFragment("biliroaming_setting_block_follow")
class BlockFollowFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_customize_bottom")
class CustomizeBottomFragment :
    BaseDynamicItemsFragment(Settings.ShowingBottomItems, JSONPatch.bottomItems)

@SettingFragment("biliroaming_setting_customize_dynamic")
class CustomizeDynamicFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_home_tab")
class CustomizeHomeTabFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_customize_live_room")
class CustomizeLiveRoomFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_customize_mine")
class CustomizeMineFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_customize_space")
class CustomizeSpaceFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_display_size")
class DisplaySizeFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_filter_comment")
class FilterCommentFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_filter_dynamic_by_type")
class FilterDynamicByTypeFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_filter_home_by_type")
class FilterHomeRcmdByTypeFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_filter_search_type")
class FilterSearchTypeFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_filter_story_by_type")
class FilterStoryByTypeFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_full_screen_quality_mobile")
class FullScreenQualityMobileSettingFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_full_screen_quality")
class FullScreenQualitySettingFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_half_screen_quality")
class HalfScreenQualitySettingFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_player_version")
class PlayerVersionFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_live_popups")
class PurifyLivePopupsFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_space")
class SpaceFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_subtitle_translate_server")
class SubtitleTranslateServerFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_upos")
class UposSettingFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_story_ui_style")
class StoryUIStyleFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_cover_ratio")
class PegasusCoverRatioFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_video_popups")
class RemoveVideoPopupsFragment : BiliRoamingBaseSettingFragment()

@SettingFragment("biliroaming_setting_purify_search_types")
class PurifySearchTypesFragment : BiliRoamingBaseSettingFragment()
