package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum RenderType implements Internal.EnumLite {
    RenderTypeNone(0),
    RenderTypeSingle(1),
    RenderTypeRotation(2),
    UNRECOGNIZED(-1);
    
    public static final int RenderTypeNone_VALUE = 0;
    public static final int RenderTypeRotation_VALUE = 2;
    public static final int RenderTypeSingle_VALUE = 1;
    private static final Internal.EnumLiteMap<RenderType> internalValueMap = new Internal.EnumLiteMap<RenderType>() { // from class: com.bapis.bilibili.community.service.dm.v1.RenderType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public RenderType findValueByNumber(int i) {
            return RenderType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class RenderTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new RenderTypeVerifier();

        private RenderTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RenderType.forNumber(i) != null;
        }
    }

    RenderType(int i) {
        this.value = i;
    }

    public static RenderType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return RenderTypeRotation;
            }
            return RenderTypeSingle;
        }
        return RenderTypeNone;
    }

    public static Internal.EnumLiteMap<RenderType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return RenderTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RenderType valueOf(int i) {
        return forNumber(i);
    }
}
