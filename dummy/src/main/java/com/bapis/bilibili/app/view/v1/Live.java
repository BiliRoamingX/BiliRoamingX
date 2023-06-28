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
public final class Live extends GeneratedMessageLite<Live, Live.Builder> implements MessageLiteOrBuilder {
    private static final Live DEFAULT_INSTANCE;
    public static final int ENDPAGE_URI_FIELD_NUMBER = 4;
    public static final int MID_FIELD_NUMBER = 1;
    private static volatile Parser<Live> PARSER = null;
    public static final int ROOMID_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 3;
    private long mid_;
    private long roomid_;
    private String uri_ = "";
    private String endpageUri_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Live$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16758xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16758xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16758xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16758xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16758xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16758xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16758xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16758xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Live, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67911 c67911) {
            this();
        }

        public Builder clearEndpageUri() {
            copyOnWrite();
            ((Live) this.instance).clearEndpageUri();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((Live) this.instance).clearMid();
            return this;
        }

        public Builder clearRoomid() {
            copyOnWrite();
            ((Live) this.instance).clearRoomid();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((Live) this.instance).clearUri();
            return this;
        }

        public String getEndpageUri() {
            return ((Live) this.instance).getEndpageUri();
        }

        public ByteString getEndpageUriBytes() {
            return ((Live) this.instance).getEndpageUriBytes();
        }

        public long getMid() {
            return ((Live) this.instance).getMid();
        }

        public long getRoomid() {
            return ((Live) this.instance).getRoomid();
        }

        public String getUri() {
            return ((Live) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((Live) this.instance).getUriBytes();
        }

        public Builder setEndpageUri(String str) {
            copyOnWrite();
            ((Live) this.instance).setEndpageUri(str);
            return this;
        }

        public Builder setEndpageUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Live) this.instance).setEndpageUriBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((Live) this.instance).setMid(j);
            return this;
        }

        public Builder setRoomid(long j) {
            copyOnWrite();
            ((Live) this.instance).setRoomid(j);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Live) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Live) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(Live.DEFAULT_INSTANCE);
        }
    }

    static {
        Live live = new Live();
        DEFAULT_INSTANCE = live;
        GeneratedMessageLite.registerDefaultInstance(Live.class, live);
    }

    private Live() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpageUri() {
        this.endpageUri_ = getDefaultInstance().getEndpageUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomid() {
        this.roomid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Live getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Live parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Live) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Live parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Live> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpageUri(String str) {
        str.getClass();
        this.endpageUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpageUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.endpageUri_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomid(long j) {
        this.roomid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67911.f16758xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Live();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208\u0004\u0208", new Object[]{"mid_", "roomid_", "uri_", "endpageUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Live> parser = PARSER;
                if (parser == null) {
                    synchronized (Live.class) {
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

    public String getEndpageUri() {
        return this.endpageUri_;
    }

    public ByteString getEndpageUriBytes() {
        return ByteString.copyFromUtf8(this.endpageUri_);
    }

    public long getMid() {
        return this.mid_;
    }

    public long getRoomid() {
        return this.roomid_;
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(Live live) {
        return DEFAULT_INSTANCE.createBuilder(live);
    }

    public static Live parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Live) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Live parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Live parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Live parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Live parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Live parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Live parseFrom(InputStream inputStream) throws IOException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Live parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Live parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Live parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Live) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
