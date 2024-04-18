package com.bapis.bilibili.dagw.component.avatar.common;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface PositionSpecOrBuilder extends MessageLiteOrBuilder {
    double getAxisX();

    double getAxisY();

    PositionSpec.CoordinatePos getCoordinatePos();

    int getCoordinatePosValue();
}
