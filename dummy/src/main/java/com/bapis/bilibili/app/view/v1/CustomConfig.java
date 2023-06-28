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
public final class CustomConfig extends GeneratedMessageLite<CustomConfig, CustomConfig.Builder> implements MessageLiteOrBuilder {
    private static final CustomConfig DEFAULT_INSTANCE;
    private static volatile Parser<CustomConfig> PARSER = null;
    public static final int REDIRECT_URL_FIELD_NUMBER = 1;
    private String redirectUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CustomConfig$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67511 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16725xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16725xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16725xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16725xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16725xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16725xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16725xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16725xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CustomConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67511 c67511) {
            this();
        }

        public Builder clearRedirectUrl() {
            copyOnWrite();
            ((CustomConfig) this.instance).clearRedirectUrl();
            return this;
        }

        public String getRedirectUrl() {
            return ((CustomConfig) this.instance).getRedirectUrl();
        }

        public ByteString getRedirectUrlBytes() {
            return ((CustomConfig) this.instance).getRedirectUrlBytes();
        }

        public Builder setRedirectUrl(String str) {
            copyOnWrite();
            ((CustomConfig) this.instance).setRedirectUrl(str);
            return this;
        }

        public Builder setRedirectUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((CustomConfig) this.instance).setRedirectUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(CustomConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        CustomConfig customConfig = new CustomConfig();
        DEFAULT_INSTANCE = customConfig;
        GeneratedMessageLite.registerDefaultInstance(CustomConfig.class, customConfig);
    }

    private CustomConfig() {
    }

    public void clearRedirectUrl() {
        this.redirectUrl_ = getDefaultInstance().getRedirectUrl();
    }

    public static CustomConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CustomConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CustomConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CustomConfig> parser() {
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67511.f16725xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CustomConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"redirectUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CustomConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (CustomConfig.class) {
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

    public String getRedirectUrl() {
        return this.redirectUrl_;
    }

    public ByteString getRedirectUrlBytes() {
        return ByteString.copyFromUtf8(this.redirectUrl_);
    }

    public static Builder newBuilder(CustomConfig customConfig) {
        return DEFAULT_INSTANCE.createBuilder(customConfig);
    }

    public static CustomConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CustomConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CustomConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CustomConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CustomConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CustomConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CustomConfig parseFrom(InputStream inputStream) throws IOException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CustomConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CustomConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
