package com.bapis.bilibili.pgc.gateway.player.v2;

import com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideo;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface EpPublicityVideoOrBuilder extends MessageLiteOrBuilder {
    EpPublicityVideo.DataCase getDataCase();

    EpInlineVideo getEpInline();

    EpPreVideo getEpPreVideo();

    EpPublicityVideoType getType();

    int getTypeValue();

    boolean hasEpInline();

    boolean hasEpPreVideo();
}
