package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class ForceOldPlayerPatch {
    public static boolean forceOldPlayer() {
        return Settings.FORCE_OLD_PLAYER.getBoolean();
    }
}
