package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.community.service.dm.v1.e */
/* loaded from: classes20.dex */
public interface InterfaceC13298e extends MessageLiteOrBuilder {
    String getAction();

    ByteString getActionBytes();

    String getAnimation();

    ByteString getAnimationBytes();

    int getAttr();

    int getColor();

    DmColorfulType getColorful();

    int getColorfulValue();

    String getContent();

    ByteString getContentBytes();

    long getCtime();

    String getExtra();

    ByteString getExtraBytes();

    int getFontsize();

    long getId();

    String getIdStr();

    ByteString getIdStrBytes();

    String getMidHash();

    ByteString getMidHashBytes();

    int getMode();

    long getOid();

    int getPool();

    int getProgress();

    int getType();

    int getWeight();
}
