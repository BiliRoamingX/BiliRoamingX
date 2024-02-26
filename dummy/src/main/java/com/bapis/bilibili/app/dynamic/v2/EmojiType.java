package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum EmojiType implements Internal.EnumLite {
    emoji_none(0),
    emoji_old(1),
    emoji_new(2),
    vip(3),
    UNRECOGNIZED(-1);

    public static final int emoji_new_VALUE = 2;
    public static final int emoji_none_VALUE = 0;
    public static final int emoji_old_VALUE = 1;
    private static final Internal.EnumLiteMap<EmojiType> internalValueMap = new Internal.EnumLiteMap<EmojiType>() { // from class: com.bapis.bilibili.app.dynamic.v2.EmojiType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EmojiType findValueByNumber(int i2) {
            return EmojiType.forNumber(i2);
        }
    };
    public static final int vip_VALUE = 3;
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.EmojiType$b */
    /* loaded from: classes19.dex */
    private static final class C5456b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C5456b();

        private C5456b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return EmojiType.forNumber(i2) != null;
        }
    }

    EmojiType(int i2) {
        this.value = i2;
    }

    public static EmojiType forNumber(int i2) {
        if (i2 == 0) {
            return emoji_none;
        }
        if (i2 == 1) {
            return emoji_old;
        }
        if (i2 == 2) {
            return emoji_new;
        }
        if (i2 != 3) {
            return null;
        }
        return vip;
    }

    public static Internal.EnumLiteMap<EmojiType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C5456b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EmojiType valueOf(int i2) {
        return forNumber(i2);
    }
}
