package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class ExtendReply extends GeneratedMessageLite<ExtendReply, ExtendReply.C5479b> implements p1 {
    private static final ExtendReply DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<ExtendReply> PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private Internal.ProtobufList<ExtendReplyParam> params_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ExtendReply$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5478a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17300xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17300xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17300xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17300xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17300xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17300xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17300xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17300xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ExtendReply$b */
    /* loaded from: classes19.dex */
    public static final class C5479b extends GeneratedMessageLite.Builder<ExtendReply, C5479b> implements p1 {
        /* synthetic */ C5479b(C5478a c5478a) {
            this();
        }

        public C5479b addAllParams(Iterable<? extends ExtendReplyParam> iterable) {
            copyOnWrite();
            ((ExtendReply) this.instance).addAllParams(iterable);
            return this;
        }

        public C5479b addParams(ExtendReplyParam extendReplyParam) {
            copyOnWrite();
            ((ExtendReply) this.instance).addParams(extendReplyParam);
            return this;
        }

        public C5479b clearParams() {
            copyOnWrite();
            ((ExtendReply) this.instance).clearParams();
            return this;
        }

        public C5479b clearUri() {
            copyOnWrite();
            ((ExtendReply) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.p1
        public ExtendReplyParam getParams(int i2) {
            return ((ExtendReply) this.instance).getParams(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.p1
        public int getParamsCount() {
            return ((ExtendReply) this.instance).getParamsCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.p1
        public List<ExtendReplyParam> getParamsList() {
            return Collections.unmodifiableList(((ExtendReply) this.instance).getParamsList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.p1
        public String getUri() {
            return ((ExtendReply) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.p1
        public ByteString getUriBytes() {
            return ((ExtendReply) this.instance).getUriBytes();
        }

        public C5479b removeParams(int i2) {
            copyOnWrite();
            ((ExtendReply) this.instance).removeParams(i2);
            return this;
        }

        public C5479b setParams(int i2, ExtendReplyParam extendReplyParam) {
            copyOnWrite();
            ((ExtendReply) this.instance).setParams(i2, extendReplyParam);
            return this;
        }

        public C5479b setUri(String str) {
            copyOnWrite();
            ((ExtendReply) this.instance).setUri(str);
            return this;
        }

        public C5479b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendReply) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5479b() {
            super(ExtendReply.DEFAULT_INSTANCE);
        }

        public C5479b addParams(int i2, ExtendReplyParam extendReplyParam) {
            copyOnWrite();
            ((ExtendReply) this.instance).addParams(i2, extendReplyParam);
            return this;
        }

        public C5479b setParams(int i2, ExtendReplyParam.C5481b c5481b) {
            copyOnWrite();
            ((ExtendReply) this.instance).setParams(i2, c5481b.build());
            return this;
        }

        public C5479b addParams(ExtendReplyParam.C5481b c5481b) {
            copyOnWrite();
            ((ExtendReply) this.instance).addParams(c5481b.build());
            return this;
        }

        public C5479b addParams(int i2, ExtendReplyParam.C5481b c5481b) {
            copyOnWrite();
            ((ExtendReply) this.instance).addParams(i2, c5481b.build());
            return this;
        }
    }

    static {
        ExtendReply extendReply = new ExtendReply();
        DEFAULT_INSTANCE = extendReply;
        GeneratedMessageLite.registerDefaultInstance(ExtendReply.class, extendReply);
    }

    private ExtendReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParams(Iterable<? extends ExtendReplyParam> iterable) {
        ensureParamsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.params_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParams(ExtendReplyParam extendReplyParam) {
        extendReplyParam.getClass();
        ensureParamsIsMutable();
        this.params_.add(extendReplyParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    private void ensureParamsIsMutable() {
        Internal.ProtobufList<ExtendReplyParam> protobufList = this.params_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.params_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ExtendReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5479b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtendReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtendReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParams(int i2) {
        ensureParamsIsMutable();
        this.params_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(int i2, ExtendReplyParam extendReplyParam) {
        extendReplyParam.getClass();
        ensureParamsIsMutable();
        this.params_.set(i2, extendReplyParam);
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
        C5478a c5478a = null;
        switch (C5478a.f17300xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExtendReply();
            case 2:
                return new C5479b(c5478a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"uri_", "params_", ExtendReplyParam.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtendReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ExtendReply.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.p1
    public ExtendReplyParam getParams(int i2) {
        return this.params_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.p1
    public int getParamsCount() {
        return this.params_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.p1
    public List<ExtendReplyParam> getParamsList() {
        return this.params_;
    }

    public q1 getParamsOrBuilder(int i2) {
        return this.params_.get(i2);
    }

    public List<? extends q1> getParamsOrBuilderList() {
        return this.params_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.p1
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.p1
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static C5479b newBuilder(ExtendReply extendReply) {
        return DEFAULT_INSTANCE.createBuilder(extendReply);
    }

    public static ExtendReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtendReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParams(int i2, ExtendReplyParam extendReplyParam) {
        extendReplyParam.getClass();
        ensureParamsIsMutable();
        this.params_.add(i2, extendReplyParam);
    }

    public static ExtendReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtendReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtendReply parseFrom(InputStream inputStream) throws IOException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtendReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
