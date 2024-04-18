package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface CelebrityOrBuilder extends MessageLiteOrBuilder {
    boolean containsReport(String str);

    String getAvatar();

    ByteString getAvatarBytes();

    String getCharacterAvatar();

    ByteString getCharacterAvatarBytes();

    String getDesc();

    ByteString getDescBytes();

    int getId();

    int getIsFollow();

    String getLink();

    ByteString getLinkBytes();

    long getMid();

    String getName();

    ByteString getNameBytes();

    String getOccupationName();

    ByteString getOccupationNameBytes();

    OccupationType getOccupationType();

    int getOccupationTypeValue();

    int getRelateAttr();

    @Deprecated
    Map<String, String> getReport();

    int getReportCount();

    Map<String, String> getReportMap();

    String getReportOrDefault(String str, String str2);

    String getReportOrThrow(String str);

    String getRole();

    ByteString getRoleBytes();

    String getShortDesc();

    ByteString getShortDescBytes();

    String getSmallAvatar();

    ByteString getSmallAvatarBytes();
}
