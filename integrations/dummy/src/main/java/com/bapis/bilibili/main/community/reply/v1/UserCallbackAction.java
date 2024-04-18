package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes21.dex */
public enum UserCallbackAction implements Internal.EnumLite {
    Dismiss(0),
    UNRECOGNIZED(-1);
    
    public static final int Dismiss_VALUE = 0;
    private static final Internal.EnumLiteMap<UserCallbackAction> internalValueMap = new Internal.EnumLiteMap<UserCallbackAction>() { // from class: com.bapis.bilibili.main.community.reply.v1.UserCallbackAction.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public UserCallbackAction findValueByNumber(int i) {
            return UserCallbackAction.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.UserCallbackAction$b */
    /* loaded from: classes21.dex */
    private static final class C14898b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C14898b();

        private C14898b() {
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
            return null;
        }
        return Dismiss;
    }

    public static Internal.EnumLiteMap<UserCallbackAction> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C14898b.INSTANCE;
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
