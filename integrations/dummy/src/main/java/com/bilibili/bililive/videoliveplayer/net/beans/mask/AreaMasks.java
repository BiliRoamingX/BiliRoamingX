package com.bilibili.bililive.videoliveplayer.net.beans.mask;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.Nullable;

import java.util.List;

import kotlin.jvm.JvmField;

/* compiled from: BL */
@Keep
/* loaded from: classes4.dex */
public final class AreaMasks {
    @JvmField
    @JSONField(name = "horizontal_masks")
    @Nullable
    public List<AreaMaskItem> horizontalMasks;
    @JvmField
    @JSONField(name = "vertical_masks")
    @Nullable
    public List<AreaMaskItem> verticalMasks;
}
