package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface ViewMaterialOrBuilder extends MessageLiteOrBuilder {
    String getAuthor();

    ByteString getAuthorBytes();

    String getJumpUrl();

    ByteString getJumpUrlBytes();

    long getMid();

    long getOid();

    String getTitle();

    ByteString getTitleBytes();
}
