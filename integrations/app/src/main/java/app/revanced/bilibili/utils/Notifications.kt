package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.media.AudioAttributes
import android.os.Build
import androidx.annotation.RequiresApi

@Suppress("ConvertObjectToDataObject", "MemberVisibilityCanBePrivate")
sealed class NcChannel(
    val id: String,
    val name: String,
    val importance: Int = NotificationManager.IMPORTANCE_DEFAULT,
    val mute: Boolean = true,
) {
    object BiliRoamingX : NcChannel("biliroamingx", "哔哩漫游X")

    @RequiresApi(Build.VERSION_CODES.O)
    fun toNative(): NotificationChannel {
        val finalId = Utils.getContext().packageName + "." + id
        return NotificationChannel(finalId, name, importance).apply {
            if (mute) {
                val audioAttributes = AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build()
                setSound(null, audioAttributes)
            }
        }
    }
}

@Suppress("DEPRECATION")
fun NotificationManager.buildNotification(
    context: Context,
    channel: NcChannel = NcChannel.BiliRoamingX
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    val native = channel.toNative()
    if (notificationChannels.none { it.id == native.id })
        createNotificationChannel(native)
    Notification.Builder(context, native.id)
} else Notification.Builder(context)

@SuppressLint("NotificationPermission")
fun NotificationManager.showNotification(
    id: Int,
    title: String,
    text: String = "",
    ongoing: Boolean = false,
    time: Long = System.currentTimeMillis(),
    smallIcon: Int = Utils.getResId("ic_notify_msg", "drawable"),
    progress: Triple<Int, Int, Boolean>? = null,
) = buildNotification(Utils.getContext())
    .setShowWhen(true)
    .setWhen(time)
    .setOngoing(ongoing)
    .setSmallIcon(smallIcon)
    .setContentTitle(title)
    .apply {
        if (text.isNotEmpty())
            setContentText(text)
        if (progress != null) {
            val (max, current, indeterminate) = progress
            setProgress(max, current, indeterminate)
        }
    }
    .build().also {
        runCatchingOrNull { notify(id, it) }
    }
