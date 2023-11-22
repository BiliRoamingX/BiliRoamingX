package com.bapis.bilibili.app.card.v1;

import com.bapis.bilibili.app.card.v1.Card;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.card.v1.e */
/* loaded from: classes13.dex */
public interface InterfaceC5925e extends MessageLiteOrBuilder {
    HotTopic getHotTopic();

    Card.ItemCase getItemCase();

    LargeCoverV1 getLargeCoverV1();

    LargeCoverV4 getLargeCoverV4();

    MiddleCoverV3 getMiddleCoverV3();

    PopularTopEntrance getPopularTopEntrance();

    RcmdOneItem getRcmdOneItem();

    SmallCoverV5 getSmallCoverV5();

    SmallCoverV5Ad getSmallCoverV5Ad();

    ThreeItemAllV2 getThreeItemAllV2();

    DynamicHot getThreeItemHV5();

    ThreeItemV1 getThreeItemV1();

    TopicList getTopicList();

    boolean hasHotTopic();

    boolean hasLargeCoverV1();

    boolean hasLargeCoverV4();

    boolean hasMiddleCoverV3();

    boolean hasPopularTopEntrance();

    boolean hasRcmdOneItem();

    boolean hasSmallCoverV5();

    boolean hasSmallCoverV5Ad();

    boolean hasThreeItemAllV2();

    boolean hasThreeItemHV5();

    boolean hasThreeItemV1();

    boolean hasTopicList();
}
