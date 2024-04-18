package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.model.BasicIndexItem;

public class SmallCoverV10Item extends BasicIndexItem {
    @Nullable
    @JSONField(name = "badge_style")
    public Tag badgeStyle;
    @Nullable
    @JSONField(name = "cover_gif")
    public String coverGif;
    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;
    @Nullable
    @JSONField(name = "cover_left_1_content_description")
    public String coverLeftText1ContentDesc;
    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;
    @Nullable
    @JSONField(name = "cover_right_content_description")
    public String coverRightTextContentDesc;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReason;
    @Nullable
    @JSONField(name = "sub_title")
    public String subTitle;
}
