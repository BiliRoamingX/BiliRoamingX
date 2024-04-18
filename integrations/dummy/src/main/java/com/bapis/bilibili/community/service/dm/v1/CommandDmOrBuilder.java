package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface CommandDmOrBuilder extends MessageLiteOrBuilder {
    int getAttr();

    boolean getAutoCreate();

    String getCommand();

    ByteString getCommandBytes();

    String getContent();

    ByteString getContentBytes();

    int getCountDown();

    String getCtime();

    ByteString getCtimeBytes();

    String getExtra();

    ByteString getExtraBytes();

    long getId();

    String getIdstr();

    ByteString getIdstrBytes();

    long getMid();

    String getMtime();

    ByteString getMtimeBytes();

    long getOid();

    int getProgress();

    int getType();
}
