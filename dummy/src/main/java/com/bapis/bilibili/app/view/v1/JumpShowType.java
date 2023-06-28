package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum JumpShowType implements Internal.EnumLite {
    JST_DEFAULT(0),
    JST_FULLSCREEN(1),
    JST_HALFSCREEN(2),
    UNRECOGNIZED(-1);
    
    public static final int JST_DEFAULT_VALUE = 0;
    public static final int JST_FULLSCREEN_VALUE = 1;
    public static final int JST_HALFSCREEN_VALUE = 2;
    private static final Internal.EnumLiteMap<JumpShowType> internalValueMap = new Internal.EnumLiteMap<JumpShowType>() { // from class: com.bapis.bilibili.app.view.v1.JumpShowType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public JumpShowType findValueByNumber(int i) {
            return JumpShowType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class JumpShowTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new JumpShowTypeVerifier();

        private JumpShowTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return JumpShowType.forNumber(i) != null;
        }
    }

    JumpShowType(int i) {
        this.value = i;
    }

    public static JumpShowType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return JST_HALFSCREEN;
            }
            return JST_FULLSCREEN;
        }
        return JST_DEFAULT;
    }

    public static Internal.EnumLiteMap<JumpShowType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JumpShowTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JumpShowType valueOf(int i) {
        return forNumber(i);
    }
}
