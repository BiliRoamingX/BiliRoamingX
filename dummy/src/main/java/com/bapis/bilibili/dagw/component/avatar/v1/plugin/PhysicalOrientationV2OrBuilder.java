package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface PhysicalOrientationV2OrBuilder extends MessageLiteOrBuilder {
    float getAngle(int i);

    int getAngleCount();

    List<Float> getAngleList();

    PhysicalOrientationAnimation getAnimations(int i);

    int getAnimationsCount();

    List<PhysicalOrientationAnimation> getAnimationsList();

    String getType();

    ByteString getTypeBytes();
}
