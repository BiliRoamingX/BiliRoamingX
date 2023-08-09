package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum Effects implements Internal.EnumLite {
    EFFECTS_UNKNOWN(0),
    GAUSSIAN_BLUR(1),
    HALF_ALPHA(2),
    UNRECOGNIZED(-1);
    
    public static final int EFFECTS_UNKNOWN_VALUE = 0;
    public static final int GAUSSIAN_BLUR_VALUE = 1;
    public static final int HALF_ALPHA_VALUE = 2;
    private static final Internal.EnumLiteMap<Effects> internalValueMap = new Internal.EnumLiteMap<Effects>() { // from class: com.bapis.bilibili.playershared.Effects.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Effects findValueByNumber(int i) {
            return Effects.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class EffectsVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new EffectsVerifier();

        private EffectsVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Effects.forNumber(i) != null;
        }
    }

    Effects(int i) {
        this.value = i;
    }

    public static Effects forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return HALF_ALPHA;
            }
            return GAUSSIAN_BLUR;
        }
        return EFFECTS_UNKNOWN;
    }

    public static Internal.EnumLiteMap<Effects> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EffectsVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Effects valueOf(int i) {
        return forNumber(i);
    }
}
