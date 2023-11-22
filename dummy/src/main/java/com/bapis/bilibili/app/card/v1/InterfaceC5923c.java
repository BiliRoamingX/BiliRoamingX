package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.c */
/* loaded from: classes13.dex */
public interface InterfaceC5923c extends MessageLiteOrBuilder {
    AdInfo getAdInfo();

    Args getArgs();

    String getCardGoto();

    ByteString getCardGotoBytes();

    String getCardType();

    ByteString getCardTypeBytes();

    String getCover();

    ByteString getCoverBytes();

    Button getDescButton();

    String getFromType();

    ByteString getFromTypeBytes();

    String getGoto();

    ByteString getGotoBytes();

    long getIdx();

    Mask getMask();

    String getParam();

    ByteString getParamBytes();

    PlayerArgs getPlayerArgs();

    ThreePoint getThreePoint();

    ThreePointV2 getThreePointV2(int i);

    int getThreePointV2Count();

    List<ThreePointV2> getThreePointV2List();

    ThreePointV3 getThreePointV3(int i);

    int getThreePointV3Count();

    List<ThreePointV3> getThreePointV3List();

    ThreePointV4 getThreePointV4();

    String getTitle();

    ByteString getTitleBytes();

    UpArgs getUpArgs();

    String getUri();

    ByteString getUriBytes();

    boolean hasAdInfo();

    boolean hasArgs();

    boolean hasDescButton();

    boolean hasMask();

    boolean hasPlayerArgs();

    boolean hasThreePoint();

    boolean hasThreePointV4();

    boolean hasUpArgs();
}
