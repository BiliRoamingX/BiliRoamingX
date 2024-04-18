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
public final class ResNativeDraw extends GeneratedMessageLite<ResNativeDraw, ResNativeDraw.Builder> implements MessageLiteOrBuilder {
    private static final ResNativeDraw DEFAULT_INSTANCE;
    public static final int DRAW_SRC_FIELD_NUMBER = 1;
    private static volatile Parser<ResNativeDraw> PARSER;
    private ResourceSource drawSrc_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.ResNativeDraw$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75381 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17380xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17380xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17380xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17380xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17380xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17380xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17380xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17380xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ResNativeDraw, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75381 c75381) {
            this();
        }

        public Builder clearDrawSrc() {
            copyOnWrite();
            ((ResNativeDraw) this.instance).clearDrawSrc();
            return this;
        }

        public ResourceSource getDrawSrc() {
            return ((ResNativeDraw) this.instance).getDrawSrc();
        }

        public boolean hasDrawSrc() {
            return ((ResNativeDraw) this.instance).hasDrawSrc();
        }

        public Builder mergeDrawSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((ResNativeDraw) this.instance).mergeDrawSrc(resourceSource);
            return this;
        }

        public Builder setDrawSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((ResNativeDraw) this.instance).setDrawSrc(resourceSource);
            return this;
        }

        private Builder() {
            super(ResNativeDraw.DEFAULT_INSTANCE);
        }

        public Builder setDrawSrc(ResourceSource.Builder builder) {
            copyOnWrite();
            ((ResNativeDraw) this.instance).setDrawSrc(builder.build());
            return this;
        }
    }

    static {
        ResNativeDraw resNativeDraw = new ResNativeDraw();
        DEFAULT_INSTANCE = resNativeDraw;
        GeneratedMessageLite.registerDefaultInstance(ResNativeDraw.class, resNativeDraw);
    }

    private ResNativeDraw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrawSrc() {
        this.drawSrc_ = null;
    }

    public static ResNativeDraw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDrawSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        ResourceSource resourceSource2 = this.drawSrc_;
        if (resourceSource2 != null && resourceSource2 != ResourceSource.getDefaultInstance()) {
            this.drawSrc_ = ResourceSource.newBuilder(this.drawSrc_).mergeFrom((ResourceSource) resourceSource).buildPartial();
        } else {
            this.drawSrc_ = resourceSource;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResNativeDraw parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResNativeDraw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResNativeDraw parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResNativeDraw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        this.drawSrc_ = resourceSource;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75381.f17380xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ResNativeDraw();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"drawSrc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResNativeDraw> parser = PARSER;
                if (parser == null) {
                    synchronized (ResNativeDraw.class) {
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

    public ResourceSource getDrawSrc() {
        ResourceSource resourceSource = this.drawSrc_;
        return resourceSource == null ? ResourceSource.getDefaultInstance() : resourceSource;
    }

    public boolean hasDrawSrc() {
        return this.drawSrc_ != null;
    }

    public static Builder newBuilder(ResNativeDraw resNativeDraw) {
        return DEFAULT_INSTANCE.createBuilder(resNativeDraw);
    }

    public static ResNativeDraw parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResNativeDraw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResNativeDraw parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResNativeDraw parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResNativeDraw parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResNativeDraw parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResNativeDraw parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResNativeDraw parseFrom(InputStream inputStream) throws IOException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResNativeDraw parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResNativeDraw parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResNativeDraw parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResNativeDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
