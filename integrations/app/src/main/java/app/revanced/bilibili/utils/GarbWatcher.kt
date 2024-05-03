package app.revanced.bilibili.utils

import com.bilibili.lib.ui.garb.Garb
import java.lang.ref.WeakReference

object GarbWatcher {
    fun interface Observer {
        fun onSkinChanged(garb: Garb)
    }

    private val observers = mutableListOf<WeakReference<Observer>>()

    fun onChanged(garb: Garb) {
        synchronized(observers) {
            observers.forEach { it.get()?.onSkinChanged(garb) }
        }
    }

    fun subscribe(observer: Observer) {
        synchronized(observers) {
            if (observers.none { it.get() === observer })
                observers.add(WeakReference(observer))
        }
    }

    fun unsubscribe(observer: Observer) {
        synchronized(observers) {
            val it = observers.iterator()
            while (it.hasNext()) {
                if (it.next().get() === observer) {
                    it.remove()
                    break
                }
            }
        }
    }
}
