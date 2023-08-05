package com.bapis.bilibili.dagw.component.avatar.common;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface ColorConfigOrBuilder extends MessageLiteOrBuilder {
    ColorSpec getDay();

    boolean getIsDarkModeAware();

    ColorSpec getNight();

    boolean hasDay();

    boolean hasNight();
}
