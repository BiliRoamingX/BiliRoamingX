package com.bapis.bilibili.main.community.reply.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes18.dex */
public interface EmoteOrBuilder extends MessageLiteOrBuilder {
    String getGifUrl();

    ByteString getGifUrlBytes();

    long getId();

    String getJumpTitle();

    ByteString getJumpTitleBytes();

    String getJumpUrl();

    ByteString getJumpUrlBytes();

    long getPackageId();

    long getSize();

    String getText();

    ByteString getTextBytes();

    String getUrl();

    ByteString getUrlBytes();
}
