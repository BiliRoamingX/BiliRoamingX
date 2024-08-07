package com.bilibili.adcommon.basic.model;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
public class FeedAdInfo {
    @JSONField(name = "card_type")
    private long feedInfoCardType;

    public final long getFeedInfoCardType() {
        return this.feedInfoCardType;
    }

    public final void setFeedInfoCardType(long j14) {
        this.feedInfoCardType = j14;
    }
}
