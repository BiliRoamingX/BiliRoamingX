package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.bapis.bilibili.app.viewunite.common.NewEp;
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
/* loaded from: classes17.dex */
public final class OgvData extends GeneratedMessageLite<OgvData, OgvData.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_FLOAT_LAYER_FIELD_NUMBER = 18;
    public static final int AID_FIELD_NUMBER = 7;
    public static final int COVER_FIELD_NUMBER = 20;
    private static final OgvData DEFAULT_INSTANCE;
    public static final int EARPHONE_CONF_FIELD_NUMBER = 19;
    public static final int HAS_CAN_PLAY_EP_FIELD_NUMBER = 27;
    public static final int HORIZONTAL_COVER1610_FIELD_NUMBER = 26;
    public static final int HORIZONTAL_COVER169_FIELD_NUMBER = 25;
    public static final int MEDIA_ID_FIELD_NUMBER = 1;
    public static final int MODE_FIELD_NUMBER = 9;
    public static final int MULTI_VIEW_INFO_FIELD_NUMBER = 12;
    public static final int NEW_EP_FIELD_NUMBER = 15;
    public static final int OGV_SWITCH_FIELD_NUMBER = 13;
    private static volatile Parser<OgvData> PARSER = null;
    public static final int PLAY_STRATEGY_FIELD_NUMBER = 11;
    public static final int PUBLISH_FIELD_NUMBER = 10;
    public static final int RESERVE_FIELD_NUMBER = 16;
    public static final int RIGHTS_FIELD_NUMBER = 5;
    public static final int SEASON_ID_FIELD_NUMBER = 2;
    public static final int SEASON_TYPE_FIELD_NUMBER = 3;
    public static final int SHARE_URL_FIELD_NUMBER = 22;
    public static final int SHORT_LINK_FIELD_NUMBER = 23;
    public static final int SHOW_SEASON_TYPE_FIELD_NUMBER = 4;
    public static final int SQUARE_COVER_FIELD_NUMBER = 21;
    public static final int STATUS_FIELD_NUMBER = 17;
    public static final int STAT_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 24;
    public static final int TOTAL_EP_FIELD_NUMBER = 14;
    public static final int USER_STATUS_FIELD_NUMBER = 6;
    private long aid_;
    private EarphoneConf earphoneConf_;
    private int hasCanPlayEp_;
    private int mediaId_;
    private int mode_;
    private MultiViewInfo multiViewInfo_;
    private NewEp newEp_;
    private OgvSwitch ogvSwitch_;
    private PlayStrategy playStrategy_;
    private Publish publish_;
    private Reserve reserve_;
    private Rights rights_;
    private long seasonId_;
    private int seasonType_;
    private int showSeasonType_;
    private Stat stat_;
    private int status_;
    private int totalEp_;
    private UserStatus userStatus_;
    private Internal.ProtobufList<PlayFloatLayerActivity> activityFloatLayer_ = GeneratedMessageLite.emptyProtobufList();
    private String cover_ = "";
    private String squareCover_ = "";
    private String shareUrl_ = "";
    private String shortLink_ = "";
    private String title_ = "";
    private String horizontalCover169_ = "";
    private String horizontalCover1610_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.OgvData$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17067xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17067xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OgvData, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70901 c70901) {
            this();
        }

        public Builder addActivityFloatLayer(PlayFloatLayerActivity playFloatLayerActivity) {
            copyOnWrite();
            ((OgvData) this.instance).addActivityFloatLayer(playFloatLayerActivity);
            return this;
        }

        public Builder addAllActivityFloatLayer(Iterable<? extends PlayFloatLayerActivity> iterable) {
            copyOnWrite();
            ((OgvData) this.instance).addAllActivityFloatLayer(iterable);
            return this;
        }

        public Builder clearActivityFloatLayer() {
            copyOnWrite();
            ((OgvData) this.instance).clearActivityFloatLayer();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((OgvData) this.instance).clearAid();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((OgvData) this.instance).clearCover();
            return this;
        }

        public Builder clearEarphoneConf() {
            copyOnWrite();
            ((OgvData) this.instance).clearEarphoneConf();
            return this;
        }

        public Builder clearHasCanPlayEp() {
            copyOnWrite();
            ((OgvData) this.instance).clearHasCanPlayEp();
            return this;
        }

        public Builder clearHorizontalCover1610() {
            copyOnWrite();
            ((OgvData) this.instance).clearHorizontalCover1610();
            return this;
        }

        public Builder clearHorizontalCover169() {
            copyOnWrite();
            ((OgvData) this.instance).clearHorizontalCover169();
            return this;
        }

        public Builder clearMediaId() {
            copyOnWrite();
            ((OgvData) this.instance).clearMediaId();
            return this;
        }

        public Builder clearMode() {
            copyOnWrite();
            ((OgvData) this.instance).clearMode();
            return this;
        }

        public Builder clearMultiViewInfo() {
            copyOnWrite();
            ((OgvData) this.instance).clearMultiViewInfo();
            return this;
        }

        public Builder clearNewEp() {
            copyOnWrite();
            ((OgvData) this.instance).clearNewEp();
            return this;
        }

        public Builder clearOgvSwitch() {
            copyOnWrite();
            ((OgvData) this.instance).clearOgvSwitch();
            return this;
        }

        public Builder clearPlayStrategy() {
            copyOnWrite();
            ((OgvData) this.instance).clearPlayStrategy();
            return this;
        }

        public Builder clearPublish() {
            copyOnWrite();
            ((OgvData) this.instance).clearPublish();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((OgvData) this.instance).clearReserve();
            return this;
        }

        public Builder clearRights() {
            copyOnWrite();
            ((OgvData) this.instance).clearRights();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((OgvData) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSeasonType() {
            copyOnWrite();
            ((OgvData) this.instance).clearSeasonType();
            return this;
        }

        public Builder clearShareUrl() {
            copyOnWrite();
            ((OgvData) this.instance).clearShareUrl();
            return this;
        }

        public Builder clearShortLink() {
            copyOnWrite();
            ((OgvData) this.instance).clearShortLink();
            return this;
        }

        public Builder clearShowSeasonType() {
            copyOnWrite();
            ((OgvData) this.instance).clearShowSeasonType();
            return this;
        }

        public Builder clearSquareCover() {
            copyOnWrite();
            ((OgvData) this.instance).clearSquareCover();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((OgvData) this.instance).clearStat();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((OgvData) this.instance).clearStatus();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((OgvData) this.instance).clearTitle();
            return this;
        }

        public Builder clearTotalEp() {
            copyOnWrite();
            ((OgvData) this.instance).clearTotalEp();
            return this;
        }

        public Builder clearUserStatus() {
            copyOnWrite();
            ((OgvData) this.instance).clearUserStatus();
            return this;
        }

        public PlayFloatLayerActivity getActivityFloatLayer(int i) {
            return ((OgvData) this.instance).getActivityFloatLayer(i);
        }

        public int getActivityFloatLayerCount() {
            return ((OgvData) this.instance).getActivityFloatLayerCount();
        }

        public List<PlayFloatLayerActivity> getActivityFloatLayerList() {
            return Collections.unmodifiableList(((OgvData) this.instance).getActivityFloatLayerList());
        }

        public long getAid() {
            return ((OgvData) this.instance).getAid();
        }

        public String getCover() {
            return ((OgvData) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((OgvData) this.instance).getCoverBytes();
        }

        public EarphoneConf getEarphoneConf() {
            return ((OgvData) this.instance).getEarphoneConf();
        }

        public int getHasCanPlayEp() {
            return ((OgvData) this.instance).getHasCanPlayEp();
        }

        public String getHorizontalCover1610() {
            return ((OgvData) this.instance).getHorizontalCover1610();
        }

        public ByteString getHorizontalCover1610Bytes() {
            return ((OgvData) this.instance).getHorizontalCover1610Bytes();
        }

        public String getHorizontalCover169() {
            return ((OgvData) this.instance).getHorizontalCover169();
        }

        public ByteString getHorizontalCover169Bytes() {
            return ((OgvData) this.instance).getHorizontalCover169Bytes();
        }

        public int getMediaId() {
            return ((OgvData) this.instance).getMediaId();
        }

        public int getMode() {
            return ((OgvData) this.instance).getMode();
        }

        public MultiViewInfo getMultiViewInfo() {
            return ((OgvData) this.instance).getMultiViewInfo();
        }

        public NewEp getNewEp() {
            return ((OgvData) this.instance).getNewEp();
        }

        public OgvSwitch getOgvSwitch() {
            return ((OgvData) this.instance).getOgvSwitch();
        }

        public PlayStrategy getPlayStrategy() {
            return ((OgvData) this.instance).getPlayStrategy();
        }

        public Publish getPublish() {
            return ((OgvData) this.instance).getPublish();
        }

        public Reserve getReserve() {
            return ((OgvData) this.instance).getReserve();
        }

        public Rights getRights() {
            return ((OgvData) this.instance).getRights();
        }

        public long getSeasonId() {
            return ((OgvData) this.instance).getSeasonId();
        }

        public int getSeasonType() {
            return ((OgvData) this.instance).getSeasonType();
        }

        public String getShareUrl() {
            return ((OgvData) this.instance).getShareUrl();
        }

        public ByteString getShareUrlBytes() {
            return ((OgvData) this.instance).getShareUrlBytes();
        }

        public String getShortLink() {
            return ((OgvData) this.instance).getShortLink();
        }

        public ByteString getShortLinkBytes() {
            return ((OgvData) this.instance).getShortLinkBytes();
        }

        public int getShowSeasonType() {
            return ((OgvData) this.instance).getShowSeasonType();
        }

        public String getSquareCover() {
            return ((OgvData) this.instance).getSquareCover();
        }

        public ByteString getSquareCoverBytes() {
            return ((OgvData) this.instance).getSquareCoverBytes();
        }

        public Stat getStat() {
            return ((OgvData) this.instance).getStat();
        }

        public int getStatus() {
            return ((OgvData) this.instance).getStatus();
        }

        public String getTitle() {
            return ((OgvData) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OgvData) this.instance).getTitleBytes();
        }

        public int getTotalEp() {
            return ((OgvData) this.instance).getTotalEp();
        }

        public UserStatus getUserStatus() {
            return ((OgvData) this.instance).getUserStatus();
        }

        public boolean hasEarphoneConf() {
            return ((OgvData) this.instance).hasEarphoneConf();
        }

        public boolean hasMultiViewInfo() {
            return ((OgvData) this.instance).hasMultiViewInfo();
        }

        public boolean hasNewEp() {
            return ((OgvData) this.instance).hasNewEp();
        }

        public boolean hasOgvSwitch() {
            return ((OgvData) this.instance).hasOgvSwitch();
        }

        public boolean hasPlayStrategy() {
            return ((OgvData) this.instance).hasPlayStrategy();
        }

        public boolean hasPublish() {
            return ((OgvData) this.instance).hasPublish();
        }

        public boolean hasReserve() {
            return ((OgvData) this.instance).hasReserve();
        }

        public boolean hasRights() {
            return ((OgvData) this.instance).hasRights();
        }

        public boolean hasStat() {
            return ((OgvData) this.instance).hasStat();
        }

        public boolean hasUserStatus() {
            return ((OgvData) this.instance).hasUserStatus();
        }

        public Builder mergeEarphoneConf(EarphoneConf earphoneConf) {
            copyOnWrite();
            ((OgvData) this.instance).mergeEarphoneConf(earphoneConf);
            return this;
        }

        public Builder mergeMultiViewInfo(MultiViewInfo multiViewInfo) {
            copyOnWrite();
            ((OgvData) this.instance).mergeMultiViewInfo(multiViewInfo);
            return this;
        }

        public Builder mergeNewEp(NewEp newEp) {
            copyOnWrite();
            ((OgvData) this.instance).mergeNewEp(newEp);
            return this;
        }

        public Builder mergeOgvSwitch(OgvSwitch ogvSwitch) {
            copyOnWrite();
            ((OgvData) this.instance).mergeOgvSwitch(ogvSwitch);
            return this;
        }

        public Builder mergePlayStrategy(PlayStrategy playStrategy) {
            copyOnWrite();
            ((OgvData) this.instance).mergePlayStrategy(playStrategy);
            return this;
        }

        public Builder mergePublish(Publish publish) {
            copyOnWrite();
            ((OgvData) this.instance).mergePublish(publish);
            return this;
        }

        public Builder mergeReserve(Reserve reserve) {
            copyOnWrite();
            ((OgvData) this.instance).mergeReserve(reserve);
            return this;
        }

        public Builder mergeRights(Rights rights) {
            copyOnWrite();
            ((OgvData) this.instance).mergeRights(rights);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((OgvData) this.instance).mergeStat(stat);
            return this;
        }

        public Builder mergeUserStatus(UserStatus userStatus) {
            copyOnWrite();
            ((OgvData) this.instance).mergeUserStatus(userStatus);
            return this;
        }

        public Builder removeActivityFloatLayer(int i) {
            copyOnWrite();
            ((OgvData) this.instance).removeActivityFloatLayer(i);
            return this;
        }

        public Builder setActivityFloatLayer(int i, PlayFloatLayerActivity playFloatLayerActivity) {
            copyOnWrite();
            ((OgvData) this.instance).setActivityFloatLayer(i, playFloatLayerActivity);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((OgvData) this.instance).setAid(j);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((OgvData) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvData) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setEarphoneConf(EarphoneConf earphoneConf) {
            copyOnWrite();
            ((OgvData) this.instance).setEarphoneConf(earphoneConf);
            return this;
        }

        public Builder setHasCanPlayEp(int i) {
            copyOnWrite();
            ((OgvData) this.instance).setHasCanPlayEp(i);
            return this;
        }

        public Builder setHorizontalCover1610(String str) {
            copyOnWrite();
            ((OgvData) this.instance).setHorizontalCover1610(str);
            return this;
        }

        public Builder setHorizontalCover1610Bytes(ByteString byteString) {
            copyOnWrite();
            ((OgvData) this.instance).setHorizontalCover1610Bytes(byteString);
            return this;
        }

        public Builder setHorizontalCover169(String str) {
            copyOnWrite();
            ((OgvData) this.instance).setHorizontalCover169(str);
            return this;
        }

        public Builder setHorizontalCover169Bytes(ByteString byteString) {
            copyOnWrite();
            ((OgvData) this.instance).setHorizontalCover169Bytes(byteString);
            return this;
        }

        public Builder setMediaId(int i) {
            copyOnWrite();
            ((OgvData) this.instance).setMediaId(i);
            return this;
        }

        public Builder setMode(int i) {
            copyOnWrite();
            ((OgvData) this.instance).setMode(i);
            return this;
        }

        public Builder setMultiViewInfo(MultiViewInfo multiViewInfo) {
            copyOnWrite();
            ((OgvData) this.instance).setMultiViewInfo(multiViewInfo);
            return this;
        }

        public Builder setNewEp(NewEp newEp) {
            copyOnWrite();
            ((OgvData) this.instance).setNewEp(newEp);
            return this;
        }

        public Builder setOgvSwitch(OgvSwitch ogvSwitch) {
            copyOnWrite();
            ((OgvData) this.instance).setOgvSwitch(ogvSwitch);
            return this;
        }

        public Builder setPlayStrategy(PlayStrategy playStrategy) {
            copyOnWrite();
            ((OgvData) this.instance).setPlayStrategy(playStrategy);
            return this;
        }

        public Builder setPublish(Publish publish) {
            copyOnWrite();
            ((OgvData) this.instance).setPublish(publish);
            return this;
        }

        public Builder setReserve(Reserve reserve) {
            copyOnWrite();
            ((OgvData) this.instance).setReserve(reserve);
            return this;
        }

        public Builder setRights(Rights rights) {
            copyOnWrite();
            ((OgvData) this.instance).setRights(rights);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((OgvData) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setSeasonType(int i) {
            copyOnWrite();
            ((OgvData) this.instance).setSeasonType(i);
            return this;
        }

        public Builder setShareUrl(String str) {
            copyOnWrite();
            ((OgvData) this.instance).setShareUrl(str);
            return this;
        }

        public Builder setShareUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvData) this.instance).setShareUrlBytes(byteString);
            return this;
        }

        public Builder setShortLink(String str) {
            copyOnWrite();
            ((OgvData) this.instance).setShortLink(str);
            return this;
        }

        public Builder setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvData) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public Builder setShowSeasonType(int i) {
            copyOnWrite();
            ((OgvData) this.instance).setShowSeasonType(i);
            return this;
        }

        public Builder setSquareCover(String str) {
            copyOnWrite();
            ((OgvData) this.instance).setSquareCover(str);
            return this;
        }

        public Builder setSquareCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvData) this.instance).setSquareCoverBytes(byteString);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((OgvData) this.instance).setStat(stat);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((OgvData) this.instance).setStatus(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((OgvData) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvData) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTotalEp(int i) {
            copyOnWrite();
            ((OgvData) this.instance).setTotalEp(i);
            return this;
        }

        public Builder setUserStatus(UserStatus userStatus) {
            copyOnWrite();
            ((OgvData) this.instance).setUserStatus(userStatus);
            return this;
        }

        private Builder() {
            super(OgvData.DEFAULT_INSTANCE);
        }

        public Builder addActivityFloatLayer(int i, PlayFloatLayerActivity playFloatLayerActivity) {
            copyOnWrite();
            ((OgvData) this.instance).addActivityFloatLayer(i, playFloatLayerActivity);
            return this;
        }

        public Builder setActivityFloatLayer(int i, PlayFloatLayerActivity.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setActivityFloatLayer(i, builder.build());
            return this;
        }

        public Builder setEarphoneConf(EarphoneConf.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setEarphoneConf(builder.build());
            return this;
        }

        public Builder setMultiViewInfo(MultiViewInfo.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setMultiViewInfo(builder.build());
            return this;
        }

        public Builder setNewEp(NewEp.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setNewEp(builder.build());
            return this;
        }

        public Builder setOgvSwitch(OgvSwitch.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setOgvSwitch(builder.build());
            return this;
        }

        public Builder setPlayStrategy(PlayStrategy.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setPlayStrategy(builder.build());
            return this;
        }

        public Builder setPublish(Publish.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setPublish(builder.build());
            return this;
        }

        public Builder setReserve(Reserve.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setReserve(builder.build());
            return this;
        }

        public Builder setRights(Rights.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setRights(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setStat(builder.build());
            return this;
        }

        public Builder setUserStatus(UserStatus.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).setUserStatus(builder.build());
            return this;
        }

        public Builder addActivityFloatLayer(PlayFloatLayerActivity.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).addActivityFloatLayer(builder.build());
            return this;
        }

        public Builder addActivityFloatLayer(int i, PlayFloatLayerActivity.Builder builder) {
            copyOnWrite();
            ((OgvData) this.instance).addActivityFloatLayer(i, builder.build());
            return this;
        }
    }

    static {
        OgvData ogvData = new OgvData();
        DEFAULT_INSTANCE = ogvData;
        GeneratedMessageLite.registerDefaultInstance(OgvData.class, ogvData);
    }

    public OgvData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityFloatLayer(PlayFloatLayerActivity playFloatLayerActivity) {
        playFloatLayerActivity.getClass();
        ensureActivityFloatLayerIsMutable();
        this.activityFloatLayer_.add(playFloatLayerActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActivityFloatLayer(Iterable<? extends PlayFloatLayerActivity> iterable) {
        ensureActivityFloatLayerIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.activityFloatLayer_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityFloatLayer() {
        this.activityFloatLayer_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEarphoneConf() {
        this.earphoneConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasCanPlayEp() {
        this.hasCanPlayEp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorizontalCover1610() {
        this.horizontalCover1610_ = getDefaultInstance().getHorizontalCover1610();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorizontalCover169() {
        this.horizontalCover169_ = getDefaultInstance().getHorizontalCover169();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaId() {
        this.mediaId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultiViewInfo() {
        this.multiViewInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewEp() {
        this.newEp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgvSwitch() {
        this.ogvSwitch_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayStrategy() {
        this.playStrategy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublish() {
        this.publish_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserve() {
        this.reserve_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRights() {
        this.rights_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonType() {
        this.seasonType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareUrl() {
        this.shareUrl_ = getDefaultInstance().getShareUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortLink() {
        this.shortLink_ = getDefaultInstance().getShortLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowSeasonType() {
        this.showSeasonType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSquareCover() {
        this.squareCover_ = getDefaultInstance().getSquareCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalEp() {
        this.totalEp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserStatus() {
        this.userStatus_ = null;
    }

    private void ensureActivityFloatLayerIsMutable() {
        Internal.ProtobufList<PlayFloatLayerActivity> protobufList = this.activityFloatLayer_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.activityFloatLayer_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static OgvData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEarphoneConf(EarphoneConf earphoneConf) {
        earphoneConf.getClass();
        EarphoneConf earphoneConf2 = this.earphoneConf_;
        if (earphoneConf2 != null && earphoneConf2 != EarphoneConf.getDefaultInstance()) {
            this.earphoneConf_ = EarphoneConf.newBuilder(this.earphoneConf_).mergeFrom((EarphoneConf) earphoneConf).buildPartial();
        } else {
            this.earphoneConf_ = earphoneConf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMultiViewInfo(MultiViewInfo multiViewInfo) {
        multiViewInfo.getClass();
        MultiViewInfo multiViewInfo2 = this.multiViewInfo_;
        if (multiViewInfo2 != null && multiViewInfo2 != MultiViewInfo.getDefaultInstance()) {
            this.multiViewInfo_ = MultiViewInfo.newBuilder(this.multiViewInfo_).mergeFrom((MultiViewInfo) multiViewInfo).buildPartial();
        } else {
            this.multiViewInfo_ = multiViewInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewEp(NewEp newEp) {
        newEp.getClass();
        NewEp newEp2 = this.newEp_;
        if (newEp2 != null && newEp2 != NewEp.getDefaultInstance()) {
            this.newEp_ = NewEp.newBuilder(this.newEp_).mergeFrom((NewEp) newEp).buildPartial();
        } else {
            this.newEp_ = newEp;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOgvSwitch(OgvSwitch ogvSwitch) {
        ogvSwitch.getClass();
        OgvSwitch ogvSwitch2 = this.ogvSwitch_;
        if (ogvSwitch2 != null && ogvSwitch2 != OgvSwitch.getDefaultInstance()) {
            this.ogvSwitch_ = OgvSwitch.newBuilder(this.ogvSwitch_).mergeFrom((OgvSwitch) ogvSwitch).buildPartial();
        } else {
            this.ogvSwitch_ = ogvSwitch;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayStrategy(PlayStrategy playStrategy) {
        playStrategy.getClass();
        PlayStrategy playStrategy2 = this.playStrategy_;
        if (playStrategy2 != null && playStrategy2 != PlayStrategy.getDefaultInstance()) {
            this.playStrategy_ = PlayStrategy.newBuilder(this.playStrategy_).mergeFrom((PlayStrategy) playStrategy).buildPartial();
        } else {
            this.playStrategy_ = playStrategy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublish(Publish publish) {
        publish.getClass();
        Publish publish2 = this.publish_;
        if (publish2 != null && publish2 != Publish.getDefaultInstance()) {
            this.publish_ = Publish.newBuilder(this.publish_).mergeFrom((Publish) publish).buildPartial();
        } else {
            this.publish_ = publish;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReserve(Reserve reserve) {
        reserve.getClass();
        Reserve reserve2 = this.reserve_;
        if (reserve2 != null && reserve2 != Reserve.getDefaultInstance()) {
            this.reserve_ = Reserve.newBuilder(this.reserve_).mergeFrom((Reserve) reserve).buildPartial();
        } else {
            this.reserve_ = reserve;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRights(Rights rights) {
        rights.getClass();
        Rights rights2 = this.rights_;
        if (rights2 != null && rights2 != Rights.getDefaultInstance()) {
            this.rights_ = Rights.newBuilder(this.rights_).mergeFrom((Rights) rights).buildPartial();
        } else {
            this.rights_ = rights;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStat(Stat stat) {
        stat.getClass();
        Stat stat2 = this.stat_;
        if (stat2 != null && stat2 != Stat.getDefaultInstance()) {
            this.stat_ = Stat.newBuilder(this.stat_).mergeFrom((Stat) stat).buildPartial();
        } else {
            this.stat_ = stat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserStatus(UserStatus userStatus) {
        userStatus.getClass();
        UserStatus userStatus2 = this.userStatus_;
        if (userStatus2 != null && userStatus2 != UserStatus.getDefaultInstance()) {
            this.userStatus_ = UserStatus.newBuilder(this.userStatus_).mergeFrom((UserStatus) userStatus).buildPartial();
        } else {
            this.userStatus_ = userStatus;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OgvData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OgvData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OgvData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActivityFloatLayer(int i) {
        ensureActivityFloatLayerIsMutable();
        this.activityFloatLayer_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityFloatLayer(int i, PlayFloatLayerActivity playFloatLayerActivity) {
        playFloatLayerActivity.getClass();
        ensureActivityFloatLayerIsMutable();
        this.activityFloatLayer_.set(i, playFloatLayerActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
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
    public void setEarphoneConf(EarphoneConf earphoneConf) {
        earphoneConf.getClass();
        this.earphoneConf_ = earphoneConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasCanPlayEp(int i) {
        this.hasCanPlayEp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalCover1610(String str) {
        str.getClass();
        this.horizontalCover1610_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalCover1610Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.horizontalCover1610_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalCover169(String str) {
        str.getClass();
        this.horizontalCover169_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalCover169Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.horizontalCover169_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaId(int i) {
        this.mediaId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(int i) {
        this.mode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultiViewInfo(MultiViewInfo multiViewInfo) {
        multiViewInfo.getClass();
        this.multiViewInfo_ = multiViewInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewEp(NewEp newEp) {
        newEp.getClass();
        this.newEp_ = newEp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgvSwitch(OgvSwitch ogvSwitch) {
        ogvSwitch.getClass();
        this.ogvSwitch_ = ogvSwitch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayStrategy(PlayStrategy playStrategy) {
        playStrategy.getClass();
        this.playStrategy_ = playStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublish(Publish publish) {
        publish.getClass();
        this.publish_ = publish;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserve(Reserve reserve) {
        reserve.getClass();
        this.reserve_ = reserve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRights(Rights rights) {
        rights.getClass();
        this.rights_ = rights;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonType(int i) {
        this.seasonType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareUrl(String str) {
        str.getClass();
        this.shareUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareUrl_ = byteString.toStringUtf8();
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
    public void setShowSeasonType(int i) {
        this.showSeasonType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSquareCover(String str) {
        str.getClass();
        this.squareCover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSquareCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.squareCover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
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
    public void setTotalEp(int i) {
        this.totalEp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserStatus(UserStatus userStatus) {
        userStatus.getClass();
        this.userStatus_ = userStatus;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70901.f17067xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OgvData();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0000\u0000\u0001\u001b\u001b\u0000\u0001\u0000\u0001\u0004\u0002\u0002\u0003\u0004\u0004\u0004\u0005\t\u0006\t\u0007\u0002\b\t\t\u0004\n\t\u000b\t\f\t\r\t\u000e\u0004\u000f\t\u0010\t\u0011\u0004\u0012\u001b\u0013\t\u0014\u0208\u0015\u0208\u0016\u0208\u0017\u0208\u0018\u0208\u0019\u0208\u001a\u0208\u001b\u0004", new Object[]{"mediaId_", "seasonId_", "seasonType_", "showSeasonType_", "rights_", "userStatus_", "aid_", "stat_", "mode_", "publish_", "playStrategy_", "multiViewInfo_", "ogvSwitch_", "totalEp_", "newEp_", "reserve_", "status_", "activityFloatLayer_", PlayFloatLayerActivity.class, "earphoneConf_", "cover_", "squareCover_", "shareUrl_", "shortLink_", "title_", "horizontalCover169_", "horizontalCover1610_", "hasCanPlayEp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OgvData> parser = PARSER;
                if (parser == null) {
                    synchronized (OgvData.class) {
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

    public PlayFloatLayerActivity getActivityFloatLayer(int i) {
        return this.activityFloatLayer_.get(i);
    }

    public int getActivityFloatLayerCount() {
        return this.activityFloatLayer_.size();
    }

    public List<PlayFloatLayerActivity> getActivityFloatLayerList() {
        return this.activityFloatLayer_;
    }

    public PlayFloatLayerActivityOrBuilder getActivityFloatLayerOrBuilder(int i) {
        return this.activityFloatLayer_.get(i);
    }

    public List<? extends PlayFloatLayerActivityOrBuilder> getActivityFloatLayerOrBuilderList() {
        return this.activityFloatLayer_;
    }

    public long getAid() {
        return this.aid_;
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public EarphoneConf getEarphoneConf() {
        EarphoneConf earphoneConf = this.earphoneConf_;
        return earphoneConf == null ? EarphoneConf.getDefaultInstance() : earphoneConf;
    }

    public int getHasCanPlayEp() {
        return this.hasCanPlayEp_;
    }

    public String getHorizontalCover1610() {
        return this.horizontalCover1610_;
    }

    public ByteString getHorizontalCover1610Bytes() {
        return ByteString.copyFromUtf8(this.horizontalCover1610_);
    }

    public String getHorizontalCover169() {
        return this.horizontalCover169_;
    }

    public ByteString getHorizontalCover169Bytes() {
        return ByteString.copyFromUtf8(this.horizontalCover169_);
    }

    public int getMediaId() {
        return this.mediaId_;
    }

    public int getMode() {
        return this.mode_;
    }

    public MultiViewInfo getMultiViewInfo() {
        MultiViewInfo multiViewInfo = this.multiViewInfo_;
        return multiViewInfo == null ? MultiViewInfo.getDefaultInstance() : multiViewInfo;
    }

    public NewEp getNewEp() {
        NewEp newEp = this.newEp_;
        return newEp == null ? NewEp.getDefaultInstance() : newEp;
    }

    public OgvSwitch getOgvSwitch() {
        OgvSwitch ogvSwitch = this.ogvSwitch_;
        return ogvSwitch == null ? OgvSwitch.getDefaultInstance() : ogvSwitch;
    }

    public PlayStrategy getPlayStrategy() {
        PlayStrategy playStrategy = this.playStrategy_;
        return playStrategy == null ? PlayStrategy.getDefaultInstance() : playStrategy;
    }

    public Publish getPublish() {
        Publish publish = this.publish_;
        return publish == null ? Publish.getDefaultInstance() : publish;
    }

    public Reserve getReserve() {
        Reserve reserve = this.reserve_;
        return reserve == null ? Reserve.getDefaultInstance() : reserve;
    }

    public Rights getRights() {
        Rights rights = this.rights_;
        return rights == null ? Rights.getDefaultInstance() : rights;
    }

    public long getSeasonId() {
        return this.seasonId_;
    }

    public int getSeasonType() {
        return this.seasonType_;
    }

    public String getShareUrl() {
        return this.shareUrl_;
    }

    public ByteString getShareUrlBytes() {
        return ByteString.copyFromUtf8(this.shareUrl_);
    }

    public String getShortLink() {
        return this.shortLink_;
    }

    public ByteString getShortLinkBytes() {
        return ByteString.copyFromUtf8(this.shortLink_);
    }

    public int getShowSeasonType() {
        return this.showSeasonType_;
    }

    public String getSquareCover() {
        return this.squareCover_;
    }

    public ByteString getSquareCoverBytes() {
        return ByteString.copyFromUtf8(this.squareCover_);
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public int getStatus() {
        return this.status_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getTotalEp() {
        return this.totalEp_;
    }

    public UserStatus getUserStatus() {
        UserStatus userStatus = this.userStatus_;
        return userStatus == null ? UserStatus.getDefaultInstance() : userStatus;
    }

    public boolean hasEarphoneConf() {
        return this.earphoneConf_ != null;
    }

    public boolean hasMultiViewInfo() {
        return this.multiViewInfo_ != null;
    }

    public boolean hasNewEp() {
        return this.newEp_ != null;
    }

    public boolean hasOgvSwitch() {
        return this.ogvSwitch_ != null;
    }

    public boolean hasPlayStrategy() {
        return this.playStrategy_ != null;
    }

    public boolean hasPublish() {
        return this.publish_ != null;
    }

    public boolean hasReserve() {
        return this.reserve_ != null;
    }

    public boolean hasRights() {
        return this.rights_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public boolean hasUserStatus() {
        return this.userStatus_ != null;
    }

    public static Builder newBuilder(OgvData ogvData) {
        return DEFAULT_INSTANCE.createBuilder(ogvData);
    }

    public static OgvData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OgvData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityFloatLayer(int i, PlayFloatLayerActivity playFloatLayerActivity) {
        playFloatLayerActivity.getClass();
        ensureActivityFloatLayerIsMutable();
        this.activityFloatLayer_.add(i, playFloatLayerActivity);
    }

    public static OgvData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OgvData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OgvData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OgvData parseFrom(InputStream inputStream) throws IOException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OgvData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
