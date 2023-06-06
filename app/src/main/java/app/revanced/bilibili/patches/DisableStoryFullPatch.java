package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class DisableStoryFullPatch {
    public static boolean disableStoryFull() {
        return Settings.DISABLE_STORY_FULL.getBoolean();
    }
}
