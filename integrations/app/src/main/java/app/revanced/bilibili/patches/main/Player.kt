package app.revanced.bilibili.patches.main

import android.app.Activity
import androidx.annotation.Keep
import app.revanced.bilibili.utils.Logger
import java.lang.ref.WeakReference

object Player {
    @JvmStatic
    private var topPlayerRef = WeakReference<Any>(null)

    @JvmStatic
    private val playerRefs = hashMapOf<Int, WeakReference<Any>>()

    /**
     * get last instantiated player
     */
    @JvmStatic
    @Synchronized
    fun top(): Any? = topPlayerRef.get()

    /**
     * get current activity associated player
     */
    @JvmStatic
    @Synchronized
    fun current(): Any? {
        val activity = ApplicationDelegate.getTopActivity()
            ?: return null
        return playerRefs[activity.hashCode()]?.get()
    }

    @Keep
    @JvmStatic
    @Synchronized
    fun add(player: Any) {
        Logger.debug { "Player, add new player instance: $player" }
        topPlayerRef = WeakReference(player)
        val activity = ApplicationDelegate.getTopActivity() ?: return
        playerRefs[activity.hashCode()] = WeakReference(player)
    }

    @JvmStatic
    @Synchronized
    fun remove(activity: Activity) {
        playerRefs.remove(activity.hashCode())
    }
}
