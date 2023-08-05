package com.bapis.bilibili.app.viewunite.common;

import com.bapis.bilibili.app.viewunite.common.KingPos;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface KingPosOrBuilder extends MessageLiteOrBuilder {
    String getCheckedToast();

    ByteString getCheckedToastBytes();

    CoinExtend getCoin();

    boolean getDisable();

    String getDisableToast();

    ByteString getDisableToastBytes();

    KingPos.ExtendCase getExtendCase();

    String getIcon();

    ByteString getIconBytes();

    LikeExtend getLike();

    KingPositionType getType();

    int getTypeValue();

    boolean hasCoin();

    boolean hasLike();
}
