package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum PlayLimitCode implements Internal.EnumLite {
    PLCUnkown(0),
    PLCUgcNotPayed(1),
    PLCChargingPlusNotPass(2),
    PLCChargingPlusUpgrade(3),
    UNRECOGNIZED(-1);
    
    public static final int PLCChargingPlusNotPass_VALUE = 2;
    public static final int PLCChargingPlusUpgrade_VALUE = 3;
    public static final int PLCUgcNotPayed_VALUE = 1;
    public static final int PLCUnkown_VALUE = 0;
    private static final Internal.EnumLiteMap<PlayLimitCode> internalValueMap = new Internal.EnumLiteMap<PlayLimitCode>() { // from class: com.bapis.bilibili.app.playurl.v1.PlayLimitCode.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PlayLimitCode findValueByNumber(int i) {
            return PlayLimitCode.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class PlayLimitCodeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PlayLimitCodeVerifier();

        private PlayLimitCodeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PlayLimitCode.forNumber(i) != null;
        }
    }

    PlayLimitCode(int i) {
        this.value = i;
    }

    public static PlayLimitCode forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PLCChargingPlusUpgrade;
                }
                return PLCChargingPlusNotPass;
            }
            return PLCUgcNotPayed;
        }
        return PLCUnkown;
    }

    public static Internal.EnumLiteMap<PlayLimitCode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PlayLimitCodeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PlayLimitCode valueOf(int i) {
        return forNumber(i);
    }
}
