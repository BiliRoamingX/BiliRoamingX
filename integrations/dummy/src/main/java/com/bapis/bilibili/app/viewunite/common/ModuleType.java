package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum ModuleType implements Internal.EnumLite {
    UNKNOWN(0),
    OGV_INTRODUCTION(1),
    OGV_TITLE(2),
    UGC_HEADLINE(3),
    UGC_INTRODUCTION(4),
    KING_POSITION(5),
    MASTER_USER_LIST(6),
    STAFFS(7),
    HONOR(8),
    OWNER(9),
    PAGE(10),
    ACTIVITY_RESERVE(11),
    LIVE_ORDER(12),
    POSITIVE(13),
    SECTION(14),
    RELATE(15),
    PUGV(16),
    COLLECTION_CARD(17),
    ACTIVITY(18),
    CHARACTER(19),
    FOLLOW_LAYER(20),
    OGV_SEASONS(21),
    UGC_SEASON(22),
    OGV_LIVE_RESERVE(23),
    COMBINATION_EPISODE(24),
    SPONSOR(25),
    ACTIVITY_ENTRANCE(26),
    THEATRE_HOT_TOPIC(27),
    RELATED_RECOMMEND(28),
    PAY_BAR(29),
    BANNER(30),
    AUDIO(31),
    AGG_CARD(32),
    SINGLE_EP(33),
    LIKE_COMMENT(34),
    ATTENTION_RECOMMEND(35),
    COVENANTER(36),
    UNRECOGNIZED(-1);
    
    public static final int ACTIVITY_ENTRANCE_VALUE = 26;
    public static final int ACTIVITY_RESERVE_VALUE = 11;
    public static final int ACTIVITY_VALUE = 18;
    public static final int AGG_CARD_VALUE = 32;
    public static final int ATTENTION_RECOMMEND_VALUE = 35;
    public static final int AUDIO_VALUE = 31;
    public static final int BANNER_VALUE = 30;
    public static final int CHARACTER_VALUE = 19;
    public static final int COLLECTION_CARD_VALUE = 17;
    public static final int COMBINATION_EPISODE_VALUE = 24;
    public static final int COVENANTER_VALUE = 36;
    public static final int FOLLOW_LAYER_VALUE = 20;
    public static final int HONOR_VALUE = 8;
    public static final int KING_POSITION_VALUE = 5;
    public static final int LIKE_COMMENT_VALUE = 34;
    public static final int LIVE_ORDER_VALUE = 12;
    public static final int MASTER_USER_LIST_VALUE = 6;
    public static final int OGV_INTRODUCTION_VALUE = 1;
    public static final int OGV_LIVE_RESERVE_VALUE = 23;
    public static final int OGV_SEASONS_VALUE = 21;
    public static final int OGV_TITLE_VALUE = 2;
    public static final int OWNER_VALUE = 9;
    public static final int PAGE_VALUE = 10;
    public static final int PAY_BAR_VALUE = 29;
    public static final int POSITIVE_VALUE = 13;
    public static final int PUGV_VALUE = 16;
    public static final int RELATED_RECOMMEND_VALUE = 28;
    public static final int RELATE_VALUE = 15;
    public static final int SECTION_VALUE = 14;
    public static final int SINGLE_EP_VALUE = 33;
    public static final int SPONSOR_VALUE = 25;
    public static final int STAFFS_VALUE = 7;
    public static final int THEATRE_HOT_TOPIC_VALUE = 27;
    public static final int UGC_HEADLINE_VALUE = 3;
    public static final int UGC_INTRODUCTION_VALUE = 4;
    public static final int UGC_SEASON_VALUE = 22;
    public static final int UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<ModuleType> internalValueMap = new Internal.EnumLiteMap<ModuleType>() { // from class: com.bapis.bilibili.app.viewunite.common.ModuleType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ModuleType findValueByNumber(int i) {
            return ModuleType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class ModuleTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ModuleTypeVerifier();

        private ModuleTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ModuleType.forNumber(i) != null;
        }
    }

    ModuleType(int i) {
        this.value = i;
    }

    public static ModuleType forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OGV_INTRODUCTION;
            case 2:
                return OGV_TITLE;
            case 3:
                return UGC_HEADLINE;
            case 4:
                return UGC_INTRODUCTION;
            case 5:
                return KING_POSITION;
            case 6:
                return MASTER_USER_LIST;
            case 7:
                return STAFFS;
            case 8:
                return HONOR;
            case 9:
                return OWNER;
            case 10:
                return PAGE;
            case 11:
                return ACTIVITY_RESERVE;
            case 12:
                return LIVE_ORDER;
            case 13:
                return POSITIVE;
            case 14:
                return SECTION;
            case 15:
                return RELATE;
            case 16:
                return PUGV;
            case 17:
                return COLLECTION_CARD;
            case 18:
                return ACTIVITY;
            case 19:
                return CHARACTER;
            case 20:
                return FOLLOW_LAYER;
            case 21:
                return OGV_SEASONS;
            case 22:
                return UGC_SEASON;
            case 23:
                return OGV_LIVE_RESERVE;
            case 24:
                return COMBINATION_EPISODE;
            case 25:
                return SPONSOR;
            case 26:
                return ACTIVITY_ENTRANCE;
            case 27:
                return THEATRE_HOT_TOPIC;
            case 28:
                return RELATED_RECOMMEND;
            case 29:
                return PAY_BAR;
            case 30:
                return BANNER;
            case 31:
                return AUDIO;
            case 32:
                return AGG_CARD;
            case 33:
                return SINGLE_EP;
            case 34:
                return LIKE_COMMENT;
            case 35:
                return ATTENTION_RECOMMEND;
            case 36:
                return COVENANTER;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<ModuleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ModuleTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ModuleType valueOf(int i) {
        return forNumber(i);
    }
}
