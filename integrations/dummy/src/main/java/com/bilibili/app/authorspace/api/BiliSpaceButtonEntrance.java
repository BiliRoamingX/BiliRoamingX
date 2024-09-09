package com.bilibili.app.authorspace.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
@Keep
/* loaded from: classes27.dex */
public class BiliSpaceButtonEntrance {

    @Nullable
    @JSONField(name = "background_dark_color")
    public String backgroundDarkColor;

    @Nullable
    @JSONField(name = "background_light_color")
    public String backgroundLightColor;

    @Nullable
    @JSONField(name = "sub_title")
    public String description;

    @Nullable
    @JSONField(name = "sub_title_dark_color")
    public String descriptionDarkColor;

    @Nullable
    @JSONField(name = "sub_title_light_color")
    public String descriptionLightColor;

    @Nullable
    @JSONField(name = "icon")
    public String icon;

    @Nullable
    @JSONField(name = "module_type")
    public String moduleType;

    @Nullable
    @JSONField(name = "title")
    public String title;

    @Nullable
    @JSONField(name = "title_dark_color")
    public String titleDarkColor;

    @Nullable
    @JSONField(name = "title_light_color")
    public String titleLightColor;

    @Nullable
    @JSONField(name = "url")
    public String url;
}
