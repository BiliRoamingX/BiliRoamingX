package com.bapis.bilibili.main.community.reply.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum UserCallbackScene implements Internal.EnumLite {
    USER_CALLBACK_SCENE_DEFAULT(0),
    USER_CALLBACK_SCENE_INSERT(1),
    USER_CALLBACK_SCENE_RECOMMEND_SUPERB_REPLY(2),
    UNRECOGNIZED(-1);
    
    public static final int USER_CALLBACK_SCENE_DEFAULT_VALUE = 0;
    public static final int USER_CALLBACK_SCENE_INSERT_VALUE = 1;
    public static final int USER_CALLBACK_SCENE_RECOMMEND_SUPERB_REPLY_VALUE = 2;
    private static final Internal.EnumLiteMap<UserCallbackScene> internalValueMap = new Internal.EnumLiteMap<UserCallbackScene>() { // from class: com.bapis.bilibili.main.community.reply.v2.UserCallbackScene.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public UserCallbackScene findValueByNumber(int i) {
            return UserCallbackScene.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class UserCallbackSceneVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new UserCallbackSceneVerifier();

        private UserCallbackSceneVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserCallbackScene.forNumber(i) != null;
        }
    }

    UserCallbackScene(int i) {
        this.value = i;
    }

    public static UserCallbackScene forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return USER_CALLBACK_SCENE_RECOMMEND_SUPERB_REPLY;
            }
            return USER_CALLBACK_SCENE_INSERT;
        }
        return USER_CALLBACK_SCENE_DEFAULT;
    }

    public static Internal.EnumLiteMap<UserCallbackScene> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return UserCallbackSceneVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static UserCallbackScene valueOf(int i) {
        return forNumber(i);
    }
}
