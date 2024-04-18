package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface TagOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    long getTagId();

    String getTagType();

    ByteString getTagTypeBytes();

    String getUri();

    ByteString getUriBytes();
}
