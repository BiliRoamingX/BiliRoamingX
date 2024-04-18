package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface StaffOrBuilder extends MessageLiteOrBuilder {
    int getAttention();

    String getFace();

    ByteString getFaceBytes();

    String getFans();

    ByteString getFansBytes();

    int getLabelStyle();

    long getMid();

    String getName();

    ByteString getNameBytes();

    OfficialVerify getOfficial();

    String getTitle();

    ByteString getTitleBytes();

    Vip getVip();

    boolean hasOfficial();

    boolean hasVip();
}
