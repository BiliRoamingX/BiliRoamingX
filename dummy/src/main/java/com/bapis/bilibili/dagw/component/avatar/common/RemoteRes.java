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
public final class RemoteRes extends GeneratedMessageLite<RemoteRes, RemoteRes.Builder> implements MessageLiteOrBuilder {
    public static final int BFS_STYLE_FIELD_NUMBER = 2;
    private static final RemoteRes DEFAULT_INSTANCE;
    private static volatile Parser<RemoteRes> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";
    private String bfsStyle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.RemoteRes$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17368xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17368xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17368xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17368xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17368xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17368xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17368xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17368xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RemoteRes, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75221 c75221) {
            this();
        }

        public Builder clearBfsStyle() {
            copyOnWrite();
            ((RemoteRes) this.instance).clearBfsStyle();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((RemoteRes) this.instance).clearUrl();
            return this;
        }

        public String getBfsStyle() {
            return ((RemoteRes) this.instance).getBfsStyle();
        }

        public ByteString getBfsStyleBytes() {
            return ((RemoteRes) this.instance).getBfsStyleBytes();
        }

        public String getUrl() {
            return ((RemoteRes) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((RemoteRes) this.instance).getUrlBytes();
        }

        public Builder setBfsStyle(String str) {
            copyOnWrite();
            ((RemoteRes) this.instance).setBfsStyle(str);
            return this;
        }

        public Builder setBfsStyleBytes(ByteString byteString) {
            copyOnWrite();
            ((RemoteRes) this.instance).setBfsStyleBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((RemoteRes) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((RemoteRes) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(RemoteRes.DEFAULT_INSTANCE);
        }
    }

    static {
        RemoteRes remoteRes = new RemoteRes();
        DEFAULT_INSTANCE = remoteRes;
        GeneratedMessageLite.registerDefaultInstance(RemoteRes.class, remoteRes);
    }

    private RemoteRes() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBfsStyle() {
        this.bfsStyle_ = getDefaultInstance().getBfsStyle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static RemoteRes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoteRes parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RemoteRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RemoteRes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RemoteRes> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBfsStyle(String str) {
        str.getClass();
        this.bfsStyle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBfsStyleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bfsStyle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75221.f17368xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RemoteRes();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"url_", "bfsStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RemoteRes> parser = PARSER;
                if (parser == null) {
                    synchronized (RemoteRes.class) {
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

    public String getBfsStyle() {
        return this.bfsStyle_;
    }

    public ByteString getBfsStyleBytes() {
        return ByteString.copyFromUtf8(this.bfsStyle_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(RemoteRes remoteRes) {
        return DEFAULT_INSTANCE.createBuilder(remoteRes);
    }

    public static RemoteRes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RemoteRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RemoteRes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RemoteRes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RemoteRes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RemoteRes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RemoteRes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RemoteRes parseFrom(InputStream inputStream) throws IOException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RemoteRes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RemoteRes parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RemoteRes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RemoteRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
