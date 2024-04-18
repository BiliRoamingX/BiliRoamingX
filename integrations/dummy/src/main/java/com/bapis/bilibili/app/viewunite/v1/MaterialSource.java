package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes20.dex */
public enum MaterialSource implements Internal.EnumLite {
    DEFAULT(0),
    BIJIAN(1),
    UNRECOGNIZED(-1);
    
    public static final int BIJIAN_VALUE = 1;
    public static final int DEFAULT_VALUE = 0;
    private static final Internal.EnumLiteMap<MaterialSource> internalValueMap = new Internal.EnumLiteMap<MaterialSource>() { // from class: com.bapis.bilibili.app.viewunite.v1.MaterialSource.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public MaterialSource findValueByNumber(int i) {
            return MaterialSource.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.MaterialSource$b */
    /* loaded from: classes20.dex */
    private static final class C12330b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C12330b();

        private C12330b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MaterialSource.forNumber(i) != null;
        }
    }

    MaterialSource(int i) {
        this.value = i;
    }

    public static MaterialSource forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BIJIAN;
        }
        return DEFAULT;
    }

    public static Internal.EnumLiteMap<MaterialSource> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12330b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MaterialSource valueOf(int i) {
        return forNumber(i);
    }
}
