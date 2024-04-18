package app.revanced.bilibili.patches

import android.os.Bundle
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Logger
import app.revanced.bilibili.utils.toJson

@Keep
object HwCodecPatch {
    @JvmStatic
    fun printOptionBundle(bundle: Bundle) {
        if (!Settings.DEBUG.boolean) return
        Logger.debug { "Player options, ${bundle.toJson()}" }
    }

    @JvmStatic
    fun enableHwCodec(origin: Boolean): Boolean {
        Logger.debug { "Forcing enable hw codec: $origin" }
        return if (Settings.FORCE_HW_CODEC.boolean) true else origin
    }
}
