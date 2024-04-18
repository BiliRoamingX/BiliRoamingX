package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum EpPublicityVideoType implements Internal.EnumLite {
    PRE(0),
    INLINE(1),
    ADV_TYPE_UNKNOWN(-1),
    UNRECOGNIZED(-1);
    
    public static final int ADV_TYPE_UNKNOWN_VALUE = -1;
    public static final int INLINE_VALUE = 1;
    public static final int PRE_VALUE = 0;
    private static final Internal.EnumLiteMap<EpPublicityVideoType> internalValueMap = new Internal.EnumLiteMap<EpPublicityVideoType>() { // from class: com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EpPublicityVideoType findValueByNumber(int i) {
            return EpPublicityVideoType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class EpPublicityVideoTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new EpPublicityVideoTypeVerifier();

        private EpPublicityVideoTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return EpPublicityVideoType.forNumber(i) != null;
        }
    }

    EpPublicityVideoType(int i) {
        this.value = i;
    }

    public static EpPublicityVideoType forNumber(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return INLINE;
            }
            return PRE;
        }
        return ADV_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<EpPublicityVideoType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EpPublicityVideoTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EpPublicityVideoType valueOf(int i) {
        return forNumber(i);
    }
}
