package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Utils;

public class BLogPatch {
    @Keep
    public static boolean debuggable() {
        if (Utils.getContext() == null)
            return false;
        return Settings.Debug.get();
    }
}
