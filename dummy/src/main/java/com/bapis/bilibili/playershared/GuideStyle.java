package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum GuideStyle implements Internal.EnumLite {
    STYLE_UNKNOWN(0),
    HORIZONTAL_IMAGE(1),
    VERTICAL_TEXT(2),
    SIMPLE_TEXT(3),
    CHARGING_TEXT(4),
    UNRECOGNIZED(-1);
    
    public static final int CHARGING_TEXT_VALUE = 4;
    public static final int HORIZONTAL_IMAGE_VALUE = 1;
    public static final int SIMPLE_TEXT_VALUE = 3;
    public static final int STYLE_UNKNOWN_VALUE = 0;
    public static final int VERTICAL_TEXT_VALUE = 2;
    private static final Internal.EnumLiteMap<GuideStyle> internalValueMap = new Internal.EnumLiteMap<GuideStyle>() { // from class: com.bapis.bilibili.playershared.GuideStyle.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public GuideStyle findValueByNumber(int i) {
            return GuideStyle.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class GuideStyleVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new GuideStyleVerifier();

        private GuideStyleVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return GuideStyle.forNumber(i) != null;
        }
    }

    GuideStyle(int i) {
        this.value = i;
    }

    public static GuideStyle forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CHARGING_TEXT;
                    }
                    return SIMPLE_TEXT;
                }
                return VERTICAL_TEXT;
            }
            return HORIZONTAL_IMAGE;
        }
        return STYLE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<GuideStyle> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return GuideStyleVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static GuideStyle valueOf(int i) {
        return forNumber(i);
    }
}
