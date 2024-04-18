package tv.danmaku.bili.ui.splash;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public class SplashData {
    public static final int DEFAULT_INTERVAL_FOR_SHOW = 14400;
    public static final int DURATION_DEFAULT_SHOW = 3;
    public static final int MAX_SHOW_COUNT = 6;
    @JSONField(name = "min_interval")
    public int intervalForShow;
    @JSONField(name = "pull_interval")
    public int intervalForUpdate;
    @JSONField(name = "max_time")
    public int maxCount;
    @JSONField(name = "list")
    public List<Splash> splashList;
    @Nullable
    @JSONField(name = "splash_request_id")
    public String splashRequestId;
    @JSONField(name = "show")
    public List<ShowStrategy> strategyList;

    /* compiled from: BL */
    @Keep
    /* loaded from: classes8.dex */
    public static class ShowStrategy {
        @JSONField(name = "ad_cb")
        public String adCb;
        public long etime;
        public long id;
        public long stime;

        @JSONField(deserialize = false, serialize = false)
        public boolean isValid() {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            return currentTimeMillis >= this.stime && currentTimeMillis <= this.etime;
        }
    }

    public void addSplashData(List<Splash> list) {
        if (list == null) {
            return;
        }
        if (this.splashList == null) {
            this.splashList = new ArrayList<>();
        }
        this.splashList.addAll(list);
    }

    public List<Splash> getEncryptedData() {
        return new ArrayList<>();
    }

    public void trimEncryptedData() {
    }
}
