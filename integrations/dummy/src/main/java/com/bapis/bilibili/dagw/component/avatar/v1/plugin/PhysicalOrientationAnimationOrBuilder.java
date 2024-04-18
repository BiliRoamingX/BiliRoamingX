package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface PhysicalOrientationAnimationOrBuilder extends MessageLiteOrBuilder {
    String getBezier();

    ByteString getBezierBytes();

    String getType();

    ByteString getTypeBytes();

    float getValue(int i);

    int getValueCount();

    List<Float> getValueList();
}
