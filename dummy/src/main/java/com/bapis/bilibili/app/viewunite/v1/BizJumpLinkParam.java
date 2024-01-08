package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class BizJumpLinkParam extends GeneratedMessageLite<BizJumpLinkParam, BizJumpLinkParam.C12276b> implements MessageLiteOrBuilder {
    private static final BizJumpLinkParam DEFAULT_INSTANCE;
    private static volatile Parser<BizJumpLinkParam> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.BizJumpLinkParam$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12275a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21257xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21257xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21257xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21257xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21257xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21257xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21257xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21257xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.BizJumpLinkParam$b */
    /* loaded from: classes20.dex */
    public static final class C12276b extends GeneratedMessageLite.Builder<BizJumpLinkParam, C12276b> implements MessageLiteOrBuilder {
        /* synthetic */ C12276b(C12275a c12275a) {
            this();
        }

        public C12276b clearUrl() {
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

        public C12276b setUrl(String str) {
            copyOnWrite();
            ((BizJumpLinkParam) this.instance).setUrl(str);
            return this;
        }

        public C12276b setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((BizJumpLinkParam) this.instance).setUrlBytes(byteString);
            return this;
        }

        private C12276b() {
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

    public static C12276b newBuilder() {
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12275a.f21257xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizJumpLinkParam();
            case 2:
                return new C12276b(null);
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

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static C12276b newBuilder(BizJumpLinkParam bizJumpLinkParam) {
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
