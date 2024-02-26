package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum GoodsJumpType implements Internal.EnumLite {
    goods_none(0),
    goods_schema(1),
    goods_url(2),
    UNRECOGNIZED(-1);

    public static final int goods_none_VALUE = 0;
    public static final int goods_schema_VALUE = 1;
    public static final int goods_url_VALUE = 2;
    private static final Internal.EnumLiteMap<GoodsJumpType> internalValueMap = new Internal.EnumLiteMap<GoodsJumpType>() { // from class: com.bapis.bilibili.app.dynamic.v2.GoodsJumpType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public GoodsJumpType findValueByNumber(int i2) {
            return GoodsJumpType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.GoodsJumpType$b */
    /* loaded from: classes19.dex */
    private static final class C5507b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C5507b();

        private C5507b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return GoodsJumpType.forNumber(i2) != null;
        }
    }

    GoodsJumpType(int i2) {
        this.value = i2;
    }

    public static GoodsJumpType forNumber(int i2) {
        if (i2 == 0) {
            return goods_none;
        }
        if (i2 == 1) {
            return goods_schema;
        }
        if (i2 != 2) {
            return null;
        }
        return goods_url;
    }

    public static Internal.EnumLiteMap<GoodsJumpType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C5507b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static GoodsJumpType valueOf(int i2) {
        return forNumber(i2);
    }
}
