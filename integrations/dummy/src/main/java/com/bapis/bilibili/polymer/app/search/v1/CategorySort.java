package com.bapis.bilibili.polymer.app.search.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes15.dex */
public enum CategorySort implements Internal.EnumLite {
    CATEGORY_SORT_DEFAULT(0),
    CATEGORY_SORT_PUBLISH_TIME(1),
    CATEGORY_SORT_CLICK_COUNT(2),
    CATEGORY_SORT_COMMENT_COUNT(3),
    CATEGORY_SORT_LIKE_COUNT(4),
    UNRECOGNIZED(-1);
    
    public static final int CATEGORY_SORT_CLICK_COUNT_VALUE = 2;
    public static final int CATEGORY_SORT_COMMENT_COUNT_VALUE = 3;
    public static final int CATEGORY_SORT_DEFAULT_VALUE = 0;
    public static final int CATEGORY_SORT_LIKE_COUNT_VALUE = 4;
    public static final int CATEGORY_SORT_PUBLISH_TIME_VALUE = 1;
    private static final Internal.EnumLiteMap<CategorySort> internalValueMap = new Internal.EnumLiteMap<CategorySort>() { // from class: com.bapis.bilibili.polymer.app.search.v1.CategorySort.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public CategorySort findValueByNumber(int i) {
            return CategorySort.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    private static final class CategorySortVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CategorySortVerifier();

        private CategorySortVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return CategorySort.forNumber(i) != null;
        }
    }

    CategorySort(int i) {
        this.value = i;
    }

    public static CategorySort forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CATEGORY_SORT_LIKE_COUNT;
                    }
                    return CATEGORY_SORT_COMMENT_COUNT;
                }
                return CATEGORY_SORT_CLICK_COUNT;
            }
            return CATEGORY_SORT_PUBLISH_TIME;
        }
        return CATEGORY_SORT_DEFAULT;
    }

    public static Internal.EnumLiteMap<CategorySort> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CategorySortVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CategorySort valueOf(int i) {
        return forNumber(i);
    }
}
