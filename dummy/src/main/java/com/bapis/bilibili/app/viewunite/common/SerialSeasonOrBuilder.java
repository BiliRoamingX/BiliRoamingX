package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface SerialSeasonOrBuilder extends MessageLiteOrBuilder {
    String getBadge();

    ByteString getBadgeBytes();

    BadgeInfo getBadgeInfo();

    int getBadgeType();

    String getCover();

    ByteString getCoverBytes();

    int getIsNew();

    String getLink();

    ByteString getLinkBytes();

    NewEp getNewEp();

    String getResource();

    ByteString getResourceBytes();

    int getSeasonId();

    String getSeasonTitle();

    ByteString getSeasonTitleBytes();

    String getTitle();

    ByteString getTitleBytes();

    boolean hasBadgeInfo();

    boolean hasNewEp();
}
