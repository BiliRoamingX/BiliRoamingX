package com.bapis.bilibili.playershared;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes18.dex */
public interface PlayListOrBuilder extends MessageLiteOrBuilder {
    BadgeInfo getBadgeInfo();

    String getCover();

    ByteString getCoverBytes();

    String getLink();

    ByteString getLinkBytes();

    long getSeasonId();

    String getTitle();

    ByteString getTitleBytes();

    boolean hasBadgeInfo();
}
