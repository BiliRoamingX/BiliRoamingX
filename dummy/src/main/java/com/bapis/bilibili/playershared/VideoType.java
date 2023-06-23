package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum VideoType implements Internal.EnumLite {
    UNKNOWN(0),
    UGC(1),
    PGC(2),
    UNRECOGNIZED(-1);

    public static final int PGC_VALUE = 2;
    public static final int UGC_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    // from class: com.bapis.bilibili.playershared.VideoType.1
    /* JADX WARN: Can't rename method to resolve collision */// com.google.protobuf.Internal.EnumLiteMap
    private static final Internal.EnumLiteMap<VideoType> internalValueMap = VideoType::forNumber;
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class VideoTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new VideoTypeVerifier();

        private VideoTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return VideoType.forNumber(i) != null;
        }
    }

    VideoType(int i) {
        this.value = i;
    }

    public static VideoType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PGC;
            }
            return UGC;
        }
        return UNKNOWN;
    }

    public static Internal.EnumLiteMap<VideoType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return VideoTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static VideoType valueOf(int i) {
        return forNumber(i);
    }
}
