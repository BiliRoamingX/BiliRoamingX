package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum PageCategory implements Internal.EnumLite {
    COMMON_PAGE(0),
    ACTIVITY_PAGE(1),
    UNRECOGNIZED(-1);
    
    public static final int ACTIVITY_PAGE_VALUE = 1;
    public static final int COMMON_PAGE_VALUE = 0;
    private static final Internal.EnumLiteMap<PageCategory> internalValueMap = new Internal.EnumLiteMap<PageCategory>() { // from class: com.bapis.bilibili.app.viewunite.v1.PageCategory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PageCategory findValueByNumber(int i) {
            return PageCategory.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class PageCategoryVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PageCategoryVerifier();

        private PageCategoryVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PageCategory.forNumber(i) != null;
        }
    }

    PageCategory(int i) {
        this.value = i;
    }

    public static PageCategory forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return ACTIVITY_PAGE;
        }
        return COMMON_PAGE;
    }

    public static Internal.EnumLiteMap<PageCategory> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PageCategoryVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PageCategory valueOf(int i) {
        return forNumber(i);
    }
}
