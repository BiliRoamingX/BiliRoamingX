package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes19.dex */
public enum DynamicType implements Internal.EnumLite {
    dyn_none(0),
    forward(1),
    av(2),
    pgc(3),
    courses(4),
    fold(5),
    word(6),
    draw(7),
    article(8),
    music(9),
    common_square(10),
    common_vertical(11),
    live(12),
    medialist(13),
    courses_season(14),
    ad(15),
    applet(16),
    subscription(17),
    live_rcmd(18),
    banner(19),
    ugc_season(20),
    subscription_new(21),
    story(22),
    topic_rcmd(23),
    cour_up(24),
    topic_set(25),
    notice(26),
    text_notice(27),
    onetime_notice(28),
    UNRECOGNIZED(-1);

    public static final int ad_VALUE = 15;
    public static final int applet_VALUE = 16;
    public static final int article_VALUE = 8;
    public static final int av_VALUE = 2;
    public static final int banner_VALUE = 19;
    public static final int common_square_VALUE = 10;
    public static final int common_vertical_VALUE = 11;
    public static final int cour_up_VALUE = 24;
    public static final int courses_VALUE = 4;
    public static final int courses_season_VALUE = 14;
    public static final int draw_VALUE = 7;
    public static final int dyn_none_VALUE = 0;
    public static final int fold_VALUE = 5;
    public static final int forward_VALUE = 1;
    private static final Internal.EnumLiteMap<DynamicType> internalValueMap = new Internal.EnumLiteMap<DynamicType>() { // from class: com.bapis.bilibili.app.dynamic.v2.DynamicType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public DynamicType findValueByNumber(int i2) {
            return DynamicType.forNumber(i2);
        }
    };
    public static final int live_VALUE = 12;
    public static final int live_rcmd_VALUE = 18;
    public static final int medialist_VALUE = 13;
    public static final int music_VALUE = 9;
    public static final int notice_VALUE = 26;
    public static final int onetime_notice_VALUE = 28;
    public static final int pgc_VALUE = 3;
    public static final int story_VALUE = 22;
    public static final int subscription_VALUE = 17;
    public static final int subscription_new_VALUE = 21;
    public static final int text_notice_VALUE = 27;
    public static final int topic_rcmd_VALUE = 23;
    public static final int topic_set_VALUE = 25;
    public static final int ugc_season_VALUE = 20;
    public static final int word_VALUE = 6;
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynamicType$b */
    /* loaded from: classes19.dex */
    private static final class C5452b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C5452b();

        private C5452b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            return DynamicType.forNumber(i2) != null;
        }
    }

    DynamicType(int i2) {
        this.value = i2;
    }

    public static DynamicType forNumber(int i2) {
        switch (i2) {
            case 0:
                return dyn_none;
            case 1:
                return forward;
            case 2:
                return av;
            case 3:
                return pgc;
            case 4:
                return courses;
            case 5:
                return fold;
            case 6:
                return word;
            case 7:
                return draw;
            case 8:
                return article;
            case 9:
                return music;
            case 10:
                return common_square;
            case 11:
                return common_vertical;
            case 12:
                return live;
            case 13:
                return medialist;
            case 14:
                return courses_season;
            case 15:
                return ad;
            case 16:
                return applet;
            case 17:
                return subscription;
            case 18:
                return live_rcmd;
            case 19:
                return banner;
            case 20:
                return ugc_season;
            case 21:
                return subscription_new;
            case 22:
                return story;
            case 23:
                return topic_rcmd;
            case 24:
                return cour_up;
            case 25:
                return topic_set;
            case 26:
                return notice;
            case 27:
                return text_notice;
            case 28:
                return onetime_notice;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<DynamicType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C5452b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DynamicType valueOf(int i2) {
        return forNumber(i2);
    }
}
