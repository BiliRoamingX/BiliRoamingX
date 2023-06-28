package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum MaterialSource implements Internal.EnumLite {
    Default(0),
    BiJian(1),
    UNRECOGNIZED(-1);
    
    public static final int BiJian_VALUE = 1;
    public static final int Default_VALUE = 0;
    private static final Internal.EnumLiteMap<MaterialSource> internalValueMap = new Internal.EnumLiteMap<MaterialSource>() { // from class: com.bapis.bilibili.app.view.v1.MaterialSource.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public MaterialSource findValueByNumber(int i) {
            return MaterialSource.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class MaterialSourceVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new MaterialSourceVerifier();

        private MaterialSourceVerifier() {
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
            return BiJian;
        }
        return Default;
    }

    public static Internal.EnumLiteMap<MaterialSource> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return MaterialSourceVerifier.INSTANCE;
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
