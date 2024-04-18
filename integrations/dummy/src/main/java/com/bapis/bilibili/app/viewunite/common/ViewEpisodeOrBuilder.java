package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface ViewEpisodeOrBuilder extends MessageLiteOrBuilder {
    boolean containsReport(String str);

    long getAid();

    int getArchiveAttr();

    String getBadge();

    ByteString getBadgeBytes();

    BadgeInfo getBadgeInfo();

    int getBadgeType();

    String getBmid();

    ByteString getBmidBytes();

    String getBvid();

    ByteString getBvidBytes();

    long getCid();

    String getCover();

    ByteString getCoverBytes();

    String getDialogType();

    ByteString getDialogTypeBytes();

    Dimension getDimension();

    int getDuration();

    long getEpId();

    int getEpIndex();

    String getFrom();

    ByteString getFromBytes();

    Interaction getInteraction();

    boolean getIsSubView();

    boolean getIsViewHide();

    String getJumpLink();

    ByteString getJumpLinkBytes();

    String getLink();

    ByteString getLinkBytes();

    String getLinkType();

    ByteString getLinkTypeBytes();

    String getLongTitle();

    ByteString getLongTitleBytes();

    String getMovieTitle();

    ByteString getMovieTitleBytes();

    MultiViewEp getMultiViewEps(int i);

    int getMultiViewEpsCount();

    List<MultiViewEp> getMultiViewEpsList();

    long getPubTime();

    int getPv();

    String getReleaseDate();

    ByteString getReleaseDateBytes();

    @Deprecated
    Map<String, String> getReport();

    int getReportCount();

    Map<String, String> getReportMap();

    String getReportOrDefault(String str, String str2);

    String getReportOrThrow(String str);

    Rights getRights();

    int getSectionIndex();

    String getShareCopy();

    ByteString getShareCopyBytes();

    String getShareUrl();

    ByteString getShareUrlBytes();

    String getShortLink();

    ByteString getShortLinkBytes();

    Stat getStatForUnity();

    int getStatus();

    String getSubtitle();

    ByteString getSubtitleBytes();

    String getTitle();

    ByteString getTitleBytes();

    String getToastTitle();

    ByteString getToastTitleBytes();

    String getToastType();

    ByteString getToastTypeBytes();

    Staff getUpInfo();

    Staff getUpInfos(int i);

    int getUpInfosCount();

    List<Staff> getUpInfosList();

    String getVid();

    ByteString getVidBytes();

    boolean hasBadgeInfo();

    boolean hasDimension();

    boolean hasInteraction();

    boolean hasRights();

    boolean hasStatForUnity();

    boolean hasUpInfo();
}
