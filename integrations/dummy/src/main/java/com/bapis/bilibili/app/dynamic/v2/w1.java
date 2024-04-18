package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface w1 extends MessageLiteOrBuilder {
    String getAdMark();

    ByteString getAdMarkBytes();

    String getAppName();

    ByteString getAppNameBytes();

    String getBrief();

    ByteString getBriefBytes();

    String getCmCachePassthrough();

    ByteString getCmCachePassthroughBytes();

    String getCover();

    ByteString getCoverBytes();

    long getItemId();

    String getJumpDesc();

    ByteString getJumpDescBytes();

    GoodsJumpType getJumpType();

    int getJumpTypeValue();

    String getJumpUrl();

    ByteString getJumpUrlBytes();

    String getOpenWhiteList(int i2);

    ByteString getOpenWhiteListBytes(int i2);

    int getOpenWhiteListCount();

    List<String> getOpenWhiteListList();

    String getPrice();

    ByteString getPriceBytes();

    String getSchemaPackageName();

    ByteString getSchemaPackageNameBytes();

    String getSchemaUrl();

    ByteString getSchemaUrlBytes();

    int getSourceType();

    String getTitle();

    ByteString getTitleBytes();

    boolean getUserWebV2();
}
