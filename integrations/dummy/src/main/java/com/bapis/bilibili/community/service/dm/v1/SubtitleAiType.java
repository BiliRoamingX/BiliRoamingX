package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum SubtitleAiType implements Internal.EnumLite {
    Normal(0),
    Translate(1),
    UNRECOGNIZED(-1);
    
    public static final int Normal_VALUE = 0;
    public static final int Translate_VALUE = 1;
    private static final Internal.EnumLiteMap<SubtitleAiType> internalValueMap = new Internal.EnumLiteMap<SubtitleAiType>() { // from class: com.bapis.bilibili.community.service.dm.v1.SubtitleAiType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SubtitleAiType findValueByNumber(int i) {
            return SubtitleAiType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class SubtitleAiTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SubtitleAiTypeVerifier();

        private SubtitleAiTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SubtitleAiType.forNumber(i) != null;
        }
    }

    SubtitleAiType(int i) {
        this.value = i;
    }

    public static SubtitleAiType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return Translate;
        }
        return Normal;
    }

    public static Internal.EnumLiteMap<SubtitleAiType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SubtitleAiTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SubtitleAiType valueOf(int i) {
        return forNumber(i);
    }
}
