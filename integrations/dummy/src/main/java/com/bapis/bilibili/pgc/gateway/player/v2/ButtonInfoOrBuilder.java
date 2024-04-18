package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.Map;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface ButtonInfoOrBuilder extends MessageLiteOrBuilder {
    boolean containsOrderReportParams(String str);

    String getActionType();

    ByteString getActionTypeBytes();

    BadgeInfo getBadgeInfo();

    String getBgColor();

    ByteString getBgColorBytes();

    String getBgColorNight();

    ByteString getBgColorNightBytes();

    GradientColor getBgGradientColor();

    long getJumpType();

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

    String getPcLink();

    ByteString getPcLinkBytes();

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
