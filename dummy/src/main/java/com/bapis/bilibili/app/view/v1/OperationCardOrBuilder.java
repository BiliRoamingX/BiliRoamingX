package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface OperationCardOrBuilder extends MessageLiteOrBuilder {
    String getButtonText();

    ByteString getButtonTextBytes();

    String getContent();

    ByteString getContentBytes();

    int getEndTime();

    String getIcon();

    ByteString getIconBytes();

    int getStartTime();

    String getTitle();

    ByteString getTitleBytes();

    String getUrl();

    ByteString getUrlBytes();
}
