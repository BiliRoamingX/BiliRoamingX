package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum IncrementType implements Internal.EnumLite {
    Total(0),
    Incremental(1),
    UNRECOGNIZED(-1);
    
    public static final int Incremental_VALUE = 1;
    public static final int Total_VALUE = 0;
    private static final Internal.EnumLiteMap<IncrementType> internalValueMap = new Internal.EnumLiteMap<IncrementType>() { // from class: com.bapis.bilibili.app.resource.v1.IncrementType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public IncrementType findValueByNumber(int i) {
            return IncrementType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class IncrementTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new IncrementTypeVerifier();

        private IncrementTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return IncrementType.forNumber(i) != null;
        }
    }

    IncrementType(int i) {
        this.value = i;
    }

    public static IncrementType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return Incremental;
        }
        return Total;
    }

    public static Internal.EnumLiteMap<IncrementType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return IncrementTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static IncrementType valueOf(int i) {
        return forNumber(i);
    }
}
