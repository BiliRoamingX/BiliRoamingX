package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class PlayerVersionPatch {
    public static int playerVersion() {
        return Integer.parseInt(Settings.PLAYER_VERSION.getString());
    }
}
