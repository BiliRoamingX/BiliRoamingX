package com.bilibili.app.comm.list.widget.recommend;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BL */
@Keep
/* loaded from: classes21.dex */
public final class RecommendModeGuidanceConfig {
    public static final int $stable = 8;
    @JSONField(name = "button_text")
    @Nullable
    private String buttonText;
    @JSONField(name = "close_show_interval")
    private int closeShowInterval;
    @JSONField(name = "cold_start_sub_title")
    @Nullable
    private String coldSubTitle;
    @JSONField(name = "dislike_sub_title")
    @Nullable
    private String dislikeSubTitle;
    @JSONField(name = "dislike_trigger_count")
    private int dislikeTriggerCount;
    @JSONField(name = "max_show_count")
    private int maxShowCount;
    @JSONField(name = "noclick_sub_title")
    @Nullable
    private String noClickSubTitle;
    @JSONField(name = "noclick_trigger_count")
    private int noClickTriggerCount;
    @JSONField(name = "show_time")
    private int showTime;
    @JSONField(name = "title")
    @Nullable
    private String title;

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getCloseShowInterval() {
        return this.closeShowInterval;
    }

    @Nullable
    public final String getColdSubTitle() {
        return this.coldSubTitle;
    }

    @Nullable
    public final String getDislikeSubTitle() {
        return this.dislikeSubTitle;
    }

    public final int getDislikeTriggerCount() {
        return this.dislikeTriggerCount;
    }

    public final int getMaxShowCount() {
        return this.maxShowCount;
    }

    @Nullable
    public final String getNoClickSubTitle() {
        return this.noClickSubTitle;
    }

    public final int getNoClickTriggerCount() {
        return this.noClickTriggerCount;
    }

    public final int getShowTime() {
        return this.showTime;
    }

    public final long getShowTimeMs() {
        int i = this.showTime;
        if (i < 1) {
            return 8000L;
        }
        return i * 1000L;
    }

    @Nullable
    public final String getSubTitle(@NotNull String str) {
        throw new UnsupportedOperationException();
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setButtonText(@Nullable String str) {
        this.buttonText = str;
    }

    public final void setCloseShowInterval(int i) {
        this.closeShowInterval = i;
    }

    public final void setColdSubTitle(@Nullable String str) {
        this.coldSubTitle = str;
    }

    public final void setDislikeSubTitle(@Nullable String str) {
        this.dislikeSubTitle = str;
    }

    public final void setDislikeTriggerCount(int i) {
        this.dislikeTriggerCount = i;
    }

    public final void setMaxShowCount(int i) {
        this.maxShowCount = i;
    }

    public final void setNoClickSubTitle(@Nullable String str) {
        this.noClickSubTitle = str;
    }

    public final void setNoClickTriggerCount(int i) {
        this.noClickTriggerCount = i;
    }

    public final void setShowTime(int i) {
        this.showTime = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
