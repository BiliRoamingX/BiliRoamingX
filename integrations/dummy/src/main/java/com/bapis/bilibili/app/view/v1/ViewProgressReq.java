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
public final class ViewProgressReq extends GeneratedMessageLite<ViewProgressReq, ViewProgressReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 2;
    private static final ViewProgressReq DEFAULT_INSTANCE;
    public static final int ENGINE_VERSION_FIELD_NUMBER = 4;
    public static final int MESSAGE_PROTOCOL_FIELD_NUMBER = 5;
    private static volatile Parser<ViewProgressReq> PARSER = null;
    public static final int SERVICE_KEY_FIELD_NUMBER = 6;
    public static final int UP_MID_FIELD_NUMBER = 3;
    private long aid_;
    private long cid_;
    private String engineVersion_ = "";
    private String messageProtocol_ = "";
    private String serviceKey_ = "";
    private long upMid_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewProgressReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16856xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16856xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16856xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16856xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16856xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16856xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16856xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16856xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewProgressReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69031 c69031) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ViewProgressReq) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((ViewProgressReq) this.instance).clearCid();
            return this;
        }

        public Builder clearEngineVersion() {
            copyOnWrite();
            ((ViewProgressReq) this.instance).clearEngineVersion();
            return this;
        }

        public Builder clearMessageProtocol() {
            copyOnWrite();
            ((ViewProgressReq) this.instance).clearMessageProtocol();
            return this;
        }

        public Builder clearServiceKey() {
            copyOnWrite();
            ((ViewProgressReq) this.instance).clearServiceKey();
            return this;
        }

        public Builder clearUpMid() {
            copyOnWrite();
            ((ViewProgressReq) this.instance).clearUpMid();
            return this;
        }

        public long getAid() {
            return ((ViewProgressReq) this.instance).getAid();
        }

        public long getCid() {
            return ((ViewProgressReq) this.instance).getCid();
        }

        public String getEngineVersion() {
            return ((ViewProgressReq) this.instance).getEngineVersion();
        }

        public ByteString getEngineVersionBytes() {
            return ((ViewProgressReq) this.instance).getEngineVersionBytes();
        }

        public String getMessageProtocol() {
            return ((ViewProgressReq) this.instance).getMessageProtocol();
        }

        public ByteString getMessageProtocolBytes() {
            return ((ViewProgressReq) this.instance).getMessageProtocolBytes();
        }

        public String getServiceKey() {
            return ((ViewProgressReq) this.instance).getServiceKey();
        }

        public ByteString getServiceKeyBytes() {
            return ((ViewProgressReq) this.instance).getServiceKeyBytes();
        }

        public long getUpMid() {
            return ((ViewProgressReq) this.instance).getUpMid();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setCid(j);
            return this;
        }

        public Builder setEngineVersion(String str) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setEngineVersion(str);
            return this;
        }

        public Builder setEngineVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setEngineVersionBytes(byteString);
            return this;
        }

        public Builder setMessageProtocol(String str) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setMessageProtocol(str);
            return this;
        }

        public Builder setMessageProtocolBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setMessageProtocolBytes(byteString);
            return this;
        }

        public Builder setServiceKey(String str) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setServiceKey(str);
            return this;
        }

        public Builder setServiceKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setServiceKeyBytes(byteString);
            return this;
        }

        public Builder setUpMid(long j) {
            copyOnWrite();
            ((ViewProgressReq) this.instance).setUpMid(j);
            return this;
        }

        private Builder() {
            super(ViewProgressReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ViewProgressReq viewProgressReq = new ViewProgressReq();
        DEFAULT_INSTANCE = viewProgressReq;
        GeneratedMessageLite.registerDefaultInstance(ViewProgressReq.class, viewProgressReq);
    }

    private ViewProgressReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpMid() {
        this.upMid_ = 0L;
    }

    public static ViewProgressReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewProgressReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewProgressReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewProgressReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewProgressReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpMid(long j) {
        this.upMid_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69031.f16856xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewProgressReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"aid_", "cid_", "upMid_", "engineVersion_", "messageProtocol_", "serviceKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewProgressReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewProgressReq.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
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

    public long getUpMid() {
        return this.upMid_;
    }

    public static Builder newBuilder(ViewProgressReq viewProgressReq) {
        return DEFAULT_INSTANCE.createBuilder(viewProgressReq);
    }

    public static ViewProgressReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewProgressReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewProgressReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewProgressReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewProgressReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewProgressReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewProgressReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewProgressReq parseFrom(InputStream inputStream) throws IOException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewProgressReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewProgressReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewProgressReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewProgressReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
