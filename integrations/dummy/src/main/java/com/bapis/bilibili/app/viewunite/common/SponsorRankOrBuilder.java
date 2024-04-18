package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface SponsorRankOrBuilder extends MessageLiteOrBuilder {
    String getFace();

    ByteString getFaceBytes();

    String getMsg();

    ByteString getMsgBytes();

    long getUid();

    String getUname();

    ByteString getUnameBytes();

    Vip getVip();

    boolean hasVip();
}
