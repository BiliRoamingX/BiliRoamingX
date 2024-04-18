package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum SeasonType implements Internal.EnumLite {
    Unknown(0),
    Base(1),
    Good(2),
    UNRECOGNIZED(-1);
    
    public static final int Base_VALUE = 1;
    public static final int Good_VALUE = 2;
    public static final int Unknown_VALUE = 0;
    private static final Internal.EnumLiteMap<SeasonType> internalValueMap = new Internal.EnumLiteMap<SeasonType>() { // from class: com.bapis.bilibili.app.viewunite.common.SeasonType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SeasonType findValueByNumber(int i) {
            return SeasonType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class SeasonTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SeasonTypeVerifier();

        private SeasonTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SeasonType.forNumber(i) != null;
        }
    }

    SeasonType(int i) {
        this.value = i;
    }

    public static SeasonType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Good;
            }
            return Base;
        }
        return Unknown;
    }

    public static Internal.EnumLiteMap<SeasonType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SeasonTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SeasonType valueOf(int i) {
        return forNumber(i);
    }
}
