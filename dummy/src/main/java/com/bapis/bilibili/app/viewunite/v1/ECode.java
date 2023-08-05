package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum ECode implements Internal.EnumLite {
    CODE_DEFAULT(0),
    CODE_404(1),
    CODE_TEENAGER(78301),
    UNRECOGNIZED(-1);
    
    public static final int CODE_404_VALUE = 1;
    public static final int CODE_DEFAULT_VALUE = 0;
    public static final int CODE_TEENAGER_VALUE = 78301;
    private static final Internal.EnumLiteMap<ECode> internalValueMap = new Internal.EnumLiteMap<ECode>() { // from class: com.bapis.bilibili.app.viewunite.v1.ECode.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ECode findValueByNumber(int i) {
            return ECode.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
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
                if (i != 78301) {
                    return null;
                }
                return CODE_TEENAGER;
            }
            return CODE_404;
        }
        return CODE_DEFAULT;
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
