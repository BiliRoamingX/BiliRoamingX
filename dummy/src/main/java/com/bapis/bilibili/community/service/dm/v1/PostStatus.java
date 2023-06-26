package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes14.dex */
public enum PostStatus implements Internal.EnumLite {
    PostStatusNormal(0),
    PostStatusClosed(1),
    UNRECOGNIZED(-1);
    
    public static final int PostStatusClosed_VALUE = 1;
    public static final int PostStatusNormal_VALUE = 0;
    private static final Internal.EnumLiteMap<PostStatus> internalValueMap = new Internal.EnumLiteMap<PostStatus>() { // from class: com.bapis.bilibili.community.service.dm.v1.PostStatus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PostStatus findValueByNumber(int i) {
            return PostStatus.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class PostStatusVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new PostStatusVerifier();

        private PostStatusVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PostStatus.forNumber(i) != null;
        }
    }

    PostStatus(int i) {
        this.value = i;
    }

    public static PostStatus forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return PostStatusClosed;
        }
        return PostStatusNormal;
    }

    public static Internal.EnumLiteMap<PostStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return PostStatusVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PostStatus valueOf(int i) {
        return forNumber(i);
    }
}
