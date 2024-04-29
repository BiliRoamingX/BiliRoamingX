package app.revanced.bilibili.settings.fragments

import app.revanced.bilibili.patches.json.JSONPatch
import app.revanced.bilibili.settings.Settings

class BlockFollowFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_block_follow")

class BlockModuleFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_block_module")

class CustomizeBottomFragment : BaseDynamicItemsFragment(
    "biliroaming_setting_customize_bottom",
    Settings.SHOWING_BOTTOM_ITEMS, JSONPatch.bottomItems
)

class CustomizeDynamicFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_customize_dynamic")

class CustomizeHomeTabFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_home_tab")

class CustomizeLiveRoomFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_customize_live_room")

class CustomizeMineFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_customize_mine")

class CustomizeSpaceFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_customize_space")

class DisplaySizeFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_display_size")

class FilterCommentFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_filter_comment")

class FilterDynamicByTypeFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_filter_dynamic_by_type")

class FilterHomeRcmdByTypeFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_filter_home_by_type")

class FilterSearchTypeFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_filter_search_type")

class FilterStoryFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_filter_story")

class FullScreenQualityMobileSettingFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_full_screen_quality_mobile")

class FullScreenQualitySettingFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_full_screen_quality")

class HalfScreenQualitySettingFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_half_screen_quality")

class PlayerVersionFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_player_version")

class PurifyLivePopupsFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_live_popups")

class SpaceFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_space")

class SubtitleTranslateServerFragment :
    BiliRoamingBaseSettingFragment("biliroaming_setting_subtitle_translate_server")

class UposSettingFragment : BiliRoamingBaseSettingFragment("biliroaming_setting_upos")
