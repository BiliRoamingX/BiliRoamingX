package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface DynTabOrBuilder extends MessageLiteOrBuilder {
    String getAnchor();

    ByteString getAnchorBytes();

    DynTab getBackUp();

    String getBubble();

    ByteString getBubbleBytes();

    long getCityId();

    boolean getDefaultTab();

    String getInternalTest();

    ByteString getInternalTestBytes();

    int getIsPopup();

    String getJumpHomePop();

    ByteString getJumpHomePopBytes();

    Popup getPopup();

    int getRedPoint();

    String getSubTitle();

    ByteString getSubTitleBytes();

    String getTitle();

    ByteString getTitleBytes();

    ShowType getType();

    int getTypeValue();

    String getUri();

    ByteString getUriBytes();

    boolean hasBackUp();

    boolean hasPopup();
}
