package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Author;
import com.bapis.bilibili.app.archive.v1.Page;
import com.bapis.bilibili.app.archive.v1.Stat;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface EpisodeOrBuilder extends MessageLiteOrBuilder {
    long getAid();

    Author getAuthor();

    String getAuthorDesc();

    ByteString getAuthorDescBytes();

    BadgeStyle getBadgeStyle();

    String getBvid();

    ByteString getBvidBytes();

    long getCid();

    String getCover();

    ByteString getCoverBytes();

    String getCoverRightText();

    ByteString getCoverRightTextBytes();

    boolean getEpisodePay();

    String getFirstFrame();

    ByteString getFirstFrameBytes();

    boolean getFreeWatch();

    long getId();

    boolean getNeedPay();

    Page getPage();

    Stat getStat();

    ArchiveStat getStatV2();

    String getTitle();

    ByteString getTitleBytes();

    boolean hasAuthor();

    boolean hasBadgeStyle();

    boolean hasPage();

    boolean hasStat();

    boolean hasStatV2();
}
