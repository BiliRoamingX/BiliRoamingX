package com.bapis.bilibili.app.card.v1;

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
/* loaded from: classes13.dex */
public final class HotTopicItem extends GeneratedMessageLite<HotTopicItem, HotTopicItem.C5817b> implements InterfaceC5931k {
    public static final int COVER_FIELD_NUMBER = 1;
    private static final HotTopicItem DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PARAM_FIELD_NUMBER = 3;
    private static volatile Parser<HotTopicItem> PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private String cover_ = "";
    private String uri_ = "";
    private String param_ = "";
    private String name_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.HotTopicItem$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5816a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15957xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15957xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15957xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.HotTopicItem$b */
    /* loaded from: classes13.dex */
    public static final class C5817b extends GeneratedMessageLite.Builder<HotTopicItem, C5817b> implements InterfaceC5931k {
        /* synthetic */ C5817b(C5816a c5816a) {
            this();
        }

        public C5817b clearCover() {
            copyOnWrite();
            ((HotTopicItem) this.instance).clearCover();
            return this;
        }

        public C5817b clearName() {
            copyOnWrite();
            ((HotTopicItem) this.instance).clearName();
            return this;
        }

        public C5817b clearParam() {
            copyOnWrite();
            ((HotTopicItem) this.instance).clearParam();
            return this;
        }

        public C5817b clearUri() {
            copyOnWrite();
            ((HotTopicItem) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public String getCover() {
            return ((HotTopicItem) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public ByteString getCoverBytes() {
            return ((HotTopicItem) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public String getName() {
            return ((HotTopicItem) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public ByteString getNameBytes() {
            return ((HotTopicItem) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public String getParam() {
            return ((HotTopicItem) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public ByteString getParamBytes() {
            return ((HotTopicItem) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public String getUri() {
            return ((HotTopicItem) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
        public ByteString getUriBytes() {
            return ((HotTopicItem) this.instance).getUriBytes();
        }

        public C5817b setCover(String str) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setCover(str);
            return this;
        }

        public C5817b setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setCoverBytes(byteString);
            return this;
        }

        public C5817b setName(String str) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setName(str);
            return this;
        }

        public C5817b setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setNameBytes(byteString);
            return this;
        }

        public C5817b setParam(String str) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setParam(str);
            return this;
        }

        public C5817b setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setParamBytes(byteString);
            return this;
        }

        public C5817b setUri(String str) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setUri(str);
            return this;
        }

        public C5817b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((HotTopicItem) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5817b() {
            super(HotTopicItem.DEFAULT_INSTANCE);
        }
    }

    static {
        HotTopicItem hotTopicItem = new HotTopicItem();
        DEFAULT_INSTANCE = hotTopicItem;
        GeneratedMessageLite.registerDefaultInstance(HotTopicItem.class, hotTopicItem);
    }

    private HotTopicItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static HotTopicItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5817b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HotTopicItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HotTopicItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotTopicItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HotTopicItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
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
        switch (C5816a.f15957xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HotTopicItem();
            case 2:
                return new C5817b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"cover_", "uri_", "param_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HotTopicItem> parser = PARSER;
                if (parser == null) {
                    synchronized (HotTopicItem.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5931k
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static C5817b newBuilder(HotTopicItem hotTopicItem) {
        return DEFAULT_INSTANCE.createBuilder(hotTopicItem);
    }

    public static HotTopicItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotTopicItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HotTopicItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HotTopicItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HotTopicItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HotTopicItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HotTopicItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HotTopicItem parseFrom(InputStream inputStream) throws IOException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotTopicItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HotTopicItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HotTopicItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotTopicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
