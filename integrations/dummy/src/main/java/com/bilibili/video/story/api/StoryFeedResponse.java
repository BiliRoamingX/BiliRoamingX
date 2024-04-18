package com.bilibili.video.story.api;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.video.story.StoryDetail;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public final class StoryFeedResponse {
    @JSONField(name = "code")
    private int code;
    @JSONField(name = "data")
    @Nullable
    private Data data;
    @JSONField(name = "message")
    @Nullable
    private String message;

    /* compiled from: BL */
    @Keep
    /* loaded from: classes8.dex */
    public static final class Config {
        @JSONField(name = "back_to_resume_duration")
        private int backToResumeDuration;
        @JSONField(name = "back_to_resume_progress")
        private int backToResumeProgress;
        @JSONField(name = "reply_high_raised")
        private boolean commentExp16x9Height;
        @JSONField(name = "reply_no_danmu")
        private boolean commentExpNoDanmaku;
        @JSONField(name = "enable_back_to_resume")
        private boolean enableBackToResume;
        @JSONField(name = "enable_rcmd_guide")
        private boolean enableRCMDGuide;
        @JSONField(name = "interactive_gestures_exp")
        private int gestureExp;
        @JSONField(name = "live_room_guide_style")
        private int liveRoomGuideStyle;
        @JSONField(name = "reply_zoom_exp")
        private int popupViewportType;
        @JSONField(name = "progress_bar")
        @Nullable
        private Progress progress;
        @JSONField(name = "jump_to_view_icon")
        @Nullable
        private String routerIcon;
        @JSONField(name = "speed_play_exp")
        private boolean speedPlayExp;

        public final int getBackToResumeDuration() {
            return this.backToResumeDuration;
        }

        public final int getBackToResumeProgress() {
            return this.backToResumeProgress;
        }

        public final boolean getCommentExp16x9Height() {
            return this.commentExp16x9Height;
        }

        public final boolean getCommentExpNoDanmaku() {
            return this.commentExpNoDanmaku;
        }

        public final boolean getEnableBackToResume() {
            return this.enableBackToResume;
        }

        public final boolean getEnableRCMDGuide() {
            return this.enableRCMDGuide;
        }

        public final int getGestureExp() {
            return this.gestureExp;
        }

        public final int getLiveRoomGuideStyle() {
            return this.liveRoomGuideStyle;
        }

        public final int getPopupViewportType() {
            return this.popupViewportType;
        }

        @Nullable
        public final Progress getProgress() {
            return this.progress;
        }

        @Nullable
        public final String getRouterIcon() {
            return this.routerIcon;
        }

        public final boolean getSpeedPlayExp() {
            return this.speedPlayExp;
        }

        public final void setBackToResumeDuration(int i) {
            this.backToResumeDuration = i;
        }

        public final void setBackToResumeProgress(int i) {
            this.backToResumeProgress = i;
        }

        public final void setCommentExp16x9Height(boolean z) {
            this.commentExp16x9Height = z;
        }

        public final void setCommentExpNoDanmaku(boolean z) {
            this.commentExpNoDanmaku = z;
        }

        public final void setEnableBackToResume(boolean z) {
            this.enableBackToResume = z;
        }

        public final void setEnableRCMDGuide(boolean z) {
            this.enableRCMDGuide = z;
        }

        public final void setGestureExp(int i) {
            this.gestureExp = i;
        }

        public final void setLiveRoomGuideStyle(int i) {
            this.liveRoomGuideStyle = i;
        }

        public final void setPopupViewportType(int i) {
            this.popupViewportType = i;
        }

        public final void setProgress(@Nullable Progress progress) {
            this.progress = progress;
        }

        public final void setRouterIcon(@Nullable String str) {
            this.routerIcon = str;
        }

        public final void setSpeedPlayExp(boolean z) {
            this.speedPlayExp = z;
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes8.dex */
    public static final class Data {
        @JSONField(name = "config")
        @Nullable
        private Config config;
        @JSONField(name = "items")
        @Nullable
        private List<StoryDetail> items;

        @Nullable
        public final Config getConfig() {
            return this.config;
        }

        @Nullable
        public final List<StoryDetail> getItems() {
            return this.items;
        }

        public final void setConfig(@Nullable Config config) {
            this.config = config;
        }

        public final void setItems(@Nullable List<StoryDetail> list) {
            this.items = list;
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes8.dex */
    public static final class Page {
        @JSONField(name = "has_more")
        private boolean hasMore = true;
        @JSONField(name = "offset")
        @Nullable
        private String offset;

        public final boolean getHasMore() {
            return this.hasMore;
        }

        @Nullable
        public final String getOffset() {
            return this.offset;
        }

        public final void setHasMore(boolean z) {
            this.hasMore = z;
        }

        public final void setOffset(@Nullable String str) {
            this.offset = str;
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes8.dex */
    public static final class Progress {
        @JSONField(name = "icon_drag")
        @Nullable
        private String dragIcon;
        @JSONField(name = "icon_drag_hash")
        @Nullable
        private String dragIconHash;
        @JSONField(name = "icon_stop")
        @Nullable
        private String stopIcon;
        @JSONField(name = "icon_stop_hash")
        @Nullable
        private String stopIconHash;

        @Nullable
        public final String getDragIcon() {
            return this.dragIcon;
        }

        @Nullable
        public final String getDragIconHash() {
            return this.dragIconHash;
        }

        @Nullable
        public final String getStopIcon() {
            return this.stopIcon;
        }

        @Nullable
        public final String getStopIconHash() {
            return this.stopIconHash;
        }

        public final void setDragIcon(@Nullable String str) {
            this.dragIcon = str;
        }

        public final void setDragIconHash(@Nullable String str) {
            this.dragIconHash = str;
        }

        public final void setStopIcon(@Nullable String str) {
            this.stopIcon = str;
        }

        public final void setStopIconHash(@Nullable String str) {
            this.stopIconHash = str;
        }
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final List<StoryDetail> getItems() {
        Data data = this.data;
        if (data != null) {
            return data.getItems();
        }
        return null;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable Data data) {
        this.data = data;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }
}
