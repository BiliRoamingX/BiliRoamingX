package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum TabType implements Internal.EnumLite {
    TAB_NONE(0),
    TAB_INTRODUCTION(1),
    TAB_REPLY(2),
    TAB_OGV_ACTIVITY(3),
    UNRECOGNIZED(-1);
    
    public static final int TAB_INTRODUCTION_VALUE = 1;
    public static final int TAB_NONE_VALUE = 0;
    public static final int TAB_OGV_ACTIVITY_VALUE = 3;
    public static final int TAB_REPLY_VALUE = 2;
    private static final Internal.EnumLiteMap<TabType> internalValueMap = new Internal.EnumLiteMap<TabType>() { // from class: com.bapis.bilibili.app.viewunite.v1.TabType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public TabType findValueByNumber(int i) {
            return TabType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class TabTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TabTypeVerifier();

        private TabTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return TabType.forNumber(i) != null;
        }
    }

    TabType(int i) {
        this.value = i;
    }

    public static TabType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return TAB_OGV_ACTIVITY;
                }
                return TAB_REPLY;
            }
            return TAB_INTRODUCTION;
        }
        return TAB_NONE;
    }

    public static Internal.EnumLiteMap<TabType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TabTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TabType valueOf(int i) {
        return forNumber(i);
    }
}
