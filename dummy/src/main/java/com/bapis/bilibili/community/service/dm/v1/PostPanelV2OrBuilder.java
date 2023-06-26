package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface PostPanelV2OrBuilder extends MessageLiteOrBuilder {
    PostPanelBizType getBizType();

    int getBizTypeValue();

    BubbleV2 getBubble();

    CheckBoxV2 getCheckBox();

    ClickButtonV2 getClickButton();

    long getEnd();

    LabelV2 getLabel();

    PostStatus getPostStatus();

    int getPostStatusValue();

    long getStart();

    TextInputV2 getTextInput();

    ToastV2 getToast();

    boolean hasBubble();

    boolean hasCheckBox();

    boolean hasClickButton();

    boolean hasLabel();

    boolean hasTextInput();

    boolean hasToast();
}
