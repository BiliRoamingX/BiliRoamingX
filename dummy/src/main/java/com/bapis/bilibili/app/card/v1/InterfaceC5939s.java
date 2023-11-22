package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.s */
/* loaded from: classes13.dex */
public interface InterfaceC5939s extends MessageLiteOrBuilder {
    Base getBase();

    ReasonStyle getCornerMarkStyle();

    String getCoverGif();

    ByteString getCoverGifBytes();

    String getCoverRightText1();

    ByteString getCoverRightText1Bytes();

    String getCoverRightTextContentDescription();

    ByteString getCoverRightTextContentDescriptionBytes();

    HotwordEntrance getHotwordEntrance();

    ReasonStyle getLeftCornerMarkStyle();

    ReasonStyle getRcmdReasonStyle();

    String getRightDesc1();

    ByteString getRightDesc1Bytes();

    String getRightDesc1ContentDescription();

    ByteString getRightDesc1ContentDescriptionBytes();

    String getRightDesc2();

    ByteString getRightDesc2Bytes();

    int getRightIcon1();

    int getRightIcon2();

    Up getUp();

    boolean hasBase();

    boolean hasCornerMarkStyle();

    boolean hasHotwordEntrance();

    boolean hasLeftCornerMarkStyle();

    boolean hasRcmdReasonStyle();

    boolean hasUp();
}
