package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum DescType implements Internal.EnumLite {
    DescTypeUnknown(0),
    DescTypeText(1),
    DescTypeAt(2),
    UNRECOGNIZED(-1);
    
    public static final int DescTypeAt_VALUE = 2;
    public static final int DescTypeText_VALUE = 1;
    public static final int DescTypeUnknown_VALUE = 0;
    private static final Internal.EnumLiteMap<DescType> internalValueMap = new Internal.EnumLiteMap<DescType>() { // from class: com.bapis.bilibili.app.viewunite.common.DescType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DescType findValueByNumber(int i) {
            return DescType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class DescTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new DescTypeVerifier();

        private DescTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DescType.forNumber(i) != null;
        }
    }

    DescType(int i) {
        this.value = i;
    }

    public static DescType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DescTypeAt;
            }
            return DescTypeText;
        }
        return DescTypeUnknown;
    }

    public static Internal.EnumLiteMap<DescType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return DescTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DescType valueOf(int i) {
        return forNumber(i);
    }
}
