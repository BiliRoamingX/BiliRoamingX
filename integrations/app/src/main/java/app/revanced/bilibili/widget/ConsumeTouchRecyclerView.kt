package app.revanced.bilibili.widget

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.annotation.Keep
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@Keep
class ConsumeTouchRecyclerView : RecyclerView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onInterceptTouchEvent(e: MotionEvent): Boolean {
        if (e.actionMasked == MotionEvent.ACTION_DOWN) {
            if (scrollable())
                parent?.requestDisallowInterceptTouchEvent(true)
            else return false
        }
        return super.onInterceptTouchEvent(e)
    }

    private fun scrollable(): Boolean {
        val layoutManager = layoutManager
        if (layoutManager !is LinearLayoutManager)
            return false
        val orientation = layoutManager.orientation
        if (orientation == LinearLayoutManager.HORIZONTAL && (canScrollHorizontally(1) || canScrollHorizontally(-1)))
            return true
        else if (orientation == LinearLayoutManager.VERTICAL && (canScrollVertically(1) || canScrollVertically(-1)))
            return true
        return false
    }
}
