package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum SecurityLevel implements Internal.EnumLite {
    LEVEL_UNKNOWN(0),
    LEVEL_L1(1),
    LEVEL_L2(2),
    LEVEL_L3(3),
    UNRECOGNIZED(-1);
    
    public static final int LEVEL_L1_VALUE = 1;
    public static final int LEVEL_L2_VALUE = 2;
    public static final int LEVEL_L3_VALUE = 3;
    public static final int LEVEL_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<SecurityLevel> internalValueMap = new Internal.EnumLiteMap<SecurityLevel>() { // from class: com.bapis.bilibili.pgc.gateway.player.v2.SecurityLevel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SecurityLevel findValueByNumber(int i) {
            return SecurityLevel.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class SecurityLevelVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SecurityLevelVerifier();

        private SecurityLevelVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SecurityLevel.forNumber(i) != null;
        }
    }

    SecurityLevel(int i) {
        this.value = i;
    }

    public static SecurityLevel forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return LEVEL_L3;
                }
                return LEVEL_L2;
            }
            return LEVEL_L1;
        }
        return LEVEL_UNKNOWN;
    }

    public static Internal.EnumLiteMap<SecurityLevel> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SecurityLevelVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SecurityLevel valueOf(int i) {
        return forNumber(i);
    }
}
