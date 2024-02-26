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
public final class Description extends GeneratedMessageLite<Description, Description.C5332b> implements b1 {
    private static final Description DEFAULT_INSTANCE;
    public static final int EMOJI_SIZE_FIELD_NUMBER = 11;
    public static final int EMOJI_SIZE_SPEC_FIELD_NUMBER = 12;
    public static final int EMOJI_TYPE_FIELD_NUMBER = 4;
    public static final int GOODS_FIELD_NUMBER = 9;
    public static final int GOODS_TYPE_FIELD_NUMBER = 5;
    public static final int ICON_NAME_FIELD_NUMBER = 7;
    public static final int ICON_URL_FIELD_NUMBER = 6;
    public static final int ORIG_TEXT_FIELD_NUMBER = 10;
    private static volatile Parser<Description> PARSER = null;
    public static final int RID_FIELD_NUMBER = 8;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 3;
    private EmojiSizeSpec emojiSizeSpec_;
    private int emojiSize_;
    private int emojiType_;
    private ModuleDescGoods goods_;
    private int type_;
    private String text_ = "";
    private String uri_ = "";
    private String goodsType_ = "";
    private String iconUrl_ = "";
    private String iconName_ = "";
    private String rid_ = "";
    private String origText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Description$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5331a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17238xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17238xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17238xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17238xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17238xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17238xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17238xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17238xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Description$b */
    /* loaded from: classes19.dex */
    public static final class C5332b extends GeneratedMessageLite.Builder<Description, C5332b> implements b1 {
        /* synthetic */ C5332b(C5331a c5331a) {
            this();
        }

        @Deprecated
        public C5332b clearEmojiSize() {
            copyOnWrite();
            ((Description) this.instance).clearEmojiSize();
            return this;
        }

        public C5332b clearEmojiSizeSpec() {
            copyOnWrite();
            ((Description) this.instance).clearEmojiSizeSpec();
            return this;
        }

        @Deprecated
        public C5332b clearEmojiType() {
            copyOnWrite();
            ((Description) this.instance).clearEmojiType();
            return this;
        }

        public C5332b clearGoods() {
            copyOnWrite();
            ((Description) this.instance).clearGoods();
            return this;
        }

        public C5332b clearGoodsType() {
            copyOnWrite();
            ((Description) this.instance).clearGoodsType();
            return this;
        }

        public C5332b clearIconName() {
            copyOnWrite();
            ((Description) this.instance).clearIconName();
            return this;
        }

        public C5332b clearIconUrl() {
            copyOnWrite();
            ((Description) this.instance).clearIconUrl();
            return this;
        }

        public C5332b clearOrigText() {
            copyOnWrite();
            ((Description) this.instance).clearOrigText();
            return this;
        }

        public C5332b clearRid() {
            copyOnWrite();
            ((Description) this.instance).clearRid();
            return this;
        }

        public C5332b clearText() {
            copyOnWrite();
            ((Description) this.instance).clearText();
            return this;
        }

        public C5332b clearType() {
            copyOnWrite();
            ((Description) this.instance).clearType();
            return this;
        }

        public C5332b clearUri() {
            copyOnWrite();
            ((Description) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        @Deprecated
        public int getEmojiSize() {
            return ((Description) this.instance).getEmojiSize();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public EmojiSizeSpec getEmojiSizeSpec() {
            return ((Description) this.instance).getEmojiSizeSpec();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        @Deprecated
        public EmojiType getEmojiType() {
            return ((Description) this.instance).getEmojiType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        @Deprecated
        public int getEmojiTypeValue() {
            return ((Description) this.instance).getEmojiTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ModuleDescGoods getGoods() {
            return ((Description) this.instance).getGoods();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public String getGoodsType() {
            return ((Description) this.instance).getGoodsType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ByteString getGoodsTypeBytes() {
            return ((Description) this.instance).getGoodsTypeBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public String getIconName() {
            return ((Description) this.instance).getIconName();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ByteString getIconNameBytes() {
            return ((Description) this.instance).getIconNameBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public String getIconUrl() {
            return ((Description) this.instance).getIconUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ByteString getIconUrlBytes() {
            return ((Description) this.instance).getIconUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public String getOrigText() {
            return ((Description) this.instance).getOrigText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ByteString getOrigTextBytes() {
            return ((Description) this.instance).getOrigTextBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public String getRid() {
            return ((Description) this.instance).getRid();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ByteString getRidBytes() {
            return ((Description) this.instance).getRidBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public String getText() {
            return ((Description) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ByteString getTextBytes() {
            return ((Description) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public DescType getType() {
            return ((Description) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public int getTypeValue() {
            return ((Description) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public String getUri() {
            return ((Description) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public ByteString getUriBytes() {
            return ((Description) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public boolean hasEmojiSizeSpec() {
            return ((Description) this.instance).hasEmojiSizeSpec();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b1
        public boolean hasGoods() {
            return ((Description) this.instance).hasGoods();
        }

        public C5332b mergeEmojiSizeSpec(EmojiSizeSpec emojiSizeSpec) {
            copyOnWrite();
            ((Description) this.instance).mergeEmojiSizeSpec(emojiSizeSpec);
            return this;
        }

        public C5332b mergeGoods(ModuleDescGoods moduleDescGoods) {
            copyOnWrite();
            ((Description) this.instance).mergeGoods(moduleDescGoods);
            return this;
        }

        @Deprecated
        public C5332b setEmojiSize(int i2) {
            copyOnWrite();
            ((Description) this.instance).setEmojiSize(i2);
            return this;
        }

        public C5332b setEmojiSizeSpec(EmojiSizeSpec emojiSizeSpec) {
            copyOnWrite();
            ((Description) this.instance).setEmojiSizeSpec(emojiSizeSpec);
            return this;
        }

        @Deprecated
        public C5332b setEmojiType(EmojiType emojiType) {
            copyOnWrite();
            ((Description) this.instance).setEmojiType(emojiType);
            return this;
        }

        @Deprecated
        public C5332b setEmojiTypeValue(int i2) {
            copyOnWrite();
            ((Description) this.instance).setEmojiTypeValue(i2);
            return this;
        }

        public C5332b setGoods(ModuleDescGoods moduleDescGoods) {
            copyOnWrite();
            ((Description) this.instance).setGoods(moduleDescGoods);
            return this;
        }

        public C5332b setGoodsType(String str) {
            copyOnWrite();
            ((Description) this.instance).setGoodsType(str);
            return this;
        }

        public C5332b setGoodsTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Description) this.instance).setGoodsTypeBytes(byteString);
            return this;
        }

        public C5332b setIconName(String str) {
            copyOnWrite();
            ((Description) this.instance).setIconName(str);
            return this;
        }

        public C5332b setIconNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Description) this.instance).setIconNameBytes(byteString);
            return this;
        }

        public C5332b setIconUrl(String str) {
            copyOnWrite();
            ((Description) this.instance).setIconUrl(str);
            return this;
        }

        public C5332b setIconUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Description) this.instance).setIconUrlBytes(byteString);
            return this;
        }

        public C5332b setOrigText(String str) {
            copyOnWrite();
            ((Description) this.instance).setOrigText(str);
            return this;
        }

        public C5332b setOrigTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Description) this.instance).setOrigTextBytes(byteString);
            return this;
        }

        public C5332b setRid(String str) {
            copyOnWrite();
            ((Description) this.instance).setRid(str);
            return this;
        }

        public C5332b setRidBytes(ByteString byteString) {
            copyOnWrite();
            ((Description) this.instance).setRidBytes(byteString);
            return this;
        }

        public C5332b setText(String str) {
            copyOnWrite();
            ((Description) this.instance).setText(str);
            return this;
        }

        public C5332b setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Description) this.instance).setTextBytes(byteString);
            return this;
        }

        public C5332b setType(DescType descType) {
            copyOnWrite();
            ((Description) this.instance).setType(descType);
            return this;
        }

        public C5332b setTypeValue(int i2) {
            copyOnWrite();
            ((Description) this.instance).setTypeValue(i2);
            return this;
        }

        public C5332b setUri(String str) {
            copyOnWrite();
            ((Description) this.instance).setUri(str);
            return this;
        }

        public C5332b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Description) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5332b() {
            super(Description.DEFAULT_INSTANCE);
        }

        public C5332b setEmojiSizeSpec(EmojiSizeSpec.C5454b c5454b) {
            copyOnWrite();
            ((Description) this.instance).setEmojiSizeSpec(c5454b.build());
            return this;
        }

        public C5332b setGoods(ModuleDescGoods.C5759b c5759b) {
            copyOnWrite();
            ((Description) this.instance).setGoods(c5759b.build());
            return this;
        }
    }

    static {
        Description description = new Description();
        DEFAULT_INSTANCE = description;
        GeneratedMessageLite.registerDefaultInstance(Description.class, description);
    }

    private Description() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiSize() {
        this.emojiSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiSizeSpec() {
        this.emojiSizeSpec_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiType() {
        this.emojiType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoods() {
        this.goods_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoodsType() {
        this.goodsType_ = getDefaultInstance().getGoodsType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconName() {
        this.iconName_ = getDefaultInstance().getIconName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconUrl() {
        this.iconUrl_ = getDefaultInstance().getIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigText() {
        this.origText_ = getDefaultInstance().getOrigText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRid() {
        this.rid_ = getDefaultInstance().getRid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Description getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmojiSizeSpec(EmojiSizeSpec emojiSizeSpec) {
        emojiSizeSpec.getClass();
        EmojiSizeSpec emojiSizeSpec2 = this.emojiSizeSpec_;
        if (emojiSizeSpec2 != null && emojiSizeSpec2 != EmojiSizeSpec.getDefaultInstance()) {
            this.emojiSizeSpec_ = EmojiSizeSpec.newBuilder(this.emojiSizeSpec_).mergeFrom((EmojiSizeSpec) emojiSizeSpec).buildPartial();
        } else {
            this.emojiSizeSpec_ = emojiSizeSpec;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoods(ModuleDescGoods moduleDescGoods) {
        moduleDescGoods.getClass();
        ModuleDescGoods moduleDescGoods2 = this.goods_;
        if (moduleDescGoods2 != null && moduleDescGoods2 != ModuleDescGoods.getDefaultInstance()) {
            this.goods_ = ModuleDescGoods.newBuilder(this.goods_).mergeFrom((ModuleDescGoods) moduleDescGoods).buildPartial();
        } else {
            this.goods_ = moduleDescGoods;
        }
    }

    public static C5332b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Description parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Description) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Description parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Description> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiSize(int i2) {
        this.emojiSize_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiSizeSpec(EmojiSizeSpec emojiSizeSpec) {
        emojiSizeSpec.getClass();
        this.emojiSizeSpec_ = emojiSizeSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiType(EmojiType emojiType) {
        this.emojiType_ = emojiType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiTypeValue(int i2) {
        this.emojiType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoods(ModuleDescGoods moduleDescGoods) {
        moduleDescGoods.getClass();
        this.goods_ = moduleDescGoods;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsType(String str) {
        str.getClass();
        this.goodsType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goodsType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconName(String str) {
        str.getClass();
        this.iconName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrl(String str) {
        str.getClass();
        this.iconUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigText(String str) {
        str.getClass();
        this.origText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.origText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRid(String str) {
        str.getClass();
        this.rid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(DescType descType) {
        this.type_ = descType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
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
        C5331a c5331a = null;
        switch (C5331a.f17238xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Description();
            case 2:
                return new C5332b(c5331a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0208\u0004\f\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\t\n\u0208\u000b\u0004\f\t", new Object[]{"text_", "type_", "uri_", "emojiType_", "goodsType_", "iconUrl_", "iconName_", "rid_", "goods_", "origText_", "emojiSize_", "emojiSizeSpec_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Description> parser = PARSER;
                if (parser == null) {
                    synchronized (Description.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    @Deprecated
    public int getEmojiSize() {
        return this.emojiSize_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public EmojiSizeSpec getEmojiSizeSpec() {
        EmojiSizeSpec emojiSizeSpec = this.emojiSizeSpec_;
        return emojiSizeSpec == null ? EmojiSizeSpec.getDefaultInstance() : emojiSizeSpec;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    @Deprecated
    public EmojiType getEmojiType() {
        EmojiType forNumber = EmojiType.forNumber(this.emojiType_);
        return forNumber == null ? EmojiType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    @Deprecated
    public int getEmojiTypeValue() {
        return this.emojiType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ModuleDescGoods getGoods() {
        ModuleDescGoods moduleDescGoods = this.goods_;
        return moduleDescGoods == null ? ModuleDescGoods.getDefaultInstance() : moduleDescGoods;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public String getGoodsType() {
        return this.goodsType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ByteString getGoodsTypeBytes() {
        return ByteString.copyFromUtf8(this.goodsType_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public String getIconName() {
        return this.iconName_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ByteString getIconNameBytes() {
        return ByteString.copyFromUtf8(this.iconName_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public String getIconUrl() {
        return this.iconUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ByteString getIconUrlBytes() {
        return ByteString.copyFromUtf8(this.iconUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public String getOrigText() {
        return this.origText_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ByteString getOrigTextBytes() {
        return ByteString.copyFromUtf8(this.origText_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public String getRid() {
        return this.rid_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ByteString getRidBytes() {
        return ByteString.copyFromUtf8(this.rid_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public DescType getType() {
        DescType forNumber = DescType.forNumber(this.type_);
        return forNumber == null ? DescType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public boolean hasEmojiSizeSpec() {
        return this.emojiSizeSpec_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b1
    public boolean hasGoods() {
        return this.goods_ != null;
    }

    public static C5332b newBuilder(Description description) {
        return DEFAULT_INSTANCE.createBuilder(description);
    }

    public static Description parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Description) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Description parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Description parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Description parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Description parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Description parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Description parseFrom(InputStream inputStream) throws IOException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Description parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Description parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Description parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
