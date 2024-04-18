package tv.danmaku.bili.ui.splash.event;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class Action {
    @JSONField(name = "duration")
    private int duration;
    @JSONField(name = "elements")
    @Nullable
    private List<Element> elements;
    @JSONField(name = "interact_time")
    private int interactTime;
    @JSONField(name = "jump_url")
    @Nullable
    private String jumpUrl;
    @JSONField(name = "show_countdown")
    private int showCountdown;
    @JSONField(name = "video_seek_to")
    private int videoSeekTo;

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final List<Element> getElements() {
        return this.elements;
    }

    public final int getInteractTime() {
        return this.interactTime;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final int getShowCountdown() {
        return this.showCountdown;
    }

    public final int getVideoSeekTo() {
        return this.videoSeekTo;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setElements(@Nullable List<Element> list) {
        this.elements = list;
    }

    public final void setInteractTime(int i) {
        this.interactTime = i;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setShowCountdown(int i) {
        this.showCountdown = i;
    }

    public final void setVideoSeekTo(int i) {
        this.videoSeekTo = i;
    }

    @NotNull
    public String toString() {
        return super.toString() + "url:" + this.jumpUrl + " seekTo:" + this.videoSeekTo;
    }
}
