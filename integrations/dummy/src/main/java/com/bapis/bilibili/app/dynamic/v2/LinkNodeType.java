package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum LinkNodeType implements Internal.EnumLite {
    INVALID(0),
    VIDEO(1),
    RESERVE(2),
    VOTE(3),
    LIVE(4),
    LOTTERY(5),
    MATCH(6),
    GOODS(7),
    OGV_SS(8),
    OGV_EP(9),
    MANGA(10),
    CHEESE(11),
    VIDEO_TS(12),
    AT(13),
    HASH_TAG(14),
    ARTICLE(15),
    URL(16),
    MAIL(17),
    LBS(18),
    ACTIVITY(19),
    ATTACH_CARD_OFFICIAL_ACTIVITY(20),
    GAME(21),
    DECORATION(22),
    UP_TOPIC(23),
    UP_ACTIVITY(24),
    UP_MAOER(25),
    MEMBER_GOODS(26),
    OPENMALL_UP_ITEMS(27),
    SEARCH(28),
    MUSIC(29),
    GPT_RCMD_QUESTION(30),
    MEMBER_TICKET(31),
    REPOST_PIC_URL(32),
    REPOST_PIC_DYN_URL(33),
    OGV_FOLLOW_CARD(34),
    ARTICLE_GOODS(35),
    ARTICLE_TAG(36),
    UNRECOGNIZED(-1);

    public static final int ACTIVITY_VALUE = 19;
    public static final int ARTICLE_GOODS_VALUE = 35;
    public static final int ARTICLE_TAG_VALUE = 36;
    public static final int ARTICLE_VALUE = 15;
    public static final int ATTACH_CARD_OFFICIAL_ACTIVITY_VALUE = 20;
    public static final int AT_VALUE = 13;
    public static final int CHEESE_VALUE = 11;
    public static final int DECORATION_VALUE = 22;
    public static final int GAME_VALUE = 21;
    public static final int GOODS_VALUE = 7;
    public static final int GPT_RCMD_QUESTION_VALUE = 30;
    public static final int HASH_TAG_VALUE = 14;
    public static final int INVALID_VALUE = 0;
    public static final int LBS_VALUE = 18;
    public static final int LIVE_VALUE = 4;
    public static final int LOTTERY_VALUE = 5;
    public static final int MAIL_VALUE = 17;
    public static final int MANGA_VALUE = 10;
    public static final int MATCH_VALUE = 6;
    public static final int MEMBER_GOODS_VALUE = 26;
    public static final int MEMBER_TICKET_VALUE = 31;
    public static final int MUSIC_VALUE = 29;
    public static final int OGV_EP_VALUE = 9;
    public static final int OGV_FOLLOW_CARD_VALUE = 34;
    public static final int OGV_SS_VALUE = 8;
    public static final int OPENMALL_UP_ITEMS_VALUE = 27;
    public static final int REPOST_PIC_DYN_URL_VALUE = 33;
    public static final int REPOST_PIC_URL_VALUE = 32;
    public static final int RESERVE_VALUE = 2;
    public static final int SEARCH_VALUE = 28;
    public static final int UP_ACTIVITY_VALUE = 24;
    public static final int UP_MAOER_VALUE = 25;
    public static final int UP_TOPIC_VALUE = 23;
    public static final int URL_VALUE = 16;
    public static final int VIDEO_TS_VALUE = 12;
    public static final int VIDEO_VALUE = 1;
    public static final int VOTE_VALUE = 3;
    private static final Internal.EnumLiteMap<LinkNodeType> internalValueMap = new Internal.EnumLiteMap<LinkNodeType>() { // from class: com.bapis.bilibili.app.dynamic.v2.LinkNodeType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public LinkNodeType findValueByNumber(int i2) {
            return LinkNodeType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.LinkNodeType$b */
    /* loaded from: classes19.dex */
    private static final class C5644b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C5644b();

        private C5644b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return LinkNodeType.forNumber(i2) != null;
        }
    }

    LinkNodeType(int i2) {
        this.value = i2;
    }

    public static LinkNodeType forNumber(int i2) {
        switch (i2) {
            case 0:
                return INVALID;
            case 1:
                return VIDEO;
            case 2:
                return RESERVE;
            case 3:
                return VOTE;
            case 4:
                return LIVE;
            case 5:
                return LOTTERY;
            case 6:
                return MATCH;
            case 7:
                return GOODS;
            case 8:
                return OGV_SS;
            case 9:
                return OGV_EP;
            case 10:
                return MANGA;
            case 11:
                return CHEESE;
            case 12:
                return VIDEO_TS;
            case 13:
                return AT;
            case 14:
                return HASH_TAG;
            case 15:
                return ARTICLE;
            case 16:
                return URL;
            case 17:
                return MAIL;
            case 18:
                return LBS;
            case 19:
                return ACTIVITY;
            case 20:
                return ATTACH_CARD_OFFICIAL_ACTIVITY;
            case 21:
                return GAME;
            case 22:
                return DECORATION;
            case 23:
                return UP_TOPIC;
            case 24:
                return UP_ACTIVITY;
            case 25:
                return UP_MAOER;
            case 26:
                return MEMBER_GOODS;
            case 27:
                return OPENMALL_UP_ITEMS;
            case 28:
                return SEARCH;
            case 29:
                return MUSIC;
            case 30:
                return GPT_RCMD_QUESTION;
            case 31:
                return MEMBER_TICKET;
            case 32:
                return REPOST_PIC_URL;
            case 33:
                return REPOST_PIC_DYN_URL;
            case 34:
                return OGV_FOLLOW_CARD;
            case 35:
                return ARTICLE_GOODS;
            case 36:
                return ARTICLE_TAG;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<LinkNodeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C5644b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LinkNodeType valueOf(int i2) {
        return forNumber(i2);
    }
}
