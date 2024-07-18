package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.appendChild
import app.revanced.util.children
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Inject more scheme",
    description = "向 AndroidManifest.xml 注入更多可处理的 deep link",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object InjectMoreSchemePatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use { dom ->
            dom["application"].children().find {
                it.tagName == "activity" && it["android:name"] == "tv.danmaku.bili.ui.intent.IntentHandlerActivity"
            }?.appendChild("intent-filter") {
                appendChild("action") {
                    this["android:name"] = "android.intent.action.VIEW"
                }
                appendChild("category") {
                    this["android:name"] = "android.intent.category.DEFAULT"
                }
                appendChild("category") {
                    this["android:name"] = "android.intent.category.BROWSABLE"
                }
                //region 直播
                appendChild("data") {
                    this["android:scheme"] = "http"
                    this["android:host"] = "live.bilibili.com"
                }
                appendChild("data") {
                    this["android:scheme"] = "https"
                    this["android:host"] = "live.bilibili.com"
                }
                //endregion
                //region 动态等
                appendChild("data") {
                    this["android:scheme"] = "http"
                    this["android:host"] = "m.bilibili.com"
                }
                appendChild("data") {
                    this["android:scheme"] = "https"
                    this["android:host"] = "m.bilibili.com"
                }
                //endregion
                appendChild("data") {
                    this["android:scheme"] = "http"
                    this["android:host"] = "www.bilibili.com"
                }
                appendChild("data") {
                    this["android:scheme"] = "https"
                    this["android:host"] = "www.bilibili.com"
                }
                appendChild("data") {
                    this["android:scheme"] = "http"
                    this["android:host"] = "t.bilibili.com"
                }
                appendChild("data") {
                    this["android:scheme"] = "https"
                    this["android:host"] = "t.bilibili.com"
                }
            }
        }
    }
}
