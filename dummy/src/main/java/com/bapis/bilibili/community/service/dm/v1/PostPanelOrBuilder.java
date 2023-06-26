package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface PostPanelOrBuilder extends MessageLiteOrBuilder {
    long getBizId();

    PostPanelBizType getBizType();

    int getBizTypeValue();

    CheckBox getCheckBox();

    ClickButton getClickButton();

    long getEnd();

    long getPriority();

    long getStart();

    TextInput getTextInput();

    Toast getToast();

    boolean hasCheckBox();

    boolean hasClickButton();

    boolean hasTextInput();

    boolean hasToast();
}
