package com.bapis.bilibili.playershared;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.Map;

/* compiled from: BL */
/* loaded from: classes18.dex */
public interface ComprehensiveToastOrBuilder extends MessageLiteOrBuilder {
    boolean containsOrderReportParams(String str);

    ButtonInfo getButton();

    String getIcon();

    ByteString getIconBytes();

    @Deprecated
    Map<String, String> getOrderReportParams();

    int getOrderReportParamsCount();

    Map<String, String> getOrderReportParamsMap();

    String getOrderReportParamsOrDefault(String str, String str2);

    String getOrderReportParamsOrThrow(String str);

    Report getReport();

    ShowStyleType getShowStyleType();

    int getShowStyleTypeValue();

    TextInfo getToastText();

    ToastType getType();

    int getTypeValue();

    boolean hasButton();

    boolean hasReport();

    boolean hasToastText();
}
