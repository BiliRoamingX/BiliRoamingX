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
public final class BizJumpLinkParam extends GeneratedMessageLite<BizJumpLinkParam, BizJumpLinkParam.Builder> implements MessageLiteOrBuilder {
    private static final BizJumpLinkParam DEFAULT_INSTANCE;
    private static volatile Parser<BizJumpLinkParam> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.BizJumpLinkParam$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67201 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16696xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16696xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16696xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16696xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16696xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16696xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16696xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16696xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BizJumpLinkParam, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67201 c67201) {
            this();
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((BizJumpLinkParam) this.instance).clearUrl();
            return this;
        }

        public String getUrl() {
            return ((BizJumpLinkParam) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((BizJumpLinkParam) this.instance).getUrlBytes();
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((BizJumpLinkParam) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((BizJumpLinkParam) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(BizJumpLinkParam.DEFAULT_INSTANCE);
        }
    }

    static {
        BizJumpLinkParam bizJumpLinkParam = new BizJumpLinkParam();
        DEFAULT_INSTANCE = bizJumpLinkParam;
        GeneratedMessageLite.registerDefaultInstance(BizJumpLinkParam.class, bizJumpLinkParam);
    }

    private BizJumpLinkParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static BizJumpLinkParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BizJumpLinkParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizJumpLinkParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BizJumpLinkParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67201.f16696xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizJumpLinkParam();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BizJumpLinkParam> parser = PARSER;
                if (parser == null) {
                    synchronized (BizJumpLinkParam.class) {
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

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(BizJumpLinkParam bizJumpLinkParam) {
        return DEFAULT_INSTANCE.createBuilder(bizJumpLinkParam);
    }

    public static BizJumpLinkParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizJumpLinkParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizJumpLinkParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizJumpLinkParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizJumpLinkParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizJumpLinkParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BizJumpLinkParam parseFrom(InputStream inputStream) throws IOException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizJumpLinkParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizJumpLinkParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizJumpLinkParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizJumpLinkParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
