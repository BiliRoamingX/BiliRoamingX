package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes17.dex */
public enum AttentionRelationStatus implements Internal.EnumLite {
    ARS_NONE(0),
    ARS_N0RELATION(1),
    ARS_FOLLOWHIM(2),
    ARS_FOLLOWME(3),
    ARS_BUDDY(4),
    ARS_SPECIAL(5),
    ARS_CANCELBLOCK(6),
    UNRECOGNIZED(-1);
    
    public static final int ARS_BUDDY_VALUE = 4;
    public static final int ARS_CANCELBLOCK_VALUE = 6;
    public static final int ARS_FOLLOWHIM_VALUE = 2;
    public static final int ARS_FOLLOWME_VALUE = 3;
    public static final int ARS_N0RELATION_VALUE = 1;
    public static final int ARS_NONE_VALUE = 0;
    public static final int ARS_SPECIAL_VALUE = 5;
    private static final Internal.EnumLiteMap<AttentionRelationStatus> internalValueMap = new Internal.EnumLiteMap<AttentionRelationStatus>() { // from class: com.bapis.bilibili.app.viewunite.common.AttentionRelationStatus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public AttentionRelationStatus findValueByNumber(int i) {
            return AttentionRelationStatus.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class AttentionRelationStatusVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new AttentionRelationStatusVerifier();

        private AttentionRelationStatusVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return AttentionRelationStatus.forNumber(i) != null;
        }
    }

    AttentionRelationStatus(int i) {
        this.value = i;
    }

    public static AttentionRelationStatus forNumber(int i) {
        switch (i) {
            case 0:
                return ARS_NONE;
            case 1:
                return ARS_N0RELATION;
            case 2:
                return ARS_FOLLOWHIM;
            case 3:
                return ARS_FOLLOWME;
            case 4:
                return ARS_BUDDY;
            case 5:
                return ARS_SPECIAL;
            case 6:
                return ARS_CANCELBLOCK;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<AttentionRelationStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return AttentionRelationStatusVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AttentionRelationStatus valueOf(int i) {
        return forNumber(i);
    }
}
