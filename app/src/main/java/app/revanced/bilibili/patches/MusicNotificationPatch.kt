@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION")
@file:SuppressLint("PrivateApi")

package app.revanced.bilibili.patches

import android.annotation.SuppressLint
import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.media.MediaMetadata
import android.media.session.MediaSession
import android.media.session.PlaybackState
import android.os.Build
import android.os.Bundle
import android.support.v4.media.MediaMetadataCompat
import android.util.Pair
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.lsposed.hiddenapibypass.HiddenApiBypass

object MusicNotificationPatch {
    // by patcher
    @JvmStatic
    private val absMusicServiceClassName = ""

    // by patcher
    @JvmStatic
    private val playerCoreServiceV2ClassName = ""

    // by patcher
    @JvmStatic
    private val backgroundPlayerClassName = ""

    // by patcher
    @JvmStatic
    private val playerServiceClassName = ""

    // by patcher
    @JvmStatic
    private val musicBackgroundPlayerClassName = ""

    // by patcher
    @JvmStatic
    private val setStateMethodName = ""

    // by patcher
    @JvmStatic
    private val seekToMethodName = ""

    // by patcher
    @JvmStatic
    private val defaultSpeedMethodName = ""

    // by patcher
    @JvmStatic
    private val musicWrapperPlayerFieldName = ""

    // by patcher
    @JvmStatic
    private val musicPlayerFieldName = ""

    // by patcher
    @JvmStatic
    private val musicPlayerServiceFieldName = ""

    @JvmStatic
    private val absMusicServiceClass: Class<*>
        get() = Class.forName(absMusicServiceClassName)

    @JvmStatic
    private val playerCoreServiceV2Class: Class<*>
        get() = Class.forName(playerCoreServiceV2ClassName)

    @JvmStatic
    private val backgroundPlayerClass: Class<*>
        get() = Class.forName(backgroundPlayerClassName)

    @JvmStatic
    private val playerServiceClass: Class<*>
        get() = Class.forName(playerServiceClassName)

    @JvmStatic
    private val musicBackgroundPlayerClass: Class<*>
        get() = Class.forName(musicBackgroundPlayerClassName)

    @JvmStatic
    private val metadataField by lazy {
        absMusicServiceClass.declaredFields.firstOrNull {
            it.type == MediaMetadataCompat::class.java
        }?.also { it.isAccessible = true }
    }

    @JvmStatic
    private val metadataBundleField by lazy {
        MediaMetadataCompat::class.java.declaredFields.firstOrNull {
            it.type == Bundle::class.java
        }?.also { it.isAccessible = true }
    }

    @JvmStatic
    private val setStateMethod by lazy {
        absMusicServiceClass.getDeclaredMethod(setStateMethodName, Int::class.javaPrimitiveType)
            .also { it.isAccessible = true }
    }

    @JvmStatic
    private val getDurationMethod by lazy {
        try {
            playerCoreServiceV2Class.getDeclaredMethod("getDuration").name
        } catch (_: Throwable) {
            "i"
        }
    }

    @JvmStatic
    private val getCurrentPositionMethod by lazy {
        try {
            playerCoreServiceV2Class.getDeclaredMethod("getCurrentPosition").name
        } catch (_: Throwable) {
            "j"
        }
    }

    @JvmStatic
    private val notificationServiceField by lazy {
        absMusicServiceClass.declaredFields.firstOrNull {
            backgroundPlayerClass.interfaces.contains(it.type)
        }
    }

    @JvmStatic
    private val corePlayerMethod by lazy {
        playerServiceClass.declaredMethods.firstOrNull {
            playerCoreServiceV2Class.interfaces.contains(it.returnType)
        }
    }

    @JvmStatic
    private val playerServiceField by lazy {
        backgroundPlayerClass.declaredFields.firstOrNull {
            it.type == playerServiceClass
        }
    }

    @JvmStatic
    private val bitmapActionClass: Class<*> =
        Class.forName("android.widget.RemoteViews\$BitmapReflectionAction")

    @JvmStatic
    private val reflectionActionClass: Class<*> =
        Class.forName("android.widget.RemoteViews\$ReflectionAction")

    @JvmStatic
    private val onClickActionClass: Class<*> =
        Class.forName("android.widget.RemoteViews\$SetOnClickResponse")

    @JvmStatic
    private fun getCorePlayer(absMusicService: Any?): Any? {
        return absMusicService?.getObjectField(notificationServiceField?.name)?.runCatchingOrNull {
            when (javaClass) {
                backgroundPlayerClass -> getObjectField(playerServiceField?.name)
                musicBackgroundPlayerClass -> getObjectField(musicWrapperPlayerFieldName)
                    ?.getObjectField(musicPlayerFieldName)
                    ?.getObjectField(musicPlayerServiceFieldName)

                else -> null
            }?.callMethod(corePlayerMethod?.name)
        }
    }

    class ActionDesc(
        var icon: Int? = null,
        var title: CharSequence? = null,
        var intent: PendingIntent? = null
    )

    private inline fun getId(name: String) = Utils.getResId(name, "id")

    private val iconId = getId("icon")
    private val notificationIconId = getId("notification_icon")
    private val text1Id = getId("text1")
    private val text2Id = getId("text2")
    private val text3Id = getId("text3")
    private val notificationText1Id = getId("notification_text1")
    private val notificationText2Id = getId("notification_text2")
    private val notificationText3Id = getId("notification_text3")
    private val action1Id = getId("action1")
    private val action2Id = getId("action2")
    private val action3Id = getId("action3")
    private val action4Id = getId("action4")
    private val actionLikeId = getId("action_like")
    private val notificationAction1Id = getId("notification_action1")
    private val notificationAction2Id = getId("notification_action2")
    private val notificationAction3Id = getId("notification_action3")
    private val notificationAction4Id = getId("notification_action4")
    private val notificationActionLikeId = getId("notification_action_like")

    private val stopId = getId("stop")
    private val liveNotificationTitleId = getId("live_notification_title")
    private val liveNotificationSubtitleId = getId("live_notification_subtitle")
    private val liveNotificationUpNameId = getId("live_notification_up_name")
    private val liveNotificationStopId = getId("live_notification_stop")
    private val liveNotificationIconId = getId("live_notification_icon")
    private val liveNotificationStopIconId =
        Utils.getResId("ic_notification_action_delete_gray", "drawable")

    @JvmStatic
    private var position = 0L

    @JvmStatic
    private var speed = 1f

    @JvmStatic
    private var duration = 0L

    @JvmStatic
    private var lastState = 0

    @JvmStatic
    private var absMusicService: Any? = null

    init {
        initHookInfo()
    }

    // by patcher
    @JvmStatic
    private fun initHookInfo() {
    }

    @JvmStatic
    inline fun enabled() = Settings.MUSIC_NOTIFICATION.boolean

    @JvmStatic
    fun onUpdateMetadata(absMusicService: Any, flag: Boolean): Boolean {
        if (!enabled()) return flag
        val bundle = metadataField?.get(absMusicService)
            ?.getObjectFieldAs<Bundle>(metadataBundleField?.name)
            ?: return flag
        val currentDuration = bundle.getLong(MediaMetadata.METADATA_KEY_DURATION)
        if (currentDuration != 0L) return flag
        duration = getCorePlayer(absMusicService)?.callMethodAs<Long>(getDurationMethod) ?: 0L
        bundle.putLong(MediaMetadata.METADATA_KEY_DURATION, duration)
        return true
    }

    @JvmStatic
    fun onSeekComplete() {
        if (!enabled()) return
        absMusicService?.let { s -> setStateMethod?.invoke(s, lastState) }
    }

    @JvmStatic
    fun onSeekTo(position: Long) {
        if (!enabled()) return
        this.position = position
        getCorePlayer(absMusicService)?.run {
            try {
                callMethod(seekToMethodName, position.toInt())
            } catch (_: Throwable) {
                callMethod(seekToMethodName, position.toInt(), false)
            }
        }
        absMusicService?.let { s -> setStateMethod?.invoke(s, lastState) }
    }

    @JvmStatic
    fun onSetState(absMusicService: Any, state: Int) {
        if (!enabled()) return
        lastState = state
        getCorePlayer(absMusicService)?.run {
            position = callMethodAs<Int>(getCurrentPositionMethod).toLong()
            speed = try {
                callMethodAs(defaultSpeedMethodName, true)
            } catch (_: Throwable) {
                callMethodAs(defaultSpeedMethodName)
            }
        }
    }

    @JvmStatic
    fun onNewAbsMusicService(instance: Any) {
        if (!enabled()) return
        absMusicService = instance
    }

    @JvmStatic
    fun onDestroyMusicService() {
        if (!enabled()) return
        duration = 0L
        position = 0L
        speed = 1.0f
        absMusicService = null
    }

    @JvmStatic
    fun onGetFlag(flag: Long): Long {
        return if (enabled()) PlaybackState.ACTION_SEEK_TO or flag else flag
    }

    @JvmStatic
    fun onSetPlaybackState(position: Long, speed: Float): Pair<Long, Float> {
        return if (enabled())
            Pair.create(this.position, this.speed)
        else
            Pair.create(position, speed)
    }

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
            action1Id to ActionDesc(),
            action2Id to ActionDesc(),
            action3Id to ActionDesc(),
            action4Id to ActionDesc(),
            actionLikeId to ActionDesc(),
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
                        iconId, notificationIconId, liveNotificationIconId ->
                            setLargeIcon(action.getObjectFieldAs<Bitmap>("bitmap"))
                    }

                    reflectionActionClass -> when (action.getObjectFieldAs<String>("methodName")) {
                        "setText" -> when (viewId) {
                            text1Id, notificationText1Id, liveNotificationTitleId ->
                                setContentTitle(action.getObjectFieldAs<CharSequence>("value"))

                            text2Id, notificationText2Id, liveNotificationSubtitleId ->
                                setContentText(action.getObjectFieldAs<CharSequence>("value"))

                            text3Id, notificationText3Id, liveNotificationUpNameId ->
                                setSubText(action.getObjectFieldAs<CharSequence>("value"))

                            else -> LogHelper.warn { "Unknown viewId $viewId for setText" }
                        }

                        "setImageResource" -> when (viewId) {
                            action1Id, notificationAction1Id ->
                                buttons[action1Id]?.icon = action.getObjectFieldAs<Int>("value")

                            action2Id, notificationAction2Id ->
                                buttons[action2Id]?.icon = action.getObjectFieldAs<Int>("value")

                            action3Id, notificationAction3Id ->
                                buttons[action3Id]?.icon = action.getObjectFieldAs<Int>("value")

                            action4Id, notificationAction4Id ->
                                buttons[action4Id]?.icon = action.getObjectFieldAs<Int>("value")

                            actionLikeId, notificationActionLikeId ->
                                buttons[actionLikeId]?.icon = action.getObjectFieldAs<Int>("value")

                            iconId, notificationIconId, liveNotificationIconId -> {
                                val originIcon = BitmapFactory.decodeResource(
                                    Utils.getContext().resources,
                                    action.getObjectFieldAs("value")
                                )
                                val largeIcon = originIcon.copy(originIcon.config, true)
                                largeIcon.eraseColor(old.color)
                                val canvas = Canvas(largeIcon)
                                canvas.drawBitmap(originIcon, 0f, 0f, null)
                                setLargeIcon(largeIcon)
                                originIcon.recycle()
                            }

                            else -> LogHelper.warn { "Unknown viewId $viewId for setImageResource" }
                        }
                    }

                    onClickActionClass -> {
                        val pendingIntent = action.getObjectField("mResponse")
                            ?.getObjectFieldAs<PendingIntent?>("mPendingIntent")
                        when (viewId) {
                            action1Id, notificationAction1Id ->
                                buttons[action1Id]?.intent = pendingIntent

                            action2Id, notificationAction2Id ->
                                buttons[action2Id]?.intent = pendingIntent

                            action3Id, notificationAction3Id ->
                                buttons[action3Id]?.intent = pendingIntent

                            action4Id, notificationAction4Id ->
                                buttons[action4Id]?.intent = pendingIntent

                            actionLikeId, notificationActionLikeId ->
                                buttons[actionLikeId]?.intent = pendingIntent

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
                    action1Id -> "Mode"
                    action2Id -> "Previous"
                    action3Id -> "Pause/Play"
                    action4Id -> "Next"
                    actionLikeId -> "Like"
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
