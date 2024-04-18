package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface LiveAnimeConfigOrBuilder extends MessageLiteOrBuilder {
    BorderConfig getBorderConfig(int i);

    int getBorderConfigCount();

    List<BorderConfig> getBorderConfigList();

    LiveTextConfig getConfig();

    boolean getIsLive();

    LiveAnimeItem getItems(int i);

    int getItemsCount();

    List<LiveAnimeItem> getItemsList();

    boolean hasConfig();
}
