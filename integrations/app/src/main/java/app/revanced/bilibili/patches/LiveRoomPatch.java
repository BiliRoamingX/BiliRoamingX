package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import com.bilibili.bililive.room.ui.roomv3.player.container.LiveRoomPlayerContainerView;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Logger;
import app.revanced.bilibili.utils.Reflex;

@Keep
public class LiveRoomPatch {
    public static boolean forbidSwitchLiveRoom() {
        return Settings.FORBID_SWITCH_LIVE_ROOM.getBoolean();
    }

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
            Logger.error(e, () -> "disable live room double tap failed");
            return false;
        }
    }

    public static boolean disableSlideLeft() {
        return Settings.DISABLE_SLIDE_LEFT.getBoolean();
    }

    public static boolean disableAutoFloat() {
        return Settings.DISABLE_AUTO_FLOAT.getBoolean();
    }
}
