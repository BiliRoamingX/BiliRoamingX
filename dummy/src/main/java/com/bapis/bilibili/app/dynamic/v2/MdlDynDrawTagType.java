package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum MdlDynDrawTagType implements Internal.EnumLite {
    mdl_draw_tag_none(0),
    mdl_draw_tag_common(1),
    mdl_draw_tag_goods(2),
    mdl_draw_tag_user(3),
    mdl_draw_tag_topic(4),
    mdl_draw_tag_lbs(5),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap<MdlDynDrawTagType> internalValueMap = new Internal.EnumLiteMap<MdlDynDrawTagType>() { // from class: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawTagType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public MdlDynDrawTagType findValueByNumber(int i2) {
            return MdlDynDrawTagType.forNumber(i2);
        }
    };
    public static final int mdl_draw_tag_common_VALUE = 1;
    public static final int mdl_draw_tag_goods_VALUE = 2;
    public static final int mdl_draw_tag_lbs_VALUE = 5;
    public static final int mdl_draw_tag_none_VALUE = 0;
    public static final int mdl_draw_tag_topic_VALUE = 4;
    public static final int mdl_draw_tag_user_VALUE = 3;
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawTagType$b */
    /* loaded from: classes19.dex */
    private static final class C5690b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C5690b();

        private C5690b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return MdlDynDrawTagType.forNumber(i2) != null;
        }
    }

    MdlDynDrawTagType(int i2) {
        this.value = i2;
    }

    public static MdlDynDrawTagType forNumber(int i2) {
        if (i2 == 0) {
            return mdl_draw_tag_none;
        }
        if (i2 == 1) {
            return mdl_draw_tag_common;
        }
        if (i2 == 2) {
            return mdl_draw_tag_goods;
        }
        if (i2 == 3) {
            return mdl_draw_tag_user;
        }
        if (i2 == 4) {
            return mdl_draw_tag_topic;
        }
        if (i2 != 5) {
            return null;
        }
        return mdl_draw_tag_lbs;
    }

    public static Internal.EnumLiteMap<MdlDynDrawTagType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C5690b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MdlDynDrawTagType valueOf(int i2) {
        return forNumber(i2);
    }
}
