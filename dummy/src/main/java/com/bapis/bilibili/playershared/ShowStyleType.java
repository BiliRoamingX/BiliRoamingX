package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum ShowStyleType implements Internal.EnumLite {
    SHOW_STYLE_TYPE_UNKNOWN(0),
    SHOW_STYLE_TYPE_ORDINARY(1),
    SHOW_STYLE_TYPE_RESIDENT(2),
    UNRECOGNIZED(-1);
    
    public static final int SHOW_STYLE_TYPE_ORDINARY_VALUE = 1;
    public static final int SHOW_STYLE_TYPE_RESIDENT_VALUE = 2;
    public static final int SHOW_STYLE_TYPE_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<ShowStyleType> internalValueMap = new Internal.EnumLiteMap<ShowStyleType>() { // from class: com.bapis.bilibili.playershared.ShowStyleType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ShowStyleType findValueByNumber(int i) {
            return ShowStyleType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class ShowStyleTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ShowStyleTypeVerifier();

        private ShowStyleTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ShowStyleType.forNumber(i) != null;
        }
    }

    ShowStyleType(int i) {
        this.value = i;
    }

    public static ShowStyleType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SHOW_STYLE_TYPE_RESIDENT;
            }
            return SHOW_STYLE_TYPE_ORDINARY;
        }
        return SHOW_STYLE_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<ShowStyleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ShowStyleTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ShowStyleType valueOf(int i) {
        return forNumber(i);
    }
}
