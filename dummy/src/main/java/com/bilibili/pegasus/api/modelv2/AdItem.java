package com.bilibili.pegasus.api.modelv2;

import android.util.SparseArray;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.app.comm.list.common.data.DislikeReason;

public class AdItem {
    @JSONField(name = "ad_dislike")
    public boolean adDislike;
    @Nullable
    @JSONField(name = "ad_dislike_reason")
    public DislikeReason adDislikeReason;
    @JSONField(name = "ad_dislike_time")
    public long adDislikeTimestamp;
    @Nullable
    @JSONField(name = "badge_style")
    public Tag commonTag;
    @Nullable
    @JSONField(name = "cover_badge_style")
    public Tag coverBadgeStyle;
    @Nullable
    @JSONField(name = "cover_gif")
    public String coverGif;
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
    @JSONField(name = "cover_left_text_3")
    public String coverLeftText3;
    @JSONField(name = "cover_right_icon")
    public int coverRightIcon;
    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;
    @Nullable
    @JSONField(name = "cover_right_text_1")
    public String coverRightText1;
    @Nullable
    @JSONField(name = "cover_right_text_content_description")
    public String coverRightTextCD;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "ff_cover")
    public String ffCover;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    private SparseArray<Long> followMids;
    @JSONField(name = "is_atten")
    public boolean isAtten;
    @JSONField(name = "is_hot")
    public boolean isHot;
    @Nullable
    @JSONField(name = "left_bottom_rcmd_reason_style")
    public Tag lbRcmdReason;
    @JSONField(name = "official_icon_v2")
    public int officialIconV2;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReasonStyle;
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
    @JSONField(name = "up")
    public Up upper;
}
