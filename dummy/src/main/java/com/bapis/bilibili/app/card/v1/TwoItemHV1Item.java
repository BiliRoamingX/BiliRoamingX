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
public final class TwoItemHV1Item extends GeneratedMessageLite<TwoItemHV1Item, TwoItemHV1Item.C5908b> implements InterfaceC5920a0 {
    public static final int ARGS_FIELD_NUMBER = 5;
    public static final int COVER_FIELD_NUMBER = 2;
    public static final int COVER_LEFT_ICON_1_FIELD_NUMBER = 8;
    public static final int COVER_LEFT_TEXT_1_FIELD_NUMBER = 7;
    public static final int COVER_RIGHT_TEXT_FIELD_NUMBER = 9;
    private static final TwoItemHV1Item DEFAULT_INSTANCE;
    public static final int GOTO_FIELD_NUMBER = 6;
    public static final int PARAM_FIELD_NUMBER = 4;
    private static volatile Parser<TwoItemHV1Item> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 3;
    private Args args_;
    private int coverLeftIcon1_;
    private String title_ = "";
    private String cover_ = "";
    private String uri_ = "";
    private String param_ = "";
    private String goto_ = "";
    private String coverLeftText1_ = "";
    private String coverRightText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TwoItemHV1Item$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5907a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16002xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16002xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16002xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16002xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16002xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TwoItemHV1Item$b */
    /* loaded from: classes13.dex */
    public static final class C5908b extends GeneratedMessageLite.Builder<TwoItemHV1Item, C5908b> implements InterfaceC5920a0 {
        /* synthetic */ C5908b(C5907a c5907a) {
            this();
        }

        public C5908b clearArgs() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearArgs();
            return this;
        }

        public C5908b clearCover() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearCover();
            return this;
        }

        public C5908b clearCoverLeftIcon1() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearCoverLeftIcon1();
            return this;
        }

        public C5908b clearCoverLeftText1() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearCoverLeftText1();
            return this;
        }

        public C5908b clearCoverRightText() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearCoverRightText();
            return this;
        }

        public C5908b clearGoto() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearGoto();
            return this;
        }

        public C5908b clearParam() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearParam();
            return this;
        }

        public C5908b clearTitle() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearTitle();
            return this;
        }

        public C5908b clearUri() {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public Args getArgs() {
            return ((TwoItemHV1Item) this.instance).getArgs();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public String getCover() {
            return ((TwoItemHV1Item) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public ByteString getCoverBytes() {
            return ((TwoItemHV1Item) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public int getCoverLeftIcon1() {
            return ((TwoItemHV1Item) this.instance).getCoverLeftIcon1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public String getCoverLeftText1() {
            return ((TwoItemHV1Item) this.instance).getCoverLeftText1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public ByteString getCoverLeftText1Bytes() {
            return ((TwoItemHV1Item) this.instance).getCoverLeftText1Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public String getCoverRightText() {
            return ((TwoItemHV1Item) this.instance).getCoverRightText();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public ByteString getCoverRightTextBytes() {
            return ((TwoItemHV1Item) this.instance).getCoverRightTextBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public String getGoto() {
            return ((TwoItemHV1Item) this.instance).getGoto();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public ByteString getGotoBytes() {
            return ((TwoItemHV1Item) this.instance).getGotoBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public String getParam() {
            return ((TwoItemHV1Item) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public ByteString getParamBytes() {
            return ((TwoItemHV1Item) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public String getTitle() {
            return ((TwoItemHV1Item) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public ByteString getTitleBytes() {
            return ((TwoItemHV1Item) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public String getUri() {
            return ((TwoItemHV1Item) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public ByteString getUriBytes() {
            return ((TwoItemHV1Item) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
        public boolean hasArgs() {
            return ((TwoItemHV1Item) this.instance).hasArgs();
        }

        public C5908b mergeArgs(Args args) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).mergeArgs(args);
            return this;
        }

        public C5908b setArgs(Args args) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setArgs(args);
            return this;
        }

        public C5908b setCover(String str) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setCover(str);
            return this;
        }

        public C5908b setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setCoverBytes(byteString);
            return this;
        }

        public C5908b setCoverLeftIcon1(int i) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setCoverLeftIcon1(i);
            return this;
        }

        public C5908b setCoverLeftText1(String str) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setCoverLeftText1(str);
            return this;
        }

        public C5908b setCoverLeftText1Bytes(ByteString byteString) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setCoverLeftText1Bytes(byteString);
            return this;
        }

        public C5908b setCoverRightText(String str) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setCoverRightText(str);
            return this;
        }

        public C5908b setCoverRightTextBytes(ByteString byteString) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setCoverRightTextBytes(byteString);
            return this;
        }

        public C5908b setGoto(String str) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setGoto(str);
            return this;
        }

        public C5908b setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setGotoBytes(byteString);
            return this;
        }

        public C5908b setParam(String str) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setParam(str);
            return this;
        }

        public C5908b setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setParamBytes(byteString);
            return this;
        }

        public C5908b setTitle(String str) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setTitle(str);
            return this;
        }

        public C5908b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5908b setUri(String str) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setUri(str);
            return this;
        }

        public C5908b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5908b() {
            super(TwoItemHV1Item.DEFAULT_INSTANCE);
        }

        public C5908b setArgs(Args.C5789b c5789b) {
            copyOnWrite();
            ((TwoItemHV1Item) this.instance).setArgs(c5789b.build());
            return this;
        }
    }

    static {
        TwoItemHV1Item twoItemHV1Item = new TwoItemHV1Item();
        DEFAULT_INSTANCE = twoItemHV1Item;
        GeneratedMessageLite.registerDefaultInstance(TwoItemHV1Item.class, twoItemHV1Item);
    }

    private TwoItemHV1Item() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArgs() {
        this.args_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftIcon1() {
        this.coverLeftIcon1_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText1() {
        this.coverLeftText1_ = getDefaultInstance().getCoverLeftText1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverRightText() {
        this.coverRightText_ = getDefaultInstance().getCoverRightText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static TwoItemHV1Item getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArgs(Args args) {
        args.getClass();
        Args args2 = this.args_;
        if (args2 != null && args2 != Args.getDefaultInstance()) {
            this.args_ = Args.newBuilder(this.args_).mergeFrom((Args) args).buildPartial();
        } else {
            this.args_ = args;
        }
    }

    public static C5908b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TwoItemHV1Item parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TwoItemHV1Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TwoItemHV1Item> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgs(Args args) {
        args.getClass();
        this.args_ = args;
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
    public void setCoverLeftIcon1(int i) {
        this.coverLeftIcon1_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText1(String str) {
        str.getClass();
        this.coverLeftText1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightText(String str) {
        str.getClass();
        this.coverRightText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverRightText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoto(String str) {
        str.getClass();
        this.goto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goto_ = byteString.toStringUtf8();
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
        switch (C5907a.f16002xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TwoItemHV1Item();
            case 2:
                return new C5908b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t\u0006\u0208\u0007\u0208\b\u0004\t\u0208", new Object[]{"title_", "cover_", "uri_", "param_", "args_", "goto_", "coverLeftText1_", "coverLeftIcon1_", "coverRightText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TwoItemHV1Item> parser = PARSER;
                if (parser == null) {
                    synchronized (TwoItemHV1Item.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public Args getArgs() {
        Args args = this.args_;
        return args == null ? Args.getDefaultInstance() : args;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public int getCoverLeftIcon1() {
        return this.coverLeftIcon1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public String getCoverLeftText1() {
        return this.coverLeftText1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public ByteString getCoverLeftText1Bytes() {
        return ByteString.copyFromUtf8(this.coverLeftText1_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public String getCoverRightText() {
        return this.coverRightText_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public ByteString getCoverRightTextBytes() {
        return ByteString.copyFromUtf8(this.coverRightText_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public String getGoto() {
        return this.goto_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5920a0
    public boolean hasArgs() {
        return this.args_ != null;
    }

    public static C5908b newBuilder(TwoItemHV1Item twoItemHV1Item) {
        return DEFAULT_INSTANCE.createBuilder(twoItemHV1Item);
    }

    public static TwoItemHV1Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TwoItemHV1Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TwoItemHV1Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TwoItemHV1Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TwoItemHV1Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TwoItemHV1Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TwoItemHV1Item parseFrom(InputStream inputStream) throws IOException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TwoItemHV1Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TwoItemHV1Item parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TwoItemHV1Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TwoItemHV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
