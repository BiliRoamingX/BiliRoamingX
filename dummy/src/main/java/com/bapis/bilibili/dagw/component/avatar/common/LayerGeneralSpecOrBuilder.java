package com.bapis.bilibili.dagw.component.avatar.common;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface LayerGeneralSpecOrBuilder extends MessageLiteOrBuilder {
    PositionSpec getPosSpec();

    BasicRenderSpec getRenderSpec();

    SizeSpec getSizeSpec();

    boolean hasPosSpec();

    boolean hasRenderSpec();

    boolean hasSizeSpec();
}
