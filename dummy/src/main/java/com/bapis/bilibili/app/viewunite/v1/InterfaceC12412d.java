package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.viewunite.v1.d */
/* loaded from: classes20.dex */
public interface InterfaceC12412d extends MessageLiteOrBuilder {
    BizType getBizType();

    int getBizTypeValue();

    OperationCardContent getContent();

    BizFollowVideoParam getFollow();

    int getFrom();

    BizReserveGameParam getGame();

    long getId();

    BizJumpLinkParam getJump();

    OperationCard.ParamCase getParamCase();

    BizReserveActivityParam getReserve();

    boolean getStatus();

    int getTo();

    boolean hasContent();

    boolean hasFollow();

    boolean hasGame();

    boolean hasJump();

    boolean hasReserve();
}
