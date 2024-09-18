@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION")
@file:SuppressLint("PrivateApi")

package app.revanced.bilibili.patches

import android.annotation.SuppressLint
import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.graphics.Bitmap
import android.media.session.MediaSession
import android.media.session.PlaybackState
import android.os.Build
import android.support.v4.media.session.PlaybackStateCompat
import android.support.v4.media.session.PlaybackStateCompat.CustomAction
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.lsposed.hiddenapibypass.HiddenApiBypass

object MusicNotificationPatch {

    @JvmStatic
    private val bitmapActionClass: Class<*> by lazy {
        Class.forName("android.widget.RemoteViews\$BitmapReflectionAction")
    }

    @JvmStatic
    private val reflectionActionClass: Class<*> by lazy {
        Class.forName("android.widget.RemoteViews\$ReflectionAction")
    }

    /**
     * not exist on some old platform, eg. Oreo(8.1)
     */
    @JvmStatic
    private val onClickActionClass: Class<*>? by lazy {
        runCatchingOrNull {
            Class.forName("android.widget.RemoteViews\$SetOnClickResponse")
        }
    }

    /**
     * only exist on some old platform briefly, eg. Oreo(8.1), then replaced by SetOnClickResponse.
     *
     * related api: [setOnClickPendingIntent][android.widget.RemoteViews.setOnClickPendingIntent].
     */
    @JvmStatic
    private val onClickPendingIntentActionClass: Class<*>? by lazy {
        runCatchingOrNull {
            Class.forName("android.widget.RemoteViews\$SetOnClickPendingIntent")
        }
    }

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

    private val rewindIconId =
        Utils.getResId("ic_notification_action_rewind_10s_ga7", "drawable")
    private val fastForwardIconId =
        Utils.getResId("ic_notification_action_fast_forward_10s_ga7", "drawable")

    private const val ACTION_REWIND = "Rewind"
    private const val ACTION_FAST_FORWARD = "Forward"

    @JvmStatic
    private val customActionRewind =
        CustomAction(ACTION_REWIND, ACTION_REWIND, rewindIconId, null)

    @JvmStatic
    private val customActionForward =
        CustomAction(ACTION_FAST_FORWARD, ACTION_FAST_FORWARD, fastForwardIconId, null)

    @Keep
    @JvmStatic
    inline fun enabled() = Settings.MusicNotification()

    @JvmStatic
    inline fun needAdaptForTiramisu(): Boolean {
        val tiramisu = Build.VERSION_CODES.TIRAMISU
        val targetSdkVersion = Utils.getContext().applicationInfo.targetSdkVersion
        val systemSdkVersion = Build.VERSION.SDK_INT
        return enabled() && targetSdkVersion >= tiramisu && systemSdkVersion >= tiramisu
    }

    @Keep
    @JvmStatic
    fun onBuildPlaybackState(playbackState: PlaybackStateCompat): PlaybackStateCompat {
        if (!needAdaptForTiramisu()) return playbackState
        val actions = playbackState.actionsForBiliRoaming
        if (actions and PlaybackState.ACTION_PLAY_PAUSE != 0L
            && actions and PlaybackState.ACTION_FAST_FORWARD != 0L
            && actions and PlaybackState.ACTION_REWIND != 0L
        ) {
            // need add custom fast forward and rewind action for tiramisu when target to 33,
            // response of action will handled by patcher
            val customActions = playbackState.customActionsForBiliRoaming
            if (!customActions.contains(customActionRewind))
                customActions.add(customActionRewind)
            if (!customActions.contains(customActionForward))
                customActions.add(customActionForward)
        }
        return playbackState
    }

    private inline fun <T> Any.getObjectFieldAsX(field: String) = try {
        getFieldAs<T>(field)
    } catch (_: NoSuchFieldError) {
        val mFiled = "m${field.replaceFirstChar { it.uppercaseChar() }}"
        getFieldAs(mFiled)
    }

    @Keep
    @JvmStatic
    fun onCreateNotification(self: Any, old: Notification?): Notification? {
        if (old == null || !enabled()) return old

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return old

        if (old.extras.containsKey("Primitive")) return old

        val view = old.bigContentView ?: old.contentView ?: return old

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
            HiddenApiBypass.addHiddenApiExemptions("Landroid/widget/RemoteViews")

        val actions = view.getFieldAs<ArrayList<Any>>("mActions")
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
            self.getFieldAs<Service>(serviceField.name), old.channelId
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
                val viewId = action.getObjectFieldAsX<Int>("viewId")
                when (action.javaClass) {
                    bitmapActionClass -> when (viewId) {
                        liveNotificationIconId ->
                            setLargeIcon(action.getObjectFieldAsX<Bitmap>("bitmap"))
                    }

                    reflectionActionClass -> when (action.getObjectFieldAsX<String>("methodName")) {
                        "setText" -> when (viewId) {
                            liveNotificationTitleId ->
                                setContentTitle(action.getObjectFieldAsX<CharSequence>("value"))

                            liveNotificationSubtitleId ->
                                setContentText(action.getObjectFieldAsX<CharSequence>("value"))

                            liveNotificationUpNameId ->
                                setSubText(action.getObjectFieldAsX<CharSequence>("value"))
                        }
                    }

                    onClickActionClass -> {
                        val pendingIntent = action.getField("mResponse")
                            ?.getFieldAs<PendingIntent?>("mPendingIntent")
                        when (viewId) {
                            liveNotificationStopId -> {
                                buttons[stopId]?.icon = liveNotificationStopIconId
                                buttons[stopId]?.intent = pendingIntent
                            }
                        }
                    }

                    onClickPendingIntentActionClass -> {
                        val pendingIntent = action.getFieldAs<PendingIntent?>("pendingIntent")
                        when (viewId) {
                            liveNotificationStopId -> {
                                buttons[stopId]?.icon = liveNotificationStopIconId
                                buttons[stopId]?.intent = pendingIntent
                            }
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
            val token = self.getField(serviceField.name)
                ?.getField(sessionField.name)
                ?.callMethod(tokenMethod.name)?.run {
                    javaClass.declaredFields.firstNotNullOfOrNull {
                        getField(it.name) as? MediaSession.Token
                    }
                }
            token?.let { mediaStyle.setMediaSession(it) }
            style = mediaStyle
            extras.putBoolean("Primitive", true)
        }.build()
    }
}
