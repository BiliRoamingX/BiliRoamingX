package tv.danmaku.bili.ui.splash.event;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class EventSplashDataList {
    @JSONField(name = "account")
    @Nullable
    private Account account;
    @JSONField(name = "event_list")
    @Nullable
    private List<EventSplashData> eventList;

    @Nullable
    public final Account getAccount() {
        return this.account;
    }

    @Nullable
    public final List<EventSplashData> getEventList() {
        return this.eventList;
    }

    public final void setAccount(@Nullable Account account) {
        this.account = account;
    }

    public final void setEventList(@Nullable List<EventSplashData> list) {
        this.eventList = list;
    }
}
