package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface CommandDmOrBuilder extends MessageLiteOrBuilder {
    String getCommand();

    ByteString getCommandBytes();

    String getContent();

    ByteString getContentBytes();

    String getCtime();

    ByteString getCtimeBytes();

    String getExtra();

    ByteString getExtraBytes();

    long getId();

    String getIdStr();

    ByteString getIdStrBytes();

    long getMid();

    String getMtime();

    ByteString getMtimeBytes();

    long getOid();

    int getProgress();
}
