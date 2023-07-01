package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class FavFolderDialogPatch {
    public static boolean shouldChecked(boolean original) {
        if (Settings.DISABLE_AUTO_SUBSCRIBE.getBoolean())
            return false;
        return original;
    }
}
