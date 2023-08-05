package com.bapis.bilibili.app.viewunite.v1;

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
public final class ECodeConfig extends GeneratedMessageLite<ECodeConfig, ECodeConfig.Builder> implements MessageLiteOrBuilder {
    private static final ECodeConfig DEFAULT_INSTANCE;
    private static volatile Parser<ECodeConfig> PARSER = null;
    public static final int REDIRECT_URL_FIELD_NUMBER = 1;
    private String redirectUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ECodeConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17107xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17107xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ECodeConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71331 c71331) {
            this();
        }

        public Builder clearRedirectUrl() {
            copyOnWrite();
            ((ECodeConfig) this.instance).clearRedirectUrl();
            return this;
        }

        public String getRedirectUrl() {
            return ((ECodeConfig) this.instance).getRedirectUrl();
        }

        public ByteString getRedirectUrlBytes() {
            return ((ECodeConfig) this.instance).getRedirectUrlBytes();
        }

        public Builder setRedirectUrl(String str) {
            copyOnWrite();
            ((ECodeConfig) this.instance).setRedirectUrl(str);
            return this;
        }

        public Builder setRedirectUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ECodeConfig) this.instance).setRedirectUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(ECodeConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        ECodeConfig eCodeConfig = new ECodeConfig();
        DEFAULT_INSTANCE = eCodeConfig;
        GeneratedMessageLite.registerDefaultInstance(ECodeConfig.class, eCodeConfig);
    }

    private ECodeConfig() {
    }

    public void clearRedirectUrl() {
        this.redirectUrl_ = getDefaultInstance().getRedirectUrl();
    }

    public static ECodeConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ECodeConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ECodeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ECodeConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ECodeConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setRedirectUrl(String str) {
        str.getClass();
        this.redirectUrl_ = str;
    }

    public void setRedirectUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.redirectUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71331.f17107xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ECodeConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"redirectUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ECodeConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (ECodeConfig.class) {
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

    public String getRedirectUrl() {
        return this.redirectUrl_;
    }

    public ByteString getRedirectUrlBytes() {
        return ByteString.copyFromUtf8(this.redirectUrl_);
    }

    public static Builder newBuilder(ECodeConfig eCodeConfig) {
        return DEFAULT_INSTANCE.createBuilder(eCodeConfig);
    }

    public static ECodeConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ECodeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ECodeConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ECodeConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ECodeConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ECodeConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ECodeConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ECodeConfig parseFrom(InputStream inputStream) throws IOException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ECodeConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ECodeConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ECodeConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ECodeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
