package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface CouponOrBuilder extends MessageLiteOrBuilder {
    String getAmount();

    ByteString getAmountBytes();

    String getCouponToken();

    ByteString getCouponTokenBytes();

    String getDesc();

    ByteString getDescBytes();

    Timestamp getExpireTime();

    long getOtype();

    String getPayButtonText();

    ByteString getPayButtonTextBytes();

    String getPayButtonTextLineThrough();

    ByteString getPayButtonTextLineThroughBytes();

    String getRealAmount();

    ByteString getRealAmountBytes();

    String getTitle();

    ByteString getTitleBytes();

    long getType();

    String getUseDesc();

    ByteString getUseDescBytes();

    String getValue();

    ByteString getValueBytes();

    boolean hasExpireTime();
}
