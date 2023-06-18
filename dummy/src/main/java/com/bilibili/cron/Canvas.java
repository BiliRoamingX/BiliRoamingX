package com.bilibili.cron;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

@SuppressWarnings("unused")
public class Canvas {
    private static final Xfermode CLEAR_MODE = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    private static final Xfermode SRC_MODE = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    private static final Xfermode SRC_OVER_MODE = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
    private static final Xfermode DST_OVER_MODE = new PorterDuffXfermode(PorterDuff.Mode.DST_OVER);
    private static final Xfermode SRC_IN_MODE = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    private static final Xfermode DST_IN_MODE = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    private static final Xfermode SRC_OUT_MODE = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
    private static final Xfermode DST_OUT_MODE = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    private static final Xfermode SRC_ATOP_MODE = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    private static final Xfermode DST_ATOP_MODE = new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP);
    private static final Xfermode DARKEN_MODE = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
    private static final Xfermode LIGHTEN_MODE = new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN);
    private static final Xfermode MULTIPLY_MODE = new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY);
    private static final Xfermode SCREEN_MODE = new PorterDuffXfermode(PorterDuff.Mode.SCREEN);
    private static final Xfermode OVERLAY_MODE = new PorterDuffXfermode(PorterDuff.Mode.OVERLAY);
    private static final ThreadLocal<android.graphics.Canvas> canvasThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<Rect> rectThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<RectF> rectFThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<Matrix> matrixThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<float[]> floatArrayThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<Path> pathThreadLocal = new ThreadLocal<>();
    private static final ThreadLocalUtils.InstanceCreator<android.graphics.Canvas> canvasCreator = android.graphics.Canvas::new;
    private static final ThreadLocalUtils.InstanceCreator<Rect> rectCreator = Rect::new;
    private static final ThreadLocalUtils.InstanceCreator<RectF> rectFCreator = RectF::new;
    private static final ThreadLocalUtils.InstanceCreator<Matrix> matrixCreator = Matrix::new;
    private static final ThreadLocalUtils.InstanceCreator<float[]> floatArrayCreator = () -> new float[2];
    private static final ThreadLocalUtils.InstanceCreator<Path> pathCreator = Path::new;

    public final TextPaint paint = new TextPaint();
    public int fillColor = 0;
    public int strokeColor = 0;
    public float maxWidth = 0.0f;
    public Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
    public Bitmap bitmap = null;
    public final Matrix matrix = new Matrix();
    public Path clipPath = null;
    public StaticLayout staticLayout = null;

    Canvas() {
    }

    private void clearRect(float left, float top, float width, float height) {
        if (!isValid()) return;
        Paint.Style style = paint.getStyle();
        Xfermode xfermode = paint.getXfermode();
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(CLEAR_MODE);
        android.graphics.Canvas canvas = ThreadLocalUtils.getInstance(canvasThreadLocal, canvasCreator);
        canvas.setBitmap(bitmap);
        canvas.save();
        canvas.setMatrix(matrix);
        Path clipPath = this.clipPath;
        if (clipPath != null)
            canvas.clipPath(clipPath);
        canvas.drawRect(left, top, left + width, top + height, paint);
        canvas.restore();
        paint.setStyle(style);
        paint.setXfermode(xfermode);
    }

    private static Canvas create() {
        return new Canvas();
    }

    private void drawImage(Image image, float left, float top, float width, float height) {
        Bitmap bitmap;
        if (!isValid() || image == null || (bitmap = image.getBitmap()) == null)
            return;
        android.graphics.Canvas canvas = ThreadLocalUtils.getInstance(canvasThreadLocal, canvasCreator);
        canvas.setBitmap(bitmap);
        canvas.save();
        canvas.setMatrix(matrix);
        Path clipPath = this.clipPath;
        if (clipPath != null)
            canvas.clipPath(clipPath);
        RectF rectF = ThreadLocalUtils.getInstance(rectFThreadLocal, rectFCreator);
        rectF.set(left, top, left + width, top + height);
        paint.setColor(Color.WHITE);
        canvas.drawBitmap(bitmap, null, rectF, paint);
        canvas.restore();
    }

    private void drawPath(Path path, boolean stroke) {
        if (!isValid() || path == null || (stroke && paint.getStrokeWidth() == 0.0f))
            return;
        android.graphics.Canvas canvas = ThreadLocalUtils.getInstance(canvasThreadLocal, canvasCreator);
        canvas.setBitmap(bitmap);
        canvas.save();
        canvas.setMatrix(matrix);
        Path clipPath = this.clipPath;
        if (clipPath != null)
            canvas.clipPath(path);
        paint.setStyle(stroke ? Paint.Style.STROKE : Paint.Style.FILL);
        paint.setColor(stroke ? strokeColor : fillColor);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    private void drawText(String text, float x, float y, boolean stroke) {
        drawTextReal(text, x, y, stroke);
    }

    public void drawTextReal(String text, float x, float y, boolean stroke) {
        if (!isValid() || (stroke && paint.getStrokeWidth() == 0.0f))
            return;
        String trimmed = trimNewline(text);
        StaticLayout layout = staticLayout;
        if (layout == null || !layout.getText().equals(trimmed))
            measureTextImpl(trimmed);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            drawTextDirectly(x, y, stroke);
        } else {
            drawTextIndirectly(x, y, stroke);
        }
    }

    private void drawTextDirectly(float x, float y, boolean stroke) {
        android.graphics.Canvas canvas = ThreadLocalUtils.getInstance(canvasThreadLocal, canvasCreator);
        canvas.setBitmap(bitmap);
        canvas.save();
        if (clipPath != null) {
            Path path = ThreadLocalUtils.getInstance(pathThreadLocal, pathCreator);
            path.reset();
            path.addPath(clipPath, matrix);
            canvas.clipPath(path);
        }
        Matrix matrix = ThreadLocalUtils.getInstance(matrixThreadLocal, matrixCreator);
        matrix.reset();
        float[] array = ThreadLocalUtils.getInstance(floatArrayThreadLocal, floatArrayCreator);
        array[0] = x;
        array[1] = y + staticLayout.getLineBaseline(0);
        matrix.preScale(1.0f, -1.0f, canvas.getWidth() * 0.5f, canvas.getHeight() * 0.5f);
        matrix.mapPoints(array);
        matrix.reset();
        matrix.set(matrix);
        matrix.preTranslate(array[0], -array[1]);
        matrix.preScale(1.0f, -1.0f, canvas.getWidth() * 0.5f, canvas.getHeight() * 0.5f);
        canvas.setMatrix(matrix);
        paint.setStyle(stroke ? Paint.Style.STROKE : Paint.Style.FILL);
        paint.setColor(stroke ? strokeColor : fillColor);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private void drawTextIndirectly(float x, float y, boolean stroke) {
        int width = staticLayout.getWidth();
        int height = staticLayout.getHeight();
        if (width <= 0 || height <= 0)
            return;
        android.graphics.Canvas canvas = ThreadLocalUtils.getInstance(canvasThreadLocal, canvasCreator);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        paint.setStyle(stroke ? Paint.Style.STROKE : Paint.Style.FILL);
        paint.setColor(stroke ? strokeColor : fillColor);
        Xfermode xfermode = paint.getXfermode();
        paint.setXfermode(SRC_OVER_MODE);
        staticLayout.draw(canvas);
        paint.setXfermode(xfermode);
        canvas.setBitmap(bitmap);
        canvas.save();
        if (clipPath != null) {
            Path path = ThreadLocalUtils.getInstance(pathThreadLocal, pathCreator);
            path.reset();
            path.addPath(clipPath, matrix);
            canvas.clipPath(path);
        }
        Matrix matrix = ThreadLocalUtils.getInstance(matrixThreadLocal, matrixCreator);
        matrix.reset();
        float[] array = ThreadLocalUtils.getInstance(floatArrayThreadLocal, floatArrayCreator);
        array[0] = x;
        array[1] = y + staticLayout.getLineBaseline(0);
        matrix.preScale(1.0f, -1.0f, canvas.getWidth() * 0.5f, canvas.getHeight() * 0.5f);
        matrix.mapPoints(array);
        matrix.reset();
        matrix.set(matrix);
        matrix.preScale(1.0f, -1.0f, canvas.getWidth() * 0.5f, canvas.getHeight() * 0.5f);
        canvas.setMatrix(matrix);
        RectF rectF = ThreadLocalUtils.getInstance(rectFThreadLocal, rectFCreator);
        rectF.set(array[0], array[1], array[0] + width, array[1] + height);
        paint.setColor(Color.WHITE);
        canvas.drawBitmap(createBitmap, null, rectF, paint);
        canvas.restore();
        createBitmap.recycle();
    }

    private Bitmap getBitmap() {
        return bitmap;
    }

    private int getHeight() {
        if (isValid()) {
            return bitmap.getHeight();
        }
        return 0;
    }

    private int getWidth() {
        if (isValid()) {
            return bitmap.getWidth();
        }
        return 0;
    }

    private boolean isValid() {
        return bitmap != null;
    }

    private Rect measureText(String text) {
        return measureTextImpl(trimNewline(text));
    }

    public static Rect measureTextFromLayout(StaticLayout staticLayout) {
        Rect rect = ThreadLocalUtils.getInstance(rectThreadLocal, rectCreator);
        int width = staticLayout.getWidth();
        int height = staticLayout.getHeight();
        int lineBaseline = height - staticLayout.getLineBaseline(0);
        rect.set(0, height - lineBaseline, width, -lineBaseline);
        return rect;
    }

    private Rect measureTextImpl(String text) {
        StaticLayout layout;
        StaticLayout preLayout = staticLayout;
        if (preLayout != null && preLayout.getText().equals(text))
            return measureTextFromLayout(preLayout);
        float maxWidth = this.maxWidth;
        int validMaxWidth = maxWidth <= 0.0f ? Integer.MAX_VALUE : (int) Math.min(Integer.MAX_VALUE, maxWidth);
        layout = StaticLayout.Builder
                .obtain(text, 0, text.length(), paint, validMaxWidth)
                .setText(text)
                .setAlignment(alignment)
                .setIncludePad(false)
                .build();
        int lineMaxWidth = 0;
        for (int i = 0; i < layout.getLineCount(); i++)
            lineMaxWidth = Math.max(lineMaxWidth, (int) Math.ceil(layout.getLineWidth(i)));
        layout = StaticLayout.Builder
                .obtain(text, 0, text.length(), paint, lineMaxWidth)
                .setText(text)
                .setAlignment(alignment)
                .setIncludePad(false)
                .build();
        staticLayout = layout;
        return measureTextFromLayout(layout);
    }

    private void recycleCurrentBitmap() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmap = null;
        }
    }

    private void release() {
        recycleCurrentBitmap();
    }

    private void resize(int width, int height) {
        recycleCurrentBitmap();
        if (width <= 0 || height <= 0)
            return;
        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
    }

    private void setClipPath(Path path) {
        clipPath = path;
    }

    private void setMatrix(float[] array) {
        matrix.setValues(array);
    }

    private void setPaint(
            boolean antiAlias,
            int fillColor,
            int strokeColor,
            float strokeWidth,
            int lineCap,
            int lineJoin,
            float strokeMiter,
            Typeface typeface,
            float textSize,
            boolean fakeBoldText,
            float maxWidth,
            int alignment,
            int xfermode,
            boolean clearLayout
    ) {
        if (clearLayout)
            this.staticLayout = null;
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.maxWidth = maxWidth;
        this.alignment = toAndroidAlignment(alignment);
        this.paint.reset();
        this.paint.setAntiAlias(antiAlias);
        this.paint.setStrokeWidth(strokeWidth);
        this.paint.setStrokeCap(toAndroidLineCap(lineCap));
        Paint.Join androidLineJoin = toAndroidLineJoin(lineJoin);
        this.paint.setStrokeJoin(androidLineJoin);
        if (Paint.Join.MITER != androidLineJoin)
            strokeMiter = 0.0f;
        this.paint.setStrokeMiter(strokeMiter);
        this.paint.setTypeface(typeface);
        this.paint.setTextSize(textSize);
        this.paint.setFakeBoldText(fakeBoldText);
        this.paint.setXfermode(toAndroidXfermode(xfermode));
    }

    private static Layout.Alignment toAndroidAlignment(int alignment) {
        if (alignment == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (alignment == 2) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            return Layout.Alignment.ALIGN_CENTER;
        }
    }

    private static Paint.Cap toAndroidLineCap(int lineCap) {
        if (lineCap == 1) {
            return Paint.Cap.ROUND;
        } else if (lineCap == 2) {
            return Paint.Cap.SQUARE;
        } else {
            return Paint.Cap.BUTT;
        }
    }

    private static Paint.Join toAndroidLineJoin(int lineJoin) {
        if (lineJoin == 1) {
            return Paint.Join.ROUND;
        } else if (lineJoin == 2) {
            return Paint.Join.BEVEL;
        } else {
            return Paint.Join.MITER;
        }
    }

    private static Xfermode toAndroidXfermode(int xfermode) {
        switch (xfermode) {
            case 0:
                return CLEAR_MODE;
            case 1:
                return SRC_MODE;
            case 2:
            default:
                return SRC_OVER_MODE;
            case 3:
                return DST_OVER_MODE;
            case 4:
                return SRC_IN_MODE;
            case 5:
                return DST_IN_MODE;
            case 6:
                return SRC_OUT_MODE;
            case 7:
                return DST_OUT_MODE;
            case 8:
                return SRC_ATOP_MODE;
            case 9:
                return DST_ATOP_MODE;
            case 10:
                return DARKEN_MODE;
            case 11:
                return LIGHTEN_MODE;
            case 12:
                return MULTIPLY_MODE;
            case 13:
                return SCREEN_MODE;
            case 14:
                return OVERLAY_MODE;
        }
    }

    private Image toImage() {
        if (isValid()) {
            Bitmap bitmap = this.bitmap;
            Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
            if (copy != null)
                return new Image(copy);
            return null;
        }
        return null;
    }

    private static String trimNewline(String text) {
        int lastIndex = text.length() - 1;
        return (lastIndex < 0 || '\n' != text.charAt(lastIndex)) ? text : text.substring(0, lastIndex);
    }
}
