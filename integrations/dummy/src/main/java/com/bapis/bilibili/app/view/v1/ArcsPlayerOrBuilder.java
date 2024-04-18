package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface ArcsPlayerOrBuilder extends MessageLiteOrBuilder {
    boolean containsPlayerInfo(long j);

    long getAid();

    @Deprecated
    Map<Long, String> getPlayerInfo();

    int getPlayerInfoCount();

    Map<Long, String> getPlayerInfoMap();

    String getPlayerInfoOrDefault(long j, String str);

    String getPlayerInfoOrThrow(long j);
}
