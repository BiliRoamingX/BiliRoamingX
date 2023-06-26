package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface BuzzwordShowConfigOrBuilder extends MessageLiteOrBuilder {
    long getBuzzwordId();

    long getId();

    String getName();

    ByteString getNameBytes();

    String getSchema();

    ByteString getSchemaBytes();

    int getSchemaType();

    int getSource();
}
