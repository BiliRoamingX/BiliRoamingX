package app.revanced.bilibili.utils

import android.animation.AnimatorListenerAdapter
import android.os.Bundle
import androidx.annotation.Keep
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast
import tv.danmaku.videoplayer.core.videoview.AspectRatio

object PlayerHookProvider {
    @Keep
    @JvmStatic
    private var getRenderServiceMethodName = ""

    @Keep
    @JvmStatic
    private var getAspectRatioMethodName = ""

    @Keep
    @JvmStatic
    private var setAspectRatioMethodName = ""

    @Keep
    @JvmStatic
    private var restoreMethodName = ""

    @Keep
    @JvmStatic
    private var getToastServiceMethodName = ""

    @Keep
    @JvmStatic
    private var showToastMethodName = ""

    @Keep
    @JvmStatic
    private var seekToMethodName = ""

    init {
        init()
    }

    @Keep
    @JvmStatic
    private fun init(): Int {
        // keep one register
        return 0
    }

    /**
     * @receiver player instance
     */
    @JvmStatic
    fun Any.getAspectRatio(): AspectRatio {
        return callMethod(getRenderServiceMethodName)!!
            .callMethodAs(getAspectRatioMethodName)
    }

    /**
     * @receiver player instance
     */
    @JvmStatic
    fun Any.setAspectRatio(aspectRatio: AspectRatio) {
        callMethod(getRenderServiceMethodName)
            ?.callMethod(setAspectRatioMethodName, aspectRatio)
    }

    /**
     * @receiver player instance
     */
    @JvmStatic
    fun Any.restore(
        anim: Boolean = true,
        listener: AnimatorListenerAdapter? = null
    ) {
        callMethod(getRenderServiceMethodName)
            ?.callMethod(restoreMethodName, anim, listener)
    }

    /**
     * @receiver player instance
     */
    @JvmStatic
    fun Any.showTextToast(text: String, center: Boolean = false, duration: Long = 1000L) {
        val bundle = Bundle().apply {
            putString("extra_title", text)
            // extra_action_text extra_title_size extra_title_bold extra_background_drawable_res_id
        }
        val toast = PlayerToast(bundle)
        toast.duration = duration
        if (!center) {
            toast.toastType = 20
        } else {
            toast.location = 33
        }
        callMethod(getToastServiceMethodName)?.callMethod(showToastMethodName, toast)
    }

    /**
     * @receiver player service instance
     */
    fun Any.seekTo(position: Int) {
        callMethod(seekToMethodName, position, false)
    }
}
