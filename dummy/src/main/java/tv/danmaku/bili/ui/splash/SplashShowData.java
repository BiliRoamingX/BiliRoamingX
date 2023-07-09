package tv.danmaku.bili.ui.splash;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public class SplashShowData {
    @Nullable
    @JSONField(name = "splash_request_id")
    private String splashRequestId;
    @JSONField(name = "show")
    public List<SplashData.ShowStrategy> strategyList;

    @Nullable
    public String getSplashRequestId() {
        return this.splashRequestId;
    }

    public void setSplashRequestId(String str) {
        this.splashRequestId = str;
    }
}
