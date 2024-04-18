package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class Item extends GeneratedMessageLite<Item, Item.Builder> implements ItemOrBuilder {
    public static final int ARTICLE_FIELD_NUMBER = 8;
    public static final int ARTICLE_NEW_FIELD_NUMBER = 43;
    public static final int AUTHOR_FIELD_NUMBER = 36;
    public static final int AUTHOR_NEW_FIELD_NUMBER = 23;
    public static final int AV_FIELD_NUMBER = 37;
    public static final int BANGUMI_FIELD_NUMBER = 38;
    public static final int BANGUMI_RELATES_FIELD_NUMBER = 20;
    public static final int BANNER_FIELD_NUMBER = 9;
    public static final int CHANNEL_NEW_FIELD_NUMBER = 18;
    public static final int CHAT_GPT_FIELD_NUMBER = 46;
    public static final int CM_FIELD_NUMBER = 25;
    public static final int COLLECTION_CARD_FIELD_NUMBER = 33;
    public static final int COMIC_FIELD_NUMBER = 17;
    private static final Item DEFAULT_INSTANCE;
    public static final int DYNAMIC_FIELD_NUMBER = 14;
    public static final int DYNAMIC_NEW_FIELD_NUMBER = 42;
    public static final int ESPORTS_INLINE_FIELD_NUMBER = 39;
    public static final int ESPORT_FIELD_NUMBER = 22;
    public static final int FIND_MORE_FIELD_NUMBER = 21;
    public static final int GAME_FIELD_NUMBER = 11;
    public static final int GOTO_FIELD_NUMBER = 3;
    public static final int HOT_BANNER_FIELD_NUMBER = 40;
    public static final int HOT_RECOMMEND_FIELD_NUMBER = 47;
    public static final int LINKTYPE_FIELD_NUMBER = 4;
    public static final int LIVE_FIELD_NUMBER = 10;
    public static final int LIVE_INLINE_FIELD_NUMBER = 28;
    public static final int LIVE_MASTER_FIELD_NUMBER = 48;
    public static final int LIVE_ROOM_FIELD_NUMBER = 50;
    public static final int LIVE_ROOM_TITLE_FIELD_NUMBER = 49;
    public static final int NPS_CARD_FIELD_NUMBER = 45;
    public static final int OGV_CARD_FIELD_NUMBER = 19;
    public static final int OGV_CHANNEL_FIELD_NUMBER = 34;
    public static final int OGV_INLINE_FIELD_NUMBER = 35;
    public static final int PARAM_FIELD_NUMBER = 2;
    private static volatile Parser<Item> PARSER = null;
    public static final int PEDIA_CARD_FIELD_NUMBER = 26;
    public static final int PEDIA_CARD_INLINE_FIELD_NUMBER = 31;
    public static final int PEDIA_CARD_PIC_FIELD_NUMBER = 44;
    public static final int POSITION_FIELD_NUMBER = 5;
    public static final int PURCHASE_FIELD_NUMBER = 12;
    public static final int RECOMMEND_TIPS_FIELD_NUMBER = 32;
    public static final int RECOMMEND_WORD_FIELD_NUMBER = 13;
    public static final int SPECIAL_FIELD_NUMBER = 7;
    public static final int SPECIAL_GUIDE_FIELD_NUMBER = 16;
    public static final int SPORTS_FIELD_NUMBER = 30;
    public static final int SUBJECT_FIELD_NUMBER = 41;
    public static final int SUGGEST_KEYWORD_FIELD_NUMBER = 15;
    public static final int TIPS_FIELD_NUMBER = 24;
    public static final int TOP_GAME_FIELD_NUMBER = 29;
    public static final int TRACKID_FIELD_NUMBER = 6;
    public static final int UGC_INLINE_FIELD_NUMBER = 27;
    public static final int URI_FIELD_NUMBER = 1;
    private Object cardItem_;
    private int position_;
    private int cardItemCase_ = 0;
    private String uri_ = "";
    private String param_ = "";
    private String goto_ = "";
    private String linktype_ = "";
    private String trackid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.Item$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17674xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17674xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17674xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17674xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17674xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17674xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17674xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17674xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Item, Builder> implements ItemOrBuilder {
        /* synthetic */ Builder(C79721 c79721) {
            this();
        }

        public Builder clearBangumi() {
            copyOnWrite();
            ((Item) this.instance).clearBangumi();
            return this;
        }

        public Builder clearGoto() {
            copyOnWrite();
            ((Item) this.instance).clearGoto();
            return this;
        }

        public Builder clearLinktype() {
            copyOnWrite();
            ((Item) this.instance).clearLinktype();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((Item) this.instance).clearParam();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((Item) this.instance).clearPosition();
            return this;
        }

        public Builder clearTrackid() {
            copyOnWrite();
            ((Item) this.instance).clearTrackid();
            return this;
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public SearchBangumiCard getBangumi() {
            return ((Item) this.instance).getBangumi();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public CardItemCase getCardItemCase() {
            return ((Item) this.instance).getCardItemCase();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public String getGoto() {
            return ((Item) this.instance).getGoto();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public ByteString getGotoBytes() {
            return ((Item) this.instance).getGotoBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public String getLinktype() {
            return ((Item) this.instance).getLinktype();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public ByteString getLinktypeBytes() {
            return ((Item) this.instance).getLinktypeBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public String getParam() {
            return ((Item) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public ByteString getParamBytes() {
            return ((Item) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public int getPosition() {
            return ((Item) this.instance).getPosition();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public String getTrackid() {
            return ((Item) this.instance).getTrackid();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public ByteString getTrackidBytes() {
            return ((Item) this.instance).getTrackidBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public String getUri() {
            return ((Item) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public ByteString getUriBytes() {
            return ((Item) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
        public boolean hasBangumi() {
            return ((Item) this.instance).hasBangumi();
        }

        public Builder mergeBangumi(SearchBangumiCard searchBangumiCard) {
            copyOnWrite();
            ((Item) this.instance).mergeBangumi(searchBangumiCard);
            return this;
        }

        public Builder setBangumi(SearchBangumiCard searchBangumiCard) {
            copyOnWrite();
            ((Item) this.instance).setBangumi(searchBangumiCard);
            return this;
        }

        public Builder setGoto(String str) {
            copyOnWrite();
            ((Item) this.instance).setGoto(str);
            return this;
        }

        public Builder setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((Item) this.instance).setGotoBytes(byteString);
            return this;
        }

        public Builder setLinktype(String str) {
            copyOnWrite();
            ((Item) this.instance).setLinktype(str);
            return this;
        }

        public Builder setLinktypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Item) this.instance).setLinktypeBytes(byteString);
            return this;
        }

        public Builder setParam(String str) {
            copyOnWrite();
            ((Item) this.instance).setParam(str);
            return this;
        }

        public Builder setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((Item) this.instance).setParamBytes(byteString);
            return this;
        }

        public Builder setPosition(int i) {
            copyOnWrite();
            ((Item) this.instance).setPosition(i);
            return this;
        }

        public Builder setTrackid(String str) {
            copyOnWrite();
            ((Item) this.instance).setTrackid(str);
            return this;
        }

        public Builder setTrackidBytes(ByteString byteString) {
            copyOnWrite();
            ((Item) this.instance).setTrackidBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Item) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Item) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(Item.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public enum CardItemCase {
        SPECIAL(7),
        ARTICLE(8),
        BANNER(9),
        LIVE(10),
        GAME(11),
        PURCHASE(12),
        RECOMMEND_WORD(13),
        DYNAMIC(14),
        SUGGEST_KEYWORD(15),
        SPECIAL_GUIDE(16),
        COMIC(17),
        CHANNEL_NEW(18),
        OGV_CARD(19),
        BANGUMI_RELATES(20),
        FIND_MORE(21),
        ESPORT(22),
        AUTHOR_NEW(23),
        TIPS(24),
        CM(25),
        PEDIA_CARD(26),
        UGC_INLINE(27),
        LIVE_INLINE(28),
        TOP_GAME(29),
        SPORTS(30),
        PEDIA_CARD_INLINE(31),
        RECOMMEND_TIPS(32),
        COLLECTION_CARD(33),
        OGV_CHANNEL(34),
        OGV_INLINE(35),
        AUTHOR(36),
        AV(37),
        BANGUMI(38),
        ESPORTS_INLINE(39),
        HOT_BANNER(40),
        SUBJECT(41),
        DYNAMIC_NEW(42),
        ARTICLE_NEW(43),
        PEDIA_CARD_PIC(44),
        NPS_CARD(45),
        CHAT_GPT(46),
        HOT_RECOMMEND(47),
        LIVE_MASTER(48),
        LIVE_ROOM_TITLE(49),
        LIVE_ROOM(50),
        CARDITEM_NOT_SET(0);

        private final int value;

        CardItemCase(int i) {
            this.value = i;
        }

        public static CardItemCase forNumber(int i) {
            if (i != 0) {
                switch (i) {
                    case 7:
                        return SPECIAL;
                    case 8:
                        return ARTICLE;
                    case 9:
                        return BANNER;
                    case 10:
                        return LIVE;
                    case 11:
                        return GAME;
                    case 12:
                        return PURCHASE;
                    case 13:
                        return RECOMMEND_WORD;
                    case 14:
                        return DYNAMIC;
                    case 15:
                        return SUGGEST_KEYWORD;
                    case 16:
                        return SPECIAL_GUIDE;
                    case 17:
                        return COMIC;
                    case 18:
                        return CHANNEL_NEW;
                    case 19:
                        return OGV_CARD;
                    case 20:
                        return BANGUMI_RELATES;
                    case 21:
                        return FIND_MORE;
                    case 22:
                        return ESPORT;
                    case 23:
                        return AUTHOR_NEW;
                    case 24:
                        return TIPS;
                    case 25:
                        return CM;
                    case 26:
                        return PEDIA_CARD;
                    case 27:
                        return UGC_INLINE;
                    case 28:
                        return LIVE_INLINE;
                    case 29:
                        return TOP_GAME;
                    case 30:
                        return SPORTS;
                    case 31:
                        return PEDIA_CARD_INLINE;
                    case 32:
                        return RECOMMEND_TIPS;
                    case 33:
                        return COLLECTION_CARD;
                    case 34:
                        return OGV_CHANNEL;
                    case 35:
                        return OGV_INLINE;
                    case 36:
                        return AUTHOR;
                    case 37:
                        return AV;
                    case 38:
                        return BANGUMI;
                    case 39:
                        return ESPORTS_INLINE;
                    case 40:
                        return HOT_BANNER;
                    case 41:
                        return SUBJECT;
                    case 42:
                        return DYNAMIC_NEW;
                    case 43:
                        return ARTICLE_NEW;
                    case 44:
                        return PEDIA_CARD_PIC;
                    case 45:
                        return NPS_CARD;
                    case 46:
                        return CHAT_GPT;
                    case 47:
                        return HOT_RECOMMEND;
                    case 48:
                        return LIVE_MASTER;
                    case 49:
                        return LIVE_ROOM_TITLE;
                    case 50:
                        return LIVE_ROOM;
                    default:
                        return null;
                }
            }
            return CARDITEM_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CardItemCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Item item = new Item();
        DEFAULT_INSTANCE = item;
        GeneratedMessageLite.registerDefaultInstance(Item.class, item);
    }

    public Item() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBangumi() {
        if (this.cardItemCase_ == 38) {
            this.cardItemCase_ = 0;
            this.cardItem_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinktype() {
        this.linktype_ = getDefaultInstance().getLinktype();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackid() {
        this.trackid_ = getDefaultInstance().getTrackid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Item getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBangumi(SearchBangumiCard searchBangumiCard) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Item parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Item> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBangumi(SearchBangumiCard searchBangumiCard) {
        searchBangumiCard.getClass();
        this.cardItem_ = searchBangumiCard;
        this.cardItemCase_ = 38;
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
    public void setLinktype(String str) {
        str.getClass();
        this.linktype_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinktypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linktype_ = byteString.toStringUtf8();
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
    public void setPosition(int i) {
        this.position_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackid(String str) {
        str.getClass();
        this.trackid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackid_ = byteString.toStringUtf8();
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
        return null;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public SearchBangumiCard getBangumi() {
        if (this.cardItemCase_ == 38) {
            return (SearchBangumiCard) this.cardItem_;
        }
        return SearchBangumiCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public CardItemCase getCardItemCase() {
        return CardItemCase.forNumber(this.cardItemCase_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public String getGoto() {
        return this.goto_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public String getLinktype() {
        return this.linktype_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public ByteString getLinktypeBytes() {
        return ByteString.copyFromUtf8(this.linktype_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public int getPosition() {
        return this.position_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public String getTrackid() {
        return this.trackid_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public ByteString getTrackidBytes() {
        return ByteString.copyFromUtf8(this.trackid_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ItemOrBuilder
    public boolean hasBangumi() {
        return this.cardItemCase_ == 38;
    }

    public static Builder newBuilder(Item item) {
        return DEFAULT_INSTANCE.createBuilder(item);
    }

    public static Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Item parseFrom(InputStream inputStream) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Item parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
