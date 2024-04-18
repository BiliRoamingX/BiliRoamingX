package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Arc;
import com.bapis.bilibili.pagination.PaginationReply;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ViewReply extends GeneratedMessageLite<ViewReply, ViewReply.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_SEASON_FIELD_NUMBER = 37;
    public static final int ACTIVITY_URL_FIELD_NUMBER = 17;
    public static final int ARC_EXTRA_FIELD_NUMBER = 56;
    public static final int ARC_FIELD_NUMBER = 1;
    public static final int ARGUE_BAR_FIELD_NUMBER = 72;
    public static final int ARGUE_MSG_FIELD_NUMBER = 20;
    public static final int BADGE_URL_FIELD_NUMBER = 38;
    public static final int BGM_FIELD_NUMBER = 18;
    public static final int BVID_FIELD_NUMBER = 14;
    public static final int CHARGING_PLUS_FIELD_NUMBER = 68;
    public static final int CMS_FIELD_NUMBER = 30;
    public static final int CM_CONFIG_FIELD_NUMBER = 31;
    public static final int CM_IPAD_FIELD_NUMBER = 41;
    public static final int CM_UNDER_PLAYER_FIELD_NUMBER = 48;
    public static final int COIN_CUSTOM_FIELD_NUMBER = 61;
    public static final int COIN_STYLE_FIELD_NUMBER = 65;
    public static final int CONFIG_FIELD_NUMBER = 25;
    public static final int CONTROL_CONFIG_FIELD_NUMBER = 62;
    public static final int CUSTOM_CONFIG_FIELD_NUMBER = 29;
    private static final ViewReply DEFAULT_INSTANCE;
    public static final int DESC_TAG_FIELD_NUMBER = 45;
    public static final int DESC_V2_FIELD_NUMBER = 40;
    public static final int DISLIKE_FIELD_NUMBER = 11;
    public static final int ECODE_FIELD_NUMBER = 28;
    public static final int ELEC_RANK_FIELD_NUMBER = 8;
    public static final int HISTORY_FIELD_NUMBER = 9;
    public static final int HONOR_FIELD_NUMBER = 15;
    public static final int INTERACTION_FIELD_NUMBER = 27;
    public static final int LABEL_FIELD_NUMBER = 23;
    public static final int LIKE_ANIMATION_FIELD_NUMBER = 58;
    public static final int LIKE_CUSTOM_FIELD_NUMBER = 44;
    public static final int LIVE_ORDER_INFO_FIELD_NUMBER = 39;
    public static final int MATERIAL_LEFT_FIELD_NUMBER = 53;
    public static final int NOTES_COUNT_FIELD_NUMBER = 54;
    public static final int ONLINE_FIELD_NUMBER = 47;
    public static final int OWNER_EXT_FIELD_NUMBER = 3;
    public static final int PAGES_FIELD_NUMBER = 2;
    public static final int PAGINATION_FIELD_NUMBER = 57;
    private static volatile Parser<ViewReply> PARSER = null;
    public static final int PLAYER_ICON_FIELD_NUMBER = 12;
    public static final int PLAY_PARAM_FIELD_NUMBER = 22;
    public static final int PLAY_TOAST_FIELD_NUMBER = 70;
    public static final int PREMIERE_FIELD_NUMBER = 51;
    public static final int PULL_ACTION_FIELD_NUMBER = 55;
    public static final int RABBIT_YEAR_FIELD_NUMBER = 66;
    public static final int RANK_FIELD_NUMBER = 33;
    public static final int REFRESH_PAGE_FIELD_NUMBER = 60;
    public static final int REFRESH_SPECIAL_CELL_FIELD_NUMBER = 52;
    public static final int REJECT_PAGE_FIELD_NUMBER = 69;
    public static final int RELATES_FIELD_NUMBER = 10;
    public static final int RELATE_TAB_FIELD_NUMBER = 16;
    public static final int REPLY_PREFACE_FIELD_NUMBER = 59;
    public static final int REQ_USER_FIELD_NUMBER = 4;
    public static final int SEASON_FIELD_NUMBER = 7;
    public static final int SHARE_SUBTITLE_FIELD_NUMBER = 26;
    public static final int SHORT_LINK_FIELD_NUMBER = 21;
    public static final int SPECIAL_CELL_FIELD_NUMBER = 46;
    public static final int SPECIAL_CELL_NEW_FIELD_NUMBER = 50;
    public static final int STAFF_FIELD_NUMBER = 19;
    public static final int STAT_V2_FIELD_NUMBER = 67;
    public static final int STICKER_FIELD_NUMBER = 42;
    public static final int TAB_FIELD_NUMBER = 32;
    public static final int TAG_FIELD_NUMBER = 5;
    public static final int TF_PANEL_CUSTOMIZED_FIELD_NUMBER = 34;
    public static final int T_ICON_FIELD_NUMBER = 6;
    public static final int UGC_SEASON_FIELD_NUMBER = 24;
    public static final int UP_ACT_FIELD_NUMBER = 35;
    public static final int UP_LIKE_IMG_FIELD_NUMBER = 43;
    public static final int UP_VIEW_MATERIAL_FIELD_NUMBER = 63;
    public static final int USER_GARB_FIELD_NUMBER = 36;
    public static final int USER_RELATION_FIELD_NUMBER = 64;
    public static final int VIDEO_SOURCE_FIELD_NUMBER = 49;
    public static final int VIEW_STATE_FIELD_NUMBER = 71;
    public static final int VIP_ACTIVE_FIELD_NUMBER = 13;
    private ActivitySeason activitySeason_;
    private ArcExtra arcExtra_;
    private Arc arc_;
    private ArgueBar argueBar_;
    private ChargingPlus chargingPlus_;
    private CMConfig cmConfig_;
    private CmIpad cmIpad_;
    private Any cmUnderPlayer_;
    private CoinCustom coinCustom_;
    private CoinStyle coinStyle_;
    private Config config_;
    private ControlConfig controlConfig_;
    private CustomConfig customConfig_;
    private Dislike dislike_;
    private int ecode_;
    private ElecRank elecRank_;
    private History history_;
    private Honor honor_;
    private Interaction interaction_;
    private Label label_;
    private LikeAnimation likeAnimation_;
    private LikeCustom likeCustom_;
    private LiveOrderInfo liveOrderInfo_;
    private MaterialLeft materialLeft_;
    private long notesCount_;
    private Online online_;
    private OnwerExt ownerExt_;
    private PaginationReply pagination_;
    private int playParam_;
    private PlayerIcon playerIcon_;
    private PremiereResource premiere_;
    private PullClientAction pullAction_;
    private RabbitYear rabbitYear_;
    private Rank rank_;
    private RefreshPage refreshPage_;
    private boolean refreshSpecialCell_;
    private RejectPage rejectPage_;
    private ReplyStyle replyPreface_;
    private ReqUser reqUser_;
    private Season season_;
    private SpecialCell specialCell_;
    private ArchiveStat statV2_;
    private Tab tab_;
    private TFPanelCustomized tfPanelCustomized_;
    private UgcSeason ugcSeason_;
    private UpAct upAct_;
    private UpLikeImg upLikeImg_;
    private UpViewMaterial upViewMaterial_;
    private UserGarb userGarb_;
    private UserRelation userRelation_;
    private int viewState_;
    private MapFieldLite<String, TIcon> tIcon_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<ViewPage> pages_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Tag> tag_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Relate> relates_ = GeneratedMessageLite.emptyProtobufList();
    private String vipActive_ = "";
    private String bvid_ = "";
    private Internal.ProtobufList<RelateTab> relateTab_ = GeneratedMessageLite.emptyProtobufList();
    private String activityUrl_ = "";
    private Internal.ProtobufList<Bgm> bgm_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Staff> staff_ = GeneratedMessageLite.emptyProtobufList();
    private String argueMsg_ = "";
    private String shortLink_ = "";
    private String shareSubtitle_ = "";
    private Internal.ProtobufList<CM> cms_ = GeneratedMessageLite.emptyProtobufList();
    private String badgeUrl_ = "";
    private Internal.ProtobufList<DescV2> descV2_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ViewMaterial> sticker_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Tag> descTag_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ViewMaterial> videoSource_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<SpecialCell> specialCellNew_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<PlayToast> playToast_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69041 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16857xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16857xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16857xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16857xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16857xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16857xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16857xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16857xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69041 c69041) {
            this();
        }

        public Builder addAllBgm(Iterable<? extends Bgm> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllBgm(iterable);
            return this;
        }

        public Builder addAllCms(Iterable<? extends CM> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllCms(iterable);
            return this;
        }

        public Builder addAllDescTag(Iterable<? extends Tag> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllDescTag(iterable);
            return this;
        }

        public Builder addAllDescV2(Iterable<? extends DescV2> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllDescV2(iterable);
            return this;
        }

        public Builder addAllPages(Iterable<? extends ViewPage> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllPages(iterable);
            return this;
        }

        public Builder addAllPlayToast(Iterable<? extends PlayToast> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllPlayToast(iterable);
            return this;
        }

        public Builder addAllRelateTab(Iterable<? extends RelateTab> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllRelateTab(iterable);
            return this;
        }

        public Builder addAllRelates(Iterable<? extends Relate> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllRelates(iterable);
            return this;
        }

        public Builder addAllSpecialCellNew(Iterable<? extends SpecialCell> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllSpecialCellNew(iterable);
            return this;
        }

        public Builder addAllStaff(Iterable<? extends Staff> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllStaff(iterable);
            return this;
        }

        public Builder addAllSticker(Iterable<? extends ViewMaterial> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllSticker(iterable);
            return this;
        }

        public Builder addAllTag(Iterable<? extends Tag> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllTag(iterable);
            return this;
        }

        public Builder addAllVideoSource(Iterable<? extends ViewMaterial> iterable) {
            copyOnWrite();
            ((ViewReply) this.instance).addAllVideoSource(iterable);
            return this;
        }

        public Builder addBgm(Bgm bgm) {
            copyOnWrite();
            ((ViewReply) this.instance).addBgm(bgm);
            return this;
        }

        public Builder addCms(CM cm) {
            copyOnWrite();
            ((ViewReply) this.instance).addCms(cm);
            return this;
        }

        public Builder addDescTag(Tag tag) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescTag(tag);
            return this;
        }

        public Builder addDescV2(DescV2 descV2) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescV2(descV2);
            return this;
        }

        public Builder addPages(ViewPage viewPage) {
            copyOnWrite();
            ((ViewReply) this.instance).addPages(viewPage);
            return this;
        }

        public Builder addPlayToast(PlayToast playToast) {
            copyOnWrite();
            ((ViewReply) this.instance).addPlayToast(playToast);
            return this;
        }

        public Builder addRelateTab(RelateTab relateTab) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelateTab(relateTab);
            return this;
        }

        public Builder addRelates(Relate relate) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelates(relate);
            return this;
        }

        public Builder addSpecialCellNew(SpecialCell specialCell) {
            copyOnWrite();
            ((ViewReply) this.instance).addSpecialCellNew(specialCell);
            return this;
        }

        public Builder addStaff(Staff staff) {
            copyOnWrite();
            ((ViewReply) this.instance).addStaff(staff);
            return this;
        }

        public Builder addSticker(ViewMaterial viewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).addSticker(viewMaterial);
            return this;
        }

        public Builder addTag(Tag tag) {
            copyOnWrite();
            ((ViewReply) this.instance).addTag(tag);
            return this;
        }

        public Builder addVideoSource(ViewMaterial viewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).addVideoSource(viewMaterial);
            return this;
        }

        public Builder clearActivitySeason() {
            copyOnWrite();
            ((ViewReply) this.instance).clearActivitySeason();
            return this;
        }

        public Builder clearActivityUrl() {
            copyOnWrite();
            ((ViewReply) this.instance).clearActivityUrl();
            return this;
        }

        public Builder clearArc() {
            copyOnWrite();
            ((ViewReply) this.instance).clearArc();
            return this;
        }

        public Builder clearArcExtra() {
            copyOnWrite();
            ((ViewReply) this.instance).clearArcExtra();
            return this;
        }

        public Builder clearArgueBar() {
            copyOnWrite();
            ((ViewReply) this.instance).clearArgueBar();
            return this;
        }

        public Builder clearArgueMsg() {
            copyOnWrite();
            ((ViewReply) this.instance).clearArgueMsg();
            return this;
        }

        public Builder clearBadgeUrl() {
            copyOnWrite();
            ((ViewReply) this.instance).clearBadgeUrl();
            return this;
        }

        public Builder clearBgm() {
            copyOnWrite();
            ((ViewReply) this.instance).clearBgm();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((ViewReply) this.instance).clearBvid();
            return this;
        }

        public Builder clearChargingPlus() {
            copyOnWrite();
            ((ViewReply) this.instance).clearChargingPlus();
            return this;
        }

        public Builder clearCmConfig() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCmConfig();
            return this;
        }

        public Builder clearCmIpad() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCmIpad();
            return this;
        }

        public Builder clearCmUnderPlayer() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCmUnderPlayer();
            return this;
        }

        public Builder clearCms() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCms();
            return this;
        }

        public Builder clearCoinCustom() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCoinCustom();
            return this;
        }

        public Builder clearCoinStyle() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCoinStyle();
            return this;
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((ViewReply) this.instance).clearConfig();
            return this;
        }

        public Builder clearControlConfig() {
            copyOnWrite();
            ((ViewReply) this.instance).clearControlConfig();
            return this;
        }

        public Builder clearCustomConfig() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCustomConfig();
            return this;
        }

        public Builder clearDescTag() {
            copyOnWrite();
            ((ViewReply) this.instance).clearDescTag();
            return this;
        }

        public Builder clearDescV2() {
            copyOnWrite();
            ((ViewReply) this.instance).clearDescV2();
            return this;
        }

        public Builder clearDislike() {
            copyOnWrite();
            ((ViewReply) this.instance).clearDislike();
            return this;
        }

        public Builder clearEcode() {
            copyOnWrite();
            ((ViewReply) this.instance).clearEcode();
            return this;
        }

        public Builder clearElecRank() {
            copyOnWrite();
            ((ViewReply) this.instance).clearElecRank();
            return this;
        }

        public Builder clearHistory() {
            copyOnWrite();
            ((ViewReply) this.instance).clearHistory();
            return this;
        }

        public Builder clearHonor() {
            copyOnWrite();
            ((ViewReply) this.instance).clearHonor();
            return this;
        }

        public Builder clearInteraction() {
            copyOnWrite();
            ((ViewReply) this.instance).clearInteraction();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ViewReply) this.instance).clearLabel();
            return this;
        }

        public Builder clearLikeAnimation() {
            copyOnWrite();
            ((ViewReply) this.instance).clearLikeAnimation();
            return this;
        }

        public Builder clearLikeCustom() {
            copyOnWrite();
            ((ViewReply) this.instance).clearLikeCustom();
            return this;
        }

        public Builder clearLiveOrderInfo() {
            copyOnWrite();
            ((ViewReply) this.instance).clearLiveOrderInfo();
            return this;
        }

        public Builder clearMaterialLeft() {
            copyOnWrite();
            ((ViewReply) this.instance).clearMaterialLeft();
            return this;
        }

        public Builder clearNotesCount() {
            copyOnWrite();
            ((ViewReply) this.instance).clearNotesCount();
            return this;
        }

        public Builder clearOnline() {
            copyOnWrite();
            ((ViewReply) this.instance).clearOnline();
            return this;
        }

        public Builder clearOwnerExt() {
            copyOnWrite();
            ((ViewReply) this.instance).clearOwnerExt();
            return this;
        }

        public Builder clearPages() {
            copyOnWrite();
            ((ViewReply) this.instance).clearPages();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((ViewReply) this.instance).clearPagination();
            return this;
        }

        public Builder clearPlayParam() {
            copyOnWrite();
            ((ViewReply) this.instance).clearPlayParam();
            return this;
        }

        public Builder clearPlayToast() {
            copyOnWrite();
            ((ViewReply) this.instance).clearPlayToast();
            return this;
        }

        public Builder clearPlayerIcon() {
            copyOnWrite();
            ((ViewReply) this.instance).clearPlayerIcon();
            return this;
        }

        public Builder clearPremiere() {
            copyOnWrite();
            ((ViewReply) this.instance).clearPremiere();
            return this;
        }

        public Builder clearPullAction() {
            copyOnWrite();
            ((ViewReply) this.instance).clearPullAction();
            return this;
        }

        public Builder clearRabbitYear() {
            copyOnWrite();
            ((ViewReply) this.instance).clearRabbitYear();
            return this;
        }

        public Builder clearRank() {
            copyOnWrite();
            ((ViewReply) this.instance).clearRank();
            return this;
        }

        public Builder clearRefreshPage() {
            copyOnWrite();
            ((ViewReply) this.instance).clearRefreshPage();
            return this;
        }

        public Builder clearRefreshSpecialCell() {
            copyOnWrite();
            ((ViewReply) this.instance).clearRefreshSpecialCell();
            return this;
        }

        public Builder clearRejectPage() {
            copyOnWrite();
            ((ViewReply) this.instance).clearRejectPage();
            return this;
        }

        public Builder clearRelateTab() {
            copyOnWrite();
            ((ViewReply) this.instance).clearRelateTab();
            return this;
        }

        public Builder clearRelates() {
            copyOnWrite();
            ((ViewReply) this.instance).clearRelates();
            return this;
        }

        public Builder clearReplyPreface() {
            copyOnWrite();
            ((ViewReply) this.instance).clearReplyPreface();
            return this;
        }

        public Builder clearReqUser() {
            copyOnWrite();
            ((ViewReply) this.instance).clearReqUser();
            return this;
        }

        public Builder clearSeason() {
            copyOnWrite();
            ((ViewReply) this.instance).clearSeason();
            return this;
        }

        public Builder clearShareSubtitle() {
            copyOnWrite();
            ((ViewReply) this.instance).clearShareSubtitle();
            return this;
        }

        public Builder clearShortLink() {
            copyOnWrite();
            ((ViewReply) this.instance).clearShortLink();
            return this;
        }

        public Builder clearSpecialCell() {
            copyOnWrite();
            ((ViewReply) this.instance).clearSpecialCell();
            return this;
        }

        public Builder clearSpecialCellNew() {
            copyOnWrite();
            ((ViewReply) this.instance).clearSpecialCellNew();
            return this;
        }

        public Builder clearStaff() {
            copyOnWrite();
            ((ViewReply) this.instance).clearStaff();
            return this;
        }

        public Builder clearStatV2() {
            copyOnWrite();
            ((ViewReply) this.instance).clearStatV2();
            return this;
        }

        public Builder clearSticker() {
            copyOnWrite();
            ((ViewReply) this.instance).clearSticker();
            return this;
        }

        public Builder clearTIcon() {
            copyOnWrite();
            ((ViewReply) this.instance).getMutableTIconMap().clear();
            return this;
        }

        public Builder clearTab() {
            copyOnWrite();
            ((ViewReply) this.instance).clearTab();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((ViewReply) this.instance).clearTag();
            return this;
        }

        public Builder clearTfPanelCustomized() {
            copyOnWrite();
            ((ViewReply) this.instance).clearTfPanelCustomized();
            return this;
        }

        public Builder clearUgcSeason() {
            copyOnWrite();
            ((ViewReply) this.instance).clearUgcSeason();
            return this;
        }

        public Builder clearUpAct() {
            copyOnWrite();
            ((ViewReply) this.instance).clearUpAct();
            return this;
        }

        public Builder clearUpLikeImg() {
            copyOnWrite();
            ((ViewReply) this.instance).clearUpLikeImg();
            return this;
        }

        public Builder clearUpViewMaterial() {
            copyOnWrite();
            ((ViewReply) this.instance).clearUpViewMaterial();
            return this;
        }

        public Builder clearUserGarb() {
            copyOnWrite();
            ((ViewReply) this.instance).clearUserGarb();
            return this;
        }

        public Builder clearUserRelation() {
            copyOnWrite();
            ((ViewReply) this.instance).clearUserRelation();
            return this;
        }

        public Builder clearVideoSource() {
            copyOnWrite();
            ((ViewReply) this.instance).clearVideoSource();
            return this;
        }

        public Builder clearViewState() {
            copyOnWrite();
            ((ViewReply) this.instance).clearViewState();
            return this;
        }

        public Builder clearVipActive() {
            copyOnWrite();
            ((ViewReply) this.instance).clearVipActive();
            return this;
        }

        public boolean containsTIcon(String str) {
            str.getClass();
            return ((ViewReply) this.instance).getTIconMap().containsKey(str);
        }

        public ActivitySeason getActivitySeason() {
            return ((ViewReply) this.instance).getActivitySeason();
        }

        public String getActivityUrl() {
            return ((ViewReply) this.instance).getActivityUrl();
        }

        public ByteString getActivityUrlBytes() {
            return ((ViewReply) this.instance).getActivityUrlBytes();
        }

        public Arc getArc() {
            return ((ViewReply) this.instance).getArc();
        }

        public ArcExtra getArcExtra() {
            return ((ViewReply) this.instance).getArcExtra();
        }

        public ArgueBar getArgueBar() {
            return ((ViewReply) this.instance).getArgueBar();
        }

        public String getArgueMsg() {
            return ((ViewReply) this.instance).getArgueMsg();
        }

        public ByteString getArgueMsgBytes() {
            return ((ViewReply) this.instance).getArgueMsgBytes();
        }

        public String getBadgeUrl() {
            return ((ViewReply) this.instance).getBadgeUrl();
        }

        public ByteString getBadgeUrlBytes() {
            return ((ViewReply) this.instance).getBadgeUrlBytes();
        }

        public Bgm getBgm(int i) {
            return ((ViewReply) this.instance).getBgm(i);
        }

        public int getBgmCount() {
            return ((ViewReply) this.instance).getBgmCount();
        }

        public List<Bgm> getBgmList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getBgmList());
        }

        public String getBvid() {
            return ((ViewReply) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((ViewReply) this.instance).getBvidBytes();
        }

        public ChargingPlus getChargingPlus() {
            return ((ViewReply) this.instance).getChargingPlus();
        }

        public CMConfig getCmConfig() {
            return ((ViewReply) this.instance).getCmConfig();
        }

        public CmIpad getCmIpad() {
            return ((ViewReply) this.instance).getCmIpad();
        }

        public Any getCmUnderPlayer() {
            return ((ViewReply) this.instance).getCmUnderPlayer();
        }

        public CM getCms(int i) {
            return ((ViewReply) this.instance).getCms(i);
        }

        public int getCmsCount() {
            return ((ViewReply) this.instance).getCmsCount();
        }

        public List<CM> getCmsList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getCmsList());
        }

        public CoinCustom getCoinCustom() {
            return ((ViewReply) this.instance).getCoinCustom();
        }

        public CoinStyle getCoinStyle() {
            return ((ViewReply) this.instance).getCoinStyle();
        }

        public Config getConfig() {
            return ((ViewReply) this.instance).getConfig();
        }

        public ControlConfig getControlConfig() {
            return ((ViewReply) this.instance).getControlConfig();
        }

        public CustomConfig getCustomConfig() {
            return ((ViewReply) this.instance).getCustomConfig();
        }

        public Tag getDescTag(int i) {
            return ((ViewReply) this.instance).getDescTag(i);
        }

        public int getDescTagCount() {
            return ((ViewReply) this.instance).getDescTagCount();
        }

        public List<Tag> getDescTagList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getDescTagList());
        }

        public DescV2 getDescV2(int i) {
            return ((ViewReply) this.instance).getDescV2(i);
        }

        public int getDescV2Count() {
            return ((ViewReply) this.instance).getDescV2Count();
        }

        public List<DescV2> getDescV2List() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getDescV2List());
        }

        public Dislike getDislike() {
            return ((ViewReply) this.instance).getDislike();
        }

        public ECode getEcode() {
            return ((ViewReply) this.instance).getEcode();
        }

        public int getEcodeValue() {
            return ((ViewReply) this.instance).getEcodeValue();
        }

        public ElecRank getElecRank() {
            return ((ViewReply) this.instance).getElecRank();
        }

        public History getHistory() {
            return ((ViewReply) this.instance).getHistory();
        }

        public Honor getHonor() {
            return ((ViewReply) this.instance).getHonor();
        }

        public Interaction getInteraction() {
            return ((ViewReply) this.instance).getInteraction();
        }

        public Label getLabel() {
            return ((ViewReply) this.instance).getLabel();
        }

        public LikeAnimation getLikeAnimation() {
            return ((ViewReply) this.instance).getLikeAnimation();
        }

        public LikeCustom getLikeCustom() {
            return ((ViewReply) this.instance).getLikeCustom();
        }

        public LiveOrderInfo getLiveOrderInfo() {
            return ((ViewReply) this.instance).getLiveOrderInfo();
        }

        public MaterialLeft getMaterialLeft() {
            return ((ViewReply) this.instance).getMaterialLeft();
        }

        public long getNotesCount() {
            return ((ViewReply) this.instance).getNotesCount();
        }

        public Online getOnline() {
            return ((ViewReply) this.instance).getOnline();
        }

        public OnwerExt getOwnerExt() {
            return ((ViewReply) this.instance).getOwnerExt();
        }

        public ViewPage getPages(int i) {
            return ((ViewReply) this.instance).getPages(i);
        }

        public int getPagesCount() {
            return ((ViewReply) this.instance).getPagesCount();
        }

        public List<ViewPage> getPagesList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getPagesList());
        }

        public PaginationReply getPagination() {
            return ((ViewReply) this.instance).getPagination();
        }

        public int getPlayParam() {
            return ((ViewReply) this.instance).getPlayParam();
        }

        public PlayToast getPlayToast(int i) {
            return ((ViewReply) this.instance).getPlayToast(i);
        }

        public int getPlayToastCount() {
            return ((ViewReply) this.instance).getPlayToastCount();
        }

        public List<PlayToast> getPlayToastList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getPlayToastList());
        }

        public PlayerIcon getPlayerIcon() {
            return ((ViewReply) this.instance).getPlayerIcon();
        }

        public PremiereResource getPremiere() {
            return ((ViewReply) this.instance).getPremiere();
        }

        public PullClientAction getPullAction() {
            return ((ViewReply) this.instance).getPullAction();
        }

        public RabbitYear getRabbitYear() {
            return ((ViewReply) this.instance).getRabbitYear();
        }

        public Rank getRank() {
            return ((ViewReply) this.instance).getRank();
        }

        public RefreshPage getRefreshPage() {
            return ((ViewReply) this.instance).getRefreshPage();
        }

        public boolean getRefreshSpecialCell() {
            return ((ViewReply) this.instance).getRefreshSpecialCell();
        }

        public RejectPage getRejectPage() {
            return ((ViewReply) this.instance).getRejectPage();
        }

        public RelateTab getRelateTab(int i) {
            return ((ViewReply) this.instance).getRelateTab(i);
        }

        public int getRelateTabCount() {
            return ((ViewReply) this.instance).getRelateTabCount();
        }

        public List<RelateTab> getRelateTabList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getRelateTabList());
        }

        public Relate getRelates(int i) {
            return ((ViewReply) this.instance).getRelates(i);
        }

        public int getRelatesCount() {
            return ((ViewReply) this.instance).getRelatesCount();
        }

        public List<Relate> getRelatesList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getRelatesList());
        }

        public ReplyStyle getReplyPreface() {
            return ((ViewReply) this.instance).getReplyPreface();
        }

        public ReqUser getReqUser() {
            return ((ViewReply) this.instance).getReqUser();
        }

        public Season getSeason() {
            return ((ViewReply) this.instance).getSeason();
        }

        public String getShareSubtitle() {
            return ((ViewReply) this.instance).getShareSubtitle();
        }

        public ByteString getShareSubtitleBytes() {
            return ((ViewReply) this.instance).getShareSubtitleBytes();
        }

        public String getShortLink() {
            return ((ViewReply) this.instance).getShortLink();
        }

        public ByteString getShortLinkBytes() {
            return ((ViewReply) this.instance).getShortLinkBytes();
        }

        public SpecialCell getSpecialCell() {
            return ((ViewReply) this.instance).getSpecialCell();
        }

        public SpecialCell getSpecialCellNew(int i) {
            return ((ViewReply) this.instance).getSpecialCellNew(i);
        }

        public int getSpecialCellNewCount() {
            return ((ViewReply) this.instance).getSpecialCellNewCount();
        }

        public List<SpecialCell> getSpecialCellNewList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getSpecialCellNewList());
        }

        public Staff getStaff(int i) {
            return ((ViewReply) this.instance).getStaff(i);
        }

        public int getStaffCount() {
            return ((ViewReply) this.instance).getStaffCount();
        }

        public List<Staff> getStaffList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getStaffList());
        }

        public ArchiveStat getStatV2() {
            return ((ViewReply) this.instance).getStatV2();
        }

        public ViewMaterial getSticker(int i) {
            return ((ViewReply) this.instance).getSticker(i);
        }

        public int getStickerCount() {
            return ((ViewReply) this.instance).getStickerCount();
        }

        public List<ViewMaterial> getStickerList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getStickerList());
        }

        @Deprecated
        public Map<String, TIcon> getTIcon() {
            return getTIconMap();
        }

        public int getTIconCount() {
            return ((ViewReply) this.instance).getTIconMap().size();
        }

        public Map<String, TIcon> getTIconMap() {
            return Collections.unmodifiableMap(((ViewReply) this.instance).getTIconMap());
        }

        public TIcon getTIconOrDefault(String str, TIcon tIcon) {
            str.getClass();
            Map<String, TIcon> tIconMap = ((ViewReply) this.instance).getTIconMap();
            return tIconMap.containsKey(str) ? tIconMap.get(str) : tIcon;
        }

        public TIcon getTIconOrThrow(String str) {
            str.getClass();
            Map<String, TIcon> tIconMap = ((ViewReply) this.instance).getTIconMap();
            if (tIconMap.containsKey(str)) {
                return tIconMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Tab getTab() {
            return ((ViewReply) this.instance).getTab();
        }

        public Tag getTag(int i) {
            return ((ViewReply) this.instance).getTag(i);
        }

        public int getTagCount() {
            return ((ViewReply) this.instance).getTagCount();
        }

        public List<Tag> getTagList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getTagList());
        }

        public TFPanelCustomized getTfPanelCustomized() {
            return ((ViewReply) this.instance).getTfPanelCustomized();
        }

        public UgcSeason getUgcSeason() {
            return ((ViewReply) this.instance).getUgcSeason();
        }

        public UpAct getUpAct() {
            return ((ViewReply) this.instance).getUpAct();
        }

        public UpLikeImg getUpLikeImg() {
            return ((ViewReply) this.instance).getUpLikeImg();
        }

        public UpViewMaterial getUpViewMaterial() {
            return ((ViewReply) this.instance).getUpViewMaterial();
        }

        public UserGarb getUserGarb() {
            return ((ViewReply) this.instance).getUserGarb();
        }

        public UserRelation getUserRelation() {
            return ((ViewReply) this.instance).getUserRelation();
        }

        public ViewMaterial getVideoSource(int i) {
            return ((ViewReply) this.instance).getVideoSource(i);
        }

        public int getVideoSourceCount() {
            return ((ViewReply) this.instance).getVideoSourceCount();
        }

        public List<ViewMaterial> getVideoSourceList() {
            return Collections.unmodifiableList(((ViewReply) this.instance).getVideoSourceList());
        }

        public ViewState getViewState() {
            return ((ViewReply) this.instance).getViewState();
        }

        public int getViewStateValue() {
            return ((ViewReply) this.instance).getViewStateValue();
        }

        public String getVipActive() {
            return ((ViewReply) this.instance).getVipActive();
        }

        public ByteString getVipActiveBytes() {
            return ((ViewReply) this.instance).getVipActiveBytes();
        }

        public boolean hasActivitySeason() {
            return ((ViewReply) this.instance).hasActivitySeason();
        }

        public boolean hasArc() {
            return ((ViewReply) this.instance).hasArc();
        }

        public boolean hasArcExtra() {
            return ((ViewReply) this.instance).hasArcExtra();
        }

        public boolean hasArgueBar() {
            return ((ViewReply) this.instance).hasArgueBar();
        }

        public boolean hasChargingPlus() {
            return ((ViewReply) this.instance).hasChargingPlus();
        }

        public boolean hasCmConfig() {
            return ((ViewReply) this.instance).hasCmConfig();
        }

        public boolean hasCmIpad() {
            return ((ViewReply) this.instance).hasCmIpad();
        }

        public boolean hasCmUnderPlayer() {
            return ((ViewReply) this.instance).hasCmUnderPlayer();
        }

        public boolean hasCoinCustom() {
            return ((ViewReply) this.instance).hasCoinCustom();
        }

        public boolean hasCoinStyle() {
            return ((ViewReply) this.instance).hasCoinStyle();
        }

        public boolean hasConfig() {
            return ((ViewReply) this.instance).hasConfig();
        }

        public boolean hasControlConfig() {
            return ((ViewReply) this.instance).hasControlConfig();
        }

        public boolean hasCustomConfig() {
            return ((ViewReply) this.instance).hasCustomConfig();
        }

        public boolean hasDislike() {
            return ((ViewReply) this.instance).hasDislike();
        }

        public boolean hasElecRank() {
            return ((ViewReply) this.instance).hasElecRank();
        }

        public boolean hasHistory() {
            return ((ViewReply) this.instance).hasHistory();
        }

        public boolean hasHonor() {
            return ((ViewReply) this.instance).hasHonor();
        }

        public boolean hasInteraction() {
            return ((ViewReply) this.instance).hasInteraction();
        }

        public boolean hasLabel() {
            return ((ViewReply) this.instance).hasLabel();
        }

        public boolean hasLikeAnimation() {
            return ((ViewReply) this.instance).hasLikeAnimation();
        }

        public boolean hasLikeCustom() {
            return ((ViewReply) this.instance).hasLikeCustom();
        }

        public boolean hasLiveOrderInfo() {
            return ((ViewReply) this.instance).hasLiveOrderInfo();
        }

        public boolean hasMaterialLeft() {
            return ((ViewReply) this.instance).hasMaterialLeft();
        }

        public boolean hasOnline() {
            return ((ViewReply) this.instance).hasOnline();
        }

        public boolean hasOwnerExt() {
            return ((ViewReply) this.instance).hasOwnerExt();
        }

        public boolean hasPagination() {
            return ((ViewReply) this.instance).hasPagination();
        }

        public boolean hasPlayerIcon() {
            return ((ViewReply) this.instance).hasPlayerIcon();
        }

        public boolean hasPremiere() {
            return ((ViewReply) this.instance).hasPremiere();
        }

        public boolean hasPullAction() {
            return ((ViewReply) this.instance).hasPullAction();
        }

        public boolean hasRabbitYear() {
            return ((ViewReply) this.instance).hasRabbitYear();
        }

        public boolean hasRank() {
            return ((ViewReply) this.instance).hasRank();
        }

        public boolean hasRefreshPage() {
            return ((ViewReply) this.instance).hasRefreshPage();
        }

        public boolean hasRejectPage() {
            return ((ViewReply) this.instance).hasRejectPage();
        }

        public boolean hasReplyPreface() {
            return ((ViewReply) this.instance).hasReplyPreface();
        }

        public boolean hasReqUser() {
            return ((ViewReply) this.instance).hasReqUser();
        }

        public boolean hasSeason() {
            return ((ViewReply) this.instance).hasSeason();
        }

        public boolean hasSpecialCell() {
            return ((ViewReply) this.instance).hasSpecialCell();
        }

        public boolean hasStatV2() {
            return ((ViewReply) this.instance).hasStatV2();
        }

        public boolean hasTab() {
            return ((ViewReply) this.instance).hasTab();
        }

        public boolean hasTfPanelCustomized() {
            return ((ViewReply) this.instance).hasTfPanelCustomized();
        }

        public boolean hasUgcSeason() {
            return ((ViewReply) this.instance).hasUgcSeason();
        }

        public boolean hasUpAct() {
            return ((ViewReply) this.instance).hasUpAct();
        }

        public boolean hasUpLikeImg() {
            return ((ViewReply) this.instance).hasUpLikeImg();
        }

        public boolean hasUpViewMaterial() {
            return ((ViewReply) this.instance).hasUpViewMaterial();
        }

        public boolean hasUserGarb() {
            return ((ViewReply) this.instance).hasUserGarb();
        }

        public boolean hasUserRelation() {
            return ((ViewReply) this.instance).hasUserRelation();
        }

        public Builder mergeActivitySeason(ActivitySeason activitySeason) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeActivitySeason(activitySeason);
            return this;
        }

        public Builder mergeArc(Arc arc) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeArc(arc);
            return this;
        }

        public Builder mergeArcExtra(ArcExtra arcExtra) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeArcExtra(arcExtra);
            return this;
        }

        public Builder mergeArgueBar(ArgueBar argueBar) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeArgueBar(argueBar);
            return this;
        }

        public Builder mergeChargingPlus(ChargingPlus chargingPlus) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeChargingPlus(chargingPlus);
            return this;
        }

        public Builder mergeCmConfig(CMConfig cMConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeCmConfig(cMConfig);
            return this;
        }

        public Builder mergeCmIpad(CmIpad cmIpad) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeCmIpad(cmIpad);
            return this;
        }

        public Builder mergeCmUnderPlayer(Any any) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeCmUnderPlayer(any);
            return this;
        }

        public Builder mergeCoinCustom(CoinCustom coinCustom) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeCoinCustom(coinCustom);
            return this;
        }

        public Builder mergeCoinStyle(CoinStyle coinStyle) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeCoinStyle(coinStyle);
            return this;
        }

        public Builder mergeConfig(Config config) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeConfig(config);
            return this;
        }

        public Builder mergeControlConfig(ControlConfig controlConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeControlConfig(controlConfig);
            return this;
        }

        public Builder mergeCustomConfig(CustomConfig customConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeCustomConfig(customConfig);
            return this;
        }

        public Builder mergeDislike(Dislike dislike) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeDislike(dislike);
            return this;
        }

        public Builder mergeElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeElecRank(elecRank);
            return this;
        }

        public Builder mergeHistory(History history) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeHistory(history);
            return this;
        }

        public Builder mergeHonor(Honor honor) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeHonor(honor);
            return this;
        }

        public Builder mergeInteraction(Interaction interaction) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeInteraction(interaction);
            return this;
        }

        public Builder mergeLabel(Label label) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeLabel(label);
            return this;
        }

        public Builder mergeLikeAnimation(LikeAnimation likeAnimation) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeLikeAnimation(likeAnimation);
            return this;
        }

        public Builder mergeLikeCustom(LikeCustom likeCustom) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeLikeCustom(likeCustom);
            return this;
        }

        public Builder mergeLiveOrderInfo(LiveOrderInfo liveOrderInfo) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeLiveOrderInfo(liveOrderInfo);
            return this;
        }

        public Builder mergeMaterialLeft(MaterialLeft materialLeft) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeMaterialLeft(materialLeft);
            return this;
        }

        public Builder mergeOnline(Online online) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeOnline(online);
            return this;
        }

        public Builder mergeOwnerExt(OnwerExt onwerExt) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeOwnerExt(onwerExt);
            return this;
        }

        public Builder mergePagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((ViewReply) this.instance).mergePagination(paginationReply);
            return this;
        }

        public Builder mergePlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((ViewReply) this.instance).mergePlayerIcon(playerIcon);
            return this;
        }

        public Builder mergePremiere(PremiereResource premiereResource) {
            copyOnWrite();
            ((ViewReply) this.instance).mergePremiere(premiereResource);
            return this;
        }

        public Builder mergePullAction(PullClientAction pullClientAction) {
            copyOnWrite();
            ((ViewReply) this.instance).mergePullAction(pullClientAction);
            return this;
        }

        public Builder mergeRabbitYear(RabbitYear rabbitYear) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeRabbitYear(rabbitYear);
            return this;
        }

        public Builder mergeRank(Rank rank) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeRank(rank);
            return this;
        }

        public Builder mergeRefreshPage(RefreshPage refreshPage) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeRefreshPage(refreshPage);
            return this;
        }

        public Builder mergeRejectPage(RejectPage rejectPage) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeRejectPage(rejectPage);
            return this;
        }

        public Builder mergeReplyPreface(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeReplyPreface(replyStyle);
            return this;
        }

        public Builder mergeReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeReqUser(reqUser);
            return this;
        }

        public Builder mergeSeason(Season season) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeSeason(season);
            return this;
        }

        public Builder mergeSpecialCell(SpecialCell specialCell) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeSpecialCell(specialCell);
            return this;
        }

        public Builder mergeStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeStatV2(archiveStat);
            return this;
        }

        public Builder mergeTab(Tab tab) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeTab(tab);
            return this;
        }

        public Builder mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        public Builder mergeUgcSeason(UgcSeason ugcSeason) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeUgcSeason(ugcSeason);
            return this;
        }

        public Builder mergeUpAct(UpAct upAct) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeUpAct(upAct);
            return this;
        }

        public Builder mergeUpLikeImg(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeUpLikeImg(upLikeImg);
            return this;
        }

        public Builder mergeUpViewMaterial(UpViewMaterial upViewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeUpViewMaterial(upViewMaterial);
            return this;
        }

        public Builder mergeUserGarb(UserGarb userGarb) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeUserGarb(userGarb);
            return this;
        }

        public Builder mergeUserRelation(UserRelation userRelation) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeUserRelation(userRelation);
            return this;
        }

        public Builder putAllTIcon(Map<String, TIcon> map) {
            copyOnWrite();
            ((ViewReply) this.instance).getMutableTIconMap().putAll(map);
            return this;
        }

        public Builder putTIcon(String str, TIcon tIcon) {
            str.getClass();
            tIcon.getClass();
            copyOnWrite();
            ((ViewReply) this.instance).getMutableTIconMap().put(str, tIcon);
            return this;
        }

        public Builder removeBgm(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeBgm(i);
            return this;
        }

        public Builder removeCms(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeCms(i);
            return this;
        }

        public Builder removeDescTag(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeDescTag(i);
            return this;
        }

        public Builder removeDescV2(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeDescV2(i);
            return this;
        }

        public Builder removePages(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removePages(i);
            return this;
        }

        public Builder removePlayToast(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removePlayToast(i);
            return this;
        }

        public Builder removeRelateTab(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeRelateTab(i);
            return this;
        }

        public Builder removeRelates(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeRelates(i);
            return this;
        }

        public Builder removeSpecialCellNew(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeSpecialCellNew(i);
            return this;
        }

        public Builder removeStaff(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeStaff(i);
            return this;
        }

        public Builder removeSticker(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeSticker(i);
            return this;
        }

        public Builder removeTIcon(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewReply) this.instance).getMutableTIconMap().remove(str);
            return this;
        }

        public Builder removeTag(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeTag(i);
            return this;
        }

        public Builder removeVideoSource(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).removeVideoSource(i);
            return this;
        }

        public Builder setActivitySeason(ActivitySeason activitySeason) {
            copyOnWrite();
            ((ViewReply) this.instance).setActivitySeason(activitySeason);
            return this;
        }

        public Builder setActivityUrl(String str) {
            copyOnWrite();
            ((ViewReply) this.instance).setActivityUrl(str);
            return this;
        }

        public Builder setActivityUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReply) this.instance).setActivityUrlBytes(byteString);
            return this;
        }

        public Builder setArc(Arc arc) {
            copyOnWrite();
            ((ViewReply) this.instance).setArc(arc);
            return this;
        }

        public Builder setArcExtra(ArcExtra arcExtra) {
            copyOnWrite();
            ((ViewReply) this.instance).setArcExtra(arcExtra);
            return this;
        }

        public Builder setArgueBar(ArgueBar argueBar) {
            copyOnWrite();
            ((ViewReply) this.instance).setArgueBar(argueBar);
            return this;
        }

        public Builder setArgueMsg(String str) {
            copyOnWrite();
            ((ViewReply) this.instance).setArgueMsg(str);
            return this;
        }

        public Builder setArgueMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReply) this.instance).setArgueMsgBytes(byteString);
            return this;
        }

        public Builder setBadgeUrl(String str) {
            copyOnWrite();
            ((ViewReply) this.instance).setBadgeUrl(str);
            return this;
        }

        public Builder setBadgeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReply) this.instance).setBadgeUrlBytes(byteString);
            return this;
        }

        public Builder setBgm(int i, Bgm bgm) {
            copyOnWrite();
            ((ViewReply) this.instance).setBgm(i, bgm);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((ViewReply) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReply) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setChargingPlus(ChargingPlus chargingPlus) {
            copyOnWrite();
            ((ViewReply) this.instance).setChargingPlus(chargingPlus);
            return this;
        }

        public Builder setCmConfig(CMConfig cMConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).setCmConfig(cMConfig);
            return this;
        }

        public Builder setCmIpad(CmIpad cmIpad) {
            copyOnWrite();
            ((ViewReply) this.instance).setCmIpad(cmIpad);
            return this;
        }

        public Builder setCmUnderPlayer(Any any) {
            copyOnWrite();
            ((ViewReply) this.instance).setCmUnderPlayer(any);
            return this;
        }

        public Builder setCms(int i, CM cm) {
            copyOnWrite();
            ((ViewReply) this.instance).setCms(i, cm);
            return this;
        }

        public Builder setCoinCustom(CoinCustom coinCustom) {
            copyOnWrite();
            ((ViewReply) this.instance).setCoinCustom(coinCustom);
            return this;
        }

        public Builder setCoinStyle(CoinStyle coinStyle) {
            copyOnWrite();
            ((ViewReply) this.instance).setCoinStyle(coinStyle);
            return this;
        }

        public Builder setConfig(Config config) {
            copyOnWrite();
            ((ViewReply) this.instance).setConfig(config);
            return this;
        }

        public Builder setControlConfig(ControlConfig controlConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).setControlConfig(controlConfig);
            return this;
        }

        public Builder setCustomConfig(CustomConfig customConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).setCustomConfig(customConfig);
            return this;
        }

        public Builder setDescTag(int i, Tag tag) {
            copyOnWrite();
            ((ViewReply) this.instance).setDescTag(i, tag);
            return this;
        }

        public Builder setDescV2(int i, DescV2 descV2) {
            copyOnWrite();
            ((ViewReply) this.instance).setDescV2(i, descV2);
            return this;
        }

        public Builder setDislike(Dislike dislike) {
            copyOnWrite();
            ((ViewReply) this.instance).setDislike(dislike);
            return this;
        }

        public Builder setEcode(ECode eCode) {
            copyOnWrite();
            ((ViewReply) this.instance).setEcode(eCode);
            return this;
        }

        public Builder setEcodeValue(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).setEcodeValue(i);
            return this;
        }

        public Builder setElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((ViewReply) this.instance).setElecRank(elecRank);
            return this;
        }

        public Builder setHistory(History history) {
            copyOnWrite();
            ((ViewReply) this.instance).setHistory(history);
            return this;
        }

        public Builder setHonor(Honor honor) {
            copyOnWrite();
            ((ViewReply) this.instance).setHonor(honor);
            return this;
        }

        public Builder setInteraction(Interaction interaction) {
            copyOnWrite();
            ((ViewReply) this.instance).setInteraction(interaction);
            return this;
        }

        public Builder setLabel(Label label) {
            copyOnWrite();
            ((ViewReply) this.instance).setLabel(label);
            return this;
        }

        public Builder setLikeAnimation(LikeAnimation likeAnimation) {
            copyOnWrite();
            ((ViewReply) this.instance).setLikeAnimation(likeAnimation);
            return this;
        }

        public Builder setLikeCustom(LikeCustom likeCustom) {
            copyOnWrite();
            ((ViewReply) this.instance).setLikeCustom(likeCustom);
            return this;
        }

        public Builder setLiveOrderInfo(LiveOrderInfo liveOrderInfo) {
            copyOnWrite();
            ((ViewReply) this.instance).setLiveOrderInfo(liveOrderInfo);
            return this;
        }

        public Builder setMaterialLeft(MaterialLeft materialLeft) {
            copyOnWrite();
            ((ViewReply) this.instance).setMaterialLeft(materialLeft);
            return this;
        }

        public Builder setNotesCount(long j) {
            copyOnWrite();
            ((ViewReply) this.instance).setNotesCount(j);
            return this;
        }

        public Builder setOnline(Online online) {
            copyOnWrite();
            ((ViewReply) this.instance).setOnline(online);
            return this;
        }

        public Builder setOwnerExt(OnwerExt onwerExt) {
            copyOnWrite();
            ((ViewReply) this.instance).setOwnerExt(onwerExt);
            return this;
        }

        public Builder setPages(int i, ViewPage viewPage) {
            copyOnWrite();
            ((ViewReply) this.instance).setPages(i, viewPage);
            return this;
        }

        public Builder setPagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((ViewReply) this.instance).setPagination(paginationReply);
            return this;
        }

        public Builder setPlayParam(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).setPlayParam(i);
            return this;
        }

        public Builder setPlayToast(int i, PlayToast playToast) {
            copyOnWrite();
            ((ViewReply) this.instance).setPlayToast(i, playToast);
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((ViewReply) this.instance).setPlayerIcon(playerIcon);
            return this;
        }

        public Builder setPremiere(PremiereResource premiereResource) {
            copyOnWrite();
            ((ViewReply) this.instance).setPremiere(premiereResource);
            return this;
        }

        public Builder setPullAction(PullClientAction pullClientAction) {
            copyOnWrite();
            ((ViewReply) this.instance).setPullAction(pullClientAction);
            return this;
        }

        public Builder setRabbitYear(RabbitYear rabbitYear) {
            copyOnWrite();
            ((ViewReply) this.instance).setRabbitYear(rabbitYear);
            return this;
        }

        public Builder setRank(Rank rank) {
            copyOnWrite();
            ((ViewReply) this.instance).setRank(rank);
            return this;
        }

        public Builder setRefreshPage(RefreshPage refreshPage) {
            copyOnWrite();
            ((ViewReply) this.instance).setRefreshPage(refreshPage);
            return this;
        }

        public Builder setRefreshSpecialCell(boolean z) {
            copyOnWrite();
            ((ViewReply) this.instance).setRefreshSpecialCell(z);
            return this;
        }

        public Builder setRejectPage(RejectPage rejectPage) {
            copyOnWrite();
            ((ViewReply) this.instance).setRejectPage(rejectPage);
            return this;
        }

        public Builder setRelateTab(int i, RelateTab relateTab) {
            copyOnWrite();
            ((ViewReply) this.instance).setRelateTab(i, relateTab);
            return this;
        }

        public Builder setRelates(int i, Relate relate) {
            copyOnWrite();
            ((ViewReply) this.instance).setRelates(i, relate);
            return this;
        }

        public Builder setReplyPreface(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ViewReply) this.instance).setReplyPreface(replyStyle);
            return this;
        }

        public Builder setReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((ViewReply) this.instance).setReqUser(reqUser);
            return this;
        }

        public Builder setSeason(Season season) {
            copyOnWrite();
            ((ViewReply) this.instance).setSeason(season);
            return this;
        }

        public Builder setShareSubtitle(String str) {
            copyOnWrite();
            ((ViewReply) this.instance).setShareSubtitle(str);
            return this;
        }

        public Builder setShareSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReply) this.instance).setShareSubtitleBytes(byteString);
            return this;
        }

        public Builder setShortLink(String str) {
            copyOnWrite();
            ((ViewReply) this.instance).setShortLink(str);
            return this;
        }

        public Builder setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReply) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public Builder setSpecialCell(SpecialCell specialCell) {
            copyOnWrite();
            ((ViewReply) this.instance).setSpecialCell(specialCell);
            return this;
        }

        public Builder setSpecialCellNew(int i, SpecialCell specialCell) {
            copyOnWrite();
            ((ViewReply) this.instance).setSpecialCellNew(i, specialCell);
            return this;
        }

        public Builder setStaff(int i, Staff staff) {
            copyOnWrite();
            ((ViewReply) this.instance).setStaff(i, staff);
            return this;
        }

        public Builder setStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((ViewReply) this.instance).setStatV2(archiveStat);
            return this;
        }

        public Builder setSticker(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).setSticker(i, viewMaterial);
            return this;
        }

        public Builder setTab(Tab tab) {
            copyOnWrite();
            ((ViewReply) this.instance).setTab(tab);
            return this;
        }

        public Builder setTag(int i, Tag tag) {
            copyOnWrite();
            ((ViewReply) this.instance).setTag(i, tag);
            return this;
        }

        public Builder setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((ViewReply) this.instance).setTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        public Builder setUgcSeason(UgcSeason ugcSeason) {
            copyOnWrite();
            ((ViewReply) this.instance).setUgcSeason(ugcSeason);
            return this;
        }

        public Builder setUpAct(UpAct upAct) {
            copyOnWrite();
            ((ViewReply) this.instance).setUpAct(upAct);
            return this;
        }

        public Builder setUpLikeImg(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((ViewReply) this.instance).setUpLikeImg(upLikeImg);
            return this;
        }

        public Builder setUpViewMaterial(UpViewMaterial upViewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).setUpViewMaterial(upViewMaterial);
            return this;
        }

        public Builder setUserGarb(UserGarb userGarb) {
            copyOnWrite();
            ((ViewReply) this.instance).setUserGarb(userGarb);
            return this;
        }

        public Builder setUserRelation(UserRelation userRelation) {
            copyOnWrite();
            ((ViewReply) this.instance).setUserRelation(userRelation);
            return this;
        }

        public Builder setVideoSource(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).setVideoSource(i, viewMaterial);
            return this;
        }

        public Builder setViewState(ViewState viewState) {
            copyOnWrite();
            ((ViewReply) this.instance).setViewState(viewState);
            return this;
        }

        public Builder setViewStateValue(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).setViewStateValue(i);
            return this;
        }

        public Builder setVipActive(String str) {
            copyOnWrite();
            ((ViewReply) this.instance).setVipActive(str);
            return this;
        }

        public Builder setVipActiveBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReply) this.instance).setVipActiveBytes(byteString);
            return this;
        }

        private Builder() {
            super(ViewReply.DEFAULT_INSTANCE);
        }

        public Builder addBgm(int i, Bgm bgm) {
            copyOnWrite();
            ((ViewReply) this.instance).addBgm(i, bgm);
            return this;
        }

        public Builder addCms(int i, CM cm) {
            copyOnWrite();
            ((ViewReply) this.instance).addCms(i, cm);
            return this;
        }

        public Builder addDescTag(int i, Tag tag) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescTag(i, tag);
            return this;
        }

        public Builder addDescV2(int i, DescV2 descV2) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescV2(i, descV2);
            return this;
        }

        public Builder addPages(int i, ViewPage viewPage) {
            copyOnWrite();
            ((ViewReply) this.instance).addPages(i, viewPage);
            return this;
        }

        public Builder addPlayToast(int i, PlayToast playToast) {
            copyOnWrite();
            ((ViewReply) this.instance).addPlayToast(i, playToast);
            return this;
        }

        public Builder addRelateTab(int i, RelateTab relateTab) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelateTab(i, relateTab);
            return this;
        }

        public Builder addRelates(int i, Relate relate) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelates(i, relate);
            return this;
        }

        public Builder addSpecialCellNew(int i, SpecialCell specialCell) {
            copyOnWrite();
            ((ViewReply) this.instance).addSpecialCellNew(i, specialCell);
            return this;
        }

        public Builder addStaff(int i, Staff staff) {
            copyOnWrite();
            ((ViewReply) this.instance).addStaff(i, staff);
            return this;
        }

        public Builder addSticker(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).addSticker(i, viewMaterial);
            return this;
        }

        public Builder addTag(int i, Tag tag) {
            copyOnWrite();
            ((ViewReply) this.instance).addTag(i, tag);
            return this;
        }

        public Builder addVideoSource(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((ViewReply) this.instance).addVideoSource(i, viewMaterial);
            return this;
        }

        public Builder setActivitySeason(ActivitySeason.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setActivitySeason(builder.build());
            return this;
        }

        public Builder setArc(Arc.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setArc(builder.build());
            return this;
        }

        public Builder setArcExtra(ArcExtra.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setArcExtra(builder.build());
            return this;
        }

        public Builder setArgueBar(ArgueBar.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setArgueBar(builder.build());
            return this;
        }

        public Builder setBgm(int i, Bgm.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setBgm(i, builder.build());
            return this;
        }

        public Builder setChargingPlus(ChargingPlus.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setChargingPlus(builder.build());
            return this;
        }

        public Builder setCmConfig(CMConfig.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCmConfig(builder.build());
            return this;
        }

        public Builder setCmIpad(CmIpad.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCmIpad(builder.build());
            return this;
        }

        public Builder setCmUnderPlayer(Any.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCmUnderPlayer(builder.build());
            return this;
        }

        public Builder setCms(int i, CM.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCms(i, builder.build());
            return this;
        }

        public Builder setCoinCustom(CoinCustom.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCoinCustom(builder.build());
            return this;
        }

        public Builder setCoinStyle(CoinStyle.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCoinStyle(builder.build());
            return this;
        }

        public Builder setConfig(Config.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setConfig(builder.build());
            return this;
        }

        public Builder setControlConfig(ControlConfig.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setControlConfig(builder.build());
            return this;
        }

        public Builder setCustomConfig(CustomConfig.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCustomConfig(builder.build());
            return this;
        }

        public Builder setDescTag(int i, Tag.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setDescTag(i, builder.build());
            return this;
        }

        public Builder setDescV2(int i, DescV2.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setDescV2(i, builder.build());
            return this;
        }

        public Builder setDislike(Dislike.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setDislike(builder.build());
            return this;
        }

        public Builder setElecRank(ElecRank.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setElecRank(builder.build());
            return this;
        }

        public Builder setHistory(History.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setHistory(builder.build());
            return this;
        }

        public Builder setHonor(Honor.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setHonor(builder.build());
            return this;
        }

        public Builder setInteraction(Interaction.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setInteraction(builder.build());
            return this;
        }

        public Builder setLabel(Label.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setLabel(builder.build());
            return this;
        }

        public Builder setLikeAnimation(LikeAnimation.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setLikeAnimation(builder.build());
            return this;
        }

        public Builder setLikeCustom(LikeCustom.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setLikeCustom(builder.build());
            return this;
        }

        public Builder setLiveOrderInfo(LiveOrderInfo.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setLiveOrderInfo(builder.build());
            return this;
        }

        public Builder setMaterialLeft(MaterialLeft.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setMaterialLeft(builder.build());
            return this;
        }

        public Builder setOnline(Online.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setOnline(builder.build());
            return this;
        }

        public Builder setOwnerExt(OnwerExt.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setOwnerExt(builder.build());
            return this;
        }

        public Builder setPages(int i, ViewPage.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setPages(i, builder.build());
            return this;
        }

        public Builder setPagination(PaginationReply.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder setPlayToast(int i, PlayToast.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setPlayToast(i, builder.build());
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setPlayerIcon(builder.build());
            return this;
        }

        public Builder setPremiere(PremiereResource.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setPremiere(builder.build());
            return this;
        }

        public Builder setPullAction(PullClientAction.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setPullAction(builder.build());
            return this;
        }

        public Builder setRabbitYear(RabbitYear.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setRabbitYear(builder.build());
            return this;
        }

        public Builder setRank(Rank.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setRank(builder.build());
            return this;
        }

        public Builder setRefreshPage(RefreshPage.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setRefreshPage(builder.build());
            return this;
        }

        public Builder setRejectPage(RejectPage.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setRejectPage(builder.build());
            return this;
        }

        public Builder setRelateTab(int i, RelateTab.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setRelateTab(i, builder.build());
            return this;
        }

        public Builder setRelates(int i, Relate.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setRelates(i, builder.build());
            return this;
        }

        public Builder setReplyPreface(ReplyStyle.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setReplyPreface(builder.build());
            return this;
        }

        public Builder setReqUser(ReqUser.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setReqUser(builder.build());
            return this;
        }

        public Builder setSeason(Season.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setSeason(builder.build());
            return this;
        }

        public Builder setSpecialCell(SpecialCell.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setSpecialCell(builder.build());
            return this;
        }

        public Builder setSpecialCellNew(int i, SpecialCell.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setSpecialCellNew(i, builder.build());
            return this;
        }

        public Builder setStaff(int i, Staff.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setStaff(i, builder.build());
            return this;
        }

        public Builder setStatV2(ArchiveStat.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setStatV2(builder.build());
            return this;
        }

        public Builder setSticker(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setSticker(i, builder.build());
            return this;
        }

        public Builder setTab(Tab.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setTab(builder.build());
            return this;
        }

        public Builder setTag(int i, Tag.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setTag(i, builder.build());
            return this;
        }

        public Builder setTfPanelCustomized(TFPanelCustomized.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setTfPanelCustomized(builder.build());
            return this;
        }

        public Builder setUgcSeason(UgcSeason.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setUgcSeason(builder.build());
            return this;
        }

        public Builder setUpAct(UpAct.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setUpAct(builder.build());
            return this;
        }

        public Builder setUpLikeImg(UpLikeImg.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setUpLikeImg(builder.build());
            return this;
        }

        public Builder setUpViewMaterial(UpViewMaterial.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setUpViewMaterial(builder.build());
            return this;
        }

        public Builder setUserGarb(UserGarb.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setUserGarb(builder.build());
            return this;
        }

        public Builder setUserRelation(UserRelation.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setUserRelation(builder.build());
            return this;
        }

        public Builder setVideoSource(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setVideoSource(i, builder.build());
            return this;
        }

        public Builder addBgm(Bgm.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addBgm(builder.build());
            return this;
        }

        public Builder addCms(CM.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addCms(builder.build());
            return this;
        }

        public Builder addDescTag(Tag.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescTag(builder.build());
            return this;
        }

        public Builder addDescV2(DescV2.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescV2(builder.build());
            return this;
        }

        public Builder addPages(ViewPage.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addPages(builder.build());
            return this;
        }

        public Builder addPlayToast(PlayToast.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addPlayToast(builder.build());
            return this;
        }

        public Builder addRelateTab(RelateTab.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelateTab(builder.build());
            return this;
        }

        public Builder addRelates(Relate.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelates(builder.build());
            return this;
        }

        public Builder addSpecialCellNew(SpecialCell.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addSpecialCellNew(builder.build());
            return this;
        }

        public Builder addStaff(Staff.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addStaff(builder.build());
            return this;
        }

        public Builder addSticker(ViewMaterial.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addSticker(builder.build());
            return this;
        }

        public Builder addTag(Tag.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addTag(builder.build());
            return this;
        }

        public Builder addVideoSource(ViewMaterial.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addVideoSource(builder.build());
            return this;
        }

        public Builder addBgm(int i, Bgm.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addBgm(i, builder.build());
            return this;
        }

        public Builder addCms(int i, CM.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addCms(i, builder.build());
            return this;
        }

        public Builder addDescTag(int i, Tag.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescTag(i, builder.build());
            return this;
        }

        public Builder addDescV2(int i, DescV2.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addDescV2(i, builder.build());
            return this;
        }

        public Builder addPages(int i, ViewPage.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addPages(i, builder.build());
            return this;
        }

        public Builder addPlayToast(int i, PlayToast.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addPlayToast(i, builder.build());
            return this;
        }

        public Builder addRelateTab(int i, RelateTab.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelateTab(i, builder.build());
            return this;
        }

        public Builder addRelates(int i, Relate.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addRelates(i, builder.build());
            return this;
        }

        public Builder addSpecialCellNew(int i, SpecialCell.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addSpecialCellNew(i, builder.build());
            return this;
        }

        public Builder addStaff(int i, Staff.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addStaff(i, builder.build());
            return this;
        }

        public Builder addSticker(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addSticker(i, builder.build());
            return this;
        }

        public Builder addTag(int i, Tag.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addTag(i, builder.build());
            return this;
        }

        public Builder addVideoSource(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).addVideoSource(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class TIconDefaultEntryHolder {
        static final MapEntryLite<String, TIcon> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, TIcon.getDefaultInstance());

        private TIconDefaultEntryHolder() {
        }
    }

    static {
        ViewReply viewReply = new ViewReply();
        DEFAULT_INSTANCE = viewReply;
        GeneratedMessageLite.registerDefaultInstance(ViewReply.class, viewReply);
    }

    private ViewReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBgm(Iterable<? extends Bgm> iterable) {
        ensureBgmIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bgm_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCms(Iterable<? extends CM> iterable) {
        ensureCmsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDescTag(Iterable<? extends Tag> iterable) {
        ensureDescTagIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.descTag_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDescV2(Iterable<? extends DescV2> iterable) {
        ensureDescV2IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.descV2_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPages(Iterable<? extends ViewPage> iterable) {
        ensurePagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPlayToast(Iterable<? extends PlayToast> iterable) {
        ensurePlayToastIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.playToast_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelateTab(Iterable<? extends RelateTab> iterable) {
        ensureRelateTabIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.relateTab_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelates(Iterable<? extends Relate> iterable) {
        ensureRelatesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.relates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpecialCellNew(Iterable<? extends SpecialCell> iterable) {
        ensureSpecialCellNewIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.specialCellNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStaff(Iterable<? extends Staff> iterable) {
        ensureStaffIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.staff_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSticker(Iterable<? extends ViewMaterial> iterable) {
        ensureStickerIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sticker_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTag(Iterable<? extends Tag> iterable) {
        ensureTagIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tag_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVideoSource(Iterable<? extends ViewMaterial> iterable) {
        ensureVideoSourceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.videoSource_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBgm(Bgm bgm) {
        bgm.getClass();
        ensureBgmIsMutable();
        this.bgm_.add(bgm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCms(CM cm) {
        cm.getClass();
        ensureCmsIsMutable();
        this.cms_.add(cm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescTag(Tag tag) {
        tag.getClass();
        ensureDescTagIsMutable();
        this.descTag_.add(tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescV2(DescV2 descV2) {
        descV2.getClass();
        ensureDescV2IsMutable();
        this.descV2_.add(descV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(viewPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayToast(PlayToast playToast) {
        playToast.getClass();
        ensurePlayToastIsMutable();
        this.playToast_.add(playToast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelateTab(RelateTab relateTab) {
        relateTab.getClass();
        ensureRelateTabIsMutable();
        this.relateTab_.add(relateTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelates(Relate relate) {
        relate.getClass();
        ensureRelatesIsMutable();
        this.relates_.add(relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpecialCellNew(SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.add(specialCell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStaff(Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.add(staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSticker(ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureStickerIsMutable();
        this.sticker_.add(viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTag(Tag tag) {
        tag.getClass();
        ensureTagIsMutable();
        this.tag_.add(tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoSource(ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureVideoSourceIsMutable();
        this.videoSource_.add(viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivitySeason() {
        this.activitySeason_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityUrl() {
        this.activityUrl_ = getDefaultInstance().getActivityUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArc() {
        this.arc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcExtra() {
        this.arcExtra_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArgueBar() {
        this.argueBar_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArgueMsg() {
        this.argueMsg_ = getDefaultInstance().getArgueMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeUrl() {
        this.badgeUrl_ = getDefaultInstance().getBadgeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgm() {
        this.bgm_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChargingPlus() {
        this.chargingPlus_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmConfig() {
        this.cmConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmIpad() {
        this.cmIpad_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmUnderPlayer() {
        this.cmUnderPlayer_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCms() {
        this.cms_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinCustom() {
        this.coinCustom_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinStyle() {
        this.coinStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControlConfig() {
        this.controlConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomConfig() {
        this.customConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescTag() {
        this.descTag_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescV2() {
        this.descV2_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislike() {
        this.dislike_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcode() {
        this.ecode_ = 0;
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
    public void clearHonor() {
        this.honor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteraction() {
        this.interaction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeAnimation() {
        this.likeAnimation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeCustom() {
        this.likeCustom_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiveOrderInfo() {
        this.liveOrderInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialLeft() {
        this.materialLeft_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotesCount() {
        this.notesCount_ = 0L;
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
    public void clearPagination() {
        this.pagination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayParam() {
        this.playParam_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayToast() {
        this.playToast_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerIcon() {
        this.playerIcon_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPremiere() {
        this.premiere_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPullAction() {
        this.pullAction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRabbitYear() {
        this.rabbitYear_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.rank_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshPage() {
        this.refreshPage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshSpecialCell() {
        this.refreshSpecialCell_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRejectPage() {
        this.rejectPage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelateTab() {
        this.relateTab_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelates() {
        this.relates_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplyPreface() {
        this.replyPreface_ = null;
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
    public void clearSpecialCell() {
        this.specialCell_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpecialCellNew() {
        this.specialCellNew_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaff() {
        this.staff_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatV2() {
        this.statV2_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSticker() {
        this.sticker_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTab() {
        this.tab_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTfPanelCustomized() {
        this.tfPanelCustomized_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcSeason() {
        this.ugcSeason_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpAct() {
        this.upAct_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpLikeImg() {
        this.upLikeImg_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpViewMaterial() {
        this.upViewMaterial_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserGarb() {
        this.userGarb_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserRelation() {
        this.userRelation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoSource() {
        this.videoSource_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewState() {
        this.viewState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipActive() {
        this.vipActive_ = getDefaultInstance().getVipActive();
    }

    private void ensureBgmIsMutable() {
        Internal.ProtobufList<Bgm> protobufList = this.bgm_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bgm_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCmsIsMutable() {
        Internal.ProtobufList<CM> protobufList = this.cms_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cms_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDescTagIsMutable() {
        Internal.ProtobufList<Tag> protobufList = this.descTag_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.descTag_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDescV2IsMutable() {
        Internal.ProtobufList<DescV2> protobufList = this.descV2_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.descV2_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePagesIsMutable() {
        Internal.ProtobufList<ViewPage> protobufList = this.pages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.pages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePlayToastIsMutable() {
        Internal.ProtobufList<PlayToast> protobufList = this.playToast_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.playToast_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRelateTabIsMutable() {
        Internal.ProtobufList<RelateTab> protobufList = this.relateTab_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.relateTab_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRelatesIsMutable() {
        Internal.ProtobufList<Relate> protobufList = this.relates_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.relates_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSpecialCellNewIsMutable() {
        Internal.ProtobufList<SpecialCell> protobufList = this.specialCellNew_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.specialCellNew_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureStaffIsMutable() {
        Internal.ProtobufList<Staff> protobufList = this.staff_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.staff_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureStickerIsMutable() {
        Internal.ProtobufList<ViewMaterial> protobufList = this.sticker_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sticker_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTagIsMutable() {
        Internal.ProtobufList<Tag> protobufList = this.tag_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tag_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureVideoSourceIsMutable() {
        Internal.ProtobufList<ViewMaterial> protobufList = this.videoSource_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.videoSource_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ViewReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, TIcon> getMutableTIconMap() {
        return internalGetMutableTIcon();
    }

    private MapFieldLite<String, TIcon> internalGetMutableTIcon() {
        if (!this.tIcon_.isMutable()) {
            this.tIcon_ = this.tIcon_.mutableCopy();
        }
        return this.tIcon_;
    }

    private MapFieldLite<String, TIcon> internalGetTIcon() {
        return this.tIcon_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivitySeason(ActivitySeason activitySeason) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArc(Arc arc) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArcExtra(ArcExtra arcExtra) {
        arcExtra.getClass();
        ArcExtra arcExtra2 = this.arcExtra_;
        if (arcExtra2 != null && arcExtra2 != ArcExtra.getDefaultInstance()) {
            this.arcExtra_ = ArcExtra.newBuilder(this.arcExtra_).mergeFrom(arcExtra).buildPartial();
        } else {
            this.arcExtra_ = arcExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArgueBar(ArgueBar argueBar) {
        argueBar.getClass();
        ArgueBar argueBar2 = this.argueBar_;
        if (argueBar2 != null && argueBar2 != ArgueBar.getDefaultInstance()) {
            this.argueBar_ = ArgueBar.newBuilder(this.argueBar_).mergeFrom(argueBar).buildPartial();
        } else {
            this.argueBar_ = argueBar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChargingPlus(ChargingPlus chargingPlus) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCmConfig(CMConfig cMConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCmIpad(CmIpad cmIpad) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCmUnderPlayer(Any any) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoinCustom(CoinCustom coinCustom) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoinStyle(CoinStyle coinStyle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfig(Config config) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControlConfig(ControlConfig controlConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomConfig(CustomConfig customConfig) {
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
    public void mergeHonor(Honor honor) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInteraction(Interaction interaction) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(Label label) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikeAnimation(LikeAnimation likeAnimation) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikeCustom(LikeCustom likeCustom) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLiveOrderInfo(LiveOrderInfo liveOrderInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMaterialLeft(MaterialLeft materialLeft) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnline(Online online) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOwnerExt(OnwerExt onwerExt) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(PaginationReply paginationReply) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerIcon(PlayerIcon playerIcon) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePremiere(PremiereResource premiereResource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePullAction(PullClientAction pullClientAction) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRabbitYear(RabbitYear rabbitYear) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRank(Rank rank) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRefreshPage(RefreshPage refreshPage) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRejectPage(RejectPage rejectPage) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReplyPreface(ReplyStyle replyStyle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReqUser(ReqUser reqUser) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeason(Season season) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpecialCell(SpecialCell specialCell) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatV2(ArchiveStat archiveStat) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTab(Tab tab) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcSeason(UgcSeason ugcSeason) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpAct(UpAct upAct) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpLikeImg(UpLikeImg upLikeImg) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpViewMaterial(UpViewMaterial upViewMaterial) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserGarb(UserGarb userGarb) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserRelation(UserRelation userRelation) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBgm(int i) {
        ensureBgmIsMutable();
        this.bgm_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCms(int i) {
        ensureCmsIsMutable();
        this.cms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDescTag(int i) {
        ensureDescTagIsMutable();
        this.descTag_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDescV2(int i) {
        ensureDescV2IsMutable();
        this.descV2_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePlayToast(int i) {
        ensurePlayToastIsMutable();
        this.playToast_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelateTab(int i) {
        ensureRelateTabIsMutable();
        this.relateTab_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelates(int i) {
        ensureRelatesIsMutable();
        this.relates_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpecialCellNew(int i) {
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStaff(int i) {
        ensureStaffIsMutable();
        this.staff_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSticker(int i) {
        ensureStickerIsMutable();
        this.sticker_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTag(int i) {
        ensureTagIsMutable();
        this.tag_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVideoSource(int i) {
        ensureVideoSourceIsMutable();
        this.videoSource_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivitySeason(ActivitySeason activitySeason) {
        activitySeason.getClass();
        this.activitySeason_ = activitySeason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityUrl(String str) {
        str.getClass();
        this.activityUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.activityUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArc(Arc arc) {
        arc.getClass();
        this.arc_ = arc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcExtra(ArcExtra arcExtra) {
        arcExtra.getClass();
        this.arcExtra_ = arcExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgueBar(ArgueBar argueBar) {
        argueBar.getClass();
        this.argueBar_ = argueBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgueMsg(String str) {
        str.getClass();
        this.argueMsg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgueMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.argueMsg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeUrl(String str) {
        str.getClass();
        this.badgeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badgeUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgm(int i, Bgm bgm) {
        bgm.getClass();
        ensureBgmIsMutable();
        this.bgm_.set(i, bgm);
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
    public void setChargingPlus(ChargingPlus chargingPlus) {
        chargingPlus.getClass();
        this.chargingPlus_ = chargingPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmConfig(CMConfig cMConfig) {
        cMConfig.getClass();
        this.cmConfig_ = cMConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmIpad(CmIpad cmIpad) {
        cmIpad.getClass();
        this.cmIpad_ = cmIpad;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmUnderPlayer(Any any) {
        any.getClass();
        this.cmUnderPlayer_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCms(int i, CM cm) {
        cm.getClass();
        ensureCmsIsMutable();
        this.cms_.set(i, cm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinCustom(CoinCustom coinCustom) {
        coinCustom.getClass();
        this.coinCustom_ = coinCustom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinStyle(CoinStyle coinStyle) {
        coinStyle.getClass();
        this.coinStyle_ = coinStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(Config config) {
        config.getClass();
        this.config_ = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControlConfig(ControlConfig controlConfig) {
        controlConfig.getClass();
        this.controlConfig_ = controlConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomConfig(CustomConfig customConfig) {
        customConfig.getClass();
        this.customConfig_ = customConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescTag(int i, Tag tag) {
        tag.getClass();
        ensureDescTagIsMutable();
        this.descTag_.set(i, tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescV2(int i, DescV2 descV2) {
        descV2.getClass();
        ensureDescV2IsMutable();
        this.descV2_.set(i, descV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislike(Dislike dislike) {
        dislike.getClass();
        this.dislike_ = dislike;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcode(ECode eCode) {
        this.ecode_ = eCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcodeValue(int i) {
        this.ecode_ = i;
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
    public void setHonor(Honor honor) {
        honor.getClass();
        this.honor_ = honor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteraction(Interaction interaction) {
        interaction.getClass();
        this.interaction_ = interaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(Label label) {
        label.getClass();
        this.label_ = label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeAnimation(LikeAnimation likeAnimation) {
        likeAnimation.getClass();
        this.likeAnimation_ = likeAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeCustom(LikeCustom likeCustom) {
        likeCustom.getClass();
        this.likeCustom_ = likeCustom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiveOrderInfo(LiveOrderInfo liveOrderInfo) {
        liveOrderInfo.getClass();
        this.liveOrderInfo_ = liveOrderInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialLeft(MaterialLeft materialLeft) {
        materialLeft.getClass();
        this.materialLeft_ = materialLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotesCount(long j) {
        this.notesCount_ = j;
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
    public void setPagination(PaginationReply paginationReply) {
        paginationReply.getClass();
        this.pagination_ = paginationReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayParam(int i) {
        this.playParam_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayToast(int i, PlayToast playToast) {
        playToast.getClass();
        ensurePlayToastIsMutable();
        this.playToast_.set(i, playToast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerIcon(PlayerIcon playerIcon) {
        playerIcon.getClass();
        this.playerIcon_ = playerIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiere(PremiereResource premiereResource) {
        premiereResource.getClass();
        this.premiere_ = premiereResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPullAction(PullClientAction pullClientAction) {
        pullClientAction.getClass();
        this.pullAction_ = pullClientAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRabbitYear(RabbitYear rabbitYear) {
        rabbitYear.getClass();
        this.rabbitYear_ = rabbitYear;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(Rank rank) {
        rank.getClass();
        this.rank_ = rank;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshPage(RefreshPage refreshPage) {
        refreshPage.getClass();
        this.refreshPage_ = refreshPage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshSpecialCell(boolean z) {
        this.refreshSpecialCell_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRejectPage(RejectPage rejectPage) {
        rejectPage.getClass();
        this.rejectPage_ = rejectPage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelateTab(int i, RelateTab relateTab) {
        relateTab.getClass();
        ensureRelateTabIsMutable();
        this.relateTab_.set(i, relateTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelates(int i, Relate relate) {
        relate.getClass();
        ensureRelatesIsMutable();
        this.relates_.set(i, relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyPreface(ReplyStyle replyStyle) {
        replyStyle.getClass();
        this.replyPreface_ = replyStyle;
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
    public void setSpecialCell(SpecialCell specialCell) {
        specialCell.getClass();
        this.specialCell_ = specialCell;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecialCellNew(int i, SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.set(i, specialCell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaff(int i, Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.set(i, staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatV2(ArchiveStat archiveStat) {
        archiveStat.getClass();
        this.statV2_ = archiveStat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSticker(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureStickerIsMutable();
        this.sticker_.set(i, viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTab(Tab tab) {
        tab.getClass();
        this.tab_ = tab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(int i, Tag tag) {
        tag.getClass();
        ensureTagIsMutable();
        this.tag_.set(i, tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
        tFPanelCustomized.getClass();
        this.tfPanelCustomized_ = tFPanelCustomized;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcSeason(UgcSeason ugcSeason) {
        ugcSeason.getClass();
        this.ugcSeason_ = ugcSeason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpAct(UpAct upAct) {
        upAct.getClass();
        this.upAct_ = upAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLikeImg(UpLikeImg upLikeImg) {
        upLikeImg.getClass();
        this.upLikeImg_ = upLikeImg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpViewMaterial(UpViewMaterial upViewMaterial) {
        upViewMaterial.getClass();
        this.upViewMaterial_ = upViewMaterial;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGarb(UserGarb userGarb) {
        userGarb.getClass();
        this.userGarb_ = userGarb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRelation(UserRelation userRelation) {
        userRelation.getClass();
        this.userRelation_ = userRelation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSource(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureVideoSourceIsMutable();
        this.videoSource_.set(i, viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewState(ViewState viewState) {
        this.viewState_ = viewState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewStateValue(int i) {
        this.viewState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipActive(String str) {
        str.getClass();
        this.vipActive_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipActiveBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vipActive_ = byteString.toStringUtf8();
    }

    public boolean containsTIcon(String str) {
        str.getClass();
        return internalGetTIcon().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69041.f16857xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000H\u0000\u0000\u0001HH\u0001\r\u0000\u0001\t\u0002\u001b\u0003\t\u0004\t\u0005\u001b\u00062\u0007\t\b\t\t\t\n\u001b\u000b\t\f\t\r\u0208\u000e\u0208\u000f\t\u0010\u001b\u0011\u0208\u0012\u001b\u0013\u001b\u0014\u0208\u0015\u0208\u0016\u0004\u0017\t\u0018\t\u0019\t\u001a\u0208\u001b\t\u001c\f\u001d\t\u001e\u001b\u001f\t \t!\t\"\t#\t$\t%\t&\u0208'\t(\u001b)\t*\u001b+\t,\t-\u001b.\t/\t0\t1\u001b2\u001b3\t4\u00075\t6\u00027\t8\t9\t:\t;\t<\t=\t>\t?\t@\tA\tB\tC\tD\tE\tF\u001bG\fH\t", new Object[]{"arc_", "pages_", ViewPage.class, "ownerExt_", "reqUser_", "tag_", Tag.class, "tIcon_", TIconDefaultEntryHolder.defaultEntry, "season_", "elecRank_", "history_", "relates_", Relate.class, "dislike_", "playerIcon_", "vipActive_", "bvid_", "honor_", "relateTab_", RelateTab.class, "activityUrl_", "bgm_", Bgm.class, "staff_", Staff.class, "argueMsg_", "shortLink_", "playParam_", "label_", "ugcSeason_", "config_", "shareSubtitle_", "interaction_", "ecode_", "customConfig_", "cms_", CM.class, "cmConfig_", "tab_", "rank_", "tfPanelCustomized_", "upAct_", "userGarb_", "activitySeason_", "badgeUrl_", "liveOrderInfo_", "descV2_", DescV2.class, "cmIpad_", "sticker_", ViewMaterial.class, "upLikeImg_", "likeCustom_", "descTag_", Tag.class, "specialCell_", "online_", "cmUnderPlayer_", "videoSource_", ViewMaterial.class, "specialCellNew_", SpecialCell.class, "premiere_", "refreshSpecialCell_", "materialLeft_", "notesCount_", "pullAction_", "arcExtra_", "pagination_", "likeAnimation_", "replyPreface_", "refreshPage_", "coinCustom_", "controlConfig_", "upViewMaterial_", "userRelation_", "coinStyle_", "rabbitYear_", "statV2_", "chargingPlus_", "rejectPage_", "playToast_", PlayToast.class, "viewState_", "argueBar_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewReply.class) {
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

    public ActivitySeason getActivitySeason() {
        ActivitySeason activitySeason = this.activitySeason_;
        return activitySeason == null ? ActivitySeason.getDefaultInstance() : activitySeason;
    }

    public String getActivityUrl() {
        return this.activityUrl_;
    }

    public ByteString getActivityUrlBytes() {
        return ByteString.copyFromUtf8(this.activityUrl_);
    }

    public Arc getArc() {
        Arc arc = this.arc_;
        return arc == null ? Arc.getDefaultInstance() : arc;
    }

    public ArcExtra getArcExtra() {
        ArcExtra arcExtra = this.arcExtra_;
        return arcExtra == null ? ArcExtra.getDefaultInstance() : arcExtra;
    }

    public ArgueBar getArgueBar() {
        ArgueBar argueBar = this.argueBar_;
        return argueBar == null ? ArgueBar.getDefaultInstance() : argueBar;
    }

    public String getArgueMsg() {
        return this.argueMsg_;
    }

    public ByteString getArgueMsgBytes() {
        return ByteString.copyFromUtf8(this.argueMsg_);
    }

    public String getBadgeUrl() {
        return this.badgeUrl_;
    }

    public ByteString getBadgeUrlBytes() {
        return ByteString.copyFromUtf8(this.badgeUrl_);
    }

    public Bgm getBgm(int i) {
        return this.bgm_.get(i);
    }

    public int getBgmCount() {
        return this.bgm_.size();
    }

    public List<Bgm> getBgmList() {
        return this.bgm_;
    }

    public BgmOrBuilder getBgmOrBuilder(int i) {
        return this.bgm_.get(i);
    }

    public List<? extends BgmOrBuilder> getBgmOrBuilderList() {
        return this.bgm_;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public ChargingPlus getChargingPlus() {
        ChargingPlus chargingPlus = this.chargingPlus_;
        return chargingPlus == null ? ChargingPlus.getDefaultInstance() : chargingPlus;
    }

    public CMConfig getCmConfig() {
        CMConfig cMConfig = this.cmConfig_;
        return cMConfig == null ? CMConfig.getDefaultInstance() : cMConfig;
    }

    public CmIpad getCmIpad() {
        CmIpad cmIpad = this.cmIpad_;
        return cmIpad == null ? CmIpad.getDefaultInstance() : cmIpad;
    }

    public Any getCmUnderPlayer() {
        Any any = this.cmUnderPlayer_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public CM getCms(int i) {
        return this.cms_.get(i);
    }

    public int getCmsCount() {
        return this.cms_.size();
    }

    public List<CM> getCmsList() {
        return this.cms_;
    }

    public CMOrBuilder getCmsOrBuilder(int i) {
        return this.cms_.get(i);
    }

    public List<? extends CMOrBuilder> getCmsOrBuilderList() {
        return this.cms_;
    }

    public CoinCustom getCoinCustom() {
        CoinCustom coinCustom = this.coinCustom_;
        return coinCustom == null ? CoinCustom.getDefaultInstance() : coinCustom;
    }

    public CoinStyle getCoinStyle() {
        CoinStyle coinStyle = this.coinStyle_;
        return coinStyle == null ? CoinStyle.getDefaultInstance() : coinStyle;
    }

    public Config getConfig() {
        Config config = this.config_;
        return config == null ? Config.getDefaultInstance() : config;
    }

    public ControlConfig getControlConfig() {
        ControlConfig controlConfig = this.controlConfig_;
        return controlConfig == null ? ControlConfig.getDefaultInstance() : controlConfig;
    }

    public CustomConfig getCustomConfig() {
        CustomConfig customConfig = this.customConfig_;
        return customConfig == null ? CustomConfig.getDefaultInstance() : customConfig;
    }

    public Tag getDescTag(int i) {
        return this.descTag_.get(i);
    }

    public int getDescTagCount() {
        return this.descTag_.size();
    }

    public List<Tag> getDescTagList() {
        return this.descTag_;
    }

    public TagOrBuilder getDescTagOrBuilder(int i) {
        return this.descTag_.get(i);
    }

    public List<? extends TagOrBuilder> getDescTagOrBuilderList() {
        return this.descTag_;
    }

    public DescV2 getDescV2(int i) {
        return this.descV2_.get(i);
    }

    public int getDescV2Count() {
        return this.descV2_.size();
    }

    public List<DescV2> getDescV2List() {
        return this.descV2_;
    }

    public DescV2OrBuilder getDescV2OrBuilder(int i) {
        return this.descV2_.get(i);
    }

    public List<? extends DescV2OrBuilder> getDescV2OrBuilderList() {
        return this.descV2_;
    }

    public Dislike getDislike() {
        Dislike dislike = this.dislike_;
        return dislike == null ? Dislike.getDefaultInstance() : dislike;
    }

    public ECode getEcode() {
        ECode forNumber = ECode.forNumber(this.ecode_);
        return forNumber == null ? ECode.UNRECOGNIZED : forNumber;
    }

    public int getEcodeValue() {
        return this.ecode_;
    }

    public ElecRank getElecRank() {
        ElecRank elecRank = this.elecRank_;
        return elecRank == null ? ElecRank.getDefaultInstance() : elecRank;
    }

    public History getHistory() {
        History history = this.history_;
        return history == null ? History.getDefaultInstance() : history;
    }

    public Honor getHonor() {
        Honor honor = this.honor_;
        return honor == null ? Honor.getDefaultInstance() : honor;
    }

    public Interaction getInteraction() {
        Interaction interaction = this.interaction_;
        return interaction == null ? Interaction.getDefaultInstance() : interaction;
    }

    public Label getLabel() {
        Label label = this.label_;
        return label == null ? Label.getDefaultInstance() : label;
    }

    public LikeAnimation getLikeAnimation() {
        LikeAnimation likeAnimation = this.likeAnimation_;
        return likeAnimation == null ? LikeAnimation.getDefaultInstance() : likeAnimation;
    }

    public LikeCustom getLikeCustom() {
        LikeCustom likeCustom = this.likeCustom_;
        return likeCustom == null ? LikeCustom.getDefaultInstance() : likeCustom;
    }

    public LiveOrderInfo getLiveOrderInfo() {
        LiveOrderInfo liveOrderInfo = this.liveOrderInfo_;
        return liveOrderInfo == null ? LiveOrderInfo.getDefaultInstance() : liveOrderInfo;
    }

    public MaterialLeft getMaterialLeft() {
        MaterialLeft materialLeft = this.materialLeft_;
        return materialLeft == null ? MaterialLeft.getDefaultInstance() : materialLeft;
    }

    public long getNotesCount() {
        return this.notesCount_;
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

    public PaginationReply getPagination() {
        PaginationReply paginationReply = this.pagination_;
        return paginationReply == null ? PaginationReply.getDefaultInstance() : paginationReply;
    }

    public int getPlayParam() {
        return this.playParam_;
    }

    public PlayToast getPlayToast(int i) {
        return this.playToast_.get(i);
    }

    public int getPlayToastCount() {
        return this.playToast_.size();
    }

    public List<PlayToast> getPlayToastList() {
        return this.playToast_;
    }

    public PlayToastOrBuilder getPlayToastOrBuilder(int i) {
        return this.playToast_.get(i);
    }

    public List<? extends PlayToastOrBuilder> getPlayToastOrBuilderList() {
        return this.playToast_;
    }

    public PlayerIcon getPlayerIcon() {
        PlayerIcon playerIcon = this.playerIcon_;
        return playerIcon == null ? PlayerIcon.getDefaultInstance() : playerIcon;
    }

    public PremiereResource getPremiere() {
        PremiereResource premiereResource = this.premiere_;
        return premiereResource == null ? PremiereResource.getDefaultInstance() : premiereResource;
    }

    public PullClientAction getPullAction() {
        PullClientAction pullClientAction = this.pullAction_;
        return pullClientAction == null ? PullClientAction.getDefaultInstance() : pullClientAction;
    }

    public RabbitYear getRabbitYear() {
        RabbitYear rabbitYear = this.rabbitYear_;
        return rabbitYear == null ? RabbitYear.getDefaultInstance() : rabbitYear;
    }

    public Rank getRank() {
        Rank rank = this.rank_;
        return rank == null ? Rank.getDefaultInstance() : rank;
    }

    public RefreshPage getRefreshPage() {
        RefreshPage refreshPage = this.refreshPage_;
        return refreshPage == null ? RefreshPage.getDefaultInstance() : refreshPage;
    }

    public boolean getRefreshSpecialCell() {
        return this.refreshSpecialCell_;
    }

    public RejectPage getRejectPage() {
        RejectPage rejectPage = this.rejectPage_;
        return rejectPage == null ? RejectPage.getDefaultInstance() : rejectPage;
    }

    public RelateTab getRelateTab(int i) {
        return this.relateTab_.get(i);
    }

    public int getRelateTabCount() {
        return this.relateTab_.size();
    }

    public List<RelateTab> getRelateTabList() {
        return this.relateTab_;
    }

    public RelateTabOrBuilder getRelateTabOrBuilder(int i) {
        return this.relateTab_.get(i);
    }

    public List<? extends RelateTabOrBuilder> getRelateTabOrBuilderList() {
        return this.relateTab_;
    }

    public Relate getRelates(int i) {
        return this.relates_.get(i);
    }

    public int getRelatesCount() {
        return this.relates_.size();
    }

    public List<Relate> getRelatesList() {
        return this.relates_;
    }

    public RelateOrBuilder getRelatesOrBuilder(int i) {
        return this.relates_.get(i);
    }

    public List<? extends RelateOrBuilder> getRelatesOrBuilderList() {
        return this.relates_;
    }

    public ReplyStyle getReplyPreface() {
        ReplyStyle replyStyle = this.replyPreface_;
        return replyStyle == null ? ReplyStyle.getDefaultInstance() : replyStyle;
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

    public SpecialCell getSpecialCell() {
        SpecialCell specialCell = this.specialCell_;
        return specialCell == null ? SpecialCell.getDefaultInstance() : specialCell;
    }

    public SpecialCell getSpecialCellNew(int i) {
        return this.specialCellNew_.get(i);
    }

    public int getSpecialCellNewCount() {
        return this.specialCellNew_.size();
    }

    public List<SpecialCell> getSpecialCellNewList() {
        return this.specialCellNew_;
    }

    public SpecialCellOrBuilder getSpecialCellNewOrBuilder(int i) {
        return this.specialCellNew_.get(i);
    }

    public List<? extends SpecialCellOrBuilder> getSpecialCellNewOrBuilderList() {
        return this.specialCellNew_;
    }

    public Staff getStaff(int i) {
        return this.staff_.get(i);
    }

    public int getStaffCount() {
        return this.staff_.size();
    }

    public List<Staff> getStaffList() {
        return this.staff_;
    }

    public StaffOrBuilder getStaffOrBuilder(int i) {
        return this.staff_.get(i);
    }

    public List<? extends StaffOrBuilder> getStaffOrBuilderList() {
        return this.staff_;
    }

    public ArchiveStat getStatV2() {
        ArchiveStat archiveStat = this.statV2_;
        return archiveStat == null ? ArchiveStat.getDefaultInstance() : archiveStat;
    }

    public ViewMaterial getSticker(int i) {
        return this.sticker_.get(i);
    }

    public int getStickerCount() {
        return this.sticker_.size();
    }

    public List<ViewMaterial> getStickerList() {
        return this.sticker_;
    }

    public ViewMaterialOrBuilder getStickerOrBuilder(int i) {
        return this.sticker_.get(i);
    }

    public List<? extends ViewMaterialOrBuilder> getStickerOrBuilderList() {
        return this.sticker_;
    }

    @Deprecated
    public Map<String, TIcon> getTIcon() {
        return getTIconMap();
    }

    public int getTIconCount() {
        return internalGetTIcon().size();
    }

    public Map<String, TIcon> getTIconMap() {
        return Collections.unmodifiableMap(internalGetTIcon());
    }

    public TIcon getTIconOrDefault(String str, TIcon tIcon) {
        str.getClass();
        MapFieldLite<String, TIcon> internalGetTIcon = internalGetTIcon();
        return internalGetTIcon.containsKey(str) ? internalGetTIcon.get(str) : tIcon;
    }

    public TIcon getTIconOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, TIcon> internalGetTIcon = internalGetTIcon();
        if (internalGetTIcon.containsKey(str)) {
            return internalGetTIcon.get(str);
        }
        throw new IllegalArgumentException();
    }

    public Tab getTab() {
        Tab tab = this.tab_;
        return tab == null ? Tab.getDefaultInstance() : tab;
    }

    public Tag getTag(int i) {
        return this.tag_.get(i);
    }

    public int getTagCount() {
        return this.tag_.size();
    }

    public List<Tag> getTagList() {
        return this.tag_;
    }

    public TagOrBuilder getTagOrBuilder(int i) {
        return this.tag_.get(i);
    }

    public List<? extends TagOrBuilder> getTagOrBuilderList() {
        return this.tag_;
    }

    public TFPanelCustomized getTfPanelCustomized() {
        TFPanelCustomized tFPanelCustomized = this.tfPanelCustomized_;
        return tFPanelCustomized == null ? TFPanelCustomized.getDefaultInstance() : tFPanelCustomized;
    }

    public UgcSeason getUgcSeason() {
        UgcSeason ugcSeason = this.ugcSeason_;
        return ugcSeason == null ? UgcSeason.getDefaultInstance() : ugcSeason;
    }

    public UpAct getUpAct() {
        UpAct upAct = this.upAct_;
        return upAct == null ? UpAct.getDefaultInstance() : upAct;
    }

    public UpLikeImg getUpLikeImg() {
        UpLikeImg upLikeImg = this.upLikeImg_;
        return upLikeImg == null ? UpLikeImg.getDefaultInstance() : upLikeImg;
    }

    public UpViewMaterial getUpViewMaterial() {
        UpViewMaterial upViewMaterial = this.upViewMaterial_;
        return upViewMaterial == null ? UpViewMaterial.getDefaultInstance() : upViewMaterial;
    }

    public UserGarb getUserGarb() {
        UserGarb userGarb = this.userGarb_;
        return userGarb == null ? UserGarb.getDefaultInstance() : userGarb;
    }

    public UserRelation getUserRelation() {
        UserRelation userRelation = this.userRelation_;
        return userRelation == null ? UserRelation.getDefaultInstance() : userRelation;
    }

    public ViewMaterial getVideoSource(int i) {
        return this.videoSource_.get(i);
    }

    public int getVideoSourceCount() {
        return this.videoSource_.size();
    }

    public List<ViewMaterial> getVideoSourceList() {
        return this.videoSource_;
    }

    public ViewMaterialOrBuilder getVideoSourceOrBuilder(int i) {
        return this.videoSource_.get(i);
    }

    public List<? extends ViewMaterialOrBuilder> getVideoSourceOrBuilderList() {
        return this.videoSource_;
    }

    public ViewState getViewState() {
        ViewState forNumber = ViewState.forNumber(this.viewState_);
        return forNumber == null ? ViewState.UNRECOGNIZED : forNumber;
    }

    public int getViewStateValue() {
        return this.viewState_;
    }

    public String getVipActive() {
        return this.vipActive_;
    }

    public ByteString getVipActiveBytes() {
        return ByteString.copyFromUtf8(this.vipActive_);
    }

    public boolean hasActivitySeason() {
        return this.activitySeason_ != null;
    }

    public boolean hasArc() {
        return this.arc_ != null;
    }

    public boolean hasArcExtra() {
        return this.arcExtra_ != null;
    }

    public boolean hasArgueBar() {
        return this.argueBar_ != null;
    }

    public boolean hasChargingPlus() {
        return this.chargingPlus_ != null;
    }

    public boolean hasCmConfig() {
        return this.cmConfig_ != null;
    }

    public boolean hasCmIpad() {
        return this.cmIpad_ != null;
    }

    public boolean hasCmUnderPlayer() {
        return this.cmUnderPlayer_ != null;
    }

    public boolean hasCoinCustom() {
        return this.coinCustom_ != null;
    }

    public boolean hasCoinStyle() {
        return this.coinStyle_ != null;
    }

    public boolean hasConfig() {
        return this.config_ != null;
    }

    public boolean hasControlConfig() {
        return this.controlConfig_ != null;
    }

    public boolean hasCustomConfig() {
        return this.customConfig_ != null;
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

    public boolean hasHonor() {
        return this.honor_ != null;
    }

    public boolean hasInteraction() {
        return this.interaction_ != null;
    }

    public boolean hasLabel() {
        return this.label_ != null;
    }

    public boolean hasLikeAnimation() {
        return this.likeAnimation_ != null;
    }

    public boolean hasLikeCustom() {
        return this.likeCustom_ != null;
    }

    public boolean hasLiveOrderInfo() {
        return this.liveOrderInfo_ != null;
    }

    public boolean hasMaterialLeft() {
        return this.materialLeft_ != null;
    }

    public boolean hasOnline() {
        return this.online_ != null;
    }

    public boolean hasOwnerExt() {
        return this.ownerExt_ != null;
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public boolean hasPlayerIcon() {
        return this.playerIcon_ != null;
    }

    public boolean hasPremiere() {
        return this.premiere_ != null;
    }

    public boolean hasPullAction() {
        return this.pullAction_ != null;
    }

    public boolean hasRabbitYear() {
        return this.rabbitYear_ != null;
    }

    public boolean hasRank() {
        return this.rank_ != null;
    }

    public boolean hasRefreshPage() {
        return this.refreshPage_ != null;
    }

    public boolean hasRejectPage() {
        return this.rejectPage_ != null;
    }

    public boolean hasReplyPreface() {
        return this.replyPreface_ != null;
    }

    public boolean hasReqUser() {
        return this.reqUser_ != null;
    }

    public boolean hasSeason() {
        return this.season_ != null;
    }

    public boolean hasSpecialCell() {
        return this.specialCell_ != null;
    }

    public boolean hasStatV2() {
        return this.statV2_ != null;
    }

    public boolean hasTab() {
        return this.tab_ != null;
    }

    public boolean hasTfPanelCustomized() {
        return this.tfPanelCustomized_ != null;
    }

    public boolean hasUgcSeason() {
        return this.ugcSeason_ != null;
    }

    public boolean hasUpAct() {
        return this.upAct_ != null;
    }

    public boolean hasUpLikeImg() {
        return this.upLikeImg_ != null;
    }

    public boolean hasUpViewMaterial() {
        return this.upViewMaterial_ != null;
    }

    public boolean hasUserGarb() {
        return this.userGarb_ != null;
    }

    public boolean hasUserRelation() {
        return this.userRelation_ != null;
    }

    public static Builder newBuilder(ViewReply viewReply) {
        return DEFAULT_INSTANCE.createBuilder(viewReply);
    }

    public static ViewReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBgm(int i, Bgm bgm) {
        bgm.getClass();
        ensureBgmIsMutable();
        this.bgm_.add(i, bgm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCms(int i, CM cm) {
        cm.getClass();
        ensureCmsIsMutable();
        this.cms_.add(i, cm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescTag(int i, Tag tag) {
        tag.getClass();
        ensureDescTagIsMutable();
        this.descTag_.add(i, tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescV2(int i, DescV2 descV2) {
        descV2.getClass();
        ensureDescV2IsMutable();
        this.descV2_.add(i, descV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(int i, ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i, viewPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayToast(int i, PlayToast playToast) {
        playToast.getClass();
        ensurePlayToastIsMutable();
        this.playToast_.add(i, playToast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelateTab(int i, RelateTab relateTab) {
        relateTab.getClass();
        ensureRelateTabIsMutable();
        this.relateTab_.add(i, relateTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelates(int i, Relate relate) {
        relate.getClass();
        ensureRelatesIsMutable();
        this.relates_.add(i, relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpecialCellNew(int i, SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.add(i, specialCell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStaff(int i, Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.add(i, staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSticker(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureStickerIsMutable();
        this.sticker_.add(i, viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTag(int i, Tag tag) {
        tag.getClass();
        ensureTagIsMutable();
        this.tag_.add(i, tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoSource(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureVideoSourceIsMutable();
        this.videoSource_.add(i, viewMaterial);
    }

    public static ViewReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewReply parseFrom(InputStream inputStream) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * clearRelates
     */
    static void access$3600(ViewReply viewReply) {
    }

    /**
     * clearPagination
     */
    static void access$20200(ViewReply viewReply) {
    }

    /**
     * removeRelates
     */
    static void access$3700(ViewReply viewReply,int index) {
    }
}
