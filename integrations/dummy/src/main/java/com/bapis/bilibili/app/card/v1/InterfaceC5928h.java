package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.h */
/* loaded from: classes13.dex */
public interface InterfaceC5928h extends MessageLiteOrBuilder {
    Bubble getBubble();

    long getEntranceId();

    int getEntranceType();

    String getGoto();

    ByteString getGotoBytes();

    String getIcon();

    ByteString getIconBytes();

    String getModuleId();

    ByteString getModuleIdBytes();

    String getTitle();

    ByteString getTitleBytes();

    String getUri();

    ByteString getUriBytes();

    boolean hasBubble();
}
