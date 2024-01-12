package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class TeenagerModePatch {
    public static boolean shouldDisable() {
        return Settings.TEENAGER_MODE_DIALOG.getBoolean();
    }
}
