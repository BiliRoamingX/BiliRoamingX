package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum OpusType implements Internal.EnumLite {
    OPUS_TYPE_DYN(0),
    OPUS_TYPE_ARTICLE(1),
    OPUS_TYPE_NOTE(2),
    OPUS_TYPE_WORD(3),
    OPUS_TYPE_REPOST(4),
    UNRECOGNIZED(-1);
    
    public static final int OPUS_TYPE_ARTICLE_VALUE = 1;
    public static final int OPUS_TYPE_DYN_VALUE = 0;
    public static final int OPUS_TYPE_NOTE_VALUE = 2;
    public static final int OPUS_TYPE_REPOST_VALUE = 4;
    public static final int OPUS_TYPE_WORD_VALUE = 3;
    private static final Internal.EnumLiteMap<OpusType> internalValueMap = new Internal.EnumLiteMap<OpusType>() { // from class: com.bapis.bilibili.app.dynamic.v2.OpusType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public OpusType findValueByNumber(int i) {
            return OpusType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.OpusType$b */
    /* loaded from: classes19.dex */
    private static final class C9423b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C9423b();

        private C9423b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OpusType.forNumber(i) != null;
        }
    }

    OpusType(int i) {
        this.value = i;
    }

    public static OpusType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return OPUS_TYPE_REPOST;
                    }
                    return OPUS_TYPE_WORD;
                }
                return OPUS_TYPE_NOTE;
            }
            return OPUS_TYPE_ARTICLE;
        }
        return OPUS_TYPE_DYN;
    }

    public static Internal.EnumLiteMap<OpusType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C9423b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OpusType valueOf(int i) {
        return forNumber(i);
    }
}
