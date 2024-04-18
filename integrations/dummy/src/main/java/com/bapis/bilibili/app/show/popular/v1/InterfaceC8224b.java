package com.bapis.bilibili.app.show.popular.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.show.popular.v1.b */
/* loaded from: classes13.dex */
public interface InterfaceC8224b extends MessageLiteOrBuilder {
    Bubble getBubble();

    long getEntranceId();

    int getEntranceType();

    String getIcon();

    ByteString getIconBytes();

    String getModuleId();

    ByteString getModuleIdBytes();

    String getTitle();

    ByteString getTitleBytes();

    String getTopPhoto();

    ByteString getTopPhotoBytes();

    String getUri();

    ByteString getUriBytes();

    boolean hasBubble();
}
