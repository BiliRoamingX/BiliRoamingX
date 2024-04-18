package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.UpLikeImg;
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
/* loaded from: classes20.dex */
public final class LikeConfig extends GeneratedMessageLite<LikeConfig, LikeConfig.C8255b> implements MessageLiteOrBuilder {
    private static final LikeConfig DEFAULT_INSTANCE;
    public static final int LIKE_ANIMATION_FIELD_NUMBER = 2;
    private static volatile Parser<LikeConfig> PARSER = null;
    public static final int TRIPLE_LIKE_FIELD_NUMBER = 1;
    private String likeAnimation_ = "";
    private UpLikeImg tripleLike_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.LikeConfig$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C8254a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18350xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18350xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18350xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18350xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18350xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18350xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18350xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18350xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.LikeConfig$b */
    /* loaded from: classes20.dex */
    public static final class C8255b extends GeneratedMessageLite.Builder<LikeConfig, C8255b> implements MessageLiteOrBuilder {
        /* synthetic */ C8255b(C8254a c8254a) {
            this();
        }

        public C8255b clearLikeAnimation() {
            copyOnWrite();
            ((LikeConfig) this.instance).clearLikeAnimation();
            return this;
        }

        public C8255b clearTripleLike() {
            copyOnWrite();
            ((LikeConfig) this.instance).clearTripleLike();
            return this;
        }

        public String getLikeAnimation() {
            return ((LikeConfig) this.instance).getLikeAnimation();
        }

        public ByteString getLikeAnimationBytes() {
            return ((LikeConfig) this.instance).getLikeAnimationBytes();
        }

        public UpLikeImg getTripleLike() {
            return ((LikeConfig) this.instance).getTripleLike();
        }

        public boolean hasTripleLike() {
            return ((LikeConfig) this.instance).hasTripleLike();
        }

        public C8255b mergeTripleLike(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((LikeConfig) this.instance).mergeTripleLike(upLikeImg);
            return this;
        }

        public C8255b setLikeAnimation(String str) {
            copyOnWrite();
            ((LikeConfig) this.instance).setLikeAnimation(str);
            return this;
        }

        public C8255b setLikeAnimationBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeConfig) this.instance).setLikeAnimationBytes(byteString);
            return this;
        }

        public C8255b setTripleLike(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((LikeConfig) this.instance).setTripleLike(upLikeImg);
            return this;
        }

        private C8255b() {
            super(LikeConfig.DEFAULT_INSTANCE);
        }

        public C8255b setTripleLike(UpLikeImg.Builder c8004b) {
            copyOnWrite();
            ((LikeConfig) this.instance).setTripleLike(c8004b.build());
            return this;
        }
    }

    static {
        LikeConfig likeConfig = new LikeConfig();
        DEFAULT_INSTANCE = likeConfig;
        GeneratedMessageLite.registerDefaultInstance(LikeConfig.class, likeConfig);
    }

    private LikeConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeAnimation() {
        this.likeAnimation_ = getDefaultInstance().getLikeAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripleLike() {
        this.tripleLike_ = null;
    }

    public static LikeConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static C8255b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeConfig> parser() {
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
    public void setTripleLike(UpLikeImg upLikeImg) {
        upLikeImg.getClass();
        this.tripleLike_ = upLikeImg;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C8254a c8254a = null;
        switch (C8254a.f18350xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeConfig();
            case 2:
                return new C8255b(c8254a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0208", new Object[]{"tripleLike_", "likeAnimation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeConfig.class) {
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

    public UpLikeImg getTripleLike() {
        UpLikeImg upLikeImg = this.tripleLike_;
        return upLikeImg == null ? UpLikeImg.getDefaultInstance() : upLikeImg;
    }

    public boolean hasTripleLike() {
        return this.tripleLike_ != null;
    }

    public static C8255b newBuilder(LikeConfig likeConfig) {
        return DEFAULT_INSTANCE.createBuilder(likeConfig);
    }

    public static LikeConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeConfig parseFrom(InputStream inputStream) throws IOException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
