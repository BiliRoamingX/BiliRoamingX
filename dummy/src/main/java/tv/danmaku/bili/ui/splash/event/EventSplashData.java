package tv.danmaku.bili.ui.splash.event;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class EventSplashData {
    @JSONField(name = "account")
    @Nullable
    private Account account;
    @JSONField(name = "begin_time")
    private long beginTime;
    @JSONField(name = "duration")
    private int duration;
    @JSONField(name = "elements")
    @Nullable
    private List<Element> elements;
    @JSONField(name = "end_time")
    private long endTime;
    @JSONField(name = "event_type")
    private int eventType;
    @JSONField(name = "id")
    private long id;
    private boolean isLocalBirthData;
    @JSONField(name = "resources")
    @Nullable
    private List<Resource> resources;
    @JSONField(name = "show_countdown")
    private int showCountdown;
    @JSONField(name = "show_skip")
    private int showSkip;
    @JSONField(name = "show_times")
    private int showTimes;
    @JSONField(name = "wifi_download")
    @Nullable
    private Integer wifiDownload = 1;

    private final boolean isTimeValid() {
        return false;
    }

    @Nullable
    public final Account getAccount() {
        return this.account;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getElementHash() {
        return 0;
    }

    @Nullable
    public final List<Element> getElements() {
        return this.elements;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getEventType() {
        return this.eventType;
    }

    public final long getId() {
        return this.id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Resource> getPhoneResource() {
        return List.of();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getResourceHash() {
        return 0;
    }

    @Nullable
    public final List<Resource> getResources() {
        return this.resources;
    }

    public final int getShowCountdown() {
        return this.showCountdown;
    }

    public final int getShowSkip() {
        return this.showSkip;
    }

    public final int getShowTimes() {
        return this.showTimes;
    }

    @Nullable
    public final Integer getWifiDownload() {
        return this.wifiDownload;
    }

    public final boolean hasSameResWith(@NotNull EventSplashData eventSplashData) {
        return getResourceHash() == eventSplashData.getResourceHash() && getElementHash() == eventSplashData.getElementHash();
    }

    public final boolean isBirthdayData() {
        return this.eventType == 0;
    }

    public final boolean isElementResValid() {
        return false;
    }

    public final boolean isLocalBirthData() {
        return this.isLocalBirthData;
    }

    public boolean isResValid() {
        return false;
    }

    public final boolean isValid() {
        return false;
    }

    public final void setAccount(@Nullable Account account) {
        this.account = account;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setElements(@Nullable List<Element> list) {
        this.elements = list;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setEventType(int i) {
        this.eventType = i;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLocalBirthData(boolean z) {
        this.isLocalBirthData = z;
    }

    public final void setResources(@Nullable List<Resource> list) {
        this.resources = list;
    }

    public final void setShowCountdown(int i) {
        this.showCountdown = i;
    }

    public final void setShowSkip(int i) {
        this.showSkip = i;
    }

    public final void setShowTimes(int i) {
        this.showTimes = i;
    }

    public final void setWifiDownload(@Nullable Integer num) {
        this.wifiDownload = num;
    }
}
