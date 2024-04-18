package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum ExposureType implements Internal.EnumLite {
    ExposureTypeNone(0),
    ExposureTypeDMSend(1),
    UNRECOGNIZED(-1);
    
    public static final int ExposureTypeDMSend_VALUE = 1;
    public static final int ExposureTypeNone_VALUE = 0;
    private static final Internal.EnumLiteMap<ExposureType> internalValueMap = new Internal.EnumLiteMap<ExposureType>() { // from class: com.bapis.bilibili.community.service.dm.v1.ExposureType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ExposureType findValueByNumber(int i) {
            return ExposureType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ExposureTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ExposureTypeVerifier();

        private ExposureTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ExposureType.forNumber(i) != null;
        }
    }

    ExposureType(int i) {
        this.value = i;
    }

    public static ExposureType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return ExposureTypeDMSend;
        }
        return ExposureTypeNone;
    }

    public static Internal.EnumLiteMap<ExposureType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ExposureTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ExposureType valueOf(int i) {
        return forNumber(i);
    }
}
