package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface o0 extends MessageLiteOrBuilder {
    ModuleAdditional getAdditionalCard();

    String getBizId();

    ByteString getBizIdBytes();

    LinkNodeType getBizType();

    int getBizTypeValue();

    boolean hasAdditionalCard();
}
