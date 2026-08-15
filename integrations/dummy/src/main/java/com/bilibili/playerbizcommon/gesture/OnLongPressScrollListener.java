package com.bilibili.playerbizcommon.gesture;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BL */
public interface OnLongPressScrollListener {
    boolean onScroll(@Nullable MotionEvent downPress, @NotNull MotionEvent movePress, float distanceX, float distanceY);
}