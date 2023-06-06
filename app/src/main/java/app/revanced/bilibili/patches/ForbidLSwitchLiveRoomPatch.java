package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;

public class ForbidLSwitchLiveRoomPatch {
    public static boolean forbid() {
        return Settings.FORBID_SWITCH_LIVE_ROOM.getBoolean();
    }
}
