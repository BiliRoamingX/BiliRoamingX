package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.settings.Settings

object SettingsTransfer {
    @Keep
    @JvmStatic
    fun debuggable(): Boolean {
        if (!ApplicationDelegate.attached())
            return false
        return Settings.Debug()
    }

    @Keep
    @JvmStatic
    fun shouldShowCommentFollow(original: Boolean): Boolean {
        if (Settings.BlockFollowButton().contains("comment"))
            return false
        return original
    }

    @Keep
    @JvmStatic
    fun shouldShowDynamicFollow(original: Boolean): Boolean {
        if (Settings.BlockFollowButton().contains("dynamic"))
            return false
        return original
    }

    @Keep
    @JvmStatic
    fun fakeNotInMultiWindow(): Boolean {
        return Settings.FakeNotInMultiWindow()
    }

    @Keep
    @JvmStatic
    fun shouldAutoSubscribe(original: Boolean): Boolean {
        if (Settings.DisableAutoSubscribe())
            return false
        return original
    }

    @Keep
    @JvmStatic
    fun shouldAutoSelectOnce(original: Boolean): Boolean {
        if (Settings.DisableAutoSelect())
            return false
        return original
    }

    @Keep
    @JvmStatic
    fun disableAppendTrackingInfo(): Boolean {
        return Settings.PurifyShare()
    }

    @Keep
    @JvmStatic
    fun disableTeenagerDialog(): Boolean {
        return Settings.DisableTeenagerDialog()
    }

    @Keep
    @JvmStatic
    fun blockUpRcmdAds(): Boolean {
        return Settings.BlockUpRcmdAds()
    }

    @Keep
    @JvmStatic
    fun uidCopyNoPrefix(): Boolean {
        return Settings.UidCopyNoPrefix()
    }
}
