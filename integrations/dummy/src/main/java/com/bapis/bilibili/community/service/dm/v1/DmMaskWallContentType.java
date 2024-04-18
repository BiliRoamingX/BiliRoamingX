package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum DmMaskWallContentType implements Internal.EnumLite {
    DmMaskWallContentTypeUnknown(0),
    DmMaskWallContentTypeText(1),
    DmMaskWallContentTypePic(2),
    UNRECOGNIZED(-1);
    
    public static final int DmMaskWallContentTypePic_VALUE = 2;
    public static final int DmMaskWallContentTypeText_VALUE = 1;
    public static final int DmMaskWallContentTypeUnknown_VALUE = 0;
    private static final Internal.EnumLiteMap<DmMaskWallContentType> internalValueMap = new Internal.EnumLiteMap<DmMaskWallContentType>() { // from class: com.bapis.bilibili.community.service.dm.v1.DmMaskWallContentType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DmMaskWallContentType findValueByNumber(int i) {
            return DmMaskWallContentType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class DmMaskWallContentTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new DmMaskWallContentTypeVerifier();

        private DmMaskWallContentTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DmMaskWallContentType.forNumber(i) != null;
        }
    }

    DmMaskWallContentType(int i) {
        this.value = i;
    }

    public static DmMaskWallContentType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DmMaskWallContentTypePic;
            }
            return DmMaskWallContentTypeText;
        }
        return DmMaskWallContentTypeUnknown;
    }

    public static Internal.EnumLiteMap<DmMaskWallContentType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return DmMaskWallContentTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DmMaskWallContentType valueOf(int i) {
        return forNumber(i);
    }
}
