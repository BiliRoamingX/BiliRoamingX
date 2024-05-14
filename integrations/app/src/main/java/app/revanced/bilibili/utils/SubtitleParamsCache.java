package app.revanced.bilibili.utils;

import android.graphics.Color;
import android.graphics.Typeface;

import java.io.File;

import app.revanced.bilibili.settings.Settings;

public class SubtitleParamsCache {
    public static final File FONT_FILE;
    public static boolean styleSwitch = false;
    public static boolean removeBg = false;
    public static Typeface subtitleFont = null;
    public static float strokeWidth = 0f;
    public static boolean boldText = false;
    public static float fontSizeLandscape = 0f;
    public static float fontSizePortrait = 0f;
    public static int fillColor = 0;
    public static int strokeColor = 0;

    static {
        FONT_FILE = new File(Utils.getContext().getExternalFilesDir(null), "subtitle.font");
        update();
    }

    public static void update() {
        styleSwitch = Settings.EnableCustomSubtitleStyle.get();
        removeBg = Settings.RemoveSubtitleBg.get();
        strokeWidth = Settings.SubtitleStrokeWidth.get();
        boldText = Settings.BoldSubtitleText.get();
        fontSizePortrait = KtUtils.sp2px(Settings.SubtitleFontSizePortrait.get());
        fontSizeLandscape = KtUtils.sp2px(Settings.SubtitleFontSizeLandscape.get());
        fillColor = KtUtils.toIntColor(Settings.SubtitleFillColor.get(), Color.WHITE);
        strokeColor = KtUtils.toIntColor(Settings.SubtitleStrokeColor.get(), Color.BLACK);
    }

    public static void updateFont() {
        Utils.async(() -> {
            if (FONT_FILE.isFile()) {
                try {
                    subtitleFont = Typeface.createFromFile(FONT_FILE);
                } catch (Throwable ignored) {
                }
            } else {
                subtitleFont = null;
            }
        });
    }
}
