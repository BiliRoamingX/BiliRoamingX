package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface o1 extends MessageLiteOrBuilder {
    boolean containsHistoryReport(String str);

    String getBusinessId();

    ByteString getBusinessIdBytes();

    String getCardUrl();

    ByteString getCardUrlBytes();

    @Deprecated
    Description getDesc(int i2);

    @Deprecated
    int getDescCount();

    @Deprecated
    List<Description> getDescList();

    TextParagraph getDescTextOpus();

    String getDynIdStr();

    ByteString getDynIdStrBytes();

    long getDynType();

    DynFeatureGate getFeatureGate();

    @Deprecated
    Map<String, String> getHistoryReport();

    int getHistoryReportCount();

    Map<String, String> getHistoryReportMap();

    String getHistoryReportOrDefault(String str, String str2);

    String getHistoryReportOrThrow(String str);

    boolean getIsFastShare();

    boolean getIsInAudit();

    boolean getIsPreviewOnly();

    OnlyFansProperty getOnlyFansProperty();

    ModuleOpusSummary getOpusSummary();

    Description getOrigDesc(int i2);

    int getOrigDescCount();

    List<Description> getOrigDescList();

    String getOrigDynIdStr();

    ByteString getOrigDynIdStrBytes();

    DynamicType getOrigDynType();

    int getOrigDynTypeValue();

    String getOrigFace();

    ByteString getOrigFaceBytes();

    String getOrigImgUrl();

    ByteString getOrigImgUrlBytes();

    String getOrigName();

    ByteString getOrigNameBytes();

    int getRType();

    ExtendReply getReply();

    String getReportMetricData();

    ByteString getReportMetricDataBytes();

    RepostExtraInfo getRepostExtraInfo();

    String getShareScene();

    ByteString getShareSceneBytes();

    String getShareType();

    ByteString getShareTypeBytes();

    Any getSourceContent();

    String getTrackId();

    ByteString getTrackIdBytes();

    long getUid();

    boolean hasDescTextOpus();

    boolean hasFeatureGate();

    boolean hasOnlyFansProperty();

    boolean hasOpusSummary();

    boolean hasReply();

    boolean hasRepostExtraInfo();

    boolean hasSourceContent();
}
