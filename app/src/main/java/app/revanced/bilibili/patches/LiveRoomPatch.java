package app.revanced.bilibili.patches;

import com.bilibili.bililive.room.ui.roomv3.player.container.LiveRoomPlayerContainerView;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.Reflex;

public class LiveRoomPatch {
    public static boolean disableLiveRoomDoubleClick() {
        return Settings.DISABLE_LIVE_ROOM_DOUBLE_CLICK.getBoolean();
    }

    public static boolean onDoubleTap(LiveRoomPlayerContainerView playerView) {
        if (!disableLiveRoomDoubleClick()) return false;
        try {
            var playerBridge = Reflex.callMethod(playerView, "getPlayerCommonBridge");
            if ((Boolean) Reflex.callMethod(playerBridge, "isPlaying")) {
                Reflex.callMethod(playerBridge, "pause");
            } else {
                Reflex.callMethod(playerBridge, "resume");
            }
            return true;
        } catch (Throwable e) {
            LogHelper.error(() -> "disable live room double tap failed", e);
            return false;
        }
    }
}
