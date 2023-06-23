package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum ArcType implements Internal.EnumLite {
    ARC_TYPE_NORMAL(0),
    ARC_TYPE_INTERACT(1),
    UNRECOGNIZED(-1);

    public static final int ARC_TYPE_INTERACT_VALUE = 1;
    public static final int ARC_TYPE_NORMAL_VALUE = 0;
    // from class: com.bapis.bilibili.playershared.ArcType.1
    /* JADX WARN: Can't rename method to resolve collision */// com.google.protobuf.Internal.EnumLiteMap
    private static final Internal.EnumLiteMap<ArcType> internalValueMap = ArcType::forNumber;
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ArcTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ArcTypeVerifier();

        private ArcTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ArcType.forNumber(i) != null;
        }
    }

    ArcType(int i) {
        this.value = i;
    }

    public static ArcType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return ARC_TYPE_INTERACT;
        }
        return ARC_TYPE_NORMAL;
    }

    public static Internal.EnumLiteMap<ArcType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ArcTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ArcType valueOf(int i) {
        return forNumber(i);
    }
}
