package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.ActivityTab;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface TabModuleOrBuilder extends MessageLiteOrBuilder {
    ActivityTab getActivityTab();

    IntroductionTab getIntroduction();

    ReplyTab getReply();

    TabModule.TabCase getTabCase();

    TabType getTabType();

    int getTabTypeValue();

    boolean hasActivityTab();

    boolean hasIntroduction();

    boolean hasReply();
}
