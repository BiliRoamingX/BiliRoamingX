package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface UserOrBuilder extends MessageLiteOrBuilder {
    String getFace();

    ByteString getFaceBytes();

    long getFollower();

    String getInteractDesc();

    ByteString getInteractDescBytes();

    long getIsAttention();

    long getIsFollow();

    long getIsInterrelation();

    long getMid();

    String getName();

    ByteString getNameBytes();
}
