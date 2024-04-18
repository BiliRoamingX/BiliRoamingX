package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.children
import app.revanced.util.get
import app.revanced.util.set
import org.w3c.dom.Element

@Patch(
    name = "Make text selectable",
    description = "为部分 TextView 添加可选择属性，方便复制",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object MakeTextSelectablePatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        val headlineLayouts = arrayOf(
            "bangumi_include_info_detail",
            "theseus_ogv_intro_info_headline",
            "theseus_detail_intro_info_headline",
        )
        val nameLayouts = arrayOf(
            "bangumi_databinding_info_name_layout",
            "theseus_ogv_intro_info_name",
            "theseus_detail_intro_info_name",
        )
        val rolesInfoLayouts = arrayOf(
            "bangumi_layout_expandable_text",
            "theseus_detail_layout_expandable_text",
        )
        val introInfoLayouts = arrayOf(
            "bangumi_databind_fragment_intro_info_layout",
            "theseus_ogv_fragment_intro_info",
            "theseus_detail_fragment_intro_info_layout",
        )
        val actorInfoLayouts = arrayOf(
            "bangumi_item_character_avatar_holder",
            "theseus_character_avatar_holder",
        )
        headlineLayouts.forEach {
            runCatching {
                context.document["res/layout/$it.xml"].use { dom ->
                    dom["androidx.constraintlayout.widget.ConstraintLayout"].children().first {
                        it.androidId == "@id/season_title"
                    }["android:textIsSelectable"] = "true"
                }
            }
        }
        nameLayouts.forEach {
            runCatching {
                context.document["res/layout/$it.xml"].use { dom ->
                    dom["LinearLayout"].children().first {
                        it.androidId == "@id/tv_origin_name"
                    }["android:textIsSelectable"] = "true"
                }
            }
        }
        rolesInfoLayouts.forEach {
            runCatching {
                context.document["res/layout/$it.xml"].use { dom ->
                    dom["TextView"]["android:textIsSelectable"] = "true"
                }
            }
        }
        introInfoLayouts.forEach {
            runCatching {
                context.document["res/layout/$it.xml"].use { dom ->
                    dom["LinearLayout"].children().first {
                        it.androidId == "@id/tv_intro"
                    }["android:textIsSelectable"] = "true"
                }
            }
        }
        actorInfoLayouts.forEach {
            runCatching {
                context.document["res/layout/$it.xml"].use { dom ->
                    dom["androidx.constraintlayout.widget.ConstraintLayout"].children().filter {
                        it.androidId == "@id/tv_actor_name" || it.androidId == "@id/tv_actor_name_eng"
                    }.forEach { it["android:textIsSelectable"] = "true" }
                }
            }
        }
    }

    private val Element.androidId: String
        get() = this["android:id"]
}
