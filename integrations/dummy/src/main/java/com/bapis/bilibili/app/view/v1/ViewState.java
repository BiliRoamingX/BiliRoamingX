package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum ViewState implements Internal.EnumLite {
    ViewNone(0),
    ViewHostOnlySelf(1),
    UNRECOGNIZED(-1);
    
    public static final int ViewHostOnlySelf_VALUE = 1;
    public static final int ViewNone_VALUE = 0;
    private static final Internal.EnumLiteMap<ViewState> internalValueMap = new Internal.EnumLiteMap<ViewState>() { // from class: com.bapis.bilibili.app.view.v1.ViewState.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ViewState findValueByNumber(int i) {
            return ViewState.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class ViewStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ViewStateVerifier();

        private ViewStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ViewState.forNumber(i) != null;
        }
    }

    ViewState(int i) {
        this.value = i;
    }

    public static ViewState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return ViewHostOnlySelf;
        }
        return ViewNone;
    }

    public static Internal.EnumLiteMap<ViewState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ViewStateVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ViewState valueOf(int i) {
        return forNumber(i);
    }
}
