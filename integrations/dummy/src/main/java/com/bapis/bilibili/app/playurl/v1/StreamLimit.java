package com.bapis.bilibili.app.playurl.v1;

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
public final class StreamLimit extends GeneratedMessageLite<StreamLimit, StreamLimit.Builder> implements MessageLiteOrBuilder {
    private static final StreamLimit DEFAULT_INSTANCE;
    public static final int MSG_FIELD_NUMBER = 3;
    private static volatile Parser<StreamLimit> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private String title_ = "";
    private String uri_ = "";
    private String msg_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.StreamLimit$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65201 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16550xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16550xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16550xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16550xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16550xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16550xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16550xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16550xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StreamLimit, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65201 c65201) {
            this();
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((StreamLimit) this.instance).clearMsg();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((StreamLimit) this.instance).clearTitle();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((StreamLimit) this.instance).clearUri();
            return this;
        }

        public String getMsg() {
            return ((StreamLimit) this.instance).getMsg();
        }

        public ByteString getMsgBytes() {
            return ((StreamLimit) this.instance).getMsgBytes();
        }

        public String getTitle() {
            return ((StreamLimit) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((StreamLimit) this.instance).getTitleBytes();
        }

        public String getUri() {
            return ((StreamLimit) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((StreamLimit) this.instance).getUriBytes();
        }

        public Builder setMsg(String str) {
            copyOnWrite();
            ((StreamLimit) this.instance).setMsg(str);
            return this;
        }

        public Builder setMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamLimit) this.instance).setMsgBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((StreamLimit) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamLimit) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((StreamLimit) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamLimit) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(StreamLimit.DEFAULT_INSTANCE);
        }
    }

    static {
        StreamLimit streamLimit = new StreamLimit();
        DEFAULT_INSTANCE = streamLimit;
        GeneratedMessageLite.registerDefaultInstance(StreamLimit.class, streamLimit);
    }

    private StreamLimit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static StreamLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StreamLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StreamLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StreamLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StreamLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65201.f16550xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new StreamLimit();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"title_", "uri_", "msg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StreamLimit> parser = PARSER;
                if (parser == null) {
                    synchronized (StreamLimit.class) {
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

    public String getMsg() {
        return this.msg_;
    }

    public ByteString getMsgBytes() {
        return ByteString.copyFromUtf8(this.msg_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(StreamLimit streamLimit) {
        return DEFAULT_INSTANCE.createBuilder(streamLimit);
    }

    public static StreamLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StreamLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StreamLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StreamLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StreamLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StreamLimit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StreamLimit parseFrom(InputStream inputStream) throws IOException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StreamLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StreamLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StreamLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
