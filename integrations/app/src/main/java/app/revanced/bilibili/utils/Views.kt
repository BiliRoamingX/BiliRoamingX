@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Build
import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsets
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.annotation.Px

operator fun ViewGroup.iterator(): MutableIterator<View> = object : MutableIterator<View> {
    private var index = 0
    override fun hasNext() = index < childCount
    override fun next() = getChildAt(index++) ?: throw IndexOutOfBoundsException()
    override fun remove() = removeViewAt(--index)
}

val ViewGroup.children: Sequence<View>
    get() = object : Sequence<View> {
        override fun iterator() = this@children.iterator()
    }

inline fun View.updateLayoutParams(block: ViewGroup.LayoutParams.() -> Unit) {
    updateLayoutParams<ViewGroup.LayoutParams>(block)
}

@JvmName("updateLayoutParamsTyped")
inline fun <reified T : ViewGroup.LayoutParams> View.updateLayoutParams(block: T.() -> Unit) {
    val params = layoutParams as T
    block(params)
    layoutParams = params
}

inline fun View.updatePadding(
    @Px left: Int = paddingLeft,
    @Px top: Int = paddingTop,
    @Px right: Int = paddingRight,
    @Px bottom: Int = paddingBottom
) = setPadding(left, top, right, bottom)

inline fun View.hide() {
    visibility = View.GONE
}

inline fun View.show() {
    visibility = View.VISIBLE
}

inline var View.isVisible: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }

inline fun <T : View?> View.findView(idName: String): T =
    findViewById(Utils.getResId(idName, "id"))

inline fun <T : View?> Activity.findView(idName: String): T =
    findViewById(Utils.getResId(idName, "id"))

inline fun View.setRippleBackground() = with(TypedValue()) {
    val attr = Utils.getResId("selectableItemBackground", "attr")
    context.theme.resolveAttribute(attr, this, true)
    setBackgroundResource(resourceId)
}

@SuppressLint("UseCompatLoadingForDrawables")
inline fun View.setRippleForeground() = with(TypedValue()) {
    val attr = Utils.getResId("selectableItemBackground", "attr")
    context.theme.resolveAttribute(attr, this, true)
    foreground = context.getDrawable(resourceId)
}

inline fun View.postDelayed(delayInMillis: Long, crossinline action: () -> Unit): Runnable {
    val runnable = Runnable { action() }
    postDelayed(runnable, delayInMillis)
    return runnable
}

inline fun View.doOnNextLayout(crossinline action: (view: View) -> Unit) {
    addOnLayoutChangeListener(object : View.OnLayoutChangeListener {
        override fun onLayoutChange(
            view: View,
            left: Int,
            top: Int,
            right: Int,
            bottom: Int,
            oldLeft: Int,
            oldTop: Int,
            oldRight: Int,
            oldBottom: Int
        ) {
            view.removeOnLayoutChangeListener(this)
            action(view)
        }
    })
}

inline fun TextView.doOnTextChanged(
    crossinline action: (
        text: CharSequence?,
        start: Int,
        count: Int,
        after: Int
    ) -> Unit
) = addTextChangedListener(onTextChanged = action)

inline fun TextView.addTextChangedListener(
    crossinline beforeTextChanged: (
        text: CharSequence?,
        start: Int,
        count: Int,
        after: Int
    ) -> Unit = { _, _, _, _ -> },
    crossinline onTextChanged: (
        text: CharSequence?,
        start: Int,
        count: Int,
        after: Int
    ) -> Unit = { _, _, _, _ -> },
    crossinline afterTextChanged: (text: Editable?) -> Unit = {}
): TextWatcher {
    val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            afterTextChanged.invoke(s)
        }

        override fun beforeTextChanged(text: CharSequence?, start: Int, count: Int, after: Int) {
            beforeTextChanged.invoke(text, start, count, after)
        }

        override fun onTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) {
            onTextChanged.invoke(text, start, before, count)
        }
    }
    addTextChangedListener(textWatcher)
    return textWatcher
}

inline fun <T : View> T.onClick(crossinline action: (T) -> Unit) {
    setOnClickListener { action(this) }
}

fun View.showKeyboard() = post {
    requestFocus()
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        windowInsetsController?.show(WindowInsets.Type.ime())
    } else postDelayed(50) {
        systemService<InputMethodManager>().showSoftInput(this, 0)
    }
}

fun View.hideKeyboard() {
    systemService<InputMethodManager>().hideSoftInputFromWindow(windowToken, 0)
}
