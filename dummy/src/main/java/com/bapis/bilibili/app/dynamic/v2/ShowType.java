package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum ShowType implements Internal.EnumLite {
    show_type_none(0),
    show_type_backup(1),
    UNRECOGNIZED(-1);
    
    private static final Internal.EnumLiteMap<ShowType> internalValueMap = new Internal.EnumLiteMap<ShowType>() { // from class: com.bapis.bilibili.app.dynamic.v2.ShowType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ShowType findValueByNumber(int i) {
            return ShowType.forNumber(i);
        }
    };
    public static final int show_type_backup_VALUE = 1;
    public static final int show_type_none_VALUE = 0;
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class ShowTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ShowTypeVerifier();

        private ShowTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ShowType.forNumber(i) != null;
        }
    }

    ShowType(int i) {
        this.value = i;
    }

    public static ShowType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return show_type_backup;
        }
        return show_type_none;
    }

    public static Internal.EnumLiteMap<ShowType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ShowTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ShowType valueOf(int i) {
        return forNumber(i);
    }
}
