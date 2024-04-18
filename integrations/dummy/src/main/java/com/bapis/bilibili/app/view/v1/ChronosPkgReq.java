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
public final class ChronosPkgReq extends GeneratedMessageLite<ChronosPkgReq, ChronosPkgReq.Builder> implements MessageLiteOrBuilder {
    private static final ChronosPkgReq DEFAULT_INSTANCE;
    public static final int ENGINE_VERSION_FIELD_NUMBER = 2;
    public static final int MESSAGE_PROTOCOL_FIELD_NUMBER = 3;
    private static volatile Parser<ChronosPkgReq> PARSER = null;
    public static final int SERVICE_KEY_FIELD_NUMBER = 1;
    private String serviceKey_ = "";
    private String engineVersion_ = "";
    private String messageProtocol_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ChronosPkgReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67351 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16709xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16709xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16709xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16709xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16709xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16709xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16709xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16709xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ChronosPkgReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67351 c67351) {
            this();
        }

        public Builder clearEngineVersion() {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).clearEngineVersion();
            return this;
        }

        public Builder clearMessageProtocol() {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).clearMessageProtocol();
            return this;
        }

        public Builder clearServiceKey() {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).clearServiceKey();
            return this;
        }

        public String getEngineVersion() {
            return ((ChronosPkgReq) this.instance).getEngineVersion();
        }

        public ByteString getEngineVersionBytes() {
            return ((ChronosPkgReq) this.instance).getEngineVersionBytes();
        }

        public String getMessageProtocol() {
            return ((ChronosPkgReq) this.instance).getMessageProtocol();
        }

        public ByteString getMessageProtocolBytes() {
            return ((ChronosPkgReq) this.instance).getMessageProtocolBytes();
        }

        public String getServiceKey() {
            return ((ChronosPkgReq) this.instance).getServiceKey();
        }

        public ByteString getServiceKeyBytes() {
            return ((ChronosPkgReq) this.instance).getServiceKeyBytes();
        }

        public Builder setEngineVersion(String str) {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).setEngineVersion(str);
            return this;
        }

        public Builder setEngineVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).setEngineVersionBytes(byteString);
            return this;
        }

        public Builder setMessageProtocol(String str) {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).setMessageProtocol(str);
            return this;
        }

        public Builder setMessageProtocolBytes(ByteString byteString) {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).setMessageProtocolBytes(byteString);
            return this;
        }

        public Builder setServiceKey(String str) {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).setServiceKey(str);
            return this;
        }

        public Builder setServiceKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ChronosPkgReq) this.instance).setServiceKeyBytes(byteString);
            return this;
        }

        private Builder() {
            super(ChronosPkgReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ChronosPkgReq chronosPkgReq = new ChronosPkgReq();
        DEFAULT_INSTANCE = chronosPkgReq;
        GeneratedMessageLite.registerDefaultInstance(ChronosPkgReq.class, chronosPkgReq);
    }

    private ChronosPkgReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEngineVersion() {
        this.engineVersion_ = getDefaultInstance().getEngineVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageProtocol() {
        this.messageProtocol_ = getDefaultInstance().getMessageProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceKey() {
        this.serviceKey_ = getDefaultInstance().getServiceKey();
    }

    public static ChronosPkgReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChronosPkgReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChronosPkgReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChronosPkgReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ChronosPkgReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEngineVersion(String str) {
        str.getClass();
        this.engineVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEngineVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.engineVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageProtocol(String str) {
        str.getClass();
        this.messageProtocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageProtocolBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.messageProtocol_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceKey(String str) {
        str.getClass();
        this.serviceKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.serviceKey_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67351.f16709xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ChronosPkgReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"serviceKey_", "engineVersion_", "messageProtocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChronosPkgReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ChronosPkgReq.class) {
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

    public String getEngineVersion() {
        return this.engineVersion_;
    }

    public ByteString getEngineVersionBytes() {
        return ByteString.copyFromUtf8(this.engineVersion_);
    }

    public String getMessageProtocol() {
        return this.messageProtocol_;
    }

    public ByteString getMessageProtocolBytes() {
        return ByteString.copyFromUtf8(this.messageProtocol_);
    }

    public String getServiceKey() {
        return this.serviceKey_;
    }

    public ByteString getServiceKeyBytes() {
        return ByteString.copyFromUtf8(this.serviceKey_);
    }

    public static Builder newBuilder(ChronosPkgReq chronosPkgReq) {
        return DEFAULT_INSTANCE.createBuilder(chronosPkgReq);
    }

    public static ChronosPkgReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChronosPkgReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChronosPkgReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ChronosPkgReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ChronosPkgReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChronosPkgReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChronosPkgReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChronosPkgReq parseFrom(InputStream inputStream) throws IOException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChronosPkgReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChronosPkgReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChronosPkgReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChronosPkgReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
