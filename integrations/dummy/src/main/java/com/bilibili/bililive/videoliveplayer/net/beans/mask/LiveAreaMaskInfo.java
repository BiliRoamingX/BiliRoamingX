package com.bilibili.bililive.videoliveplayer.net.beans.mask;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.Nullable;

import kotlin.jvm.JvmField;

/* compiled from: BL */
@Keep
/* loaded from: classes4.dex */
public final class LiveAreaMaskInfo {
    @JvmField
    @JSONField(name = "area_masks")
    @Nullable
    public AreaMasks areaMasks;
}
