package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum ToastFunctionType implements Internal.EnumLite {
    ToastFunctionTypeNone(0),
    ToastFunctionTypePostPanel(1),
    UNRECOGNIZED(-1);
    
    public static final int ToastFunctionTypeNone_VALUE = 0;
    public static final int ToastFunctionTypePostPanel_VALUE = 1;
    private static final Internal.EnumLiteMap<ToastFunctionType> internalValueMap = new Internal.EnumLiteMap<ToastFunctionType>() { // from class: com.bapis.bilibili.community.service.dm.v1.ToastFunctionType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ToastFunctionType findValueByNumber(int i) {
            return ToastFunctionType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ToastFunctionTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ToastFunctionTypeVerifier();

        private ToastFunctionTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ToastFunctionType.forNumber(i) != null;
        }
    }

    ToastFunctionType(int i) {
        this.value = i;
    }

    public static ToastFunctionType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return ToastFunctionTypePostPanel;
        }
        return ToastFunctionTypeNone;
    }

    public static Internal.EnumLiteMap<ToastFunctionType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ToastFunctionTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ToastFunctionType valueOf(int i) {
        return forNumber(i);
    }
}
