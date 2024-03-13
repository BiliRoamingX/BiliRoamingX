package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public class DescButton {
    @Nullable
    @JSONField(name = "event")
    public String event;
    @Nullable
    @JSONField(name = "event_v2")
    public String eventV2;
    public int isFollow;
    public int isFollowed;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "selected")
    public int selected;
    @Nullable
    @JSONField(name = "text")
    public String text;
    @JSONField(name = "type")
    public int type;
    @Nullable
    @JSONField(name = "uri")
    public String uri;

    public DescButton() {
    }

    public boolean isFollow() {
        return this.isFollow == 1;
    }

    public boolean isFollowed() {
        return this.isFollowed == 1;
    }

    public void updateFollowStatus(int i14, int i15) {
        this.isFollow = i14;
        this.isFollowed = i15;
    }
}
