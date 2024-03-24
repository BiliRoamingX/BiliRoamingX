package app.revanced.bilibili.patches;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;

import androidx.annotation.Keep;

import com.bilibili.bililive.room.ui.roomv3.LiveRoomActivityV3;

import app.revanced.bilibili.patches.main.ApplicationDelegate;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Versions;

public class DpiPatch {
    public static final float displayScale = Float.parseFloat(Settings.DISPLAY_SIZE.getString());

    @Keep
    public static float onCronSetDisplayDensity(float density) {
        var scale = displayScale;
        if (scale == 0f || !Versions.ge7_70_0()) return density;
        Activity topActivity = ApplicationDelegate.getTopActivity();
        if (topActivity instanceof LiveRoomActivityV3
                && topActivity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            var sysDensity = Resources.getSystem().getDisplayMetrics().density;
            return sysDensity + scale;
        } else {
            return density;
        }
    }
}
