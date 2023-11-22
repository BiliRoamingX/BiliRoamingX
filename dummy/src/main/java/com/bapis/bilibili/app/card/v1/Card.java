package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class Card extends GeneratedMessageLite<Card, Card.C5799b> implements InterfaceC5925e {
    private static final Card DEFAULT_INSTANCE;
    public static final int HOT_TOPIC_FIELD_NUMBER = 5;
    public static final int LARGE_COVER_V1_FIELD_NUMBER = 2;
    public static final int LARGE_COVER_V4_FIELD_NUMBER = 8;
    public static final int MIDDLE_COVER_V3_FIELD_NUMBER = 7;
    private static volatile Parser<Card> PARSER = null;
    public static final int POPULAR_TOP_ENTRANCE_FIELD_NUMBER = 9;
    public static final int RCMD_ONE_ITEM_FIELD_NUMBER = 10;
    public static final int SMALL_COVER_V5_AD_FIELD_NUMBER = 11;
    public static final int SMALL_COVER_V5_FIELD_NUMBER = 1;
    public static final int THREE_ITEM_ALL_V2_FIELD_NUMBER = 3;
    public static final int THREE_ITEM_H_V5_FIELD_NUMBER = 6;
    public static final int THREE_ITEM_V1_FIELD_NUMBER = 4;
    public static final int TOPIC_LIST_FIELD_NUMBER = 12;
    private int itemCase_ = 0;
    private Object item_;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum ItemCase {
        SMALL_COVER_V5(1),
        LARGE_COVER_V1(2),
        THREE_ITEM_ALL_V2(3),
        THREE_ITEM_V1(4),
        HOT_TOPIC(5),
        THREE_ITEM_H_V5(6),
        MIDDLE_COVER_V3(7),
        LARGE_COVER_V4(8),
        POPULAR_TOP_ENTRANCE(9),
        RCMD_ONE_ITEM(10),
        SMALL_COVER_V5_AD(11),
        TOPIC_LIST(12),
        ITEM_NOT_SET(0);
        
        private final int value;

        ItemCase(int i) {
            this.value = i;
        }

        public static ItemCase forNumber(int i) {
            switch (i) {
                case 0:
                    return ITEM_NOT_SET;
                case 1:
                    return SMALL_COVER_V5;
                case 2:
                    return LARGE_COVER_V1;
                case 3:
                    return THREE_ITEM_ALL_V2;
                case 4:
                    return THREE_ITEM_V1;
                case 5:
                    return HOT_TOPIC;
                case 6:
                    return THREE_ITEM_H_V5;
                case 7:
                    return MIDDLE_COVER_V3;
                case 8:
                    return LARGE_COVER_V4;
                case 9:
                    return POPULAR_TOP_ENTRANCE;
                case 10:
                    return RCMD_ONE_ITEM;
                case 11:
                    return SMALL_COVER_V5_AD;
                case 12:
                    return TOPIC_LIST;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ItemCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Card$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5798a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15948xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15948xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15948xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15948xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15948xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Card$b */
    /* loaded from: classes13.dex */
    public static final class C5799b extends GeneratedMessageLite.Builder<Card, C5799b> implements InterfaceC5925e {
        /* synthetic */ C5799b(C5798a c5798a) {
            this();
        }

        public C5799b clearHotTopic() {
            copyOnWrite();
            ((Card) this.instance).clearHotTopic();
            return this;
        }

        public C5799b clearItem() {
            copyOnWrite();
            ((Card) this.instance).clearItem();
            return this;
        }

        public C5799b clearLargeCoverV1() {
            copyOnWrite();
            ((Card) this.instance).clearLargeCoverV1();
            return this;
        }

        public C5799b clearLargeCoverV4() {
            copyOnWrite();
            ((Card) this.instance).clearLargeCoverV4();
            return this;
        }

        public C5799b clearMiddleCoverV3() {
            copyOnWrite();
            ((Card) this.instance).clearMiddleCoverV3();
            return this;
        }

        public C5799b clearPopularTopEntrance() {
            copyOnWrite();
            ((Card) this.instance).clearPopularTopEntrance();
            return this;
        }

        public C5799b clearRcmdOneItem() {
            copyOnWrite();
            ((Card) this.instance).clearRcmdOneItem();
            return this;
        }

        public C5799b clearSmallCoverV5() {
            copyOnWrite();
            ((Card) this.instance).clearSmallCoverV5();
            return this;
        }

        public C5799b clearSmallCoverV5Ad() {
            copyOnWrite();
            ((Card) this.instance).clearSmallCoverV5Ad();
            return this;
        }

        public C5799b clearThreeItemAllV2() {
            copyOnWrite();
            ((Card) this.instance).clearThreeItemAllV2();
            return this;
        }

        public C5799b clearThreeItemHV5() {
            copyOnWrite();
            ((Card) this.instance).clearThreeItemHV5();
            return this;
        }

        public C5799b clearThreeItemV1() {
            copyOnWrite();
            ((Card) this.instance).clearThreeItemV1();
            return this;
        }

        public C5799b clearTopicList() {
            copyOnWrite();
            ((Card) this.instance).clearTopicList();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public HotTopic getHotTopic() {
            return ((Card) this.instance).getHotTopic();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public ItemCase getItemCase() {
            return ((Card) this.instance).getItemCase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public LargeCoverV1 getLargeCoverV1() {
            return ((Card) this.instance).getLargeCoverV1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public LargeCoverV4 getLargeCoverV4() {
            return ((Card) this.instance).getLargeCoverV4();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public MiddleCoverV3 getMiddleCoverV3() {
            return ((Card) this.instance).getMiddleCoverV3();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public PopularTopEntrance getPopularTopEntrance() {
            return ((Card) this.instance).getPopularTopEntrance();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public RcmdOneItem getRcmdOneItem() {
            return ((Card) this.instance).getRcmdOneItem();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public SmallCoverV5 getSmallCoverV5() {
            return ((Card) this.instance).getSmallCoverV5();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public SmallCoverV5Ad getSmallCoverV5Ad() {
            return ((Card) this.instance).getSmallCoverV5Ad();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public ThreeItemAllV2 getThreeItemAllV2() {
            return ((Card) this.instance).getThreeItemAllV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public DynamicHot getThreeItemHV5() {
            return ((Card) this.instance).getThreeItemHV5();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public ThreeItemV1 getThreeItemV1() {
            return ((Card) this.instance).getThreeItemV1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public TopicList getTopicList() {
            return ((Card) this.instance).getTopicList();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasHotTopic() {
            return ((Card) this.instance).hasHotTopic();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasLargeCoverV1() {
            return ((Card) this.instance).hasLargeCoverV1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasLargeCoverV4() {
            return ((Card) this.instance).hasLargeCoverV4();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasMiddleCoverV3() {
            return ((Card) this.instance).hasMiddleCoverV3();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasPopularTopEntrance() {
            return ((Card) this.instance).hasPopularTopEntrance();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasRcmdOneItem() {
            return ((Card) this.instance).hasRcmdOneItem();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasSmallCoverV5() {
            return ((Card) this.instance).hasSmallCoverV5();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasSmallCoverV5Ad() {
            return ((Card) this.instance).hasSmallCoverV5Ad();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasThreeItemAllV2() {
            return ((Card) this.instance).hasThreeItemAllV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasThreeItemHV5() {
            return ((Card) this.instance).hasThreeItemHV5();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasThreeItemV1() {
            return ((Card) this.instance).hasThreeItemV1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
        public boolean hasTopicList() {
            return ((Card) this.instance).hasTopicList();
        }

        public C5799b mergeHotTopic(HotTopic hotTopic) {
            copyOnWrite();
            ((Card) this.instance).mergeHotTopic(hotTopic);
            return this;
        }

        public C5799b mergeLargeCoverV1(LargeCoverV1 largeCoverV1) {
            copyOnWrite();
            ((Card) this.instance).mergeLargeCoverV1(largeCoverV1);
            return this;
        }

        public C5799b mergeLargeCoverV4(LargeCoverV4 largeCoverV4) {
            copyOnWrite();
            ((Card) this.instance).mergeLargeCoverV4(largeCoverV4);
            return this;
        }

        public C5799b mergeMiddleCoverV3(MiddleCoverV3 middleCoverV3) {
            copyOnWrite();
            ((Card) this.instance).mergeMiddleCoverV3(middleCoverV3);
            return this;
        }

        public C5799b mergePopularTopEntrance(PopularTopEntrance popularTopEntrance) {
            copyOnWrite();
            ((Card) this.instance).mergePopularTopEntrance(popularTopEntrance);
            return this;
        }

        public C5799b mergeRcmdOneItem(RcmdOneItem rcmdOneItem) {
            copyOnWrite();
            ((Card) this.instance).mergeRcmdOneItem(rcmdOneItem);
            return this;
        }

        public C5799b mergeSmallCoverV5(SmallCoverV5 smallCoverV5) {
            copyOnWrite();
            ((Card) this.instance).mergeSmallCoverV5(smallCoverV5);
            return this;
        }

        public C5799b mergeSmallCoverV5Ad(SmallCoverV5Ad smallCoverV5Ad) {
            copyOnWrite();
            ((Card) this.instance).mergeSmallCoverV5Ad(smallCoverV5Ad);
            return this;
        }

        public C5799b mergeThreeItemAllV2(ThreeItemAllV2 threeItemAllV2) {
            copyOnWrite();
            ((Card) this.instance).mergeThreeItemAllV2(threeItemAllV2);
            return this;
        }

        public C5799b mergeThreeItemHV5(DynamicHot dynamicHot) {
            copyOnWrite();
            ((Card) this.instance).mergeThreeItemHV5(dynamicHot);
            return this;
        }

        public C5799b mergeThreeItemV1(ThreeItemV1 threeItemV1) {
            copyOnWrite();
            ((Card) this.instance).mergeThreeItemV1(threeItemV1);
            return this;
        }

        public C5799b mergeTopicList(TopicList topicList) {
            copyOnWrite();
            ((Card) this.instance).mergeTopicList(topicList);
            return this;
        }

        public C5799b setHotTopic(HotTopic hotTopic) {
            copyOnWrite();
            ((Card) this.instance).setHotTopic(hotTopic);
            return this;
        }

        public C5799b setLargeCoverV1(LargeCoverV1 largeCoverV1) {
            copyOnWrite();
            ((Card) this.instance).setLargeCoverV1(largeCoverV1);
            return this;
        }

        public C5799b setLargeCoverV4(LargeCoverV4 largeCoverV4) {
            copyOnWrite();
            ((Card) this.instance).setLargeCoverV4(largeCoverV4);
            return this;
        }

        public C5799b setMiddleCoverV3(MiddleCoverV3 middleCoverV3) {
            copyOnWrite();
            ((Card) this.instance).setMiddleCoverV3(middleCoverV3);
            return this;
        }

        public C5799b setPopularTopEntrance(PopularTopEntrance popularTopEntrance) {
            copyOnWrite();
            ((Card) this.instance).setPopularTopEntrance(popularTopEntrance);
            return this;
        }

        public C5799b setRcmdOneItem(RcmdOneItem rcmdOneItem) {
            copyOnWrite();
            ((Card) this.instance).setRcmdOneItem(rcmdOneItem);
            return this;
        }

        public C5799b setSmallCoverV5(SmallCoverV5 smallCoverV5) {
            copyOnWrite();
            ((Card) this.instance).setSmallCoverV5(smallCoverV5);
            return this;
        }

        public C5799b setSmallCoverV5Ad(SmallCoverV5Ad smallCoverV5Ad) {
            copyOnWrite();
            ((Card) this.instance).setSmallCoverV5Ad(smallCoverV5Ad);
            return this;
        }

        public C5799b setThreeItemAllV2(ThreeItemAllV2 threeItemAllV2) {
            copyOnWrite();
            ((Card) this.instance).setThreeItemAllV2(threeItemAllV2);
            return this;
        }

        public C5799b setThreeItemHV5(DynamicHot dynamicHot) {
            copyOnWrite();
            ((Card) this.instance).setThreeItemHV5(dynamicHot);
            return this;
        }

        public C5799b setThreeItemV1(ThreeItemV1 threeItemV1) {
            copyOnWrite();
            ((Card) this.instance).setThreeItemV1(threeItemV1);
            return this;
        }

        public C5799b setTopicList(TopicList topicList) {
            copyOnWrite();
            ((Card) this.instance).setTopicList(topicList);
            return this;
        }

        private C5799b() {
            super(Card.DEFAULT_INSTANCE);
        }

        public C5799b setHotTopic(HotTopic.C5815b c5815b) {
            copyOnWrite();
            ((Card) this.instance).setHotTopic(c5815b.build());
            return this;
        }

        public C5799b setLargeCoverV1(LargeCoverV1.C5823b c5823b) {
            copyOnWrite();
            ((Card) this.instance).setLargeCoverV1(c5823b.build());
            return this;
        }

        public C5799b setLargeCoverV4(LargeCoverV4.C5829b c5829b) {
            copyOnWrite();
            ((Card) this.instance).setLargeCoverV4(c5829b.build());
            return this;
        }

        public C5799b setMiddleCoverV3(MiddleCoverV3.C5837b c5837b) {
            copyOnWrite();
            ((Card) this.instance).setMiddleCoverV3(c5837b.build());
            return this;
        }

        public C5799b setPopularTopEntrance(PopularTopEntrance.C5849b c5849b) {
            copyOnWrite();
            ((Card) this.instance).setPopularTopEntrance(c5849b.build());
            return this;
        }

        public C5799b setRcmdOneItem(RcmdOneItem.C5851b c5851b) {
            copyOnWrite();
            ((Card) this.instance).setRcmdOneItem(c5851b.build());
            return this;
        }

        public C5799b setSmallCoverV5(SmallCoverV5.C5872b c5872b) {
            copyOnWrite();
            ((Card) this.instance).setSmallCoverV5(c5872b.build());
            return this;
        }

        public C5799b setSmallCoverV5Ad(SmallCoverV5Ad.C5874b c5874b) {
            copyOnWrite();
            ((Card) this.instance).setSmallCoverV5Ad(c5874b.build());
            return this;
        }

        public C5799b setThreeItemAllV2(ThreeItemAllV2.C5880b c5880b) {
            copyOnWrite();
            ((Card) this.instance).setThreeItemAllV2(c5880b.build());
            return this;
        }

        public C5799b setThreeItemHV5(DynamicHot.C5807b c5807b) {
            copyOnWrite();
            ((Card) this.instance).setThreeItemHV5(c5807b.build());
            return this;
        }

        public C5799b setThreeItemV1(ThreeItemV1.C5882b c5882b) {
            copyOnWrite();
            ((Card) this.instance).setThreeItemV1(c5882b.build());
            return this;
        }

        public C5799b setTopicList(TopicList.C5904b c5904b) {
            copyOnWrite();
            ((Card) this.instance).setTopicList(c5904b.build());
            return this;
        }
    }

    static {
        Card card = new Card();
        DEFAULT_INSTANCE = card;
        GeneratedMessageLite.registerDefaultInstance(Card.class, card);
    }

    private Card() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHotTopic() {
        if (this.itemCase_ == 5) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.itemCase_ = 0;
        this.item_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLargeCoverV1() {
        if (this.itemCase_ == 2) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLargeCoverV4() {
        if (this.itemCase_ == 8) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMiddleCoverV3() {
        if (this.itemCase_ == 7) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularTopEntrance() {
        if (this.itemCase_ == 9) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRcmdOneItem() {
        if (this.itemCase_ == 10) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallCoverV5() {
        if (this.itemCase_ == 1) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallCoverV5Ad() {
        if (this.itemCase_ == 11) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreeItemAllV2() {
        if (this.itemCase_ == 3) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreeItemHV5() {
        if (this.itemCase_ == 6) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreeItemV1() {
        if (this.itemCase_ == 4) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopicList() {
        if (this.itemCase_ == 12) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    public static Card getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHotTopic(HotTopic hotTopic) {
        hotTopic.getClass();
        if (this.itemCase_ == 5 && this.item_ != HotTopic.getDefaultInstance()) {
            this.item_ = HotTopic.newBuilder((HotTopic) this.item_).mergeFrom((HotTopic) hotTopic).buildPartial();
        } else {
            this.item_ = hotTopic;
        }
        this.itemCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLargeCoverV1(LargeCoverV1 largeCoverV1) {
        largeCoverV1.getClass();
        if (this.itemCase_ == 2 && this.item_ != LargeCoverV1.getDefaultInstance()) {
            this.item_ = LargeCoverV1.newBuilder((LargeCoverV1) this.item_).mergeFrom((LargeCoverV1) largeCoverV1).buildPartial();
        } else {
            this.item_ = largeCoverV1;
        }
        this.itemCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLargeCoverV4(LargeCoverV4 largeCoverV4) {
        largeCoverV4.getClass();
        if (this.itemCase_ == 8 && this.item_ != LargeCoverV4.getDefaultInstance()) {
            this.item_ = LargeCoverV4.newBuilder((LargeCoverV4) this.item_).mergeFrom((LargeCoverV4) largeCoverV4).buildPartial();
        } else {
            this.item_ = largeCoverV4;
        }
        this.itemCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMiddleCoverV3(MiddleCoverV3 middleCoverV3) {
        middleCoverV3.getClass();
        if (this.itemCase_ == 7 && this.item_ != MiddleCoverV3.getDefaultInstance()) {
            this.item_ = MiddleCoverV3.newBuilder((MiddleCoverV3) this.item_).mergeFrom((MiddleCoverV3) middleCoverV3).buildPartial();
        } else {
            this.item_ = middleCoverV3;
        }
        this.itemCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePopularTopEntrance(PopularTopEntrance popularTopEntrance) {
        popularTopEntrance.getClass();
        if (this.itemCase_ == 9 && this.item_ != PopularTopEntrance.getDefaultInstance()) {
            this.item_ = PopularTopEntrance.newBuilder((PopularTopEntrance) this.item_).mergeFrom((PopularTopEntrance) popularTopEntrance).buildPartial();
        } else {
            this.item_ = popularTopEntrance;
        }
        this.itemCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRcmdOneItem(RcmdOneItem rcmdOneItem) {
        rcmdOneItem.getClass();
        if (this.itemCase_ == 10 && this.item_ != RcmdOneItem.getDefaultInstance()) {
            this.item_ = RcmdOneItem.newBuilder((RcmdOneItem) this.item_).mergeFrom((RcmdOneItem) rcmdOneItem).buildPartial();
        } else {
            this.item_ = rcmdOneItem;
        }
        this.itemCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSmallCoverV5(SmallCoverV5 smallCoverV5) {
        smallCoverV5.getClass();
        if (this.itemCase_ == 1 && this.item_ != SmallCoverV5.getDefaultInstance()) {
            this.item_ = SmallCoverV5.newBuilder((SmallCoverV5) this.item_).mergeFrom((SmallCoverV5) smallCoverV5).buildPartial();
        } else {
            this.item_ = smallCoverV5;
        }
        this.itemCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSmallCoverV5Ad(SmallCoverV5Ad smallCoverV5Ad) {
        smallCoverV5Ad.getClass();
        if (this.itemCase_ == 11 && this.item_ != SmallCoverV5Ad.getDefaultInstance()) {
            this.item_ = SmallCoverV5Ad.newBuilder((SmallCoverV5Ad) this.item_).mergeFrom((SmallCoverV5Ad) smallCoverV5Ad).buildPartial();
        } else {
            this.item_ = smallCoverV5Ad;
        }
        this.itemCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeThreeItemAllV2(ThreeItemAllV2 threeItemAllV2) {
        threeItemAllV2.getClass();
        if (this.itemCase_ == 3 && this.item_ != ThreeItemAllV2.getDefaultInstance()) {
            this.item_ = ThreeItemAllV2.newBuilder((ThreeItemAllV2) this.item_).mergeFrom((ThreeItemAllV2) threeItemAllV2).buildPartial();
        } else {
            this.item_ = threeItemAllV2;
        }
        this.itemCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeThreeItemHV5(DynamicHot dynamicHot) {
        dynamicHot.getClass();
        if (this.itemCase_ == 6 && this.item_ != DynamicHot.getDefaultInstance()) {
            this.item_ = DynamicHot.newBuilder((DynamicHot) this.item_).mergeFrom((DynamicHot) dynamicHot).buildPartial();
        } else {
            this.item_ = dynamicHot;
        }
        this.itemCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeThreeItemV1(ThreeItemV1 threeItemV1) {
        threeItemV1.getClass();
        if (this.itemCase_ == 4 && this.item_ != ThreeItemV1.getDefaultInstance()) {
            this.item_ = ThreeItemV1.newBuilder((ThreeItemV1) this.item_).mergeFrom((ThreeItemV1) threeItemV1).buildPartial();
        } else {
            this.item_ = threeItemV1;
        }
        this.itemCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopicList(TopicList topicList) {
        topicList.getClass();
        if (this.itemCase_ == 12 && this.item_ != TopicList.getDefaultInstance()) {
            this.item_ = TopicList.newBuilder((TopicList) this.item_).mergeFrom((TopicList) topicList).buildPartial();
        } else {
            this.item_ = topicList;
        }
        this.itemCase_ = 12;
    }

    public static C5799b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Card parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Card) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Card parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Card> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTopic(HotTopic hotTopic) {
        hotTopic.getClass();
        this.item_ = hotTopic;
        this.itemCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeCoverV1(LargeCoverV1 largeCoverV1) {
        largeCoverV1.getClass();
        this.item_ = largeCoverV1;
        this.itemCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeCoverV4(LargeCoverV4 largeCoverV4) {
        largeCoverV4.getClass();
        this.item_ = largeCoverV4;
        this.itemCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMiddleCoverV3(MiddleCoverV3 middleCoverV3) {
        middleCoverV3.getClass();
        this.item_ = middleCoverV3;
        this.itemCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularTopEntrance(PopularTopEntrance popularTopEntrance) {
        popularTopEntrance.getClass();
        this.item_ = popularTopEntrance;
        this.itemCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdOneItem(RcmdOneItem rcmdOneItem) {
        rcmdOneItem.getClass();
        this.item_ = rcmdOneItem;
        this.itemCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallCoverV5(SmallCoverV5 smallCoverV5) {
        smallCoverV5.getClass();
        this.item_ = smallCoverV5;
        this.itemCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallCoverV5Ad(SmallCoverV5Ad smallCoverV5Ad) {
        smallCoverV5Ad.getClass();
        this.item_ = smallCoverV5Ad;
        this.itemCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreeItemAllV2(ThreeItemAllV2 threeItemAllV2) {
        threeItemAllV2.getClass();
        this.item_ = threeItemAllV2;
        this.itemCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreeItemHV5(DynamicHot dynamicHot) {
        dynamicHot.getClass();
        this.item_ = dynamicHot;
        this.itemCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreeItemV1(ThreeItemV1 threeItemV1) {
        threeItemV1.getClass();
        this.item_ = threeItemV1;
        this.itemCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicList(TopicList topicList) {
        topicList.getClass();
        this.item_ = topicList;
        this.itemCase_ = 12;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5798a.f15948xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Card();
            case 2:
                return new C5799b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"item_", "itemCase_", SmallCoverV5.class, LargeCoverV1.class, ThreeItemAllV2.class, ThreeItemV1.class, HotTopic.class, DynamicHot.class, MiddleCoverV3.class, LargeCoverV4.class, PopularTopEntrance.class, RcmdOneItem.class, SmallCoverV5Ad.class, TopicList.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Card> parser = PARSER;
                if (parser == null) {
                    synchronized (Card.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public HotTopic getHotTopic() {
        if (this.itemCase_ == 5) {
            return (HotTopic) this.item_;
        }
        return HotTopic.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public ItemCase getItemCase() {
        return ItemCase.forNumber(this.itemCase_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public LargeCoverV1 getLargeCoverV1() {
        if (this.itemCase_ == 2) {
            return (LargeCoverV1) this.item_;
        }
        return LargeCoverV1.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public LargeCoverV4 getLargeCoverV4() {
        if (this.itemCase_ == 8) {
            return (LargeCoverV4) this.item_;
        }
        return LargeCoverV4.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public MiddleCoverV3 getMiddleCoverV3() {
        if (this.itemCase_ == 7) {
            return (MiddleCoverV3) this.item_;
        }
        return MiddleCoverV3.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public PopularTopEntrance getPopularTopEntrance() {
        if (this.itemCase_ == 9) {
            return (PopularTopEntrance) this.item_;
        }
        return PopularTopEntrance.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public RcmdOneItem getRcmdOneItem() {
        if (this.itemCase_ == 10) {
            return (RcmdOneItem) this.item_;
        }
        return RcmdOneItem.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public SmallCoverV5 getSmallCoverV5() {
        if (this.itemCase_ == 1) {
            return (SmallCoverV5) this.item_;
        }
        return SmallCoverV5.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public SmallCoverV5Ad getSmallCoverV5Ad() {
        if (this.itemCase_ == 11) {
            return (SmallCoverV5Ad) this.item_;
        }
        return SmallCoverV5Ad.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public ThreeItemAllV2 getThreeItemAllV2() {
        if (this.itemCase_ == 3) {
            return (ThreeItemAllV2) this.item_;
        }
        return ThreeItemAllV2.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public DynamicHot getThreeItemHV5() {
        if (this.itemCase_ == 6) {
            return (DynamicHot) this.item_;
        }
        return DynamicHot.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public ThreeItemV1 getThreeItemV1() {
        if (this.itemCase_ == 4) {
            return (ThreeItemV1) this.item_;
        }
        return ThreeItemV1.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public TopicList getTopicList() {
        if (this.itemCase_ == 12) {
            return (TopicList) this.item_;
        }
        return TopicList.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasHotTopic() {
        return this.itemCase_ == 5;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasLargeCoverV1() {
        return this.itemCase_ == 2;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasLargeCoverV4() {
        return this.itemCase_ == 8;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasMiddleCoverV3() {
        return this.itemCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasPopularTopEntrance() {
        return this.itemCase_ == 9;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasRcmdOneItem() {
        return this.itemCase_ == 10;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasSmallCoverV5() {
        return this.itemCase_ == 1;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasSmallCoverV5Ad() {
        return this.itemCase_ == 11;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasThreeItemAllV2() {
        return this.itemCase_ == 3;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasThreeItemHV5() {
        return this.itemCase_ == 6;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasThreeItemV1() {
        return this.itemCase_ == 4;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5925e
    public boolean hasTopicList() {
        return this.itemCase_ == 12;
    }

    public static C5799b newBuilder(Card card) {
        return DEFAULT_INSTANCE.createBuilder(card);
    }

    public static Card parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Card) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Card parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Card parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Card parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Card parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Card parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Card parseFrom(InputStream inputStream) throws IOException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Card parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Card parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Card parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Card) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
