package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum ButtonAction implements Internal.EnumLite {
    BUTTON_UNKNOWN(0),
    PAY(1),
    VIP(2),
    PACK(3),
    LINK(4),
    COUPON(5),
    DEMAND(6),
    DEMAND_PACK(7),
    FOLLOW(8),
    APPOINTMENT(9),
    VIP_FREE(10),
    TASK(11),
    CHARGINGPLUS(12),
    BP(13),
    PRE_SELL(14),
    UNRECOGNIZED(-1);
    
    public static final int APPOINTMENT_VALUE = 9;
    public static final int BP_VALUE = 13;
    public static final int BUTTON_UNKNOWN_VALUE = 0;
    public static final int CHARGINGPLUS_VALUE = 12;
    public static final int COUPON_VALUE = 5;
    public static final int DEMAND_PACK_VALUE = 7;
    public static final int DEMAND_VALUE = 6;
    public static final int FOLLOW_VALUE = 8;
    public static final int LINK_VALUE = 4;
    public static final int PACK_VALUE = 3;
    public static final int PAY_VALUE = 1;
    public static final int PRE_SELL_VALUE = 14;
    public static final int TASK_VALUE = 11;
    public static final int VIP_FREE_VALUE = 10;
    public static final int VIP_VALUE = 2;
    private static final Internal.EnumLiteMap<ButtonAction> internalValueMap = new Internal.EnumLiteMap<ButtonAction>() { // from class: com.bapis.bilibili.playershared.ButtonAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ButtonAction findValueByNumber(int i) {
            return ButtonAction.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class ButtonActionVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ButtonActionVerifier();

        private ButtonActionVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ButtonAction.forNumber(i) != null;
        }
    }

    ButtonAction(int i) {
        this.value = i;
    }

    public static ButtonAction forNumber(int i) {
        switch (i) {
            case 0:
                return BUTTON_UNKNOWN;
            case 1:
                return PAY;
            case 2:
                return VIP;
            case 3:
                return PACK;
            case 4:
                return LINK;
            case 5:
                return COUPON;
            case 6:
                return DEMAND;
            case 7:
                return DEMAND_PACK;
            case 8:
                return FOLLOW;
            case 9:
                return APPOINTMENT;
            case 10:
                return VIP_FREE;
            case 11:
                return TASK;
            case 12:
                return CHARGINGPLUS;
            case 13:
                return BP;
            case 14:
                return PRE_SELL;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<ButtonAction> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ButtonActionVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ButtonAction valueOf(int i) {
        return forNumber(i);
    }
}
