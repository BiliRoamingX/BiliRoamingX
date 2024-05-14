package app.revanced.bilibili.patches;

import android.app.Activity;
import android.content.res.Resources;

import androidx.annotation.Keep;

import com.bilibili.bililive.room.ui.roomv3.LiveRoomActivityV3;

import app.revanced.bilibili.patches.main.ApplicationDelegate;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Versions;

public class DpiPatch {
    public static final float displayScale = Float.parseFloat(Settings.DisplaySize.get());

    @Keep
    public static float onCronSetDisplayDensity(float density) {
        var scale = displayScale;
        if (scale == 0f)
            return density;
        Activity topActivity = ApplicationDelegate.getTopActivity();
        if (Versions.ge7_70_0() && topActivity instanceof LiveRoomActivityV3) {
            var sysDensity = Resources.getSystem().getDisplayMetrics().density;
            // for pink client 7.70.0+, live room player need right density to show content.
            return sysDensity + scale;
        } else {
            // return system default density for making subtitle and danmaku size display normally.
            return Resources.getSystem().getDisplayMetrics().density;
        }
    }
}
