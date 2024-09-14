package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.integrations.patch.IntegrationsPatch
import app.revanced.util.appendChild
import app.revanced.util.children
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Add back danmaku system font",
    description = "加回弹幕默认使用推荐字体设置",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    dependencies = [IntegrationsPatch::class]
)
object AddBackDmSystemFontPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        if (!IntegrationsPatch.danmakuFontSwitchPreferenceClassExist) return
        context.document["res/xml/player_dm_setting_preference.xml"].use { dom ->
            val targetTag = "tv.danmaku.bili.widget.preference.PreferenceCategoryWithTitle"
            if (dom.getElementsByTagName(targetTag).length == 0) return@use
            val category = dom[targetTag]
            if (category.children().none { e ->
                    e["android:key"].let { it == "@string/pref_key_danmaku_Monospaced" || it == "DanmakuMonospaced" }
                }) {
                category.appendChild("com.bilibili.app.preferences.custom.DanmakuFontSwitchPreference") {
                    this["android:persistent"] = "true"
                    this["android:key"] = "DanmakuMonospaced"
                    this["android:title"] = "弹幕使用推荐字体"
                    this["android:summary"] = "弹幕字体将不跟随系统字体"
                    this["android:defaultValue"] = "true"
                    this["app:migration_settings_type"] = "play"
                }
            }
        }
    }
}
