@file:JvmName("KtUtils")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import kotlin.math.roundToInt

@get:JvmName("sp2px")
val Int.sp: Int
    inline get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        toFloat(),
        Utils.getContext().resources.displayMetrics
    ).roundToInt()

@get:JvmName("dp2px")
val Int.dp: Int
    inline get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        toFloat(),
        Utils.getContext().resources.displayMetrics
    ).roundToInt()

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

inline fun View.setRippleBackground() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    setBackgroundResource(resourceId)
}

@SuppressLint("UseCompatLoadingForDrawables")
inline fun View.setRippleForeground() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    foreground = context.getDrawable(resourceId)
}

@JvmOverloads
inline fun Context.inflateLayout(
    resIdName: String,
    root: ViewGroup? = null,
    attachToRoot: Boolean = root != null
): View {
    val resource = Utils.getResId(resIdName, "layout")
    return LayoutInflater.from(this).inflate(resource, root, attachToRoot)
}

inline fun <T : View> View.findViewByIdName(idName: String): T =
    findViewById(Utils.getResId(idName, "id"))

inline fun Int.toHexColor() = "%08X".format(0xFFFFFFFF.toInt() and this)

@ColorInt
@JvmOverloads
inline fun String.toIntColor(error: Int = Color.BLACK): Int = try {
    Color.parseColor(if (startsWith('#')) this else "#$this")
} catch (_: IllegalArgumentException) {
    error
}
