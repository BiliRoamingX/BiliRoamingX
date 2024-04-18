package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface OperationCardNewOrBuilder extends MessageLiteOrBuilder {
    BizType getBizType();

    int getBizTypeValue();

    OperationCardType getCardType();

    int getCardTypeValue();

    BizFollowVideoParam getFollow();

    int getFrom();

    BizReserveGameParam getGame();

    long getId();

    BizJumpLinkParam getJump();

    OperationCardNew.ParamCase getParamCase();

    OperationCardNew.RenderCase getRenderCase();

    BizReserveActivityParam getReserve();

    OperationCard getSkip();

    StandardCard getStandard();

    boolean getStatus();

    int getTo();

    boolean hasFollow();

    boolean hasGame();

    boolean hasJump();

    boolean hasReserve();

    boolean hasSkip();

    boolean hasStandard();
}
