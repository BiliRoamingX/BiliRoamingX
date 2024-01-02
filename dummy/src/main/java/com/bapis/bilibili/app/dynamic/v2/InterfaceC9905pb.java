package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.dynamic.v2.pb */
/* loaded from: classes19.dex */
public interface InterfaceC9905pb extends MessageLiteOrBuilder {
    Extend getExtend();

    Module getModules(int i);

    int getModulesCount();

    List<Module> getModulesList();

    long getOid();

    long getOpusId();

    OpusType getOpusType();

    int getOpusTypeValue();

    boolean hasExtend();
}
