package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface UgcSectionOrBuilder extends MessageLiteOrBuilder {
    UgcEpisode getEpisodes(int i);

    int getEpisodesCount();

    List<UgcEpisode> getEpisodesList();

    long getId();

    String getTitle();

    ByteString getTitleBytes();

    long getType();
}
