package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum PlayToastEnum implements Internal.EnumLite {
    PLAYTOAST_UNKNOWN(0),
    PLAYTOAST_CHARGINGPLUS(1),
    UNRECOGNIZED(-1);
    
    public static final int PLAYTOAST_CHARGINGPLUS_VALUE = 1;
    public static final int PLAYTOAST_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<PlayToastEnum> internalValueMap = new Internal.EnumLiteMap<PlayToastEnum>() { // from class: com.bapis.bilibili.app.view.v1.PlayToastEnum.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PlayToastEnum findValueByNumber(int i) {
            return PlayToastEnum.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class PlayToastEnumVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PlayToastEnumVerifier();

        private PlayToastEnumVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PlayToastEnum.forNumber(i) != null;
        }
    }

    PlayToastEnum(int i) {
        this.value = i;
    }

    public static PlayToastEnum forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PLAYTOAST_CHARGINGPLUS;
        }
        return PLAYTOAST_UNKNOWN;
    }

    public static Internal.EnumLiteMap<PlayToastEnum> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PlayToastEnumVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PlayToastEnum valueOf(int i) {
        return forNumber(i);
    }
}
