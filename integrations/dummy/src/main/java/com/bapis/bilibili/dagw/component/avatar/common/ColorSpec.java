package com.bapis.bilibili.dagw.component.avatar.common;

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
public final class ColorSpec extends GeneratedMessageLite<ColorSpec, ColorSpec.Builder> implements MessageLiteOrBuilder {
    public static final int ARGB_FIELD_NUMBER = 1;
    private static final ColorSpec DEFAULT_INSTANCE;
    private static volatile Parser<ColorSpec> PARSER;
    private String argb_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.ColorSpec$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75141 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17363xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17363xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17363xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17363xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17363xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17363xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17363xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17363xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ColorSpec, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75141 c75141) {
            this();
        }

        public Builder clearArgb() {
            copyOnWrite();
            ((ColorSpec) this.instance).clearArgb();
            return this;
        }

        public String getArgb() {
            return ((ColorSpec) this.instance).getArgb();
        }

        public ByteString getArgbBytes() {
            return ((ColorSpec) this.instance).getArgbBytes();
        }

        public Builder setArgb(String str) {
            copyOnWrite();
            ((ColorSpec) this.instance).setArgb(str);
            return this;
        }

        public Builder setArgbBytes(ByteString byteString) {
            copyOnWrite();
            ((ColorSpec) this.instance).setArgbBytes(byteString);
            return this;
        }

        private Builder() {
            super(ColorSpec.DEFAULT_INSTANCE);
        }
    }

    static {
        ColorSpec colorSpec = new ColorSpec();
        DEFAULT_INSTANCE = colorSpec;
        GeneratedMessageLite.registerDefaultInstance(ColorSpec.class, colorSpec);
    }

    private ColorSpec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArgb() {
        this.argb_ = getDefaultInstance().getArgb();
    }

    public static ColorSpec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ColorSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ColorSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ColorSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ColorSpec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgb(String str) {
        str.getClass();
        this.argb_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgbBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.argb_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75141.f17363xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ColorSpec();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"argb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ColorSpec> parser = PARSER;
                if (parser == null) {
                    synchronized (ColorSpec.class) {
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

    public String getArgb() {
        return this.argb_;
    }

    public ByteString getArgbBytes() {
        return ByteString.copyFromUtf8(this.argb_);
    }

    public static Builder newBuilder(ColorSpec colorSpec) {
        return DEFAULT_INSTANCE.createBuilder(colorSpec);
    }

    public static ColorSpec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ColorSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ColorSpec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ColorSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ColorSpec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ColorSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ColorSpec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ColorSpec parseFrom(InputStream inputStream) throws IOException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ColorSpec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ColorSpec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ColorSpec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ColorSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
