package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.get
import app.revanced.util.walk

@Patch(
    name = "Fix app setting preference layout",
    description = "APP设置部分页面字体大小不统一修复",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BiliSettingPreferenceLayoutPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        // introduced in 7.80.0
        context.document["res/layout/bili_app_layout_preference.xml"].use { dom ->
            dom.walk {
                if (it["android:id"] == "@android:id/title" || it["android:id"] == "@android:id/summary") {
                    it.removeAttribute("android:textSize")
                }
            }
        }
    }
}
