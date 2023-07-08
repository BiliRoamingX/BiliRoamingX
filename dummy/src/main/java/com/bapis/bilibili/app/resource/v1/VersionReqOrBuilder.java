package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface VersionReqOrBuilder extends MessageLiteOrBuilder {
    String getModuleName();

    ByteString getModuleNameBytes();

    long getVersion();
}
