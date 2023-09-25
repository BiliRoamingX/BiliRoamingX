package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class ViewEpisode extends GeneratedMessageLite<ViewEpisode, ViewEpisode.Builder> implements ViewEpisodeOrBuilder {
    public static final int AID_FIELD_NUMBER = 8;
    public static final int ARCHIVE_ATTR_FIELD_NUMBER = 25;
    public static final int BADGE_FIELD_NUMBER = 2;
    public static final int BADGE_INFO_FIELD_NUMBER = 4;
    public static final int BADGE_TYPE_FIELD_NUMBER = 3;
    public static final int BMID_FIELD_NUMBER = 28;
    public static final int BVID_FIELD_NUMBER = 24;
    public static final int CID_FIELD_NUMBER = 14;
    public static final int COVER_FIELD_NUMBER = 7;
    private static final ViewEpisode DEFAULT_INSTANCE;
    public static final int DIALOG_TYPE_FIELD_NUMBER = 35;
    public static final int DIMENSION_FIELD_NUMBER = 21;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int EP_ID_FIELD_NUMBER = 1;
    public static final int EP_INDEX_FIELD_NUMBER = 31;
    public static final int FROM_FIELD_NUMBER = 15;
    public static final int INTERACTION_FIELD_NUMBER = 23;
    public static final int IS_SUB_VIEW_FIELD_NUMBER = 38;
    public static final int IS_VIEW_HIDE_FIELD_NUMBER = 39;
    public static final int JUMP_LINK_FIELD_NUMBER = 40;
    public static final int LINK_FIELD_NUMBER = 26;
    public static final int LINK_TYPE_FIELD_NUMBER = 27;
    public static final int LONG_TITLE_FIELD_NUMBER = 12;
    public static final int MOVIE_TITLE_FIELD_NUMBER = 10;
    public static final int MULTI_VIEW_EPS_FIELD_NUMBER = 37;
    private static volatile Parser<ViewEpisode> PARSER = null;
    public static final int PUB_TIME_FIELD_NUMBER = 29;
    public static final int PV_FIELD_NUMBER = 30;
    public static final int RELEASE_DATE_FIELD_NUMBER = 20;
    public static final int REPORT_FIELD_NUMBER = 42;
    public static final int RIGHTS_FIELD_NUMBER = 22;
    public static final int SECTION_INDEX_FIELD_NUMBER = 32;
    public static final int SHARE_COPY_FIELD_NUMBER = 17;
    public static final int SHARE_URL_FIELD_NUMBER = 16;
    public static final int SHORT_LINK_FIELD_NUMBER = 18;
    public static final int STATUS_FIELD_NUMBER = 6;
    public static final int STAT_FOR_UNITY_FIELD_NUMBER = 41;
    public static final int SUBTITLE_FIELD_NUMBER = 11;
    public static final int TITLE_FIELD_NUMBER = 9;
    public static final int TOAST_TITLE_FIELD_NUMBER = 13;
    public static final int TOAST_TYPE_FIELD_NUMBER = 36;
    public static final int UP_INFOS_FIELD_NUMBER = 33;
    public static final int UP_INFO_FIELD_NUMBER = 34;
    public static final int VID_FIELD_NUMBER = 19;
    private long aid_;
    private int archiveAttr_;
    private BadgeInfo badgeInfo_;
    private int badgeType_;
    private long cid_;
    private Dimension dimension_;
    private int duration_;
    private long epId_;
    private int epIndex_;
    private Interaction interaction_;
    private boolean isSubView_;
    private boolean isViewHide_;
    private long pubTime_;
    private int pv_;
    private Rights rights_;
    private int sectionIndex_;
    private Stat statForUnity_;
    private int status_;
    private Staff upInfo_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String badge_ = "";
    private String cover_ = "";
    private String title_ = "";
    private String movieTitle_ = "";
    private String subtitle_ = "";
    private String longTitle_ = "";
    private String toastTitle_ = "";
    private String from_ = "";
    private String shareUrl_ = "";
    private String shareCopy_ = "";
    private String shortLink_ = "";
    private String vid_ = "";
    private String releaseDate_ = "";
    private String bvid_ = "";
    private String link_ = "";
    private String linkType_ = "";
    private String bmid_ = "";
    private Internal.ProtobufList<Staff> upInfos_ = GeneratedMessageLite.emptyProtobufList();
    private String dialogType_ = "";
    private String toastType_ = "";
    private Internal.ProtobufList<MultiViewEp> multiViewEps_ = GeneratedMessageLite.emptyProtobufList();
    private String jumpLink_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.ViewEpisode$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17059xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17059xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17059xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17059xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17059xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17059xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17059xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17059xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewEpisode, Builder> implements ViewEpisodeOrBuilder {
        /* synthetic */ Builder(C70821 c70821) {
            this();
        }

        public Builder addAllMultiViewEps(Iterable<? extends MultiViewEp> iterable) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addAllMultiViewEps(iterable);
            return this;
        }

        public Builder addAllUpInfos(Iterable<? extends Staff> iterable) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addAllUpInfos(iterable);
            return this;
        }

        public Builder addMultiViewEps(MultiViewEp multiViewEp) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addMultiViewEps(multiViewEp);
            return this;
        }

        public Builder addUpInfos(Staff staff) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addUpInfos(staff);
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearAid();
            return this;
        }

        public Builder clearArchiveAttr() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearArchiveAttr();
            return this;
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearBadge();
            return this;
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearBadgeType() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearBadgeType();
            return this;
        }

        public Builder clearBmid() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearBmid();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearBvid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearCid();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearCover();
            return this;
        }

        public Builder clearDialogType() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearDialogType();
            return this;
        }

        public Builder clearDimension() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearDimension();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearDuration();
            return this;
        }

        public Builder clearEpId() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearEpId();
            return this;
        }

        public Builder clearEpIndex() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearEpIndex();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearFrom();
            return this;
        }

        public Builder clearInteraction() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearInteraction();
            return this;
        }

        public Builder clearIsSubView() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearIsSubView();
            return this;
        }

        public Builder clearIsViewHide() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearIsViewHide();
            return this;
        }

        public Builder clearJumpLink() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearJumpLink();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearLink();
            return this;
        }

        public Builder clearLinkType() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearLinkType();
            return this;
        }

        public Builder clearLongTitle() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearLongTitle();
            return this;
        }

        public Builder clearMovieTitle() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearMovieTitle();
            return this;
        }

        public Builder clearMultiViewEps() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearMultiViewEps();
            return this;
        }

        public Builder clearPubTime() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearPubTime();
            return this;
        }

        public Builder clearPv() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearPv();
            return this;
        }

        public Builder clearReleaseDate() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearReleaseDate();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((ViewEpisode) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearRights() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearRights();
            return this;
        }

        public Builder clearSectionIndex() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearSectionIndex();
            return this;
        }

        public Builder clearShareCopy() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearShareCopy();
            return this;
        }

        public Builder clearShareUrl() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearShareUrl();
            return this;
        }

        public Builder clearShortLink() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearShortLink();
            return this;
        }

        public Builder clearStatForUnity() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearStatForUnity();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearStatus();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearTitle();
            return this;
        }

        public Builder clearToastTitle() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearToastTitle();
            return this;
        }

        public Builder clearToastType() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearToastType();
            return this;
        }

        public Builder clearUpInfo() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearUpInfo();
            return this;
        }

        public Builder clearUpInfos() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearUpInfos();
            return this;
        }

        public Builder clearVid() {
            copyOnWrite();
            ((ViewEpisode) this.instance).clearVid();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean containsReport(String str) {
            str.getClass();
            return ((ViewEpisode) this.instance).getReportMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public long getAid() {
            return ((ViewEpisode) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getArchiveAttr() {
            return ((ViewEpisode) this.instance).getArchiveAttr();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getBadge() {
            return ((ViewEpisode) this.instance).getBadge();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getBadgeBytes() {
            return ((ViewEpisode) this.instance).getBadgeBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public BadgeInfo getBadgeInfo() {
            return ((ViewEpisode) this.instance).getBadgeInfo();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getBadgeType() {
            return ((ViewEpisode) this.instance).getBadgeType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getBmid() {
            return ((ViewEpisode) this.instance).getBmid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getBmidBytes() {
            return ((ViewEpisode) this.instance).getBmidBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getBvid() {
            return ((ViewEpisode) this.instance).getBvid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getBvidBytes() {
            return ((ViewEpisode) this.instance).getBvidBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public long getCid() {
            return ((ViewEpisode) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getCover() {
            return ((ViewEpisode) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getCoverBytes() {
            return ((ViewEpisode) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getDialogType() {
            return ((ViewEpisode) this.instance).getDialogType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getDialogTypeBytes() {
            return ((ViewEpisode) this.instance).getDialogTypeBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public Dimension getDimension() {
            return ((ViewEpisode) this.instance).getDimension();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getDuration() {
            return ((ViewEpisode) this.instance).getDuration();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public long getEpId() {
            return ((ViewEpisode) this.instance).getEpId();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getEpIndex() {
            return ((ViewEpisode) this.instance).getEpIndex();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getFrom() {
            return ((ViewEpisode) this.instance).getFrom();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getFromBytes() {
            return ((ViewEpisode) this.instance).getFromBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public Interaction getInteraction() {
            return ((ViewEpisode) this.instance).getInteraction();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean getIsSubView() {
            return ((ViewEpisode) this.instance).getIsSubView();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean getIsViewHide() {
            return ((ViewEpisode) this.instance).getIsViewHide();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getJumpLink() {
            return ((ViewEpisode) this.instance).getJumpLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getJumpLinkBytes() {
            return ((ViewEpisode) this.instance).getJumpLinkBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getLink() {
            return ((ViewEpisode) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getLinkBytes() {
            return ((ViewEpisode) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getLinkType() {
            return ((ViewEpisode) this.instance).getLinkType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getLinkTypeBytes() {
            return ((ViewEpisode) this.instance).getLinkTypeBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getLongTitle() {
            return ((ViewEpisode) this.instance).getLongTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getLongTitleBytes() {
            return ((ViewEpisode) this.instance).getLongTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getMovieTitle() {
            return ((ViewEpisode) this.instance).getMovieTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getMovieTitleBytes() {
            return ((ViewEpisode) this.instance).getMovieTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public MultiViewEp getMultiViewEps(int i) {
            return ((ViewEpisode) this.instance).getMultiViewEps(i);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getMultiViewEpsCount() {
            return ((ViewEpisode) this.instance).getMultiViewEpsCount();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public List<MultiViewEp> getMultiViewEpsList() {
            return Collections.unmodifiableList(((ViewEpisode) this.instance).getMultiViewEpsList());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public long getPubTime() {
            return ((ViewEpisode) this.instance).getPubTime();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getPv() {
            return ((ViewEpisode) this.instance).getPv();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getReleaseDate() {
            return ((ViewEpisode) this.instance).getReleaseDate();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getReleaseDateBytes() {
            return ((ViewEpisode) this.instance).getReleaseDateBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getReportCount() {
            return ((ViewEpisode) this.instance).getReportMap().size();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((ViewEpisode) this.instance).getReportMap());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((ViewEpisode) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((ViewEpisode) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public Rights getRights() {
            return ((ViewEpisode) this.instance).getRights();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getSectionIndex() {
            return ((ViewEpisode) this.instance).getSectionIndex();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getShareCopy() {
            return ((ViewEpisode) this.instance).getShareCopy();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getShareCopyBytes() {
            return ((ViewEpisode) this.instance).getShareCopyBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getShareUrl() {
            return ((ViewEpisode) this.instance).getShareUrl();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getShareUrlBytes() {
            return ((ViewEpisode) this.instance).getShareUrlBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getShortLink() {
            return ((ViewEpisode) this.instance).getShortLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getShortLinkBytes() {
            return ((ViewEpisode) this.instance).getShortLinkBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public Stat getStatForUnity() {
            return ((ViewEpisode) this.instance).getStatForUnity();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getStatus() {
            return ((ViewEpisode) this.instance).getStatus();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getSubtitle() {
            return ((ViewEpisode) this.instance).getSubtitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getSubtitleBytes() {
            return ((ViewEpisode) this.instance).getSubtitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getTitle() {
            return ((ViewEpisode) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getTitleBytes() {
            return ((ViewEpisode) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getToastTitle() {
            return ((ViewEpisode) this.instance).getToastTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getToastTitleBytes() {
            return ((ViewEpisode) this.instance).getToastTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getToastType() {
            return ((ViewEpisode) this.instance).getToastType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getToastTypeBytes() {
            return ((ViewEpisode) this.instance).getToastTypeBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public Staff getUpInfo() {
            return ((ViewEpisode) this.instance).getUpInfo();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public Staff getUpInfos(int i) {
            return ((ViewEpisode) this.instance).getUpInfos(i);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public int getUpInfosCount() {
            return ((ViewEpisode) this.instance).getUpInfosCount();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public List<Staff> getUpInfosList() {
            return Collections.unmodifiableList(((ViewEpisode) this.instance).getUpInfosList());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public String getVid() {
            return ((ViewEpisode) this.instance).getVid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public ByteString getVidBytes() {
            return ((ViewEpisode) this.instance).getVidBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean hasBadgeInfo() {
            return ((ViewEpisode) this.instance).hasBadgeInfo();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean hasDimension() {
            return ((ViewEpisode) this.instance).hasDimension();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean hasInteraction() {
            return ((ViewEpisode) this.instance).hasInteraction();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean hasRights() {
            return ((ViewEpisode) this.instance).hasRights();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean hasStatForUnity() {
            return ((ViewEpisode) this.instance).hasStatForUnity();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
        public boolean hasUpInfo() {
            return ((ViewEpisode) this.instance).hasUpInfo();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((ViewEpisode) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((ViewEpisode) this.instance).mergeDimension(dimension);
            return this;
        }

        public Builder mergeInteraction(Interaction interaction) {
            copyOnWrite();
            ((ViewEpisode) this.instance).mergeInteraction(interaction);
            return this;
        }

        public Builder mergeRights(Rights rights) {
            copyOnWrite();
            ((ViewEpisode) this.instance).mergeRights(rights);
            return this;
        }

        public Builder mergeStatForUnity(Stat stat) {
            copyOnWrite();
            ((ViewEpisode) this.instance).mergeStatForUnity(stat);
            return this;
        }

        public Builder mergeUpInfo(Staff staff) {
            copyOnWrite();
            ((ViewEpisode) this.instance).mergeUpInfo(staff);
            return this;
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((ViewEpisode) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ViewEpisode) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeMultiViewEps(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).removeMultiViewEps(i);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewEpisode) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder removeUpInfos(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).removeUpInfos(i);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setAid(j);
            return this;
        }

        public Builder setArchiveAttr(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setArchiveAttr(i);
            return this;
        }

        public Builder setBadge(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBadge(str);
            return this;
        }

        public Builder setBadgeBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBadgeBytes(byteString);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setBadgeType(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBadgeType(i);
            return this;
        }

        public Builder setBmid(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBmid(str);
            return this;
        }

        public Builder setBmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBmidBytes(byteString);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setCid(j);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setDialogType(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setDialogType(str);
            return this;
        }

        public Builder setDialogTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setDialogTypeBytes(byteString);
            return this;
        }

        public Builder setDimension(Dimension dimension) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setDimension(dimension);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setDuration(i);
            return this;
        }

        public Builder setEpId(long j) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setEpId(j);
            return this;
        }

        public Builder setEpIndex(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setEpIndex(i);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setInteraction(Interaction interaction) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setInteraction(interaction);
            return this;
        }

        public Builder setIsSubView(boolean z) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setIsSubView(z);
            return this;
        }

        public Builder setIsViewHide(boolean z) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setIsViewHide(z);
            return this;
        }

        public Builder setJumpLink(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setJumpLink(str);
            return this;
        }

        public Builder setJumpLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setJumpLinkBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setLinkType(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setLinkType(str);
            return this;
        }

        public Builder setLinkTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setLinkTypeBytes(byteString);
            return this;
        }

        public Builder setLongTitle(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setLongTitle(str);
            return this;
        }

        public Builder setLongTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setLongTitleBytes(byteString);
            return this;
        }

        public Builder setMovieTitle(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setMovieTitle(str);
            return this;
        }

        public Builder setMovieTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setMovieTitleBytes(byteString);
            return this;
        }

        public Builder setMultiViewEps(int i, MultiViewEp multiViewEp) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setMultiViewEps(i, multiViewEp);
            return this;
        }

        public Builder setPubTime(long j) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setPubTime(j);
            return this;
        }

        public Builder setPv(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setPv(i);
            return this;
        }

        public Builder setReleaseDate(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setReleaseDate(str);
            return this;
        }

        public Builder setReleaseDateBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setReleaseDateBytes(byteString);
            return this;
        }

        public Builder setRights(Rights rights) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setRights(rights);
            return this;
        }

        public Builder setSectionIndex(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setSectionIndex(i);
            return this;
        }

        public Builder setShareCopy(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setShareCopy(str);
            return this;
        }

        public Builder setShareCopyBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setShareCopyBytes(byteString);
            return this;
        }

        public Builder setShareUrl(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setShareUrl(str);
            return this;
        }

        public Builder setShareUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setShareUrlBytes(byteString);
            return this;
        }

        public Builder setShortLink(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setShortLink(str);
            return this;
        }

        public Builder setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public Builder setStatForUnity(Stat stat) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setStatForUnity(stat);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setStatus(i);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setToastTitle(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setToastTitle(str);
            return this;
        }

        public Builder setToastTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setToastTitleBytes(byteString);
            return this;
        }

        public Builder setToastType(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setToastType(str);
            return this;
        }

        public Builder setToastTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setToastTypeBytes(byteString);
            return this;
        }

        public Builder setUpInfo(Staff staff) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setUpInfo(staff);
            return this;
        }

        public Builder setUpInfos(int i, Staff staff) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setUpInfos(i, staff);
            return this;
        }

        public Builder setVid(String str) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setVid(str);
            return this;
        }

        public Builder setVidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setVidBytes(byteString);
            return this;
        }

        private Builder() {
            super(ViewEpisode.DEFAULT_INSTANCE);
        }

        public Builder addMultiViewEps(int i, MultiViewEp multiViewEp) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addMultiViewEps(i, multiViewEp);
            return this;
        }

        public Builder addUpInfos(int i, Staff staff) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addUpInfos(i, staff);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setBadgeInfo(builder.build());
            return this;
        }

        public Builder setDimension(Dimension.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setDimension(builder.build());
            return this;
        }

        public Builder setInteraction(Interaction.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setInteraction(builder.build());
            return this;
        }

        public Builder setMultiViewEps(int i, MultiViewEp.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setMultiViewEps(i, builder.build());
            return this;
        }

        public Builder setRights(Rights.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setRights(builder.build());
            return this;
        }

        public Builder setStatForUnity(Stat.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setStatForUnity(builder.build());
            return this;
        }

        public Builder setUpInfo(Staff.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setUpInfo(builder.build());
            return this;
        }

        public Builder setUpInfos(int i, Staff.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).setUpInfos(i, builder.build());
            return this;
        }

        public Builder addMultiViewEps(MultiViewEp.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addMultiViewEps(builder.build());
            return this;
        }

        public Builder addUpInfos(Staff.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addUpInfos(builder.build());
            return this;
        }

        public Builder addMultiViewEps(int i, MultiViewEp.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addMultiViewEps(i, builder.build());
            return this;
        }

        public Builder addUpInfos(int i, Staff.Builder builder) {
            copyOnWrite();
            ((ViewEpisode) this.instance).addUpInfos(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class ReportDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private ReportDefaultEntryHolder() {
        }
    }

    static {
        ViewEpisode viewEpisode = new ViewEpisode();
        DEFAULT_INSTANCE = viewEpisode;
        GeneratedMessageLite.registerDefaultInstance(ViewEpisode.class, viewEpisode);
    }

    public ViewEpisode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMultiViewEps(Iterable<? extends MultiViewEp> iterable) {
        ensureMultiViewEpsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.multiViewEps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUpInfos(Iterable<? extends Staff> iterable) {
        ensureUpInfosIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.upInfos_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMultiViewEps(MultiViewEp multiViewEp) {
        multiViewEp.getClass();
        ensureMultiViewEpsIsMutable();
        this.multiViewEps_.add(multiViewEp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpInfos(Staff staff) {
        staff.getClass();
        ensureUpInfosIsMutable();
        this.upInfos_.add(staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArchiveAttr() {
        this.archiveAttr_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.badge_ = getDefaultInstance().getBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeInfo() {
        this.badgeInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeType() {
        this.badgeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBmid() {
        this.bmid_ = getDefaultInstance().getBmid();
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
    public void clearDialogType() {
        this.dialogType_ = getDefaultInstance().getDialogType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimension() {
        this.dimension_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpId() {
        this.epId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpIndex() {
        this.epIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteraction() {
        this.interaction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSubView() {
        this.isSubView_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsViewHide() {
        this.isViewHide_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpLink() {
        this.jumpLink_ = getDefaultInstance().getJumpLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkType() {
        this.linkType_ = getDefaultInstance().getLinkType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongTitle() {
        this.longTitle_ = getDefaultInstance().getLongTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMovieTitle() {
        this.movieTitle_ = getDefaultInstance().getMovieTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultiViewEps() {
        this.multiViewEps_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPubTime() {
        this.pubTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPv() {
        this.pv_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReleaseDate() {
        this.releaseDate_ = getDefaultInstance().getReleaseDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRights() {
        this.rights_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSectionIndex() {
        this.sectionIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareCopy() {
        this.shareCopy_ = getDefaultInstance().getShareCopy();
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
    public void clearStatForUnity() {
        this.statForUnity_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastTitle() {
        this.toastTitle_ = getDefaultInstance().getToastTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastType() {
        this.toastType_ = getDefaultInstance().getToastType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpInfo() {
        this.upInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpInfos() {
        this.upInfos_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVid() {
        this.vid_ = getDefaultInstance().getVid();
    }

    private void ensureMultiViewEpsIsMutable() {
        Internal.ProtobufList<MultiViewEp> protobufList = this.multiViewEps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.multiViewEps_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureUpInfosIsMutable() {
        Internal.ProtobufList<Staff> protobufList = this.upInfos_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.upInfos_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ViewEpisode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableReportMap() {
        return internalGetMutableReport();
    }

    private MapFieldLite<String, String> internalGetMutableReport() {
        if (!this.report_.isMutable()) {
            this.report_ = this.report_.mutableCopy();
        }
        return this.report_;
    }

    private MapFieldLite<String, String> internalGetReport() {
        return this.report_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.badgeInfo_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.badgeInfo_ = BadgeInfo.newBuilder(this.badgeInfo_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.badgeInfo_ = badgeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDimension(Dimension dimension) {
        dimension.getClass();
        Dimension dimension2 = this.dimension_;
        if (dimension2 != null && dimension2 != Dimension.getDefaultInstance()) {
            this.dimension_ = Dimension.newBuilder(this.dimension_).mergeFrom((Dimension) dimension).buildPartial();
        } else {
            this.dimension_ = dimension;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInteraction(Interaction interaction) {
        interaction.getClass();
        Interaction interaction2 = this.interaction_;
        if (interaction2 != null && interaction2 != Interaction.getDefaultInstance()) {
            this.interaction_ = Interaction.newBuilder(this.interaction_).mergeFrom((Interaction) interaction).buildPartial();
        } else {
            this.interaction_ = interaction;
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
    public void mergeStatForUnity(Stat stat) {
        stat.getClass();
        Stat stat2 = this.statForUnity_;
        if (stat2 != null && stat2 != Stat.getDefaultInstance()) {
            this.statForUnity_ = Stat.newBuilder(this.statForUnity_).mergeFrom((Stat) stat).buildPartial();
        } else {
            this.statForUnity_ = stat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpInfo(Staff staff) {
        staff.getClass();
        Staff staff2 = this.upInfo_;
        if (staff2 != null && staff2 != Staff.getDefaultInstance()) {
            this.upInfo_ = Staff.newBuilder(this.upInfo_).mergeFrom((Staff) staff).buildPartial();
        } else {
            this.upInfo_ = staff;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewEpisode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewEpisode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewEpisode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewEpisode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMultiViewEps(int i) {
        ensureMultiViewEpsIsMutable();
        this.multiViewEps_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpInfos(int i) {
        ensureUpInfosIsMutable();
        this.upInfos_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchiveAttr(int i) {
        this.archiveAttr_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(String str) {
        str.getClass();
        this.badge_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badge_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badgeInfo_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeType(int i) {
        this.badgeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBmid(String str) {
        str.getClass();
        this.bmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bmid_ = byteString.toStringUtf8();
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
    public void setDialogType(String str) {
        str.getClass();
        this.dialogType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDialogTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dialogType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpId(long j) {
        this.epId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpIndex(int i) {
        this.epIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteraction(Interaction interaction) {
        interaction.getClass();
        this.interaction_ = interaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSubView(boolean z) {
        this.isSubView_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsViewHide(boolean z) {
        this.isViewHide_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpLink(String str) {
        str.getClass();
        this.jumpLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpLink_ = byteString.toStringUtf8();
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
    public void setLongTitle(String str) {
        str.getClass();
        this.longTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.longTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMovieTitle(String str) {
        str.getClass();
        this.movieTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMovieTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.movieTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultiViewEps(int i, MultiViewEp multiViewEp) {
        multiViewEp.getClass();
        ensureMultiViewEpsIsMutable();
        this.multiViewEps_.set(i, multiViewEp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubTime(long j) {
        this.pubTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPv(int i) {
        this.pv_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseDate(String str) {
        str.getClass();
        this.releaseDate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseDateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.releaseDate_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRights(Rights rights) {
        rights.getClass();
        this.rights_ = rights;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSectionIndex(int i) {
        this.sectionIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCopy(String str) {
        str.getClass();
        this.shareCopy_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCopyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareCopy_ = byteString.toStringUtf8();
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
    public void setStatForUnity(Stat stat) {
        stat.getClass();
        this.statForUnity_ = stat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
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
    public void setToastTitle(String str) {
        str.getClass();
        this.toastTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toastTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastType(String str) {
        str.getClass();
        this.toastType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toastType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpInfo(Staff staff) {
        staff.getClass();
        this.upInfo_ = staff;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpInfos(int i, Staff staff) {
        staff.getClass();
        ensureUpInfosIsMutable();
        this.upInfos_.set(i, staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVid(String str) {
        str.getClass();
        this.vid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vid_ = byteString.toStringUtf8();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70821.f17059xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewEpisode();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000*\u0000\u0000\u0001**\u0001\u0002\u0000\u0001\u0002\u0002\u0208\u0003\u0004\u0004\t\u0005\u0004\u0006\u0004\u0007\u0208\b\u0002\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0208\u000e\u0002\u000f\u0208\u0010\u0208\u0011\u0208\u0012\u0208\u0013\u0208\u0014\u0208\u0015\t\u0016\t\u0017\t\u0018\u0208\u0019\u0004\u001a\u0208\u001b\u0208\u001c\u0208\u001d\u0002\u001e\u0004\u001f\u0004 \u0004!\u001b\"\t#\u0208$\u0208%\u001b&\u0007'\u0007(\u0208)\t*2", new Object[]{"epId_", "badge_", "badgeType_", "badgeInfo_", "duration_", "status_", "cover_", "aid_", "title_", "movieTitle_", "subtitle_", "longTitle_", "toastTitle_", "cid_", "from_", "shareUrl_", "shareCopy_", "shortLink_", "vid_", "releaseDate_", "dimension_", "rights_", "interaction_", "bvid_", "archiveAttr_", "link_", "linkType_", "bmid_", "pubTime_", "pv_", "epIndex_", "sectionIndex_", "upInfos_", Staff.class, "upInfo_", "dialogType_", "toastType_", "multiViewEps_", MultiViewEp.class, "isSubView_", "isViewHide_", "jumpLink_", "statForUnity_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewEpisode> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewEpisode.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getArchiveAttr() {
        return this.archiveAttr_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getBadge() {
        return this.badge_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getBadgeBytes() {
        return ByteString.copyFromUtf8(this.badge_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public BadgeInfo getBadgeInfo() {
        BadgeInfo badgeInfo = this.badgeInfo_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getBadgeType() {
        return this.badgeType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getBmid() {
        return this.bmid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getBmidBytes() {
        return ByteString.copyFromUtf8(this.bmid_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getBvid() {
        return this.bvid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getDialogType() {
        return this.dialogType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getDialogTypeBytes() {
        return ByteString.copyFromUtf8(this.dialogType_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public long getEpId() {
        return this.epId_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getEpIndex() {
        return this.epIndex_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getFrom() {
        return this.from_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public Interaction getInteraction() {
        Interaction interaction = this.interaction_;
        return interaction == null ? Interaction.getDefaultInstance() : interaction;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean getIsSubView() {
        return this.isSubView_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean getIsViewHide() {
        return this.isViewHide_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getJumpLink() {
        return this.jumpLink_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getJumpLinkBytes() {
        return ByteString.copyFromUtf8(this.jumpLink_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getLinkType() {
        return this.linkType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getLinkTypeBytes() {
        return ByteString.copyFromUtf8(this.linkType_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getLongTitle() {
        return this.longTitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getLongTitleBytes() {
        return ByteString.copyFromUtf8(this.longTitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getMovieTitle() {
        return this.movieTitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getMovieTitleBytes() {
        return ByteString.copyFromUtf8(this.movieTitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public MultiViewEp getMultiViewEps(int i) {
        return this.multiViewEps_.get(i);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getMultiViewEpsCount() {
        return this.multiViewEps_.size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public List<MultiViewEp> getMultiViewEpsList() {
        return this.multiViewEps_;
    }

    public MultiViewEpOrBuilder getMultiViewEpsOrBuilder(int i) {
        return this.multiViewEps_.get(i);
    }

    public List<? extends MultiViewEpOrBuilder> getMultiViewEpsOrBuilderList() {
        return this.multiViewEps_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public long getPubTime() {
        return this.pubTime_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getPv() {
        return this.pv_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getReleaseDate() {
        return this.releaseDate_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getReleaseDateBytes() {
        return ByteString.copyFromUtf8(this.releaseDate_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    @Deprecated
    public Map<String, String> getReport() {
        return getReportMap();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getReportCount() {
        return internalGetReport().size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public Map<String, String> getReportMap() {
        return Collections.unmodifiableMap(internalGetReport());
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getReportOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        return internalGetReport.containsKey(str) ? internalGetReport.get(str) : str2;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getReportOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        if (internalGetReport.containsKey(str)) {
            return internalGetReport.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public Rights getRights() {
        Rights rights = this.rights_;
        return rights == null ? Rights.getDefaultInstance() : rights;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getSectionIndex() {
        return this.sectionIndex_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getShareCopy() {
        return this.shareCopy_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getShareCopyBytes() {
        return ByteString.copyFromUtf8(this.shareCopy_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getShareUrl() {
        return this.shareUrl_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getShareUrlBytes() {
        return ByteString.copyFromUtf8(this.shareUrl_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getShortLink() {
        return this.shortLink_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getShortLinkBytes() {
        return ByteString.copyFromUtf8(this.shortLink_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public Stat getStatForUnity() {
        Stat stat = this.statForUnity_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getToastTitle() {
        return this.toastTitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getToastTitleBytes() {
        return ByteString.copyFromUtf8(this.toastTitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getToastType() {
        return this.toastType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getToastTypeBytes() {
        return ByteString.copyFromUtf8(this.toastType_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public Staff getUpInfo() {
        Staff staff = this.upInfo_;
        return staff == null ? Staff.getDefaultInstance() : staff;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public Staff getUpInfos(int i) {
        return this.upInfos_.get(i);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public int getUpInfosCount() {
        return this.upInfos_.size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public List<Staff> getUpInfosList() {
        return this.upInfos_;
    }

    public StaffOrBuilder getUpInfosOrBuilder(int i) {
        return this.upInfos_.get(i);
    }

    public List<? extends StaffOrBuilder> getUpInfosOrBuilderList() {
        return this.upInfos_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public String getVid() {
        return this.vid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public ByteString getVidBytes() {
        return ByteString.copyFromUtf8(this.vid_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean hasInteraction() {
        return this.interaction_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean hasRights() {
        return this.rights_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean hasStatForUnity() {
        return this.statForUnity_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder
    public boolean hasUpInfo() {
        return this.upInfo_ != null;
    }

    public static Builder newBuilder(ViewEpisode viewEpisode) {
        return DEFAULT_INSTANCE.createBuilder(viewEpisode);
    }

    public static ViewEpisode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewEpisode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewEpisode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewEpisode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMultiViewEps(int i, MultiViewEp multiViewEp) {
        multiViewEp.getClass();
        ensureMultiViewEpsIsMutable();
        this.multiViewEps_.add(i, multiViewEp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpInfos(int i, Staff staff) {
        staff.getClass();
        ensureUpInfosIsMutable();
        this.upInfos_.add(i, staff);
    }

    public static ViewEpisode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewEpisode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewEpisode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewEpisode parseFrom(InputStream inputStream) throws IOException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewEpisode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewEpisode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewEpisode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
