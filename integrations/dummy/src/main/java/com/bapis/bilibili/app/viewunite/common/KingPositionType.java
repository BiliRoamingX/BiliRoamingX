package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum KingPositionType implements Internal.EnumLite {
    KING_POS_UNSPECIFIED(0),
    LIKE(1),
    DISLIKE(2),
    COIN(3),
    FAV(4),
    SHARE(5),
    CACHE(6),
    DANMAKU(7),
    UNRECOGNIZED(-1);
    
    public static final int CACHE_VALUE = 6;
    public static final int COIN_VALUE = 3;
    public static final int DANMAKU_VALUE = 7;
    public static final int DISLIKE_VALUE = 2;
    public static final int FAV_VALUE = 4;
    public static final int KING_POS_UNSPECIFIED_VALUE = 0;
    public static final int LIKE_VALUE = 1;
    public static final int SHARE_VALUE = 5;
    private static final Internal.EnumLiteMap<KingPositionType> internalValueMap = new Internal.EnumLiteMap<KingPositionType>() { // from class: com.bapis.bilibili.app.viewunite.common.KingPositionType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public KingPositionType findValueByNumber(int i) {
            return KingPositionType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class KingPositionTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new KingPositionTypeVerifier();

        private KingPositionTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return KingPositionType.forNumber(i) != null;
        }
    }

    KingPositionType(int i) {
        this.value = i;
    }

    public static KingPositionType forNumber(int i) {
        switch (i) {
            case 0:
                return KING_POS_UNSPECIFIED;
            case 1:
                return LIKE;
            case 2:
                return DISLIKE;
            case 3:
                return COIN;
            case 4:
                return FAV;
            case 5:
                return SHARE;
            case 6:
                return CACHE;
            case 7:
                return DANMAKU;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<KingPositionType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return KingPositionTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KingPositionType valueOf(int i) {
        return forNumber(i);
    }
}
