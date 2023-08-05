package com.bapis.bilibili.main.community.reply.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum UserCallbackAction implements Internal.EnumLite {
    USER_CALLBACK_ACTION_DEFAULT(0),
    USER_CALLBACK_ACTION_DISMISS(1),
    UNRECOGNIZED(-1);
    
    public static final int USER_CALLBACK_ACTION_DEFAULT_VALUE = 0;
    public static final int USER_CALLBACK_ACTION_DISMISS_VALUE = 1;
    private static final Internal.EnumLiteMap<UserCallbackAction> internalValueMap = new Internal.EnumLiteMap<UserCallbackAction>() { // from class: com.bapis.bilibili.main.community.reply.v2.UserCallbackAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public UserCallbackAction findValueByNumber(int i) {
            return UserCallbackAction.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class UserCallbackActionVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new UserCallbackActionVerifier();

        private UserCallbackActionVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserCallbackAction.forNumber(i) != null;
        }
    }

    UserCallbackAction(int i) {
        this.value = i;
    }

    public static UserCallbackAction forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return USER_CALLBACK_ACTION_DISMISS;
        }
        return USER_CALLBACK_ACTION_DEFAULT;
    }

    public static Internal.EnumLiteMap<UserCallbackAction> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return UserCallbackActionVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static UserCallbackAction valueOf(int i) {
        return forNumber(i);
    }
}
