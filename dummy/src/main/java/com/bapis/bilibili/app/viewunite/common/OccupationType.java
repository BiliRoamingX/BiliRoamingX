package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum OccupationType implements Internal.EnumLite {
    STAFF(0),
    CAST(1),
    UNKNOWN_TYPE(-1),
    UNRECOGNIZED(-1);
    
    public static final int CAST_VALUE = 1;
    public static final int STAFF_VALUE = 0;
    public static final int UNKNOWN_TYPE_VALUE = -1;
    private static final Internal.EnumLiteMap<OccupationType> internalValueMap = new Internal.EnumLiteMap<OccupationType>() { // from class: com.bapis.bilibili.app.viewunite.common.OccupationType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public OccupationType findValueByNumber(int i) {
            return OccupationType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class OccupationTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new OccupationTypeVerifier();

        private OccupationTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OccupationType.forNumber(i) != null;
        }
    }

    OccupationType(int i) {
        this.value = i;
    }

    public static OccupationType forNumber(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return CAST;
            }
            return STAFF;
        }
        return UNKNOWN_TYPE;
    }

    public static Internal.EnumLiteMap<OccupationType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return OccupationTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OccupationType valueOf(int i) {
        return forNumber(i);
    }
}
