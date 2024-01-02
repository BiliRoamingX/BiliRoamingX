package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.main.community.reply.v1.g */
/* loaded from: classes21.dex */
public interface InterfaceC14919g extends MessageLiteOrBuilder {
    String getBackground();

    ByteString getBackgroundBytes();

    double getBackgroundHeight();

    double getBackgroundWidth();

    long getEffect();

    long getEffectStartTime();

    String getImage();

    ByteString getImageBytes();

    String getJumpUrl();

    ByteString getJumpUrlBytes();

    String getLabelColorDay();

    ByteString getLabelColorDayBytes();

    String getLabelColorNight();

    ByteString getLabelColorNightBytes();

    String getTextColorDay();

    ByteString getTextColorDayBytes();

    String getTextColorNight();

    ByteString getTextColorNightBytes();

    String getTextContent();

    ByteString getTextContentBytes();

    ReplyCardLabel.Type getType();

    int getTypeValue();
}
