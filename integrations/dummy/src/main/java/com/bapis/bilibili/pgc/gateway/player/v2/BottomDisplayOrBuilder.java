package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface BottomDisplayOrBuilder extends MessageLiteOrBuilder {
    String getIcon();

    ByteString getIconBytes();

    TextInfo getTitle();

    boolean hasTitle();
}
