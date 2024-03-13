package com.bilibili.pegasus.api.modelv2.channel;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public class ChannelSortItem {
    public static final String SORT_HOT = "hot";
    public static final String SORT_NEW = "new";
    public static final String SORT_VIEW = "view";
    @Nullable
    @JSONField(name = "icon")
    public String icon;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "value")
    public String value;

    public ChannelSortItem() {
    }

    public ChannelSortItem(@Nullable String str, @Nullable String str2) {
        this.title = str;
        this.value = str2;
    }
}
