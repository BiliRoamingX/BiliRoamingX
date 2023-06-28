package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum Category implements Internal.EnumLite {
    CategoryUnknown(0),
    CategorySeason(1),
    UNRECOGNIZED(-1);
    
    public static final int CategorySeason_VALUE = 1;
    public static final int CategoryUnknown_VALUE = 0;
    private static final Internal.EnumLiteMap<Category> internalValueMap = new Internal.EnumLiteMap<Category>() { // from class: com.bapis.bilibili.app.view.v1.Category.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Category findValueByNumber(int i) {
            return Category.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class CategoryVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CategoryVerifier();

        private CategoryVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Category.forNumber(i) != null;
        }
    }

    Category(int i) {
        this.value = i;
    }

    public static Category forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return CategorySeason;
        }
        return CategoryUnknown;
    }

    public static Internal.EnumLiteMap<Category> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CategoryVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Category valueOf(int i) {
        return forNumber(i);
    }
}
