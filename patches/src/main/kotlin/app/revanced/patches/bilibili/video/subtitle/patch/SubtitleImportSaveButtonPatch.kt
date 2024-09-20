package app.revanced.patches.bilibili.video.subtitle.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.appendChild
import app.revanced.util.get
import app.revanced.util.set
import app.revanced.util.walk

@Patch(
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object SubtitleImportSaveButtonPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        val subtitleLayouts = arrayOf(
            "bili_player_new_subtitle_function_widget",
            "bili_player_new_multi_subtitle_function_widget",
        )
        var newUI = false
        context.document["res/layout-land/${subtitleLayouts[1]}.xml"].use { dom ->
            dom["androidx.constraintlayout.widget.ConstraintLayout"].walk {
                if (it["android:id"] == "@id/large_subtitle_switch") newUI = true
            }
        }
        arrayOf("res/layout", "res/layout-land").flatMap { dir ->
            subtitleLayouts.map { "$dir/$it.xml" }
        }.forEach { xml ->
            context.document[xml].use { dom ->
                val rootNode = dom["androidx.constraintlayout.widget.ConstraintLayout"]
                if (!newUI) {
                    rootNode.appendChild("com.bilibili.magicasakura.widgets.TintTextView") {
                        this["android:textSize"] = "12sp"
                        this["android:textColor"] = "@color/video_play_control_video_title_text"
                        this["android:id"] = "@+id/biliroaming_import_subtitle"
                        this["android:layout_width"] = "wrap_content"
                        this["android:layout_height"] = "wrap_content"
                        this["android:text"] = "@string/biliroaming_import_subtitle"
                        this["android:layout_marginRight"] = "16dp"
                        this["android:visibility"] = "gone"
                        this["app:layout_constraintTop_toTopOf"] = "@id/subtitle_setting_text"
                        this["app:layout_constraintBottom_toBottomOf"] = "@id/subtitle_setting_text"
                        this["app:layout_constraintRight_toLeftOf"] = "@id/subtitle_setting_text"
                    }
                    rootNode.appendChild("com.bilibili.magicasakura.widgets.TintTextView") {
                        this["android:textSize"] = "12sp"
                        this["android:textColor"] = "@color/video_play_control_video_title_text"
                        this["android:id"] = "@+id/biliroaming_save_subtitle"
                        this["android:layout_width"] = "wrap_content"
                        this["android:layout_height"] = "wrap_content"
                        this["android:text"] = "@string/biliroaming_save_subtitle"
                        this["android:layout_marginRight"] = "16dp"
                        this["android:visibility"] = "gone"
                        this["app:layout_constraintTop_toTopOf"] = "@id/subtitle_setting_text"
                        this["app:layout_constraintBottom_toBottomOf"] = "@id/subtitle_setting_text"
                        this["app:layout_constraintRight_toLeftOf"] = "@id/biliroaming_import_subtitle"
                    }
                } else if (xml.startsWith("res/layout-land")) {
                    rootNode.appendChild("com.bilibili.magicasakura.widgets.TintTextView") {
                        this["android:textSize"] = "14sp"
                        this["android:textColor"] = "@color/Text_white"
                        this["android:id"] = "@+id/biliroaming_import_subtitle"
                        this["android:layout_width"] = "wrap_content"
                        this["android:layout_height"] = "wrap_content"
                        this["android:text"] = "@string/biliroaming_import_subtitle"
                        this["android:layout_marginRight"] = "8dp"
                        this["android:padding"] = "8dp"
                        this["android:visibility"] = "gone"
                        this["app:layout_constraintTop_toTopOf"] = "parent"
                        this["app:layout_constraintBottom_toTopOf"] = "@id/biliroaming_save_subtitle"
                        this["app:layout_constraintRight_toRightOf"] = "parent"
                        this["app:layout_constraintVertical_chainStyle"] = "packed"
                    }
                    rootNode.appendChild("com.bilibili.magicasakura.widgets.TintTextView") {
                        this["android:textSize"] = "14sp"
                        this["android:textColor"] = "@color/Text_white"
                        this["android:id"] = "@+id/biliroaming_save_subtitle"
                        this["android:layout_width"] = "wrap_content"
                        this["android:layout_height"] = "wrap_content"
                        this["android:text"] = "@string/biliroaming_save_subtitle"
                        this["android:layout_marginTop"] = "8dp"
                        this["android:padding"] = "8dp"
                        this["android:visibility"] = "gone"
                        this["app:layout_constraintTop_toBottomOf"] = "@id/biliroaming_import_subtitle"
                        this["app:layout_constraintBottom_toBottomOf"] = "parent"
                        this["app:layout_constraintLeft_toLeftOf"] = "@id/biliroaming_import_subtitle"
                        this["app:layout_constraintRight_toRightOf"] = "@id/biliroaming_import_subtitle"
                    }
                    rootNode.walk {
                        it.removeAttribute("android:alpha")
                        when (val id = it["android:id"]) {
                            "@id/multi_subtitle_switch_text" -> it["android:layout_marginTop"] = "6dp"
                            "@id/multi_subtitle_switch_hint" -> it["android:layout_marginBottom"] = "6dp"
                            "@id/large_subtitle_switch_text" -> {
                                it["android:layout_marginTop"] = "12dp"
                                it["android:layout_marginBottom"] = "12dp"
                            }

                            "@id/double_column_subtitle_background",
                            "@id/recycler_main", "@id/recycler_vice", "@id/recycler_single" -> {
                                it["android:layout_height"] = "wrap_content"
                                it["app:layout_constrainedHeight"] = "true"
                                if (id == "@id/recycler_single")
                                    it["android:layout_marginBottom"] = "21dp"
                            }

                            "@id/subtitle_close" -> {
                                it["android:layout_height"] = "wrap_content"
                                it["android:paddingTop"] = "12dp"
                                it["android:paddingBottom"] = "12dp"
                                it["android:layout_marginBottom"] = "21dp"
                            }
                        }
                    }
                } else {
                    rootNode.appendChild("com.bilibili.magicasakura.widgets.TintTextView") {
                        this["android:textSize"] = "14sp"
                        this["android:textColor"] = "@color/Text_white"
                        this["android:id"] = "@+id/biliroaming_import_subtitle"
                        this["android:layout_width"] = "wrap_content"
                        this["android:layout_height"] = "wrap_content"
                        this["android:text"] = "@string/biliroaming_import_subtitle"
                        this["android:layout_marginTop"] = "8dp"
                        this["android:padding"] = "8dp"
                        this["android:visibility"] = "gone"
                        this["app:layout_constraintTop_toTopOf"] = "parent"
                        this["app:layout_constraintLeft_toLeftOf"] = "parent"
                        this["app:layout_constraintRight_toLeftOf"] = "@id/biliroaming_save_subtitle"
                        this["app:layout_constraintHorizontal_chainStyle"] = "packed"
                        this["app:layout_constraintHorizontal_bias"] = "1"
                    }
                    rootNode.appendChild("com.bilibili.magicasakura.widgets.TintTextView") {
                        this["android:textSize"] = "14sp"
                        this["android:textColor"] = "@color/Text_white"
                        this["android:id"] = "@+id/biliroaming_save_subtitle"
                        this["android:layout_width"] = "wrap_content"
                        this["android:layout_height"] = "wrap_content"
                        this["android:text"] = "@string/biliroaming_save_subtitle"
                        this["android:layout_marginLeft"] = "8dp"
                        this["android:layout_marginRight"] = "8dp"
                        this["android:padding"] = "8dp"
                        this["android:visibility"] = "gone"
                        this["app:layout_constraintTop_toTopOf"] = "@id/biliroaming_import_subtitle"
                        this["app:layout_constraintLeft_toRightOf"] = "@id/biliroaming_import_subtitle"
                        this["app:layout_constraintRight_toRightOf"] = "parent"
                    }
                    rootNode.walk {
                        it.removeAttribute("android:alpha")
                        when (it["android:id"]) {
                            "@id/multi_subtitle_switch_text" -> it["android:layout_marginTop"] = "6dp"
                            "@id/multi_subtitle_switch_hint" -> it["android:layout_marginBottom"] = "6dp"
                            "@id/large_subtitle_switch_text" -> {
                                it["android:layout_marginTop"] = "12dp"
                                it["android:layout_marginBottom"] = "12dp"
                            }

                            "@id/double_column_subtitle_background",
                            "@id/recycler_main", "@id/recycler_vice", "@id/recycler_single" -> {
                                it["android:layout_height"] = "wrap_content"
                                it["app:layout_constrainedHeight"] = "true"
                            }

                            "@id/subtitle_close" -> {
                                it["android:layout_height"] = "wrap_content"
                                it["android:paddingTop"] = "12dp"
                                it["android:paddingBottom"] = "12dp"
                            }
                        }
                    }
                }
            }
        }
        if (!newUI) return
        context.document["res/drawable/shape_rect_solid_ga9_day_color_8dp.xml"].use { dom ->
            dom["solid"]["android:color"] = "@color/Ga9_u_alpha70"
        }
        arrayOf("res/layout", "res/layout-land").map {
            "$it/bili_player_single_col_subtitle_item_holder.xml"
        }.forEach { xml ->
            context.document[xml].use { dom ->
                dom["TextView"].let {
                    it["android:layout_height"] = "wrap_content"
                    it["android:paddingTop"] = "12dp"
                    it["android:paddingBottom"] = "12dp"
                    it["android:textColor"] = "@color/selector_bplayer_text_color_compound_button"
                    it.removeAttribute("android:alpha")
                }
            }
        }
        arrayOf("res/layout", "res/layout-land").flatMap { dir ->
            arrayOf(
                "bili_player_subtitle_main_item_holder",
                "bili_player_subtitle_vice_item_holder",
            ).map { "$dir/$it.xml" }
        }.forEach { xml ->
            context.document[xml].use { dom ->
                dom["TextView"]["android:layout_height"] = "wrap_content"
            }
        }
    }
}
