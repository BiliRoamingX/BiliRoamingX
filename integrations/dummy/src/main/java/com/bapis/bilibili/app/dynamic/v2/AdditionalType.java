package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum AdditionalType implements Internal.EnumLite {
    additional_none(0),
    additional_type_pgc(1),
    additional_type_goods(2),
    additional_type_vote(3),
    additional_type_common(4),
    additional_type_esport(5),
    additional_type_up_rcmd(6),
    additional_type_ugc(7),
    additional_type_up_reservation(8),
    additional_type_article(9),
    additional_type_live_room(10),
    UNRECOGNIZED(-1);

    public static final int additional_none_VALUE = 0;
    public static final int additional_type_article_VALUE = 9;
    public static final int additional_type_common_VALUE = 4;
    public static final int additional_type_esport_VALUE = 5;
    public static final int additional_type_goods_VALUE = 2;
    public static final int additional_type_live_room_VALUE = 10;
    public static final int additional_type_pgc_VALUE = 1;
    public static final int additional_type_ugc_VALUE = 7;
    public static final int additional_type_up_rcmd_VALUE = 6;
    public static final int additional_type_up_reservation_VALUE = 8;
    public static final int additional_type_vote_VALUE = 3;
    private static final Internal.EnumLiteMap<AdditionalType> internalValueMap = new Internal.EnumLiteMap<AdditionalType>() { // from class: com.bapis.bilibili.app.dynamic.v2.AdditionalType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public AdditionalType findValueByNumber(int i) {
            return AdditionalType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class AdditionalTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new AdditionalTypeVerifier();

        private AdditionalTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return AdditionalType.forNumber(i) != null;
        }
    }

    AdditionalType(int i) {
        this.value = i;
    }

    public static AdditionalType forNumber(int i) {
        switch (i) {
            case 0:
                return additional_none;
            case 1:
                return additional_type_pgc;
            case 2:
                return additional_type_goods;
            case 3:
                return additional_type_vote;
            case 4:
                return additional_type_common;
            case 5:
                return additional_type_esport;
            case 6:
                return additional_type_up_rcmd;
            case 7:
                return additional_type_ugc;
            case 8:
                return additional_type_up_reservation;
            case 9:
                return additional_type_article;
            case 10:
                return additional_type_live_room;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<AdditionalType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return AdditionalTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AdditionalType valueOf(int i) {
        return forNumber(i);
    }
}
