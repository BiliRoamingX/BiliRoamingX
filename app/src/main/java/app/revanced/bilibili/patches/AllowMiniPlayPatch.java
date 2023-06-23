package app.revanced.bilibili.patches;

import com.bilibili.lib.media.resource.PlayConfig;

import app.revanced.bilibili.settings.Settings;

public class AllowMiniPlayPatch {
    public static boolean allowMiniPlay(PlayConfig.PlayConfigType type) {
        return Settings.UNLOCK_PLAY_LIMIT.getBoolean()
                && Settings.ALLOW_MINI_PLAY.getBoolean()
                && type == PlayConfig.PlayConfigType.MINIPLAYER;
    }
}
