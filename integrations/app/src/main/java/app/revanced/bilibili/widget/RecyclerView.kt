package app.revanced.bilibili.widget

import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import androidx.recyclerview.widget.RecyclerView
import app.revanced.bilibili.utils.callMethod
import app.revanced.bilibili.utils.runCatchingOrNull

fun RecyclerView.disableChangeAnimations() {
    callMethod("getItemAnimator")?.runCatchingOrNull {
        callMethod("setSupportsChangeAnimations", false)
    }
}

open class RecyclerViewHolder<V : View> @Keep constructor(val view: V) : RecyclerView.ViewHolder(view) {
    @get:Keep
    @get:JvmName("bindingAdapterPosition")
    val bindingAdapterPosition: Int
        get() = super.getBindingAdapterPosition()
}

@Keep
abstract class RecyclerViewAdapter<V : View> : RecyclerView.Adapter<RecyclerViewHolder<V>>() {
    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder<V>
    abstract override fun onBindViewHolder(holder: RecyclerViewHolder<V>, position: Int)
}
