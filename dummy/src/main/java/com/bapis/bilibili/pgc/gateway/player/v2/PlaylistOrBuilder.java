package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface PlaylistOrBuilder extends MessageLiteOrBuilder {
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
