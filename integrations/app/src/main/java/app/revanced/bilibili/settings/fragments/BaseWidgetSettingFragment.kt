package app.revanced.bilibili.settings.fragments

import android.graphics.Color
import android.graphics.Typeface
import android.text.InputFilter.LengthFilter
import android.text.TextUtils
import android.text.method.DigitsKeyListener
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.view.inputmethod.EditorInfo
import android.widget.*
import androidx.appcompat.widget.SwitchCompat
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.widget.HdBaseToolbar
import com.bilibili.lib.ui.BaseFragment
import com.bilibili.magicasakura.widgets.TintButton

abstract class BaseWidgetSettingFragment : BaseFragment() {
    protected fun string(idName: String): String = Utils.getString(idName)

    protected inline fun <reified T : View> tintView(): T {
        return T::class.java.tintView()
    }

    protected fun <T : View> Class<T>.tintView(): T {
        val className = name
        val name = if (className.startsWith("android.")) {
            simpleName
        } else className
        return Widgets.createTintView(context, name)
    }

    protected fun categoryTitle(title: String) = tintView<TextView>().apply {
        text = title
        typeface = Typeface.DEFAULT_BOLD
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 18F)
        layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply { topMargin = 10.dp }
    }

    protected fun textInputTitle(title: String) = tintView<TextView>().apply {
        text = title
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 18F)
        layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
    }

    protected fun textInputItem(
        name: String,
        type: Int = EditorInfo.TYPE_CLASS_NUMBER
    ): Pair<LinearLayout, EditText> {
        val layout = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val textView = tintView<TextView>().apply {
            text = name
            setSingleLine()
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
            ellipsize = TextUtils.TruncateAt.END
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val editText = EditText(context).apply {
            setSingleLine()
            inputType = type
            layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply { weight = 1F }
        }
        layout.addView(textView)
        layout.addView(editText)
        return Pair(layout, editText)
    }

    protected fun textInputWithButtonItem(
        name: String,
        text: CharSequence = "",
        hint: CharSequence = "",
        buttonName: String = "",
        type: Int = EditorInfo.TYPE_CLASS_TEXT,
        maxLength: Int = 0,
        digits: String = "",
        onButtonClick: (EditText) -> Unit = {},
    ): Pair<LinearLayout, EditText> {
        val layout = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val textView = tintView<TextView>().apply {
            this.text = name
            setSingleLine()
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val editText = EditText(context).apply {
            setText(text)
            setHint(hint)
            inputType = type
            if (maxLength != 0)
                filters = arrayOf(LengthFilter(maxLength))
            if (digits.isNotEmpty())
                keyListener = DigitsKeyListener.getInstance(digits)
            layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply { weight = 1F }
        }
        val button = TintButton(context).apply {
            setBackgroundTintList(Utils.getResId("Wh0", "color"))
            this.text = buttonName
            onClick { onButtonClick(editText) }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        if (buttonName.isEmpty())
            button.hide()
        layout.addView(textView)
        layout.addView(editText)
        layout.addView(button)
        return Pair(layout, editText)
    }

    private fun keywordTypeHeader(
        group: ViewGroup,
        name: String,
        namMinWidth: Int,
        showRegex: Boolean,
        onAdd: (v: View) -> Unit,
    ): Triple<LinearLayout, Button, SwitchCompat> {
        val layout = LinearLayout(context).apply {
            gravity = Gravity.START
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val nameView = tintView<TextView>().apply {
            text = name
            typeface = Typeface.DEFAULT_BOLD
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            minWidth = namMinWidth
        }
        val addView = TintButton(context).apply {
            setBackgroundTintList(Utils.getResId("Wh0", "color"))
            text = string("biliroaming_keyword_group_add")
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            minWidth = 60.dp
            minimumWidth = 60.dp
            onClick(onAdd)
        }
        val clearView = TintButton(context).apply {
            setBackgroundTintList(Utils.getResId("Wh0", "color"))
            text = string("biliroaming_keyword_group_clear")
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            minWidth = 60.dp
            minimumWidth = 60.dp
            onClick { group.removeAllViews() }
            hide()
        }
        val regexModeView = tintView<TextView>().apply {
            text = string("biliroaming_regex_mode")
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply { marginStart = 4.dp }
        }
        val regexModeSwitch = tintView<SwitchCompat>().apply {
            isSoundEffectsEnabled = false
            isHapticFeedbackEnabled = false
        }
        if (!showRegex) {
            regexModeView.hide()
            regexModeSwitch.hide()
        }
        layout.addView(nameView)
        layout.addView(addView)
        layout.addView(clearView)
        layout.addView(regexModeView)
        layout.addView(regexModeSwitch)
        return Triple(layout, clearView, regexModeSwitch)
    }

    protected fun keywordInputItem(
        parent: ViewGroup,
        keyword: String = "",
        type: Int = EditorInfo.TYPE_CLASS_TEXT,
    ): Pair<LinearLayout, EditText> {
        val layout = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val editText = EditText(context).apply {
            inputType = type
            setText(keyword)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            setSingleLine()
            layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply { weight = 1F }
        }
        val button = TintButton(context).apply {
            setBackgroundTintList(Utils.getResId("Wh0", "color"))
            text = string("biliroaming_keyword_group_delete")
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            minWidth = 60.dp
            minimumWidth = 60.dp
            onClick { parent.removeView(layout) }
        }
        layout.addView(editText)
        layout.addView(button)
        return Pair(layout, editText)
    }

    protected fun LinearLayout.addKeywordGroup(
        name: String,
        namMinWidth: Int = 64.dp,
        showRegex: Boolean = false,
        inputType: Int = EditorInfo.TYPE_CLASS_TEXT,
    ): Pair<ViewGroup, SwitchCompat> {
        val group = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val (_, clearButton, regexModeSwitch) = keywordTypeHeader(
            group, name, namMinWidth, showRegex
        ) {
            keywordInputItem(group, type = inputType).let {
                group.addView(it.first)
                it.second.requestFocus()
            }
        }.also { addView(it.first) }
        group.setOnHierarchyChangeListener(object : ViewGroup.OnHierarchyChangeListener {
            override fun onChildViewAdded(parent: View, child: View) {
                if (group.childCount == 0) {
                    clearButton.hide()
                } else {
                    clearButton.show()
                }
            }

            override fun onChildViewRemoved(parent: View, child: View) {
                if (group.childCount == 0) {
                    clearButton.hide()
                } else {
                    clearButton.show()
                }
            }
        })
        addView(group)
        return Pair(group, regexModeSwitch)
    }

    protected fun switchPrefsItem(title: String): Pair<LinearLayout, SwitchCompat> {
        val layout = LinearLayout(context).apply {
            gravity = Gravity.CENTER_VERTICAL
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val titleView = tintView<TextView>().apply {
            text = title
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            setSingleLine()
            ellipsize = TextUtils.TruncateAt.END
            setPadding(0, 8.dp, 0, 8.dp)
            minHeight = 48.dp
            gravity = Gravity.CENTER_VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply { weight = 1F; marginEnd = 10.dp }
        }
        val switcher = tintView<SwitchCompat>().apply {
            isClickable = false
            isSoundEffectsEnabled = false
            isHapticFeedbackEnabled = false
            setBackgroundColor(Color.TRANSPARENT)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        layout.onClick { switcher.toggle() }
        layout.setRippleBackground()
        layout.addView(titleView)
        layout.addView(switcher)
        return Pair(layout, switcher)
    }

    protected fun seekBarItem(
        name: String,
        current: Int,
        indicator: String = string("biliroaming_text_fold_line"),
        zeroIndicator: String = "",
        max: Int = 100,
    ): Pair<LinearLayout, SeekBar> {
        val layout = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setPadding(0, 8.dp, 0, 8.dp)
        }
        val nameView = tintView<TextView>().apply {
            text = name
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            setSingleLine()
            ellipsize = TextUtils.TruncateAt.END
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val progressView = TextView(context).apply {
            text = if (current == 0 && zeroIndicator.isNotEmpty()) zeroIndicator
            else indicator.format(current)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 14F)
            TypedValue().apply {
                context.theme.resolveAttribute(android.R.attr.textColorSecondary, this, true)
            }.data.let { setTextColor(it) }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }
        val seekBarView = SeekBar(context).apply {
            progress = current
            this.max = max
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setPadding(paddingLeft, 8.dp, paddingRight, 8.dp)
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onStartTrackingTouch(seekBar: SeekBar?) {}
                override fun onStopTrackingTouch(seekBar: SeekBar?) {}
                override fun onProgressChanged(
                    seekBar: SeekBar?, progress: Int, fromUser: Boolean
                ) {
                    if (progress == 0 && zeroIndicator.isNotEmpty())
                        progressView.text = zeroIndicator
                    else
                        progressView.text = indicator.format(progress)
                }
            })
        }
        layout.addView(nameView)
        layout.addView(progressView)
        layout.addView(seekBarView)
        return Pair(layout, seekBarView)
    }

    protected fun saveButton() = tintView<TextView>().apply {
        setBackgroundResource(Utils.getResId("Wh0", "color"))
        setRippleForeground()
        text = string("biliroaming_save")
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
        gravity = Gravity.CENTER
        minHeight = 48.dp
        layoutParams = MarginLayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    protected fun rootViewTemplate(): Triple<LinearLayout, LinearLayout, TextView> {
        val rootView = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }
        if (Utils.isHd()) {
            val title = arguments?.getString(BiliRoamingBaseSettingFragment.EXTRA_TITLE).orEmpty()
                .ifEmpty { string("biliroaming_settings_title") }
            val toolbar = HdBaseToolbar(
                hostContext, title,
                showSearchMenu = false,
                showSearchBar = false
            ) {
                view?.hideKeyboard()
                parentFragmentManager.popBackStack()
            }.apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            }
            rootView.addView(toolbar)
        }
        val contentScrollView = ScrollView(context).apply {
            scrollBarStyle = ScrollView.SCROLLBARS_OUTSIDE_OVERLAY
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0
            ).apply {
                weight = 1F
            }
        }
        rootView.addView(contentScrollView)
        val contentView = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16.dp, 10.dp, 16.dp, 10.dp)
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            )
        }
        contentScrollView.addView(contentView)

        val saveButton = saveButton()
        rootView.addView(saveButton)

        return Triple(rootView, contentView, saveButton)
    }

    protected fun ViewGroup.getKeywords() = children
        .filterIsInstance<ViewGroup>()
        .flatMap { it.children }
        .filterIsInstance<EditText>()
        .map { it.text.toString().trim() }
        .filter { it.isNotEmpty() }
        .toSet()
}
