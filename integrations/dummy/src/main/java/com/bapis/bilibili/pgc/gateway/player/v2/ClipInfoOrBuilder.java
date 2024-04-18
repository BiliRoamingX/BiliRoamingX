package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface ClipInfoOrBuilder extends MessageLiteOrBuilder {
    ClipType getClipType();

    int getClipTypeValue();

    int getEnd();

    long getMaterialNo();

    MultiView getMultiView();

    int getStart();

    String getToastText();

    ByteString getToastTextBytes();

    boolean hasMultiView();
}
