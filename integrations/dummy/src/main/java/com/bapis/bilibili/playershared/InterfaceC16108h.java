package com.bapis.bilibili.playershared;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.playershared.h */
/* loaded from: classes22.dex */
public interface InterfaceC16108h extends MessageLiteOrBuilder {
    Dimension getDimension();

    FragmentInfo getFragmentInfo();

    PlayArcConf getPlayArcConf();

    boolean getPlayableStatus();

    long getTimelength();

    BizType getVideoType();

    int getVideoTypeValue();

    VodInfo getVodInfo();

    boolean hasDimension();

    boolean hasFragmentInfo();

    boolean hasPlayArcConf();

    boolean hasVodInfo();
}
