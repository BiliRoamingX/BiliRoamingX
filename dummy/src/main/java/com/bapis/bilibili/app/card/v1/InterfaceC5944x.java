package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.x */
/* loaded from: classes13.dex */
public interface InterfaceC5944x extends MessageLiteOrBuilder {
    int getDefaultId();

    String getIcon();

    ByteString getIconBytes();

    long getId();

    DislikeReason getReasons(int i);

    int getReasonsCount();

    List<DislikeReason> getReasonsList();

    int getSelected();

    String getSelectedIcon();

    ByteString getSelectedIconBytes();

    String getSelectedTitle();

    ByteString getSelectedTitleBytes();

    String getSubtitle();

    ByteString getSubtitleBytes();

    String getTitle();

    ByteString getTitleBytes();

    String getType();

    ByteString getTypeBytes();

    String getUrl();

    ByteString getUrlBytes();
}
