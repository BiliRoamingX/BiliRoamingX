package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface PlayToastOrBuilder extends MessageLiteOrBuilder {
    PlayToastEnum getBusiness();

    int getBusinessValue();

    String getIconUrl();

    ByteString getIconUrlBytes();

    String getText();

    ByteString getTextBytes();
}
