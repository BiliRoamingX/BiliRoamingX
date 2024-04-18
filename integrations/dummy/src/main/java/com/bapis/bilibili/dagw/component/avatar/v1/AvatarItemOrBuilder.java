package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.SizeSpec;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface AvatarItemOrBuilder extends MessageLiteOrBuilder {
    SizeSpec getContainerSize();

    LayerGroup getFallbackLayers();

    LayerGroup getLayers(int i);

    int getLayersCount();

    List<LayerGroup> getLayersList();

    long getMid();

    boolean hasContainerSize();

    boolean hasFallbackLayers();
}
