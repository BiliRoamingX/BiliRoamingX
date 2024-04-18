package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes20.dex */
public enum BizType implements Internal.EnumLite {
    BizTypeNone(0),
    BizTypeFollowVideo(1),
    BizTypeReserveActivity(2),
    BizTypeJumpLink(3),
    BizTypeFavSeason(4),
    BizTypeReserveGame(5),
    UNRECOGNIZED(-1);
    
    public static final int BizTypeFavSeason_VALUE = 4;
    public static final int BizTypeFollowVideo_VALUE = 1;
    public static final int BizTypeJumpLink_VALUE = 3;
    public static final int BizTypeNone_VALUE = 0;
    public static final int BizTypeReserveActivity_VALUE = 2;
    public static final int BizTypeReserveGame_VALUE = 5;
    private static final Internal.EnumLiteMap<BizType> internalValueMap = new Internal.EnumLiteMap<BizType>() { // from class: com.bapis.bilibili.app.viewunite.v1.BizType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public BizType findValueByNumber(int i) {
            return BizType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.BizType$b */
    /* loaded from: classes20.dex */
    private static final class C12282b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C12282b();

        private C12282b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return BizType.forNumber(i) != null;
        }
    }

    BizType(int i) {
        this.value = i;
    }

    public static BizType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return BizTypeReserveGame;
                        }
                        return BizTypeFavSeason;
                    }
                    return BizTypeJumpLink;
                }
                return BizTypeReserveActivity;
            }
            return BizTypeFollowVideo;
        }
        return BizTypeNone;
    }

    public static Internal.EnumLiteMap<BizType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12282b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BizType valueOf(int i) {
        return forNumber(i);
    }
}
