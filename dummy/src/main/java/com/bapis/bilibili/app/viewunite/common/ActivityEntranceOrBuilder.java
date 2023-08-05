package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface ActivityEntranceOrBuilder extends MessageLiteOrBuilder {
    boolean containsReport(String str);

    String getActivityCover();

    ByteString getActivityCoverBytes();

    String getActivityLink();

    ByteString getActivityLinkBytes();

    String getActivitySubtitle();

    ByteString getActivitySubtitleBytes();

    String getActivityTitle();

    ByteString getActivityTitleBytes();

    int getActivityType();

    @Deprecated
    Map<String, String> getReport();

    int getReportCount();

    Map<String, String> getReportMap();

    String getReportOrDefault(String str, String str2);

    String getReportOrThrow(String str);

    int getReserveId();

    int getStatus();

    User getUpperList(int i);

    int getUpperListCount();

    List<User> getUpperListList();

    String getWordTag();

    ByteString getWordTagBytes();
}
