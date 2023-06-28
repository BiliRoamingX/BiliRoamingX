package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum PremiereState implements Internal.EnumLite {
    premiere_none(0),
    premiere_before(1),
    premiere_in(2),
    premiere_after(3),
    UNRECOGNIZED(-1);
    
    private static final Internal.EnumLiteMap<PremiereState> internalValueMap = new Internal.EnumLiteMap<PremiereState>() { // from class: com.bapis.bilibili.app.view.v1.PremiereState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PremiereState findValueByNumber(int i) {
            return PremiereState.forNumber(i);
        }
    };
    public static final int premiere_after_VALUE = 3;
    public static final int premiere_before_VALUE = 1;
    public static final int premiere_in_VALUE = 2;
    public static final int premiere_none_VALUE = 0;
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class PremiereStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PremiereStateVerifier();

        private PremiereStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PremiereState.forNumber(i) != null;
        }
    }

    PremiereState(int i) {
        this.value = i;
    }

    public static PremiereState forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return premiere_after;
                }
                return premiere_in;
            }
            return premiere_before;
        }
        return premiere_none;
    }

    public static Internal.EnumLiteMap<PremiereState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PremiereStateVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PremiereState valueOf(int i) {
        return forNumber(i);
    }
}
