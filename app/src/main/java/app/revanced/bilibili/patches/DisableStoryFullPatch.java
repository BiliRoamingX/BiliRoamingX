package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

public class DisableStoryFullPatch {
    @Keep
    public static boolean disableStoryFull() {
        return Settings.DISABLE_STORY_FULL.getBoolean();
    }
}
