package com.bapis.bilibili.app.interfaces.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum ModelStatus implements Internal.EnumLite {
    CloseStatus(0),
    OpenStatus(1),
    NotSetStatus(2),
    UNRECOGNIZED(-1);

    public static final int CloseStatus_VALUE = 0;
    public static final int NotSetStatus_VALUE = 2;
    public static final int OpenStatus_VALUE = 1;
    private static final Internal.EnumLiteMap<ModelStatus> internalValueMap = new Internal.EnumLiteMap<ModelStatus>() { // from class: com.bapis.bilibili.app.interfaces.v1.ModelStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ModelStatus findValueByNumber(int i2) {
            return ModelStatus.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.ModelStatus$b */
    /* loaded from: classes19.dex */
    private static final class C6290b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C6290b();

        private C6290b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return ModelStatus.forNumber(i2) != null;
        }
    }

    ModelStatus(int i2) {
        this.value = i2;
    }

    public static ModelStatus forNumber(int i2) {
        if (i2 == 0) {
            return CloseStatus;
        }
        if (i2 == 1) {
            return OpenStatus;
        }
        if (i2 != 2) {
            return null;
        }
        return NotSetStatus;
    }

    public static Internal.EnumLiteMap<ModelStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C6290b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ModelStatus valueOf(int i2) {
        return forNumber(i2);
    }
}
