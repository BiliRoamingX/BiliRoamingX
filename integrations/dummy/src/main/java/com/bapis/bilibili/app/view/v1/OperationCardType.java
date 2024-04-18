package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum OperationCardType implements Internal.EnumLite {
    CardTypeNone(0),
    CardTypeStandard(1),
    CardTypeSkip(2),
    UNRECOGNIZED(-1);
    
    public static final int CardTypeNone_VALUE = 0;
    public static final int CardTypeSkip_VALUE = 2;
    public static final int CardTypeStandard_VALUE = 1;
    private static final Internal.EnumLiteMap<OperationCardType> internalValueMap = new Internal.EnumLiteMap<OperationCardType>() { // from class: com.bapis.bilibili.app.view.v1.OperationCardType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public OperationCardType findValueByNumber(int i) {
            return OperationCardType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class OperationCardTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new OperationCardTypeVerifier();

        private OperationCardTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OperationCardType.forNumber(i) != null;
        }
    }

    OperationCardType(int i) {
        this.value = i;
    }

    public static OperationCardType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CardTypeSkip;
            }
            return CardTypeStandard;
        }
        return CardTypeNone;
    }

    public static Internal.EnumLiteMap<OperationCardType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return OperationCardTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OperationCardType valueOf(int i) {
        return forNumber(i);
    }
}
