package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.model.BasicIndexItem;

public class SmallCoverItem extends BasicIndexItem {
    @Nullable
    @JSONField(name = "cover_badge_style")
    public Tag coverBadgeStyle;
    @Nullable
    @JSONField(name = "cover_left_text")
    public String coverLeftText1;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "desc_1")
    public String desc1;
    @Nullable
    @JSONField(name = "desc_2")
    public String desc2;
    @Nullable
    @JSONField(name = "desc_3")
    public String desc3;
    @JSONField(name = "destroy_card")
    public int destroyCard;
    @JSONField(name = "game_id")
    public long gameId;
    @JSONField(deserialize = false, serialize = false)
    public boolean hasReported = false;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReason;
    @Nullable
    @JSONField(name = "resource_type")
    public String resourceType;
    @JSONField(name = "title_right_pic")
    public int titleRightPic;
    @Nullable
    @JSONField(name = "title_right_text")
    public String titleRightText;
}
