package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum DescType implements Internal.EnumLite {
    desc_type_none(0),
    desc_type_text(1),
    desc_type_aite(2),
    desc_type_lottery(3),
    desc_type_vote(4),
    desc_type_topic(5),
    desc_type_goods(6),
    desc_type_bv(7),
    desc_type_av(8),
    desc_type_emoji(9),
    desc_type_user(10),
    desc_type_cv(11),
    desc_type_vc(12),
    desc_type_web(13),
    desc_type_taobao(14),
    desc_type_mail(15),
    desc_type_ogv_season(16),
    desc_type_ogv_ep(17),
    desc_type_search_word(18),
    UNRECOGNIZED(-1);

    public static final int desc_type_aite_VALUE = 2;
    public static final int desc_type_av_VALUE = 8;
    public static final int desc_type_bv_VALUE = 7;
    public static final int desc_type_cv_VALUE = 11;
    public static final int desc_type_emoji_VALUE = 9;
    public static final int desc_type_goods_VALUE = 6;
    public static final int desc_type_lottery_VALUE = 3;
    public static final int desc_type_mail_VALUE = 15;
    public static final int desc_type_none_VALUE = 0;
    public static final int desc_type_ogv_ep_VALUE = 17;
    public static final int desc_type_ogv_season_VALUE = 16;
    public static final int desc_type_search_word_VALUE = 18;
    public static final int desc_type_taobao_VALUE = 14;
    public static final int desc_type_text_VALUE = 1;
    public static final int desc_type_topic_VALUE = 5;
    public static final int desc_type_user_VALUE = 10;
    public static final int desc_type_vc_VALUE = 12;
    public static final int desc_type_vote_VALUE = 4;
    public static final int desc_type_web_VALUE = 13;
    private static final Internal.EnumLiteMap<DescType> internalValueMap = new Internal.EnumLiteMap<DescType>() { // from class: com.bapis.bilibili.app.dynamic.v2.DescType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DescType findValueByNumber(int i2) {
            return DescType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DescType$b */
    /* loaded from: classes19.dex */
    private static final class C5330b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C5330b();

        private C5330b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return DescType.forNumber(i2) != null;
        }
    }

    DescType(int i2) {
        this.value = i2;
    }

    public static DescType forNumber(int i2) {
        switch (i2) {
            case 0:
                return desc_type_none;
            case 1:
                return desc_type_text;
            case 2:
                return desc_type_aite;
            case 3:
                return desc_type_lottery;
            case 4:
                return desc_type_vote;
            case 5:
                return desc_type_topic;
            case 6:
                return desc_type_goods;
            case 7:
                return desc_type_bv;
            case 8:
                return desc_type_av;
            case 9:
                return desc_type_emoji;
            case 10:
                return desc_type_user;
            case 11:
                return desc_type_cv;
            case 12:
                return desc_type_vc;
            case 13:
                return desc_type_web;
            case 14:
                return desc_type_taobao;
            case 15:
                return desc_type_mail;
            case 16:
                return desc_type_ogv_season;
            case 17:
                return desc_type_ogv_ep;
            case 18:
                return desc_type_search_word;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<DescType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C5330b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DescType valueOf(int i2) {
        return forNumber(i2);
    }
}
