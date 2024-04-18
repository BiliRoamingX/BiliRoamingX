package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum DrmTechType implements Internal.EnumLite {
    UNKNOWN_DRM(0),
    FAIR_PLAY(1),
    WIDE_VINE(2),
    BILI_DRM(3),
    UNRECOGNIZED(-1);

    public static final int BILI_DRM_VALUE = 3;
    public static final int FAIR_PLAY_VALUE = 1;
    public static final int UNKNOWN_DRM_VALUE = 0;
    public static final int WIDE_VINE_VALUE = 2;
    // from class: com.bapis.bilibili.playershared.DrmTechType.1
    /* JADX WARN: Can't rename method to resolve collision */// com.google.protobuf.Internal.EnumLiteMap
    private static final Internal.EnumLiteMap<DrmTechType> internalValueMap = DrmTechType::forNumber;
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class DrmTechTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new DrmTechTypeVerifier();

        private DrmTechTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DrmTechType.forNumber(i) != null;
        }
    }

    DrmTechType(int i) {
        this.value = i;
    }

    public static DrmTechType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return BILI_DRM;
                }
                return WIDE_VINE;
            }
            return FAIR_PLAY;
        }
        return UNKNOWN_DRM;
    }

    public static Internal.EnumLiteMap<DrmTechType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return DrmTechTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DrmTechType valueOf(int i) {
        return forNumber(i);
    }
}
