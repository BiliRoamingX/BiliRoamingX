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
    name = "Subtitle import and save button",
    description = "注入导入及保存字幕按钮",
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
        arrayOf("res/layout", "res/layout-land").flatMap { dir ->
            subtitleLayouts.map { "$dir/$it.xml" }
        }.forEach { xml ->
            context.document[xml].use { dom ->
                val rootNode = dom["androidx.constraintlayout.widget.ConstraintLayout"]
                var newUI = false
                rootNode.walk { if (it["android:id"] == "@id/large_subtitle_switch") newUI = true }
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
                }
            }
        }
    }
}
