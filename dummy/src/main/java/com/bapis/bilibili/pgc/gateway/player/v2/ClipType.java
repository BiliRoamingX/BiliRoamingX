package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum ClipType implements Internal.EnumLite {
    NT_UNKNOWN(0),
    CLIP_TYPE_OP(1),
    CLIP_TYPE_ED(2),
    CLIP_TYPE_HE(3),
    CLIP_TYPE_MULTI_VIEW(4),
    UNRECOGNIZED(-1);
    
    public static final int CLIP_TYPE_ED_VALUE = 2;
    public static final int CLIP_TYPE_HE_VALUE = 3;
    public static final int CLIP_TYPE_MULTI_VIEW_VALUE = 4;
    public static final int CLIP_TYPE_OP_VALUE = 1;
    public static final int NT_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<ClipType> internalValueMap = new Internal.EnumLiteMap<ClipType>() { // from class: com.bapis.bilibili.pgc.gateway.player.v2.ClipType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ClipType findValueByNumber(int i) {
            return ClipType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ClipTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ClipTypeVerifier();

        private ClipTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ClipType.forNumber(i) != null;
        }
    }

    ClipType(int i) {
        this.value = i;
    }

    public static ClipType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CLIP_TYPE_MULTI_VIEW;
                    }
                    return CLIP_TYPE_HE;
                }
                return CLIP_TYPE_ED;
            }
            return CLIP_TYPE_OP;
        }
        return NT_UNKNOWN;
    }

    public static Internal.EnumLiteMap<ClipType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ClipTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ClipType valueOf(int i) {
        return forNumber(i);
    }
}
