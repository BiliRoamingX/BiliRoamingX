package com.bapis.bilibili.app.viewunite.common;

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
public final class CoinExtend extends GeneratedMessageLite<CoinExtend, CoinExtend.Builder> implements MessageLiteOrBuilder {
    public static final int COIN_APP_ICON_1_FIELD_NUMBER = 2;
    public static final int COIN_APP_ICON_2_FIELD_NUMBER = 3;
    public static final int COIN_APP_ICON_3_FIELD_NUMBER = 4;
    public static final int COIN_APP_ICON_4_FIELD_NUMBER = 5;
    public static final int COIN_APP_ZIP_ICON_FIELD_NUMBER = 1;
    private static final CoinExtend DEFAULT_INSTANCE;
    private static volatile Parser<CoinExtend> PARSER;
    private String coinAppZipIcon_ = "";
    private String coinAppIcon1_ = "";
    private String coinAppIcon2_ = "";
    private String coinAppIcon3_ = "";
    private String coinAppIcon4_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.CoinExtend$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16975xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16975xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16975xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16975xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16975xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16975xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16975xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16975xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CoinExtend, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69881 c69881) {
            this();
        }

        public Builder clearCoinAppIcon1() {
            copyOnWrite();
            ((CoinExtend) this.instance).clearCoinAppIcon1();
            return this;
        }

        public Builder clearCoinAppIcon2() {
            copyOnWrite();
            ((CoinExtend) this.instance).clearCoinAppIcon2();
            return this;
        }

        public Builder clearCoinAppIcon3() {
            copyOnWrite();
            ((CoinExtend) this.instance).clearCoinAppIcon3();
            return this;
        }

        public Builder clearCoinAppIcon4() {
            copyOnWrite();
            ((CoinExtend) this.instance).clearCoinAppIcon4();
            return this;
        }

        public Builder clearCoinAppZipIcon() {
            copyOnWrite();
            ((CoinExtend) this.instance).clearCoinAppZipIcon();
            return this;
        }

        public String getCoinAppIcon1() {
            return ((CoinExtend) this.instance).getCoinAppIcon1();
        }

        public ByteString getCoinAppIcon1Bytes() {
            return ((CoinExtend) this.instance).getCoinAppIcon1Bytes();
        }

        public String getCoinAppIcon2() {
            return ((CoinExtend) this.instance).getCoinAppIcon2();
        }

        public ByteString getCoinAppIcon2Bytes() {
            return ((CoinExtend) this.instance).getCoinAppIcon2Bytes();
        }

        public String getCoinAppIcon3() {
            return ((CoinExtend) this.instance).getCoinAppIcon3();
        }

        public ByteString getCoinAppIcon3Bytes() {
            return ((CoinExtend) this.instance).getCoinAppIcon3Bytes();
        }

        public String getCoinAppIcon4() {
            return ((CoinExtend) this.instance).getCoinAppIcon4();
        }

        public ByteString getCoinAppIcon4Bytes() {
            return ((CoinExtend) this.instance).getCoinAppIcon4Bytes();
        }

        public String getCoinAppZipIcon() {
            return ((CoinExtend) this.instance).getCoinAppZipIcon();
        }

        public ByteString getCoinAppZipIconBytes() {
            return ((CoinExtend) this.instance).getCoinAppZipIconBytes();
        }

        public Builder setCoinAppIcon1(String str) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon1(str);
            return this;
        }

        public Builder setCoinAppIcon1Bytes(ByteString byteString) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon1Bytes(byteString);
            return this;
        }

        public Builder setCoinAppIcon2(String str) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon2(str);
            return this;
        }

        public Builder setCoinAppIcon2Bytes(ByteString byteString) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon2Bytes(byteString);
            return this;
        }

        public Builder setCoinAppIcon3(String str) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon3(str);
            return this;
        }

        public Builder setCoinAppIcon3Bytes(ByteString byteString) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon3Bytes(byteString);
            return this;
        }

        public Builder setCoinAppIcon4(String str) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon4(str);
            return this;
        }

        public Builder setCoinAppIcon4Bytes(ByteString byteString) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppIcon4Bytes(byteString);
            return this;
        }

        public Builder setCoinAppZipIcon(String str) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppZipIcon(str);
            return this;
        }

        public Builder setCoinAppZipIconBytes(ByteString byteString) {
            copyOnWrite();
            ((CoinExtend) this.instance).setCoinAppZipIconBytes(byteString);
            return this;
        }

        private Builder() {
            super(CoinExtend.DEFAULT_INSTANCE);
        }
    }

    static {
        CoinExtend coinExtend = new CoinExtend();
        DEFAULT_INSTANCE = coinExtend;
        GeneratedMessageLite.registerDefaultInstance(CoinExtend.class, coinExtend);
    }

    private CoinExtend() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinAppIcon1() {
        this.coinAppIcon1_ = getDefaultInstance().getCoinAppIcon1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinAppIcon2() {
        this.coinAppIcon2_ = getDefaultInstance().getCoinAppIcon2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinAppIcon3() {
        this.coinAppIcon3_ = getDefaultInstance().getCoinAppIcon3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinAppIcon4() {
        this.coinAppIcon4_ = getDefaultInstance().getCoinAppIcon4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinAppZipIcon() {
        this.coinAppZipIcon_ = getDefaultInstance().getCoinAppZipIcon();
    }

    public static CoinExtend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CoinExtend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CoinExtend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CoinExtend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CoinExtend> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon1(String str) {
        str.getClass();
        this.coinAppIcon1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coinAppIcon1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon2(String str) {
        str.getClass();
        this.coinAppIcon2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coinAppIcon2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon3(String str) {
        str.getClass();
        this.coinAppIcon3_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon3Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coinAppIcon3_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon4(String str) {
        str.getClass();
        this.coinAppIcon4_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppIcon4Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coinAppIcon4_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppZipIcon(String str) {
        str.getClass();
        this.coinAppZipIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinAppZipIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coinAppZipIcon_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69881.f16975xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CoinExtend();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208", new Object[]{"coinAppZipIcon_", "coinAppIcon1_", "coinAppIcon2_", "coinAppIcon3_", "coinAppIcon4_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CoinExtend> parser = PARSER;
                if (parser == null) {
                    synchronized (CoinExtend.class) {
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

    public String getCoinAppIcon1() {
        return this.coinAppIcon1_;
    }

    public ByteString getCoinAppIcon1Bytes() {
        return ByteString.copyFromUtf8(this.coinAppIcon1_);
    }

    public String getCoinAppIcon2() {
        return this.coinAppIcon2_;
    }

    public ByteString getCoinAppIcon2Bytes() {
        return ByteString.copyFromUtf8(this.coinAppIcon2_);
    }

    public String getCoinAppIcon3() {
        return this.coinAppIcon3_;
    }

    public ByteString getCoinAppIcon3Bytes() {
        return ByteString.copyFromUtf8(this.coinAppIcon3_);
    }

    public String getCoinAppIcon4() {
        return this.coinAppIcon4_;
    }

    public ByteString getCoinAppIcon4Bytes() {
        return ByteString.copyFromUtf8(this.coinAppIcon4_);
    }

    public String getCoinAppZipIcon() {
        return this.coinAppZipIcon_;
    }

    public ByteString getCoinAppZipIconBytes() {
        return ByteString.copyFromUtf8(this.coinAppZipIcon_);
    }

    public static Builder newBuilder(CoinExtend coinExtend) {
        return DEFAULT_INSTANCE.createBuilder(coinExtend);
    }

    public static CoinExtend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CoinExtend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CoinExtend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CoinExtend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CoinExtend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CoinExtend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CoinExtend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CoinExtend parseFrom(InputStream inputStream) throws IOException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CoinExtend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CoinExtend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CoinExtend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CoinExtend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
