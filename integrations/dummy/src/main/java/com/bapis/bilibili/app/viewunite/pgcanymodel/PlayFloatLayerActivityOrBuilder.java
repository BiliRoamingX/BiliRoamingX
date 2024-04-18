package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.bapis.bilibili.app.viewunite.common.BadgeInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface PlayFloatLayerActivityOrBuilder extends MessageLiteOrBuilder {
    int getAdBadgeType();

    BadgeInfo getBadge();

    int getId();

    String getLink();

    ByteString getLinkBytes();

    String getPicAnimaUrl();

    ByteString getPicAnimaUrlBytes();

    String getPicUrl();

    ByteString getPicUrlBytes();

    long getShowRateTime();

    String getTitle();

    ByteString getTitleBytes();

    int getType();

    boolean hasBadge();
}
