package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.bapis.bilibili.dagw.component.avatar.common.ColorConfig;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface BorderConfigOrBuilder extends MessageLiteOrBuilder {
    double getBorderWidth();

    ColorConfig getColor();

    double getRatio();

    boolean hasColor();
}
