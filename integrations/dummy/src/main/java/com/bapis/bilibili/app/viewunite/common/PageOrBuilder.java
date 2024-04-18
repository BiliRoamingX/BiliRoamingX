package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface PageOrBuilder extends MessageLiteOrBuilder {
    long getCid();

    String getDesc();

    ByteString getDescBytes();

    Dimension getDimension();

    String getDlSubtitle();

    ByteString getDlSubtitleBytes();

    String getDlTitle();

    ByteString getDlTitleBytes();

    long getDuration();

    String getPart();

    ByteString getPartBytes();

    boolean hasDimension();
}
