package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import com.bilibili.bililive.room.ui.roomv3.player.container.LiveRoomPlayerContainerView;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Logger;
import app.revanced.bilibili.utils.Reflex;

@Keep
public class LiveRoomPatch {
    public static boolean forbidSwitchLiveRoom() {
        return Settings.ForbidSwitchLiveRoom.get();
    }

    public static boolean disableLiveRoomDoubleClick() {
        return Settings.DisableLiveRoomDoubleClick.get();
    }

    public static boolean onDoubleTap(LiveRoomPlayerContainerView playerView) {
        if (!disableLiveRoomDoubleClick()) return false;
        try {
            var playerBridge = Reflex.callMethod(playerView, "getPlayerCommonBridge");
            if (Reflex.callMethod(playerBridge, "isPlaying")) {
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
        return Settings.DisableSlideLeft.get();
    }

    public static boolean disableAutoFloat() {
        return Settings.DisableAutoFloat.get();
    }
}
