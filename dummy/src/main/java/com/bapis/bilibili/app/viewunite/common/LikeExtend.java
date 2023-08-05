package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class LikeExtend extends GeneratedMessageLite<LikeExtend, LikeExtend.Builder> implements MessageLiteOrBuilder {
    private static final LikeExtend DEFAULT_INSTANCE;
    public static final int LIKE_ANIMATION_FIELD_NUMBER = 2;
    private static volatile Parser<LikeExtend> PARSER = null;
    public static final int PLAYER_ANIMATION_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 4;
    public static final int TRIPLE_LIKE_FIELD_NUMBER = 1;
    private String likeAnimation_ = "";
    private PlayerAnimation playerAnimation_;
    private ActivityResource resource_;
    private UpLikeImg tripleLike_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.LikeExtend$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70111 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16994xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16994xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16994xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16994xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16994xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LikeExtend, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70111 c70111) {
            this();
        }

        public Builder clearLikeAnimation() {
            copyOnWrite();
            ((LikeExtend) this.instance).clearLikeAnimation();
            return this;
        }

        public Builder clearPlayerAnimation() {
            copyOnWrite();
            ((LikeExtend) this.instance).clearPlayerAnimation();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((LikeExtend) this.instance).clearResource();
            return this;
        }

        public Builder clearTripleLike() {
            copyOnWrite();
            ((LikeExtend) this.instance).clearTripleLike();
            return this;
        }

        public String getLikeAnimation() {
            return ((LikeExtend) this.instance).getLikeAnimation();
        }

        public ByteString getLikeAnimationBytes() {
            return ((LikeExtend) this.instance).getLikeAnimationBytes();
        }

        public PlayerAnimation getPlayerAnimation() {
            return ((LikeExtend) this.instance).getPlayerAnimation();
        }

        public ActivityResource getResource() {
            return ((LikeExtend) this.instance).getResource();
        }

        public UpLikeImg getTripleLike() {
            return ((LikeExtend) this.instance).getTripleLike();
        }

        public boolean hasPlayerAnimation() {
            return ((LikeExtend) this.instance).hasPlayerAnimation();
        }

        public boolean hasResource() {
            return ((LikeExtend) this.instance).hasResource();
        }

        public boolean hasTripleLike() {
            return ((LikeExtend) this.instance).hasTripleLike();
        }

        public Builder mergePlayerAnimation(PlayerAnimation playerAnimation) {
            copyOnWrite();
            ((LikeExtend) this.instance).mergePlayerAnimation(playerAnimation);
            return this;
        }

        public Builder mergeResource(ActivityResource activityResource) {
            copyOnWrite();
            ((LikeExtend) this.instance).mergeResource(activityResource);
            return this;
        }

        public Builder mergeTripleLike(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((LikeExtend) this.instance).mergeTripleLike(upLikeImg);
            return this;
        }

        public Builder setLikeAnimation(String str) {
            copyOnWrite();
            ((LikeExtend) this.instance).setLikeAnimation(str);
            return this;
        }

        public Builder setLikeAnimationBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeExtend) this.instance).setLikeAnimationBytes(byteString);
            return this;
        }

        public Builder setPlayerAnimation(PlayerAnimation playerAnimation) {
            copyOnWrite();
            ((LikeExtend) this.instance).setPlayerAnimation(playerAnimation);
            return this;
        }

        public Builder setResource(ActivityResource activityResource) {
            copyOnWrite();
            ((LikeExtend) this.instance).setResource(activityResource);
            return this;
        }

        public Builder setTripleLike(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((LikeExtend) this.instance).setTripleLike(upLikeImg);
            return this;
        }

        private Builder() {
            super(LikeExtend.DEFAULT_INSTANCE);
        }

        public Builder setPlayerAnimation(PlayerAnimation.Builder builder) {
            copyOnWrite();
            ((LikeExtend) this.instance).setPlayerAnimation(builder.build());
            return this;
        }

        public Builder setResource(ActivityResource.Builder builder) {
            copyOnWrite();
            ((LikeExtend) this.instance).setResource(builder.build());
            return this;
        }

        public Builder setTripleLike(UpLikeImg.Builder builder) {
            copyOnWrite();
            ((LikeExtend) this.instance).setTripleLike(builder.build());
            return this;
        }
    }

    static {
        LikeExtend likeExtend = new LikeExtend();
        DEFAULT_INSTANCE = likeExtend;
        GeneratedMessageLite.registerDefaultInstance(LikeExtend.class, likeExtend);
    }

    private LikeExtend() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeAnimation() {
        this.likeAnimation_ = getDefaultInstance().getLikeAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerAnimation() {
        this.playerAnimation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripleLike() {
        this.tripleLike_ = null;
    }

    public static LikeExtend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerAnimation(PlayerAnimation playerAnimation) {
        playerAnimation.getClass();
        PlayerAnimation playerAnimation2 = this.playerAnimation_;
        if (playerAnimation2 != null && playerAnimation2 != PlayerAnimation.getDefaultInstance()) {
            this.playerAnimation_ = PlayerAnimation.newBuilder(this.playerAnimation_).mergeFrom((PlayerAnimation) playerAnimation).buildPartial();
        } else {
            this.playerAnimation_ = playerAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResource(ActivityResource activityResource) {
        activityResource.getClass();
        ActivityResource activityResource2 = this.resource_;
        if (activityResource2 != null && activityResource2 != ActivityResource.getDefaultInstance()) {
            this.resource_ = ActivityResource.newBuilder(this.resource_).mergeFrom((ActivityResource) activityResource).buildPartial();
        } else {
            this.resource_ = activityResource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripleLike(UpLikeImg upLikeImg) {
        upLikeImg.getClass();
        UpLikeImg upLikeImg2 = this.tripleLike_;
        if (upLikeImg2 != null && upLikeImg2 != UpLikeImg.getDefaultInstance()) {
            this.tripleLike_ = UpLikeImg.newBuilder(this.tripleLike_).mergeFrom((UpLikeImg) upLikeImg).buildPartial();
        } else {
            this.tripleLike_ = upLikeImg;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeExtend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeExtend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeExtend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeExtend> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeAnimation(String str) {
        str.getClass();
        this.likeAnimation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeAnimationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.likeAnimation_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerAnimation(PlayerAnimation playerAnimation) {
        playerAnimation.getClass();
        this.playerAnimation_ = playerAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(ActivityResource activityResource) {
        activityResource.getClass();
        this.resource_ = activityResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripleLike(UpLikeImg upLikeImg) {
        upLikeImg.getClass();
        this.tripleLike_ = upLikeImg;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70111.f16994xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeExtend();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t\u0004\t", new Object[]{"tripleLike_", "likeAnimation_", "playerAnimation_", "resource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeExtend> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeExtend.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getLikeAnimation() {
        return this.likeAnimation_;
    }

    public ByteString getLikeAnimationBytes() {
        return ByteString.copyFromUtf8(this.likeAnimation_);
    }

    public PlayerAnimation getPlayerAnimation() {
        PlayerAnimation playerAnimation = this.playerAnimation_;
        return playerAnimation == null ? PlayerAnimation.getDefaultInstance() : playerAnimation;
    }

    public ActivityResource getResource() {
        ActivityResource activityResource = this.resource_;
        return activityResource == null ? ActivityResource.getDefaultInstance() : activityResource;
    }

    public UpLikeImg getTripleLike() {
        UpLikeImg upLikeImg = this.tripleLike_;
        return upLikeImg == null ? UpLikeImg.getDefaultInstance() : upLikeImg;
    }

    public boolean hasPlayerAnimation() {
        return this.playerAnimation_ != null;
    }

    public boolean hasResource() {
        return this.resource_ != null;
    }

    public boolean hasTripleLike() {
        return this.tripleLike_ != null;
    }

    public static Builder newBuilder(LikeExtend likeExtend) {
        return DEFAULT_INSTANCE.createBuilder(likeExtend);
    }

    public static LikeExtend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeExtend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeExtend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeExtend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeExtend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeExtend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeExtend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeExtend parseFrom(InputStream inputStream) throws IOException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeExtend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeExtend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeExtend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
