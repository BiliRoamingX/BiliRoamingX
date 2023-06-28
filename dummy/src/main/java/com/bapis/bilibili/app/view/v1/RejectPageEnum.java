package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum RejectPageEnum implements Internal.EnumLite {
    REJECTPAGE_UNKNOWN(0),
    REJECTPAGE_CHARGINGPLUS(1),
    UNRECOGNIZED(-1);
    
    public static final int REJECTPAGE_CHARGINGPLUS_VALUE = 1;
    public static final int REJECTPAGE_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<RejectPageEnum> internalValueMap = new Internal.EnumLiteMap<RejectPageEnum>() { // from class: com.bapis.bilibili.app.view.v1.RejectPageEnum.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public RejectPageEnum findValueByNumber(int i) {
            return RejectPageEnum.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class RejectPageEnumVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new RejectPageEnumVerifier();

        private RejectPageEnumVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RejectPageEnum.forNumber(i) != null;
        }
    }

    RejectPageEnum(int i) {
        this.value = i;
    }

    public static RejectPageEnum forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return REJECTPAGE_CHARGINGPLUS;
        }
        return REJECTPAGE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<RejectPageEnum> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return RejectPageEnumVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RejectPageEnum valueOf(int i) {
        return forNumber(i);
    }
}
