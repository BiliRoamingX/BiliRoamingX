package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.Internal;

public enum Business implements Internal.EnumLite {
    UNKNOWN(0),
    STORY(1),
    UNRECOGNIZED(-1);

    public static final int STORY_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Business> internalValueMap = Business::forNumber;
    private final int value;

    private static final class BusinessVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new BusinessVerifier();

        private BusinessVerifier() {
        }

        @Override
        public boolean isInRange(int i) {
            return Business.forNumber(i) != null;
        }
    }

    Business(int i) {
        this.value = i;
    }

    public static Business forNumber(int i) {
        if (i == 1) return STORY;
        return UNKNOWN;
    }

    public static Internal.EnumLiteMap<Business> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return BusinessVerifier.INSTANCE;
    }

    @Override
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Business valueOf(int i) {
        return forNumber(i);
    }
}
