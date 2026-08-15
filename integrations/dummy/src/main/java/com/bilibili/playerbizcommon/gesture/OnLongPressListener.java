package com.bilibili.playerbizcommon.gesture;

import android.view.MotionEvent;
import org.jetbrains.annotations.Nullable;

/* compiled from: BL */
public interface OnLongPressListener {
    void onLongPressEnd(@Nullable MotionEvent motionEvent);

    boolean onLongPress(@Nullable MotionEvent motionEvent);
}