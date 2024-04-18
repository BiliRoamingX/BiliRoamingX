package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface SectionOrBuilder extends MessageLiteOrBuilder {
    Episode getEpisodes(int i);

    int getEpisodesCount();

    List<Episode> getEpisodesList();

    long getId();

    String getTitle();

    ByteString getTitleBytes();

    long getType();
}
