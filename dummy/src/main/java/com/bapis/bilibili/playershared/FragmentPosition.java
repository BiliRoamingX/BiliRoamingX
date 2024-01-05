package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes22.dex */
public enum FragmentPosition implements Internal.EnumLite {
    INVALID(0),
    PRE(1),
    MIDDLE(2),
    POST(3),
    UNRECOGNIZED(-1);
    
    public static final int INVALID_VALUE = 0;
    public static final int MIDDLE_VALUE = 2;
    public static final int POST_VALUE = 3;
    public static final int PRE_VALUE = 1;
    private static final Internal.EnumLiteMap<FragmentPosition> internalValueMap = new Internal.EnumLiteMap<FragmentPosition>() { // from class: com.bapis.bilibili.playershared.FragmentPosition.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public FragmentPosition findValueByNumber(int i) {
            return FragmentPosition.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentPosition$b */
    /* loaded from: classes22.dex */
    private static final class C16006b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C16006b();

        private C16006b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FragmentPosition.forNumber(i) != null;
        }
    }

    FragmentPosition(int i) {
        this.value = i;
    }

    public static FragmentPosition forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return POST;
                }
                return MIDDLE;
            }
            return PRE;
        }
        return INVALID;
    }

    public static Internal.EnumLiteMap<FragmentPosition> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C16006b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static FragmentPosition valueOf(int i) {
        return forNumber(i);
    }
}
