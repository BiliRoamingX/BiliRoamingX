package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum SubtitleAiStatus implements Internal.EnumLite {
    None(0),
    Exposure(1),
    Assist(2),
    UNRECOGNIZED(-1);
    
    public static final int Assist_VALUE = 2;
    public static final int Exposure_VALUE = 1;
    public static final int None_VALUE = 0;
    private static final Internal.EnumLiteMap<SubtitleAiStatus> internalValueMap = new Internal.EnumLiteMap<SubtitleAiStatus>() { // from class: com.bapis.bilibili.community.service.dm.v1.SubtitleAiStatus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SubtitleAiStatus findValueByNumber(int i) {
            return SubtitleAiStatus.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class SubtitleAiStatusVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SubtitleAiStatusVerifier();

        private SubtitleAiStatusVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SubtitleAiStatus.forNumber(i) != null;
        }
    }

    SubtitleAiStatus(int i) {
        this.value = i;
    }

    public static SubtitleAiStatus forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Assist;
            }
            return Exposure;
        }
        return None;
    }

    public static Internal.EnumLiteMap<SubtitleAiStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SubtitleAiStatusVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SubtitleAiStatus valueOf(int i) {
        return forNumber(i);
    }
}
