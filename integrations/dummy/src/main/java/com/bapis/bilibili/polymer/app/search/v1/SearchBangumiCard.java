package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class SearchBangumiCard extends GeneratedMessageLite<SearchBangumiCard, SearchBangumiCard.Builder> implements MessageLiteOrBuilder {
    public static final int AREA_FIELD_NUMBER = 5;
    public static final int BADGES_FIELD_NUMBER = 24;
    public static final int BADGES_V2_FIELD_NUMBER = 32;
    public static final int CHECK_MORE_FIELD_NUMBER = 29;
    public static final int COVER_FIELD_NUMBER = 2;
    public static final int CV_FIELD_NUMBER = 8;
    private static final SearchBangumiCard DEFAULT_INSTANCE;
    public static final int EPISODES_FIELD_NUMBER = 16;
    public static final int EPISODES_NEW_FIELD_NUMBER = 26;
    public static final int FOLLOW_BUTTON_FIELD_NUMBER = 30;
    public static final int IS_ATTEN_FIELD_NUMBER = 18;
    public static final int IS_OUT_FIELD_NUMBER = 25;
    public static final int IS_SELECTION_FIELD_NUMBER = 17;
    public static final int LABEL_FIELD_NUMBER = 19;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
    public static final int OUT_ICON_FIELD_NUMBER = 22;
    public static final int OUT_NAME_FIELD_NUMBER = 21;
    public static final int OUT_URL_FIELD_NUMBER = 23;
    private static volatile Parser<SearchBangumiCard> PARSER = null;
    public static final int PLAY_STATE_FIELD_NUMBER = 4;
    public static final int PROMPT_FIELD_NUMBER = 13;
    public static final int PTIME_FIELD_NUMBER = 14;
    public static final int RATING_FIELD_NUMBER = 9;
    public static final int SEASON_ID_FIELD_NUMBER = 20;
    public static final int SEASON_TYPE_NAME_FIELD_NUMBER = 15;
    public static final int SELECTION_STYLE_FIELD_NUMBER = 28;
    public static final int STAFF_FIELD_NUMBER = 12;
    public static final int STYLES_FIELD_NUMBER = 7;
    public static final int STYLES_V2_FIELD_NUMBER = 33;
    public static final int STYLE_FIELD_NUMBER = 6;
    public static final int STYLE_LABEL_FIELD_NUMBER = 31;
    public static final int TARGET_FIELD_NUMBER = 11;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VOTE_FIELD_NUMBER = 10;
    public static final int WATCH_BUTTON_FIELD_NUMBER = 27;
    private CheckMore checkMore_;
    private FollowButton followButton_;
    private int isAtten_;
    private int isOut_;
    private int isSelection_;
    private int mediaType_;
    private int playState_;
    private long ptime_;
    private double rating_;
    private long seasonId_;
    private ReasonStyle styleLabel_;
    private int vote_;
    private WatchButton watchButton_;
    private String title_ = "";
    private String cover_ = "";
    private String area_ = "";
    private String style_ = "";
    private String styles_ = "";
    private String cv_ = "";
    private String target_ = "";
    private String staff_ = "";
    private String prompt_ = "";
    private String seasonTypeName_ = "";
    private Internal.ProtobufList<Episode> episodes_ = GeneratedMessageLite.emptyProtobufList();
    private String label_ = "";
    private String outName_ = "";
    private String outIcon_ = "";
    private String outUrl_ = "";
    private Internal.ProtobufList<ReasonStyle> badges_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<EpisodeNew> episodesNew_ = GeneratedMessageLite.emptyProtobufList();
    private String selectionStyle_ = "";
    private Internal.ProtobufList<ReasonStyle> badgesV2_ = GeneratedMessageLite.emptyProtobufList();
    private String stylesV2_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.SearchBangumiCard$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C80061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17708xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17708xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17708xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17708xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17708xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17708xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17708xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17708xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SearchBangumiCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C80061 c80061) {
            this();
        }

        public Builder addAllBadges(Iterable<? extends ReasonStyle> iterable) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addAllBadges(iterable);
            return this;
        }

        public Builder addAllBadgesV2(Iterable<? extends ReasonStyle> iterable) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addAllBadgesV2(iterable);
            return this;
        }

        public Builder addAllEpisodes(Iterable<? extends Episode> iterable) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addAllEpisodes(iterable);
            return this;
        }

        public Builder addAllEpisodesNew(Iterable<? extends EpisodeNew> iterable) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addAllEpisodesNew(iterable);
            return this;
        }

        public Builder addBadges(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadges(reasonStyle);
            return this;
        }

        public Builder addBadgesV2(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadgesV2(reasonStyle);
            return this;
        }

        public Builder addEpisodes(Episode episode) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodes(episode);
            return this;
        }

        public Builder addEpisodesNew(EpisodeNew episodeNew) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodesNew(episodeNew);
            return this;
        }

        public Builder clearArea() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearArea();
            return this;
        }

        public Builder clearBadges() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearBadges();
            return this;
        }

        public Builder clearBadgesV2() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearBadgesV2();
            return this;
        }

        public Builder clearCheckMore() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearCheckMore();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearCover();
            return this;
        }

        public Builder clearCv() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearCv();
            return this;
        }

        public Builder clearEpisodes() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearEpisodes();
            return this;
        }

        public Builder clearEpisodesNew() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearEpisodesNew();
            return this;
        }

        public Builder clearFollowButton() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearFollowButton();
            return this;
        }

        public Builder clearIsAtten() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearIsAtten();
            return this;
        }

        public Builder clearIsOut() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearIsOut();
            return this;
        }

        public Builder clearIsSelection() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearIsSelection();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearLabel();
            return this;
        }

        public Builder clearMediaType() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearMediaType();
            return this;
        }

        public Builder clearOutIcon() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearOutIcon();
            return this;
        }

        public Builder clearOutName() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearOutName();
            return this;
        }

        public Builder clearOutUrl() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearOutUrl();
            return this;
        }

        public Builder clearPlayState() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearPlayState();
            return this;
        }

        public Builder clearPrompt() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearPrompt();
            return this;
        }

        public Builder clearPtime() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearPtime();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearRating();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSeasonTypeName() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearSeasonTypeName();
            return this;
        }

        public Builder clearSelectionStyle() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearSelectionStyle();
            return this;
        }

        public Builder clearStaff() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearStaff();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearStyle();
            return this;
        }

        public Builder clearStyleLabel() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearStyleLabel();
            return this;
        }

        public Builder clearStyles() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearStyles();
            return this;
        }

        public Builder clearStylesV2() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearStylesV2();
            return this;
        }

        public Builder clearTarget() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearTarget();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearTitle();
            return this;
        }

        public Builder clearVote() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearVote();
            return this;
        }

        public Builder clearWatchButton() {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).clearWatchButton();
            return this;
        }

        public String getArea() {
            return ((SearchBangumiCard) this.instance).getArea();
        }

        public ByteString getAreaBytes() {
            return ((SearchBangumiCard) this.instance).getAreaBytes();
        }

        public ReasonStyle getBadges(int i) {
            return ((SearchBangumiCard) this.instance).getBadges(i);
        }

        public int getBadgesCount() {
            return ((SearchBangumiCard) this.instance).getBadgesCount();
        }

        public List<ReasonStyle> getBadgesList() {
            return Collections.unmodifiableList(((SearchBangumiCard) this.instance).getBadgesList());
        }

        public ReasonStyle getBadgesV2(int i) {
            return ((SearchBangumiCard) this.instance).getBadgesV2(i);
        }

        public int getBadgesV2Count() {
            return ((SearchBangumiCard) this.instance).getBadgesV2Count();
        }

        public List<ReasonStyle> getBadgesV2List() {
            return Collections.unmodifiableList(((SearchBangumiCard) this.instance).getBadgesV2List());
        }

        public CheckMore getCheckMore() {
            return ((SearchBangumiCard) this.instance).getCheckMore();
        }

        public String getCover() {
            return ((SearchBangumiCard) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((SearchBangumiCard) this.instance).getCoverBytes();
        }

        public String getCv() {
            return ((SearchBangumiCard) this.instance).getCv();
        }

        public ByteString getCvBytes() {
            return ((SearchBangumiCard) this.instance).getCvBytes();
        }

        public Episode getEpisodes(int i) {
            return ((SearchBangumiCard) this.instance).getEpisodes(i);
        }

        public int getEpisodesCount() {
            return ((SearchBangumiCard) this.instance).getEpisodesCount();
        }

        public List<Episode> getEpisodesList() {
            return Collections.unmodifiableList(((SearchBangumiCard) this.instance).getEpisodesList());
        }

        public EpisodeNew getEpisodesNew(int i) {
            return ((SearchBangumiCard) this.instance).getEpisodesNew(i);
        }

        public int getEpisodesNewCount() {
            return ((SearchBangumiCard) this.instance).getEpisodesNewCount();
        }

        public List<EpisodeNew> getEpisodesNewList() {
            return Collections.unmodifiableList(((SearchBangumiCard) this.instance).getEpisodesNewList());
        }

        public FollowButton getFollowButton() {
            return ((SearchBangumiCard) this.instance).getFollowButton();
        }

        public int getIsAtten() {
            return ((SearchBangumiCard) this.instance).getIsAtten();
        }

        public int getIsOut() {
            return ((SearchBangumiCard) this.instance).getIsOut();
        }

        public int getIsSelection() {
            return ((SearchBangumiCard) this.instance).getIsSelection();
        }

        public String getLabel() {
            return ((SearchBangumiCard) this.instance).getLabel();
        }

        public ByteString getLabelBytes() {
            return ((SearchBangumiCard) this.instance).getLabelBytes();
        }

        public int getMediaType() {
            return ((SearchBangumiCard) this.instance).getMediaType();
        }

        public String getOutIcon() {
            return ((SearchBangumiCard) this.instance).getOutIcon();
        }

        public ByteString getOutIconBytes() {
            return ((SearchBangumiCard) this.instance).getOutIconBytes();
        }

        public String getOutName() {
            return ((SearchBangumiCard) this.instance).getOutName();
        }

        public ByteString getOutNameBytes() {
            return ((SearchBangumiCard) this.instance).getOutNameBytes();
        }

        public String getOutUrl() {
            return ((SearchBangumiCard) this.instance).getOutUrl();
        }

        public ByteString getOutUrlBytes() {
            return ((SearchBangumiCard) this.instance).getOutUrlBytes();
        }

        public int getPlayState() {
            return ((SearchBangumiCard) this.instance).getPlayState();
        }

        public String getPrompt() {
            return ((SearchBangumiCard) this.instance).getPrompt();
        }

        public ByteString getPromptBytes() {
            return ((SearchBangumiCard) this.instance).getPromptBytes();
        }

        public long getPtime() {
            return ((SearchBangumiCard) this.instance).getPtime();
        }

        public double getRating() {
            return ((SearchBangumiCard) this.instance).getRating();
        }

        public long getSeasonId() {
            return ((SearchBangumiCard) this.instance).getSeasonId();
        }

        public String getSeasonTypeName() {
            return ((SearchBangumiCard) this.instance).getSeasonTypeName();
        }

        public ByteString getSeasonTypeNameBytes() {
            return ((SearchBangumiCard) this.instance).getSeasonTypeNameBytes();
        }

        public String getSelectionStyle() {
            return ((SearchBangumiCard) this.instance).getSelectionStyle();
        }

        public ByteString getSelectionStyleBytes() {
            return ((SearchBangumiCard) this.instance).getSelectionStyleBytes();
        }

        public String getStaff() {
            return ((SearchBangumiCard) this.instance).getStaff();
        }

        public ByteString getStaffBytes() {
            return ((SearchBangumiCard) this.instance).getStaffBytes();
        }

        public String getStyle() {
            return ((SearchBangumiCard) this.instance).getStyle();
        }

        public ByteString getStyleBytes() {
            return ((SearchBangumiCard) this.instance).getStyleBytes();
        }

        public ReasonStyle getStyleLabel() {
            return ((SearchBangumiCard) this.instance).getStyleLabel();
        }

        public String getStyles() {
            return ((SearchBangumiCard) this.instance).getStyles();
        }

        public ByteString getStylesBytes() {
            return ((SearchBangumiCard) this.instance).getStylesBytes();
        }

        public String getStylesV2() {
            return ((SearchBangumiCard) this.instance).getStylesV2();
        }

        public ByteString getStylesV2Bytes() {
            return ((SearchBangumiCard) this.instance).getStylesV2Bytes();
        }

        public String getTarget() {
            return ((SearchBangumiCard) this.instance).getTarget();
        }

        public ByteString getTargetBytes() {
            return ((SearchBangumiCard) this.instance).getTargetBytes();
        }

        public String getTitle() {
            return ((SearchBangumiCard) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((SearchBangumiCard) this.instance).getTitleBytes();
        }

        public int getVote() {
            return ((SearchBangumiCard) this.instance).getVote();
        }

        public WatchButton getWatchButton() {
            return ((SearchBangumiCard) this.instance).getWatchButton();
        }

        public boolean hasCheckMore() {
            return ((SearchBangumiCard) this.instance).hasCheckMore();
        }

        public boolean hasFollowButton() {
            return ((SearchBangumiCard) this.instance).hasFollowButton();
        }

        public boolean hasStyleLabel() {
            return ((SearchBangumiCard) this.instance).hasStyleLabel();
        }

        public boolean hasWatchButton() {
            return ((SearchBangumiCard) this.instance).hasWatchButton();
        }

        public Builder mergeCheckMore(CheckMore checkMore) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).mergeCheckMore(checkMore);
            return this;
        }

        public Builder mergeFollowButton(FollowButton followButton) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).mergeFollowButton(followButton);
            return this;
        }

        public Builder mergeStyleLabel(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).mergeStyleLabel(reasonStyle);
            return this;
        }

        public Builder mergeWatchButton(WatchButton watchButton) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).mergeWatchButton(watchButton);
            return this;
        }

        public Builder removeBadges(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).removeBadges(i);
            return this;
        }

        public Builder removeBadgesV2(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).removeBadgesV2(i);
            return this;
        }

        public Builder removeEpisodes(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).removeEpisodes(i);
            return this;
        }

        public Builder removeEpisodesNew(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).removeEpisodesNew(i);
            return this;
        }

        public Builder setArea(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setArea(str);
            return this;
        }

        public Builder setAreaBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setAreaBytes(byteString);
            return this;
        }

        public Builder setBadges(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setBadges(i, reasonStyle);
            return this;
        }

        public Builder setBadgesV2(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setBadgesV2(i, reasonStyle);
            return this;
        }

        public Builder setCheckMore(CheckMore checkMore) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setCheckMore(checkMore);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setCv(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setCv(str);
            return this;
        }

        public Builder setCvBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setCvBytes(byteString);
            return this;
        }

        public Builder setEpisodes(int i, Episode episode) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setEpisodes(i, episode);
            return this;
        }

        public Builder setEpisodesNew(int i, EpisodeNew episodeNew) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setEpisodesNew(i, episodeNew);
            return this;
        }

        public Builder setFollowButton(FollowButton followButton) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setFollowButton(followButton);
            return this;
        }

        public Builder setIsAtten(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setIsAtten(i);
            return this;
        }

        public Builder setIsOut(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setIsOut(i);
            return this;
        }

        public Builder setIsSelection(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setIsSelection(i);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setLabelBytes(byteString);
            return this;
        }

        public Builder setMediaType(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setMediaType(i);
            return this;
        }

        public Builder setOutIcon(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setOutIcon(str);
            return this;
        }

        public Builder setOutIconBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setOutIconBytes(byteString);
            return this;
        }

        public Builder setOutName(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setOutName(str);
            return this;
        }

        public Builder setOutNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setOutNameBytes(byteString);
            return this;
        }

        public Builder setOutUrl(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setOutUrl(str);
            return this;
        }

        public Builder setOutUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setOutUrlBytes(byteString);
            return this;
        }

        public Builder setPlayState(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setPlayState(i);
            return this;
        }

        public Builder setPrompt(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setPrompt(str);
            return this;
        }

        public Builder setPromptBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setPromptBytes(byteString);
            return this;
        }

        public Builder setPtime(long j) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setPtime(j);
            return this;
        }

        public Builder setRating(double d) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setRating(d);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setSeasonTypeName(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setSeasonTypeName(str);
            return this;
        }

        public Builder setSeasonTypeNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setSeasonTypeNameBytes(byteString);
            return this;
        }

        public Builder setSelectionStyle(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setSelectionStyle(str);
            return this;
        }

        public Builder setSelectionStyleBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setSelectionStyleBytes(byteString);
            return this;
        }

        public Builder setStaff(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStaff(str);
            return this;
        }

        public Builder setStaffBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStaffBytes(byteString);
            return this;
        }

        public Builder setStyle(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStyle(str);
            return this;
        }

        public Builder setStyleBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStyleBytes(byteString);
            return this;
        }

        public Builder setStyleLabel(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStyleLabel(reasonStyle);
            return this;
        }

        public Builder setStyles(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStyles(str);
            return this;
        }

        public Builder setStylesBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStylesBytes(byteString);
            return this;
        }

        public Builder setStylesV2(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStylesV2(str);
            return this;
        }

        public Builder setStylesV2Bytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStylesV2Bytes(byteString);
            return this;
        }

        public Builder setTarget(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setTarget(str);
            return this;
        }

        public Builder setTargetBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setTargetBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setVote(int i) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setVote(i);
            return this;
        }

        public Builder setWatchButton(WatchButton watchButton) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setWatchButton(watchButton);
            return this;
        }

        private Builder() {
            super(SearchBangumiCard.DEFAULT_INSTANCE);
        }

        public Builder addBadges(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadges(i, reasonStyle);
            return this;
        }

        public Builder addBadgesV2(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadgesV2(i, reasonStyle);
            return this;
        }

        public Builder addEpisodes(int i, Episode episode) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodes(i, episode);
            return this;
        }

        public Builder addEpisodesNew(int i, EpisodeNew episodeNew) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodesNew(i, episodeNew);
            return this;
        }

        public Builder setBadges(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setBadges(i, builder.build());
            return this;
        }

        public Builder setBadgesV2(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setBadgesV2(i, builder.build());
            return this;
        }

        public Builder setCheckMore(CheckMore.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setCheckMore(builder.build());
            return this;
        }

        public Builder setEpisodes(int i, Episode.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setEpisodes(i, builder.build());
            return this;
        }

        public Builder setEpisodesNew(int i, EpisodeNew.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setEpisodesNew(i, builder.build());
            return this;
        }

        public Builder setFollowButton(FollowButton.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setFollowButton(builder.build());
            return this;
        }

        public Builder setStyleLabel(ReasonStyle.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setStyleLabel(builder.build());
            return this;
        }

        public Builder setWatchButton(WatchButton.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).setWatchButton(builder.build());
            return this;
        }

        public Builder addBadges(ReasonStyle.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadges(builder.build());
            return this;
        }

        public Builder addBadgesV2(ReasonStyle.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadgesV2(builder.build());
            return this;
        }

        public Builder addEpisodes(Episode.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodes(builder.build());
            return this;
        }

        public Builder addEpisodesNew(EpisodeNew.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodesNew(builder.build());
            return this;
        }

        public Builder addBadges(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadges(i, builder.build());
            return this;
        }

        public Builder addBadgesV2(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addBadgesV2(i, builder.build());
            return this;
        }

        public Builder addEpisodes(int i, Episode.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodes(i, builder.build());
            return this;
        }

        public Builder addEpisodesNew(int i, EpisodeNew.Builder builder) {
            copyOnWrite();
            ((SearchBangumiCard) this.instance).addEpisodesNew(i, builder.build());
            return this;
        }
    }

    static {
        SearchBangumiCard searchBangumiCard = new SearchBangumiCard();
        DEFAULT_INSTANCE = searchBangumiCard;
        GeneratedMessageLite.registerDefaultInstance(SearchBangumiCard.class, searchBangumiCard);
    }

    public SearchBangumiCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBadges(Iterable<? extends ReasonStyle> iterable) {
        ensureBadgesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.badges_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBadgesV2(Iterable<? extends ReasonStyle> iterable) {
        ensureBadgesV2IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.badgesV2_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEpisodes(Iterable<? extends Episode> iterable) {
        ensureEpisodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.episodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEpisodesNew(Iterable<? extends EpisodeNew> iterable) {
        ensureEpisodesNewIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.episodesNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadges(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesIsMutable();
        this.badges_.add(reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadgesV2(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesV2IsMutable();
        this.badgesV2_.add(reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(Episode episode) {
        episode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(episode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodesNew(EpisodeNew episodeNew) {
        episodeNew.getClass();
        ensureEpisodesNewIsMutable();
        this.episodesNew_.add(episodeNew);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArea() {
        this.area_ = getDefaultInstance().getArea();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadges() {
        this.badges_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgesV2() {
        this.badgesV2_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckMore() {
        this.checkMore_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCv() {
        this.cv_ = getDefaultInstance().getCv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodes() {
        this.episodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodesNew() {
        this.episodesNew_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowButton() {
        this.followButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAtten() {
        this.isAtten_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOut() {
        this.isOut_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSelection() {
        this.isSelection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaType() {
        this.mediaType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutIcon() {
        this.outIcon_ = getDefaultInstance().getOutIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutName() {
        this.outName_ = getDefaultInstance().getOutName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutUrl() {
        this.outUrl_ = getDefaultInstance().getOutUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayState() {
        this.playState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.prompt_ = getDefaultInstance().getPrompt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPtime() {
        this.ptime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.rating_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonTypeName() {
        this.seasonTypeName_ = getDefaultInstance().getSeasonTypeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectionStyle() {
        this.selectionStyle_ = getDefaultInstance().getSelectionStyle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaff() {
        this.staff_ = getDefaultInstance().getStaff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = getDefaultInstance().getStyle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleLabel() {
        this.styleLabel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyles() {
        this.styles_ = getDefaultInstance().getStyles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStylesV2() {
        this.stylesV2_ = getDefaultInstance().getStylesV2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = getDefaultInstance().getTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVote() {
        this.vote_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchButton() {
        this.watchButton_ = null;
    }

    private void ensureBadgesIsMutable() {
        Internal.ProtobufList<ReasonStyle> protobufList = this.badges_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.badges_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureBadgesV2IsMutable() {
        Internal.ProtobufList<ReasonStyle> protobufList = this.badgesV2_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.badgesV2_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureEpisodesIsMutable() {
        Internal.ProtobufList<Episode> protobufList = this.episodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.episodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureEpisodesNewIsMutable() {
        Internal.ProtobufList<EpisodeNew> protobufList = this.episodesNew_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.episodesNew_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SearchBangumiCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCheckMore(CheckMore checkMore) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFollowButton(FollowButton followButton) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStyleLabel(ReasonStyle reasonStyle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchButton(WatchButton watchButton) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchBangumiCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchBangumiCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchBangumiCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchBangumiCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBadges(int i) {
        ensureBadgesIsMutable();
        this.badges_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBadgesV2(int i) {
        ensureBadgesV2IsMutable();
        this.badgesV2_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEpisodes(int i) {
        ensureEpisodesIsMutable();
        this.episodes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEpisodesNew(int i) {
        ensureEpisodesNewIsMutable();
        this.episodesNew_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArea(String str) {
        str.getClass();
        this.area_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.area_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadges(int i, ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesIsMutable();
        this.badges_.set(i, reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgesV2(int i, ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesV2IsMutable();
        this.badgesV2_.set(i, reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckMore(CheckMore checkMore) {
        checkMore.getClass();
        this.checkMore_ = checkMore;
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
    public void setCv(String str) {
        str.getClass();
        this.cv_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCvBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cv_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodes(int i, Episode episode) {
        episode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.set(i, episode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodesNew(int i, EpisodeNew episodeNew) {
        episodeNew.getClass();
        ensureEpisodesNewIsMutable();
        this.episodesNew_.set(i, episodeNew);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowButton(FollowButton followButton) {
        followButton.getClass();
        this.followButton_ = followButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAtten(int i) {
        this.isAtten_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOut(int i) {
        this.isOut_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSelection(int i) {
        this.isSelection_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaType(int i) {
        this.mediaType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutIcon(String str) {
        str.getClass();
        this.outIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.outIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutName(String str) {
        str.getClass();
        this.outName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.outName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutUrl(String str) {
        str.getClass();
        this.outUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.outUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayState(int i) {
        this.playState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrompt(String str) {
        str.getClass();
        this.prompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.prompt_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPtime(long j) {
        this.ptime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(double d) {
        this.rating_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonTypeName(String str) {
        str.getClass();
        this.seasonTypeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonTypeNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.seasonTypeName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionStyle(String str) {
        str.getClass();
        this.selectionStyle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionStyleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectionStyle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaff(String str) {
        str.getClass();
        this.staff_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaffBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.staff_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(String str) {
        str.getClass();
        this.style_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.style_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleLabel(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.styleLabel_ = reasonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyles(String str) {
        str.getClass();
        this.styles_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStylesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.styles_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStylesV2(String str) {
        str.getClass();
        this.stylesV2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStylesV2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.stylesV2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.target_ = byteString.toStringUtf8();
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
    public void setVote(int i) {
        this.vote_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchButton(WatchButton watchButton) {
        watchButton.getClass();
        this.watchButton_ = watchButton;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C80061.f17708xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchBangumiCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000!\u0000\u0000\u0001!!\u0000\u0004\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0000\n\u0004\u000b\u0208\f\u0208\r\u0208\u000e\u0002\u000f\u0208\u0010\u001b\u0011\u0004\u0012\u0004\u0013\u0208\u0014\u0002\u0015\u0208\u0016\u0208\u0017\u0208\u0018\u001b\u0019\u0004\u001a\u001b\u001b\t\u001c\u0208\u001d\t\u001e\t\u001f\t \u001b!\u0208", new Object[]{"title_", "cover_", "mediaType_", "playState_", "area_", "style_", "styles_", "cv_", "rating_", "vote_", "target_", "staff_", "prompt_", "ptime_", "seasonTypeName_", "episodes_", Episode.class, "isSelection_", "isAtten_", "label_", "seasonId_", "outName_", "outIcon_", "outUrl_", "badges_", ReasonStyle.class, "isOut_", "episodesNew_", EpisodeNew.class, "watchButton_", "selectionStyle_", "checkMore_", "followButton_", "styleLabel_", "badgesV2_", ReasonStyle.class, "stylesV2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchBangumiCard> parser = PARSER;
                if (parser == null) {
                    synchronized (SearchBangumiCard.class) {
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

    public String getArea() {
        return this.area_;
    }

    public ByteString getAreaBytes() {
        return ByteString.copyFromUtf8(this.area_);
    }

    public ReasonStyle getBadges(int i) {
        return this.badges_.get(i);
    }

    public int getBadgesCount() {
        return this.badges_.size();
    }

    public List<ReasonStyle> getBadgesList() {
        return this.badges_;
    }

    public ReasonStyleOrBuilder getBadgesOrBuilder(int i) {
        return this.badges_.get(i);
    }

    public List<? extends ReasonStyleOrBuilder> getBadgesOrBuilderList() {
        return this.badges_;
    }

    public ReasonStyle getBadgesV2(int i) {
        return this.badgesV2_.get(i);
    }

    public int getBadgesV2Count() {
        return this.badgesV2_.size();
    }

    public List<ReasonStyle> getBadgesV2List() {
        return this.badgesV2_;
    }

    public ReasonStyleOrBuilder getBadgesV2OrBuilder(int i) {
        return this.badgesV2_.get(i);
    }

    public List<? extends ReasonStyleOrBuilder> getBadgesV2OrBuilderList() {
        return this.badgesV2_;
    }

    public CheckMore getCheckMore() {
        CheckMore checkMore = this.checkMore_;
        return checkMore == null ? CheckMore.getDefaultInstance() : checkMore;
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getCv() {
        return this.cv_;
    }

    public ByteString getCvBytes() {
        return ByteString.copyFromUtf8(this.cv_);
    }

    public Episode getEpisodes(int i) {
        return this.episodes_.get(i);
    }

    public int getEpisodesCount() {
        return this.episodes_.size();
    }

    public List<Episode> getEpisodesList() {
        return this.episodes_;
    }

    public EpisodeNew getEpisodesNew(int i) {
        return this.episodesNew_.get(i);
    }

    public int getEpisodesNewCount() {
        return this.episodesNew_.size();
    }

    public List<EpisodeNew> getEpisodesNewList() {
        return this.episodesNew_;
    }

    public EpisodeNewOrBuilder getEpisodesNewOrBuilder(int i) {
        return this.episodesNew_.get(i);
    }

    public List<? extends EpisodeNewOrBuilder> getEpisodesNewOrBuilderList() {
        return this.episodesNew_;
    }

    public EpisodeOrBuilder getEpisodesOrBuilder(int i) {
        return this.episodes_.get(i);
    }

    public List<? extends EpisodeOrBuilder> getEpisodesOrBuilderList() {
        return this.episodes_;
    }

    public FollowButton getFollowButton() {
        FollowButton followButton = this.followButton_;
        return followButton == null ? FollowButton.getDefaultInstance() : followButton;
    }

    public int getIsAtten() {
        return this.isAtten_;
    }

    public int getIsOut() {
        return this.isOut_;
    }

    public int getIsSelection() {
        return this.isSelection_;
    }

    public String getLabel() {
        return this.label_;
    }

    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.label_);
    }

    public int getMediaType() {
        return this.mediaType_;
    }

    public String getOutIcon() {
        return this.outIcon_;
    }

    public ByteString getOutIconBytes() {
        return ByteString.copyFromUtf8(this.outIcon_);
    }

    public String getOutName() {
        return this.outName_;
    }

    public ByteString getOutNameBytes() {
        return ByteString.copyFromUtf8(this.outName_);
    }

    public String getOutUrl() {
        return this.outUrl_;
    }

    public ByteString getOutUrlBytes() {
        return ByteString.copyFromUtf8(this.outUrl_);
    }

    public int getPlayState() {
        return this.playState_;
    }

    public String getPrompt() {
        return this.prompt_;
    }

    public ByteString getPromptBytes() {
        return ByteString.copyFromUtf8(this.prompt_);
    }

    public long getPtime() {
        return this.ptime_;
    }

    public double getRating() {
        return this.rating_;
    }

    public long getSeasonId() {
        return this.seasonId_;
    }

    public String getSeasonTypeName() {
        return this.seasonTypeName_;
    }

    public ByteString getSeasonTypeNameBytes() {
        return ByteString.copyFromUtf8(this.seasonTypeName_);
    }

    public String getSelectionStyle() {
        return this.selectionStyle_;
    }

    public ByteString getSelectionStyleBytes() {
        return ByteString.copyFromUtf8(this.selectionStyle_);
    }

    public String getStaff() {
        return this.staff_;
    }

    public ByteString getStaffBytes() {
        return ByteString.copyFromUtf8(this.staff_);
    }

    public String getStyle() {
        return this.style_;
    }

    public ByteString getStyleBytes() {
        return ByteString.copyFromUtf8(this.style_);
    }

    public ReasonStyle getStyleLabel() {
        ReasonStyle reasonStyle = this.styleLabel_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    public String getStyles() {
        return this.styles_;
    }

    public ByteString getStylesBytes() {
        return ByteString.copyFromUtf8(this.styles_);
    }

    public String getStylesV2() {
        return this.stylesV2_;
    }

    public ByteString getStylesV2Bytes() {
        return ByteString.copyFromUtf8(this.stylesV2_);
    }

    public String getTarget() {
        return this.target_;
    }

    public ByteString getTargetBytes() {
        return ByteString.copyFromUtf8(this.target_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getVote() {
        return this.vote_;
    }

    public WatchButton getWatchButton() {
        WatchButton watchButton = this.watchButton_;
        return watchButton == null ? WatchButton.getDefaultInstance() : watchButton;
    }

    public boolean hasCheckMore() {
        return this.checkMore_ != null;
    }

    public boolean hasFollowButton() {
        return this.followButton_ != null;
    }

    public boolean hasStyleLabel() {
        return this.styleLabel_ != null;
    }

    public boolean hasWatchButton() {
        return this.watchButton_ != null;
    }

    public static Builder newBuilder(SearchBangumiCard searchBangumiCard) {
        return DEFAULT_INSTANCE.createBuilder(searchBangumiCard);
    }

    public static SearchBangumiCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchBangumiCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchBangumiCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchBangumiCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadges(int i, ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesIsMutable();
        this.badges_.add(i, reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadgesV2(int i, ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesV2IsMutable();
        this.badgesV2_.add(i, reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(int i, Episode episode) {
        episode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(i, episode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodesNew(int i, EpisodeNew episodeNew) {
        episodeNew.getClass();
        ensureEpisodesNewIsMutable();
        this.episodesNew_.add(i, episodeNew);
    }

    public static SearchBangumiCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchBangumiCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchBangumiCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchBangumiCard parseFrom(InputStream inputStream) throws IOException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchBangumiCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchBangumiCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchBangumiCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
