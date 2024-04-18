package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface VersionListReqOrBuilder extends MessageLiteOrBuilder {
    String getPoolName();

    ByteString getPoolNameBytes();

    VersionReq getVersions(int i);

    int getVersionsCount();

    List<VersionReq> getVersionsList();
}
