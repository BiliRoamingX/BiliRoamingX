package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface PoolReplyOrBuilder extends MessageLiteOrBuilder {
    ModuleReply getModules(int i);

    int getModulesCount();

    List<ModuleReply> getModulesList();

    String getName();

    ByteString getNameBytes();
}
