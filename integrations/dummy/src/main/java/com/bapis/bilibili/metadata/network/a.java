package com.bapis.bilibili.metadata.network;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes23.dex */
public interface a extends MessageLiteOrBuilder {
    String getOid();

    ByteString getOidBytes();

    TFType getTf();

    int getTfValue();

    NetworkType getType();

    int getTypeValue();
}
