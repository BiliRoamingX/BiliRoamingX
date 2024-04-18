package com.bapis.bilibili.polymer.app.search.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes15.dex */
public enum Sort implements Internal.EnumLite {
    SORT_DEFAULT(0),
    SORT_VIEW_COUNT(1),
    SORT_PUBLISH_TIME(2),
    SORT_DANMAKU_COUNT(3),
    UNRECOGNIZED(-1);
    
    public static final int SORT_DANMAKU_COUNT_VALUE = 3;
    public static final int SORT_DEFAULT_VALUE = 0;
    public static final int SORT_PUBLISH_TIME_VALUE = 2;
    public static final int SORT_VIEW_COUNT_VALUE = 1;
    private static final Internal.EnumLiteMap<Sort> internalValueMap = new Internal.EnumLiteMap<Sort>() { // from class: com.bapis.bilibili.polymer.app.search.v1.Sort.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Sort findValueByNumber(int i) {
            return Sort.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    private static final class SortVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SortVerifier();

        private SortVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Sort.forNumber(i) != null;
        }
    }

    Sort(int i) {
        this.value = i;
    }

    public static Sort forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SORT_DANMAKU_COUNT;
                }
                return SORT_PUBLISH_TIME;
            }
            return SORT_VIEW_COUNT;
        }
        return SORT_DEFAULT;
    }

    public static Internal.EnumLiteMap<Sort> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SortVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Sort valueOf(int i) {
        return forNumber(i);
    }
}
