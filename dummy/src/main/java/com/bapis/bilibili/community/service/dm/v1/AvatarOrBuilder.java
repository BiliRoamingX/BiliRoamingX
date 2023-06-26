package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface AvatarOrBuilder extends MessageLiteOrBuilder {
    AvatarType getAvatarType();

    int getAvatarTypeValue();

    String getId();

    ByteString getIdBytes();

    String getUrl();

    ByteString getUrlBytes();
}
