package app.revanced.patches.bilibili.misc.settings.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.Document
import app.revanced.patches.shared.misc.mapping.ResourceMappingPatch
import app.revanced.util.*

@Patch(
    name = "BiliRoamingX settings entrance",
    description = "哔哩漫游X设置入口",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    dependencies = [ResourceMappingPatch::class]
)
object SettingsResourcePatch : ResourcePatch() {
    var packageName = ""
        private set

    private val extraPreferences = arrayOf(
        "biliroaming_settings.xml",
        "biliroaming_setting_half_screen_quality.xml",
        "biliroaming_setting_full_screen_quality.xml",
        "biliroaming_setting_full_screen_quality_mobile.xml",
        "biliroaming_setting_live_popups.xml",
        "biliroaming_setting_customize_mine.xml",
        "biliroaming_setting_customize_drawer.xml",
        "biliroaming_setting_customize_bottom.xml",
        "biliroaming_setting_customize_home.xml",
        "biliroaming_setting_home_tab.xml",
        "biliroaming_setting_filter_home.xml",
        "biliroaming_setting_filter_home_by_type.xml",
        "biliroaming_setting_customize_dynamic.xml",
        "biliroaming_setting_filter_dynamic_by_type.xml",
        "biliroaming_setting_customize_live_room.xml",
        "biliroaming_setting_customize_player.xml",
        "biliroaming_setting_customize_video_detail.xml",
        "biliroaming_setting_customize_space.xml",
        "biliroaming_setting_unlock_area_limit.xml",
        "biliroaming_setting_upos.xml",
        "biliroaming_setting_space.xml",
        "biliroaming_setting_customize_search.xml",
        "biliroaming_setting_filter_search_type.xml",
        "biliroaming_setting_about.xml",
        "biliroaming_setting_video_detail_filter.xml",
        "biliroaming_setting_block_follow.xml",
        "biliroaming_setting_filter_story.xml",
        "biliroaming_setting_misc.xml",
        "biliroaming_setting_block_module.xml",
        "biliroaming_setting_backup.xml",
        "biliroaming_setting_player_version.xml",
        "biliroaming_setting_display_size.xml",
        "biliroaming_setting_filter_popular.xml",
        "biliroaming_setting_filter_comment.xml",
        "biliroaming_setting_subtitle_translate_server.xml",
        "biliroaming_setting_external_downloader.xml",
    )
    private val layouts = arrayOf(
        "biliroaming_dialog_argb_color_choose.xml",
        "biliroaming_dialog_color_choose.xml",
        "biliroaming_dialog_area_server.xml",
    )

    override fun execute(context: ResourceContext) {
        arrayOf(
            ResourceGroup("xml", *extraPreferences),
            ResourceGroup("layout", *layouts),
            ResourceGroup("drawable", "biliroaming_bg_transparent.webp")
        ).forEach {
            context.copyResources("bilibili", it)
        }
        context.mergeXmlNodes(
            "resources",
            "res/values/strings.xml",
            "bilibili/host/values/strings.xml",
            "bilibili/host/values/strings_raw.xml"
        )
        context.mergeXmlNodes(
            "resources",
            "res/values/arrays.xml",
            "bilibili/host/values/arrays.xml"
        )
        context.document["res/xml/main_preferences.xml"].use {
            it.addBiliRoamingEntrance()
        }
        packageName = context.document["AndroidManifest.xml"].use { it["manifest"]["package"] }
    }

    private fun Document.addBiliRoamingEntrance() {
        this["androidx.preference.PreferenceScreen"].run {
            insertBefore(firstChild, "androidx.preference.PreferenceCategory") {
                appendChild("androidx.preference.PreferenceScreen") {
                    this["android:title"] = "@string/biliroaming_settings_title"
                    this["android:fragment"] = "app.revanced.bilibili.settings.fragments.BiliRoamingSettingsFragment"
                }
            }
        }
    }
}
