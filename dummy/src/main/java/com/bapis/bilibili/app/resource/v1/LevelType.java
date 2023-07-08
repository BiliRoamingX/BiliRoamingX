package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum LevelType implements Internal.EnumLite {
    Undefined(0),
    High(1),
    Middle(2),
    Low(3),
    UNRECOGNIZED(-1);
    
    public static final int High_VALUE = 1;
    public static final int Low_VALUE = 3;
    public static final int Middle_VALUE = 2;
    public static final int Undefined_VALUE = 0;
    private static final Internal.EnumLiteMap<LevelType> internalValueMap = new Internal.EnumLiteMap<LevelType>() { // from class: com.bapis.bilibili.app.resource.v1.LevelType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public LevelType findValueByNumber(int i) {
            return LevelType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class LevelTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new LevelTypeVerifier();

        private LevelTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LevelType.forNumber(i) != null;
        }
    }

    LevelType(int i) {
        this.value = i;
    }

    public static LevelType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Low;
                }
                return Middle;
            }
            return High;
        }
        return Undefined;
    }

    public static Internal.EnumLiteMap<LevelType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return LevelTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LevelType valueOf(int i) {
        return forNumber(i);
    }
}
