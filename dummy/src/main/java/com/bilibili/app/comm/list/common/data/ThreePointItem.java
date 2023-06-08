package com.bilibili.app.comm.list.common.data;

import androidx.annotation.Nullable;

import java.util.List;

public class ThreePointItem {
    public int defaultId;
    @Nullable
    public String icon;
    public long id;
    @Nullable
    public List<DislikeReason> reasons;
    public int selected;
    @Nullable
    public String selectedIcon;
    @Nullable
    public String selectedTitle;
    @Nullable
    public String subtitle;
    @Nullable
    public String title;
    public String toast;
    @Nullable
    public String type;
    @Nullable
    public String url;
}
