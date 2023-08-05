package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum RelateCardType implements Internal.EnumLite {
    CARD_TYPE_UNKNOWN(0),
    AV(1),
    BANGUMI(2),
    RESOURCE(3),
    GAME(4),
    CM(5),
    LIVE(6),
    AI_RECOMMEND(7),
    BANGUMI_AV(8),
    BANGUMI_UGC(9),
    SPECIAL(10),
    UNRECOGNIZED(-1);
    
    public static final int AI_RECOMMEND_VALUE = 7;
    public static final int AV_VALUE = 1;
    public static final int BANGUMI_AV_VALUE = 8;
    public static final int BANGUMI_UGC_VALUE = 9;
    public static final int BANGUMI_VALUE = 2;
    public static final int CARD_TYPE_UNKNOWN_VALUE = 0;
    public static final int CM_VALUE = 5;
    public static final int GAME_VALUE = 4;
    public static final int LIVE_VALUE = 6;
    public static final int RESOURCE_VALUE = 3;
    public static final int SPECIAL_VALUE = 10;
    private static final Internal.EnumLiteMap<RelateCardType> internalValueMap = new Internal.EnumLiteMap<RelateCardType>() { // from class: com.bapis.bilibili.app.viewunite.common.RelateCardType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public RelateCardType findValueByNumber(int i) {
            return RelateCardType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class RelateCardTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new RelateCardTypeVerifier();

        private RelateCardTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RelateCardType.forNumber(i) != null;
        }
    }

    RelateCardType(int i) {
        this.value = i;
    }

    public static RelateCardType forNumber(int i) {
        switch (i) {
            case 0:
                return CARD_TYPE_UNKNOWN;
            case 1:
                return AV;
            case 2:
                return BANGUMI;
            case 3:
                return RESOURCE;
            case 4:
                return GAME;
            case 5:
                return CM;
            case 6:
                return LIVE;
            case 7:
                return AI_RECOMMEND;
            case 8:
                return BANGUMI_AV;
            case 9:
                return BANGUMI_UGC;
            case 10:
                return SPECIAL;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<RelateCardType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return RelateCardTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RelateCardType valueOf(int i) {
        return forNumber(i);
    }
}
