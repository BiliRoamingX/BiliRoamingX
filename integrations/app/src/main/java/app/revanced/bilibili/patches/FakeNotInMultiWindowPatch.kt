package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings

object FakeNotInMultiWindowPatch {
    @Keep
    @JvmStatic
    fun enabled() = Settings.FAKE_NOT_IN_MULTI_WINDOW.boolean
}
