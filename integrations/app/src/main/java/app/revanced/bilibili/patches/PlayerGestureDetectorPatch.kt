package app.revanced.bilibili.patches

import android.view.ScaleGestureDetector
import android.view.View
import android.widget.TextView
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.PlayerHookProvider.getAspectRatio
import app.revanced.bilibili.utils.PlayerHookProvider.restore
import app.revanced.bilibili.utils.PlayerHookProvider.setAspectRatio
import app.revanced.bilibili.utils.PlayerHookProvider.showTextToast
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.callMethod
import app.revanced.bilibili.utils.getObjectField
import app.revanced.bilibili.utils.vibrate
import tv.danmaku.videoplayer.core.videoview.AspectRatio

object PlayerGestureDetectorPatch {
    @JvmStatic
    private var scale = 1f

    @Keep
    @JvmStatic
    private var gestureServiceFieldName = ""

    @Keep
    @JvmStatic
    private var getPlayerMethodName = ""

    init {
        init()
    }

    @Keep
    @JvmStatic
    private fun init() {
    }

    @Keep
    @JvmStatic
    fun disableLongPress(): Boolean {
        return Settings.DISABLE_PLAYER_LONG_PRESS.boolean
    }

    @Keep
    @JvmStatic
    fun scaleToSwitchRatio(): Boolean {
        return Settings.SCALE_TO_SWITCH_RATIO.boolean
    }

    @Keep
    @JvmStatic
    fun onScale(detector: ScaleGestureDetector) {
        scale *= detector.scaleFactor
    }

    @Keep
    @JvmStatic
    fun onScaleBegin(detector: ScaleGestureDetector) {
        scale = 1f
    }

    @Keep
    @JvmStatic
    fun onScaleEnd(listener: Any, detector: ScaleGestureDetector) {
        if (!scaleToSwitchRatio()) return
        val player = listener.getObjectField(gestureServiceFieldName)
            ?.run { callMethod(getPlayerMethodName, this) } ?: return
        val oldRatio = player.getAspectRatio()
        val newRatio =
            if (scale > 1f) AspectRatio.RATIO_CENTER_CROP else AspectRatio.RATIO_ADJUST_CONTENT
        if (oldRatio != newRatio) {
            player.setAspectRatio(newRatio)
            player.restore()
            Utils.runOnMainThread(300L) {
                val text = if (newRatio == AspectRatio.RATIO_CENTER_CROP) {
                    Utils.getString("biliroaming_ratio_fill_done")
                } else {
                    Utils.getString("biliroaming_ratio_restore_done")
                }
                player.showTextToast(text, center = true)
                vibrate(30)
            }
        } else {
            player.restore()
        }
    }

    @Keep
    @JvmStatic
    fun onSetResizeTextVisibility(textView: TextView?) {
        if (scaleToSwitchRatio())
            textView?.visibility = View.GONE
    }
}
