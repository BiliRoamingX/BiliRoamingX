package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum CheckboxType implements Internal.EnumLite {
    CheckboxTypeNone(0),
    CheckboxTypeEncourage(1),
    CheckboxTypeColorDM(2),
    UNRECOGNIZED(-1);
    
    public static final int CheckboxTypeColorDM_VALUE = 2;
    public static final int CheckboxTypeEncourage_VALUE = 1;
    public static final int CheckboxTypeNone_VALUE = 0;
    private static final Internal.EnumLiteMap<CheckboxType> internalValueMap = new Internal.EnumLiteMap<CheckboxType>() { // from class: com.bapis.bilibili.community.service.dm.v1.CheckboxType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public CheckboxType findValueByNumber(int i) {
            return CheckboxType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class CheckboxTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CheckboxTypeVerifier();

        private CheckboxTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return CheckboxType.forNumber(i) != null;
        }
    }

    CheckboxType(int i) {
        this.value = i;
    }

    public static CheckboxType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CheckboxTypeColorDM;
            }
            return CheckboxTypeEncourage;
        }
        return CheckboxTypeNone;
    }

    public static Internal.EnumLiteMap<CheckboxType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CheckboxTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CheckboxType valueOf(int i) {
        return forNumber(i);
    }
}
