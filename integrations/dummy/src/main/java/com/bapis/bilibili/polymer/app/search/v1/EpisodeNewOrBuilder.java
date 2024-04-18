package com.bapis.bilibili.polymer.app.search.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes15.dex */
public interface EpisodeNewOrBuilder extends MessageLiteOrBuilder {
    ReasonStyle getBadges(int i);

    int getBadgesCount();

    List<ReasonStyle> getBadgesList();

    String getCover();

    ByteString getCoverBytes();

    int getIsNew();

    String getLabel();

    ByteString getLabelBytes();

    String getParam();

    ByteString getParamBytes();

    int getPosition();

    String getTitle();

    ByteString getTitleBytes();

    int getType();

    String getUri();

    ByteString getUriBytes();
}
