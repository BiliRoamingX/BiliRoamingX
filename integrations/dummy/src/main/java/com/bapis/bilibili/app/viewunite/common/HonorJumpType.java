package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum HonorJumpType implements Internal.EnumLite {
    HONOR_JUMP_TYPE_UNKNOWN(0),
    HONOR_OPEN_URL(1),
    HONOR_HALF_SCREEN(2),
    UNRECOGNIZED(-1);
    
    public static final int HONOR_HALF_SCREEN_VALUE = 2;
    public static final int HONOR_JUMP_TYPE_UNKNOWN_VALUE = 0;
    public static final int HONOR_OPEN_URL_VALUE = 1;
    private static final Internal.EnumLiteMap<HonorJumpType> internalValueMap = new Internal.EnumLiteMap<HonorJumpType>() { // from class: com.bapis.bilibili.app.viewunite.common.HonorJumpType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public HonorJumpType findValueByNumber(int i) {
            return HonorJumpType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class HonorJumpTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new HonorJumpTypeVerifier();

        private HonorJumpTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return HonorJumpType.forNumber(i) != null;
        }
    }

    HonorJumpType(int i) {
        this.value = i;
    }

    public static HonorJumpType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return HONOR_HALF_SCREEN;
            }
            return HONOR_OPEN_URL;
        }
        return HONOR_JUMP_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<HonorJumpType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HonorJumpTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HonorJumpType valueOf(int i) {
        return forNumber(i);
    }
}
