package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum SubtitleType implements Internal.EnumLite {
    CC(0),
    AI(1),
    UNRECOGNIZED(-1);

    public static final int AI_VALUE = 1;
    public static final int CC_VALUE = 0;
    // from class: com.bapis.bilibili.community.service.dm.v1.SubtitleType.1
    /* JADX WARN: Can't rename method to resolve collision */// com.google.protobuf.Internal.EnumLiteMap
    private static final Internal.EnumLiteMap<SubtitleType> internalValueMap = SubtitleType::forNumber;
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class SubtitleTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SubtitleTypeVerifier();

        private SubtitleTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SubtitleType.forNumber(i) != null;
        }
    }

    SubtitleType(int i) {
        this.value = i;
    }

    public static SubtitleType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return AI;
        }
        return CC;
    }

    public static Internal.EnumLiteMap<SubtitleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SubtitleTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SubtitleType valueOf(int i) {
        return forNumber(i);
    }
}
