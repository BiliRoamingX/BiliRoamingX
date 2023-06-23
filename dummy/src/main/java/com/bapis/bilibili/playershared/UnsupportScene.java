package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum UnsupportScene implements Internal.EnumLite {
    UNKNOWN_SCENE(0),
    PREMIERE(1),
    UNRECOGNIZED(-1);
    
    public static final int PREMIERE_VALUE = 1;
    public static final int UNKNOWN_SCENE_VALUE = 0;
    private static final Internal.EnumLiteMap<UnsupportScene> internalValueMap = new Internal.EnumLiteMap<UnsupportScene>() { // from class: com.bapis.bilibili.playershared.UnsupportScene.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public UnsupportScene findValueByNumber(int i) {
            return UnsupportScene.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class UnsupportSceneVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new UnsupportSceneVerifier();

        private UnsupportSceneVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UnsupportScene.forNumber(i) != null;
        }
    }

    UnsupportScene(int i) {
        this.value = i;
    }

    public static UnsupportScene forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PREMIERE;
        }
        return UNKNOWN_SCENE;
    }

    public static Internal.EnumLiteMap<UnsupportScene> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return UnsupportSceneVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static UnsupportScene valueOf(int i) {
        return forNumber(i);
    }
}
