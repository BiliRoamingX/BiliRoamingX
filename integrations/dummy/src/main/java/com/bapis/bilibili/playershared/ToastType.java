package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum ToastType implements Internal.EnumLite {
    TOAST_TYPE_UNKNOWN(0),
    VIP_CONTENT_REMIND(1),
    VIP_DEFINITION_REMIND(2),
    VIP_DEFINITION_GUIDE(3),
    OGV_VIDEO_START_TOAST(4),
    CHARGING_TOAST(5),
    UNRECOGNIZED(-1);
    
    public static final int CHARGING_TOAST_VALUE = 5;
    public static final int OGV_VIDEO_START_TOAST_VALUE = 4;
    public static final int TOAST_TYPE_UNKNOWN_VALUE = 0;
    public static final int VIP_CONTENT_REMIND_VALUE = 1;
    public static final int VIP_DEFINITION_GUIDE_VALUE = 3;
    public static final int VIP_DEFINITION_REMIND_VALUE = 2;
    private static final Internal.EnumLiteMap<ToastType> internalValueMap = new Internal.EnumLiteMap<ToastType>() { // from class: com.bapis.bilibili.playershared.ToastType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ToastType findValueByNumber(int i) {
            return ToastType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class ToastTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ToastTypeVerifier();

        private ToastTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ToastType.forNumber(i) != null;
        }
    }

    ToastType(int i) {
        this.value = i;
    }

    public static ToastType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return CHARGING_TOAST;
                        }
                        return OGV_VIDEO_START_TOAST;
                    }
                    return VIP_DEFINITION_GUIDE;
                }
                return VIP_DEFINITION_REMIND;
            }
            return VIP_CONTENT_REMIND;
        }
        return TOAST_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<ToastType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ToastTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ToastType valueOf(int i) {
        return forNumber(i);
    }
}
