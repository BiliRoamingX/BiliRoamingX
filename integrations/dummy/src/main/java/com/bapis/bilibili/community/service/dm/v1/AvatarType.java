package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum AvatarType implements Internal.EnumLite {
    AvatarTypeNone(0),
    AvatarTypeNFT(1),
    UNRECOGNIZED(-1);
    
    public static final int AvatarTypeNFT_VALUE = 1;
    public static final int AvatarTypeNone_VALUE = 0;
    private static final Internal.EnumLiteMap<AvatarType> internalValueMap = new Internal.EnumLiteMap<AvatarType>() { // from class: com.bapis.bilibili.community.service.dm.v1.AvatarType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public AvatarType findValueByNumber(int i) {
            return AvatarType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class AvatarTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new AvatarTypeVerifier();

        private AvatarTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return AvatarType.forNumber(i) != null;
        }
    }

    AvatarType(int i) {
        this.value = i;
    }

    public static AvatarType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return AvatarTypeNFT;
        }
        return AvatarTypeNone;
    }

    public static Internal.EnumLiteMap<AvatarType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return AvatarTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AvatarType valueOf(int i) {
        return forNumber(i);
    }
}
