package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.w */
/* loaded from: classes13.dex */
public interface InterfaceC5943w extends MessageLiteOrBuilder {
    long getId();

    DislikeReason getReasons(int i);

    int getReasonsCount();

    List<DislikeReason> getReasonsList();

    String getSubtitle();

    ByteString getSubtitleBytes();

    String getTitle();

    ByteString getTitleBytes();

    String getType();

    ByteString getTypeBytes();
}
