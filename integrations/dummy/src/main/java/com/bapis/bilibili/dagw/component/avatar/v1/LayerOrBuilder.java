package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpec;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface LayerOrBuilder extends MessageLiteOrBuilder {
    LayerGeneralSpec getGeneralSpec();

    LayerConfig getLayerConfig();

    String getLayerId();

    ByteString getLayerIdBytes();

    BasicLayerResource getResource();

    boolean getVisible();

    boolean hasGeneralSpec();

    boolean hasLayerConfig();

    boolean hasResource();
}
