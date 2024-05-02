package app.revanced.bilibili.widget

import android.annotation.SuppressLint
import android.content.Context
import android.view.Gravity
import android.view.KeyEvent
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import app.revanced.bilibili.utils.*

@SuppressLint("SetTextI18n")
class SearchBar(context: Context) : LinearLayout(context) {
    private val keywordInput: EditText
    private val clearButton: ImageView

    var onSearch: (String) -> Unit = {}

    init {
        context.inflateLayout("biliroaming_search_bar", this)
        layoutParams = MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 48.dp)
        setPadding(12.dp, 8.dp, 12.dp, 8.dp)
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
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        keywordInput.showKeyboard()
    }
}
