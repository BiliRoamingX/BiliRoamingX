package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface GyroscopeEntityV2OrBuilder extends MessageLiteOrBuilder {
    GyroscopeContentV2 getContents(int i);

    int getContentsCount();

    List<GyroscopeContentV2> getContentsList();

    String getDisplayType();

    ByteString getDisplayTypeBytes();
}
