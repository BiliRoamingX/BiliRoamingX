package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface j1 extends MessageLiteOrBuilder {
    DynamicType getCardType();

    int getCardTypeValue();

    Extend getExtend();

    int getHasFold();

    DynamicType getItemType();

    int getItemTypeValue();

    Module getModules(int i2);

    int getModulesCount();

    List<Module> getModulesList();

    String getServerInfo();

    ByteString getServerInfoBytes();

    boolean hasExtend();
}
