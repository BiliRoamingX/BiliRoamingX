package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

public class RemoveVipSectionPatch {
    @Keep
    public static boolean removeVipSection() {
        return Settings.REMOVE_VIP_SECTION.getBoolean();
    }
}
