package app.revanced.bilibili.patches

import android.view.ScaleGestureDetector
import android.widget.TextView
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.utils.PlayerHookProvider.getAspectRatio
import app.revanced.bilibili.utils.PlayerHookProvider.restore
import app.revanced.bilibili.utils.PlayerHookProvider.setAspectRatio
import app.revanced.bilibili.utils.PlayerHookProvider.showTextToast
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
    private fun init(): Int {
        // keep one register
        return 0
    }

    @Keep
    @JvmStatic
    fun disableLongPress(): Boolean {
        return Settings.DisablePlayerLongPress()
    }

    @Keep
    @JvmStatic
    fun scaleToSwitchRatio(): Boolean {
        return Settings.ScaleToSwitchRatio()
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
        val player = listener.getField(gestureServiceFieldName)
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
            textView?.hide()
    }
}
