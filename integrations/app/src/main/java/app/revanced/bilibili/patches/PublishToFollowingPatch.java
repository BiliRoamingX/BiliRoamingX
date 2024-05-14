package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

public class PublishToFollowingPatch {
    @Keep
    public static boolean shouldAutoSelectOnce(boolean original) {
        if (Settings.DisableAutoSelect.get())
            return false;
        return original;
    }
}
