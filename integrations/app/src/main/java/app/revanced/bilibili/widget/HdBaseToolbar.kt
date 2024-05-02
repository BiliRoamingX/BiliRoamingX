package app.revanced.bilibili.widget

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.TextView
import app.revanced.bilibili.utils.findView
import app.revanced.bilibili.utils.inflateLayout
import app.revanced.bilibili.utils.isVisible
import app.revanced.bilibili.utils.onClick
import com.bilibili.magicasakura.widgets.TintFrameLayout

/**
 * should only used by hd client
 */
@SuppressLint("ViewConstructor")
class HdBaseToolbar(context: Context, title: String, private val onBack: (() -> Unit)? = null) :
    TintFrameLayout(context) {
    init {
        context.inflateLayout("hd_bili_app_base_toolbar_layout", this)
        findView<TextView>("hd_tool_bar_title").run {
            isVisible = title.isNotEmpty()
            text = title
        }
        findView<View>("hd_tool_bar_back").run {
            isVisible = onBack != null
            onClick { onBack?.invoke() }
        }
    }
}
