package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface ViewHerdDmElemOrBuilder extends MessageLiteOrBuilder {
    int getEndProgress();

    int getHerdEndCnt();

    String getHerdMsg();

    ByteString getHerdMsgBytes();

    int getHerdStartCnt();

    String getRegexRule();

    ByteString getRegexRuleBytes();

    int getStartProgress();
}
