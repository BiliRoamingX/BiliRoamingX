package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface StreamOrBuilder extends MessageLiteOrBuilder {
    Stream.ContentCase getContentCase();

    DashVideo getDashVideo();

    StreamInfo getStreamInfo();

    boolean hasDashVideo();

    boolean hasSegmentVideo();

    boolean hasStreamInfo();
}
