package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Nullable;

public class Config {
    public int autoPlayCard;
    public int autoRefreshByBehavior;
    public long autoRefreshTimeByActive;
    public long autoRefreshTimeByAppear;
    public int autoRefreshTimeByBehavior;
    @Nullable
    public String bottomText;
    @Nullable
    public String bottomTextCover;
    @Nullable
    public String bottomTextUrl;
    public int cardDensityExp;
    public int column;
    public boolean enableRcmdGuide;
    public int feedTopClean;
    public int historyCacheSize;
    public int inlineSound;
    public int inlineSoundExp;
    public int interGuidance;
    @Nullable
    public String itemName;
    public boolean needResetAutoPlay;
    public boolean needResetColumn;
    public int needShowStoryModeGuide;
    public int noPreload;
    @Nullable
    public String sceneUri;
    public int showStoryModeGuideExpV2;
    public float smallCoverWhRatio;
    public int spaceEnlargeExp;
    public int topRefreshLatestExp;
    public int triggerLoadMoreLeftLineNum;
    public int videoMode;
    public int visibleArea;

    // only exist on android_hd
    public int auto_refresh_time;
}
