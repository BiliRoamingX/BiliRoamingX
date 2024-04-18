package com.bilibili.pegasus.api.model;

import android.text.TextUtils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.modelv2.channel.ChannelSortItem;

import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public class ChannelTabV2 {
    public static final int MAX_TAB_TITLE_LENGTH = 4;
    public static final String PAGE_ID_ALL = "all";
    public static final String PAGE_ID_BAIKE = "baike";
    public static final String PAGE_ID_FEED_SMALL = "feed_small";
    public static final String PAGE_ID_OPERATION = "op";
    public static final String PAGE_ID_SELECT = "select";
    public static final String PAGE_ID_TOPIC = "topic";
    @Nullable
    @JSONField(name = "title")
    public String name;
    @Nullable
    @JSONField(name = "sort")
    public List<ChannelSortItem> sortItems;
    @Nullable
    @JSONField(name = "id")
    public String tabId;
    @Nullable
    @JSONField(name = "uri")
    public String uri;

    public ChannelTabV2() {
    }

    public long getId() {
        if (this.tabId == null) {
            return 0L;
        }
        return tabId.hashCode();
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.uri) && !TextUtils.isEmpty(this.name) && !TextUtils.isEmpty(this.tabId);
    }

    public ChannelTabV2(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.uri = str;
        this.name = str2;
        this.tabId = str3;
    }
}
