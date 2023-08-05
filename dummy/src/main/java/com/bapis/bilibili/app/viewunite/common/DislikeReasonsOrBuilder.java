package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface DislikeReasonsOrBuilder extends MessageLiteOrBuilder {
    long getId();

    long getMid();

    String getName();

    ByteString getNameBytes();

    int getRid();

    long getTagId();
}
