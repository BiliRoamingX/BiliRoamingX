package app.revanced.bilibili.patches;

import android.app.Activity;

import app.revanced.bilibili.settings.Settings;

public class TeenagerModePatch {
    public static boolean disableDialog(Activity activity) {
        if (Settings.TEENAGER_MODE_DIALOG.getBoolean()) {
            activity.finish();
            return true;
        }
        return false;
    }
}
