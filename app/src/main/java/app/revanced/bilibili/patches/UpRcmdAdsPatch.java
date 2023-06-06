package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class UpRcmdAdsPatch {
    public static boolean blockUpRcmdAds() {
        return Settings.BLOCK_UP_RCMD_ADS.getBoolean();
    }
}
