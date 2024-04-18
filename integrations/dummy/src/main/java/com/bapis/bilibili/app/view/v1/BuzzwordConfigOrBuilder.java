package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface BuzzwordConfigOrBuilder extends MessageLiteOrBuilder {
    long getBuzzwordId();

    long getEnd();

    boolean getFollowControl();

    long getId();

    String getName();

    ByteString getNameBytes();

    String getPicture();

    ByteString getPictureBytes();

    String getSchema();

    ByteString getSchemaBytes();

    int getSchemaType();

    int getSource();

    long getStart();
}
