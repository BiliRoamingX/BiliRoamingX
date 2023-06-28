package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface StaffOrBuilder extends MessageLiteOrBuilder {
    int getAttention();

    String getFace();

    ByteString getFaceBytes();

    int getLabelStyle();

    long getMid();

    String getName();

    ByteString getNameBytes();

    OfficialVerify getOfficialVerify();

    String getTitle();

    ByteString getTitleBytes();

    Vip getVip();

    boolean hasOfficialVerify();

    boolean hasVip();
}
