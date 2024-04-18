package com.bapis.bilibili.main.community.reply.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum EditorIconState implements Internal.EnumLite {
    EditorIconState_DEFAULT(0),
    EditorIconState_ENABLE(1),
    EditorIconState_DISABLE(2),
    EditorIconState_HIDE(3),
    UNRECOGNIZED(-1);
    
    public static final int EditorIconState_DEFAULT_VALUE = 0;
    public static final int EditorIconState_DISABLE_VALUE = 2;
    public static final int EditorIconState_ENABLE_VALUE = 1;
    public static final int EditorIconState_HIDE_VALUE = 3;
    private static final Internal.EnumLiteMap<EditorIconState> internalValueMap = new Internal.EnumLiteMap<EditorIconState>() { // from class: com.bapis.bilibili.main.community.reply.v2.EditorIconState.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EditorIconState findValueByNumber(int i) {
            return EditorIconState.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class EditorIconStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new EditorIconStateVerifier();

        private EditorIconStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return EditorIconState.forNumber(i) != null;
        }
    }

    EditorIconState(int i) {
        this.value = i;
    }

    public static EditorIconState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return EditorIconState_HIDE;
                }
                return EditorIconState_DISABLE;
            }
            return EditorIconState_ENABLE;
        }
        return EditorIconState_DEFAULT;
    }

    public static Internal.EnumLiteMap<EditorIconState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EditorIconStateVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EditorIconState valueOf(int i) {
        return forNumber(i);
    }
}
