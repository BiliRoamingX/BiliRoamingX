package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface SubtitleItemOrBuilder extends MessageLiteOrBuilder {
    SubtitleAiStatus getAiStatus();

    int getAiStatusValue();

    SubtitleAiType getAiType();

    int getAiTypeValue();

    UserInfo getAuthor();

    long getId();

    String getIdStr();

    ByteString getIdStrBytes();

    String getLan();

    ByteString getLanBytes();

    String getLanDoc();

    String getLanDocBrief();

    ByteString getLanDocBriefBytes();

    ByteString getLanDocBytes();

    String getSubtitleUrl();

    ByteString getSubtitleUrlBytes();

    SubtitleType getType();

    int getTypeValue();

    boolean hasAuthor();
}
