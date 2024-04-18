package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum TabOtype implements Internal.EnumLite {
    UnknownOtype(0),
    URL(1),
    TopicNA(2),
    CmURI(3),
    UNRECOGNIZED(-1);
    
    public static final int CmURI_VALUE = 3;
    public static final int TopicNA_VALUE = 2;
    public static final int URL_VALUE = 1;
    public static final int UnknownOtype_VALUE = 0;
    private static final Internal.EnumLiteMap<TabOtype> internalValueMap = new Internal.EnumLiteMap<TabOtype>() { // from class: com.bapis.bilibili.app.view.v1.TabOtype.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public TabOtype findValueByNumber(int i) {
            return TabOtype.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class TabOtypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TabOtypeVerifier();

        private TabOtypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return TabOtype.forNumber(i) != null;
        }
    }

    TabOtype(int i) {
        this.value = i;
    }

    public static TabOtype forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return CmURI;
                }
                return TopicNA;
            }
            return URL;
        }
        return UnknownOtype;
    }

    public static Internal.EnumLiteMap<TabOtype> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TabOtypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TabOtype valueOf(int i) {
        return forNumber(i);
    }
}
