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
public final class ActivitySeason extends GeneratedMessageLite<ActivitySeason, ActivitySeason.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_RESOURCE_FIELD_NUMBER = 16;
    public static final int ARC_EXTRA_FIELD_NUMBER = 31;
    public static final int ARC_FIELD_NUMBER = 1;
    public static final int ARGUE_BAR_FIELD_NUMBER = 41;
    public static final int ARGUE_MSG_FIELD_NUMBER = 24;
    public static final int BADGE_URL_FIELD_NUMBER = 27;
    public static final int BVID_FIELD_NUMBER = 7;
    public static final int CM_CONFIG_FIELD_NUMBER = 22;
    public static final int COIN_STYLE_FIELD_NUMBER = 38;
    public static final int CONFIG_FIELD_NUMBER = 29;
    public static final int CONTROL_CONFIG_FIELD_NUMBER = 37;
    public static final int CUSTOM_CONFIG_FIELD_NUMBER = 26;
    private static final ActivitySeason DEFAULT_INSTANCE;
    public static final int DESC_V2_FIELD_NUMBER = 28;
    public static final int DISLIKE_FIELD_NUMBER = 19;
    public static final int ECODE_FIELD_NUMBER = 25;
    public static final int ELEC_RANK_FIELD_NUMBER = 5;
    public static final int HISTORY_FIELD_NUMBER = 6;
    public static final int HONOR_FIELD_NUMBER = 8;
    public static final int LABEL_FIELD_NUMBER = 18;
    public static final int LIKE_ANIMATION_FIELD_NUMBER = 35;
    public static final int ONLINE_FIELD_NUMBER = 30;
    public static final int OPERATION_RELATE_FIELD_NUMBER = 15;
    public static final int ORDER_FIELD_NUMBER = 13;
    public static final int OWNER_EXT_FIELD_NUMBER = 3;
    public static final int PAGES_FIELD_NUMBER = 2;
    private static volatile Parser<ActivitySeason> PARSER = null;
    public static final int PLAYER_ICON_FIELD_NUMBER = 20;
    public static final int RABBIT_YEAR_FIELD_NUMBER = 39;
    public static final int RANK_FIELD_NUMBER = 12;
    public static final int REPLY_PREFACE_FIELD_NUMBER = 32;
    public static final int REQ_USER_FIELD_NUMBER = 4;
    public static final int SHARE_SUBTITLE_FIELD_NUMBER = 21;
    public static final int SHORT_LINK_FIELD_NUMBER = 17;
    public static final int SPECIAL_CELL_NEW_FIELD_NUMBER = 34;
    public static final int STAFF_FIELD_NUMBER = 9;
    public static final int STAT_V2_FIELD_NUMBER = 40;
    public static final int SUPPORT_DISLIKE_FIELD_NUMBER = 14;
    public static final int TAB_FIELD_NUMBER = 11;
    public static final int TF_PANEL_CUSTOMIZED_FIELD_NUMBER = 23;
    public static final int UGC_SEASON_FIELD_NUMBER = 10;
    public static final int UP_LIKE_IMG_FIELD_NUMBER = 33;
    public static final int USER_GARB_FIELD_NUMBER = 36;
    private ActivityResource activityResource_;
    private ArcExtra arcExtra_;
    private Arc arc_;
    private ArgueBar argueBar_;
    private CMConfig cmConfig_;
    private CoinStyle coinStyle_;
    private Config config_;
    private ControlConfig controlConfig_;
    private CustomConfig customConfig_;
    private Dislike dislike_;
    private int ecode_;
    private ElecRank elecRank_;
    private History history_;
    private Honor honor_;
    private Label label_;
    private LikeAnimation likeAnimation_;
    private Online online_;
    private OperationRelate operationRelate_;
    private Order order_;
    private OnwerExt ownerExt_;
    private PlayerIcon playerIcon_;
    private RabbitYear rabbitYear_;
    private Rank rank_;
    private ReplyStyle replyPreface_;
    private ReqUser reqUser_;
    private ArchiveStat statV2_;
    private boolean supportDislike_;
    private Tab tab_;
    private TFPanelCustomized tfPanelCustomized_;
    private UgcSeason ugcSeason_;
    private UpLikeImg upLikeImg_;
    private UserGarb userGarb_;
    private Internal.ProtobufList<ViewPage> pages_ = GeneratedMessageLite.emptyProtobufList();
    private String bvid_ = "";
    private Internal.ProtobufList<Staff> staff_ = GeneratedMessageLite.emptyProtobufList();
    private String shortLink_ = "";
    private String shareSubtitle_ = "";
    private String argueMsg_ = "";
    private String badgeUrl_ = "";
    private Internal.ProtobufList<DescV2> descV2_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<SpecialCell> specialCellNew_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ActivitySeason$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67051 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16681xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16681xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16681xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16681xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16681xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16681xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16681xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16681xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ActivitySeason, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67051 c67051) {
            this();
        }

        public Builder addAllDescV2(Iterable<? extends DescV2> iterable) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addAllDescV2(iterable);
            return this;
        }

        public Builder addAllPages(Iterable<? extends ViewPage> iterable) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addAllPages(iterable);
            return this;
        }

        public Builder addAllSpecialCellNew(Iterable<? extends SpecialCell> iterable) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addAllSpecialCellNew(iterable);
            return this;
        }

        public Builder addAllStaff(Iterable<? extends Staff> iterable) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addAllStaff(iterable);
            return this;
        }

        public Builder addDescV2(DescV2 descV2) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addDescV2(descV2);
            return this;
        }

        public Builder addPages(ViewPage viewPage) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addPages(viewPage);
            return this;
        }

        public Builder addSpecialCellNew(SpecialCell specialCell) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addSpecialCellNew(specialCell);
            return this;
        }

        public Builder addStaff(Staff staff) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addStaff(staff);
            return this;
        }

        public Builder clearActivityResource() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearActivityResource();
            return this;
        }

        public Builder clearArc() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearArc();
            return this;
        }

        public Builder clearArcExtra() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearArcExtra();
            return this;
        }

        public Builder clearArgueBar() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearArgueBar();
            return this;
        }

        public Builder clearArgueMsg() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearArgueMsg();
            return this;
        }

        public Builder clearBadgeUrl() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearBadgeUrl();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearBvid();
            return this;
        }

        public Builder clearCmConfig() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearCmConfig();
            return this;
        }

        public Builder clearCoinStyle() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearCoinStyle();
            return this;
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearConfig();
            return this;
        }

        public Builder clearControlConfig() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearControlConfig();
            return this;
        }

        public Builder clearCustomConfig() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearCustomConfig();
            return this;
        }

        public Builder clearDescV2() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearDescV2();
            return this;
        }

        public Builder clearDislike() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearDislike();
            return this;
        }

        public Builder clearEcode() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearEcode();
            return this;
        }

        public Builder clearElecRank() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearElecRank();
            return this;
        }

        public Builder clearHistory() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearHistory();
            return this;
        }

        public Builder clearHonor() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearHonor();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearLabel();
            return this;
        }

        public Builder clearLikeAnimation() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearLikeAnimation();
            return this;
        }

        public Builder clearOnline() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearOnline();
            return this;
        }

        public Builder clearOperationRelate() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearOperationRelate();
            return this;
        }

        public Builder clearOrder() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearOrder();
            return this;
        }

        public Builder clearOwnerExt() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearOwnerExt();
            return this;
        }

        public Builder clearPages() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearPages();
            return this;
        }

        public Builder clearPlayerIcon() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearPlayerIcon();
            return this;
        }

        public Builder clearRabbitYear() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearRabbitYear();
            return this;
        }

        public Builder clearRank() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearRank();
            return this;
        }

        public Builder clearReplyPreface() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearReplyPreface();
            return this;
        }

        public Builder clearReqUser() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearReqUser();
            return this;
        }

        public Builder clearShareSubtitle() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearShareSubtitle();
            return this;
        }

        public Builder clearShortLink() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearShortLink();
            return this;
        }

        public Builder clearSpecialCellNew() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearSpecialCellNew();
            return this;
        }

        public Builder clearStaff() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearStaff();
            return this;
        }

        public Builder clearStatV2() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearStatV2();
            return this;
        }

        public Builder clearSupportDislike() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearSupportDislike();
            return this;
        }

        public Builder clearTab() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearTab();
            return this;
        }

        public Builder clearTfPanelCustomized() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearTfPanelCustomized();
            return this;
        }

        public Builder clearUgcSeason() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearUgcSeason();
            return this;
        }

        public Builder clearUpLikeImg() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearUpLikeImg();
            return this;
        }

        public Builder clearUserGarb() {
            copyOnWrite();
            ((ActivitySeason) this.instance).clearUserGarb();
            return this;
        }

        public ActivityResource getActivityResource() {
            return ((ActivitySeason) this.instance).getActivityResource();
        }

        public Arc getArc() {
            return ((ActivitySeason) this.instance).getArc();
        }

        public ArcExtra getArcExtra() {
            return ((ActivitySeason) this.instance).getArcExtra();
        }

        public ArgueBar getArgueBar() {
            return ((ActivitySeason) this.instance).getArgueBar();
        }

        public String getArgueMsg() {
            return ((ActivitySeason) this.instance).getArgueMsg();
        }

        public ByteString getArgueMsgBytes() {
            return ((ActivitySeason) this.instance).getArgueMsgBytes();
        }

        public String getBadgeUrl() {
            return ((ActivitySeason) this.instance).getBadgeUrl();
        }

        public ByteString getBadgeUrlBytes() {
            return ((ActivitySeason) this.instance).getBadgeUrlBytes();
        }

        public String getBvid() {
            return ((ActivitySeason) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((ActivitySeason) this.instance).getBvidBytes();
        }

        public CMConfig getCmConfig() {
            return ((ActivitySeason) this.instance).getCmConfig();
        }

        public CoinStyle getCoinStyle() {
            return ((ActivitySeason) this.instance).getCoinStyle();
        }

        public Config getConfig() {
            return ((ActivitySeason) this.instance).getConfig();
        }

        public ControlConfig getControlConfig() {
            return ((ActivitySeason) this.instance).getControlConfig();
        }

        public CustomConfig getCustomConfig() {
            return ((ActivitySeason) this.instance).getCustomConfig();
        }

        public DescV2 getDescV2(int i) {
            return ((ActivitySeason) this.instance).getDescV2(i);
        }

        public int getDescV2Count() {
            return ((ActivitySeason) this.instance).getDescV2Count();
        }

        public List<DescV2> getDescV2List() {
            return Collections.unmodifiableList(((ActivitySeason) this.instance).getDescV2List());
        }

        public Dislike getDislike() {
            return ((ActivitySeason) this.instance).getDislike();
        }

        public ECode getEcode() {
            return ((ActivitySeason) this.instance).getEcode();
        }

        public int getEcodeValue() {
            return ((ActivitySeason) this.instance).getEcodeValue();
        }

        public ElecRank getElecRank() {
            return ((ActivitySeason) this.instance).getElecRank();
        }

        public History getHistory() {
            return ((ActivitySeason) this.instance).getHistory();
        }

        public Honor getHonor() {
            return ((ActivitySeason) this.instance).getHonor();
        }

        public Label getLabel() {
            return ((ActivitySeason) this.instance).getLabel();
        }

        public LikeAnimation getLikeAnimation() {
            return ((ActivitySeason) this.instance).getLikeAnimation();
        }

        public Online getOnline() {
            return ((ActivitySeason) this.instance).getOnline();
        }

        public OperationRelate getOperationRelate() {
            return ((ActivitySeason) this.instance).getOperationRelate();
        }

        public Order getOrder() {
            return ((ActivitySeason) this.instance).getOrder();
        }

        public OnwerExt getOwnerExt() {
            return ((ActivitySeason) this.instance).getOwnerExt();
        }

        public ViewPage getPages(int i) {
            return ((ActivitySeason) this.instance).getPages(i);
        }

        public int getPagesCount() {
            return ((ActivitySeason) this.instance).getPagesCount();
        }

        public List<ViewPage> getPagesList() {
            return Collections.unmodifiableList(((ActivitySeason) this.instance).getPagesList());
        }

        public PlayerIcon getPlayerIcon() {
            return ((ActivitySeason) this.instance).getPlayerIcon();
        }

        public RabbitYear getRabbitYear() {
            return ((ActivitySeason) this.instance).getRabbitYear();
        }

        public Rank getRank() {
            return ((ActivitySeason) this.instance).getRank();
        }

        public ReplyStyle getReplyPreface() {
            return ((ActivitySeason) this.instance).getReplyPreface();
        }

        public ReqUser getReqUser() {
            return ((ActivitySeason) this.instance).getReqUser();
        }

        public String getShareSubtitle() {
            return ((ActivitySeason) this.instance).getShareSubtitle();
        }

        public ByteString getShareSubtitleBytes() {
            return ((ActivitySeason) this.instance).getShareSubtitleBytes();
        }

        public String getShortLink() {
            return ((ActivitySeason) this.instance).getShortLink();
        }

        public ByteString getShortLinkBytes() {
            return ((ActivitySeason) this.instance).getShortLinkBytes();
        }

        public SpecialCell getSpecialCellNew(int i) {
            return ((ActivitySeason) this.instance).getSpecialCellNew(i);
        }

        public int getSpecialCellNewCount() {
            return ((ActivitySeason) this.instance).getSpecialCellNewCount();
        }

        public List<SpecialCell> getSpecialCellNewList() {
            return Collections.unmodifiableList(((ActivitySeason) this.instance).getSpecialCellNewList());
        }

        public Staff getStaff(int i) {
            return ((ActivitySeason) this.instance).getStaff(i);
        }

        public int getStaffCount() {
            return ((ActivitySeason) this.instance).getStaffCount();
        }

        public List<Staff> getStaffList() {
            return Collections.unmodifiableList(((ActivitySeason) this.instance).getStaffList());
        }

        public ArchiveStat getStatV2() {
            return ((ActivitySeason) this.instance).getStatV2();
        }

        public boolean getSupportDislike() {
            return ((ActivitySeason) this.instance).getSupportDislike();
        }

        public Tab getTab() {
            return ((ActivitySeason) this.instance).getTab();
        }

        public TFPanelCustomized getTfPanelCustomized() {
            return ((ActivitySeason) this.instance).getTfPanelCustomized();
        }

        public UgcSeason getUgcSeason() {
            return ((ActivitySeason) this.instance).getUgcSeason();
        }

        public UpLikeImg getUpLikeImg() {
            return ((ActivitySeason) this.instance).getUpLikeImg();
        }

        public UserGarb getUserGarb() {
            return ((ActivitySeason) this.instance).getUserGarb();
        }

        public boolean hasActivityResource() {
            return ((ActivitySeason) this.instance).hasActivityResource();
        }

        public boolean hasArc() {
            return ((ActivitySeason) this.instance).hasArc();
        }

        public boolean hasArcExtra() {
            return ((ActivitySeason) this.instance).hasArcExtra();
        }

        public boolean hasArgueBar() {
            return ((ActivitySeason) this.instance).hasArgueBar();
        }

        public boolean hasCmConfig() {
            return ((ActivitySeason) this.instance).hasCmConfig();
        }

        public boolean hasCoinStyle() {
            return ((ActivitySeason) this.instance).hasCoinStyle();
        }

        public boolean hasConfig() {
            return ((ActivitySeason) this.instance).hasConfig();
        }

        public boolean hasControlConfig() {
            return ((ActivitySeason) this.instance).hasControlConfig();
        }

        public boolean hasCustomConfig() {
            return ((ActivitySeason) this.instance).hasCustomConfig();
        }

        public boolean hasDislike() {
            return ((ActivitySeason) this.instance).hasDislike();
        }

        public boolean hasElecRank() {
            return ((ActivitySeason) this.instance).hasElecRank();
        }

        public boolean hasHistory() {
            return ((ActivitySeason) this.instance).hasHistory();
        }

        public boolean hasHonor() {
            return ((ActivitySeason) this.instance).hasHonor();
        }

        public boolean hasLabel() {
            return ((ActivitySeason) this.instance).hasLabel();
        }

        public boolean hasLikeAnimation() {
            return ((ActivitySeason) this.instance).hasLikeAnimation();
        }

        public boolean hasOnline() {
            return ((ActivitySeason) this.instance).hasOnline();
        }

        public boolean hasOperationRelate() {
            return ((ActivitySeason) this.instance).hasOperationRelate();
        }

        public boolean hasOrder() {
            return ((ActivitySeason) this.instance).hasOrder();
        }

        public boolean hasOwnerExt() {
            return ((ActivitySeason) this.instance).hasOwnerExt();
        }

        public boolean hasPlayerIcon() {
            return ((ActivitySeason) this.instance).hasPlayerIcon();
        }

        public boolean hasRabbitYear() {
            return ((ActivitySeason) this.instance).hasRabbitYear();
        }

        public boolean hasRank() {
            return ((ActivitySeason) this.instance).hasRank();
        }

        public boolean hasReplyPreface() {
            return ((ActivitySeason) this.instance).hasReplyPreface();
        }

        public boolean hasReqUser() {
            return ((ActivitySeason) this.instance).hasReqUser();
        }

        public boolean hasStatV2() {
            return ((ActivitySeason) this.instance).hasStatV2();
        }

        public boolean hasTab() {
            return ((ActivitySeason) this.instance).hasTab();
        }

        public boolean hasTfPanelCustomized() {
            return ((ActivitySeason) this.instance).hasTfPanelCustomized();
        }

        public boolean hasUgcSeason() {
            return ((ActivitySeason) this.instance).hasUgcSeason();
        }

        public boolean hasUpLikeImg() {
            return ((ActivitySeason) this.instance).hasUpLikeImg();
        }

        public boolean hasUserGarb() {
            return ((ActivitySeason) this.instance).hasUserGarb();
        }

        public Builder mergeActivityResource(ActivityResource activityResource) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeActivityResource(activityResource);
            return this;
        }

        public Builder mergeArc(Arc arc) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeArc(arc);
            return this;
        }

        public Builder mergeArcExtra(ArcExtra arcExtra) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeArcExtra(arcExtra);
            return this;
        }

        public Builder mergeArgueBar(ArgueBar argueBar) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeArgueBar(argueBar);
            return this;
        }

        public Builder mergeCmConfig(CMConfig cMConfig) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeCmConfig(cMConfig);
            return this;
        }

        public Builder mergeCoinStyle(CoinStyle coinStyle) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeCoinStyle(coinStyle);
            return this;
        }

        public Builder mergeConfig(Config config) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeConfig(config);
            return this;
        }

        public Builder mergeControlConfig(ControlConfig controlConfig) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeControlConfig(controlConfig);
            return this;
        }

        public Builder mergeCustomConfig(CustomConfig customConfig) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeCustomConfig(customConfig);
            return this;
        }

        public Builder mergeDislike(Dislike dislike) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeDislike(dislike);
            return this;
        }

        public Builder mergeElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeElecRank(elecRank);
            return this;
        }

        public Builder mergeHistory(History history) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeHistory(history);
            return this;
        }

        public Builder mergeHonor(Honor honor) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeHonor(honor);
            return this;
        }

        public Builder mergeLabel(Label label) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeLabel(label);
            return this;
        }

        public Builder mergeLikeAnimation(LikeAnimation likeAnimation) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeLikeAnimation(likeAnimation);
            return this;
        }

        public Builder mergeOnline(Online online) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeOnline(online);
            return this;
        }

        public Builder mergeOperationRelate(OperationRelate operationRelate) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeOperationRelate(operationRelate);
            return this;
        }

        public Builder mergeOrder(Order order) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeOrder(order);
            return this;
        }

        public Builder mergeOwnerExt(OnwerExt onwerExt) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeOwnerExt(onwerExt);
            return this;
        }

        public Builder mergePlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergePlayerIcon(playerIcon);
            return this;
        }

        public Builder mergeRabbitYear(RabbitYear rabbitYear) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeRabbitYear(rabbitYear);
            return this;
        }

        public Builder mergeRank(Rank rank) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeRank(rank);
            return this;
        }

        public Builder mergeReplyPreface(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeReplyPreface(replyStyle);
            return this;
        }

        public Builder mergeReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeReqUser(reqUser);
            return this;
        }

        public Builder mergeStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeStatV2(archiveStat);
            return this;
        }

        public Builder mergeTab(Tab tab) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeTab(tab);
            return this;
        }

        public Builder mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        public Builder mergeUgcSeason(UgcSeason ugcSeason) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeUgcSeason(ugcSeason);
            return this;
        }

        public Builder mergeUpLikeImg(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeUpLikeImg(upLikeImg);
            return this;
        }

        public Builder mergeUserGarb(UserGarb userGarb) {
            copyOnWrite();
            ((ActivitySeason) this.instance).mergeUserGarb(userGarb);
            return this;
        }

        public Builder removeDescV2(int i) {
            copyOnWrite();
            ((ActivitySeason) this.instance).removeDescV2(i);
            return this;
        }

        public Builder removePages(int i) {
            copyOnWrite();
            ((ActivitySeason) this.instance).removePages(i);
            return this;
        }

        public Builder removeSpecialCellNew(int i) {
            copyOnWrite();
            ((ActivitySeason) this.instance).removeSpecialCellNew(i);
            return this;
        }

        public Builder removeStaff(int i) {
            copyOnWrite();
            ((ActivitySeason) this.instance).removeStaff(i);
            return this;
        }

        public Builder setActivityResource(ActivityResource activityResource) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setActivityResource(activityResource);
            return this;
        }

        public Builder setArc(Arc arc) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArc(arc);
            return this;
        }

        public Builder setArcExtra(ArcExtra arcExtra) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArcExtra(arcExtra);
            return this;
        }

        public Builder setArgueBar(ArgueBar argueBar) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArgueBar(argueBar);
            return this;
        }

        public Builder setArgueMsg(String str) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArgueMsg(str);
            return this;
        }

        public Builder setArgueMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArgueMsgBytes(byteString);
            return this;
        }

        public Builder setBadgeUrl(String str) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setBadgeUrl(str);
            return this;
        }

        public Builder setBadgeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setBadgeUrlBytes(byteString);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setCmConfig(CMConfig cMConfig) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setCmConfig(cMConfig);
            return this;
        }

        public Builder setCoinStyle(CoinStyle coinStyle) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setCoinStyle(coinStyle);
            return this;
        }

        public Builder setConfig(Config config) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setConfig(config);
            return this;
        }

        public Builder setControlConfig(ControlConfig controlConfig) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setControlConfig(controlConfig);
            return this;
        }

        public Builder setCustomConfig(CustomConfig customConfig) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setCustomConfig(customConfig);
            return this;
        }

        public Builder setDescV2(int i, DescV2 descV2) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setDescV2(i, descV2);
            return this;
        }

        public Builder setDislike(Dislike dislike) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setDislike(dislike);
            return this;
        }

        public Builder setEcode(ECode eCode) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setEcode(eCode);
            return this;
        }

        public Builder setEcodeValue(int i) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setEcodeValue(i);
            return this;
        }

        public Builder setElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setElecRank(elecRank);
            return this;
        }

        public Builder setHistory(History history) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setHistory(history);
            return this;
        }

        public Builder setHonor(Honor honor) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setHonor(honor);
            return this;
        }

        public Builder setLabel(Label label) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setLabel(label);
            return this;
        }

        public Builder setLikeAnimation(LikeAnimation likeAnimation) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setLikeAnimation(likeAnimation);
            return this;
        }

        public Builder setOnline(Online online) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOnline(online);
            return this;
        }

        public Builder setOperationRelate(OperationRelate operationRelate) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOperationRelate(operationRelate);
            return this;
        }

        public Builder setOrder(Order order) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOrder(order);
            return this;
        }

        public Builder setOwnerExt(OnwerExt onwerExt) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOwnerExt(onwerExt);
            return this;
        }

        public Builder setPages(int i, ViewPage viewPage) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setPages(i, viewPage);
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setPlayerIcon(playerIcon);
            return this;
        }

        public Builder setRabbitYear(RabbitYear rabbitYear) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setRabbitYear(rabbitYear);
            return this;
        }

        public Builder setRank(Rank rank) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setRank(rank);
            return this;
        }

        public Builder setReplyPreface(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setReplyPreface(replyStyle);
            return this;
        }

        public Builder setReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setReqUser(reqUser);
            return this;
        }

        public Builder setShareSubtitle(String str) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setShareSubtitle(str);
            return this;
        }

        public Builder setShareSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setShareSubtitleBytes(byteString);
            return this;
        }

        public Builder setShortLink(String str) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setShortLink(str);
            return this;
        }

        public Builder setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public Builder setSpecialCellNew(int i, SpecialCell specialCell) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setSpecialCellNew(i, specialCell);
            return this;
        }

        public Builder setStaff(int i, Staff staff) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setStaff(i, staff);
            return this;
        }

        public Builder setStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setStatV2(archiveStat);
            return this;
        }

        public Builder setSupportDislike(boolean z) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setSupportDislike(z);
            return this;
        }

        public Builder setTab(Tab tab) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setTab(tab);
            return this;
        }

        public Builder setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        public Builder setUgcSeason(UgcSeason ugcSeason) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setUgcSeason(ugcSeason);
            return this;
        }

        public Builder setUpLikeImg(UpLikeImg upLikeImg) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setUpLikeImg(upLikeImg);
            return this;
        }

        public Builder setUserGarb(UserGarb userGarb) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setUserGarb(userGarb);
            return this;
        }

        private Builder() {
            super(ActivitySeason.DEFAULT_INSTANCE);
        }

        public Builder addDescV2(int i, DescV2 descV2) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addDescV2(i, descV2);
            return this;
        }

        public Builder addPages(int i, ViewPage viewPage) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addPages(i, viewPage);
            return this;
        }

        public Builder addSpecialCellNew(int i, SpecialCell specialCell) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addSpecialCellNew(i, specialCell);
            return this;
        }

        public Builder addStaff(int i, Staff staff) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addStaff(i, staff);
            return this;
        }

        public Builder setActivityResource(ActivityResource.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setActivityResource(builder.build());
            return this;
        }

        public Builder setArc(Arc.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArc(builder.build());
            return this;
        }

        public Builder setArcExtra(ArcExtra.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArcExtra(builder.build());
            return this;
        }

        public Builder setArgueBar(ArgueBar.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setArgueBar(builder.build());
            return this;
        }

        public Builder setCmConfig(CMConfig.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setCmConfig(builder.build());
            return this;
        }

        public Builder setCoinStyle(CoinStyle.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setCoinStyle(builder.build());
            return this;
        }

        public Builder setConfig(Config.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setConfig(builder.build());
            return this;
        }

        public Builder setControlConfig(ControlConfig.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setControlConfig(builder.build());
            return this;
        }

        public Builder setCustomConfig(CustomConfig.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setCustomConfig(builder.build());
            return this;
        }

        public Builder setDescV2(int i, DescV2.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setDescV2(i, builder.build());
            return this;
        }

        public Builder setDislike(Dislike.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setDislike(builder.build());
            return this;
        }

        public Builder setElecRank(ElecRank.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setElecRank(builder.build());
            return this;
        }

        public Builder setHistory(History.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setHistory(builder.build());
            return this;
        }

        public Builder setHonor(Honor.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setHonor(builder.build());
            return this;
        }

        public Builder setLabel(Label.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setLabel(builder.build());
            return this;
        }

        public Builder setLikeAnimation(LikeAnimation.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setLikeAnimation(builder.build());
            return this;
        }

        public Builder setOnline(Online.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOnline(builder.build());
            return this;
        }

        public Builder setOperationRelate(OperationRelate.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOperationRelate(builder.build());
            return this;
        }

        public Builder setOrder(Order.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOrder(builder.build());
            return this;
        }

        public Builder setOwnerExt(OnwerExt.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setOwnerExt(builder.build());
            return this;
        }

        public Builder setPages(int i, ViewPage.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setPages(i, builder.build());
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setPlayerIcon(builder.build());
            return this;
        }

        public Builder setRabbitYear(RabbitYear.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setRabbitYear(builder.build());
            return this;
        }

        public Builder setRank(Rank.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setRank(builder.build());
            return this;
        }

        public Builder setReplyPreface(ReplyStyle.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setReplyPreface(builder.build());
            return this;
        }

        public Builder setReqUser(ReqUser.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setReqUser(builder.build());
            return this;
        }

        public Builder setSpecialCellNew(int i, SpecialCell.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setSpecialCellNew(i, builder.build());
            return this;
        }

        public Builder setStaff(int i, Staff.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setStaff(i, builder.build());
            return this;
        }

        public Builder setStatV2(ArchiveStat.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setStatV2(builder.build());
            return this;
        }

        public Builder setTab(Tab.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setTab(builder.build());
            return this;
        }

        public Builder setTfPanelCustomized(TFPanelCustomized.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setTfPanelCustomized(builder.build());
            return this;
        }

        public Builder setUgcSeason(UgcSeason.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setUgcSeason(builder.build());
            return this;
        }

        public Builder setUpLikeImg(UpLikeImg.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setUpLikeImg(builder.build());
            return this;
        }

        public Builder setUserGarb(UserGarb.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).setUserGarb(builder.build());
            return this;
        }

        public Builder addDescV2(DescV2.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addDescV2(builder.build());
            return this;
        }

        public Builder addPages(ViewPage.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addPages(builder.build());
            return this;
        }

        public Builder addSpecialCellNew(SpecialCell.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addSpecialCellNew(builder.build());
            return this;
        }

        public Builder addStaff(Staff.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addStaff(builder.build());
            return this;
        }

        public Builder addDescV2(int i, DescV2.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addDescV2(i, builder.build());
            return this;
        }

        public Builder addPages(int i, ViewPage.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addPages(i, builder.build());
            return this;
        }

        public Builder addSpecialCellNew(int i, SpecialCell.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addSpecialCellNew(i, builder.build());
            return this;
        }

        public Builder addStaff(int i, Staff.Builder builder) {
            copyOnWrite();
            ((ActivitySeason) this.instance).addStaff(i, builder.build());
            return this;
        }
    }

    static {
        ActivitySeason activitySeason = new ActivitySeason();
        DEFAULT_INSTANCE = activitySeason;
        GeneratedMessageLite.registerDefaultInstance(ActivitySeason.class, activitySeason);
    }

    private ActivitySeason() {
    }

    public void addAllDescV2(Iterable<? extends DescV2> iterable) {
        ensureDescV2IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.descV2_);
    }

    public void addAllPages(Iterable<? extends ViewPage> iterable) {
        ensurePagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pages_);
    }

    public void addAllSpecialCellNew(Iterable<? extends SpecialCell> iterable) {
        ensureSpecialCellNewIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.specialCellNew_);
    }

    public void addAllStaff(Iterable<? extends Staff> iterable) {
        ensureStaffIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.staff_);
    }

    public void addDescV2(DescV2 descV2) {
        descV2.getClass();
        ensureDescV2IsMutable();
        this.descV2_.add(descV2);
    }

    public void addPages(ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(viewPage);
    }

    public void addSpecialCellNew(SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.add(specialCell);
    }

    public void addStaff(Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.add(staff);
    }

    public void clearActivityResource() {
        this.activityResource_ = null;
    }

    public void clearArc() {
        this.arc_ = null;
    }

    public void clearArcExtra() {
        this.arcExtra_ = null;
    }

    public void clearArgueBar() {
        this.argueBar_ = null;
    }

    public void clearArgueMsg() {
        this.argueMsg_ = getDefaultInstance().getArgueMsg();
    }

    public void clearBadgeUrl() {
        this.badgeUrl_ = getDefaultInstance().getBadgeUrl();
    }

    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    public void clearCmConfig() {
        this.cmConfig_ = null;
    }

    public void clearCoinStyle() {
        this.coinStyle_ = null;
    }

    public void clearConfig() {
        this.config_ = null;
    }

    public void clearControlConfig() {
        this.controlConfig_ = null;
    }

    public void clearCustomConfig() {
        this.customConfig_ = null;
    }

    public void clearDescV2() {
        this.descV2_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearDislike() {
        this.dislike_ = null;
    }

    public void clearEcode() {
        this.ecode_ = 0;
    }

    public void clearElecRank() {
        this.elecRank_ = null;
    }

    public void clearHistory() {
        this.history_ = null;
    }

    public void clearHonor() {
        this.honor_ = null;
    }

    public void clearLabel() {
        this.label_ = null;
    }

    public void clearLikeAnimation() {
        this.likeAnimation_ = null;
    }

    public void clearOnline() {
        this.online_ = null;
    }

    public void clearOperationRelate() {
        this.operationRelate_ = null;
    }

    public void clearOrder() {
        this.order_ = null;
    }

    public void clearOwnerExt() {
        this.ownerExt_ = null;
    }

    public void clearPages() {
        this.pages_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearPlayerIcon() {
        this.playerIcon_ = null;
    }

    public void clearRabbitYear() {
        this.rabbitYear_ = null;
    }

    public void clearRank() {
        this.rank_ = null;
    }

    public void clearReplyPreface() {
        this.replyPreface_ = null;
    }

    public void clearReqUser() {
        this.reqUser_ = null;
    }

    public void clearShareSubtitle() {
        this.shareSubtitle_ = getDefaultInstance().getShareSubtitle();
    }

    public void clearShortLink() {
        this.shortLink_ = getDefaultInstance().getShortLink();
    }

    public void clearSpecialCellNew() {
        this.specialCellNew_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearStaff() {
        this.staff_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearStatV2() {
        this.statV2_ = null;
    }

    public void clearSupportDislike() {
        this.supportDislike_ = false;
    }

    public void clearTab() {
        this.tab_ = null;
    }

    public void clearTfPanelCustomized() {
        this.tfPanelCustomized_ = null;
    }

    public void clearUgcSeason() {
        this.ugcSeason_ = null;
    }

    public void clearUpLikeImg() {
        this.upLikeImg_ = null;
    }

    public void clearUserGarb() {
        this.userGarb_ = null;
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

    public static ActivitySeason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeActivityResource(ActivityResource activityResource) {
    }

    public void mergeArc(Arc arc) {
    }

    public void mergeArcExtra(ArcExtra arcExtra) {
    }

    public void mergeArgueBar(ArgueBar argueBar) {
    }

    public void mergeCmConfig(CMConfig cMConfig) {
    }

    public void mergeCoinStyle(CoinStyle coinStyle) {
    }

    public void mergeConfig(Config config) {
    }

    public void mergeControlConfig(ControlConfig controlConfig) {
    }

    public void mergeCustomConfig(CustomConfig customConfig) {
    }

    public void mergeDislike(Dislike dislike) {
    }

    public void mergeElecRank(ElecRank elecRank) {
    }

    public void mergeHistory(History history) {
    }

    public void mergeHonor(Honor honor) {
    }

    public void mergeLabel(Label label) {
    }

    public void mergeLikeAnimation(LikeAnimation likeAnimation) {
    }

    public void mergeOnline(Online online) {
    }

    public void mergeOperationRelate(OperationRelate operationRelate) {
    }

    public void mergeOrder(Order order) {
    }

    public void mergeOwnerExt(OnwerExt onwerExt) {
    }

    public void mergePlayerIcon(PlayerIcon playerIcon) {
    }

    public void mergeRabbitYear(RabbitYear rabbitYear) {
    }

    public void mergeRank(Rank rank) {
    }

    public void mergeReplyPreface(ReplyStyle replyStyle) {
    }

    public void mergeReqUser(ReqUser reqUser) {
    }

    public void mergeStatV2(ArchiveStat archiveStat) {
    }

    public void mergeTab(Tab tab) {
    }

    public void mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
    }

    public void mergeUgcSeason(UgcSeason ugcSeason) {
    }

    public void mergeUpLikeImg(UpLikeImg upLikeImg) {
    }

    public void mergeUserGarb(UserGarb userGarb) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivitySeason parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ActivitySeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivitySeason parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ActivitySeason> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeDescV2(int i) {
        ensureDescV2IsMutable();
        this.descV2_.remove(i);
    }

    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    public void removeSpecialCellNew(int i) {
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.remove(i);
    }

    public void removeStaff(int i) {
        ensureStaffIsMutable();
        this.staff_.remove(i);
    }

    public void setActivityResource(ActivityResource activityResource) {
        activityResource.getClass();
        this.activityResource_ = activityResource;
    }

    public void setArc(Arc arc) {
        arc.getClass();
        this.arc_ = arc;
    }

    public void setArcExtra(ArcExtra arcExtra) {
        arcExtra.getClass();
        this.arcExtra_ = arcExtra;
    }

    public void setArgueBar(ArgueBar argueBar) {
        argueBar.getClass();
        this.argueBar_ = argueBar;
    }

    public void setArgueMsg(String str) {
        str.getClass();
        this.argueMsg_ = str;
    }

    public void setArgueMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.argueMsg_ = byteString.toStringUtf8();
    }

    public void setBadgeUrl(String str) {
        str.getClass();
        this.badgeUrl_ = str;
    }

    public void setBadgeUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badgeUrl_ = byteString.toStringUtf8();
    }

    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    public void setCmConfig(CMConfig cMConfig) {
        cMConfig.getClass();
        this.cmConfig_ = cMConfig;
    }

    public void setCoinStyle(CoinStyle coinStyle) {
        coinStyle.getClass();
        this.coinStyle_ = coinStyle;
    }

    public void setConfig(Config config) {
        config.getClass();
        this.config_ = config;
    }

    public void setControlConfig(ControlConfig controlConfig) {
        controlConfig.getClass();
        this.controlConfig_ = controlConfig;
    }

    public void setCustomConfig(CustomConfig customConfig) {
        customConfig.getClass();
        this.customConfig_ = customConfig;
    }

    public void setDescV2(int i, DescV2 descV2) {
        descV2.getClass();
        ensureDescV2IsMutable();
        this.descV2_.set(i, descV2);
    }

    public void setDislike(Dislike dislike) {
        dislike.getClass();
        this.dislike_ = dislike;
    }

    public void setEcode(ECode eCode) {
        this.ecode_ = eCode.getNumber();
    }

    public void setEcodeValue(int i) {
        this.ecode_ = i;
    }

    public void setElecRank(ElecRank elecRank) {
        elecRank.getClass();
        this.elecRank_ = elecRank;
    }

    public void setHistory(History history) {
        history.getClass();
        this.history_ = history;
    }

    public void setHonor(Honor honor) {
        honor.getClass();
        this.honor_ = honor;
    }

    public void setLabel(Label label) {
        label.getClass();
        this.label_ = label;
    }

    public void setLikeAnimation(LikeAnimation likeAnimation) {
        likeAnimation.getClass();
        this.likeAnimation_ = likeAnimation;
    }

    public void setOnline(Online online) {
        online.getClass();
        this.online_ = online;
    }

    public void setOperationRelate(OperationRelate operationRelate) {
        operationRelate.getClass();
        this.operationRelate_ = operationRelate;
    }

    public void setOrder(Order order) {
        order.getClass();
        this.order_ = order;
    }

    public void setOwnerExt(OnwerExt onwerExt) {
        onwerExt.getClass();
        this.ownerExt_ = onwerExt;
    }

    public void setPages(int i, ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i, viewPage);
    }

    public void setPlayerIcon(PlayerIcon playerIcon) {
        playerIcon.getClass();
        this.playerIcon_ = playerIcon;
    }

    public void setRabbitYear(RabbitYear rabbitYear) {
        rabbitYear.getClass();
        this.rabbitYear_ = rabbitYear;
    }

    public void setRank(Rank rank) {
        rank.getClass();
        this.rank_ = rank;
    }

    public void setReplyPreface(ReplyStyle replyStyle) {
        replyStyle.getClass();
        this.replyPreface_ = replyStyle;
    }

    public void setReqUser(ReqUser reqUser) {
        reqUser.getClass();
        this.reqUser_ = reqUser;
    }

    public void setShareSubtitle(String str) {
        str.getClass();
        this.shareSubtitle_ = str;
    }

    public void setShareSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareSubtitle_ = byteString.toStringUtf8();
    }

    public void setShortLink(String str) {
        str.getClass();
        this.shortLink_ = str;
    }

    public void setShortLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortLink_ = byteString.toStringUtf8();
    }

    public void setSpecialCellNew(int i, SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.set(i, specialCell);
    }

    public void setStaff(int i, Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.set(i, staff);
    }

    public void setStatV2(ArchiveStat archiveStat) {
        archiveStat.getClass();
        this.statV2_ = archiveStat;
    }

    public void setSupportDislike(boolean z) {
        this.supportDislike_ = z;
    }

    public void setTab(Tab tab) {
        tab.getClass();
        this.tab_ = tab;
    }

    public void setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
        tFPanelCustomized.getClass();
        this.tfPanelCustomized_ = tFPanelCustomized;
    }

    public void setUgcSeason(UgcSeason ugcSeason) {
        ugcSeason.getClass();
        this.ugcSeason_ = ugcSeason;
    }

    public void setUpLikeImg(UpLikeImg upLikeImg) {
        upLikeImg.getClass();
        this.upLikeImg_ = upLikeImg;
    }

    public void setUserGarb(UserGarb userGarb) {
        userGarb.getClass();
        this.userGarb_ = userGarb;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67051.f16681xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ActivitySeason();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000)\u0000\u0000\u0001))\u0000\u0004\u0000\u0001\t\u0002\u001b\u0003\t\u0004\t\u0005\t\u0006\t\u0007\u0208\b\t\t\u001b\n\t\u000b\t\f\t\r\t\u000e\u0007\u000f\t\u0010\t\u0011\u0208\u0012\t\u0013\t\u0014\t\u0015\u0208\u0016\t\u0017\t\u0018\u0208\u0019\f\u001a\t\u001b\u0208\u001c\u001b\u001d\t\u001e\t\u001f\t \t!\t\"\u001b#\t$\t%\t&\t'\t(\t)\t", new Object[]{"arc_", "pages_", ViewPage.class, "ownerExt_", "reqUser_", "elecRank_", "history_", "bvid_", "honor_", "staff_", Staff.class, "ugcSeason_", "tab_", "rank_", "order_", "supportDislike_", "operationRelate_", "activityResource_", "shortLink_", "label_", "dislike_", "playerIcon_", "shareSubtitle_", "cmConfig_", "tfPanelCustomized_", "argueMsg_", "ecode_", "customConfig_", "badgeUrl_", "descV2_", DescV2.class, "config_", "online_", "arcExtra_", "replyPreface_", "upLikeImg_", "specialCellNew_", SpecialCell.class, "likeAnimation_", "userGarb_", "controlConfig_", "coinStyle_", "rabbitYear_", "statV2_", "argueBar_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ActivitySeason> parser = PARSER;
                if (parser == null) {
                    synchronized (ActivitySeason.class) {
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

    public ActivityResource getActivityResource() {
        ActivityResource activityResource = this.activityResource_;
        return activityResource == null ? ActivityResource.getDefaultInstance() : activityResource;
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

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public CMConfig getCmConfig() {
        CMConfig cMConfig = this.cmConfig_;
        return cMConfig == null ? CMConfig.getDefaultInstance() : cMConfig;
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

    public Label getLabel() {
        Label label = this.label_;
        return label == null ? Label.getDefaultInstance() : label;
    }

    public LikeAnimation getLikeAnimation() {
        LikeAnimation likeAnimation = this.likeAnimation_;
        return likeAnimation == null ? LikeAnimation.getDefaultInstance() : likeAnimation;
    }

    public Online getOnline() {
        Online online = this.online_;
        return online == null ? Online.getDefaultInstance() : online;
    }

    public OperationRelate getOperationRelate() {
        OperationRelate operationRelate = this.operationRelate_;
        return operationRelate == null ? OperationRelate.getDefaultInstance() : operationRelate;
    }

    public Order getOrder() {
        Order order = this.order_;
        return order == null ? Order.getDefaultInstance() : order;
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

    public RabbitYear getRabbitYear() {
        RabbitYear rabbitYear = this.rabbitYear_;
        return rabbitYear == null ? RabbitYear.getDefaultInstance() : rabbitYear;
    }

    public Rank getRank() {
        Rank rank = this.rank_;
        return rank == null ? Rank.getDefaultInstance() : rank;
    }

    public ReplyStyle getReplyPreface() {
        ReplyStyle replyStyle = this.replyPreface_;
        return replyStyle == null ? ReplyStyle.getDefaultInstance() : replyStyle;
    }

    public ReqUser getReqUser() {
        ReqUser reqUser = this.reqUser_;
        return reqUser == null ? ReqUser.getDefaultInstance() : reqUser;
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

    public boolean getSupportDislike() {
        return this.supportDislike_;
    }

    public Tab getTab() {
        Tab tab = this.tab_;
        return tab == null ? Tab.getDefaultInstance() : tab;
    }

    public TFPanelCustomized getTfPanelCustomized() {
        TFPanelCustomized tFPanelCustomized = this.tfPanelCustomized_;
        return tFPanelCustomized == null ? TFPanelCustomized.getDefaultInstance() : tFPanelCustomized;
    }

    public UgcSeason getUgcSeason() {
        UgcSeason ugcSeason = this.ugcSeason_;
        return ugcSeason == null ? UgcSeason.getDefaultInstance() : ugcSeason;
    }

    public UpLikeImg getUpLikeImg() {
        UpLikeImg upLikeImg = this.upLikeImg_;
        return upLikeImg == null ? UpLikeImg.getDefaultInstance() : upLikeImg;
    }

    public UserGarb getUserGarb() {
        UserGarb userGarb = this.userGarb_;
        return userGarb == null ? UserGarb.getDefaultInstance() : userGarb;
    }

    public boolean hasActivityResource() {
        return this.activityResource_ != null;
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

    public boolean hasCmConfig() {
        return this.cmConfig_ != null;
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

    public boolean hasLabel() {
        return this.label_ != null;
    }

    public boolean hasLikeAnimation() {
        return this.likeAnimation_ != null;
    }

    public boolean hasOnline() {
        return this.online_ != null;
    }

    public boolean hasOperationRelate() {
        return this.operationRelate_ != null;
    }

    public boolean hasOrder() {
        return this.order_ != null;
    }

    public boolean hasOwnerExt() {
        return this.ownerExt_ != null;
    }

    public boolean hasPlayerIcon() {
        return this.playerIcon_ != null;
    }

    public boolean hasRabbitYear() {
        return this.rabbitYear_ != null;
    }

    public boolean hasRank() {
        return this.rank_ != null;
    }

    public boolean hasReplyPreface() {
        return this.replyPreface_ != null;
    }

    public boolean hasReqUser() {
        return this.reqUser_ != null;
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

    public boolean hasUpLikeImg() {
        return this.upLikeImg_ != null;
    }

    public boolean hasUserGarb() {
        return this.userGarb_ != null;
    }

    public static Builder newBuilder(ActivitySeason activitySeason) {
        return DEFAULT_INSTANCE.createBuilder(activitySeason);
    }

    public static ActivitySeason parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivitySeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivitySeason parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ActivitySeason parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addDescV2(int i, DescV2 descV2) {
        descV2.getClass();
        ensureDescV2IsMutable();
        this.descV2_.add(i, descV2);
    }

    public void addPages(int i, ViewPage viewPage) {
        viewPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i, viewPage);
    }

    public void addSpecialCellNew(int i, SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.add(i, specialCell);
    }

    public void addStaff(int i, Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.add(i, staff);
    }

    public static ActivitySeason parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ActivitySeason parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivitySeason parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ActivitySeason parseFrom(InputStream inputStream) throws IOException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivitySeason parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivitySeason parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ActivitySeason parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivitySeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
