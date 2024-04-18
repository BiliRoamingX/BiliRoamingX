package com.bilibili.pegasus.api.modelv2;

import android.util.SparseArray;

import androidx.annotation.Nullable;

public class SmallCoverV9Item extends BasePlayerItem {
    @Nullable
    public Tag badgeStyle;
    @Nullable
    public String coverGif;
    public int coverLeftIcon1;
    public int coverLeftIcon2;
    @Nullable
    public String coverLeftText1;
    @Nullable
    public String coverLeftText2;
    @Nullable
    public String coverRightText;
    @Nullable
    public String coverRightTextContentDesc;
    @Nullable
    public String desc;
    @Nullable
    public Tag lbRcmdReason;
    @Nullable
    public Tag offBadgeStyle;
    public int officialIconV2;
    @Nullable
    public Tag rcmdReason;
    @Nullable
    public String talkBack;
    @Nullable
    public Up up;
    public boolean isAtten = false;
    @Nullable
    private SparseArray<Long> followMids = null;
    public int liveAvatarStyle = 0;
    public boolean isLive = true;
}
