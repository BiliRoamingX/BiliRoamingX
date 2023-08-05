package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum ReserveBizType implements Internal.EnumLite {
    BizTypeNone(0),
    BizTypeReserveActivity(1),
    BizTypeFavSeason(2),
    UNRECOGNIZED(-1);
    
    public static final int BizTypeFavSeason_VALUE = 2;
    public static final int BizTypeNone_VALUE = 0;
    public static final int BizTypeReserveActivity_VALUE = 1;
    private static final Internal.EnumLiteMap<ReserveBizType> internalValueMap = new Internal.EnumLiteMap<ReserveBizType>() { // from class: com.bapis.bilibili.app.viewunite.common.ReserveBizType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ReserveBizType findValueByNumber(int i) {
            return ReserveBizType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class ReserveBizTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ReserveBizTypeVerifier();

        private ReserveBizTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ReserveBizType.forNumber(i) != null;
        }
    }

    ReserveBizType(int i) {
        this.value = i;
    }

    public static ReserveBizType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BizTypeFavSeason;
            }
            return BizTypeReserveActivity;
        }
        return BizTypeNone;
    }

    public static Internal.EnumLiteMap<ReserveBizType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ReserveBizTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ReserveBizType valueOf(int i) {
        return forNumber(i);
    }
}
