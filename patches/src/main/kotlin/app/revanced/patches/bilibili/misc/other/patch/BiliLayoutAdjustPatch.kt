package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.children
import app.revanced.util.get
import app.revanced.util.set
import app.revanced.util.walk

@Patch(
    name = "Bili adjust layout",
    description = "调整部分布局UI",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BiliLayoutAdjustPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        runCatching {
            context.document["res/layout/bili_player_video_setting_select.xml"].use { dom ->
                dom.walk { node ->
                    if (node["android:id"].let { it == "@id/recycler_container" || it == "@id/recycler_view" || it == "@id/recycler_gradient" }) {
                        node["android:layout_height"] = "match_parent"
                    }
                }
            }
            context.document["res/layout/bili_player_video_setting_select_item.xml"].use { dom ->
                dom.children().first()["android:layout_height"] = "match_parent"
                dom.walk {
                    if (it["android:id"] == "@id/divider") {
                        it["android:layout_height"] = "12dp"
                        it["app:layout_constraintTop_toTopOf"] = "parent"
                        it["app:layout_constraintBottom_toBottomOf"] = "parent"
                        it.removeAttribute("android:layout_marginTop")
                        it.removeAttribute("android:layout_marginBottom")
                    }
                }
            }
        }
    }
}
