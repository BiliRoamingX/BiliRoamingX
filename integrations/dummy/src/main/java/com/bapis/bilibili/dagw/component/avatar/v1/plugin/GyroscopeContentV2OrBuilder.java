package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface GyroscopeContentV2OrBuilder extends MessageLiteOrBuilder {
    String getFileUrl();

    ByteString getFileUrlBytes();

    PhysicalOrientationV2 getPhysicalOrientation(int i);

    int getPhysicalOrientationCount();

    List<PhysicalOrientationV2> getPhysicalOrientationList();

    float getScale();
}
