package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.l */
/* loaded from: classes13.dex */
public interface InterfaceC5932l extends MessageLiteOrBuilder {
    Avatar getAvatar();

    Base getBase();

    String getBottomRcmdReason();

    ByteString getBottomRcmdReasonBytes();

    ReasonStyle getBottomRcmdReasonStyle();

    int getCanPlay();

    String getCoverBadge();

    String getCoverBadge2();

    ByteString getCoverBadge2Bytes();

    ByteString getCoverBadgeBytes();

    String getCoverGif();

    ByteString getCoverGifBytes();

    String getCoverLeftText1();

    ByteString getCoverLeftText1Bytes();

    String getCoverLeftText2();

    ByteString getCoverLeftText2Bytes();

    String getCoverLeftText3();

    ByteString getCoverLeftText3Bytes();

    String getCoverRightText();

    ByteString getCoverRightTextBytes();

    String getDesc();

    ByteString getDescBytes();

    ReasonStyle getLeftCoverBadgeStyle();

    LikeButton getLikeButton();

    int getOfficialIcon();

    ReasonStyle getRcmdReasonStyleV2();

    ReasonStyle getRightCoverBadgeStyle();

    int getTitleSingleLine();

    String getTopRcmdReason();

    ByteString getTopRcmdReasonBytes();

    ReasonStyle getTopRcmdReasonStyle();

    boolean hasAvatar();

    boolean hasBase();

    boolean hasBottomRcmdReasonStyle();

    boolean hasLeftCoverBadgeStyle();

    boolean hasLikeButton();

    boolean hasRcmdReasonStyleV2();

    boolean hasRightCoverBadgeStyle();

    boolean hasTopRcmdReasonStyle();
}
