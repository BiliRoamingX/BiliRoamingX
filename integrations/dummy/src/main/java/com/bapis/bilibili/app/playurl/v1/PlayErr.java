package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum PlayErr implements Internal.EnumLite {
    NoErr(0),
    WithMultiDeviceLoginErr(1),
    UNRECOGNIZED(-1);
    
    public static final int NoErr_VALUE = 0;
    public static final int WithMultiDeviceLoginErr_VALUE = 1;
    private static final Internal.EnumLiteMap<PlayErr> internalValueMap = new Internal.EnumLiteMap<PlayErr>() { // from class: com.bapis.bilibili.app.playurl.v1.PlayErr.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PlayErr findValueByNumber(int i) {
            return PlayErr.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class PlayErrVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PlayErrVerifier();

        private PlayErrVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PlayErr.forNumber(i) != null;
        }
    }

    PlayErr(int i) {
        this.value = i;
    }

    public static PlayErr forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return WithMultiDeviceLoginErr;
        }
        return NoErr;
    }

    public static Internal.EnumLiteMap<PlayErr> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PlayErrVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PlayErr valueOf(int i) {
        return forNumber(i);
    }
}
