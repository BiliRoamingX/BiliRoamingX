package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum BubbleType implements Internal.EnumLite {
    BubbleTypeNone(0),
    BubbleTypeClickButton(1),
    BubbleTypeDmSettingPanel(2),
    UNRECOGNIZED(-1);
    
    public static final int BubbleTypeClickButton_VALUE = 1;
    public static final int BubbleTypeDmSettingPanel_VALUE = 2;
    public static final int BubbleTypeNone_VALUE = 0;
    private static final Internal.EnumLiteMap<BubbleType> internalValueMap = new Internal.EnumLiteMap<BubbleType>() { // from class: com.bapis.bilibili.community.service.dm.v1.BubbleType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public BubbleType findValueByNumber(int i) {
            return BubbleType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class BubbleTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new BubbleTypeVerifier();

        private BubbleTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return BubbleType.forNumber(i) != null;
        }
    }

    BubbleType(int i) {
        this.value = i;
    }

    public static BubbleType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BubbleTypeDmSettingPanel;
            }
            return BubbleTypeClickButton;
        }
        return BubbleTypeNone;
    }

    public static Internal.EnumLiteMap<BubbleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return BubbleTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BubbleType valueOf(int i) {
        return forNumber(i);
    }
}
