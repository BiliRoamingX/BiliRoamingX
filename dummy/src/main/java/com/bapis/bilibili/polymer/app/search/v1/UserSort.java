package com.bapis.bilibili.polymer.app.search.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes15.dex */
public enum UserSort implements Internal.EnumLite {
    USER_SORT_DEFAULT(0),
    USER_SORT_FANS_DESCEND(1),
    USER_SORT_FANS_ASCEND(2),
    USER_SORT_LEVEL_DESCEND(3),
    USER_SORT_LEVEL_ASCEND(4),
    UNRECOGNIZED(-1);
    
    public static final int USER_SORT_DEFAULT_VALUE = 0;
    public static final int USER_SORT_FANS_ASCEND_VALUE = 2;
    public static final int USER_SORT_FANS_DESCEND_VALUE = 1;
    public static final int USER_SORT_LEVEL_ASCEND_VALUE = 4;
    public static final int USER_SORT_LEVEL_DESCEND_VALUE = 3;
    private static final Internal.EnumLiteMap<UserSort> internalValueMap = new Internal.EnumLiteMap<UserSort>() { // from class: com.bapis.bilibili.polymer.app.search.v1.UserSort.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public UserSort findValueByNumber(int i) {
            return UserSort.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    private static final class UserSortVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new UserSortVerifier();

        private UserSortVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserSort.forNumber(i) != null;
        }
    }

    UserSort(int i) {
        this.value = i;
    }

    public static UserSort forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return USER_SORT_LEVEL_ASCEND;
                    }
                    return USER_SORT_LEVEL_DESCEND;
                }
                return USER_SORT_FANS_ASCEND;
            }
            return USER_SORT_FANS_DESCEND;
        }
        return USER_SORT_DEFAULT;
    }

    public static Internal.EnumLiteMap<UserSort> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return UserSortVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static UserSort valueOf(int i) {
        return forNumber(i);
    }
}
