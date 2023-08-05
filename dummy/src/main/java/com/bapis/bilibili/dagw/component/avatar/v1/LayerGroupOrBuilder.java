package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.MaskProperty;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface LayerGroupOrBuilder extends MessageLiteOrBuilder {
    String getGroupId();

    ByteString getGroupIdBytes();

    MaskProperty getGroupMask();

    boolean getIsCriticalGroup();

    Layer getLayers(int i);

    int getLayersCount();

    List<Layer> getLayersList();

    boolean hasGroupMask();
}
