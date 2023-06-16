package com.bilibili.lib.sharewrapper.online.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
public class ShareChannels {
    @JSONField(name = "above_channels")
    @Nullable
    private ArrayList<ChannelItem> aboveChannels;
    @JSONField(name = "below_channels")
    @Nullable
    private ArrayList<ChannelItem> belowChannels;
    @JSONField(name = "copy_link")
    @Nullable
    private String copyLink;
    @JSONField(name = "extra")
    @Nullable
    private ChannelExtra extra;
    @JSONField(name = "jump_link")
    @Nullable
    private String jumpLink;
    @Nullable
    private String picture;
    @JSONField(name = "system_channels")
    @Nullable
    private ArrayList<ChannelItem> systemChannels;
    @Nullable
    private String text;

    /* compiled from: BL */
    @Keep
    /* loaded from: classes4.dex */
    public static final class ChannelExtra {
        @JSONField(name = "quick_message_on")
        private boolean messageOn;

        public final boolean getMessageOn() {
            return this.messageOn;
        }

        public final void setMessageOn(boolean z) {
            this.messageOn = z;
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes4.dex */
    public static final class ChannelItem {
        @Nullable
        private String category;
        @Nullable
        private String level;
        @Nullable
        private String name;
        @Nullable
        private String picture;
        @JSONField(name = "share_channel")
        @Nullable
        private String shareChannel;
        @Nullable
        private ArrayList<MenuStatusItem> statusList;
        @Nullable
        private String tag;
        @Nullable
        private String title = "";

        @Nullable
        public final String getCategory() {
            return this.category;
        }

        @Nullable
        public final String getLevel() {
            return this.level;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getPicture() {
            return this.picture;
        }

        @Nullable
        public final String getShareChannel() {
            return this.shareChannel;
        }

        @Nullable
        public final ArrayList<MenuStatusItem> getStatusList() {
            return this.statusList;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setCategory(@Nullable String str) {
            this.category = str;
        }

        public final void setLevel(@Nullable String str) {
            this.level = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setPicture(@Nullable String str) {
            this.picture = str;
        }

        public final void setShareChannel(@Nullable String str) {
            this.shareChannel = str;
        }

        public final void setStatusList(@Nullable ArrayList<MenuStatusItem> arrayList) {
            this.statusList = arrayList;
        }

        public final void setTag(@Nullable String str) {
            this.tag = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @Nullable
    public final ArrayList<ChannelItem> getAboveChannels() {
        return this.aboveChannels;
    }

    @Nullable
    public final ArrayList<ChannelItem> getBelowChannels() {
        return this.belowChannels;
    }

    @Nullable
    public final String getCopyLink() {
        return this.copyLink;
    }

    @Nullable
    public final ChannelExtra getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    public final ArrayList<ChannelItem> getSystemChannels() {
        return this.systemChannels;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final boolean isEmpty() {
        ArrayList<ChannelItem> arrayList = this.aboveChannels;
        if (arrayList == null || arrayList.isEmpty()) {
            ArrayList<ChannelItem> arrayList2 = this.belowChannels;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                ArrayList<ChannelItem> arrayList3 = this.systemChannels;
                return arrayList3 == null || arrayList3.isEmpty();
            }
        }
        return false;
    }

    public final void setAboveChannels(@Nullable ArrayList<ChannelItem> arrayList) {
        this.aboveChannels = arrayList;
    }

    public final void setBelowChannels(@Nullable ArrayList<ChannelItem> arrayList) {
        this.belowChannels = arrayList;
    }

    public final void setCopyLink(@Nullable String str) {
        this.copyLink = str;
    }

    public final void setExtra(@Nullable ChannelExtra channelExtra) {
        this.extra = channelExtra;
    }

    public final void setJumpLink(@Nullable String str) {
        this.jumpLink = str;
    }

    public final void setPicture(@Nullable String str) {
        this.picture = str;
    }

    public final void setSystemChannels(@Nullable ArrayList<ChannelItem> arrayList) {
        this.systemChannels = arrayList;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
