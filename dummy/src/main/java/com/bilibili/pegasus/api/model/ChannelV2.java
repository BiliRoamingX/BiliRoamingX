package com.bilibili.pegasus.api.model;

import android.text.TextUtils;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.modelv2.DescButton;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public class ChannelV2 {
    @JSONField(name = "is_atten")
    public int attention;
    @Nullable
    @JSONField(name = "button")
    public DescButton button;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "default_tab_idx")
    public int defaultTabIndex;
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "activity")
    public int isActivity;
    @Nullable
    @JSONField(name = "label_1")
    public String label1;
    @Nullable
    @JSONField(name = "label_2")
    public String label2;
    @Nullable
    @JSONField(name = "label_3")
    public String label3;
    @Nullable
    @JSONField(name = "label_4")
    public String label4;
    @Nullable
    @JSONField(name = "title")
    public String name;
    @Nullable
    @JSONField(name = "theme_color_night")
    public String nightThemeColor;
    @Nullable
    @JSONField(name = "ogv_icon")
    public String ogvIconUrl;
    @Nullable
    @JSONField(name = "tags")
    public ArrayList<ChannelV2> relatedChannels;
    @Nullable
    @JSONField(name = "tabs")
    public List<ChannelTabV2> tabs;
    @Nullable
    @JSONField(name = "child")
    public List<BaseTagsData> tagsChildren;
    @Nullable
    @JSONField(name = "parent")
    public List<BaseTagsData> tagsParents;
    @Nullable
    @JSONField(name = "theme_color")
    public String themeColor;
    @Nullable
    @JSONField(name = "alpha")
    public int titleAlpha;
    @Nullable
    @JSONField(name = "uri")
    public String uri;

    public ChannelV2(long j14, @Nullable String str) {
        this.id = j14;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ChannelV2) && ((ChannelV2) obj).id == this.id;
    }

    public float getTitleAlpha() {
        int i14 = this.titleAlpha;
        if (i14 == 0) {
            return 0.6f;
        }
        return i14 * 0.01f;
    }

    public boolean isActivityChannel() {
        return this.isActivity == 1;
    }

    public boolean isValidChannel() {
        return !TextUtils.isEmpty(this.name) && !TextUtils.isEmpty(this.uri);
    }

    public ChannelV2() {
    }
}
