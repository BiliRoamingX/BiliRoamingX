package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class LikeAnimation extends GeneratedMessageLite<LikeAnimation, LikeAnimation.Builder> implements MessageLiteOrBuilder {
    private static final LikeAnimation DEFAULT_INSTANCE;
    public static final int LIKED_ICON_FIELD_NUMBER = 2;
    public static final int LIKE_ANIMATION_FIELD_NUMBER = 3;
    public static final int LIKE_ICON_FIELD_NUMBER = 1;
    private static volatile Parser<LikeAnimation> PARSER;
    private String likeIcon_ = "";
    private String likedIcon_ = "";
    private String likeAnimation_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.LikeAnimation$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67841 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16751xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16751xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16751xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16751xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16751xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16751xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16751xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16751xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LikeAnimation, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67841 c67841) {
            this();
        }

        public Builder clearLikeAnimation() {
            copyOnWrite();
            ((LikeAnimation) this.instance).clearLikeAnimation();
            return this;
        }

        public Builder clearLikeIcon() {
            copyOnWrite();
            ((LikeAnimation) this.instance).clearLikeIcon();
            return this;
        }

        public Builder clearLikedIcon() {
            copyOnWrite();
            ((LikeAnimation) this.instance).clearLikedIcon();
            return this;
        }

        public String getLikeAnimation() {
            return ((LikeAnimation) this.instance).getLikeAnimation();
        }

        public ByteString getLikeAnimationBytes() {
            return ((LikeAnimation) this.instance).getLikeAnimationBytes();
        }

        public String getLikeIcon() {
            return ((LikeAnimation) this.instance).getLikeIcon();
        }

        public ByteString getLikeIconBytes() {
            return ((LikeAnimation) this.instance).getLikeIconBytes();
        }

        public String getLikedIcon() {
            return ((LikeAnimation) this.instance).getLikedIcon();
        }

        public ByteString getLikedIconBytes() {
            return ((LikeAnimation) this.instance).getLikedIconBytes();
        }

        public Builder setLikeAnimation(String str) {
            copyOnWrite();
            ((LikeAnimation) this.instance).setLikeAnimation(str);
            return this;
        }

        public Builder setLikeAnimationBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeAnimation) this.instance).setLikeAnimationBytes(byteString);
            return this;
        }

        public Builder setLikeIcon(String str) {
            copyOnWrite();
            ((LikeAnimation) this.instance).setLikeIcon(str);
            return this;
        }

        public Builder setLikeIconBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeAnimation) this.instance).setLikeIconBytes(byteString);
            return this;
        }

        public Builder setLikedIcon(String str) {
            copyOnWrite();
            ((LikeAnimation) this.instance).setLikedIcon(str);
            return this;
        }

        public Builder setLikedIconBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeAnimation) this.instance).setLikedIconBytes(byteString);
            return this;
        }

        private Builder() {
            super(LikeAnimation.DEFAULT_INSTANCE);
        }
    }

    static {
        LikeAnimation likeAnimation = new LikeAnimation();
        DEFAULT_INSTANCE = likeAnimation;
        GeneratedMessageLite.registerDefaultInstance(LikeAnimation.class, likeAnimation);
    }

    private LikeAnimation() {
    }

    public void clearLikeAnimation() {
        this.likeAnimation_ = getDefaultInstance().getLikeAnimation();
    }

    public void clearLikeIcon() {
        this.likeIcon_ = getDefaultInstance().getLikeIcon();
    }

    public void clearLikedIcon() {
        this.likedIcon_ = getDefaultInstance().getLikedIcon();
    }

    public static LikeAnimation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeAnimation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeAnimation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setLikeAnimation(String str) {
        str.getClass();
        this.likeAnimation_ = str;
    }

    public void setLikeAnimationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.likeAnimation_ = byteString.toStringUtf8();
    }

    public void setLikeIcon(String str) {
        str.getClass();
        this.likeIcon_ = str;
    }

    public void setLikeIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.likeIcon_ = byteString.toStringUtf8();
    }

    public void setLikedIcon(String str) {
        str.getClass();
        this.likedIcon_ = str;
    }

    public void setLikedIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.likedIcon_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67841.f16751xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeAnimation();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"likeIcon_", "likedIcon_", "likeAnimation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeAnimation> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeAnimation.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public String getLikeIcon() {
        return this.likeIcon_;
    }

    public ByteString getLikeIconBytes() {
        return ByteString.copyFromUtf8(this.likeIcon_);
    }

    public String getLikedIcon() {
        return this.likedIcon_;
    }

    public ByteString getLikedIconBytes() {
        return ByteString.copyFromUtf8(this.likedIcon_);
    }

    public static Builder newBuilder(LikeAnimation likeAnimation) {
        return DEFAULT_INSTANCE.createBuilder(likeAnimation);
    }

    public static LikeAnimation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeAnimation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeAnimation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeAnimation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeAnimation parseFrom(InputStream inputStream) throws IOException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeAnimation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeAnimation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeAnimation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
