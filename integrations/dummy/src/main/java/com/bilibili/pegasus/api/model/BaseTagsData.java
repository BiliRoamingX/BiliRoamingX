package com.bilibili.pegasus.api.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* loaded from: classes8.dex */
public class BaseTagsData {
    @JSONField(name = "is_atten")
    public int attention;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @Nullable
    @JSONField(name = "goto")
    public String gotoPlace;
    @JSONField(name = "id")
    public long id;
    @Nullable
    @JSONField(name = "label")
    public String label;
    @Nullable
    @JSONField(name = "name")
    public String name;
    @Nullable
    @JSONField(name = "param")
    public String param;
    public String title;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
}
