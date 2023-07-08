package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum EnvType implements Internal.EnumLite {
    Unknown(0),
    Release(1),
    Test(2),
    UNRECOGNIZED(-1);
    
    public static final int Release_VALUE = 1;
    public static final int Test_VALUE = 2;
    public static final int Unknown_VALUE = 0;
    private static final Internal.EnumLiteMap<EnvType> internalValueMap = new Internal.EnumLiteMap<EnvType>() { // from class: com.bapis.bilibili.app.resource.v1.EnvType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EnvType findValueByNumber(int i) {
            return EnvType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class EnvTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new EnvTypeVerifier();

        private EnvTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return EnvType.forNumber(i) != null;
        }
    }

    EnvType(int i) {
        this.value = i;
    }

    public static EnvType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Test;
            }
            return Release;
        }
        return Unknown;
    }

    public static Internal.EnumLiteMap<EnvType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EnvTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnvType valueOf(int i) {
        return forNumber(i);
    }
}
