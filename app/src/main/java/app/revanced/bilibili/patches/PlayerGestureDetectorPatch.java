package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

public class PlayerGestureDetectorPatch {
    @Keep
    public static boolean disableLongPress() {
        return Settings.DISABLE_PLAYER_LONG_PRESS.getBoolean();
    }
}
