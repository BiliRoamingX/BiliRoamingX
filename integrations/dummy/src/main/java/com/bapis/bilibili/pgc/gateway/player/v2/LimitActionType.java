package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum LimitActionType implements Internal.EnumLite {
    LAT_UNKNOWN(0),
    SHOW_LIMIT_DIALOG(1),
    SKIP_CURRENT_EP(2),
    UNRECOGNIZED(-1);
    
    public static final int LAT_UNKNOWN_VALUE = 0;
    public static final int SHOW_LIMIT_DIALOG_VALUE = 1;
    public static final int SKIP_CURRENT_EP_VALUE = 2;
    private static final Internal.EnumLiteMap<LimitActionType> internalValueMap = new Internal.EnumLiteMap<LimitActionType>() { // from class: com.bapis.bilibili.pgc.gateway.player.v2.LimitActionType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public LimitActionType findValueByNumber(int i) {
            return LimitActionType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class LimitActionTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new LimitActionTypeVerifier();

        private LimitActionTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LimitActionType.forNumber(i) != null;
        }
    }

    LimitActionType(int i) {
        this.value = i;
    }

    public static LimitActionType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SKIP_CURRENT_EP;
            }
            return SHOW_LIMIT_DIALOG;
        }
        return LAT_UNKNOWN;
    }

    public static Internal.EnumLiteMap<LimitActionType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return LimitActionTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LimitActionType valueOf(int i) {
        return forNumber(i);
    }
}
