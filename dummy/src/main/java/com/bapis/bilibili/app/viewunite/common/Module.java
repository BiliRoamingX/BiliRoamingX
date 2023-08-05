package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class Module extends GeneratedMessageLite<Module, Module.Builder> implements ModuleOrBuilder {
    public static final int ACTIVITY_ENTRANCE_MODULE_FIELD_NUMBER = 20;
    public static final int ACTIVITY_RESERVE_FIELD_NUMBER = 10;
    public static final int ATTENTION_RECOMMEND_FIELD_NUMBER = 26;
    public static final int AUDIO_FIELD_NUMBER = 24;
    public static final int BANNER_FIELD_NUMBER = 23;
    public static final int COMBINATION_EP_FIELD_NUMBER = 18;
    public static final int COVENANTER_FIELD_NUMBER = 27;
    private static final Module DEFAULT_INSTANCE;
    public static final int DELIVERY_DATA_FIELD_NUMBER = 13;
    public static final int FOLLOW_LAYER_FIELD_NUMBER = 14;
    public static final int HEAD_LINE_FIELD_NUMBER = 5;
    public static final int HONOR_FIELD_NUMBER = 7;
    public static final int KING_POSITION_FIELD_NUMBER = 4;
    public static final int LIKE_COMMENT_FIELD_NUMBER = 25;
    public static final int LIST_FIELD_NUMBER = 8;
    public static final int LIVE_ORDER_FIELD_NUMBER = 11;
    public static final int OGV_INTRODUCTION_FIELD_NUMBER = 2;
    public static final int OGV_LIVE_RESERVE_FIELD_NUMBER = 17;
    public static final int OGV_SEASONS_FIELD_NUMBER = 15;
    public static final int OGV_TITLE_FIELD_NUMBER = 6;
    private static volatile Parser<Module> PARSER = null;
    public static final int RELATES_FIELD_NUMBER = 22;
    public static final int SECTION_DATA_FIELD_NUMBER = 12;
    public static final int SERIAL_SEASON_FIELD_NUMBER = 21;
    public static final int SPONSOR_FIELD_NUMBER = 19;
    public static final int STAFFS_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int UGC_INTRODUCTION_FIELD_NUMBER = 3;
    public static final int UGC_SEASON_FIELD_NUMBER = 16;
    private int dataCase_ = 0;
    private Object data_;
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Module$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16998xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16998xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16998xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16998xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16998xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Module, Builder> implements ModuleOrBuilder {
        /* synthetic */ Builder(C70151 c70151) {
            this();
        }

        public Builder clearActivityEntranceModule() {
            copyOnWrite();
            ((Module) this.instance).clearActivityEntranceModule();
            return this;
        }

        public Builder clearActivityReserve() {
            copyOnWrite();
            ((Module) this.instance).clearActivityReserve();
            return this;
        }

        public Builder clearAttentionRecommend() {
            copyOnWrite();
            ((Module) this.instance).clearAttentionRecommend();
            return this;
        }

        public Builder clearAudio() {
            copyOnWrite();
            ((Module) this.instance).clearAudio();
            return this;
        }

        public Builder clearBanner() {
            copyOnWrite();
            ((Module) this.instance).clearBanner();
            return this;
        }

        public Builder clearCombinationEp() {
            copyOnWrite();
            ((Module) this.instance).clearCombinationEp();
            return this;
        }

        public Builder clearCovenanter() {
            copyOnWrite();
            ((Module) this.instance).clearCovenanter();
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((Module) this.instance).clearData();
            return this;
        }

        public Builder clearDeliveryData() {
            copyOnWrite();
            ((Module) this.instance).clearDeliveryData();
            return this;
        }

        public Builder clearFollowLayer() {
            copyOnWrite();
            ((Module) this.instance).clearFollowLayer();
            return this;
        }

        public Builder clearHeadLine() {
            copyOnWrite();
            ((Module) this.instance).clearHeadLine();
            return this;
        }

        public Builder clearHonor() {
            copyOnWrite();
            ((Module) this.instance).clearHonor();
            return this;
        }

        public Builder clearKingPosition() {
            copyOnWrite();
            ((Module) this.instance).clearKingPosition();
            return this;
        }

        public Builder clearLikeComment() {
            copyOnWrite();
            ((Module) this.instance).clearLikeComment();
            return this;
        }

        public Builder clearList() {
            copyOnWrite();
            ((Module) this.instance).clearList();
            return this;
        }

        public Builder clearLiveOrder() {
            copyOnWrite();
            ((Module) this.instance).clearLiveOrder();
            return this;
        }

        public Builder clearOgvIntroduction() {
            copyOnWrite();
            ((Module) this.instance).clearOgvIntroduction();
            return this;
        }

        public Builder clearOgvLiveReserve() {
            copyOnWrite();
            ((Module) this.instance).clearOgvLiveReserve();
            return this;
        }

        public Builder clearOgvSeasons() {
            copyOnWrite();
            ((Module) this.instance).clearOgvSeasons();
            return this;
        }

        public Builder clearOgvTitle() {
            copyOnWrite();
            ((Module) this.instance).clearOgvTitle();
            return this;
        }

        public Builder clearRelates() {
            copyOnWrite();
            ((Module) this.instance).clearRelates();
            return this;
        }

        public Builder clearSectionData() {
            copyOnWrite();
            ((Module) this.instance).clearSectionData();
            return this;
        }

        public Builder clearSerialSeason() {
            copyOnWrite();
            ((Module) this.instance).clearSerialSeason();
            return this;
        }

        public Builder clearSponsor() {
            copyOnWrite();
            ((Module) this.instance).clearSponsor();
            return this;
        }

        public Builder clearStaffs() {
            copyOnWrite();
            ((Module) this.instance).clearStaffs();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Module) this.instance).clearType();
            return this;
        }

        public Builder clearUgcIntroduction() {
            copyOnWrite();
            ((Module) this.instance).clearUgcIntroduction();
            return this;
        }

        public Builder clearUgcSeason() {
            copyOnWrite();
            ((Module) this.instance).clearUgcSeason();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public ActivityEntranceModule getActivityEntranceModule() {
            return ((Module) this.instance).getActivityEntranceModule();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public ActivityReserve getActivityReserve() {
            return ((Module) this.instance).getActivityReserve();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public AttentionRecommend getAttentionRecommend() {
            return ((Module) this.instance).getAttentionRecommend();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Audio getAudio() {
            return ((Module) this.instance).getAudio();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Banner getBanner() {
            return ((Module) this.instance).getBanner();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public CombinationEp getCombinationEp() {
            return ((Module) this.instance).getCombinationEp();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Covenanter getCovenanter() {
            return ((Module) this.instance).getCovenanter();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public DataCase getDataCase() {
            return ((Module) this.instance).getDataCase();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public DeliveryData getDeliveryData() {
            return ((Module) this.instance).getDeliveryData();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public FollowLayer getFollowLayer() {
            return ((Module) this.instance).getFollowLayer();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Headline getHeadLine() {
            return ((Module) this.instance).getHeadLine();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Honor getHonor() {
            return ((Module) this.instance).getHonor();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public KingPosition getKingPosition() {
            return ((Module) this.instance).getKingPosition();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public LikeComment getLikeComment() {
            return ((Module) this.instance).getLikeComment();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public UserList getList() {
            return ((Module) this.instance).getList();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public LiveOrder getLiveOrder() {
            return ((Module) this.instance).getLiveOrder();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public OgvIntroduction getOgvIntroduction() {
            return ((Module) this.instance).getOgvIntroduction();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public OgvLiveReserve getOgvLiveReserve() {
            return ((Module) this.instance).getOgvLiveReserve();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public OgvSeasons getOgvSeasons() {
            return ((Module) this.instance).getOgvSeasons();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public OgvTitle getOgvTitle() {
            return ((Module) this.instance).getOgvTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Relates getRelates() {
            return ((Module) this.instance).getRelates();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public SectionData getSectionData() {
            return ((Module) this.instance).getSectionData();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public SerialSeason getSerialSeason() {
            return ((Module) this.instance).getSerialSeason();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Sponsor getSponsor() {
            return ((Module) this.instance).getSponsor();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public Staffs getStaffs() {
            return ((Module) this.instance).getStaffs();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public ModuleType getType() {
            return ((Module) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public int getTypeValue() {
            return ((Module) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public UgcIntroduction getUgcIntroduction() {
            return ((Module) this.instance).getUgcIntroduction();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public UgcSeasons getUgcSeason() {
            return ((Module) this.instance).getUgcSeason();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasActivityEntranceModule() {
            return ((Module) this.instance).hasActivityEntranceModule();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasActivityReserve() {
            return ((Module) this.instance).hasActivityReserve();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasAttentionRecommend() {
            return ((Module) this.instance).hasAttentionRecommend();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasAudio() {
            return ((Module) this.instance).hasAudio();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasBanner() {
            return ((Module) this.instance).hasBanner();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasCombinationEp() {
            return ((Module) this.instance).hasCombinationEp();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasCovenanter() {
            return ((Module) this.instance).hasCovenanter();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasDeliveryData() {
            return ((Module) this.instance).hasDeliveryData();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasFollowLayer() {
            return ((Module) this.instance).hasFollowLayer();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasHeadLine() {
            return ((Module) this.instance).hasHeadLine();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasHonor() {
            return ((Module) this.instance).hasHonor();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasKingPosition() {
            return ((Module) this.instance).hasKingPosition();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasLikeComment() {
            return ((Module) this.instance).hasLikeComment();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasList() {
            return ((Module) this.instance).hasList();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasLiveOrder() {
            return ((Module) this.instance).hasLiveOrder();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasOgvIntroduction() {
            return ((Module) this.instance).hasOgvIntroduction();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasOgvLiveReserve() {
            return ((Module) this.instance).hasOgvLiveReserve();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasOgvSeasons() {
            return ((Module) this.instance).hasOgvSeasons();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasOgvTitle() {
            return ((Module) this.instance).hasOgvTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasRelates() {
            return ((Module) this.instance).hasRelates();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasSectionData() {
            return ((Module) this.instance).hasSectionData();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasSerialSeason() {
            return ((Module) this.instance).hasSerialSeason();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasSponsor() {
            return ((Module) this.instance).hasSponsor();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasStaffs() {
            return ((Module) this.instance).hasStaffs();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasUgcIntroduction() {
            return ((Module) this.instance).hasUgcIntroduction();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
        public boolean hasUgcSeason() {
            return ((Module) this.instance).hasUgcSeason();
        }

        public Builder mergeActivityEntranceModule(ActivityEntranceModule activityEntranceModule) {
            copyOnWrite();
            ((Module) this.instance).mergeActivityEntranceModule(activityEntranceModule);
            return this;
        }

        public Builder mergeActivityReserve(ActivityReserve activityReserve) {
            copyOnWrite();
            ((Module) this.instance).mergeActivityReserve(activityReserve);
            return this;
        }

        public Builder mergeAttentionRecommend(AttentionRecommend attentionRecommend) {
            copyOnWrite();
            ((Module) this.instance).mergeAttentionRecommend(attentionRecommend);
            return this;
        }

        public Builder mergeAudio(Audio audio) {
            copyOnWrite();
            ((Module) this.instance).mergeAudio(audio);
            return this;
        }

        public Builder mergeBanner(Banner banner) {
            copyOnWrite();
            ((Module) this.instance).mergeBanner(banner);
            return this;
        }

        public Builder mergeCombinationEp(CombinationEp combinationEp) {
            copyOnWrite();
            ((Module) this.instance).mergeCombinationEp(combinationEp);
            return this;
        }

        public Builder mergeCovenanter(Covenanter covenanter) {
            copyOnWrite();
            ((Module) this.instance).mergeCovenanter(covenanter);
            return this;
        }

        public Builder mergeDeliveryData(DeliveryData deliveryData) {
            copyOnWrite();
            ((Module) this.instance).mergeDeliveryData(deliveryData);
            return this;
        }

        public Builder mergeFollowLayer(FollowLayer followLayer) {
            copyOnWrite();
            ((Module) this.instance).mergeFollowLayer(followLayer);
            return this;
        }

        public Builder mergeHeadLine(Headline headline) {
            copyOnWrite();
            ((Module) this.instance).mergeHeadLine(headline);
            return this;
        }

        public Builder mergeHonor(Honor honor) {
            copyOnWrite();
            ((Module) this.instance).mergeHonor(honor);
            return this;
        }

        public Builder mergeKingPosition(KingPosition kingPosition) {
            copyOnWrite();
            ((Module) this.instance).mergeKingPosition(kingPosition);
            return this;
        }

        public Builder mergeLikeComment(LikeComment likeComment) {
            copyOnWrite();
            ((Module) this.instance).mergeLikeComment(likeComment);
            return this;
        }

        public Builder mergeList(UserList userList) {
            copyOnWrite();
            ((Module) this.instance).mergeList(userList);
            return this;
        }

        public Builder mergeLiveOrder(LiveOrder liveOrder) {
            copyOnWrite();
            ((Module) this.instance).mergeLiveOrder(liveOrder);
            return this;
        }

        public Builder mergeOgvIntroduction(OgvIntroduction ogvIntroduction) {
            copyOnWrite();
            ((Module) this.instance).mergeOgvIntroduction(ogvIntroduction);
            return this;
        }

        public Builder mergeOgvLiveReserve(OgvLiveReserve ogvLiveReserve) {
            copyOnWrite();
            ((Module) this.instance).mergeOgvLiveReserve(ogvLiveReserve);
            return this;
        }

        public Builder mergeOgvSeasons(OgvSeasons ogvSeasons) {
            copyOnWrite();
            ((Module) this.instance).mergeOgvSeasons(ogvSeasons);
            return this;
        }

        public Builder mergeOgvTitle(OgvTitle ogvTitle) {
            copyOnWrite();
            ((Module) this.instance).mergeOgvTitle(ogvTitle);
            return this;
        }

        public Builder mergeRelates(Relates relates) {
            copyOnWrite();
            ((Module) this.instance).mergeRelates(relates);
            return this;
        }

        public Builder mergeSectionData(SectionData sectionData) {
            copyOnWrite();
            ((Module) this.instance).mergeSectionData(sectionData);
            return this;
        }

        public Builder mergeSerialSeason(SerialSeason serialSeason) {
            copyOnWrite();
            ((Module) this.instance).mergeSerialSeason(serialSeason);
            return this;
        }

        public Builder mergeSponsor(Sponsor sponsor) {
            copyOnWrite();
            ((Module) this.instance).mergeSponsor(sponsor);
            return this;
        }

        public Builder mergeStaffs(Staffs staffs) {
            copyOnWrite();
            ((Module) this.instance).mergeStaffs(staffs);
            return this;
        }

        public Builder mergeUgcIntroduction(UgcIntroduction ugcIntroduction) {
            copyOnWrite();
            ((Module) this.instance).mergeUgcIntroduction(ugcIntroduction);
            return this;
        }

        public Builder mergeUgcSeason(UgcSeasons ugcSeasons) {
            copyOnWrite();
            ((Module) this.instance).mergeUgcSeason(ugcSeasons);
            return this;
        }

        public Builder setActivityEntranceModule(ActivityEntranceModule activityEntranceModule) {
            copyOnWrite();
            ((Module) this.instance).setActivityEntranceModule(activityEntranceModule);
            return this;
        }

        public Builder setActivityReserve(ActivityReserve activityReserve) {
            copyOnWrite();
            ((Module) this.instance).setActivityReserve(activityReserve);
            return this;
        }

        public Builder setAttentionRecommend(AttentionRecommend attentionRecommend) {
            copyOnWrite();
            ((Module) this.instance).setAttentionRecommend(attentionRecommend);
            return this;
        }

        public Builder setAudio(Audio audio) {
            copyOnWrite();
            ((Module) this.instance).setAudio(audio);
            return this;
        }

        public Builder setBanner(Banner banner) {
            copyOnWrite();
            ((Module) this.instance).setBanner(banner);
            return this;
        }

        public Builder setCombinationEp(CombinationEp combinationEp) {
            copyOnWrite();
            ((Module) this.instance).setCombinationEp(combinationEp);
            return this;
        }

        public Builder setCovenanter(Covenanter covenanter) {
            copyOnWrite();
            ((Module) this.instance).setCovenanter(covenanter);
            return this;
        }

        public Builder setDeliveryData(DeliveryData deliveryData) {
            copyOnWrite();
            ((Module) this.instance).setDeliveryData(deliveryData);
            return this;
        }

        public Builder setFollowLayer(FollowLayer followLayer) {
            copyOnWrite();
            ((Module) this.instance).setFollowLayer(followLayer);
            return this;
        }

        public Builder setHeadLine(Headline headline) {
            copyOnWrite();
            ((Module) this.instance).setHeadLine(headline);
            return this;
        }

        public Builder setHonor(Honor honor) {
            copyOnWrite();
            ((Module) this.instance).setHonor(honor);
            return this;
        }

        public Builder setKingPosition(KingPosition kingPosition) {
            copyOnWrite();
            ((Module) this.instance).setKingPosition(kingPosition);
            return this;
        }

        public Builder setLikeComment(LikeComment likeComment) {
            copyOnWrite();
            ((Module) this.instance).setLikeComment(likeComment);
            return this;
        }

        public Builder setList(UserList userList) {
            copyOnWrite();
            ((Module) this.instance).setList(userList);
            return this;
        }

        public Builder setLiveOrder(LiveOrder liveOrder) {
            copyOnWrite();
            ((Module) this.instance).setLiveOrder(liveOrder);
            return this;
        }

        public Builder setOgvIntroduction(OgvIntroduction ogvIntroduction) {
            copyOnWrite();
            ((Module) this.instance).setOgvIntroduction(ogvIntroduction);
            return this;
        }

        public Builder setOgvLiveReserve(OgvLiveReserve ogvLiveReserve) {
            copyOnWrite();
            ((Module) this.instance).setOgvLiveReserve(ogvLiveReserve);
            return this;
        }

        public Builder setOgvSeasons(OgvSeasons ogvSeasons) {
            copyOnWrite();
            ((Module) this.instance).setOgvSeasons(ogvSeasons);
            return this;
        }

        public Builder setOgvTitle(OgvTitle ogvTitle) {
            copyOnWrite();
            ((Module) this.instance).setOgvTitle(ogvTitle);
            return this;
        }

        public Builder setRelates(Relates relates) {
            copyOnWrite();
            ((Module) this.instance).setRelates(relates);
            return this;
        }

        public Builder setSectionData(SectionData sectionData) {
            copyOnWrite();
            ((Module) this.instance).setSectionData(sectionData);
            return this;
        }

        public Builder setSerialSeason(SerialSeason serialSeason) {
            copyOnWrite();
            ((Module) this.instance).setSerialSeason(serialSeason);
            return this;
        }

        public Builder setSponsor(Sponsor sponsor) {
            copyOnWrite();
            ((Module) this.instance).setSponsor(sponsor);
            return this;
        }

        public Builder setStaffs(Staffs staffs) {
            copyOnWrite();
            ((Module) this.instance).setStaffs(staffs);
            return this;
        }

        public Builder setType(ModuleType moduleType) {
            copyOnWrite();
            ((Module) this.instance).setType(moduleType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((Module) this.instance).setTypeValue(i);
            return this;
        }

        public Builder setUgcIntroduction(UgcIntroduction ugcIntroduction) {
            copyOnWrite();
            ((Module) this.instance).setUgcIntroduction(ugcIntroduction);
            return this;
        }

        public Builder setUgcSeason(UgcSeasons ugcSeasons) {
            copyOnWrite();
            ((Module) this.instance).setUgcSeason(ugcSeasons);
            return this;
        }

        private Builder() {
            super(Module.DEFAULT_INSTANCE);
        }

        public Builder setActivityEntranceModule(ActivityEntranceModule.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setActivityEntranceModule(builder.build());
            return this;
        }

        public Builder setActivityReserve(ActivityReserve.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setActivityReserve(builder.build());
            return this;
        }

        public Builder setAttentionRecommend(AttentionRecommend.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setAttentionRecommend(builder.build());
            return this;
        }

        public Builder setAudio(Audio.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setAudio(builder.build());
            return this;
        }

        public Builder setBanner(Banner.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setBanner(builder.build());
            return this;
        }

        public Builder setCombinationEp(CombinationEp.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setCombinationEp(builder.build());
            return this;
        }

        public Builder setCovenanter(Covenanter.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setCovenanter(builder.build());
            return this;
        }

        public Builder setDeliveryData(DeliveryData.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setDeliveryData(builder.build());
            return this;
        }

        public Builder setFollowLayer(FollowLayer.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setFollowLayer(builder.build());
            return this;
        }

        public Builder setHeadLine(Headline.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setHeadLine(builder.build());
            return this;
        }

        public Builder setHonor(Honor.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setHonor(builder.build());
            return this;
        }

        public Builder setKingPosition(KingPosition.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setKingPosition(builder.build());
            return this;
        }

        public Builder setLikeComment(LikeComment.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setLikeComment(builder.build());
            return this;
        }

        public Builder setList(UserList.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setList(builder.build());
            return this;
        }

        public Builder setLiveOrder(LiveOrder.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setLiveOrder(builder.build());
            return this;
        }

        public Builder setOgvIntroduction(OgvIntroduction.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setOgvIntroduction(builder.build());
            return this;
        }

        public Builder setOgvLiveReserve(OgvLiveReserve.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setOgvLiveReserve(builder.build());
            return this;
        }

        public Builder setOgvSeasons(OgvSeasons.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setOgvSeasons(builder.build());
            return this;
        }

        public Builder setOgvTitle(OgvTitle.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setOgvTitle(builder.build());
            return this;
        }

        public Builder setRelates(Relates.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setRelates(builder.build());
            return this;
        }

        public Builder setSectionData(SectionData.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setSectionData(builder.build());
            return this;
        }

        public Builder setSerialSeason(SerialSeason.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setSerialSeason(builder.build());
            return this;
        }

        public Builder setSponsor(Sponsor.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setSponsor(builder.build());
            return this;
        }

        public Builder setStaffs(Staffs.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setStaffs(builder.build());
            return this;
        }

        public Builder setUgcIntroduction(UgcIntroduction.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setUgcIntroduction(builder.build());
            return this;
        }

        public Builder setUgcSeason(UgcSeasons.Builder builder) {
            copyOnWrite();
            ((Module) this.instance).setUgcSeason(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum DataCase {
        OGV_INTRODUCTION(2),
        UGC_INTRODUCTION(3),
        KING_POSITION(4),
        HEAD_LINE(5),
        OGV_TITLE(6),
        HONOR(7),
        LIST(8),
        STAFFS(9),
        ACTIVITY_RESERVE(10),
        LIVE_ORDER(11),
        SECTION_DATA(12),
        DELIVERY_DATA(13),
        FOLLOW_LAYER(14),
        OGV_SEASONS(15),
        UGC_SEASON(16),
        OGV_LIVE_RESERVE(17),
        COMBINATION_EP(18),
        SPONSOR(19),
        ACTIVITY_ENTRANCE_MODULE(20),
        SERIAL_SEASON(21),
        RELATES(22),
        BANNER(23),
        AUDIO(24),
        LIKE_COMMENT(25),
        ATTENTION_RECOMMEND(26),
        COVENANTER(27),
        DATA_NOT_SET(0);

        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i != 0) {
                switch (i) {
                    case 2:
                        return OGV_INTRODUCTION;
                    case 3:
                        return UGC_INTRODUCTION;
                    case 4:
                        return KING_POSITION;
                    case 5:
                        return HEAD_LINE;
                    case 6:
                        return OGV_TITLE;
                    case 7:
                        return HONOR;
                    case 8:
                        return LIST;
                    case 9:
                        return STAFFS;
                    case 10:
                        return ACTIVITY_RESERVE;
                    case 11:
                        return LIVE_ORDER;
                    case 12:
                        return SECTION_DATA;
                    case 13:
                        return DELIVERY_DATA;
                    case 14:
                        return FOLLOW_LAYER;
                    case 15:
                        return OGV_SEASONS;
                    case 16:
                        return UGC_SEASON;
                    case 17:
                        return OGV_LIVE_RESERVE;
                    case 18:
                        return COMBINATION_EP;
                    case 19:
                        return SPONSOR;
                    case 20:
                        return ACTIVITY_ENTRANCE_MODULE;
                    case 21:
                        return SERIAL_SEASON;
                    case 22:
                        return RELATES;
                    case 23:
                        return BANNER;
                    case 24:
                        return AUDIO;
                    case 25:
                        return LIKE_COMMENT;
                    case 26:
                        return ATTENTION_RECOMMEND;
                    case 27:
                        return COVENANTER;
                    default:
                        return null;
                }
            }
            return DATA_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Module module = new Module();
        DEFAULT_INSTANCE = module;
        GeneratedMessageLite.registerDefaultInstance(Module.class, module);
    }

    private Module() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityEntranceModule() {
        if (this.dataCase_ == 20) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityReserve() {
        if (this.dataCase_ == 10) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttentionRecommend() {
        if (this.dataCase_ == 26) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        if (this.dataCase_ == 24) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBanner() {
        if (this.dataCase_ == 23) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCombinationEp() {
        if (this.dataCase_ == 18) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovenanter() {
        if (this.dataCase_ == 27) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeliveryData() {
        if (this.dataCase_ == 13) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowLayer() {
        if (this.dataCase_ == 14) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadLine() {
        if (this.dataCase_ == 5) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHonor() {
        if (this.dataCase_ == 7) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKingPosition() {
        if (this.dataCase_ == 4) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeComment() {
        if (this.dataCase_ == 25) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearList() {
        if (this.dataCase_ == 8) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiveOrder() {
        if (this.dataCase_ == 11) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgvIntroduction() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgvLiveReserve() {
        if (this.dataCase_ == 17) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgvSeasons() {
        if (this.dataCase_ == 15) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgvTitle() {
        if (this.dataCase_ == 6) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelates() {
        if (this.dataCase_ == 22) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSectionData() {
        if (this.dataCase_ == 12) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSerialSeason() {
        if (this.dataCase_ == 21) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSponsor() {
        if (this.dataCase_ == 19) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaffs() {
        if (this.dataCase_ == 9) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcIntroduction() {
        if (this.dataCase_ == 3) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcSeason() {
        if (this.dataCase_ == 16) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    public static Module getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivityEntranceModule(ActivityEntranceModule activityEntranceModule) {
        activityEntranceModule.getClass();
        if (this.dataCase_ == 20 && this.data_ != ActivityEntranceModule.getDefaultInstance()) {
            this.data_ = ActivityEntranceModule.newBuilder((ActivityEntranceModule) this.data_).mergeFrom((ActivityEntranceModule) activityEntranceModule).buildPartial();
        } else {
            this.data_ = activityEntranceModule;
        }
        this.dataCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivityReserve(ActivityReserve activityReserve) {
        activityReserve.getClass();
        if (this.dataCase_ == 10 && this.data_ != ActivityReserve.getDefaultInstance()) {
            this.data_ = ActivityReserve.newBuilder((ActivityReserve) this.data_).mergeFrom((ActivityReserve) activityReserve).buildPartial();
        } else {
            this.data_ = activityReserve;
        }
        this.dataCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAttentionRecommend(AttentionRecommend attentionRecommend) {
        attentionRecommend.getClass();
        if (this.dataCase_ == 26 && this.data_ != AttentionRecommend.getDefaultInstance()) {
            this.data_ = AttentionRecommend.newBuilder((AttentionRecommend) this.data_).mergeFrom((AttentionRecommend) attentionRecommend).buildPartial();
        } else {
            this.data_ = attentionRecommend;
        }
        this.dataCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(Audio audio) {
        audio.getClass();
        if (this.dataCase_ == 24 && this.data_ != Audio.getDefaultInstance()) {
            this.data_ = Audio.newBuilder((Audio) this.data_).mergeFrom((Audio) audio).buildPartial();
        } else {
            this.data_ = audio;
        }
        this.dataCase_ = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBanner(Banner banner) {
        banner.getClass();
        if (this.dataCase_ == 23 && this.data_ != Banner.getDefaultInstance()) {
            this.data_ = Banner.newBuilder((Banner) this.data_).mergeFrom((Banner) banner).buildPartial();
        } else {
            this.data_ = banner;
        }
        this.dataCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCombinationEp(CombinationEp combinationEp) {
        combinationEp.getClass();
        if (this.dataCase_ == 18 && this.data_ != CombinationEp.getDefaultInstance()) {
            this.data_ = CombinationEp.newBuilder((CombinationEp) this.data_).mergeFrom((CombinationEp) combinationEp).buildPartial();
        } else {
            this.data_ = combinationEp;
        }
        this.dataCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovenanter(Covenanter covenanter) {
        covenanter.getClass();
        if (this.dataCase_ == 27 && this.data_ != Covenanter.getDefaultInstance()) {
            this.data_ = Covenanter.newBuilder((Covenanter) this.data_).mergeFrom((Covenanter) covenanter).buildPartial();
        } else {
            this.data_ = covenanter;
        }
        this.dataCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeliveryData(DeliveryData deliveryData) {
        deliveryData.getClass();
        if (this.dataCase_ == 13 && this.data_ != DeliveryData.getDefaultInstance()) {
            this.data_ = DeliveryData.newBuilder((DeliveryData) this.data_).mergeFrom((DeliveryData) deliveryData).buildPartial();
        } else {
            this.data_ = deliveryData;
        }
        this.dataCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFollowLayer(FollowLayer followLayer) {
        followLayer.getClass();
        if (this.dataCase_ == 14 && this.data_ != FollowLayer.getDefaultInstance()) {
            this.data_ = FollowLayer.newBuilder((FollowLayer) this.data_).mergeFrom((FollowLayer) followLayer).buildPartial();
        } else {
            this.data_ = followLayer;
        }
        this.dataCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeadLine(Headline headline) {
        headline.getClass();
        if (this.dataCase_ == 5 && this.data_ != Headline.getDefaultInstance()) {
            this.data_ = Headline.newBuilder((Headline) this.data_).mergeFrom((Headline) headline).buildPartial();
        } else {
            this.data_ = headline;
        }
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHonor(Honor honor) {
        honor.getClass();
        if (this.dataCase_ == 7 && this.data_ != Honor.getDefaultInstance()) {
            this.data_ = Honor.newBuilder((Honor) this.data_).mergeFrom((Honor) honor).buildPartial();
        } else {
            this.data_ = honor;
        }
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKingPosition(KingPosition kingPosition) {
        kingPosition.getClass();
        if (this.dataCase_ == 4 && this.data_ != KingPosition.getDefaultInstance()) {
            this.data_ = KingPosition.newBuilder((KingPosition) this.data_).mergeFrom((KingPosition) kingPosition).buildPartial();
        } else {
            this.data_ = kingPosition;
        }
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikeComment(LikeComment likeComment) {
        likeComment.getClass();
        if (this.dataCase_ == 25 && this.data_ != LikeComment.getDefaultInstance()) {
            this.data_ = LikeComment.newBuilder((LikeComment) this.data_).mergeFrom((LikeComment) likeComment).buildPartial();
        } else {
            this.data_ = likeComment;
        }
        this.dataCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeList(UserList userList) {
        userList.getClass();
        if (this.dataCase_ == 8 && this.data_ != UserList.getDefaultInstance()) {
            this.data_ = UserList.newBuilder((UserList) this.data_).mergeFrom((UserList) userList).buildPartial();
        } else {
            this.data_ = userList;
        }
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLiveOrder(LiveOrder liveOrder) {
        liveOrder.getClass();
        if (this.dataCase_ == 11 && this.data_ != LiveOrder.getDefaultInstance()) {
            this.data_ = LiveOrder.newBuilder((LiveOrder) this.data_).mergeFrom((LiveOrder) liveOrder).buildPartial();
        } else {
            this.data_ = liveOrder;
        }
        this.dataCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOgvIntroduction(OgvIntroduction ogvIntroduction) {
        ogvIntroduction.getClass();
        if (this.dataCase_ == 2 && this.data_ != OgvIntroduction.getDefaultInstance()) {
            this.data_ = OgvIntroduction.newBuilder((OgvIntroduction) this.data_).mergeFrom((OgvIntroduction) ogvIntroduction).buildPartial();
        } else {
            this.data_ = ogvIntroduction;
        }
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOgvLiveReserve(OgvLiveReserve ogvLiveReserve) {
        ogvLiveReserve.getClass();
        if (this.dataCase_ == 17 && this.data_ != OgvLiveReserve.getDefaultInstance()) {
            this.data_ = OgvLiveReserve.newBuilder((OgvLiveReserve) this.data_).mergeFrom((OgvLiveReserve) ogvLiveReserve).buildPartial();
        } else {
            this.data_ = ogvLiveReserve;
        }
        this.dataCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOgvSeasons(OgvSeasons ogvSeasons) {
        ogvSeasons.getClass();
        if (this.dataCase_ == 15 && this.data_ != OgvSeasons.getDefaultInstance()) {
            this.data_ = OgvSeasons.newBuilder((OgvSeasons) this.data_).mergeFrom((OgvSeasons) ogvSeasons).buildPartial();
        } else {
            this.data_ = ogvSeasons;
        }
        this.dataCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOgvTitle(OgvTitle ogvTitle) {
        ogvTitle.getClass();
        if (this.dataCase_ == 6 && this.data_ != OgvTitle.getDefaultInstance()) {
            this.data_ = OgvTitle.newBuilder((OgvTitle) this.data_).mergeFrom((OgvTitle) ogvTitle).buildPartial();
        } else {
            this.data_ = ogvTitle;
        }
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRelates(Relates relates) {
        relates.getClass();
        if (this.dataCase_ == 22 && this.data_ != Relates.getDefaultInstance()) {
            this.data_ = Relates.newBuilder((Relates) this.data_).mergeFrom((Relates) relates).buildPartial();
        } else {
            this.data_ = relates;
        }
        this.dataCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSectionData(SectionData sectionData) {
        sectionData.getClass();
        if (this.dataCase_ == 12 && this.data_ != SectionData.getDefaultInstance()) {
            this.data_ = SectionData.newBuilder((SectionData) this.data_).mergeFrom((SectionData) sectionData).buildPartial();
        } else {
            this.data_ = sectionData;
        }
        this.dataCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSerialSeason(SerialSeason serialSeason) {
        serialSeason.getClass();
        if (this.dataCase_ == 21 && this.data_ != SerialSeason.getDefaultInstance()) {
            this.data_ = SerialSeason.newBuilder((SerialSeason) this.data_).mergeFrom((SerialSeason) serialSeason).buildPartial();
        } else {
            this.data_ = serialSeason;
        }
        this.dataCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSponsor(Sponsor sponsor) {
        sponsor.getClass();
        if (this.dataCase_ == 19 && this.data_ != Sponsor.getDefaultInstance()) {
            this.data_ = Sponsor.newBuilder((Sponsor) this.data_).mergeFrom((Sponsor) sponsor).buildPartial();
        } else {
            this.data_ = sponsor;
        }
        this.dataCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStaffs(Staffs staffs) {
        staffs.getClass();
        if (this.dataCase_ == 9 && this.data_ != Staffs.getDefaultInstance()) {
            this.data_ = Staffs.newBuilder((Staffs) this.data_).mergeFrom((Staffs) staffs).buildPartial();
        } else {
            this.data_ = staffs;
        }
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcIntroduction(UgcIntroduction ugcIntroduction) {
        ugcIntroduction.getClass();
        if (this.dataCase_ == 3 && this.data_ != UgcIntroduction.getDefaultInstance()) {
            this.data_ = UgcIntroduction.newBuilder((UgcIntroduction) this.data_).mergeFrom((UgcIntroduction) ugcIntroduction).buildPartial();
        } else {
            this.data_ = ugcIntroduction;
        }
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcSeason(UgcSeasons ugcSeasons) {
        ugcSeasons.getClass();
        if (this.dataCase_ == 16 && this.data_ != UgcSeasons.getDefaultInstance()) {
            this.data_ = UgcSeasons.newBuilder((UgcSeasons) this.data_).mergeFrom((UgcSeasons) ugcSeasons).buildPartial();
        } else {
            this.data_ = ugcSeasons;
        }
        this.dataCase_ = 16;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Module parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Module) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Module parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Module> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityEntranceModule(ActivityEntranceModule activityEntranceModule) {
        activityEntranceModule.getClass();
        this.data_ = activityEntranceModule;
        this.dataCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityReserve(ActivityReserve activityReserve) {
        activityReserve.getClass();
        this.data_ = activityReserve;
        this.dataCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttentionRecommend(AttentionRecommend attentionRecommend) {
        attentionRecommend.getClass();
        this.data_ = attentionRecommend;
        this.dataCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(Audio audio) {
        audio.getClass();
        this.data_ = audio;
        this.dataCase_ = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBanner(Banner banner) {
        banner.getClass();
        this.data_ = banner;
        this.dataCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCombinationEp(CombinationEp combinationEp) {
        combinationEp.getClass();
        this.data_ = combinationEp;
        this.dataCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovenanter(Covenanter covenanter) {
        covenanter.getClass();
        this.data_ = covenanter;
        this.dataCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeliveryData(DeliveryData deliveryData) {
        deliveryData.getClass();
        this.data_ = deliveryData;
        this.dataCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowLayer(FollowLayer followLayer) {
        followLayer.getClass();
        this.data_ = followLayer;
        this.dataCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadLine(Headline headline) {
        headline.getClass();
        this.data_ = headline;
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHonor(Honor honor) {
        honor.getClass();
        this.data_ = honor;
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKingPosition(KingPosition kingPosition) {
        kingPosition.getClass();
        this.data_ = kingPosition;
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeComment(LikeComment likeComment) {
        likeComment.getClass();
        this.data_ = likeComment;
        this.dataCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setList(UserList userList) {
        userList.getClass();
        this.data_ = userList;
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiveOrder(LiveOrder liveOrder) {
        liveOrder.getClass();
        this.data_ = liveOrder;
        this.dataCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgvIntroduction(OgvIntroduction ogvIntroduction) {
        ogvIntroduction.getClass();
        this.data_ = ogvIntroduction;
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgvLiveReserve(OgvLiveReserve ogvLiveReserve) {
        ogvLiveReserve.getClass();
        this.data_ = ogvLiveReserve;
        this.dataCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgvSeasons(OgvSeasons ogvSeasons) {
        ogvSeasons.getClass();
        this.data_ = ogvSeasons;
        this.dataCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgvTitle(OgvTitle ogvTitle) {
        ogvTitle.getClass();
        this.data_ = ogvTitle;
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelates(Relates relates) {
        relates.getClass();
        this.data_ = relates;
        this.dataCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSectionData(SectionData sectionData) {
        sectionData.getClass();
        this.data_ = sectionData;
        this.dataCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSerialSeason(SerialSeason serialSeason) {
        serialSeason.getClass();
        this.data_ = serialSeason;
        this.dataCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSponsor(Sponsor sponsor) {
        sponsor.getClass();
        this.data_ = sponsor;
        this.dataCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaffs(Staffs staffs) {
        staffs.getClass();
        this.data_ = staffs;
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ModuleType moduleType) {
        this.type_ = moduleType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcIntroduction(UgcIntroduction ugcIntroduction) {
        ugcIntroduction.getClass();
        this.data_ = ugcIntroduction;
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcSeason(UgcSeasons ugcSeasons) {
        ugcSeasons.getClass();
        this.data_ = ugcSeasons;
        this.dataCase_ = 16;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70151.f16998xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Module();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0001\u0000\u0001\u001b\u001b\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000", new Object[]{"data_", "dataCase_", "type_", OgvIntroduction.class, UgcIntroduction.class, KingPosition.class, Headline.class, OgvTitle.class, Honor.class, UserList.class, Staffs.class, ActivityReserve.class, LiveOrder.class, SectionData.class, DeliveryData.class, FollowLayer.class, OgvSeasons.class, UgcSeasons.class, OgvLiveReserve.class, CombinationEp.class, Sponsor.class, ActivityEntranceModule.class, SerialSeason.class, Relates.class, Banner.class, Audio.class, LikeComment.class, AttentionRecommend.class, Covenanter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Module> parser = PARSER;
                if (parser == null) {
                    synchronized (Module.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public ActivityEntranceModule getActivityEntranceModule() {
        if (this.dataCase_ == 20) {
            return (ActivityEntranceModule) this.data_;
        }
        return ActivityEntranceModule.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public ActivityReserve getActivityReserve() {
        if (this.dataCase_ == 10) {
            return (ActivityReserve) this.data_;
        }
        return ActivityReserve.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public AttentionRecommend getAttentionRecommend() {
        if (this.dataCase_ == 26) {
            return (AttentionRecommend) this.data_;
        }
        return AttentionRecommend.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Audio getAudio() {
        if (this.dataCase_ == 24) {
            return (Audio) this.data_;
        }
        return Audio.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Banner getBanner() {
        if (this.dataCase_ == 23) {
            return (Banner) this.data_;
        }
        return Banner.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public CombinationEp getCombinationEp() {
        if (this.dataCase_ == 18) {
            return (CombinationEp) this.data_;
        }
        return CombinationEp.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Covenanter getCovenanter() {
        if (this.dataCase_ == 27) {
            return (Covenanter) this.data_;
        }
        return Covenanter.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public DeliveryData getDeliveryData() {
        if (this.dataCase_ == 13) {
            return (DeliveryData) this.data_;
        }
        return DeliveryData.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public FollowLayer getFollowLayer() {
        if (this.dataCase_ == 14) {
            return (FollowLayer) this.data_;
        }
        return FollowLayer.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Headline getHeadLine() {
        if (this.dataCase_ == 5) {
            return (Headline) this.data_;
        }
        return Headline.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Honor getHonor() {
        if (this.dataCase_ == 7) {
            return (Honor) this.data_;
        }
        return Honor.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public KingPosition getKingPosition() {
        if (this.dataCase_ == 4) {
            return (KingPosition) this.data_;
        }
        return KingPosition.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public LikeComment getLikeComment() {
        if (this.dataCase_ == 25) {
            return (LikeComment) this.data_;
        }
        return LikeComment.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public UserList getList() {
        if (this.dataCase_ == 8) {
            return (UserList) this.data_;
        }
        return UserList.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public LiveOrder getLiveOrder() {
        if (this.dataCase_ == 11) {
            return (LiveOrder) this.data_;
        }
        return LiveOrder.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public OgvIntroduction getOgvIntroduction() {
        if (this.dataCase_ == 2) {
            return (OgvIntroduction) this.data_;
        }
        return OgvIntroduction.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public OgvLiveReserve getOgvLiveReserve() {
        if (this.dataCase_ == 17) {
            return (OgvLiveReserve) this.data_;
        }
        return OgvLiveReserve.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public OgvSeasons getOgvSeasons() {
        if (this.dataCase_ == 15) {
            return (OgvSeasons) this.data_;
        }
        return OgvSeasons.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public OgvTitle getOgvTitle() {
        if (this.dataCase_ == 6) {
            return (OgvTitle) this.data_;
        }
        return OgvTitle.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Relates getRelates() {
        if (this.dataCase_ == 22) {
            return (Relates) this.data_;
        }
        return Relates.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public SectionData getSectionData() {
        if (this.dataCase_ == 12) {
            return (SectionData) this.data_;
        }
        return SectionData.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public SerialSeason getSerialSeason() {
        if (this.dataCase_ == 21) {
            return (SerialSeason) this.data_;
        }
        return SerialSeason.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Sponsor getSponsor() {
        if (this.dataCase_ == 19) {
            return (Sponsor) this.data_;
        }
        return Sponsor.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public Staffs getStaffs() {
        if (this.dataCase_ == 9) {
            return (Staffs) this.data_;
        }
        return Staffs.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public ModuleType getType() {
        ModuleType forNumber = ModuleType.forNumber(this.type_);
        return forNumber == null ? ModuleType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public UgcIntroduction getUgcIntroduction() {
        if (this.dataCase_ == 3) {
            return (UgcIntroduction) this.data_;
        }
        return UgcIntroduction.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public UgcSeasons getUgcSeason() {
        if (this.dataCase_ == 16) {
            return (UgcSeasons) this.data_;
        }
        return UgcSeasons.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasActivityEntranceModule() {
        return this.dataCase_ == 20;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasActivityReserve() {
        return this.dataCase_ == 10;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasAttentionRecommend() {
        return this.dataCase_ == 26;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasAudio() {
        return this.dataCase_ == 24;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasBanner() {
        return this.dataCase_ == 23;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasCombinationEp() {
        return this.dataCase_ == 18;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasCovenanter() {
        return this.dataCase_ == 27;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasDeliveryData() {
        return this.dataCase_ == 13;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasFollowLayer() {
        return this.dataCase_ == 14;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasHeadLine() {
        return this.dataCase_ == 5;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasHonor() {
        return this.dataCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasKingPosition() {
        return this.dataCase_ == 4;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasLikeComment() {
        return this.dataCase_ == 25;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasList() {
        return this.dataCase_ == 8;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasLiveOrder() {
        return this.dataCase_ == 11;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasOgvIntroduction() {
        return this.dataCase_ == 2;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasOgvLiveReserve() {
        return this.dataCase_ == 17;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasOgvSeasons() {
        return this.dataCase_ == 15;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasOgvTitle() {
        return this.dataCase_ == 6;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasRelates() {
        return this.dataCase_ == 22;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasSectionData() {
        return this.dataCase_ == 12;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasSerialSeason() {
        return this.dataCase_ == 21;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasSponsor() {
        return this.dataCase_ == 19;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasStaffs() {
        return this.dataCase_ == 9;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasUgcIntroduction() {
        return this.dataCase_ == 3;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder
    public boolean hasUgcSeason() {
        return this.dataCase_ == 16;
    }

    public static Builder newBuilder(Module module) {
        return DEFAULT_INSTANCE.createBuilder(module);
    }

    public static Module parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Module) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Module parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Module parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Module parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Module parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Module parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Module parseFrom(InputStream inputStream) throws IOException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Module parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Module parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Module parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * clearLikeComment
     */
    static void access$7600(Module module) {
    }

    /**
     * clearActivityEntranceModule
     */
    static void access$6100(Module module) {
    }

    /**
     * setSectionData
     */
    static void access$3500(Module module, SectionData sectionData) {
    }
}
