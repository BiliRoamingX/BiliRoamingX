package com.bapis.bilibili.playershared;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.Map;

/* compiled from: BL */
/* loaded from: classes18.dex */
public interface ButtonInfoOrBuilder extends MessageLiteOrBuilder {
    boolean containsOrderReportParams(String str);

    ButtonAction getActionType();

    int getActionTypeValue();

    BadgeInfo getBadgeInfo();

    String getBgColor();

    ByteString getBgColorBytes();

    String getBgColorNight();

    ByteString getBgColorNightBytes();

    GradientColor getBgGradientColor();

    String getFrameColor();

    ByteString getFrameColorBytes();

    String getIcon();

    ByteString getIconBytes();

    String getLeftStrikethroughText();

    ByteString getLeftStrikethroughTextBytes();

    String getLink();

    ByteString getLinkBytes();

    @Deprecated
    Map<String, String> getOrderReportParams();

    int getOrderReportParamsCount();

    Map<String, String> getOrderReportParamsMap();

    String getOrderReportParamsOrDefault(String str, String str2);

    String getOrderReportParamsOrThrow(String str);

    Report getReport();

    String getSimpleBgColor();

    ByteString getSimpleBgColorBytes();

    String getSimpleBgColorNight();

    ByteString getSimpleBgColorNightBytes();

    TextInfo getSimpleTextInfo();

    TaskParam getTaskParam();

    String getText();

    ByteString getTextBytes();

    String getTextColor();

    ByteString getTextColorBytes();

    String getTextColorNight();

    ByteString getTextColorNightBytes();

    boolean hasBadgeInfo();

    boolean hasBgGradientColor();

    boolean hasReport();

    boolean hasSimpleTextInfo();

    boolean hasTaskParam();
}
