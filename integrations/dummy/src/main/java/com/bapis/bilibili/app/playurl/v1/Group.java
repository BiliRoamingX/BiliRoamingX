package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum Group implements Internal.EnumLite {
    UnknownGroup(0),
    A(1),
    B(2),
    C(3),
    UNRECOGNIZED(-1);
    
    public static final int A_VALUE = 1;
    public static final int B_VALUE = 2;
    public static final int C_VALUE = 3;
    public static final int UnknownGroup_VALUE = 0;
    private static final Internal.EnumLiteMap<Group> internalValueMap = new Internal.EnumLiteMap<Group>() { // from class: com.bapis.bilibili.app.playurl.v1.Group.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Group findValueByNumber(int i) {
            return Group.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class GroupVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new GroupVerifier();

        private GroupVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Group.forNumber(i) != null;
        }
    }

    Group(int i) {
        this.value = i;
    }

    public static Group forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return C;
                }
                return B;
            }
            return A;
        }
        return UnknownGroup;
    }

    public static Internal.EnumLiteMap<Group> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return GroupVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Group valueOf(int i) {
        return forNumber(i);
    }
}
