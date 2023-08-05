package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.ResourceSource;
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
public final class ResAnimation extends GeneratedMessageLite<ResAnimation, ResAnimation.Builder> implements MessageLiteOrBuilder {
    private static final ResAnimation DEFAULT_INSTANCE;
    private static volatile Parser<ResAnimation> PARSER = null;
    public static final int WEBP_SRC_FIELD_NUMBER = 1;
    private ResourceSource webpSrc_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.ResAnimation$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75361 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17378xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17378xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17378xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17378xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17378xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17378xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17378xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17378xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ResAnimation, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75361 c75361) {
            this();
        }

        public Builder clearWebpSrc() {
            copyOnWrite();
            ((ResAnimation) this.instance).clearWebpSrc();
            return this;
        }

        public ResourceSource getWebpSrc() {
            return ((ResAnimation) this.instance).getWebpSrc();
        }

        public boolean hasWebpSrc() {
            return ((ResAnimation) this.instance).hasWebpSrc();
        }

        public Builder mergeWebpSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((ResAnimation) this.instance).mergeWebpSrc(resourceSource);
            return this;
        }

        public Builder setWebpSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((ResAnimation) this.instance).setWebpSrc(resourceSource);
            return this;
        }

        private Builder() {
            super(ResAnimation.DEFAULT_INSTANCE);
        }

        public Builder setWebpSrc(ResourceSource.Builder builder) {
            copyOnWrite();
            ((ResAnimation) this.instance).setWebpSrc(builder.build());
            return this;
        }
    }

    static {
        ResAnimation resAnimation = new ResAnimation();
        DEFAULT_INSTANCE = resAnimation;
        GeneratedMessageLite.registerDefaultInstance(ResAnimation.class, resAnimation);
    }

    private ResAnimation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebpSrc() {
        this.webpSrc_ = null;
    }

    public static ResAnimation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebpSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        ResourceSource resourceSource2 = this.webpSrc_;
        if (resourceSource2 != null && resourceSource2 != ResourceSource.getDefaultInstance()) {
            this.webpSrc_ = ResourceSource.newBuilder(this.webpSrc_).mergeFrom((ResourceSource) resourceSource).buildPartial();
        } else {
            this.webpSrc_ = resourceSource;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResAnimation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResAnimation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebpSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        this.webpSrc_ = resourceSource;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75361.f17378xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ResAnimation();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"webpSrc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResAnimation> parser = PARSER;
                if (parser == null) {
                    synchronized (ResAnimation.class) {
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

    public ResourceSource getWebpSrc() {
        ResourceSource resourceSource = this.webpSrc_;
        return resourceSource == null ? ResourceSource.getDefaultInstance() : resourceSource;
    }

    public boolean hasWebpSrc() {
        return this.webpSrc_ != null;
    }

    public static Builder newBuilder(ResAnimation resAnimation) {
        return DEFAULT_INSTANCE.createBuilder(resAnimation);
    }

    public static ResAnimation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResAnimation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResAnimation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResAnimation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResAnimation parseFrom(InputStream inputStream) throws IOException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResAnimation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResAnimation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResAnimation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
