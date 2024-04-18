package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface OperationCardV2OrBuilder extends MessageLiteOrBuilder {
    BizType getBizType();

    int getBizTypeValue();

    OperationCardV2Content getContent();

    BizFollowVideoParam getFollow();

    int getFrom();

    BizReserveGameParam getGame();

    long getId();

    BizJumpLinkParam getJump();

    OperationCardV2.ParamCase getParamCase();

    BizReserveActivityParam getReserve();

    boolean getStatus();

    int getTo();

    boolean hasContent();

    boolean hasFollow();

    boolean hasGame();

    boolean hasJump();

    boolean hasReserve();
}
