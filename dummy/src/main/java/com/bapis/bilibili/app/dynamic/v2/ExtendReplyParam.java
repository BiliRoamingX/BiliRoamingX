package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class ExtendReplyParam extends GeneratedMessageLite<ExtendReplyParam, ExtendReplyParam.C5481b> implements q1 {
    private static final ExtendReplyParam DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<ExtendReplyParam> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String key_ = "";
    private String value_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ExtendReplyParam$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5480a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17301xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17301xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17301xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17301xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17301xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17301xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17301xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17301xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ExtendReplyParam$b */
    /* loaded from: classes19.dex */
    public static final class C5481b extends GeneratedMessageLite.Builder<ExtendReplyParam, C5481b> implements q1 {
        /* synthetic */ C5481b(C5480a c5480a) {
            this();
        }

        public C5481b clearKey() {
            copyOnWrite();
            ((ExtendReplyParam) this.instance).clearKey();
            return this;
        }

        public C5481b clearValue() {
            copyOnWrite();
            ((ExtendReplyParam) this.instance).clearValue();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.q1
        public String getKey() {
            return ((ExtendReplyParam) this.instance).getKey();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.q1
        public ByteString getKeyBytes() {
            return ((ExtendReplyParam) this.instance).getKeyBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.q1
        public String getValue() {
            return ((ExtendReplyParam) this.instance).getValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.q1
        public ByteString getValueBytes() {
            return ((ExtendReplyParam) this.instance).getValueBytes();
        }

        public C5481b setKey(String str) {
            copyOnWrite();
            ((ExtendReplyParam) this.instance).setKey(str);
            return this;
        }

        public C5481b setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendReplyParam) this.instance).setKeyBytes(byteString);
            return this;
        }

        public C5481b setValue(String str) {
            copyOnWrite();
            ((ExtendReplyParam) this.instance).setValue(str);
            return this;
        }

        public C5481b setValueBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendReplyParam) this.instance).setValueBytes(byteString);
            return this;
        }

        private C5481b() {
            super(ExtendReplyParam.DEFAULT_INSTANCE);
        }
    }

    static {
        ExtendReplyParam extendReplyParam = new ExtendReplyParam();
        DEFAULT_INSTANCE = extendReplyParam;
        GeneratedMessageLite.registerDefaultInstance(ExtendReplyParam.class, extendReplyParam);
    }

    private ExtendReplyParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static ExtendReplyParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5481b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendReplyParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtendReplyParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendReplyParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtendReplyParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5480a c5480a = null;
        switch (C5480a.f17301xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExtendReplyParam();
            case 2:
                return new C5481b(c5480a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"key_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtendReplyParam> parser = PARSER;
                if (parser == null) {
                    synchronized (ExtendReplyParam.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.q1
    public String getKey() {
        return this.key_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.q1
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.q1
    public String getValue() {
        return this.value_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.q1
    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }

    public static C5481b newBuilder(ExtendReplyParam extendReplyParam) {
        return DEFAULT_INSTANCE.createBuilder(extendReplyParam);
    }

    public static ExtendReplyParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendReplyParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendReplyParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtendReplyParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtendReplyParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtendReplyParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendReplyParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtendReplyParam parseFrom(InputStream inputStream) throws IOException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendReplyParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendReplyParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtendReplyParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendReplyParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
