package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class FavAbPatch {
    public static boolean oldFav() {
        return Settings.OLD_FAV.getBoolean();
    }
}
