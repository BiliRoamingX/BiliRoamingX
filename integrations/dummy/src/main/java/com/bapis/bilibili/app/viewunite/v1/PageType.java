package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes20.dex */
public enum PageType implements Internal.EnumLite {
    H5(0),
    NA(1),
    UNRECOGNIZED(-1);
    
    public static final int H5_VALUE = 0;
    public static final int NA_VALUE = 1;
    private static final Internal.EnumLiteMap<PageType> internalValueMap = new Internal.EnumLiteMap<PageType>() { // from class: com.bapis.bilibili.app.viewunite.v1.PageType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PageType findValueByNumber(int i) {
            return PageType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.PageType$b */
    /* loaded from: classes20.dex */
    private static final class C12342b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C12342b();

        private C12342b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PageType.forNumber(i) != null;
        }
    }

    PageType(int i) {
        this.value = i;
    }

    public static PageType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return NA;
        }
        return H5;
    }

    public static Internal.EnumLiteMap<PageType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12342b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PageType valueOf(int i) {
        return forNumber(i);
    }
}
