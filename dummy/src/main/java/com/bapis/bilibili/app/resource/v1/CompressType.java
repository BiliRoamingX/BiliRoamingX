package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum CompressType implements Internal.EnumLite {
    Unzip(0),
    Original(1),
    UNRECOGNIZED(-1);
    
    public static final int Original_VALUE = 1;
    public static final int Unzip_VALUE = 0;
    private static final Internal.EnumLiteMap<CompressType> internalValueMap = new Internal.EnumLiteMap<CompressType>() { // from class: com.bapis.bilibili.app.resource.v1.CompressType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public CompressType findValueByNumber(int i) {
            return CompressType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class CompressTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CompressTypeVerifier();

        private CompressTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return CompressType.forNumber(i) != null;
        }
    }

    CompressType(int i) {
        this.value = i;
    }

    public static CompressType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return Original;
        }
        return Unzip;
    }

    public static Internal.EnumLiteMap<CompressType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CompressTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CompressType valueOf(int i) {
        return forNumber(i);
    }
}
