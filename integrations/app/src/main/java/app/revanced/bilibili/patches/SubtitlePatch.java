package app.revanced.bilibili.patches;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.StaticLayout;

import androidx.annotation.Keep;

import com.bilibili.cron.Canvas;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.SubtitleParamsCache;
import app.revanced.bilibili.utils.Utils;

@Keep
@SuppressWarnings("unused")
public class SubtitlePatch {
    public static void setPaint(Canvas canvas) {
    }

    public static boolean drawPath(Canvas canvas) {
        return SubtitleParamsCache.styleSwitch && SubtitleParamsCache.removeBg;
    }

    public static Rect measureTextImpl(Canvas canvas, String text) {
        if (SubtitleParamsCache.styleSwitch && canvas.maxWidth != 0.0f) {
            canvas.paint.setStrokeWidth(SubtitleParamsCache.strokeWidth);
            canvas.paint.setFakeBoldText(SubtitleParamsCache.boldText);
            Typeface subtitleFont = SubtitleParamsCache.subtitleFont;
            if (subtitleFont != null)
                canvas.paint.setTypeface(subtitleFont);
            float fontSizeLandscape = SubtitleParamsCache.fontSizeLandscape;
            float fontSizePortrait = SubtitleParamsCache.fontSizePortrait;
            boolean currentIsLandscape = Utils.currentIsLandscape();
            if (currentIsLandscape && fontSizeLandscape > 0) {
                canvas.paint.setTextSize(fontSizeLandscape);
            } else if (!currentIsLandscape && fontSizePortrait > 0) {
                canvas.paint.setTextSize(fontSizePortrait);
            }
        }
        StaticLayout layout;
        StaticLayout preLayout = canvas.staticLayout;
        if (preLayout != null && preLayout.getText().equals(text))
            return Canvas.measureTextFromLayout(preLayout);
        float maxWidth = canvas.maxWidth;
        int validMaxWidth = maxWidth <= 0.0f ? Integer.MAX_VALUE : (int) Math.min(Integer.MAX_VALUE, maxWidth);
        layout = StaticLayout.Builder
                .obtain(text, 0, text.length(), canvas.paint, validMaxWidth)
                .setText(text)
                .setAlignment(canvas.alignment)
                .setIncludePad(false)
                .build();
        int lineMaxWidth = 0;
        for (int i = 0; i < layout.getLineCount(); i++)
            lineMaxWidth = Math.max(lineMaxWidth, (int) Math.ceil(layout.getLineWidth(i)));
        layout = StaticLayout.Builder
                .obtain(text, 0, text.length(), canvas.paint, lineMaxWidth)
                .setText(text)
                .setAlignment(canvas.alignment)
                .setIncludePad(false)
                .build();
        canvas.staticLayout = layout;
        return Canvas.measureTextFromLayout(layout);
    }

    public static void drawText(Canvas canvas, String text, float x, float y, boolean stroke) {
        if (SubtitleParamsCache.styleSwitch && canvas.maxWidth != 0.0f) {
            canvas.fillColor = SubtitleParamsCache.fillColor;
            canvas.strokeColor = SubtitleParamsCache.strokeColor;
            canvas.drawTextReal(text, x, y, true);
            canvas.drawTextReal(text, x, y, false);
        } else {
            canvas.drawTextReal(text, x, y, stroke);
        }
    }

    public static Float offset(Float offset) {
        if (!SubtitleParamsCache.styleSwitch)
            return offset;
        return Settings.SubtitleOffset.get() + offset;
    }
}
