package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes12.dex */
public enum CampusReqFromType implements Internal.EnumLite {
    DYNAMIC(0),
    HOME(1),
    UNRECOGNIZED(-1);
    
    public static final int DYNAMIC_VALUE = 0;
    public static final int HOME_VALUE = 1;
    private static final Internal.EnumLiteMap<CampusReqFromType> internalValueMap = new Internal.EnumLiteMap<CampusReqFromType>() { // from class: com.bapis.bilibili.app.dynamic.v2.CampusReqFromType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public CampusReqFromType findValueByNumber(int i) {
            return CampusReqFromType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    private static final class CampusReqFromTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CampusReqFromTypeVerifier();

        private CampusReqFromTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return CampusReqFromType.forNumber(i) != null;
        }
    }

    CampusReqFromType(int i) {
        this.value = i;
    }

    public static CampusReqFromType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return HOME;
        }
        return DYNAMIC;
    }

    public static Internal.EnumLiteMap<CampusReqFromType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CampusReqFromTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CampusReqFromType valueOf(int i) {
        return forNumber(i);
    }
}
