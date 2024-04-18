package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface DmMaskWallOrBuilder extends MessageLiteOrBuilder {
    String getContent();

    ByteString getContentBytes();

    DmMaskWallContentType getContentType();

    int getContentTypeValue();

    long getEnd();

    long getStart();
}
