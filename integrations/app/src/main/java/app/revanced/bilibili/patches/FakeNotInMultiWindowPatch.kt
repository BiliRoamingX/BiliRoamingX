package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings

object FakeNotInMultiWindowPatch {
    @Keep
    @JvmStatic
    fun enabled() = Settings.FakeNotInMultiWindow()
}
