package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum SerialSeasonCoverStyle implements Internal.EnumLite {
    TITLE(0),
    PICTURE(1),
    SERIAL_SEASON_COVER_STYLE_UNKNOWN(-1),
    UNRECOGNIZED(-1);
    
    public static final int PICTURE_VALUE = 1;
    public static final int SERIAL_SEASON_COVER_STYLE_UNKNOWN_VALUE = -1;
    public static final int TITLE_VALUE = 0;
    private static final Internal.EnumLiteMap<SerialSeasonCoverStyle> internalValueMap = new Internal.EnumLiteMap<SerialSeasonCoverStyle>() { // from class: com.bapis.bilibili.app.viewunite.common.SerialSeasonCoverStyle.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SerialSeasonCoverStyle findValueByNumber(int i) {
            return SerialSeasonCoverStyle.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class SerialSeasonCoverStyleVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SerialSeasonCoverStyleVerifier();

        private SerialSeasonCoverStyleVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SerialSeasonCoverStyle.forNumber(i) != null;
        }
    }

    SerialSeasonCoverStyle(int i) {
        this.value = i;
    }

    public static SerialSeasonCoverStyle forNumber(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return PICTURE;
            }
            return TITLE;
        }
        return SERIAL_SEASON_COVER_STYLE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<SerialSeasonCoverStyle> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SerialSeasonCoverStyleVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SerialSeasonCoverStyle valueOf(int i) {
        return forNumber(i);
    }
}
