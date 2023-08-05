package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface UserOrBuilder extends MessageLiteOrBuilder {
    String getFace();

    ByteString getFaceBytes();

    long getFollower();

    long getMid();

    String getName();

    ByteString getNameBytes();
}
