package com.bapis.bilibili.polymer.app.search.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes15.dex */
public interface EpisodeOrBuilder extends MessageLiteOrBuilder {
    ReasonStyle getBadges(int i);

    int getBadgesCount();

    List<ReasonStyle> getBadgesList();

    String getIndex();

    ByteString getIndexBytes();

    String getParam();

    ByteString getParamBytes();

    int getPosition();

    String getUri();

    ByteString getUriBytes();
}
