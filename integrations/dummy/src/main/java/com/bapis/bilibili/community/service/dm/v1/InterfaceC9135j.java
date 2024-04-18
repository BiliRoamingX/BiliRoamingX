package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.community.service.dm.v1.j */
/* loaded from: classes20.dex */
public interface InterfaceC9135j extends MessageLiteOrBuilder {
    long getOid();

    long getPid();

    PostPanelV2 getPostPanel2(int i2);

    int getPostPanel2Count();

    List<PostPanelV2> getPostPanel2List();

    int getType();
}
