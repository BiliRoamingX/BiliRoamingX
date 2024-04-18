package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes22.dex */
public enum FragmentType implements Internal.EnumLite {
    UNKNOWN(0),
    AD_FRAGMENT(1),
    OGV_FRAGMENT(2),
    UNRECOGNIZED(-1);
    
    public static final int AD_FRAGMENT_VALUE = 1;
    public static final int OGV_FRAGMENT_VALUE = 2;
    public static final int UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<FragmentType> internalValueMap = new Internal.EnumLiteMap<FragmentType>() { // from class: com.bapis.bilibili.playershared.FragmentType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public FragmentType findValueByNumber(int i) {
            return FragmentType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentType$b */
    /* loaded from: classes22.dex */
    private static final class C16008b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C16008b();

        private C16008b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FragmentType.forNumber(i) != null;
        }
    }

    FragmentType(int i) {
        this.value = i;
    }

    public static FragmentType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return OGV_FRAGMENT;
            }
            return AD_FRAGMENT;
        }
        return UNKNOWN;
    }

    public static Internal.EnumLiteMap<FragmentType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C16008b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static FragmentType valueOf(int i) {
        return forNumber(i);
    }
}
