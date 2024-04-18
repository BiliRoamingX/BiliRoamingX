package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.bapis.bilibili.dagw.component.avatar.common.ColorConfig;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface LiveAnimeItemOrBuilder extends MessageLiteOrBuilder {
    ColorConfig getColor();

    double getEndRatio();

    long getPhase();

    double getStartOpacity();

    double getStartRatio();

    double getStartStroke();

    boolean hasColor();
}
