package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
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
public final class LinkNode extends GeneratedMessageLite<LinkNode, LinkNode.C5642b> implements u8 {
    public static final int BIZ_DATA_FIELD_NUMBER = 11;
    public static final int BIZ_ID_FIELD_NUMBER = 7;
    private static final LinkNode DEFAULT_INSTANCE;
    public static final int GOODS_ITEM_FIELD_NUMBER = 9;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int ICON_SUFFIX_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int LINK_PICS_FIELD_NUMBER = 12;
    public static final int LINK_TYPE_ENUM_FIELD_NUMBER = 6;
    public static final int LINK_TYPE_FIELD_NUMBER = 5;
    public static final int NOTE_VIDEO_TS_FIELD_NUMBER = 10;
    private static volatile Parser<LinkNode> PARSER = null;
    public static final int SHOW_TEXT_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    private Any bizData_;
    private GoodsItem goodsItem_;
    private MdlDynDraw linkPics_;
    private int linkTypeEnum_;
    private NoteVideoTS noteVideoTs_;
    private WordNode showText_;
    private long timestamp_;
    private String link_ = "";
    private String icon_ = "";
    private String iconSuffix_ = "";
    private String linkType_ = "";
    private String bizId_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.LinkNode$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5641a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17335xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17335xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17335xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17335xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17335xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17335xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17335xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17335xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.LinkNode$b */
    /* loaded from: classes19.dex */
    public static final class C5642b extends GeneratedMessageLite.Builder<LinkNode, C5642b> implements u8 {
        /* synthetic */ C5642b(C5641a c5641a) {
            this();
        }

        public C5642b clearBizData() {
            copyOnWrite();
            ((LinkNode) this.instance).clearBizData();
            return this;
        }

        public C5642b clearBizId() {
            copyOnWrite();
            ((LinkNode) this.instance).clearBizId();
            return this;
        }

        public C5642b clearGoodsItem() {
            copyOnWrite();
            ((LinkNode) this.instance).clearGoodsItem();
            return this;
        }

        public C5642b clearIcon() {
            copyOnWrite();
            ((LinkNode) this.instance).clearIcon();
            return this;
        }

        public C5642b clearIconSuffix() {
            copyOnWrite();
            ((LinkNode) this.instance).clearIconSuffix();
            return this;
        }

        public C5642b clearLink() {
            copyOnWrite();
            ((LinkNode) this.instance).clearLink();
            return this;
        }

        public C5642b clearLinkPics() {
            copyOnWrite();
            ((LinkNode) this.instance).clearLinkPics();
            return this;
        }

        public C5642b clearLinkType() {
            copyOnWrite();
            ((LinkNode) this.instance).clearLinkType();
            return this;
        }

        public C5642b clearLinkTypeEnum() {
            copyOnWrite();
            ((LinkNode) this.instance).clearLinkTypeEnum();
            return this;
        }

        public C5642b clearNoteVideoTs() {
            copyOnWrite();
            ((LinkNode) this.instance).clearNoteVideoTs();
            return this;
        }

        public C5642b clearShowText() {
            copyOnWrite();
            ((LinkNode) this.instance).clearShowText();
            return this;
        }

        @Deprecated
        public C5642b clearTimestamp() {
            copyOnWrite();
            ((LinkNode) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public Any getBizData() {
            return ((LinkNode) this.instance).getBizData();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public String getBizId() {
            return ((LinkNode) this.instance).getBizId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public ByteString getBizIdBytes() {
            return ((LinkNode) this.instance).getBizIdBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public GoodsItem getGoodsItem() {
            return ((LinkNode) this.instance).getGoodsItem();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public String getIcon() {
            return ((LinkNode) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public ByteString getIconBytes() {
            return ((LinkNode) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public String getIconSuffix() {
            return ((LinkNode) this.instance).getIconSuffix();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public ByteString getIconSuffixBytes() {
            return ((LinkNode) this.instance).getIconSuffixBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public String getLink() {
            return ((LinkNode) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public ByteString getLinkBytes() {
            return ((LinkNode) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public MdlDynDraw getLinkPics() {
            return ((LinkNode) this.instance).getLinkPics();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public String getLinkType() {
            return ((LinkNode) this.instance).getLinkType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public ByteString getLinkTypeBytes() {
            return ((LinkNode) this.instance).getLinkTypeBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public LinkNodeType getLinkTypeEnum() {
            return ((LinkNode) this.instance).getLinkTypeEnum();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public int getLinkTypeEnumValue() {
            return ((LinkNode) this.instance).getLinkTypeEnumValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public NoteVideoTS getNoteVideoTs() {
            return ((LinkNode) this.instance).getNoteVideoTs();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public WordNode getShowText() {
            return ((LinkNode) this.instance).getShowText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        @Deprecated
        public long getTimestamp() {
            return ((LinkNode) this.instance).getTimestamp();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public boolean hasBizData() {
            return ((LinkNode) this.instance).hasBizData();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public boolean hasGoodsItem() {
            return ((LinkNode) this.instance).hasGoodsItem();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public boolean hasLinkPics() {
            return ((LinkNode) this.instance).hasLinkPics();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public boolean hasNoteVideoTs() {
            return ((LinkNode) this.instance).hasNoteVideoTs();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u8
        public boolean hasShowText() {
            return ((LinkNode) this.instance).hasShowText();
        }

        public C5642b mergeBizData(Any any) {
            copyOnWrite();
            ((LinkNode) this.instance).mergeBizData(any);
            return this;
        }

        public C5642b mergeGoodsItem(GoodsItem goodsItem) {
            copyOnWrite();
            ((LinkNode) this.instance).mergeGoodsItem(goodsItem);
            return this;
        }

        public C5642b mergeLinkPics(MdlDynDraw mdlDynDraw) {
            copyOnWrite();
            ((LinkNode) this.instance).mergeLinkPics(mdlDynDraw);
            return this;
        }

        public C5642b mergeNoteVideoTs(NoteVideoTS noteVideoTS) {
            copyOnWrite();
            ((LinkNode) this.instance).mergeNoteVideoTs(noteVideoTS);
            return this;
        }

        public C5642b mergeShowText(WordNode wordNode) {
            copyOnWrite();
            ((LinkNode) this.instance).mergeShowText(wordNode);
            return this;
        }

        public C5642b setBizData(Any any) {
            copyOnWrite();
            ((LinkNode) this.instance).setBizData(any);
            return this;
        }

        public C5642b setBizId(String str) {
            copyOnWrite();
            ((LinkNode) this.instance).setBizId(str);
            return this;
        }

        public C5642b setBizIdBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkNode) this.instance).setBizIdBytes(byteString);
            return this;
        }

        public C5642b setGoodsItem(GoodsItem goodsItem) {
            copyOnWrite();
            ((LinkNode) this.instance).setGoodsItem(goodsItem);
            return this;
        }

        public C5642b setIcon(String str) {
            copyOnWrite();
            ((LinkNode) this.instance).setIcon(str);
            return this;
        }

        public C5642b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkNode) this.instance).setIconBytes(byteString);
            return this;
        }

        public C5642b setIconSuffix(String str) {
            copyOnWrite();
            ((LinkNode) this.instance).setIconSuffix(str);
            return this;
        }

        public C5642b setIconSuffixBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkNode) this.instance).setIconSuffixBytes(byteString);
            return this;
        }

        public C5642b setLink(String str) {
            copyOnWrite();
            ((LinkNode) this.instance).setLink(str);
            return this;
        }

        public C5642b setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkNode) this.instance).setLinkBytes(byteString);
            return this;
        }

        public C5642b setLinkPics(MdlDynDraw mdlDynDraw) {
            copyOnWrite();
            ((LinkNode) this.instance).setLinkPics(mdlDynDraw);
            return this;
        }

        public C5642b setLinkType(String str) {
            copyOnWrite();
            ((LinkNode) this.instance).setLinkType(str);
            return this;
        }

        public C5642b setLinkTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkNode) this.instance).setLinkTypeBytes(byteString);
            return this;
        }

        public C5642b setLinkTypeEnum(LinkNodeType linkNodeType) {
            copyOnWrite();
            ((LinkNode) this.instance).setLinkTypeEnum(linkNodeType);
            return this;
        }

        public C5642b setLinkTypeEnumValue(int i2) {
            copyOnWrite();
            ((LinkNode) this.instance).setLinkTypeEnumValue(i2);
            return this;
        }

        public C5642b setNoteVideoTs(NoteVideoTS noteVideoTS) {
            copyOnWrite();
            ((LinkNode) this.instance).setNoteVideoTs(noteVideoTS);
            return this;
        }

        public C5642b setShowText(WordNode wordNode) {
            copyOnWrite();
            ((LinkNode) this.instance).setShowText(wordNode);
            return this;
        }

        @Deprecated
        public C5642b setTimestamp(long j2) {
            copyOnWrite();
            ((LinkNode) this.instance).setTimestamp(j2);
            return this;
        }

        private C5642b() {
            super(LinkNode.DEFAULT_INSTANCE);
        }

        public C5642b setBizData(Any.Builder builder) {
            copyOnWrite();
            ((LinkNode) this.instance).setBizData(builder.build());
            return this;
        }

        public C5642b setGoodsItem(GoodsItem.C5505b c5505b) {
            copyOnWrite();
            ((LinkNode) this.instance).setGoodsItem(c5505b.build());
            return this;
        }

        public C5642b setLinkPics(MdlDynDraw.C5682b c5682b) {
            copyOnWrite();
            ((LinkNode) this.instance).setLinkPics(c5682b.build());
            return this;
        }

        public C5642b setNoteVideoTs(NoteVideoTS.C5831b c5831b) {
            copyOnWrite();
            ((LinkNode) this.instance).setNoteVideoTs(c5831b.build());
            return this;
        }

        public C5642b setShowText(WordNode.C6126b c6126b) {
            copyOnWrite();
            ((LinkNode) this.instance).setShowText(c6126b.build());
            return this;
        }
    }

    static {
        LinkNode linkNode = new LinkNode();
        DEFAULT_INSTANCE = linkNode;
        GeneratedMessageLite.registerDefaultInstance(LinkNode.class, linkNode);
    }

    private LinkNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizData() {
        this.bizData_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizId() {
        this.bizId_ = getDefaultInstance().getBizId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoodsItem() {
        this.goodsItem_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconSuffix() {
        this.iconSuffix_ = getDefaultInstance().getIconSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkPics() {
        this.linkPics_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkType() {
        this.linkType_ = getDefaultInstance().getLinkType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkTypeEnum() {
        this.linkTypeEnum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoteVideoTs() {
        this.noteVideoTs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowText() {
        this.showText_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static LinkNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBizData(Any any) {
        any.getClass();
        Any any2 = this.bizData_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.bizData_ = Any.newBuilder(this.bizData_).mergeFrom((Any) any).buildPartial();
        } else {
            this.bizData_ = any;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoodsItem(GoodsItem goodsItem) {
        goodsItem.getClass();
        GoodsItem goodsItem2 = this.goodsItem_;
        if (goodsItem2 != null && goodsItem2 != GoodsItem.getDefaultInstance()) {
            this.goodsItem_ = GoodsItem.newBuilder(this.goodsItem_).mergeFrom((GoodsItem) goodsItem).buildPartial();
        } else {
            this.goodsItem_ = goodsItem;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkPics(MdlDynDraw mdlDynDraw) {
        mdlDynDraw.getClass();
        MdlDynDraw mdlDynDraw2 = this.linkPics_;
        if (mdlDynDraw2 != null && mdlDynDraw2 != MdlDynDraw.getDefaultInstance()) {
            this.linkPics_ = MdlDynDraw.newBuilder(this.linkPics_).mergeFrom((MdlDynDraw) mdlDynDraw).buildPartial();
        } else {
            this.linkPics_ = mdlDynDraw;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoteVideoTs(NoteVideoTS noteVideoTS) {
        noteVideoTS.getClass();
        NoteVideoTS noteVideoTS2 = this.noteVideoTs_;
        if (noteVideoTS2 != null && noteVideoTS2 != NoteVideoTS.getDefaultInstance()) {
            this.noteVideoTs_ = NoteVideoTS.newBuilder(this.noteVideoTs_).mergeFrom((NoteVideoTS) noteVideoTS).buildPartial();
        } else {
            this.noteVideoTs_ = noteVideoTS;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowText(WordNode wordNode) {
        wordNode.getClass();
        WordNode wordNode2 = this.showText_;
        if (wordNode2 != null && wordNode2 != WordNode.getDefaultInstance()) {
            this.showText_ = WordNode.newBuilder(this.showText_).mergeFrom((WordNode) wordNode).buildPartial();
        } else {
            this.showText_ = wordNode;
        }
    }

    public static C5642b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkNode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LinkNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkNode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkNode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizData(Any any) {
        any.getClass();
        this.bizData_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizId(String str) {
        str.getClass();
        this.bizId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsItem(GoodsItem goodsItem) {
        goodsItem.getClass();
        this.goodsItem_ = goodsItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconSuffix(String str) {
        str.getClass();
        this.iconSuffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconSuffixBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconSuffix_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPics(MdlDynDraw mdlDynDraw) {
        mdlDynDraw.getClass();
        this.linkPics_ = mdlDynDraw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkType(String str) {
        str.getClass();
        this.linkType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTypeEnum(LinkNodeType linkNodeType) {
        this.linkTypeEnum_ = linkNodeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTypeEnumValue(int i2) {
        this.linkTypeEnum_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoteVideoTs(NoteVideoTS noteVideoTS) {
        noteVideoTS.getClass();
        this.noteVideoTs_ = noteVideoTS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowText(WordNode wordNode) {
        wordNode.getClass();
        this.showText_ = wordNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j2) {
        this.timestamp_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5641a c5641a = null;
        switch (C5641a.f17335xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkNode();
            case 2:
                return new C5642b(c5641a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\f\u0007\u0208\b\u0002\t\t\n\t\u000b\t\f\t", new Object[]{"showText_", "link_", "icon_", "iconSuffix_", "linkType_", "linkTypeEnum_", "bizId_", "timestamp_", "goodsItem_", "noteVideoTs_", "bizData_", "linkPics_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkNode> parser = PARSER;
                if (parser == null) {
                    synchronized (LinkNode.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public Any getBizData() {
        Any any = this.bizData_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public String getBizId() {
        return this.bizId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public ByteString getBizIdBytes() {
        return ByteString.copyFromUtf8(this.bizId_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public GoodsItem getGoodsItem() {
        GoodsItem goodsItem = this.goodsItem_;
        return goodsItem == null ? GoodsItem.getDefaultInstance() : goodsItem;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public String getIconSuffix() {
        return this.iconSuffix_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public ByteString getIconSuffixBytes() {
        return ByteString.copyFromUtf8(this.iconSuffix_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public MdlDynDraw getLinkPics() {
        MdlDynDraw mdlDynDraw = this.linkPics_;
        return mdlDynDraw == null ? MdlDynDraw.getDefaultInstance() : mdlDynDraw;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public String getLinkType() {
        return this.linkType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public ByteString getLinkTypeBytes() {
        return ByteString.copyFromUtf8(this.linkType_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public LinkNodeType getLinkTypeEnum() {
        LinkNodeType forNumber = LinkNodeType.forNumber(this.linkTypeEnum_);
        return forNumber == null ? LinkNodeType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public int getLinkTypeEnumValue() {
        return this.linkTypeEnum_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public NoteVideoTS getNoteVideoTs() {
        NoteVideoTS noteVideoTS = this.noteVideoTs_;
        return noteVideoTS == null ? NoteVideoTS.getDefaultInstance() : noteVideoTS;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public WordNode getShowText() {
        WordNode wordNode = this.showText_;
        return wordNode == null ? WordNode.getDefaultInstance() : wordNode;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    @Deprecated
    public long getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public boolean hasBizData() {
        return this.bizData_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public boolean hasGoodsItem() {
        return this.goodsItem_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public boolean hasLinkPics() {
        return this.linkPics_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public boolean hasNoteVideoTs() {
        return this.noteVideoTs_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u8
    public boolean hasShowText() {
        return this.showText_ != null;
    }

    public static C5642b newBuilder(LinkNode linkNode) {
        return DEFAULT_INSTANCE.createBuilder(linkNode);
    }

    public static LinkNode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkNode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkNode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkNode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkNode parseFrom(InputStream inputStream) throws IOException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkNode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkNode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkNode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
