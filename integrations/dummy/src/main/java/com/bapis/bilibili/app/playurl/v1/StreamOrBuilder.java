package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface StreamOrBuilder extends MessageLiteOrBuilder {
    Stream.ContentCase getContentCase();

    DashVideo getDashVideo();

    SegmentVideo getSegmentVideo();

    StreamInfo getStreamInfo();

    boolean hasDashVideo();

    boolean hasSegmentVideo();

    boolean hasStreamInfo();
}
