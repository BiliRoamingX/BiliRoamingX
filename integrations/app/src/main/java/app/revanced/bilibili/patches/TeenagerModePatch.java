package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

public class TeenagerModePatch {
    @Keep
    public static boolean shouldDisable() {
        return Settings.DisableTeenagerDialog.get();
    }
}
