package com.bapis.bilibili.app.interfaces.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.interfaces.v1.x */
/* loaded from: classes19.dex */
public interface InterfaceC6386x extends MessageLiteOrBuilder {
    boolean getIsForced();

    boolean getIsParentControl();

    long getMid();

    String getMode();

    ByteString getModeBytes();

    boolean getMustRealName();

    boolean getMustTeen();

    Policy getPolicy();

    ModelStatus getStatus();

    int getStatusValue();

    String getWsxcde();

    ByteString getWsxcdeBytes();

    boolean hasPolicy();
}
