package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum ECode implements Internal.EnumLite {
    DEFAULT(0),
    CODE404(1),
    UNRECOGNIZED(-1);
    
    public static final int CODE404_VALUE = 1;
    public static final int DEFAULT_VALUE = 0;
    private static final Internal.EnumLiteMap<ECode> internalValueMap = new Internal.EnumLiteMap<ECode>() { // from class: com.bapis.bilibili.app.view.v1.ECode.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ECode findValueByNumber(int i) {
            return ECode.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class ECodeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ECodeVerifier();

        private ECodeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ECode.forNumber(i) != null;
        }
    }

    ECode(int i) {
        this.value = i;
    }

    public static ECode forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return CODE404;
        }
        return DEFAULT;
    }

    public static Internal.EnumLiteMap<ECode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ECodeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ECode valueOf(int i) {
        return forNumber(i);
    }
}
