package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface UgcEpisodeOrBuilder extends MessageLiteOrBuilder {
    long getAid();

    long getCid();

    String getCover();

    ByteString getCoverBytes();

    String getCoverRightText();

    ByteString getCoverRightTextBytes();

    StatInfo getDanmaku();

    long getId();

    Page getPage();

    String getTitle();

    ByteString getTitleBytes();

    StatInfo getVt();

    boolean hasDanmaku();

    boolean hasPage();

    boolean hasVt();
}
