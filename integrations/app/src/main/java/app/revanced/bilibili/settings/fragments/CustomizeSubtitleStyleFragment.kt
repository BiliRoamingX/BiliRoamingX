@file:Suppress("deprecation")

package app.revanced.bilibili.settings.fragments

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.LinearLayout
import android.widget.TextView
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.dialog.ARGBColorChooseDialog
import app.revanced.bilibili.utils.*
import com.bilibili.magicasakura.widgets.TintButton
import com.yubyf.truetypeparser.TTFFile
import com.yubyf.truetypeparser.get
import java.util.Locale

class CustomizeSubtitleStyleFragment : BaseWidgetSettingFragment() {
    private var fontStatus: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val (root, content, saveButton) = rootViewTemplate()

        val styleSwitch = switchPrefsItem(string("biliroaming_subtitle_style_switch_title"))
            .let { content.addView(it.first); it.second }
        styleSwitch.isChecked = Settings.EnableCustomSubtitleStyle()

        val removeBgSwitch = switchPrefsItem(string("biliroaming_custom_subtitle_remove_bg"))
            .let { content.addView(it.first); it.second }
        removeBgSwitch.isChecked = Settings.RemoveSubtitleBg()

        val boldSwitch = switchPrefsItem(string("biliroaming_custom_subtitle_bold"))
            .let { content.addView(it.first); it.second }
        boldSwitch.isChecked = Settings.BoldSubtitleText()

        fontStatus = fontItem(
            onReset = this::onReset,
            onImport = this::onImport
        ).let { content.addView(it.first); it.second }

        val fillColor = textInputWithButtonItem(
            name = string("biliroaming_custom_subtitle_fill_color"),
            text = Settings.SubtitleFillColor(),
            buttonName = string("biliroaming_custom_subtitle_pick_color"),
            maxLength = 8,
            digits = "0123456789abcdefABCDEF"
        ) {
            ARGBColorChooseDialog(hostContext, it.text.toString().toIntColor()) { color ->
                it.setText(color.toHexColor())
            }.show()
        }.let { content.addView(it.first); it.second }

        val fontSizePortrait = textInputWithButtonItem(
            name = string("biliroaming_custom_subtitle_font_size_portrait"),
            text = Settings.SubtitleFontSizePortrait().toString()
                .let { if (it == "0") "" else it },
            hint = string("biliroaming_custom_subtitle_empty_as_default"),
            type = EditorInfo.TYPE_CLASS_NUMBER,
            maxLength = 3,
        ).let { content.addView(it.first); it.second }

        val fontSizeLandscape = textInputWithButtonItem(
            name = string("biliroaming_custom_subtitle_font_size_landscape"),
            text = Settings.SubtitleFontSizeLandscape().toString()
                .let { if (it == "0") "" else it },
            hint = string("biliroaming_custom_subtitle_empty_as_default"),
            type = EditorInfo.TYPE_CLASS_NUMBER,
            maxLength = 3,
        ).let { content.addView(it.first); it.second }

        val strokeColor = textInputWithButtonItem(
            name = string("biliroaming_custom_subtitle_stroke_color"),
            text = Settings.SubtitleStrokeColor(),
            buttonName = string("biliroaming_custom_subtitle_pick_color"),
            maxLength = 8,
            digits = "0123456789abcdefABCDEF"
        ) {
            ARGBColorChooseDialog(hostContext, it.text.toString().toIntColor()) { color ->
                it.setText(color.toHexColor())
            }.show()
        }.let { content.addView(it.first); it.second }

        val strokeWidth = textInputWithButtonItem(
            name = string("biliroaming_custom_subtitle_stroke_width"),
            text = Settings.SubtitleStrokeWidth().toString(),
            type = EditorInfo.TYPE_CLASS_NUMBER or EditorInfo.TYPE_NUMBER_FLAG_DECIMAL,
            maxLength = 6,
        ).let { content.addView(it.first); it.second }

        val offset = textInputWithButtonItem(
            name = string("biliroaming_custom_subtitle_offset"),
            text = Settings.SubtitleOffset().toString()
                .let { if (it == "0") "" else it },
            hint = string("biliroaming_custom_subtitle_offset_hint"),
            type = EditorInfo.TYPE_CLASS_NUMBER or EditorInfo.TYPE_NUMBER_FLAG_SIGNED,
            maxLength = 4,
        ).let { content.addView(it.first); it.second }

        saveButton.onClick {
            Settings.EnableCustomSubtitleStyle.save(styleSwitch.isChecked)
            Settings.RemoveSubtitleBg.save(removeBgSwitch.isChecked)
            Settings.BoldSubtitleText.save(boldSwitch.isChecked)
            Settings.SubtitleFillColor.save(fillColor.text.toString().ifEmpty {
                Settings.SubtitleFillColor.defValue
            })
            Settings.SubtitleFontSizePortrait.save(
                fontSizePortrait.text.toString().toIntOrNull() ?: 0
            )
            Settings.SubtitleFontSizeLandscape.save(
                fontSizeLandscape.text.toString().toIntOrNull() ?: 0
            )
            Settings.SubtitleStrokeColor.save(strokeColor.text.toString().ifEmpty {
                Settings.SubtitleStrokeColor.defValue
            })
            Settings.SubtitleStrokeWidth.save(
                strokeWidth.text.toString().toFloatOrNull() ?: 0.0F
            )
            Settings.SubtitleOffset.save(offset.text.toString().toIntOrNull() ?: 0)
            SubtitleParamsCache.update()
            parentFragmentManager.popBackStack()
        }

        refreshFontStatus()
        return root
    }

    @Deprecated("Deprecated")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val uri = data?.data
        if (requestCode != 2338 || resultCode != Activity.RESULT_OK || uri == null) return
        context?.contentResolver?.openInputStream(uri)?.use { input ->
            val fontFile = SubtitleParamsCache.FONT_FILE.apply { delete() }
            fontFile.outputStream().use { output -> input.copyTo(output) }
            SubtitleParamsCache.updateFont()
            refreshFontStatus()
        }
    }

    private fun onReset() {
        SubtitleParamsCache.FONT_FILE.delete()
        SubtitleParamsCache.updateFont()
        refreshFontStatus()
    }

    private fun onImport() = try {
        startActivityForResult(
            Intent.createChooser(Intent(Intent.ACTION_GET_CONTENT).apply {
                type = "font/*"
                addCategory(Intent.CATEGORY_OPENABLE)
            }, Utils.getString("biliroaming_choose_font_file_title")),
            2338
        )
    } catch (ex: ActivityNotFoundException) {
        Toasts.showShortWithId("biliroaming_pls_install_file_manager")
    }

    private fun refreshFontStatus() {
        fontStatus?.text = if (SubtitleParamsCache.FONT_FILE.isFile) {
            runCatching {
                TTFFile.open(SubtitleParamsCache.FONT_FILE).let {
                    // val fullName = it.fullNames[Locale.SIMPLIFIED_CHINESE]
                    val family = it.families[Locale.SIMPLIFIED_CHINESE]
                    val subfamily = it.subfamilies[Locale.SIMPLIFIED_CHINESE]
                    if (subfamily != "Regular") "$family $subfamily" else family
                }
            }.onFailure {
                Logger.error(it) { "Font parse filed" }
            }.getOrNull() ?: string("biliroaming_custom_subtitle_status_custom")
        } else {
            string("biliroaming_custom_subtitle_status_default")
        }
    }

    private fun fontItem(
        status: String = "",
        onReset: () -> Unit,
        onImport: () -> Unit
    ): Pair<LinearLayout, TextView> {
        val statusLayout = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
            ).apply { weight = 1F }
        }
        val textView = tintView<TextView>().apply {
            text = string("biliroaming_custom_subtitle_font")
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val statusView = TextView(context).apply {
            text = status
            setSingleLine()
            ellipsize = TextUtils.TruncateAt.END
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 12F)
            TypedValue().apply {
                context.theme.resolveAttribute(android.R.attr.textColorSecondary, this, true)
            }.data.let { setTextColor(it) }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        statusLayout.addView(textView)
        statusLayout.addView(statusView)
        val layout = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            layoutParams = ViewGroup.MarginLayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val resetButton = TintButton(context).apply {
            setBackgroundTintList(Utils.getResId("Wh0", "color"))
            text = string("biliroaming_custom_subtitle_reset")
            onClick { onReset() }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val importButton = TintButton(context).apply {
            setBackgroundTintList(Utils.getResId("Wh0", "color"))
            text = string("biliroaming_custom_subtitle_import")
            onClick { onImport() }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        layout.addView(statusLayout)
        layout.addView(resetButton)
        layout.addView(importButton)
        return Pair(layout, statusView)
    }
}
