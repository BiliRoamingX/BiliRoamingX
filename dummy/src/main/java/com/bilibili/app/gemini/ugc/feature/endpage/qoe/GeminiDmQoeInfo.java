package com.bilibili.app.gemini.ugc.feature.endpage.qoe;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class GeminiDmQoeInfo {
    @JSONField(name = "info")
    @Nullable
    private Info info;
    @JSONField(name = "show")
    private boolean show;

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static final class Info {
        @JSONField(name = "feedback_title")
        @Nullable
        private String feedbackTitle;
        @JSONField(name = "id")
        private long id;
        @JSONField(name = "layer_mask")
        @Nullable
        private LayerMask layerMask;
        @JSONField(name = "score_items")
        @Nullable
        private List<ScoreItem> scoreItems;
        @JSONField(name = "style")
        private int style;
        @JSONField(name = "title")
        @Nullable
        private String title;
        @JSONField(name = "type")
        private int type;

        /* compiled from: BL */
        @Keep
        /* loaded from: classes15.dex */
        public static final class LayerMask {
            @JSONField(name = "close_count_down_second")
            private long showDuration;

            public final long getShowDuration() {
                return this.showDuration;
            }

            public final void setShowDuration(long j) {
                this.showDuration = j;
            }
        }

        /* compiled from: BL */
        @Keep
        /* loaded from: classes15.dex */
        public static final class ScoreItem {
            @JSONField(name = "score")
            private float score;
            @JSONField(name = "title")
            @Nullable
            private String title;
            @JSONField(name = "url")
            @Nullable
            private String url;

            public final float getScore() {
                return this.score;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            public final String getUrl() {
                return this.url;
            }

            public final void setScore(float f) {
                this.score = f;
            }

            public final void setTitle(@Nullable String str) {
                this.title = str;
            }

            public final void setUrl(@Nullable String str) {
                this.url = str;
            }
        }

        @Nullable
        public final String getFeedbackTitle() {
            return this.feedbackTitle;
        }

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final LayerMask getLayerMask() {
            return this.layerMask;
        }

        @Nullable
        public final List<ScoreItem> getScoreItems() {
            return this.scoreItems;
        }

        public final int getStyle() {
            return this.style;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final int getType() {
            return this.type;
        }

        public final void setFeedbackTitle(@Nullable String str) {
            this.feedbackTitle = str;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setLayerMask(@Nullable LayerMask layerMask) {
            this.layerMask = layerMask;
        }

        public final void setScoreItems(@Nullable List<ScoreItem> list) {
            this.scoreItems = list;
        }

        public final void setStyle(int i) {
            this.style = i;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setType(int i) {
            this.type = i;
        }
    }

    @Nullable
    public final Info getInfo() {
        return this.info;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final void setInfo(@Nullable Info info) {
        this.info = info;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }
}
