package com.bapis.bilibili.playershared;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes18.dex */
public interface BottomDisplayOrBuilder extends MessageLiteOrBuilder {
    String getIcon();

    ByteString getIconBytes();

    TextInfo getTitle();

    boolean hasTitle();
}
