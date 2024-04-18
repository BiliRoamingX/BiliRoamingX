package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface c0 extends MessageLiteOrBuilder {
    Avatar getAvatar();

    String getCooperation();

    ByteString getCooperationBytes();

    String getDesc();

    Button getDescButton();

    ByteString getDescBytes();

    long getId();

    String getName();

    ByteString getNameBytes();

    int getOfficialIcon();

    boolean hasAvatar();

    boolean hasDescButton();
}
