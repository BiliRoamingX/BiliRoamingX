package app.revanced.bilibili.patches;

import android.content.res.Resources;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

public class DpiPatch {
    public static final float displayScale = Float.parseFloat(Settings.DisplaySize.get());

    @Keep
    public static float onCronSetDisplayDensity(float density) {
        var scale = displayScale;
        if (scale == 0f)
            return density;
        if (density == 1.0f)
            return density;
        var sysDensity = Resources.getSystem().getDisplayMetrics().density;
        return sysDensity + scale;
    }
}
