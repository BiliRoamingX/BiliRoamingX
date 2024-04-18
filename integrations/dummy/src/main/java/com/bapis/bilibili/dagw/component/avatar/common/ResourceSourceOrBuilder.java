package com.bapis.bilibili.dagw.component.avatar.common;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface ResourceSourceOrBuilder extends MessageLiteOrBuilder {
    NativeDrawRes getDraw();

    ResourceSource.LocalRes getLocal();

    int getLocalValue();

    ResourceSource.LocalRes getPlaceholder();

    int getPlaceholderValue();

    RemoteRes getRemote();

    ResourceSource.ResCase getResCase();

    ResourceSource.SourceType getSrcType();

    int getSrcTypeValue();

    boolean hasDraw();

    boolean hasLocal();

    boolean hasRemote();
}
