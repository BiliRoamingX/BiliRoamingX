package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum HonorType implements Internal.EnumLite {
    HONOR_NONE(0),
    PLAYLET(1),
    ARGUE(2),
    NOTICE(3),
    GUIDANCE(4),
    HONOR_BILI_RANK(5),
    HONOR_WEEKLY_RANK(6),
    HONOR_DAILY_RANK(7),
    HONOR_CHANNEL(8),
    HONOR_MUSIC(9),
    HONOR_REPLY(10),
    UNRECOGNIZED(-1);
    
    public static final int ARGUE_VALUE = 2;
    public static final int GUIDANCE_VALUE = 4;
    public static final int HONOR_BILI_RANK_VALUE = 5;
    public static final int HONOR_CHANNEL_VALUE = 8;
    public static final int HONOR_DAILY_RANK_VALUE = 7;
    public static final int HONOR_MUSIC_VALUE = 9;
    public static final int HONOR_NONE_VALUE = 0;
    public static final int HONOR_REPLY_VALUE = 10;
    public static final int HONOR_WEEKLY_RANK_VALUE = 6;
    public static final int NOTICE_VALUE = 3;
    public static final int PLAYLET_VALUE = 1;
    private static final Internal.EnumLiteMap<HonorType> internalValueMap = new Internal.EnumLiteMap<HonorType>() { // from class: com.bapis.bilibili.app.viewunite.common.HonorType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public HonorType findValueByNumber(int i) {
            return HonorType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class HonorTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new HonorTypeVerifier();

        private HonorTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return HonorType.forNumber(i) != null;
        }
    }

    HonorType(int i) {
        this.value = i;
    }

    public static HonorType forNumber(int i) {
        switch (i) {
            case 0:
                return HONOR_NONE;
            case 1:
                return PLAYLET;
            case 2:
                return ARGUE;
            case 3:
                return NOTICE;
            case 4:
                return GUIDANCE;
            case 5:
                return HONOR_BILI_RANK;
            case 6:
                return HONOR_WEEKLY_RANK;
            case 7:
                return HONOR_DAILY_RANK;
            case 8:
                return HONOR_CHANNEL;
            case 9:
                return HONOR_MUSIC;
            case 10:
                return HONOR_REPLY;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<HonorType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HonorTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HonorType valueOf(int i) {
        return forNumber(i);
    }
}
