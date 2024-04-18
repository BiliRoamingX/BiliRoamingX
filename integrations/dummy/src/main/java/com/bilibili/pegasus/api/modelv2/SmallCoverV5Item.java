package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.model.BasicIndexItem;

public class SmallCoverV5Item extends BasicIndexItem {
    @Nullable
    @JSONField(name = "cover_gif")
    public String coverGif;
    @Nullable
    public Tag coverLeftTag;
    @Nullable
    public Tag coverRightTag;
    @Nullable
    @JSONField(name = "cover_right_text_1")
    public String coverRightText1;
    @Nullable
    @JSONField(name = "cover_right_text_content_description")
    public String coverRightTextCD;
    @Nullable
    @JSONField(name = "right_desc_1")
    public String rightDesc1;
    @Nullable
    @JSONField(name = "right_desc_1_content_description")
    public String rightDesc1CD;
    @Nullable
    @JSONField(name = "right_desc_2")
    public String rightDesc2;
    @JSONField(name = "right_icon_1")
    public int rightIcon1;
    @JSONField(name = "right_icon_2")
    public int rightIcon2;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag tag;
    @Nullable
    @JSONField(name = "up")
    public Up up;
}
