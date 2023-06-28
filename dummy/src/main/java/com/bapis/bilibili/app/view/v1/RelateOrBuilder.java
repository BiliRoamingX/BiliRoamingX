package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Author;
import com.bapis.bilibili.app.archive.v1.Dimension;
import com.bapis.bilibili.app.archive.v1.Stat;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface RelateOrBuilder extends MessageLiteOrBuilder {
    long getAid();

    Author getAuthor();

    String getBadge();

    ByteString getBadgeBytes();

    ReasonStyle getBadgeStyle();

    Button getButton();

    long getCid();

    CM getCm();

    String getCover();

    ByteString getCoverBytes();

    String getCoverGif();

    ByteString getCoverGifBytes();

    String getDesc();

    ByteString getDescBytes();

    Dimension getDimension();

    String getDislikeReportData();

    ByteString getDislikeReportDataBytes();

    long getDuration();

    String getFirstFrame();

    ByteString getFirstFrameBytes();

    String getFrom();

    ByteString getFromBytes();

    String getFromSourceId();

    ByteString getFromSourceIdBytes();

    long getFromSourceType();

    String getGameRecommendReason();

    ByteString getGameRecommendReasonBytes();

    String getGoto();

    ByteString getGotoBytes();

    String getJumpUrl();

    ByteString getJumpUrlBytes();

    LiveInfo getLiveInfo();

    long getMaterialId();

    int getNewCard();

    Notice getNotice();

    PackInfo getPackInfo();

    String getParam();

    ByteString getParamBytes();

    String getPic();

    ByteString getPicBytes();

    PowerIconStyle getPowerIconStyle();

    RankInfo getRankInfoGame();

    double getRating();

    int getRatingCount();

    String getRcmdReason();

    ByteString getRcmdReasonBytes();

    String getRcmdReasonExtra();

    ByteString getRcmdReasonExtraBytes();

    ReasonStyle getRcmdReasonStyle();

    RecThreePoint getRecThreePoint();

    String getReserve();

    ByteString getReserveBytes();

    long getReserveStatus();

    String getReserveStatusText();

    ByteString getReserveStatusTextBytes();

    int getSeasonType();

    Stat getStat();

    ArchiveStat getStatV2();

    String getTagName();

    ByteString getTagNameBytes();

    String getTitle();

    ByteString getTitleBytes();

    String getTrackid();

    ByteString getTrackidBytes();

    String getUniqueId();

    ByteString getUniqueIdBytes();

    String getUri();

    ByteString getUriBytes();

    WikiInfo getWikiInfoGame();

    boolean hasAuthor();

    boolean hasBadgeStyle();

    boolean hasButton();

    boolean hasCm();

    boolean hasDimension();

    boolean hasLiveInfo();

    boolean hasNotice();

    boolean hasPackInfo();

    boolean hasPowerIconStyle();

    boolean hasRankInfoGame();

    boolean hasRcmdReasonStyle();

    boolean hasRecThreePoint();

    boolean hasStat();

    boolean hasStatV2();

    boolean hasWikiInfoGame();
}
