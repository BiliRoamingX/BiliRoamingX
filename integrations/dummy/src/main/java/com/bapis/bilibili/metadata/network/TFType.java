package com.bapis.bilibili.metadata.network;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes23.dex */
public enum TFType implements Internal.EnumLite {
    TF_UNKNOWN(0),
    U_CARD(1),
    U_PKG(2),
    C_CARD(3),
    C_PKG(4),
    T_CARD(5),
    T_PKG(6),
    UNRECOGNIZED(-1);

    public static final int C_CARD_VALUE = 3;
    public static final int C_PKG_VALUE = 4;
    public static final int TF_UNKNOWN_VALUE = 0;
    public static final int T_CARD_VALUE = 5;
    public static final int T_PKG_VALUE = 6;
    public static final int U_CARD_VALUE = 1;
    public static final int U_PKG_VALUE = 2;
    private static final Internal.EnumLiteMap<TFType> internalValueMap = new Internal.EnumLiteMap<TFType>() { // from class: com.bapis.bilibili.metadata.network.TFType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public TFType findValueByNumber(int i14) {
            return TFType.forNumber(i14);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes23.dex */
    private static final class b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i14) {
            if (TFType.forNumber(i14) != null) {
                return true;
            }
            return false;
        }
    }

    TFType(int i14) {
        this.value = i14;
    }

    public static TFType forNumber(int i14) {
        switch (i14) {
            case 0:
                return TF_UNKNOWN;
            case 1:
                return U_CARD;
            case 2:
                return U_PKG;
            case 3:
                return C_CARD;
            case 4:
                return C_PKG;
            case 5:
                return T_CARD;
            case 6:
                return T_PKG;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<TFType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TFType valueOf(int i14) {
        return forNumber(i14);
    }
}
