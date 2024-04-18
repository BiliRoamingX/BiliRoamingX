package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum PlayerCardType implements Internal.EnumLite {
    PlayerCardTypeNone(0),
    PlayerCardTypeAttention(1),
    PlayerCardTypeOperation(2),
    PlayerCardTypeContract(3),
    UNRECOGNIZED(-1);
    
    public static final int PlayerCardTypeAttention_VALUE = 1;
    public static final int PlayerCardTypeContract_VALUE = 3;
    public static final int PlayerCardTypeNone_VALUE = 0;
    public static final int PlayerCardTypeOperation_VALUE = 2;
    private static final Internal.EnumLiteMap<PlayerCardType> internalValueMap = new Internal.EnumLiteMap<PlayerCardType>() { // from class: com.bapis.bilibili.app.view.v1.PlayerCardType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PlayerCardType findValueByNumber(int i) {
            return PlayerCardType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class PlayerCardTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PlayerCardTypeVerifier();

        private PlayerCardTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PlayerCardType.forNumber(i) != null;
        }
    }

    PlayerCardType(int i) {
        this.value = i;
    }

    public static PlayerCardType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PlayerCardTypeContract;
                }
                return PlayerCardTypeOperation;
            }
            return PlayerCardTypeAttention;
        }
        return PlayerCardTypeNone;
    }

    public static Internal.EnumLiteMap<PlayerCardType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PlayerCardTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PlayerCardType valueOf(int i) {
        return forNumber(i);
    }
}
