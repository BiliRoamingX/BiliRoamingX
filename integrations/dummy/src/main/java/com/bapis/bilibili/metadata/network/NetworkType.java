package com.bapis.bilibili.metadata.network;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes23.dex */
public enum NetworkType implements Internal.EnumLite {
    NT_UNKNOWN(0),
    WIFI(1),
    CELLULAR(2),
    OFFLINE(3),
    OTHERNET(4),
    ETHERNET(5),
    UNRECOGNIZED(-1);

    public static final int CELLULAR_VALUE = 2;
    public static final int ETHERNET_VALUE = 5;
    public static final int NT_UNKNOWN_VALUE = 0;
    public static final int OFFLINE_VALUE = 3;
    public static final int OTHERNET_VALUE = 4;
    public static final int WIFI_VALUE = 1;
    private static final Internal.EnumLiteMap<NetworkType> internalValueMap = new Internal.EnumLiteMap<NetworkType>() { // from class: com.bapis.bilibili.metadata.network.NetworkType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public NetworkType findValueByNumber(int i14) {
            return NetworkType.forNumber(i14);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes23.dex */
    private static final class b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i14) {
            if (NetworkType.forNumber(i14) != null) {
                return true;
            }
            return false;
        }
    }

    NetworkType(int i14) {
        this.value = i14;
    }

    public static NetworkType forNumber(int i14) {
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 5) {
                                return null;
                            }
                            return ETHERNET;
                        }
                        return OTHERNET;
                    }
                    return OFFLINE;
                }
                return CELLULAR;
            }
            return WIFI;
        }
        return NT_UNKNOWN;
    }

    public static Internal.EnumLiteMap<NetworkType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NetworkType valueOf(int i14) {
        return forNumber(i14);
    }
}
