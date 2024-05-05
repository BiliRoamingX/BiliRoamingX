package app.revanced.bilibili.widget

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.Gravity
import android.view.KeyEvent
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import app.revanced.bilibili.utils.*
import com.bilibili.lib.ui.garb.Garb

@SuppressLint("SetTextI18n", "ViewConstructor")
class SearchBar(context: Context, hd: Boolean = false) : LinearLayout(context) {
    private val keywordInput: EditText
    private val clearButton: ImageView

    var onSearch: (String) -> Unit = {}

    init {
        context.inflateLayout("biliroaming_search_bar", this)
        layoutParams = MarginLayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
        )
        gravity = Gravity.CENTER_VERTICAL
        orientation = HORIZONTAL
        keywordInput = findView("biliroaming_keyword")
        clearButton = findView("biliroaming_clear")
        clearButton.onClick { keywordInput.setText("") }
        keywordInput.doOnTextChanged { text, _, _, _ ->
            onSearch(text.toString().trim())
            clearButton.isVisible = !text.isNullOrEmpty()
        }
        keywordInput.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH || event.action == KeyEvent.KEYCODE_ENTER) {
                v.hideKeyboard()
                true
            } else false
        }
        tintKeywordInput()
        tintClearButton()
        if (hd) {
            clearButton.updateLayoutParams {
                width = 34.dp
                height = 34.dp
            }
            keywordInput.updateLayoutParams<MarginLayoutParams> {
                topMargin = 2.dp
                bottomMargin = 2.dp
            }
        }
    }

    fun tintKeywordInput(garb: Garb = Themes.currentGarb()) {
        if (!garb.isPure && !garb.isPrimaryOnly) {
            keywordInput.setTextColor(ColorStateList.valueOf(garb.fontColor))
        } else if (garb.id.let { it != 1L && it != 8L }) {
            keywordInput.setTextColor(ColorStateList.valueOf(Color.WHITE))
        } else {
            keywordInput.setTextColor(
                Utils.getColorStateList(context, "theme_color_primary_tr_title")
            )
        }
    }

    fun tintClearButton(garb: Garb = Themes.currentGarb()) {
        if (!garb.isPure && !garb.isPrimaryOnly) {
            clearButton.imageTintList = ColorStateList.valueOf(garb.fontColor)
        } else if (garb.id.let { it != 1L && it != 8L }) {
            clearButton.imageTintList = ColorStateList.valueOf(Color.WHITE)
        } else {
            clearButton.imageTintList =
                Utils.getColorStateList(context, "theme_color_primary_tr_icon")
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        keywordInput.showKeyboard()
    }
}
