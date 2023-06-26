package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    String getKeyword(int i);

    ByteString getKeywordBytes(int i);

    int getKeywordCount();

    List<String> getKeywordList();

    Period getPeriod(int i);

    int getPeriodCount();

    List<Period> getPeriodList();

    String getUrl();

    ByteString getUrlBytes();
}
