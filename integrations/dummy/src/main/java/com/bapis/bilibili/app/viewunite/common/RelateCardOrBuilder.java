package com.bapis.bilibili.app.viewunite.common;

import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.google.protobuf.Any;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface RelateCardOrBuilder extends MessageLiteOrBuilder {
    RelatedAICard getAiCard();

    RelateAVCard getAv();

    RelateBangumiCard getBangumi();

    RelateBangumiAvCard getBangumiAv();

    RelateBangumiUGCCard getBangumiUgc();

    CardBasicInfo getBasicInfo();

    RelateCard.CardCase getCardCase();

    RelateCMCard getCm();

    Any getCmStock();

    RelateGameCard getGame();

    RelateLiveCard getLive();

    RelateCardType getRelateCardType();

    int getRelateCardTypeValue();

    RelateBangumiResourceCard getResource();

    RelateSpecial getSpecial();

    RelateThreePoint getThreePoint();

    boolean hasAiCard();

    boolean hasAv();

    boolean hasBangumi();

    boolean hasBangumiAv();

    boolean hasBangumiUgc();

    boolean hasBasicInfo();

    boolean hasCm();

    boolean hasCmStock();

    boolean hasGame();

    boolean hasLive();

    boolean hasResource();

    boolean hasSpecial();

    boolean hasThreePoint();
}
