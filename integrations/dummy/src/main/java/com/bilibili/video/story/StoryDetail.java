package com.bilibili.video.story;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public final class StoryDetail {
    @JSONField(name = "goto")
    @Nullable
    private String goto1;

    @JSONField(name = "owner")
    @Nullable
    private Owner owner;

    @JSONField(name = "stat")
    @Nullable
    private Stat stat;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "duration")
    private long duration;

    @Nullable
    public final String getGoto() {
        return goto1;
    }

    public final void setGoto(@Nullable String str) {
        this.goto1 = str;
    }

    @Nullable
    public final Owner getOwner() {
        return this.owner;
    }

    public final void setOwner(@Nullable Owner owner) {
        this.owner = owner;
    }

    @Nullable
    public final Stat getStat() {
        return this.stat;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Keep
    /* loaded from: classes12.dex */
    public static final class Owner {
        @JSONField(name = "upower")
        @Nullable
        private Charge charge;

        @JSONField(name = "mid")
        private long mid;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @Nullable
        public final Charge getCharge() {
            return this.charge;
        }

        public final void setCharge(@Nullable Charge charge) {
            this.charge = charge;
        }

        public final long getMid() {
            return this.mid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }
    }

    @Keep
    /* loaded from: classes12.dex */
    public static final class Charge {
        private boolean show;
        private int state;
        private int version;
        @JSONField(name = "button_icon")
        @NotNull
        private String buttonIcon = "";
        @JSONField(name = "popover_button_icon")
        @NotNull
        private String popOverButtonIcon = "";
        @JSONField(name = "button_text")
        @NotNull
        private String buttonText = "";
        @JSONField(name = "button_uri")
        @NotNull
        private String buttonUri = "";

        @NotNull
        public final String getButtonIcon() {
            return this.buttonIcon;
        }

        @NotNull
        public final String getButtonText() {
            return this.buttonText;
        }

        @NotNull
        public final String getButtonUri() {
            return this.buttonUri;
        }

        @NotNull
        public final String getPopOverButtonIcon() {
            return this.popOverButtonIcon;
        }

        public final boolean getShow() {
            return this.show;
        }

        public final int getState() {
            return this.state;
        }

        public final int getVersion() {
            return this.version;
        }

        public final void setButtonIcon(@NotNull String str) {
            this.buttonIcon = str;
        }

        public final void setButtonText(@NotNull String str) {
            this.buttonText = str;
        }

        public final void setButtonUri(@NotNull String str) {
            this.buttonUri = str;
        }

        public final void setPopOverButtonIcon(@NotNull String str) {
            this.popOverButtonIcon = str;
        }

        public final void setShow(boolean z) {
            this.show = z;
        }

        public final void setState(int i2) {
            this.state = i2;
        }

        public final void setVersion(int i2) {
            this.version = i2;
        }
    }

    @Keep
    /* loaded from: classes15.dex */
    public static final class Stat {
        public static final int $stable = 8;

        @JSONField(name = "aid")
        private long aid;

        @JSONField(name = "coin")
        private int coin;

        @JSONField(name = "danmaku")
        private long danmaku;

        @JSONField(name = "favorite")
        private int favorite;

        @JSONField(name = "his_rank")
        private int hisRank;

        @JSONField(name = "like")
        private long like;

        @JSONField(name = "now_rank")
        private int rank;

        @JSONField(name = "reply")
        private int reply;

        @JSONField(name = "follow")
        private long seasonFollow;

        @JSONField(name = "share")
        private int share;

        /* renamed from: view, reason: collision with root package name */
        @JSONField(name = "view")
        private long f188885view;

        public final long getAid() {
            return this.aid;
        }

        public final int getCoin() {
            return this.coin;
        }

        public final long getDanmaku() {
            return this.danmaku;
        }

        public final int getFavorite() {
            return this.favorite;
        }

        public final int getHisRank() {
            return this.hisRank;
        }

        public final long getLike() {
            return this.like;
        }

        public final int getRank() {
            return this.rank;
        }

        public final int getReply() {
            return this.reply;
        }

        public final long getSeasonFollow() {
            return this.seasonFollow;
        }

        public final int getShare() {
            return this.share;
        }

        public final long getView() {
            return this.f188885view;
        }

        public final void setAid(long j14) {
            this.aid = j14;
        }

        public final void setCoin(int i14) {
            this.coin = i14;
        }

        public final void setDanmaku(long j14) {
            this.danmaku = j14;
        }

        public final void setFavorite(int i14) {
            this.favorite = i14;
        }

        public final void setHisRank(int i14) {
            this.hisRank = i14;
        }

        public final void setLike(long j14) {
            this.like = j14;
        }

        public final void setRank(int i14) {
            this.rank = i14;
        }

        public final void setReply(int i14) {
            this.reply = i14;
        }

        public final void setSeasonFollow(long j14) {
            this.seasonFollow = j14;
        }

        public final void setShare(int i14) {
            this.share = i14;
        }

        public final void setView(long j14) {
            this.f188885view = j14;
        }
    }
}
