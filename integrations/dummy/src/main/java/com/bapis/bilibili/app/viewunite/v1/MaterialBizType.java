package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes20.dex */
public enum MaterialBizType implements Internal.EnumLite {
    NONE(0),
    ACTIVITY(1),
    BGM(2),
    EFFECT(3),
    SHOOT_SAME(4),
    SHOOT_TOGETHER(5),
    ACTIVITY_ICON(6),
    NEW_BGM(7),
    GENERAL_TYPE(8),
    UNRECOGNIZED(-1);
    
    public static final int ACTIVITY_ICON_VALUE = 6;
    public static final int ACTIVITY_VALUE = 1;
    public static final int BGM_VALUE = 2;
    public static final int EFFECT_VALUE = 3;
    public static final int GENERAL_TYPE_VALUE = 8;
    public static final int NEW_BGM_VALUE = 7;
    public static final int NONE_VALUE = 0;
    public static final int SHOOT_SAME_VALUE = 4;
    public static final int SHOOT_TOGETHER_VALUE = 5;
    private static final Internal.EnumLiteMap<MaterialBizType> internalValueMap = new Internal.EnumLiteMap<MaterialBizType>() { // from class: com.bapis.bilibili.app.viewunite.v1.MaterialBizType.a
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public MaterialBizType findValueByNumber(int i) {
            return MaterialBizType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.MaterialBizType$b */
    /* loaded from: classes20.dex */
    private static final class C12328b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C12328b();

        private C12328b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MaterialBizType.forNumber(i) != null;
        }
    }

    MaterialBizType(int i) {
        this.value = i;
    }

    public static MaterialBizType forNumber(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return ACTIVITY;
            case 2:
                return BGM;
            case 3:
                return EFFECT;
            case 4:
                return SHOOT_SAME;
            case 5:
                return SHOOT_TOGETHER;
            case 6:
                return ACTIVITY_ICON;
            case 7:
                return NEW_BGM;
            case 8:
                return GENERAL_TYPE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<MaterialBizType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12328b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MaterialBizType valueOf(int i) {
        return forNumber(i);
    }
}
