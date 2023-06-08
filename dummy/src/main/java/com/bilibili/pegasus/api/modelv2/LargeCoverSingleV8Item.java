package com.bilibili.pegasus.api.modelv2;

import android.util.SparseArray;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

public class LargeCoverSingleV8Item extends BasePlayerItem {
    @Nullable
    @JSONField(name = "badge_style")
    public Tag commonTag;
    @JSONField(name = "cover_left_icon_1")
    public int coverLeftIcon1;
    @JSONField(name = "cover_left_icon_2")
    public int coverLeftIcon2;
    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;
    @Nullable
    @JSONField(name = "cover_left_text_2")
    public String coverLeftText2;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "ff_cover")
    public String ffCover;
    @JSONField(name = "official_icon")
    public int officialIcon;
    @JSONField(name = "official_icon_v2")
    public int officialIconV2;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReasonStyle;
    @JSONField(name = "is_atten")
    public boolean isAtten = false;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    private SparseArray<Long> followMids = null;
}
