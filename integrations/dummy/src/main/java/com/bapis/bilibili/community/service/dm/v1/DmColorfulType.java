package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes20.dex */
public enum DmColorfulType implements Internal.EnumLite {
    NoneType(0),
    VipGradualColor(60001),
    UNRECOGNIZED(-1);
    
    public static final int NoneType_VALUE = 0;
    public static final int VipGradualColor_VALUE = 60001;
    private static final Internal.EnumLiteMap<DmColorfulType> internalValueMap = new Internal.EnumLiteMap<DmColorfulType>() { // from class: com.bapis.bilibili.community.service.dm.v1.DmColorfulType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DmColorfulType findValueByNumber(int i) {
            return DmColorfulType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmColorfulType$b */
    /* loaded from: classes20.dex */
    private static final class C13157b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C13157b();

        private C13157b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DmColorfulType.forNumber(i) != null;
        }
    }

    DmColorfulType(int i) {
        this.value = i;
    }

    public static DmColorfulType forNumber(int i) {
        if (i != 0) {
            if (i != 60001) {
                return null;
            }
            return VipGradualColor;
        }
        return NoneType;
    }

    public static Internal.EnumLiteMap<DmColorfulType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C13157b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DmColorfulType valueOf(int i) {
        return forNumber(i);
    }
}
