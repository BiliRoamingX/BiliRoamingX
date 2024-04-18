package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum InlineType implements Internal.EnumLite {
    TYPE_UNKNOWN(0),
    TYPE_WHOLE(1),
    TYPE_HE_CLIP(2),
    TYPE_PREVIEW(3),
    UNRECOGNIZED(-1);
    
    public static final int TYPE_HE_CLIP_VALUE = 2;
    public static final int TYPE_PREVIEW_VALUE = 3;
    public static final int TYPE_UNKNOWN_VALUE = 0;
    public static final int TYPE_WHOLE_VALUE = 1;
    private static final Internal.EnumLiteMap<InlineType> internalValueMap = new Internal.EnumLiteMap<InlineType>() { // from class: com.bapis.bilibili.pgc.gateway.player.v2.InlineType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public InlineType findValueByNumber(int i) {
            return InlineType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class InlineTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new InlineTypeVerifier();

        private InlineTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return InlineType.forNumber(i) != null;
        }
    }

    InlineType(int i) {
        this.value = i;
    }

    public static InlineType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return TYPE_PREVIEW;
                }
                return TYPE_HE_CLIP;
            }
            return TYPE_WHOLE;
        }
        return TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<InlineType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return InlineTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static InlineType valueOf(int i) {
        return forNumber(i);
    }
}
