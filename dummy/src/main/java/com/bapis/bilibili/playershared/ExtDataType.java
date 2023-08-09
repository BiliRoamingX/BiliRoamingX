package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum ExtDataType implements Internal.EnumLite {
    EXT_DATA_TYPE_UNKNOWN(0),
    PLAY_LIST(1),
    UNRECOGNIZED(-1);
    
    public static final int EXT_DATA_TYPE_UNKNOWN_VALUE = 0;
    public static final int PLAY_LIST_VALUE = 1;
    private static final Internal.EnumLiteMap<ExtDataType> internalValueMap = new Internal.EnumLiteMap<ExtDataType>() { // from class: com.bapis.bilibili.playershared.ExtDataType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ExtDataType findValueByNumber(int i) {
            return ExtDataType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class ExtDataTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ExtDataTypeVerifier();

        private ExtDataTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ExtDataType.forNumber(i) != null;
        }
    }

    ExtDataType(int i) {
        this.value = i;
    }

    public static ExtDataType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PLAY_LIST;
        }
        return EXT_DATA_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<ExtDataType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ExtDataTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ExtDataType valueOf(int i) {
        return forNumber(i);
    }
}
