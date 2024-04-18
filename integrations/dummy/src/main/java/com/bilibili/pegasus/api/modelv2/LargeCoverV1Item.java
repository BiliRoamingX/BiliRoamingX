package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

public class LargeCoverV1Item extends BasePlayerItem {
    @Nullable
    @JSONField(name = "bottom_rcmd_reason_style")
    public Tag bottomRcmdReason;
    @Nullable
    @JSONField(name = "cover_badge_style")
    public Tag coverBadgeStyle;
    @Nullable
    @JSONField(name = "cover_badge_style_2")
    public Tag coverBadgeStyle2;
    @Nullable
    @JSONField(name = "cover_gif")
    public String coverGif;
    @Nullable
    @JSONField(name = "left_cover_badge_style")
    public Tag coverLeftBadge;
    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;
    @Nullable
    @JSONField(name = "cover_left_text_2")
    public String coverLeftText2;
    @Nullable
    @JSONField(name = "cover_left_text_3")
    public String coverLeftText3;
    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "title_single_line")
    public boolean isTitleSingleLine;
    @JSONField(name = "official_icon")
    public int officialIcon;
    @Nullable
    @JSONField(name = "rcmd_reason_style_v2")
    public Tag rcmdReasonV2;
    @Nullable
    @JSONField(name = "right_cover_badge_style")
    public Tag rightCoverBadge;
    @Nullable
    @JSONField(name = "top_rcmd_reason_style")
    public Tag topRcmdReason;
}
