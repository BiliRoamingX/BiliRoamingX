package app.revanced.bilibili.patches

import android.os.Bundle
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings

object SharePatch {

    @Keep
    @JvmStatic
    fun disableAppendTrackingInfo(): Boolean {
        return Settings.PurifyShare()
    }

    @Keep
    @JvmStatic
    fun onShareTo(platform: String, params: Bundle): Boolean {
        return false
    }
}
