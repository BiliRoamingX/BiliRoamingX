package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum BizType implements Internal.EnumLite {
    BIZ_TYPE_UNKNOWN(0),
    BIZ_TYPE_UGC(1),
    BIZ_TYPE_PGC(2),
    BIZ_TYPE_PUGV(3),
    UNRECOGNIZED(-1);
    
    public static final int BIZ_TYPE_PGC_VALUE = 2;
    public static final int BIZ_TYPE_PUGV_VALUE = 3;
    public static final int BIZ_TYPE_UGC_VALUE = 1;
    public static final int BIZ_TYPE_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<BizType> internalValueMap = new Internal.EnumLiteMap<BizType>() { // from class: com.bapis.bilibili.playershared.BizType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public BizType findValueByNumber(int i) {
            return BizType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class BizTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new BizTypeVerifier();

        private BizTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return BizType.forNumber(i) != null;
        }
    }

    BizType(int i) {
        this.value = i;
    }

    public static BizType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return BIZ_TYPE_PUGV;
                }
                return BIZ_TYPE_PGC;
            }
            return BIZ_TYPE_UGC;
        }
        return BIZ_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<BizType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return BizTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BizType valueOf(int i) {
        return forNumber(i);
    }
}
