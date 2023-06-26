package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum PostPanelBizType implements Internal.EnumLite {
    PostPanelBizTypeNone(0),
    PostPanelBizTypeEncourage(1),
    PostPanelBizTypeColorDM(2),
    PostPanelBizTypeNFTDM(3),
    PostPanelBizTypeFragClose(4),
    PostPanelBizTypeRecommend(5),
    PostPanelBizTypePlotLeak(6),
    PostPanelBizTypeAntiHarassment(7),
    UNRECOGNIZED(-1);
    
    public static final int PostPanelBizTypeAntiHarassment_VALUE = 7;
    public static final int PostPanelBizTypeColorDM_VALUE = 2;
    public static final int PostPanelBizTypeEncourage_VALUE = 1;
    public static final int PostPanelBizTypeFragClose_VALUE = 4;
    public static final int PostPanelBizTypeNFTDM_VALUE = 3;
    public static final int PostPanelBizTypeNone_VALUE = 0;
    public static final int PostPanelBizTypePlotLeak_VALUE = 6;
    public static final int PostPanelBizTypeRecommend_VALUE = 5;
    private static final Internal.EnumLiteMap<PostPanelBizType> internalValueMap = new Internal.EnumLiteMap<PostPanelBizType>() { // from class: com.bapis.bilibili.community.service.dm.v1.PostPanelBizType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PostPanelBizType findValueByNumber(int i) {
            return PostPanelBizType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class PostPanelBizTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PostPanelBizTypeVerifier();

        private PostPanelBizTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PostPanelBizType.forNumber(i) != null;
        }
    }

    PostPanelBizType(int i) {
        this.value = i;
    }

    public static PostPanelBizType forNumber(int i) {
        switch (i) {
            case 0:
                return PostPanelBizTypeNone;
            case 1:
                return PostPanelBizTypeEncourage;
            case 2:
                return PostPanelBizTypeColorDM;
            case 3:
                return PostPanelBizTypeNFTDM;
            case 4:
                return PostPanelBizTypeFragClose;
            case 5:
                return PostPanelBizTypeRecommend;
            case 6:
                return PostPanelBizTypePlotLeak;
            case 7:
                return PostPanelBizTypeAntiHarassment;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<PostPanelBizType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PostPanelBizTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PostPanelBizType valueOf(int i) {
        return forNumber(i);
    }
}
