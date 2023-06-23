package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum InlineScene implements Internal.EnumLite {
    UNKNOWN(0),
    RELATED_EP(1),
    HE(2),
    SKIP(3),
    UNRECOGNIZED(-1);
    
    public static final int HE_VALUE = 2;
    public static final int RELATED_EP_VALUE = 1;
    public static final int SKIP_VALUE = 3;
    public static final int UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<InlineScene> internalValueMap = new Internal.EnumLiteMap<InlineScene>() { // from class: com.bapis.bilibili.pgc.gateway.player.v2.InlineScene.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public InlineScene findValueByNumber(int i) {
            return InlineScene.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class InlineSceneVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new InlineSceneVerifier();

        private InlineSceneVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return InlineScene.forNumber(i) != null;
        }
    }

    InlineScene(int i) {
        this.value = i;
    }

    public static InlineScene forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SKIP;
                }
                return HE;
            }
            return RELATED_EP;
        }
        return UNKNOWN;
    }

    public static Internal.EnumLiteMap<InlineScene> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return InlineSceneVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static InlineScene valueOf(int i) {
        return forNumber(i);
    }
}
