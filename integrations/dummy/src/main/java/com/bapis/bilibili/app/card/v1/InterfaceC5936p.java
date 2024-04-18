package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.p */
/* loaded from: classes13.dex */
public interface InterfaceC5936p extends MessageLiteOrBuilder {
    long getAid();

    long getCid();

    long getDuration();

    long getEpId();

    int getIsLive();

    int getIsPreview();

    long getRoomId();

    long getSeasonId();

    int getSubType();

    String getType();

    ByteString getTypeBytes();
}
