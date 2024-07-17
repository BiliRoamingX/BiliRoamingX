package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.bilibili.pegasus.api.model.BasicIndexItem;

@Keep
public class BasePlayerItem extends BasicIndexItem {
    public int canPlay;
    public boolean disableDanmaku;
    @Nullable
    public String extraUri;
    public boolean hideDanmakuSwitch;
    public boolean isCoin;
    public boolean isFavorite;
    public transient boolean isPlayError;
    @Nullable
    public String talkBack;
}
