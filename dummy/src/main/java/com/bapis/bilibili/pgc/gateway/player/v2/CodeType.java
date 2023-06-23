package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum CodeType implements Internal.EnumLite {
    NOCODE(0),
    CODE264(1),
    CODE265(2),
    UNRECOGNIZED(-1);
    
    public static final int CODE264_VALUE = 1;
    public static final int CODE265_VALUE = 2;
    public static final int NOCODE_VALUE = 0;
    private static final Internal.EnumLiteMap<CodeType> internalValueMap = new Internal.EnumLiteMap<CodeType>() { // from class: com.bapis.bilibili.pgc.gateway.player.v2.CodeType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public CodeType findValueByNumber(int i) {
            return CodeType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class CodeTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CodeTypeVerifier();

        private CodeTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return CodeType.forNumber(i) != null;
        }
    }

    CodeType(int i) {
        this.value = i;
    }

    public static CodeType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CODE265;
            }
            return CODE264;
        }
        return NOCODE;
    }

    public static Internal.EnumLiteMap<CodeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CodeTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CodeType valueOf(int i) {
        return forNumber(i);
    }
}
