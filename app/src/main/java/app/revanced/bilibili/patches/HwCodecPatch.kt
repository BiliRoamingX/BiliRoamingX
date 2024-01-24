package app.revanced.bilibili.patches

import android.os.Bundle
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper

@Keep
object HwCodecPatch {
    @JvmStatic
    fun printOptionBundle(bundle: Bundle) {
        if (!Settings.DEBUG.boolean) return
        LogHelper.debug { "###Player options start###" }
        bundle.keySet().associateWith { bundle.get(it) }.forEach { (k, v) ->
            LogHelper.debug { "Player option, %50s=%s".format(k, v) }
        }
        LogHelper.debug { "###Player options end###" }
    }

    @JvmStatic
    fun enableHwCodec(origin: Boolean): Boolean {
        LogHelper.debug { "Forcing enable hw codec: $origin" }
        return if (Settings.FORCE_HW_CODEC.boolean) true else origin
    }
}
