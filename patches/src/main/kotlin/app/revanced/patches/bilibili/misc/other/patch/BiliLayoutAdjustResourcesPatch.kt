package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.*

@Patch(
    name = "Bili adjust layout (resources)",
    description = "调整部分布局UI",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BiliLayoutAdjustResourcesPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        runCatching {
            context.document["res/layout/bili_player_video_setting_select.xml"].use { dom ->
                dom.walk { node ->
                    if (node["android:id"].let { it == "@id/recycler_container" || it == "@id/recycler_view" || it == "@id/recycler_gradient" }) {
                        node["android:layout_height"] = "36dp"
                    }
                }
            }
            context.document["res/layout/bili_player_video_setting_select_item.xml"].use { dom ->
                dom.children().first()["android:layout_height"] = "36dp"
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
        runCatching {
            arrayOf(
                "res/layout/theseus_united_video_details.xml",
                "res/layout/theseus_playlist_activity.xml",
            ).forEach {
                context.document[it].use { dom ->
                    dom.walk { node ->
                        if (node["android:id"] == "@id/tabs") {
                            node["app:tabContentStart"] = "24dp"
                            node["android:layout_marginEnd"] = "4dp"
                            node["app:layout_constraintEnd_toStartOf"] = "@id/danmaku_input_parent"
                            node.removeAttribute("app:layout_constraintEnd_toEndOf")
                        }
                    }
                }
            }
        }
        context.document["res/layout/bili_app_fragment_author_space_header.xml"].use { dom ->
            dom.walk { node ->
                if (node["android:id"] == "@id/desc_layout") {
                    node.children().first()["android:layout_marginLeft"] = "100dp"
                }
            }
        }
        context.document["res/layout/space_follow_and_charge_plus_view.xml"].use { dom ->
            dom.walk { node ->
                if (node["android:id"] == "@id/charge_plus_button") {
                    node["android:layout_width"] = "70dp"
                }
            }
        }
        runCatching {
            arrayOf(
                "res/layout/bili_app_list_item_super_menu_view_group.xml",
                "res/layout/bili_player_video_setting_select.xml",
            ).forEach {
                context.document[it].use { dom ->
                    dom.walk { node ->
                        if (node.tag == "androidx.recyclerview.widget.RecyclerView") {
                            node.tag = "app.revanced.bilibili.widget.ConsumeTouchRecyclerView"
                        }
                    }
                }
            }
        }
    }
}
