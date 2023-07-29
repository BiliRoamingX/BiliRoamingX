@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION")
@file:SuppressLint("PrivateApi")

package app.revanced.bilibili.patches

import android.annotation.SuppressLint
import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.graphics.Bitmap
import android.media.session.MediaSession
import android.os.Build
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.lsposed.hiddenapibypass.HiddenApiBypass

object MusicNotificationPatch {

    @JvmStatic
    private val bitmapActionClass: Class<*> =
        Class.forName("android.widget.RemoteViews\$BitmapReflectionAction")

    @JvmStatic
    private val reflectionActionClass: Class<*> =
        Class.forName("android.widget.RemoteViews\$ReflectionAction")

    @JvmStatic
    private val onClickActionClass: Class<*> =
        Class.forName("android.widget.RemoteViews\$SetOnClickResponse")

    class ActionDesc(
        var icon: Int? = null,
        var title: CharSequence? = null,
        var intent: PendingIntent? = null
    )

    private inline fun getId(name: String) = Utils.getResId(name, "id")

    private val stopId = getId("stop")
    private val liveNotificationTitleId = getId("live_notification_title")
    private val liveNotificationSubtitleId = getId("live_notification_subtitle")
    private val liveNotificationUpNameId = getId("live_notification_up_name")
    private val liveNotificationStopId = getId("live_notification_stop")
    private val liveNotificationIconId = getId("live_notification_icon")
    private val liveNotificationStopIconId =
        Utils.getResId("ic_notification_action_delete_gray", "drawable")

    @JvmStatic
    inline fun enabled() = Settings.MUSIC_NOTIFICATION.boolean

    @JvmStatic
    fun onCreateNotification(self: Any, old: Notification?): Notification? {
        if (old == null || !enabled()) return old

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return old

        if (old.extras.containsKey("Primitive")) return old

        val view = old.bigContentView ?: old.contentView ?: return old

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
            HiddenApiBypass.addHiddenApiExemptions("Landroid/widget/RemoteViews")

        val actions = view.getObjectFieldAs<ArrayList<Any>>("mActions")
        val buttons = mapOf(
            // only for live, live only has stop button
            stopId to ActionDesc(),
        )

        val serviceField = self.javaClass.declaredFields.firstOrNull {
            it.type.superclass == Service::class.java
        } ?: return old
        val sessionField = serviceField.type.declaredFields.firstOrNull {
            it.type.name.endsWith("MediaSessionCompat")
        } ?: return old
        val tokenMethod = sessionField.type.declaredMethods.firstOrNull {
            it.returnType.name.endsWith("Token")
        } ?: return old

        return Notification.Builder(
            self.getObjectFieldAs<Service>(serviceField.name), old.channelId
        ).apply {
            setColor(old.color)
            setSmallIcon(old.smallIcon)
            setUsesChronometer(false)
            setOngoing(false) // Important
            setContentIntent(old.contentIntent)
            setVisibility(Notification.VISIBILITY_PUBLIC)
            setWhen(System.currentTimeMillis())
            setCategory(old.category)

            for (action in actions) {
                val viewId = action.getIntField("viewId")
                when (action.javaClass) {
                    bitmapActionClass -> when (viewId) {
                        liveNotificationIconId ->
                            setLargeIcon(action.getObjectFieldAs<Bitmap>("bitmap"))
                    }

                    reflectionActionClass -> when (action.getObjectFieldAs<String>("methodName")) {
                        "setText" -> when (viewId) {
                            liveNotificationTitleId ->
                                setContentTitle(action.getObjectFieldAs<CharSequence>("value"))

                            liveNotificationSubtitleId ->
                                setContentText(action.getObjectFieldAs<CharSequence>("value"))

                            liveNotificationUpNameId ->
                                setSubText(action.getObjectFieldAs<CharSequence>("value"))

                            else -> LogHelper.warn { "Unknown viewId $viewId for setText" }
                        }
                    }

                    onClickActionClass -> {
                        val pendingIntent = action.getObjectField("mResponse")
                            ?.getObjectFieldAs<PendingIntent?>("mPendingIntent")
                        when (viewId) {
                            liveNotificationStopId -> {
                                buttons[stopId]?.icon = liveNotificationStopIconId
                                buttons[stopId]?.intent = pendingIntent
                            }

                            else -> LogHelper.warn { "Unknown viewId $viewId for onClick" }
                        }
                    }
                }
            }

            for (button in buttons) {
                button.value.title = when (button.key) {
                    stopId -> "Stop"
                    else -> null
                }
            }

            var buttonCount = 0
            for (button in buttons) {
                button.value.run {
                    icon?.let {
                        addAction(it, title, intent)
                        buttonCount += 1
                    }
                }
            }
            val mediaStyle = Notification.MediaStyle().setShowActionsInCompactView(
                *when (buttonCount) {
                    0 -> intArrayOf()
                    1 -> intArrayOf(0)
                    2 -> intArrayOf(0, 1)
                    3 -> intArrayOf(0, 1, 2)
                    4 -> intArrayOf(1, 2, 3)
                    else -> intArrayOf(1, 2, 3)
                }
            )
            val token = self.getObjectField(serviceField.name)
                ?.getObjectField(sessionField.name)
                ?.callMethod(tokenMethod.name)?.run {
                    javaClass.declaredFields.firstNotNullOfOrNull {
                        getObjectField(it.name) as? MediaSession.Token
                    }
                }
            token?.let { mediaStyle.setMediaSession(it) }
            style = mediaStyle
            extras.putBoolean("Primitive", true)
        }.build()
    }
}
