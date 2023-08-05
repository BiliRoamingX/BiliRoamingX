package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.MaskProperty;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface LayerConfigOrBuilder extends MessageLiteOrBuilder {
    boolean containsTags(String str);

    boolean getAllowOverPaint();

    boolean getIsCritical();

    MaskProperty getLayerMask();

    @Deprecated
    Map<String, LayerTagConfig> getTags();

    int getTagsCount();

    Map<String, LayerTagConfig> getTagsMap();

    LayerTagConfig getTagsOrDefault(String str, LayerTagConfig layerTagConfig);

    LayerTagConfig getTagsOrThrow(String str);

    boolean hasLayerMask();
}
