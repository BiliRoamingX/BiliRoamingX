package com.bapis.bilibili.polymer.app.search.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes15.dex */
public enum UserType implements Internal.EnumLite {
    ALL(0),
    UP(1),
    NORMAL_USER(2),
    AUTHENTICATED_USER(3),
    UNRECOGNIZED(-1);
    
    public static final int ALL_VALUE = 0;
    public static final int AUTHENTICATED_USER_VALUE = 3;
    public static final int NORMAL_USER_VALUE = 2;
    public static final int UP_VALUE = 1;
    private static final Internal.EnumLiteMap<UserType> internalValueMap = new Internal.EnumLiteMap<UserType>() { // from class: com.bapis.bilibili.polymer.app.search.v1.UserType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public UserType findValueByNumber(int i) {
            return UserType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    private static final class UserTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new UserTypeVerifier();

        private UserTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserType.forNumber(i) != null;
        }
    }

    UserType(int i) {
        this.value = i;
    }

    public static UserType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AUTHENTICATED_USER;
                }
                return NORMAL_USER;
            }
            return UP;
        }
        return ALL;
    }

    public static Internal.EnumLiteMap<UserType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return UserTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static UserType valueOf(int i) {
        return forNumber(i);
    }
}
