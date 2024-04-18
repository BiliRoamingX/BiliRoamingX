package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.d */
/* loaded from: classes13.dex */
public interface InterfaceC5924d extends MessageLiteOrBuilder {
    String getEvent();

    ByteString getEventBytes();

    String getEventV2();

    ByteString getEventV2Bytes();

    String getParam();

    ByteString getParamBytes();

    Relation getRelation();

    int getSelected();

    String getText();

    ByteString getTextBytes();

    int getType();

    String getUri();

    ByteString getUriBytes();

    boolean hasRelation();
}
