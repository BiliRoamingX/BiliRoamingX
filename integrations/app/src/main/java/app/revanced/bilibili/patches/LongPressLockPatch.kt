package app.revanced.bilibili.patches

import android.view.Gravity
import android.view.MotionEvent
import androidx.annotation.Keep
import app.revanced.bilibili.patches.main.Player
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Toasts
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.getFirstFieldByExactType
import com.bilibili.droid.ScreenUtil
import com.bilibili.playerbizcommon.gesture.OnLongPressListener
import com.bilibili.playerbizcommon.gesture.OnLongPressScrollListener
import tv.danmaku.biliplayerv2.ScreenModeType
import tv.danmaku.biliplayerv2.service.IControlContainerService
import tv.danmaku.biliplayerv2.service.IPlayerCoreService
import kotlin.math.abs

@Keep
class LongPressLockPatch(
    val playerControlContainer: Any,
    val longPressListener: OnLongPressListener
): OnLongPressScrollListener {
    private var isLocking = false
    private var downPressCache: MotionEvent? = null
    
    override fun onScroll(
        downPress: MotionEvent?,
        movePress: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        if (!Settings.LockLongPress()) return true
        val startX = downPress?.x ?: 0f
        val startY = downPress?.y ?: 0f
        val endX = movePress.x
        val endY = movePress.y
        val deltaX = endX - startX
        val deltaY = endY - startY
        val screenMode = playerControlContainer.getFirstFieldByExactType<IControlContainerService>().getScreenModeType()
        val context = Utils.getContext()
        val screenHeight = ScreenUtil.getScreenHeight(context)
        val screenHeightMinusPadding = if (screenMode == ScreenModeType.LANDSCAPE_FULLSCREEN) {
            screenHeight * 0.66f
        } else {
            screenHeight * 0.33f
        }
        
        if (abs(deltaY) >= abs(deltaX)
            && endY - startY > 0
            && downPressCache != downPress
            && endY >= screenHeightMinusPadding
        ) {
            when (isLocking) {
                false -> {
                    Toasts.showShort("松手锁定倍速", Gravity.BOTTOM)
                    downPressCache = downPress
                    isLocking = true
                    return true
                }
                true -> {
                    downPressCache = downPress
                    isLocking = false
                    longPressListener.onLongPressEnd(movePress)
                    val service = Player.current() as? IPlayerCoreService?
                    val currentSpeed = service?.getPlaySpeed(false)
                    val defaultSpeed = PlaybackSpeedPatch.defaultSpeed(1.0f)
                    if (currentSpeed != defaultSpeed) {
                        service?.setPlaySpeed(defaultSpeed)
                    }
                    return false
                }
            }
        }
        if (downPressCache == downPress
            && endY <= screenHeightMinusPadding
            && isLocking
        ) {
            downPressCache = null
            isLocking = false
            return false
        }
        return false
    }
    
    // return true to skip long press
    fun onLongPress(): Boolean {
        return isLocking
    }
    
    // return true to skip long press end
    fun onLongPressEnd(): Boolean {
        return isLocking
    }
}