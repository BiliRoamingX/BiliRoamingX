package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum PayState implements Internal.EnumLite {
    PayStateUnknown(0),
    PayStateActive(1),
    UNRECOGNIZED(-1);
    
    public static final int PayStateActive_VALUE = 1;
    public static final int PayStateUnknown_VALUE = 0;
    private static final Internal.EnumLiteMap<PayState> internalValueMap = new Internal.EnumLiteMap<PayState>() { // from class: com.bapis.bilibili.app.view.v1.PayState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PayState findValueByNumber(int i) {
            return PayState.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class PayStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PayStateVerifier();

        private PayStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PayState.forNumber(i) != null;
        }
    }

    PayState(int i) {
        this.value = i;
    }

    public static PayState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PayStateActive;
        }
        return PayStateUnknown;
    }

    public static Internal.EnumLiteMap<PayState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PayStateVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PayState valueOf(int i) {
        return forNumber(i);
    }
}
