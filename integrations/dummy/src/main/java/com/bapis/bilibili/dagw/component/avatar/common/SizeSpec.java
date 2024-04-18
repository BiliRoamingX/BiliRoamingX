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
public final class SizeSpec extends GeneratedMessageLite<SizeSpec, SizeSpec.Builder> implements SizeSpecOrBuilder {
    private static final SizeSpec DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<SizeSpec> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private double height_;
    private double width_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.SizeSpec$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17370xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17370xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17370xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17370xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17370xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17370xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17370xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17370xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SizeSpec, Builder> implements SizeSpecOrBuilder {
        /* synthetic */ Builder(C75261 c75261) {
            this();
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((SizeSpec) this.instance).clearHeight();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((SizeSpec) this.instance).clearWidth();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.SizeSpecOrBuilder
        public double getHeight() {
            return ((SizeSpec) this.instance).getHeight();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.SizeSpecOrBuilder
        public double getWidth() {
            return ((SizeSpec) this.instance).getWidth();
        }

        public Builder setHeight(double d) {
            copyOnWrite();
            ((SizeSpec) this.instance).setHeight(d);
            return this;
        }

        public Builder setWidth(double d) {
            copyOnWrite();
            ((SizeSpec) this.instance).setWidth(d);
            return this;
        }

        private Builder() {
            super(SizeSpec.DEFAULT_INSTANCE);
        }
    }

    static {
        SizeSpec sizeSpec = new SizeSpec();
        DEFAULT_INSTANCE = sizeSpec;
        GeneratedMessageLite.registerDefaultInstance(SizeSpec.class, sizeSpec);
    }

    private SizeSpec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0.0d;
    }

    public static SizeSpec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SizeSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SizeSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SizeSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SizeSpec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(double d) {
        this.height_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(double d) {
        this.width_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75261.f17370xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SizeSpec();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SizeSpec> parser = PARSER;
                if (parser == null) {
                    synchronized (SizeSpec.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.common.SizeSpecOrBuilder
    public double getHeight() {
        return this.height_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.SizeSpecOrBuilder
    public double getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(SizeSpec sizeSpec) {
        return DEFAULT_INSTANCE.createBuilder(sizeSpec);
    }

    public static SizeSpec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SizeSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SizeSpec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SizeSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SizeSpec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SizeSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SizeSpec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SizeSpec parseFrom(InputStream inputStream) throws IOException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SizeSpec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SizeSpec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SizeSpec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
