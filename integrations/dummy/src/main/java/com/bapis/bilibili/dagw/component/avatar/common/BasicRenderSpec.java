package com.bapis.bilibili.dagw.component.avatar.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class BasicRenderSpec extends GeneratedMessageLite<BasicRenderSpec, BasicRenderSpec.Builder> implements BasicRenderSpecOrBuilder {
    private static final BasicRenderSpec DEFAULT_INSTANCE;
    public static final int OPACITY_FIELD_NUMBER = 1;
    private static volatile Parser<BasicRenderSpec> PARSER;
    private double opacity_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.BasicRenderSpec$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75121 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17361xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17361xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17361xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17361xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17361xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17361xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17361xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17361xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BasicRenderSpec, Builder> implements BasicRenderSpecOrBuilder {
        /* synthetic */ Builder(C75121 c75121) {
            this();
        }

        public Builder clearOpacity() {
            copyOnWrite();
            ((BasicRenderSpec) this.instance).clearOpacity();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.BasicRenderSpecOrBuilder
        public double getOpacity() {
            return ((BasicRenderSpec) this.instance).getOpacity();
        }

        public Builder setOpacity(double d) {
            copyOnWrite();
            ((BasicRenderSpec) this.instance).setOpacity(d);
            return this;
        }

        private Builder() {
            super(BasicRenderSpec.DEFAULT_INSTANCE);
        }
    }

    static {
        BasicRenderSpec basicRenderSpec = new BasicRenderSpec();
        DEFAULT_INSTANCE = basicRenderSpec;
        GeneratedMessageLite.registerDefaultInstance(BasicRenderSpec.class, basicRenderSpec);
    }

    private BasicRenderSpec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpacity() {
        this.opacity_ = 0.0d;
    }

    public static BasicRenderSpec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BasicRenderSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BasicRenderSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BasicRenderSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BasicRenderSpec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpacity(double d) {
        this.opacity_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75121.f17361xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BasicRenderSpec();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"opacity_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BasicRenderSpec> parser = PARSER;
                if (parser == null) {
                    synchronized (BasicRenderSpec.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.common.BasicRenderSpecOrBuilder
    public double getOpacity() {
        return this.opacity_;
    }

    public static Builder newBuilder(BasicRenderSpec basicRenderSpec) {
        return DEFAULT_INSTANCE.createBuilder(basicRenderSpec);
    }

    public static BasicRenderSpec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BasicRenderSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BasicRenderSpec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BasicRenderSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BasicRenderSpec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BasicRenderSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BasicRenderSpec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BasicRenderSpec parseFrom(InputStream inputStream) throws IOException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BasicRenderSpec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BasicRenderSpec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BasicRenderSpec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BasicRenderSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
