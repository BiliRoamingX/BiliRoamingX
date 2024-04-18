package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface DescV2OrBuilder extends MessageLiteOrBuilder {
    long getRid();

    String getText();

    ByteString getTextBytes();

    DescType getType();

    int getTypeValue();

    String getUri();

    ByteString getUriBytes();
}
