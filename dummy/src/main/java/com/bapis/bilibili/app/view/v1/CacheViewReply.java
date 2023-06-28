package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Arc;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class CacheViewReply extends GeneratedMessageLite<CacheViewReply, CacheViewReply.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 10;
    private static final CacheViewReply DEFAULT_INSTANCE;
    public static final int DISLIKE_FIELD_NUMBER = 8;
    public static final int ELEC_RANK_FIELD_NUMBER = 6;
    public static final int HISTORY_FIELD_NUMBER = 7;
    public static final int ONLINE_FIELD_NUMBER = 14;
    public static final int OWNER_EXT_FIELD_NUMBER = 3;
    public static final int PAGES_FIELD_NUMBER = 2;
    private static volatile Parser<CacheViewReply> PARSER = null;
    public static final int PLAYER_ICON_FIELD_NUMBER = 9;
    public static final int REQ_USER_FIELD_NUMBER = 4;
    public static final int SEASON_FIELD_NUMBER = 5;
    public static final int SHARE_SUBTITLE_FIELD_NUMBER = 12;
    public static final int SHORT_LINK_FIELD_NUMBER = 11;
    public static final int TF_PANEL_CUSTOMIZED_FIELD_NUMBER = 13;
    private Arc arc_;
    private Dislike dislike_;
    private ElecRank elecRank_;
    private History history_;
    private Online online_;
    private OnwerExt ownerExt_;
    private PlayerIcon playerIcon_;
    private ReqUser reqUser_;
    private Season season_;
    private TFPanelCustomized tfPanelCustomized_;
    private Internal.ProtobufList<ViewPage> pages_ = GeneratedMessageLite.emptyProtobufList();
    private String bvid_ = "";
    private String shortLink_ = "";
    private String shareSubtitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CacheViewReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67291 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16704xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16704xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16704xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16704xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16704xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16704xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16704xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16704xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CacheViewReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67291 c67291) {
            this();
        }

        public Builder addAllPages(Iterable<? extends ViewPage> iterable) {
            copyOnWrite();
            ((CacheViewReply) this.instance).addAllPages(iterable);
            return this;
        }

        public Builder addPages(ViewPage viewPage) {
            copyOnWrite();
            ((CacheViewReply) this.instance).addPages(viewPage);
            return this;
        }

        public Builder clearArc() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearArc();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearBvid();
            return this;
        }

        public Builder clearDislike() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearDislike();
            return this;
        }

        public Builder clearElecRank() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearElecRank();
            return this;
        }

        public Builder clearHistory() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearHistory();
            return this;
        }

        public Builder clearOnline() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearOnline();
            return this;
        }

        public Builder clearOwnerExt() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearOwnerExt();
            return this;
        }

        public Builder clearPages() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearPages();
            return this;
        }

        public Builder clearPlayerIcon() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearPlayerIcon();
            return this;
        }

        public Builder clearReqUser() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearReqUser();
            return this;
        }

        public Builder clearSeason() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearSeason();
            return this;
        }

        public Builder clearShareSubtitle() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearShareSubtitle();
            return this;
        }

        public Builder clearShortLink() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearShortLink();
            return this;
        }

        public Builder clearTfPanelCustomized() {
            copyOnWrite();
            ((CacheViewReply) this.instance).clearTfPanelCustomized();
            return this;
        }

        public Arc getArc() {
            return ((CacheViewReply) this.instance).getArc();
        }

        public String getBvid() {
            return ((CacheViewReply) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((CacheViewReply) this.instance).getBvidBytes();
        }

        public Dislike getDislike() {
            return ((CacheViewReply) this.instance).getDislike();
        }

        public ElecRank getElecRank() {
            return ((CacheViewReply) this.instance).getElecRank();
        }

        public History getHistory() {
            return ((CacheViewReply) this.instance).getHistory();
        }

        public Online getOnline() {
            return ((CacheViewReply) this.instance).getOnline();
        }

        public OnwerExt getOwnerExt() {
            return ((CacheViewReply) this.instance).getOwnerExt();
        }

        public ViewPage getPages(int i) {
            return ((CacheViewReply) this.instance).getPages(i);
        }

        public int getPagesCount() {
            return ((CacheViewReply) this.instance).getPagesCount();
        }

        public List<ViewPage> getPagesList() {
            return Collections.unmodifiableList(((CacheViewReply) this.instance).getPagesList());
        }

        public PlayerIcon getPlayerIcon() {
            return ((CacheViewReply) this.instance).getPlayerIcon();
        }

        public ReqUser getReqUser() {
            return ((CacheViewReply) this.instance).getReqUser();
        }

        public Season getSeason() {
            return ((CacheViewReply) this.instance).getSeason();
        }

        public String getShareSubtitle() {
            return ((CacheViewReply) this.instance).getShareSubtitle();
        }

        public ByteString getShareSubtitleBytes() {
            return ((CacheViewReply) this.instance).getShareSubtitleBytes();
        }

        public String getShortLink() {
            return ((CacheViewReply) this.instance).getShortLink();
        }

        public ByteString getShortLinkBytes() {
            return ((CacheViewReply) this.instance).getShortLinkBytes();
        }

        public TFPanelCustomized getTfPanelCustomized() {
            return ((CacheViewReply) this.instance).getTfPanelCustomized();
        }

        public boolean hasArc() {
            return ((CacheViewReply) this.instance).hasArc();
        }

        public boolean hasDislike() {
            return ((CacheViewReply) this.instance).hasDislike();
        }

        public boolean hasElecRank() {
            return ((CacheViewReply) this.instance).hasElecRank();
        }

        public boolean hasHistory() {
            return ((CacheViewReply) this.instance).hasHistory();
        }

        public boolean hasOnline() {
            return ((CacheViewReply) this.instance).hasOnline();
        }

        public boolean hasOwnerExt() {
            return ((CacheViewReply) this.instance).hasOwnerExt();
        }

        public boolean hasPlayerIcon() {
            return ((CacheViewReply) this.instance).hasPlayerIcon();
        }

        public boolean hasReqUser() {
            return ((CacheViewReply) this.instance).hasReqUser();
        }

        public boolean hasSeason() {
            return ((CacheViewReply) this.instance).hasSeason();
        }

        public boolean hasTfPanelCustomized() {
            return ((CacheViewReply) this.instance).hasTfPanelCustomized();
        }

        public Builder mergeArc(Arc arc) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeArc(arc);
            return this;
        }

        public Builder mergeDislike(Dislike dislike) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeDislike(dislike);
            return this;
        }

        public Builder mergeElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeElecRank(elecRank);
            return this;
        }

        public Builder mergeHistory(History history) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeHistory(history);
            return this;
        }

        public Builder mergeOnline(Online online) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeOnline(online);
            return this;
        }

        public Builder mergeOwnerExt(OnwerExt onwerExt) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeOwnerExt(onwerExt);
            return this;
        }

        public Builder mergePlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergePlayerIcon(playerIcon);
            return this;
        }

        public Builder mergeReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeReqUser(reqUser);
            return this;
        }

        public Builder mergeSeason(Season season) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeSeason(season);
            return this;
        }

        public Builder mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((CacheViewReply) this.instance).mergeTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        public Builder removePages(int i) {
            copyOnWrite();
            ((CacheViewReply) this.instance).removePages(i);
            return this;
        }

        public Builder setArc(Arc arc) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setArc(arc);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setDislike(Dislike dislike) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setDislike(dislike);
            return this;
        }

        public Builder setElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setElecRank(elecRank);
            return this;
        }

        public Builder setHistory(History history) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setHistory(history);
            return this;
        }

        public Builder setOnline(Online online) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setOnline(online);
            return this;
        }

        public Builder setOwnerExt(OnwerExt onwerExt) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setOwnerExt(onwerExt);
            return this;
        }

        public Builder setPages(int i, ViewPage viewPage) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setPages(i, viewPage);
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setPlayerIcon(playerIcon);
            return this;
        }

        public Builder setReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setReqUser(reqUser);
            return this;
        }

        public Builder setSeason(Season season) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setSeason(season);
            return this;
        }

        public Builder setShareSubtitle(String str) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setShareSubtitle(str);
            return this;
        }

        public Builder setShareSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setShareSubtitleBytes(byteString);
            return this;
        }

        public Builder setShortLink(String str) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setShortLink(str);
            return this;
        }

        public Builder setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public Builder setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        private Builder() {
            super(CacheViewReply.DEFAULT_INSTANCE);
        }

        public Builder addPages(int i, ViewPage viewPage) {
            copyOnWrite();
            ((CacheViewReply) this.instance).addPages(i, viewPage);
            return this;
        }

        public Builder setArc(Arc.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setArc(builder.build());
            return this;
        }

        public Builder setDislike(Dislike.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setDislike(builder.build());
            return this;
        }

        public Builder setElecRank(ElecRank.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setElecRank(builder.build());
            return this;
        }

        public Builder setHistory(History.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setHistory(builder.build());
            return this;
        }

        public Builder setOnline(Online.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setOnline(builder.build());
            return this;
        }

        public Builder setOwnerExt(OnwerExt.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setOwnerExt(builder.build());
            return this;
        }

        public Builder setPages(int i, ViewPage.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setPages(i, builder.build());
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setPlayerIcon(builder.build());
            return this;
        }

        public Builder setReqUser(ReqUser.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setReqUser(builder.build());
            return this;
        }

        public Builder setSeason(Season.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setSeason(builder.build());
            return this;
        }

        public Builder setTfPanelCustomized(TFPanelCustomized.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).setTfPanelCustomized(builder.build());
            return this;
        }

        public Builder addPages(ViewPage.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).addPages(builder.build());
            return this;
        }

        public Builder addPages(int i, ViewPage.Builder builder) {
            copyOnWrite();
            ((CacheViewReply) this.instance).addPages(i, builder.build());
            return this;
        }
    }

    static {
        CacheViewReply cacheViewReply = new CacheViewReply();
        DEFAULT_INSTANCE = cacheViewReply;
        GeneratedMessageLite.registerDefaultInstance(CacheViewReply.class, cacheViewReply);
    }

    private CacheViewReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPages(Iterable<? extends ViewPage> iterable) {
        ensurePagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(viewPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArc() {
        this.arc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislike() {
        this.dislike_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElecRank() {
        this.elecRank_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnline() {
        this.online_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnerExt() {
        this.ownerExt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerIcon() {
        this.playerIcon_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqUser() {
        this.reqUser_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeason() {
        this.season_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareSubtitle() {
        this.shareSubtitle_ = getDefaultInstance().getShareSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortLink() {
        this.shortLink_ = getDefaultInstance().getShortLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTfPanelCustomized() {
        this.tfPanelCustomized_ = null;
    }

    private void ensurePagesIsMutable() {
        Internal.ProtobufList<ViewPage> protobufList = this.pages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.pages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CacheViewReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArc(Arc arc) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDislike(Dislike dislike) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElecRank(ElecRank elecRank) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHistory(History history) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnline(Online online) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOwnerExt(OnwerExt onwerExt) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerIcon(PlayerIcon playerIcon) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReqUser(ReqUser reqUser) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeason(Season season) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CacheViewReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CacheViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CacheViewReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CacheViewReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArc(Arc arc) {
        arc.getClass();
        this.arc_ = arc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislike(Dislike dislike) {
        dislike.getClass();
        this.dislike_ = dislike;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElecRank(ElecRank elecRank) {
        elecRank.getClass();
        this.elecRank_ = elecRank;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(History history) {
        history.getClass();
        this.history_ = history;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnline(Online online) {
        online.getClass();
        this.online_ = online;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerExt(OnwerExt onwerExt) {
        onwerExt.getClass();
        this.ownerExt_ = onwerExt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPages(int i, ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i, viewPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerIcon(PlayerIcon playerIcon) {
        playerIcon.getClass();
        this.playerIcon_ = playerIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqUser(ReqUser reqUser) {
        reqUser.getClass();
        this.reqUser_ = reqUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeason(Season season) {
        season.getClass();
        this.season_ = season;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitle(String str) {
        str.getClass();
        this.shareSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareSubtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLink(String str) {
        str.getClass();
        this.shortLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
        tFPanelCustomized.getClass();
        this.tfPanelCustomized_ = tFPanelCustomized;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67291.f16704xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CacheViewReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\u0208\u000b\u0208\f\u0208\r\t\u000e\t", new Object[]{"arc_", "pages_", ViewPage.class, "ownerExt_", "reqUser_", "season_", "elecRank_", "history_", "dislike_", "playerIcon_", "bvid_", "shortLink_", "shareSubtitle_", "tfPanelCustomized_", "online_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CacheViewReply> parser = PARSER;
                if (parser == null) {
                    synchronized (CacheViewReply.class) {
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

    public Arc getArc() {
        Arc arc = this.arc_;
        return arc == null ? Arc.getDefaultInstance() : arc;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public Dislike getDislike() {
        Dislike dislike = this.dislike_;
        return dislike == null ? Dislike.getDefaultInstance() : dislike;
    }

    public ElecRank getElecRank() {
        ElecRank elecRank = this.elecRank_;
        return elecRank == null ? ElecRank.getDefaultInstance() : elecRank;
    }

    public History getHistory() {
        History history = this.history_;
        return history == null ? History.getDefaultInstance() : history;
    }

    public Online getOnline() {
        Online online = this.online_;
        return online == null ? Online.getDefaultInstance() : online;
    }

    public OnwerExt getOwnerExt() {
        OnwerExt onwerExt = this.ownerExt_;
        return onwerExt == null ? OnwerExt.getDefaultInstance() : onwerExt;
    }

    public ViewPage getPages(int i) {
        return this.pages_.get(i);
    }

    public int getPagesCount() {
        return this.pages_.size();
    }

    public List<ViewPage> getPagesList() {
        return this.pages_;
    }

    public ViewPageOrBuilder getPagesOrBuilder(int i) {
        return this.pages_.get(i);
    }

    public List<? extends ViewPageOrBuilder> getPagesOrBuilderList() {
        return this.pages_;
    }

    public PlayerIcon getPlayerIcon() {
        PlayerIcon playerIcon = this.playerIcon_;
        return playerIcon == null ? PlayerIcon.getDefaultInstance() : playerIcon;
    }

    public ReqUser getReqUser() {
        ReqUser reqUser = this.reqUser_;
        return reqUser == null ? ReqUser.getDefaultInstance() : reqUser;
    }

    public Season getSeason() {
        Season season = this.season_;
        return season == null ? Season.getDefaultInstance() : season;
    }

    public String getShareSubtitle() {
        return this.shareSubtitle_;
    }

    public ByteString getShareSubtitleBytes() {
        return ByteString.copyFromUtf8(this.shareSubtitle_);
    }

    public String getShortLink() {
        return this.shortLink_;
    }

    public ByteString getShortLinkBytes() {
        return ByteString.copyFromUtf8(this.shortLink_);
    }

    public TFPanelCustomized getTfPanelCustomized() {
        TFPanelCustomized tFPanelCustomized = this.tfPanelCustomized_;
        return tFPanelCustomized == null ? TFPanelCustomized.getDefaultInstance() : tFPanelCustomized;
    }

    public boolean hasArc() {
        return this.arc_ != null;
    }

    public boolean hasDislike() {
        return this.dislike_ != null;
    }

    public boolean hasElecRank() {
        return this.elecRank_ != null;
    }

    public boolean hasHistory() {
        return this.history_ != null;
    }

    public boolean hasOnline() {
        return this.online_ != null;
    }

    public boolean hasOwnerExt() {
        return this.ownerExt_ != null;
    }

    public boolean hasPlayerIcon() {
        return this.playerIcon_ != null;
    }

    public boolean hasReqUser() {
        return this.reqUser_ != null;
    }

    public boolean hasSeason() {
        return this.season_ != null;
    }

    public boolean hasTfPanelCustomized() {
        return this.tfPanelCustomized_ != null;
    }

    public static Builder newBuilder(CacheViewReply cacheViewReply) {
        return DEFAULT_INSTANCE.createBuilder(cacheViewReply);
    }

    public static CacheViewReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CacheViewReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CacheViewReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(int i, ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i, viewPage);
    }

    public static CacheViewReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CacheViewReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CacheViewReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CacheViewReply parseFrom(InputStream inputStream) throws IOException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CacheViewReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CacheViewReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CacheViewReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
