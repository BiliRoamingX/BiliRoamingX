package com.bapis.bilibili.playershared;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes18.dex */
public enum ConfType implements Internal.EnumLite {
    NoType(0),
    FLIPCONF(1),
    CASTCONF(2),
    FEEDBACK(3),
    SUBTITLE(4),
    PLAYBACKRATE(5),
    TIMEUP(6),
    PLAYBACKMODE(7),
    SCALEMODE(8),
    BACKGROUNDPLAY(9),
    LIKE(10),
    DISLIKE(11),
    COIN(12),
    ELEC(13),
    SHARE(14),
    SCREENSHOT(15),
    LOCKSCREEN(16),
    RECOMMEND(17),
    PLAYBACKSPEED(18),
    DEFINITION(19),
    SELECTIONS(20),
    NEXT(21),
    EDITDM(22),
    SMALLWINDOW(23),
    SHAKE(24),
    OUTERDM(25),
    INNERDM(26),
    PANORAMA(27),
    DOLBY(28),
    COLORFILTER(29),
    LOSSLESS(30),
    FREYAENTER(31),
    FREYAFULLENTER(32),
    SKIPOPED(33),
    RECORDSCREEN(34),
    DUBBING(35),
    LISTEN(36),
    UNRECOGNIZED(-1);

    public static final int BACKGROUNDPLAY_VALUE = 9;
    public static final int CASTCONF_VALUE = 2;
    public static final int COIN_VALUE = 12;
    public static final int COLORFILTER_VALUE = 29;
    public static final int DEFINITION_VALUE = 19;
    public static final int DISLIKE_VALUE = 11;
    public static final int DOLBY_VALUE = 28;
    public static final int DUBBING_VALUE = 35;
    public static final int EDITDM_VALUE = 22;
    public static final int ELEC_VALUE = 13;
    public static final int FEEDBACK_VALUE = 3;
    public static final int FLIPCONF_VALUE = 1;
    public static final int FREYAENTER_VALUE = 31;
    public static final int FREYAFULLENTER_VALUE = 32;
    public static final int INNERDM_VALUE = 26;
    public static final int LIKE_VALUE = 10;
    public static final int LISTEN_VALUE = 36;
    public static final int LOCKSCREEN_VALUE = 16;
    public static final int LOSSLESS_VALUE = 30;
    public static final int NEXT_VALUE = 21;
    public static final int NoType_VALUE = 0;
    public static final int OUTERDM_VALUE = 25;
    public static final int PANORAMA_VALUE = 27;
    public static final int PLAYBACKMODE_VALUE = 7;
    public static final int PLAYBACKRATE_VALUE = 5;
    public static final int PLAYBACKSPEED_VALUE = 18;
    public static final int RECOMMEND_VALUE = 17;
    public static final int RECORDSCREEN_VALUE = 34;
    public static final int SCALEMODE_VALUE = 8;
    public static final int SCREENSHOT_VALUE = 15;
    public static final int SELECTIONS_VALUE = 20;
    public static final int SHAKE_VALUE = 24;
    public static final int SHARE_VALUE = 14;
    public static final int SKIPOPED_VALUE = 33;
    public static final int SMALLWINDOW_VALUE = 23;
    public static final int SUBTITLE_VALUE = 4;
    public static final int TIMEUP_VALUE = 6;
    private static final Internal.EnumLiteMap<ConfType> internalValueMap = new Internal.EnumLiteMap<ConfType>() { // from class: com.bapis.bilibili.playershared.ConfType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ConfType findValueByNumber(int i) {
            return ConfType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class ConfTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ConfTypeVerifier();

        private ConfTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ConfType.forNumber(i) != null;
        }
    }

    ConfType(int i) {
        this.value = i;
    }

    public static ConfType forNumber(int i) {
        switch (i) {
            case 0:
                return NoType;
            case 1:
                return FLIPCONF;
            case 2:
                return CASTCONF;
            case 3:
                return FEEDBACK;
            case 4:
                return SUBTITLE;
            case 5:
                return PLAYBACKRATE;
            case 6:
                return TIMEUP;
            case 7:
                return PLAYBACKMODE;
            case 8:
                return SCALEMODE;
            case 9:
                return BACKGROUNDPLAY;
            case 10:
                return LIKE;
            case 11:
                return DISLIKE;
            case 12:
                return COIN;
            case 13:
                return ELEC;
            case 14:
                return SHARE;
            case 15:
                return SCREENSHOT;
            case 16:
                return LOCKSCREEN;
            case 17:
                return RECOMMEND;
            case 18:
                return PLAYBACKSPEED;
            case 19:
                return DEFINITION;
            case 20:
                return SELECTIONS;
            case 21:
                return NEXT;
            case 22:
                return EDITDM;
            case 23:
                return SMALLWINDOW;
            case 24:
                return SHAKE;
            case 25:
                return OUTERDM;
            case 26:
                return INNERDM;
            case 27:
                return PANORAMA;
            case 28:
                return DOLBY;
            case 29:
                return COLORFILTER;
            case 30:
                return LOSSLESS;
            case 31:
                return FREYAENTER;
            case 32:
                return FREYAFULLENTER;
            case 33:
                return SKIPOPED;
            case 34:
                return RECORDSCREEN;
            case 35:
                return DUBBING;
            case 36:
                return LISTEN;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<ConfType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ConfTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ConfType valueOf(int i) {
        return forNumber(i);
    }
}
