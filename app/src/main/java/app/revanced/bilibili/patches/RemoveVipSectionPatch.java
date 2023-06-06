package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class RemoveVipSectionPatch {
    public static boolean removeVipSection() {
        return Settings.REMOVE_VIP_SECTION.getBoolean();
    }
}
