package app.revanced.bilibili.patches

import android.os.Build
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.sigMd5

object UpgradePatch {
    @Keep
    @JvmStatic
    fun customUpdate(): Boolean {
        return Settings.CUSTOM_UPDATE.boolean
                && Build.SUPPORTED_64_BIT_ABIS.isNotEmpty()
                && sigMd5() == Constants.PRE_BUILD_SIG_MD5
    }
}
