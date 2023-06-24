package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class CheckMore extends GeneratedMessageLite<CheckMore, CheckMore.Builder> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final CheckMore DEFAULT_INSTANCE;
    private static volatile Parser<CheckMore> PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private String content_ = "";
    private String uri_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.CheckMore$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79511 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17653xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17653xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17653xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17653xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17653xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CheckMore, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79511 c79511) {
            this();
        }

        public Builder clearContent() {
            copyOnWrite();
            ((CheckMore) this.instance).clearContent();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((CheckMore) this.instance).clearUri();
            return this;
        }

        public String getContent() {
            return ((CheckMore) this.instance).getContent();
        }

        public ByteString getContentBytes() {
            return ((CheckMore) this.instance).getContentBytes();
        }

        public String getUri() {
            return ((CheckMore) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((CheckMore) this.instance).getUriBytes();
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((CheckMore) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((CheckMore) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((CheckMore) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((CheckMore) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(CheckMore.DEFAULT_INSTANCE);
        }
    }

    static {
        CheckMore checkMore = new CheckMore();
        DEFAULT_INSTANCE = checkMore;
        GeneratedMessageLite.registerDefaultInstance(CheckMore.class, checkMore);
    }

    private CheckMore() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static CheckMore getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CheckMore parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CheckMore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckMore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CheckMore> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
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
        switch (C79511.f17653xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CheckMore();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"content_", "uri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CheckMore> parser = PARSER;
                if (parser == null) {
                    synchronized (CheckMore.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(CheckMore checkMore) {
        return DEFAULT_INSTANCE.createBuilder(checkMore);
    }

    public static CheckMore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckMore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CheckMore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CheckMore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CheckMore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CheckMore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CheckMore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CheckMore parseFrom(InputStream inputStream) throws IOException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckMore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CheckMore parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CheckMore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckMore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
