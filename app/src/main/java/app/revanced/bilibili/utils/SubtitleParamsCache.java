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
        styleSwitch = Settings.SUBTITLE_STYLE_SWITCH.getBoolean();
        removeBg = Settings.SUBTITLE_REMOVE_BG.getBoolean();
        strokeWidth = Settings.SUBTITLE_STROKE_WIDTH.getFloat();
        boldText = Settings.SUBTITLE_BOLD_TEXT.getBoolean();
        fontSizePortrait = KtUtils.sp2px(Settings.SUBTITLE_FONT_SIZE_PORTRAIT.getInt());
        fontSizeLandscape = KtUtils.sp2px(Settings.SUBTITLE_FONT_SIZE_LANDSCAPE.getInt());
        fillColor = KtUtils.toIntColor(Settings.SUBTITLE_FILL_COLOR.getString(), Color.WHITE);
        strokeColor = KtUtils.toIntColor(Settings.SUBTITLE_STROKE_COLOR.getString(), Color.BLACK);
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
