package app.revanced.bilibili.utils

import com.bilibili.lib.ui.garb.Garb
import java.util.concurrent.CopyOnWriteArrayList

object GarbWatcher {
    fun interface Observer {
        fun onSkinChanged(garb: Garb): Unit
    }

    private val observers = CopyOnWriteArrayList<Observer>()

    fun onChanged(garb: Garb) {
        observers.forEach { it.onSkinChanged(garb) }
    }

    fun subscribe(observer: Observer) {
        observers.addIfAbsent(observer)
    }

    fun unsubscribe(observer: Observer) {
        observers.remove(observer)
    }
}
