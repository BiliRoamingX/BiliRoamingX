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

    @Keep
    /* loaded from: classes12.dex */
    public static final class Owner {
        @JSONField(name = "upower")
        @Nullable
        private Charge charge;

        @Nullable
        public final Charge getCharge() {
            return this.charge;
        }

        public final void setCharge(@Nullable Charge charge) {
            this.charge = charge;
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
}
