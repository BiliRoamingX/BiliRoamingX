package com.bilibili.cron;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

public class Image {
    private final Bitmap bitmap;

    public Image(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    private static Image createFromFileData(byte[] bytes) {
        Bitmap decoded = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        if (decoded != null) {
            return new Image(decoded);
        }
        return null;
    }

    private static Image createFromSize(int width, int height) {
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new Image(Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888));
    }

    private int getHeight() {
        if (isReleased()) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private int getWidth() {
        if (isReleased()) {
            return 0;
        }
        return bitmap.getWidth();
    }

    private boolean isReleased() {
        Bitmap bitmap = this.bitmap;
        return bitmap == null || bitmap.isRecycled();
    }

    private Image makeCopy() {
        if (isReleased()) {
            return null;
        }
        Bitmap bitmap = this.bitmap;
        return new Image(bitmap.copy(bitmap.getConfig(), false));
    }

    private void release() {
        if (isReleased()) {
            return;
        }
        bitmap.recycle();
    }

    private byte[] toFileData() {
        if (isReleased()) {
            return null;
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, os)) {
            return os.toByteArray();
        }
        return null;
    }

    public Bitmap getBitmap() {
        if (isReleased()) {
            return null;
        }
        return bitmap;
    }
}
