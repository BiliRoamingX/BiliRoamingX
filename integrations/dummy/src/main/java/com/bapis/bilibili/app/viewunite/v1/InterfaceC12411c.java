package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.viewunite.v1.c */
/* loaded from: classes20.dex */
public interface InterfaceC12411c extends MessageLiteOrBuilder {
    boolean containsReport(String str);

    String getBgColor();

    ByteString getBgColorBytes();

    String getBgPic();

    ByteString getBgPicBytes();

    String getIcon();

    ByteString getIconBytes();

    int getJumpType();

    boolean getNeedLogin();

    PageType getPageType();

    int getPageTypeValue();

    String getParam();

    ByteString getParamBytes();

    @Deprecated
    Map<String, String> getReport();

    int getReportCount();

    Map<String, String> getReportMap();

    String getReportOrDefault(String str, String str2);

    String getReportOrThrow(String str);

    String getStaticIcon();

    ByteString getStaticIconBytes();

    String getText();

    ByteString getTextBytes();

    MaterialBizType getType();

    int getTypeValue();

    String getUrl();

    ByteString getUrlBytes();
}
