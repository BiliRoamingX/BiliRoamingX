package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum TabStyle implements Internal.EnumLite {
    UnknownStyle(0),
    Text(1),
    Pic(2),
    UNRECOGNIZED(-1);
    
    public static final int Pic_VALUE = 2;
    public static final int Text_VALUE = 1;
    public static final int UnknownStyle_VALUE = 0;
    private static final Internal.EnumLiteMap<TabStyle> internalValueMap = new Internal.EnumLiteMap<TabStyle>() { // from class: com.bapis.bilibili.app.view.v1.TabStyle.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public TabStyle findValueByNumber(int i) {
            return TabStyle.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class TabStyleVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TabStyleVerifier();

        private TabStyleVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return TabStyle.forNumber(i) != null;
        }
    }

    TabStyle(int i) {
        this.value = i;
    }

    public static TabStyle forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Pic;
            }
            return Text;
        }
        return UnknownStyle;
    }

    public static Internal.EnumLiteMap<TabStyle> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TabStyleVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TabStyle valueOf(int i) {
        return forNumber(i);
    }
}
