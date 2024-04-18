package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface VideoPointOrBuilder extends MessageLiteOrBuilder {
    String getContent();

    ByteString getContentBytes();

    String getCover();

    ByteString getCoverBytes();

    long getFrom();

    String getLogoUrl();

    ByteString getLogoUrlBytes();

    long getTo();

    int getType();
}
