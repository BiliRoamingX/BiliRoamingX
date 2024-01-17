package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes20.dex */
public enum UnionType implements Internal.EnumLite {
    UGC(0),
    OGV(1),
    PUGV(2),
    UNRECOGNIZED(-1);

    public static final int OGV_VALUE = 1;
    public static final int PUGV_VALUE = 2;
    public static final int UGC_VALUE = 0;
    private static final Internal.EnumLiteMap<UnionType> internalValueMap = new Internal.EnumLiteMap<UnionType>() { // from class: com.bapis.bilibili.app.viewunite.v1.UnionType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public UnionType findValueByNumber(int i2) {
            return UnionType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.UnionType$b */
    /* loaded from: classes20.dex */
    private static final class C8318b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C8318b();

        private C8318b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return UnionType.forNumber(i2) != null;
        }
    }

    UnionType(int i2) {
        this.value = i2;
    }

    public static UnionType forNumber(int i2) {
        if (i2 == 0) {
            return UGC;
        }
        if (i2 == 1) {
            return OGV;
        }
        if (i2 != 2) {
            return null;
        }
        return PUGV;
    }

    public static Internal.EnumLiteMap<UnionType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C8318b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static UnionType valueOf(int i2) {
        return forNumber(i2);
    }
}
