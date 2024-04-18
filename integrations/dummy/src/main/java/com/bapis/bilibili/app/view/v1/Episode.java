package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Author;
import com.bapis.bilibili.app.archive.v1.Page;
import com.bapis.bilibili.app.archive.v1.Stat;
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
public final class Episode extends GeneratedMessageLite<Episode, Episode.Builder> implements EpisodeOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    public static final int AUTHOR_DESC_FIELD_NUMBER = 11;
    public static final int AUTHOR_FIELD_NUMBER = 10;
    public static final int BADGE_STYLE_FIELD_NUMBER = 12;
    public static final int BVID_FIELD_NUMBER = 9;
    public static final int CID_FIELD_NUMBER = 3;
    public static final int COVER_FIELD_NUMBER = 5;
    public static final int COVER_RIGHT_TEXT_FIELD_NUMBER = 6;
    private static final Episode DEFAULT_INSTANCE;
    public static final int EPISODE_PAY_FIELD_NUMBER = 14;
    public static final int FIRST_FRAME_FIELD_NUMBER = 16;
    public static final int FREE_WATCH_FIELD_NUMBER = 15;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NEED_PAY_FIELD_NUMBER = 13;
    public static final int PAGE_FIELD_NUMBER = 7;
    private static volatile Parser<Episode> PARSER = null;
    public static final int STAT_FIELD_NUMBER = 8;
    public static final int STAT_V2_FIELD_NUMBER = 17;
    public static final int TITLE_FIELD_NUMBER = 4;
    private long aid_;
    private Author author_;
    private BadgeStyle badgeStyle_;
    private long cid_;
    private boolean episodePay_;
    private boolean freeWatch_;
    private long id_;
    private boolean needPay_;
    private Page page_;
    private ArchiveStat statV2_;
    private Stat stat_;
    private String title_ = "";
    private String cover_ = "";
    private String coverRightText_ = "";
    private String bvid_ = "";
    private String authorDesc_ = "";
    private String firstFrame_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Episode$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16733xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16733xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16733xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16733xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16733xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16733xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16733xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16733xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Episode, Builder> implements EpisodeOrBuilder {
        /* synthetic */ Builder(C67611 c67611) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((Episode) this.instance).clearAid();
            return this;
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((Episode) this.instance).clearAuthor();
            return this;
        }

        public Builder clearAuthorDesc() {
            copyOnWrite();
            ((Episode) this.instance).clearAuthorDesc();
            return this;
        }

        public Builder clearBadgeStyle() {
            copyOnWrite();
            ((Episode) this.instance).clearBadgeStyle();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((Episode) this.instance).clearBvid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((Episode) this.instance).clearCid();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Episode) this.instance).clearCover();
            return this;
        }

        public Builder clearCoverRightText() {
            copyOnWrite();
            ((Episode) this.instance).clearCoverRightText();
            return this;
        }

        public Builder clearEpisodePay() {
            copyOnWrite();
            ((Episode) this.instance).clearEpisodePay();
            return this;
        }

        public Builder clearFirstFrame() {
            copyOnWrite();
            ((Episode) this.instance).clearFirstFrame();
            return this;
        }

        public Builder clearFreeWatch() {
            copyOnWrite();
            ((Episode) this.instance).clearFreeWatch();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Episode) this.instance).clearId();
            return this;
        }

        public Builder clearNeedPay() {
            copyOnWrite();
            ((Episode) this.instance).clearNeedPay();
            return this;
        }

        public Builder clearPage() {
            copyOnWrite();
            ((Episode) this.instance).clearPage();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((Episode) this.instance).clearStat();
            return this;
        }

        public Builder clearStatV2() {
            copyOnWrite();
            ((Episode) this.instance).clearStatV2();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Episode) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public long getAid() {
            return ((Episode) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public Author getAuthor() {
            return ((Episode) this.instance).getAuthor();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public String getAuthorDesc() {
            return ((Episode) this.instance).getAuthorDesc();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public ByteString getAuthorDescBytes() {
            return ((Episode) this.instance).getAuthorDescBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public BadgeStyle getBadgeStyle() {
            return ((Episode) this.instance).getBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public String getBvid() {
            return ((Episode) this.instance).getBvid();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public ByteString getBvidBytes() {
            return ((Episode) this.instance).getBvidBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public long getCid() {
            return ((Episode) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public String getCover() {
            return ((Episode) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public ByteString getCoverBytes() {
            return ((Episode) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public String getCoverRightText() {
            return ((Episode) this.instance).getCoverRightText();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public ByteString getCoverRightTextBytes() {
            return ((Episode) this.instance).getCoverRightTextBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean getEpisodePay() {
            return ((Episode) this.instance).getEpisodePay();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public String getFirstFrame() {
            return ((Episode) this.instance).getFirstFrame();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public ByteString getFirstFrameBytes() {
            return ((Episode) this.instance).getFirstFrameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean getFreeWatch() {
            return ((Episode) this.instance).getFreeWatch();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public long getId() {
            return ((Episode) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean getNeedPay() {
            return ((Episode) this.instance).getNeedPay();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public Page getPage() {
            return ((Episode) this.instance).getPage();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public Stat getStat() {
            return ((Episode) this.instance).getStat();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public ArchiveStat getStatV2() {
            return ((Episode) this.instance).getStatV2();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public String getTitle() {
            return ((Episode) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public ByteString getTitleBytes() {
            return ((Episode) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean hasAuthor() {
            return ((Episode) this.instance).hasAuthor();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean hasBadgeStyle() {
            return ((Episode) this.instance).hasBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean hasPage() {
            return ((Episode) this.instance).hasPage();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean hasStat() {
            return ((Episode) this.instance).hasStat();
        }

        @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
        public boolean hasStatV2() {
            return ((Episode) this.instance).hasStatV2();
        }

        public Builder mergeAuthor(Author author) {
            copyOnWrite();
            ((Episode) this.instance).mergeAuthor(author);
            return this;
        }

        public Builder mergeBadgeStyle(BadgeStyle badgeStyle) {
            copyOnWrite();
            ((Episode) this.instance).mergeBadgeStyle(badgeStyle);
            return this;
        }

        public Builder mergePage(Page page) {
            copyOnWrite();
            ((Episode) this.instance).mergePage(page);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((Episode) this.instance).mergeStat(stat);
            return this;
        }

        public Builder mergeStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((Episode) this.instance).mergeStatV2(archiveStat);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((Episode) this.instance).setAid(j);
            return this;
        }

        public Builder setAuthor(Author author) {
            copyOnWrite();
            ((Episode) this.instance).setAuthor(author);
            return this;
        }

        public Builder setAuthorDesc(String str) {
            copyOnWrite();
            ((Episode) this.instance).setAuthorDesc(str);
            return this;
        }

        public Builder setAuthorDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setAuthorDescBytes(byteString);
            return this;
        }

        public Builder setBadgeStyle(BadgeStyle badgeStyle) {
            copyOnWrite();
            ((Episode) this.instance).setBadgeStyle(badgeStyle);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((Episode) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((Episode) this.instance).setCid(j);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Episode) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setCoverRightText(String str) {
            copyOnWrite();
            ((Episode) this.instance).setCoverRightText(str);
            return this;
        }

        public Builder setCoverRightTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setCoverRightTextBytes(byteString);
            return this;
        }

        public Builder setEpisodePay(boolean z) {
            copyOnWrite();
            ((Episode) this.instance).setEpisodePay(z);
            return this;
        }

        public Builder setFirstFrame(String str) {
            copyOnWrite();
            ((Episode) this.instance).setFirstFrame(str);
            return this;
        }

        public Builder setFirstFrameBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setFirstFrameBytes(byteString);
            return this;
        }

        public Builder setFreeWatch(boolean z) {
            copyOnWrite();
            ((Episode) this.instance).setFreeWatch(z);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((Episode) this.instance).setId(j);
            return this;
        }

        public Builder setNeedPay(boolean z) {
            copyOnWrite();
            ((Episode) this.instance).setNeedPay(z);
            return this;
        }

        public Builder setPage(Page page) {
            copyOnWrite();
            ((Episode) this.instance).setPage(page);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((Episode) this.instance).setStat(stat);
            return this;
        }

        public Builder setStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((Episode) this.instance).setStatV2(archiveStat);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Episode) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Episode.DEFAULT_INSTANCE);
        }

        public Builder setAuthor(Author.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).setAuthor(builder.build());
            return this;
        }

        public Builder setBadgeStyle(BadgeStyle.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).setBadgeStyle(builder.build());
            return this;
        }

        public Builder setPage(Page.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).setPage(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).setStat(builder.build());
            return this;
        }

        public Builder setStatV2(ArchiveStat.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).setStatV2(builder.build());
            return this;
        }
    }

    static {
        Episode episode = new Episode();
        DEFAULT_INSTANCE = episode;
        GeneratedMessageLite.registerDefaultInstance(Episode.class, episode);
    }

    private Episode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthor() {
        this.author_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorDesc() {
        this.authorDesc_ = getDefaultInstance().getAuthorDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeStyle() {
        this.badgeStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverRightText() {
        this.coverRightText_ = getDefaultInstance().getCoverRightText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodePay() {
        this.episodePay_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstFrame() {
        this.firstFrame_ = getDefaultInstance().getFirstFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeWatch() {
        this.freeWatch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedPay() {
        this.needPay_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPage() {
        this.page_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatV2() {
        this.statV2_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Episode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthor(Author author) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadgeStyle(BadgeStyle badgeStyle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePage(Page page) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStat(Stat stat) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatV2(ArchiveStat archiveStat) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Episode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Episode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Episode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Episode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthor(Author author) {
        author.getClass();
        this.author_ = author;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorDesc(String str) {
        str.getClass();
        this.authorDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.authorDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeStyle(BadgeStyle badgeStyle) {
        badgeStyle.getClass();
        this.badgeStyle_ = badgeStyle;
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
    public void setCid(long j) {
        this.cid_ = j;
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
    public void setEpisodePay(boolean z) {
        this.episodePay_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstFrame(String str) {
        str.getClass();
        this.firstFrame_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstFrameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.firstFrame_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeWatch(boolean z) {
        this.freeWatch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedPay(boolean z) {
        this.needPay_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPage(Page page) {
        page.getClass();
        this.page_ = page;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatV2(ArchiveStat archiveStat) {
        archiveStat.getClass();
        this.statV2_ = archiveStat;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67611.f16733xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Episode();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0208\u0007\t\b\t\t\u0208\n\t\u000b\u0208\f\t\r\u0007\u000e\u0007\u000f\u0007\u0010\u0208\u0011\t", new Object[]{"id_", "aid_", "cid_", "title_", "cover_", "coverRightText_", "page_", "stat_", "bvid_", "author_", "authorDesc_", "badgeStyle_", "needPay_", "episodePay_", "freeWatch_", "firstFrame_", "statV2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Episode> parser = PARSER;
                if (parser == null) {
                    synchronized (Episode.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public Author getAuthor() {
        Author author = this.author_;
        return author == null ? Author.getDefaultInstance() : author;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public String getAuthorDesc() {
        return this.authorDesc_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public ByteString getAuthorDescBytes() {
        return ByteString.copyFromUtf8(this.authorDesc_);
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public BadgeStyle getBadgeStyle() {
        BadgeStyle badgeStyle = this.badgeStyle_;
        return badgeStyle == null ? BadgeStyle.getDefaultInstance() : badgeStyle;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public String getBvid() {
        return this.bvid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public String getCoverRightText() {
        return this.coverRightText_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public ByteString getCoverRightTextBytes() {
        return ByteString.copyFromUtf8(this.coverRightText_);
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean getEpisodePay() {
        return this.episodePay_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public String getFirstFrame() {
        return this.firstFrame_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public ByteString getFirstFrameBytes() {
        return ByteString.copyFromUtf8(this.firstFrame_);
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean getFreeWatch() {
        return this.freeWatch_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean getNeedPay() {
        return this.needPay_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public Page getPage() {
        Page page = this.page_;
        return page == null ? Page.getDefaultInstance() : page;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public ArchiveStat getStatV2() {
        ArchiveStat archiveStat = this.statV2_;
        return archiveStat == null ? ArchiveStat.getDefaultInstance() : archiveStat;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean hasAuthor() {
        return this.author_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean hasBadgeStyle() {
        return this.badgeStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean hasPage() {
        return this.page_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean hasStat() {
        return this.stat_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.EpisodeOrBuilder
    public boolean hasStatV2() {
        return this.statV2_ != null;
    }

    public static Builder newBuilder(Episode episode) {
        return DEFAULT_INSTANCE.createBuilder(episode);
    }

    public static Episode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Episode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Episode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Episode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Episode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Episode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Episode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Episode parseFrom(InputStream inputStream) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Episode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Episode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Episode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
