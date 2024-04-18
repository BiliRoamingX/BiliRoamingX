package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes21.dex */
public enum Mode implements Internal.EnumLite {
    DEFAULT(0),
    UNSPECIFIED(1),
    MAIN_LIST_TIME(2),
    MAIN_LIST_HOT(3),
    UNRECOGNIZED(-1);
    
    public static final int DEFAULT_VALUE = 0;
    public static final int MAIN_LIST_HOT_VALUE = 3;
    public static final int MAIN_LIST_TIME_VALUE = 2;
    @Deprecated
    public static final int UNSPECIFIED_VALUE = 1;
    private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: com.bapis.bilibili.main.community.reply.v1.Mode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Mode findValueByNumber(int i) {
            return Mode.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Mode$b */
    /* loaded from: classes21.dex */
    private static final class C14771b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C14771b();

        private C14771b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Mode.forNumber(i) != null;
        }
    }

    Mode(int i) {
        this.value = i;
    }

    public static Mode forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return MAIN_LIST_HOT;
                }
                return MAIN_LIST_TIME;
            }
            return UNSPECIFIED;
        }
        return DEFAULT;
    }

    public static Internal.EnumLiteMap<Mode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C14771b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Mode valueOf(int i) {
        return forNumber(i);
    }
}
