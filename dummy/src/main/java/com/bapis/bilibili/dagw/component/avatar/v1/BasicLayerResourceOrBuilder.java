package com.bapis.bilibili.dagw.component.avatar.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface BasicLayerResourceOrBuilder extends MessageLiteOrBuilder {
    BasicLayerResource.PayloadCase getPayloadCase();

    ResAnimation getResAnimation();

    ResImage getResImage();

    ResNativeDraw getResNativeDraw();

    BasicLayerResource.ResType getResType();

    int getResTypeValue();

    boolean hasResAnimation();

    boolean hasResImage();

    boolean hasResNativeDraw();
}
