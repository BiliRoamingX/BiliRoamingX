package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface DynScreenTabOrBuilder extends MessageLiteOrBuilder {
    boolean getDefaultTab();

    String getName();

    ByteString getNameBytes();

    boolean getStrategyShowOnEntrance();

    boolean getStrategyShowOnPullUp();

    boolean getStrategyShowOnRefresh();

    String getTitle();

    ByteString getTitleBytes();
}
