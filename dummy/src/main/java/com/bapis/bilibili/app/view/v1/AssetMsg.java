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
public final class AssetMsg extends GeneratedMessageLite<AssetMsg, AssetMsg.Builder> implements MessageLiteOrBuilder {
    private static final AssetMsg DEFAULT_INSTANCE;
    public static final int DESC1_FIELD_NUMBER = 1;
    public static final int DESC2_FIELD_NUMBER = 2;
    private static volatile Parser<AssetMsg> PARSER;
    private String desc1_ = "";
    private String desc2_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.AssetMsg$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67131 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16689xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16689xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16689xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16689xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16689xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16689xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16689xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16689xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AssetMsg, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67131 c67131) {
            this();
        }

        public Builder clearDesc1() {
            copyOnWrite();
            ((AssetMsg) this.instance).clearDesc1();
            return this;
        }

        public Builder clearDesc2() {
            copyOnWrite();
            ((AssetMsg) this.instance).clearDesc2();
            return this;
        }

        public String getDesc1() {
            return ((AssetMsg) this.instance).getDesc1();
        }

        public ByteString getDesc1Bytes() {
            return ((AssetMsg) this.instance).getDesc1Bytes();
        }

        public String getDesc2() {
            return ((AssetMsg) this.instance).getDesc2();
        }

        public ByteString getDesc2Bytes() {
            return ((AssetMsg) this.instance).getDesc2Bytes();
        }

        public Builder setDesc1(String str) {
            copyOnWrite();
            ((AssetMsg) this.instance).setDesc1(str);
            return this;
        }

        public Builder setDesc1Bytes(ByteString byteString) {
            copyOnWrite();
            ((AssetMsg) this.instance).setDesc1Bytes(byteString);
            return this;
        }

        public Builder setDesc2(String str) {
            copyOnWrite();
            ((AssetMsg) this.instance).setDesc2(str);
            return this;
        }

        public Builder setDesc2Bytes(ByteString byteString) {
            copyOnWrite();
            ((AssetMsg) this.instance).setDesc2Bytes(byteString);
            return this;
        }

        private Builder() {
            super(AssetMsg.DEFAULT_INSTANCE);
        }
    }

    static {
        AssetMsg assetMsg = new AssetMsg();
        DEFAULT_INSTANCE = assetMsg;
        GeneratedMessageLite.registerDefaultInstance(AssetMsg.class, assetMsg);
    }

    private AssetMsg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc1() {
        this.desc1_ = getDefaultInstance().getDesc1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc2() {
        this.desc2_ = getDefaultInstance().getDesc2();
    }

    public static AssetMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AssetMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AssetMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssetMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AssetMsg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc1(String str) {
        str.getClass();
        this.desc1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc2(String str) {
        str.getClass();
        this.desc2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc2_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67131.f16689xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AssetMsg();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"desc1_", "desc2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AssetMsg> parser = PARSER;
                if (parser == null) {
                    synchronized (AssetMsg.class) {
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

    public String getDesc1() {
        return this.desc1_;
    }

    public ByteString getDesc1Bytes() {
        return ByteString.copyFromUtf8(this.desc1_);
    }

    public String getDesc2() {
        return this.desc2_;
    }

    public ByteString getDesc2Bytes() {
        return ByteString.copyFromUtf8(this.desc2_);
    }

    public static Builder newBuilder(AssetMsg assetMsg) {
        return DEFAULT_INSTANCE.createBuilder(assetMsg);
    }

    public static AssetMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AssetMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AssetMsg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AssetMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AssetMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AssetMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AssetMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AssetMsg parseFrom(InputStream inputStream) throws IOException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssetMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AssetMsg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AssetMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AssetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
