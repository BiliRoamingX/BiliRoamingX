package app.revanced.bilibili.patches

import android.content.res.Resources
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings

object DpiPatch {
    private val displayScale = Settings.DISPLAY_SIZE.string.toFloat()

    @Keep
    @JvmStatic
    fun onGetDensity(density: Float): Float {
        val scale = displayScale
        if (scale == 0f) return density
        val sysDensity = Resources.getSystem().displayMetrics.density
        val newDensity = sysDensity + scale
        return newDensity
    }
}
