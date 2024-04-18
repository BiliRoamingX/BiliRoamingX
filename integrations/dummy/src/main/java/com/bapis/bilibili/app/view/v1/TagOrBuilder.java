package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface TagOrBuilder extends MessageLiteOrBuilder {
    int getHated();

    long getHates();

    long getId();

    int getLiked();

    long getLikes();

    String getName();

    ByteString getNameBytes();

    String getTagType();

    ByteString getTagTypeBytes();

    String getUri();

    ByteString getUriBytes();
}
