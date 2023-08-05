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
public final class ResImage extends GeneratedMessageLite<ResImage, ResImage.Builder> implements MessageLiteOrBuilder {
    private static final ResImage DEFAULT_INSTANCE;
    public static final int IMAGE_SRC_FIELD_NUMBER = 1;
    private static volatile Parser<ResImage> PARSER;
    private ResourceSource imageSrc_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.ResImage$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75371 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17379xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17379xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17379xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17379xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17379xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17379xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17379xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17379xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ResImage, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75371 c75371) {
            this();
        }

        public Builder clearImageSrc() {
            copyOnWrite();
            ((ResImage) this.instance).clearImageSrc();
            return this;
        }

        public ResourceSource getImageSrc() {
            return ((ResImage) this.instance).getImageSrc();
        }

        public boolean hasImageSrc() {
            return ((ResImage) this.instance).hasImageSrc();
        }

        public Builder mergeImageSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((ResImage) this.instance).mergeImageSrc(resourceSource);
            return this;
        }

        public Builder setImageSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((ResImage) this.instance).setImageSrc(resourceSource);
            return this;
        }

        private Builder() {
            super(ResImage.DEFAULT_INSTANCE);
        }

        public Builder setImageSrc(ResourceSource.Builder builder) {
            copyOnWrite();
            ((ResImage) this.instance).setImageSrc(builder.build());
            return this;
        }
    }

    static {
        ResImage resImage = new ResImage();
        DEFAULT_INSTANCE = resImage;
        GeneratedMessageLite.registerDefaultInstance(ResImage.class, resImage);
    }

    private ResImage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageSrc() {
        this.imageSrc_ = null;
    }

    public static ResImage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImageSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        ResourceSource resourceSource2 = this.imageSrc_;
        if (resourceSource2 != null && resourceSource2 != ResourceSource.getDefaultInstance()) {
            this.imageSrc_ = ResourceSource.newBuilder(this.imageSrc_).mergeFrom((ResourceSource) resourceSource).buildPartial();
        } else {
            this.imageSrc_ = resourceSource;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResImage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResImage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResImage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResImage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        this.imageSrc_ = resourceSource;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75371.f17379xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ResImage();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"imageSrc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResImage> parser = PARSER;
                if (parser == null) {
                    synchronized (ResImage.class) {
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

    public ResourceSource getImageSrc() {
        ResourceSource resourceSource = this.imageSrc_;
        return resourceSource == null ? ResourceSource.getDefaultInstance() : resourceSource;
    }

    public boolean hasImageSrc() {
        return this.imageSrc_ != null;
    }

    public static Builder newBuilder(ResImage resImage) {
        return DEFAULT_INSTANCE.createBuilder(resImage);
    }

    public static ResImage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResImage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResImage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResImage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResImage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResImage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResImage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResImage parseFrom(InputStream inputStream) throws IOException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResImage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResImage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResImage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResImage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
