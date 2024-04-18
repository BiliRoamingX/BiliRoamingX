package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Nullable;

import com.bilibili.pegasus.api.model.BasicIndexItem;

import java.util.ArrayList;

public class PegasusFeedResponse {
    @Nullable
    public Config config;
    @Nullable
    public ArrayList<BasicIndexItem> items;
}
