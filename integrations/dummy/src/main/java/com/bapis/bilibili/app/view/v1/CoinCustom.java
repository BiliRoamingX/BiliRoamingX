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
public final class CoinCustom extends GeneratedMessageLite<CoinCustom, CoinCustom.Builder> implements MessageLiteOrBuilder {
    private static final CoinCustom DEFAULT_INSTANCE;
    private static volatile Parser<CoinCustom> PARSER = null;
    public static final int TOAST_FIELD_NUMBER = 1;
    private String toast_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CoinCustom$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67401 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16714xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16714xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16714xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16714xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16714xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16714xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16714xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16714xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CoinCustom, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67401 c67401) {
            this();
        }

        public Builder clearToast() {
            copyOnWrite();
            ((CoinCustom) this.instance).clearToast();
            return this;
        }

        public String getToast() {
            return ((CoinCustom) this.instance).getToast();
        }

        public ByteString getToastBytes() {
            return ((CoinCustom) this.instance).getToastBytes();
        }

        public Builder setToast(String str) {
            copyOnWrite();
            ((CoinCustom) this.instance).setToast(str);
            return this;
        }

        public Builder setToastBytes(ByteString byteString) {
            copyOnWrite();
            ((CoinCustom) this.instance).setToastBytes(byteString);
            return this;
        }

        private Builder() {
            super(CoinCustom.DEFAULT_INSTANCE);
        }
    }

    static {
        CoinCustom coinCustom = new CoinCustom();
        DEFAULT_INSTANCE = coinCustom;
        GeneratedMessageLite.registerDefaultInstance(CoinCustom.class, coinCustom);
    }

    private CoinCustom() {
    }

    public void clearToast() {
        this.toast_ = getDefaultInstance().getToast();
    }

    public static CoinCustom getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CoinCustom parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CoinCustom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CoinCustom parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CoinCustom> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setToast(String str) {
        str.getClass();
        this.toast_ = str;
    }

    public void setToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toast_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67401.f16714xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CoinCustom();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"toast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CoinCustom> parser = PARSER;
                if (parser == null) {
                    synchronized (CoinCustom.class) {
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

    public String getToast() {
        return this.toast_;
    }

    public ByteString getToastBytes() {
        return ByteString.copyFromUtf8(this.toast_);
    }

    public static Builder newBuilder(CoinCustom coinCustom) {
        return DEFAULT_INSTANCE.createBuilder(coinCustom);
    }

    public static CoinCustom parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CoinCustom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CoinCustom parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CoinCustom parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CoinCustom parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CoinCustom parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CoinCustom parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CoinCustom parseFrom(InputStream inputStream) throws IOException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CoinCustom parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CoinCustom parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CoinCustom parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CoinCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
