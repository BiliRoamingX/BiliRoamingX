package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Author;
import com.bapis.bilibili.app.archive.v1.Dimension;
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
public final class Relate extends GeneratedMessageLite<Relate, Relate.Builder> implements RelateOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int AUTHOR_FIELD_NUMBER = 4;
    public static final int BADGE_FIELD_NUMBER = 16;
    public static final int BADGE_STYLE_FIELD_NUMBER = 38;
    public static final int BUTTON_FIELD_NUMBER = 23;
    public static final int CID_FIELD_NUMBER = 17;
    public static final int CM_FIELD_NUMBER = 28;
    public static final int COVER_FIELD_NUMBER = 37;
    public static final int COVER_GIF_FIELD_NUMBER = 27;
    private static final Relate DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 14;
    public static final int DIMENSION_FIELD_NUMBER = 36;
    public static final int DISLIKE_REPORT_DATA_FIELD_NUMBER = 41;
    public static final int DURATION_FIELD_NUMBER = 6;
    public static final int FIRST_FRAME_FIELD_NUMBER = 43;
    public static final int FROM_FIELD_NUMBER = 13;
    public static final int FROM_SOURCE_ID_FIELD_NUMBER = 35;
    public static final int FROM_SOURCE_TYPE_FIELD_NUMBER = 34;
    public static final int GAME_RECOMMEND_REASON_FIELD_NUMBER = 44;
    public static final int GOTO_FIELD_NUMBER = 7;
    public static final int JUMP_URL_FIELD_NUMBER = 10;
    public static final int LIVE_INFO_FIELD_NUMBER = 46;
    public static final int MATERIAL_ID_FIELD_NUMBER = 33;
    public static final int NEW_CARD_FIELD_NUMBER = 25;
    public static final int NOTICE_FIELD_NUMBER = 22;
    public static final int PACK_INFO_FIELD_NUMBER = 21;
    public static final int PARAM_FIELD_NUMBER = 8;
    private static volatile Parser<Relate> PARSER = null;
    public static final int PIC_FIELD_NUMBER = 2;
    public static final int POWER_ICON_STYLE_FIELD_NUMBER = 39;
    public static final int RANK_INFO_GAME_FIELD_NUMBER = 42;
    public static final int RATING_COUNT_FIELD_NUMBER = 19;
    public static final int RATING_FIELD_NUMBER = 11;
    public static final int RCMD_REASON_EXTRA_FIELD_NUMBER = 30;
    public static final int RCMD_REASON_FIELD_NUMBER = 15;
    public static final int RCMD_REASON_STYLE_FIELD_NUMBER = 26;
    public static final int REC_THREE_POINT_FIELD_NUMBER = 31;
    public static final int RESERVE_FIELD_NUMBER = 12;
    public static final int RESERVE_STATUS_FIELD_NUMBER = 29;
    public static final int RESERVE_STATUS_TEXT_FIELD_NUMBER = 40;
    public static final int SEASON_TYPE_FIELD_NUMBER = 18;
    public static final int STAT_FIELD_NUMBER = 5;
    public static final int STAT_V2_FIELD_NUMBER = 47;
    public static final int TAG_NAME_FIELD_NUMBER = 20;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TRACKID_FIELD_NUMBER = 24;
    public static final int UNIQUE_ID_FIELD_NUMBER = 32;
    public static final int URI_FIELD_NUMBER = 9;
    public static final int WIKI_INFO_GAME_FIELD_NUMBER = 45;
    private long aid_;
    private Author author_;
    private ReasonStyle badgeStyle_;
    private Button button_;
    private long cid_;
    private CM cm_;
    private Dimension dimension_;
    private long duration_;
    private long fromSourceType_;
    private LiveInfo liveInfo_;
    private long materialId_;
    private int newCard_;
    private Notice notice_;
    private PackInfo packInfo_;
    private PowerIconStyle powerIconStyle_;
    private RankInfo rankInfoGame_;
    private int ratingCount_;
    private double rating_;
    private ReasonStyle rcmdReasonStyle_;
    private RecThreePoint recThreePoint_;
    private long reserveStatus_;
    private int seasonType_;
    private ArchiveStat statV2_;
    private Stat stat_;
    private WikiInfo wikiInfoGame_;
    private String pic_ = "";
    private String title_ = "";
    private String goto_ = "";
    private String param_ = "";
    private String uri_ = "";
    private String jumpUrl_ = "";
    private String reserve_ = "";
    private String from_ = "";
    private String desc_ = "";
    private String rcmdReason_ = "";
    private String badge_ = "";
    private String tagName_ = "";
    private String trackid_ = "";
    private String coverGif_ = "";
    private String rcmdReasonExtra_ = "";
    private String uniqueId_ = "";
    private String fromSourceId_ = "";
    private String cover_ = "";
    private String reserveStatusText_ = "";
    private String dislikeReportData_ = "";
    private String firstFrame_ = "";
    private String gameRecommendReason_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Relate$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68401 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16800xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16800xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16800xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16800xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16800xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16800xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16800xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16800xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Relate, Builder> implements RelateOrBuilder {
        /* synthetic */ Builder(C68401 c68401) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((Relate) this.instance).clearAid();
            return this;
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((Relate) this.instance).clearAuthor();
            return this;
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((Relate) this.instance).clearBadge();
            return this;
        }

        public Builder clearBadgeStyle() {
            copyOnWrite();
            ((Relate) this.instance).clearBadgeStyle();
            return this;
        }

        public Builder clearButton() {
            copyOnWrite();
            ((Relate) this.instance).clearButton();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((Relate) this.instance).clearCid();
            return this;
        }

        public Builder clearCm() {
            copyOnWrite();
            ((Relate) this.instance).clearCm();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Relate) this.instance).clearCover();
            return this;
        }

        public Builder clearCoverGif() {
            copyOnWrite();
            ((Relate) this.instance).clearCoverGif();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((Relate) this.instance).clearDesc();
            return this;
        }

        public Builder clearDimension() {
            copyOnWrite();
            ((Relate) this.instance).clearDimension();
            return this;
        }

        public Builder clearDislikeReportData() {
            copyOnWrite();
            ((Relate) this.instance).clearDislikeReportData();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((Relate) this.instance).clearDuration();
            return this;
        }

        public Builder clearFirstFrame() {
            copyOnWrite();
            ((Relate) this.instance).clearFirstFrame();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((Relate) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSourceId() {
            copyOnWrite();
            ((Relate) this.instance).clearFromSourceId();
            return this;
        }

        public Builder clearFromSourceType() {
            copyOnWrite();
            ((Relate) this.instance).clearFromSourceType();
            return this;
        }

        public Builder clearGameRecommendReason() {
            copyOnWrite();
            ((Relate) this.instance).clearGameRecommendReason();
            return this;
        }

        public Builder clearGoto() {
            copyOnWrite();
            ((Relate) this.instance).clearGoto();
            return this;
        }

        public Builder clearJumpUrl() {
            copyOnWrite();
            ((Relate) this.instance).clearJumpUrl();
            return this;
        }

        public Builder clearLiveInfo() {
            copyOnWrite();
            ((Relate) this.instance).clearLiveInfo();
            return this;
        }

        public Builder clearMaterialId() {
            copyOnWrite();
            ((Relate) this.instance).clearMaterialId();
            return this;
        }

        public Builder clearNewCard() {
            copyOnWrite();
            ((Relate) this.instance).clearNewCard();
            return this;
        }

        public Builder clearNotice() {
            copyOnWrite();
            ((Relate) this.instance).clearNotice();
            return this;
        }

        public Builder clearPackInfo() {
            copyOnWrite();
            ((Relate) this.instance).clearPackInfo();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((Relate) this.instance).clearParam();
            return this;
        }

        public Builder clearPic() {
            copyOnWrite();
            ((Relate) this.instance).clearPic();
            return this;
        }

        public Builder clearPowerIconStyle() {
            copyOnWrite();
            ((Relate) this.instance).clearPowerIconStyle();
            return this;
        }

        public Builder clearRankInfoGame() {
            copyOnWrite();
            ((Relate) this.instance).clearRankInfoGame();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((Relate) this.instance).clearRating();
            return this;
        }

        public Builder clearRatingCount() {
            copyOnWrite();
            ((Relate) this.instance).clearRatingCount();
            return this;
        }

        public Builder clearRcmdReason() {
            copyOnWrite();
            ((Relate) this.instance).clearRcmdReason();
            return this;
        }

        public Builder clearRcmdReasonExtra() {
            copyOnWrite();
            ((Relate) this.instance).clearRcmdReasonExtra();
            return this;
        }

        public Builder clearRcmdReasonStyle() {
            copyOnWrite();
            ((Relate) this.instance).clearRcmdReasonStyle();
            return this;
        }

        public Builder clearRecThreePoint() {
            copyOnWrite();
            ((Relate) this.instance).clearRecThreePoint();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((Relate) this.instance).clearReserve();
            return this;
        }

        public Builder clearReserveStatus() {
            copyOnWrite();
            ((Relate) this.instance).clearReserveStatus();
            return this;
        }

        public Builder clearReserveStatusText() {
            copyOnWrite();
            ((Relate) this.instance).clearReserveStatusText();
            return this;
        }

        public Builder clearSeasonType() {
            copyOnWrite();
            ((Relate) this.instance).clearSeasonType();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((Relate) this.instance).clearStat();
            return this;
        }

        public Builder clearStatV2() {
            copyOnWrite();
            ((Relate) this.instance).clearStatV2();
            return this;
        }

        public Builder clearTagName() {
            copyOnWrite();
            ((Relate) this.instance).clearTagName();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Relate) this.instance).clearTitle();
            return this;
        }

        public Builder clearTrackid() {
            copyOnWrite();
            ((Relate) this.instance).clearTrackid();
            return this;
        }

        public Builder clearUniqueId() {
            copyOnWrite();
            ((Relate) this.instance).clearUniqueId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((Relate) this.instance).clearUri();
            return this;
        }

        public Builder clearWikiInfoGame() {
            copyOnWrite();
            ((Relate) this.instance).clearWikiInfoGame();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public long getAid() {
            return ((Relate) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public Author getAuthor() {
            return ((Relate) this.instance).getAuthor();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getBadge() {
            return ((Relate) this.instance).getBadge();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getBadgeBytes() {
            return ((Relate) this.instance).getBadgeBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ReasonStyle getBadgeStyle() {
            return ((Relate) this.instance).getBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public Button getButton() {
            return ((Relate) this.instance).getButton();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public long getCid() {
            return ((Relate) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public CM getCm() {
            return ((Relate) this.instance).getCm();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getCover() {
            return ((Relate) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getCoverBytes() {
            return ((Relate) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getCoverGif() {
            return ((Relate) this.instance).getCoverGif();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getCoverGifBytes() {
            return ((Relate) this.instance).getCoverGifBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getDesc() {
            return ((Relate) this.instance).getDesc();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getDescBytes() {
            return ((Relate) this.instance).getDescBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public Dimension getDimension() {
            return ((Relate) this.instance).getDimension();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getDislikeReportData() {
            return ((Relate) this.instance).getDislikeReportData();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getDislikeReportDataBytes() {
            return ((Relate) this.instance).getDislikeReportDataBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public long getDuration() {
            return ((Relate) this.instance).getDuration();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getFirstFrame() {
            return ((Relate) this.instance).getFirstFrame();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getFirstFrameBytes() {
            return ((Relate) this.instance).getFirstFrameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getFrom() {
            return ((Relate) this.instance).getFrom();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getFromBytes() {
            return ((Relate) this.instance).getFromBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getFromSourceId() {
            return ((Relate) this.instance).getFromSourceId();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getFromSourceIdBytes() {
            return ((Relate) this.instance).getFromSourceIdBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public long getFromSourceType() {
            return ((Relate) this.instance).getFromSourceType();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getGameRecommendReason() {
            return ((Relate) this.instance).getGameRecommendReason();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getGameRecommendReasonBytes() {
            return ((Relate) this.instance).getGameRecommendReasonBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getGoto() {
            return ((Relate) this.instance).getGoto();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getGotoBytes() {
            return ((Relate) this.instance).getGotoBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getJumpUrl() {
            return ((Relate) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getJumpUrlBytes() {
            return ((Relate) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public LiveInfo getLiveInfo() {
            return ((Relate) this.instance).getLiveInfo();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public long getMaterialId() {
            return ((Relate) this.instance).getMaterialId();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public int getNewCard() {
            return ((Relate) this.instance).getNewCard();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public Notice getNotice() {
            return ((Relate) this.instance).getNotice();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public PackInfo getPackInfo() {
            return ((Relate) this.instance).getPackInfo();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getParam() {
            return ((Relate) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getParamBytes() {
            return ((Relate) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getPic() {
            return ((Relate) this.instance).getPic();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getPicBytes() {
            return ((Relate) this.instance).getPicBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public PowerIconStyle getPowerIconStyle() {
            return ((Relate) this.instance).getPowerIconStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public RankInfo getRankInfoGame() {
            return ((Relate) this.instance).getRankInfoGame();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public double getRating() {
            return ((Relate) this.instance).getRating();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public int getRatingCount() {
            return ((Relate) this.instance).getRatingCount();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getRcmdReason() {
            return ((Relate) this.instance).getRcmdReason();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getRcmdReasonBytes() {
            return ((Relate) this.instance).getRcmdReasonBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getRcmdReasonExtra() {
            return ((Relate) this.instance).getRcmdReasonExtra();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getRcmdReasonExtraBytes() {
            return ((Relate) this.instance).getRcmdReasonExtraBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ReasonStyle getRcmdReasonStyle() {
            return ((Relate) this.instance).getRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public RecThreePoint getRecThreePoint() {
            return ((Relate) this.instance).getRecThreePoint();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getReserve() {
            return ((Relate) this.instance).getReserve();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getReserveBytes() {
            return ((Relate) this.instance).getReserveBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public long getReserveStatus() {
            return ((Relate) this.instance).getReserveStatus();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getReserveStatusText() {
            return ((Relate) this.instance).getReserveStatusText();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getReserveStatusTextBytes() {
            return ((Relate) this.instance).getReserveStatusTextBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public int getSeasonType() {
            return ((Relate) this.instance).getSeasonType();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public Stat getStat() {
            return ((Relate) this.instance).getStat();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ArchiveStat getStatV2() {
            return ((Relate) this.instance).getStatV2();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getTagName() {
            return ((Relate) this.instance).getTagName();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getTagNameBytes() {
            return ((Relate) this.instance).getTagNameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getTitle() {
            return ((Relate) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getTitleBytes() {
            return ((Relate) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getTrackid() {
            return ((Relate) this.instance).getTrackid();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getTrackidBytes() {
            return ((Relate) this.instance).getTrackidBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getUniqueId() {
            return ((Relate) this.instance).getUniqueId();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getUniqueIdBytes() {
            return ((Relate) this.instance).getUniqueIdBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public String getUri() {
            return ((Relate) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public ByteString getUriBytes() {
            return ((Relate) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public WikiInfo getWikiInfoGame() {
            return ((Relate) this.instance).getWikiInfoGame();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasAuthor() {
            return ((Relate) this.instance).hasAuthor();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasBadgeStyle() {
            return ((Relate) this.instance).hasBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasButton() {
            return ((Relate) this.instance).hasButton();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasCm() {
            return ((Relate) this.instance).hasCm();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasDimension() {
            return ((Relate) this.instance).hasDimension();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasLiveInfo() {
            return ((Relate) this.instance).hasLiveInfo();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasNotice() {
            return ((Relate) this.instance).hasNotice();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasPackInfo() {
            return ((Relate) this.instance).hasPackInfo();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasPowerIconStyle() {
            return ((Relate) this.instance).hasPowerIconStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasRankInfoGame() {
            return ((Relate) this.instance).hasRankInfoGame();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasRcmdReasonStyle() {
            return ((Relate) this.instance).hasRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasRecThreePoint() {
            return ((Relate) this.instance).hasRecThreePoint();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasStat() {
            return ((Relate) this.instance).hasStat();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasStatV2() {
            return ((Relate) this.instance).hasStatV2();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
        public boolean hasWikiInfoGame() {
            return ((Relate) this.instance).hasWikiInfoGame();
        }

        public Builder mergeAuthor(Author author) {
            copyOnWrite();
            ((Relate) this.instance).mergeAuthor(author);
            return this;
        }

        public Builder mergeBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((Relate) this.instance).mergeBadgeStyle(reasonStyle);
            return this;
        }

        public Builder mergeButton(Button button) {
            copyOnWrite();
            ((Relate) this.instance).mergeButton(button);
            return this;
        }

        public Builder mergeCm(CM cm) {
            copyOnWrite();
            ((Relate) this.instance).mergeCm(cm);
            return this;
        }

        public Builder mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((Relate) this.instance).mergeDimension(dimension);
            return this;
        }

        public Builder mergeLiveInfo(LiveInfo liveInfo) {
            copyOnWrite();
            ((Relate) this.instance).mergeLiveInfo(liveInfo);
            return this;
        }

        public Builder mergeNotice(Notice notice) {
            copyOnWrite();
            ((Relate) this.instance).mergeNotice(notice);
            return this;
        }

        public Builder mergePackInfo(PackInfo packInfo) {
            copyOnWrite();
            ((Relate) this.instance).mergePackInfo(packInfo);
            return this;
        }

        public Builder mergePowerIconStyle(PowerIconStyle powerIconStyle) {
            copyOnWrite();
            ((Relate) this.instance).mergePowerIconStyle(powerIconStyle);
            return this;
        }

        public Builder mergeRankInfoGame(RankInfo rankInfo) {
            copyOnWrite();
            ((Relate) this.instance).mergeRankInfoGame(rankInfo);
            return this;
        }

        public Builder mergeRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((Relate) this.instance).mergeRcmdReasonStyle(reasonStyle);
            return this;
        }

        public Builder mergeRecThreePoint(RecThreePoint recThreePoint) {
            copyOnWrite();
            ((Relate) this.instance).mergeRecThreePoint(recThreePoint);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((Relate) this.instance).mergeStat(stat);
            return this;
        }

        public Builder mergeStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((Relate) this.instance).mergeStatV2(archiveStat);
            return this;
        }

        public Builder mergeWikiInfoGame(WikiInfo wikiInfo) {
            copyOnWrite();
            ((Relate) this.instance).mergeWikiInfoGame(wikiInfo);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((Relate) this.instance).setAid(j);
            return this;
        }

        public Builder setAuthor(Author author) {
            copyOnWrite();
            ((Relate) this.instance).setAuthor(author);
            return this;
        }

        public Builder setBadge(String str) {
            copyOnWrite();
            ((Relate) this.instance).setBadge(str);
            return this;
        }

        public Builder setBadgeBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setBadgeBytes(byteString);
            return this;
        }

        public Builder setBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((Relate) this.instance).setBadgeStyle(reasonStyle);
            return this;
        }

        public Builder setButton(Button button) {
            copyOnWrite();
            ((Relate) this.instance).setButton(button);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((Relate) this.instance).setCid(j);
            return this;
        }

        public Builder setCm(CM cm) {
            copyOnWrite();
            ((Relate) this.instance).setCm(cm);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Relate) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setCoverGif(String str) {
            copyOnWrite();
            ((Relate) this.instance).setCoverGif(str);
            return this;
        }

        public Builder setCoverGifBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setCoverGifBytes(byteString);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((Relate) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setDimension(Dimension dimension) {
            copyOnWrite();
            ((Relate) this.instance).setDimension(dimension);
            return this;
        }

        public Builder setDislikeReportData(String str) {
            copyOnWrite();
            ((Relate) this.instance).setDislikeReportData(str);
            return this;
        }

        public Builder setDislikeReportDataBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setDislikeReportDataBytes(byteString);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((Relate) this.instance).setDuration(j);
            return this;
        }

        public Builder setFirstFrame(String str) {
            copyOnWrite();
            ((Relate) this.instance).setFirstFrame(str);
            return this;
        }

        public Builder setFirstFrameBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setFirstFrameBytes(byteString);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((Relate) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSourceId(String str) {
            copyOnWrite();
            ((Relate) this.instance).setFromSourceId(str);
            return this;
        }

        public Builder setFromSourceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setFromSourceIdBytes(byteString);
            return this;
        }

        public Builder setFromSourceType(long j) {
            copyOnWrite();
            ((Relate) this.instance).setFromSourceType(j);
            return this;
        }

        public Builder setGameRecommendReason(String str) {
            copyOnWrite();
            ((Relate) this.instance).setGameRecommendReason(str);
            return this;
        }

        public Builder setGameRecommendReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setGameRecommendReasonBytes(byteString);
            return this;
        }

        public Builder setGoto(String str) {
            copyOnWrite();
            ((Relate) this.instance).setGoto(str);
            return this;
        }

        public Builder setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setGotoBytes(byteString);
            return this;
        }

        public Builder setJumpUrl(String str) {
            copyOnWrite();
            ((Relate) this.instance).setJumpUrl(str);
            return this;
        }

        public Builder setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public Builder setLiveInfo(LiveInfo liveInfo) {
            copyOnWrite();
            ((Relate) this.instance).setLiveInfo(liveInfo);
            return this;
        }

        public Builder setMaterialId(long j) {
            copyOnWrite();
            ((Relate) this.instance).setMaterialId(j);
            return this;
        }

        public Builder setNewCard(int i) {
            copyOnWrite();
            ((Relate) this.instance).setNewCard(i);
            return this;
        }

        public Builder setNotice(Notice notice) {
            copyOnWrite();
            ((Relate) this.instance).setNotice(notice);
            return this;
        }

        public Builder setPackInfo(PackInfo packInfo) {
            copyOnWrite();
            ((Relate) this.instance).setPackInfo(packInfo);
            return this;
        }

        public Builder setParam(String str) {
            copyOnWrite();
            ((Relate) this.instance).setParam(str);
            return this;
        }

        public Builder setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setParamBytes(byteString);
            return this;
        }

        public Builder setPic(String str) {
            copyOnWrite();
            ((Relate) this.instance).setPic(str);
            return this;
        }

        public Builder setPicBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setPicBytes(byteString);
            return this;
        }

        public Builder setPowerIconStyle(PowerIconStyle powerIconStyle) {
            copyOnWrite();
            ((Relate) this.instance).setPowerIconStyle(powerIconStyle);
            return this;
        }

        public Builder setRankInfoGame(RankInfo rankInfo) {
            copyOnWrite();
            ((Relate) this.instance).setRankInfoGame(rankInfo);
            return this;
        }

        public Builder setRating(double d) {
            copyOnWrite();
            ((Relate) this.instance).setRating(d);
            return this;
        }

        public Builder setRatingCount(int i) {
            copyOnWrite();
            ((Relate) this.instance).setRatingCount(i);
            return this;
        }

        public Builder setRcmdReason(String str) {
            copyOnWrite();
            ((Relate) this.instance).setRcmdReason(str);
            return this;
        }

        public Builder setRcmdReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setRcmdReasonBytes(byteString);
            return this;
        }

        public Builder setRcmdReasonExtra(String str) {
            copyOnWrite();
            ((Relate) this.instance).setRcmdReasonExtra(str);
            return this;
        }

        public Builder setRcmdReasonExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setRcmdReasonExtraBytes(byteString);
            return this;
        }

        public Builder setRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((Relate) this.instance).setRcmdReasonStyle(reasonStyle);
            return this;
        }

        public Builder setRecThreePoint(RecThreePoint recThreePoint) {
            copyOnWrite();
            ((Relate) this.instance).setRecThreePoint(recThreePoint);
            return this;
        }

        public Builder setReserve(String str) {
            copyOnWrite();
            ((Relate) this.instance).setReserve(str);
            return this;
        }

        public Builder setReserveBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setReserveBytes(byteString);
            return this;
        }

        public Builder setReserveStatus(long j) {
            copyOnWrite();
            ((Relate) this.instance).setReserveStatus(j);
            return this;
        }

        public Builder setReserveStatusText(String str) {
            copyOnWrite();
            ((Relate) this.instance).setReserveStatusText(str);
            return this;
        }

        public Builder setReserveStatusTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setReserveStatusTextBytes(byteString);
            return this;
        }

        public Builder setSeasonType(int i) {
            copyOnWrite();
            ((Relate) this.instance).setSeasonType(i);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((Relate) this.instance).setStat(stat);
            return this;
        }

        public Builder setStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((Relate) this.instance).setStatV2(archiveStat);
            return this;
        }

        public Builder setTagName(String str) {
            copyOnWrite();
            ((Relate) this.instance).setTagName(str);
            return this;
        }

        public Builder setTagNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setTagNameBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Relate) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTrackid(String str) {
            copyOnWrite();
            ((Relate) this.instance).setTrackid(str);
            return this;
        }

        public Builder setTrackidBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setTrackidBytes(byteString);
            return this;
        }

        public Builder setUniqueId(String str) {
            copyOnWrite();
            ((Relate) this.instance).setUniqueId(str);
            return this;
        }

        public Builder setUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setUniqueIdBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Relate) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Relate) this.instance).setUriBytes(byteString);
            return this;
        }

        public Builder setWikiInfoGame(WikiInfo wikiInfo) {
            copyOnWrite();
            ((Relate) this.instance).setWikiInfoGame(wikiInfo);
            return this;
        }

        private Builder() {
            super(Relate.DEFAULT_INSTANCE);
        }

        public Builder setAuthor(Author.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setAuthor(builder.build());
            return this;
        }

        public Builder setBadgeStyle(ReasonStyle.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setBadgeStyle(builder.build());
            return this;
        }

        public Builder setButton(Button.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setButton(builder.build());
            return this;
        }

        public Builder setCm(CM.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setCm(builder.build());
            return this;
        }

        public Builder setDimension(Dimension.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setDimension(builder.build());
            return this;
        }

        public Builder setLiveInfo(LiveInfo.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setLiveInfo(builder.build());
            return this;
        }

        public Builder setNotice(Notice.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setNotice(builder.build());
            return this;
        }

        public Builder setPackInfo(PackInfo.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setPackInfo(builder.build());
            return this;
        }

        public Builder setPowerIconStyle(PowerIconStyle.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setPowerIconStyle(builder.build());
            return this;
        }

        public Builder setRankInfoGame(RankInfo.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setRankInfoGame(builder.build());
            return this;
        }

        public Builder setRcmdReasonStyle(ReasonStyle.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setRcmdReasonStyle(builder.build());
            return this;
        }

        public Builder setRecThreePoint(RecThreePoint.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setRecThreePoint(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setStat(builder.build());
            return this;
        }

        public Builder setStatV2(ArchiveStat.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setStatV2(builder.build());
            return this;
        }

        public Builder setWikiInfoGame(WikiInfo.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setWikiInfoGame(builder.build());
            return this;
        }
    }

    static {
        Relate relate = new Relate();
        DEFAULT_INSTANCE = relate;
        GeneratedMessageLite.registerDefaultInstance(Relate.class, relate);
    }

    private Relate() {
    }

    public void clearAid() {
        this.aid_ = 0L;
    }

    public void clearAuthor() {
        this.author_ = null;
    }

    public void clearBadge() {
        this.badge_ = getDefaultInstance().getBadge();
    }

    public void clearBadgeStyle() {
        this.badgeStyle_ = null;
    }

    public void clearButton() {
        this.button_ = null;
    }

    public void clearCid() {
        this.cid_ = 0L;
    }

    public void clearCm() {
        this.cm_ = null;
    }

    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    public void clearCoverGif() {
        this.coverGif_ = getDefaultInstance().getCoverGif();
    }

    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    public void clearDimension() {
        this.dimension_ = null;
    }

    public void clearDislikeReportData() {
        this.dislikeReportData_ = getDefaultInstance().getDislikeReportData();
    }

    public void clearDuration() {
        this.duration_ = 0L;
    }

    public void clearFirstFrame() {
        this.firstFrame_ = getDefaultInstance().getFirstFrame();
    }

    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    public void clearFromSourceId() {
        this.fromSourceId_ = getDefaultInstance().getFromSourceId();
    }

    public void clearFromSourceType() {
        this.fromSourceType_ = 0L;
    }

    public void clearGameRecommendReason() {
        this.gameRecommendReason_ = getDefaultInstance().getGameRecommendReason();
    }

    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    public void clearLiveInfo() {
        this.liveInfo_ = null;
    }

    public void clearMaterialId() {
        this.materialId_ = 0L;
    }

    public void clearNewCard() {
        this.newCard_ = 0;
    }

    public void clearNotice() {
        this.notice_ = null;
    }

    public void clearPackInfo() {
        this.packInfo_ = null;
    }

    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    public void clearPic() {
        this.pic_ = getDefaultInstance().getPic();
    }

    public void clearPowerIconStyle() {
        this.powerIconStyle_ = null;
    }

    public void clearRankInfoGame() {
        this.rankInfoGame_ = null;
    }

    public void clearRating() {
        this.rating_ = 0.0d;
    }

    public void clearRatingCount() {
        this.ratingCount_ = 0;
    }

    public void clearRcmdReason() {
        this.rcmdReason_ = getDefaultInstance().getRcmdReason();
    }

    public void clearRcmdReasonExtra() {
        this.rcmdReasonExtra_ = getDefaultInstance().getRcmdReasonExtra();
    }

    public void clearRcmdReasonStyle() {
        this.rcmdReasonStyle_ = null;
    }

    public void clearRecThreePoint() {
        this.recThreePoint_ = null;
    }

    public void clearReserve() {
        this.reserve_ = getDefaultInstance().getReserve();
    }

    public void clearReserveStatus() {
        this.reserveStatus_ = 0L;
    }

    public void clearReserveStatusText() {
        this.reserveStatusText_ = getDefaultInstance().getReserveStatusText();
    }

    public void clearSeasonType() {
        this.seasonType_ = 0;
    }

    public void clearStat() {
        this.stat_ = null;
    }

    public void clearStatV2() {
        this.statV2_ = null;
    }

    public void clearTagName() {
        this.tagName_ = getDefaultInstance().getTagName();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearTrackid() {
        this.trackid_ = getDefaultInstance().getTrackid();
    }

    public void clearUniqueId() {
        this.uniqueId_ = getDefaultInstance().getUniqueId();
    }

    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public void clearWikiInfoGame() {
        this.wikiInfoGame_ = null;
    }

    public static Relate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAuthor(Author author) {
    }

    public void mergeBadgeStyle(ReasonStyle reasonStyle) {
    }

    public void mergeButton(Button button) {
    }

    public void mergeCm(CM cm) {
    }

    public void mergeDimension(Dimension dimension) {
    }

    public void mergeLiveInfo(LiveInfo liveInfo) {
    }

    public void mergeNotice(Notice notice) {
    }

    public void mergePackInfo(PackInfo packInfo) {
    }

    public void mergePowerIconStyle(PowerIconStyle powerIconStyle) {
    }

    public void mergeRankInfoGame(RankInfo rankInfo) {
    }

    public void mergeRcmdReasonStyle(ReasonStyle reasonStyle) {
   }

    public void mergeRecThreePoint(RecThreePoint recThreePoint) {
    }

    public void mergeStat(Stat stat) {
    }

    public void mergeStatV2(ArchiveStat archiveStat) {
    }

    public void mergeWikiInfoGame(WikiInfo wikiInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Relate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Relate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Relate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAid(long j) {
        this.aid_ = j;
    }

    public void setAuthor(Author author) {
        author.getClass();
        this.author_ = author;
    }

    public void setBadge(String str) {
        str.getClass();
        this.badge_ = str;
    }

    public void setBadgeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badge_ = byteString.toStringUtf8();
    }

    public void setBadgeStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.badgeStyle_ = reasonStyle;
    }

    public void setButton(Button button) {
        button.getClass();
        this.button_ = button;
    }

    public void setCid(long j) {
        this.cid_ = j;
    }

    public void setCm(CM cm) {
        cm.getClass();
        this.cm_ = cm;
    }

    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    public void setCoverGif(String str) {
        str.getClass();
        this.coverGif_ = str;
    }

    public void setCoverGifBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverGif_ = byteString.toStringUtf8();
    }

    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    public void setDislikeReportData(String str) {
        str.getClass();
        this.dislikeReportData_ = str;
    }

    public void setDislikeReportDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dislikeReportData_ = byteString.toStringUtf8();
    }

    public void setDuration(long j) {
        this.duration_ = j;
    }

    public void setFirstFrame(String str) {
        str.getClass();
        this.firstFrame_ = str;
    }

    public void setFirstFrameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.firstFrame_ = byteString.toStringUtf8();
    }

    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    public void setFromSourceId(String str) {
        str.getClass();
        this.fromSourceId_ = str;
    }

    public void setFromSourceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSourceId_ = byteString.toStringUtf8();
    }

    public void setFromSourceType(long j) {
        this.fromSourceType_ = j;
    }

    public void setGameRecommendReason(String str) {
        str.getClass();
        this.gameRecommendReason_ = str;
    }

    public void setGameRecommendReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gameRecommendReason_ = byteString.toStringUtf8();
    }

    public void setGoto(String str) {
        str.getClass();
        this.goto_ = str;
    }

    public void setGotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goto_ = byteString.toStringUtf8();
    }

    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    public void setLiveInfo(LiveInfo liveInfo) {
        liveInfo.getClass();
        this.liveInfo_ = liveInfo;
    }

    public void setMaterialId(long j) {
        this.materialId_ = j;
    }

    public void setNewCard(int i) {
        this.newCard_ = i;
    }

    public void setNotice(Notice notice) {
        notice.getClass();
        this.notice_ = notice;
    }

    public void setPackInfo(PackInfo packInfo) {
        packInfo.getClass();
        this.packInfo_ = packInfo;
    }

    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    public void setPic(String str) {
        str.getClass();
        this.pic_ = str;
    }

    public void setPicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pic_ = byteString.toStringUtf8();
    }

    public void setPowerIconStyle(PowerIconStyle powerIconStyle) {
        powerIconStyle.getClass();
        this.powerIconStyle_ = powerIconStyle;
    }

    public void setRankInfoGame(RankInfo rankInfo) {
        rankInfo.getClass();
        this.rankInfoGame_ = rankInfo;
    }

    public void setRating(double d) {
        this.rating_ = d;
    }

    public void setRatingCount(int i) {
        this.ratingCount_ = i;
    }

    public void setRcmdReason(String str) {
        str.getClass();
        this.rcmdReason_ = str;
    }

    public void setRcmdReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rcmdReason_ = byteString.toStringUtf8();
    }

    public void setRcmdReasonExtra(String str) {
        str.getClass();
        this.rcmdReasonExtra_ = str;
    }

    public void setRcmdReasonExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rcmdReasonExtra_ = byteString.toStringUtf8();
    }

    public void setRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.rcmdReasonStyle_ = reasonStyle;
    }

    public void setRecThreePoint(RecThreePoint recThreePoint) {
        recThreePoint.getClass();
        this.recThreePoint_ = recThreePoint;
    }

    public void setReserve(String str) {
        str.getClass();
        this.reserve_ = str;
    }

    public void setReserveBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reserve_ = byteString.toStringUtf8();
    }

    public void setReserveStatus(long j) {
        this.reserveStatus_ = j;
    }

    public void setReserveStatusText(String str) {
        str.getClass();
        this.reserveStatusText_ = str;
    }

    public void setReserveStatusTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reserveStatusText_ = byteString.toStringUtf8();
    }

    public void setSeasonType(int i) {
        this.seasonType_ = i;
    }

    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    public void setStatV2(ArchiveStat archiveStat) {
        archiveStat.getClass();
        this.statV2_ = archiveStat;
    }

    public void setTagName(String str) {
        str.getClass();
        this.tagName_ = str;
    }

    public void setTagNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tagName_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setTrackid(String str) {
        str.getClass();
        this.trackid_ = str;
    }

    public void setTrackidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackid_ = byteString.toStringUtf8();
    }

    public void setUniqueId(String str) {
        str.getClass();
        this.uniqueId_ = str;
    }

    public void setUniqueIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uniqueId_ = byteString.toStringUtf8();
    }

    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    public void setWikiInfoGame(WikiInfo wikiInfo) {
        wikiInfo.getClass();
        this.wikiInfoGame_ = wikiInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68401.f16800xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Relate();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000/\u0000\u0000\u0001//\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\t\u0005\t\u0006\u0002\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0000\f\u0208\r\u0208\u000e\u0208\u000f\u0208\u0010\u0208\u0011\u0002\u0012\u0004\u0013\u0004\u0014\u0208\u0015\t\u0016\t\u0017\t\u0018\u0208\u0019\u0004\u001a\t\u001b\u0208\u001c\t\u001d\u0002\u001e\u0208\u001f\t \u0208!\u0002\"\u0002#\u0208$\t%\u0208&\t'\t(\u0208)\u0208*\t+\u0208,\u0208-\t.\t/\t", new Object[]{"aid_", "pic_", "title_", "author_", "stat_", "duration_", "goto_", "param_", "uri_", "jumpUrl_", "rating_", "reserve_", "from_", "desc_", "rcmdReason_", "badge_", "cid_", "seasonType_", "ratingCount_", "tagName_", "packInfo_", "notice_", "button_", "trackid_", "newCard_", "rcmdReasonStyle_", "coverGif_", "cm_", "reserveStatus_", "rcmdReasonExtra_", "recThreePoint_", "uniqueId_", "materialId_", "fromSourceType_", "fromSourceId_", "dimension_", "cover_", "badgeStyle_", "powerIconStyle_", "reserveStatusText_", "dislikeReportData_", "rankInfoGame_", "firstFrame_", "gameRecommendReason_", "wikiInfoGame_", "liveInfo_", "statV2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Relate> parser = PARSER;
                if (parser == null) {
                    synchronized (Relate.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public Author getAuthor() {
        Author author = this.author_;
        return author == null ? Author.getDefaultInstance() : author;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getBadge() {
        return this.badge_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getBadgeBytes() {
        return ByteString.copyFromUtf8(this.badge_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ReasonStyle getBadgeStyle() {
        ReasonStyle reasonStyle = this.badgeStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public Button getButton() {
        Button button = this.button_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public CM getCm() {
        CM cm = this.cm_;
        return cm == null ? CM.getDefaultInstance() : cm;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getCoverGif() {
        return this.coverGif_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getCoverGifBytes() {
        return ByteString.copyFromUtf8(this.coverGif_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getDesc() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getDislikeReportData() {
        return this.dislikeReportData_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getDislikeReportDataBytes() {
        return ByteString.copyFromUtf8(this.dislikeReportData_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public long getDuration() {
        return this.duration_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getFirstFrame() {
        return this.firstFrame_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getFirstFrameBytes() {
        return ByteString.copyFromUtf8(this.firstFrame_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getFrom() {
        return this.from_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getFromSourceId() {
        return this.fromSourceId_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getFromSourceIdBytes() {
        return ByteString.copyFromUtf8(this.fromSourceId_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public long getFromSourceType() {
        return this.fromSourceType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getGameRecommendReason() {
        return this.gameRecommendReason_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getGameRecommendReasonBytes() {
        return ByteString.copyFromUtf8(this.gameRecommendReason_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getGoto() {
        return this.goto_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public LiveInfo getLiveInfo() {
        LiveInfo liveInfo = this.liveInfo_;
        return liveInfo == null ? LiveInfo.getDefaultInstance() : liveInfo;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public long getMaterialId() {
        return this.materialId_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public int getNewCard() {
        return this.newCard_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public Notice getNotice() {
        Notice notice = this.notice_;
        return notice == null ? Notice.getDefaultInstance() : notice;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public PackInfo getPackInfo() {
        PackInfo packInfo = this.packInfo_;
        return packInfo == null ? PackInfo.getDefaultInstance() : packInfo;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getPic() {
        return this.pic_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getPicBytes() {
        return ByteString.copyFromUtf8(this.pic_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public PowerIconStyle getPowerIconStyle() {
        PowerIconStyle powerIconStyle = this.powerIconStyle_;
        return powerIconStyle == null ? PowerIconStyle.getDefaultInstance() : powerIconStyle;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public RankInfo getRankInfoGame() {
        RankInfo rankInfo = this.rankInfoGame_;
        return rankInfo == null ? RankInfo.getDefaultInstance() : rankInfo;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public double getRating() {
        return this.rating_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public int getRatingCount() {
        return this.ratingCount_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getRcmdReason() {
        return this.rcmdReason_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getRcmdReasonBytes() {
        return ByteString.copyFromUtf8(this.rcmdReason_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getRcmdReasonExtra() {
        return this.rcmdReasonExtra_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getRcmdReasonExtraBytes() {
        return ByteString.copyFromUtf8(this.rcmdReasonExtra_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ReasonStyle getRcmdReasonStyle() {
        ReasonStyle reasonStyle = this.rcmdReasonStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public RecThreePoint getRecThreePoint() {
        RecThreePoint recThreePoint = this.recThreePoint_;
        return recThreePoint == null ? RecThreePoint.getDefaultInstance() : recThreePoint;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getReserve() {
        return this.reserve_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getReserveBytes() {
        return ByteString.copyFromUtf8(this.reserve_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public long getReserveStatus() {
        return this.reserveStatus_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getReserveStatusText() {
        return this.reserveStatusText_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getReserveStatusTextBytes() {
        return ByteString.copyFromUtf8(this.reserveStatusText_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public int getSeasonType() {
        return this.seasonType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ArchiveStat getStatV2() {
        ArchiveStat archiveStat = this.statV2_;
        return archiveStat == null ? ArchiveStat.getDefaultInstance() : archiveStat;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getTagName() {
        return this.tagName_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getTagNameBytes() {
        return ByteString.copyFromUtf8(this.tagName_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getTrackid() {
        return this.trackid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getTrackidBytes() {
        return ByteString.copyFromUtf8(this.trackid_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getUniqueId() {
        return this.uniqueId_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.uniqueId_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public WikiInfo getWikiInfoGame() {
        WikiInfo wikiInfo = this.wikiInfoGame_;
        return wikiInfo == null ? WikiInfo.getDefaultInstance() : wikiInfo;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasAuthor() {
        return this.author_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasBadgeStyle() {
        return this.badgeStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasButton() {
        return this.button_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasCm() {
        return this.cm_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasLiveInfo() {
        return this.liveInfo_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasNotice() {
        return this.notice_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasPackInfo() {
        return this.packInfo_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasPowerIconStyle() {
        return this.powerIconStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasRankInfoGame() {
        return this.rankInfoGame_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasRcmdReasonStyle() {
        return this.rcmdReasonStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasRecThreePoint() {
        return this.recThreePoint_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasStat() {
        return this.stat_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasStatV2() {
        return this.statV2_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateOrBuilder
    public boolean hasWikiInfoGame() {
        return this.wikiInfoGame_ != null;
    }

    public static Builder newBuilder(Relate relate) {
        return DEFAULT_INSTANCE.createBuilder(relate);
    }

    public static Relate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Relate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Relate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Relate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Relate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Relate parseFrom(InputStream inputStream) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Relate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
