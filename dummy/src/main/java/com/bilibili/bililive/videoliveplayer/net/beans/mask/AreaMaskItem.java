package com.bilibili.bililive.videoliveplayer.net.beans.mask;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.Nullable;

import kotlin.jvm.JvmField;

/* compiled from: BL */
@Keep
/* loaded from: classes4.dex */
public final class AreaMaskItem {
    @JvmField
    @JSONField(name = "height")
    public float height;
    @JvmField
    @JSONField(name = "x")
    @Nullable
    public Float locationX;
    @JvmField
    @JSONField(name = "y")
    @Nullable
    public Float locationY;
    @JvmField
    @JSONField(name = "live_screen_type")
    public int screenType = 1;
    @JvmField
    @JSONField(name = "width")
    public float width;
}
