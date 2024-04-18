package tv.danmaku.bili.ui.splash.event;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class Account {
    @JSONField(name = "level")
    private int level;
    @JSONField(name = "mid")
    private long mid;
    @JSONField(name = "uimage")
    @Nullable
    private String uimage;
    @JSONField(name = "uname")
    @Nullable
    private String uname;

    public final int getLevel() {
        return this.level;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getUimage() {
        return this.uimage;
    }

    @Nullable
    public final String getUname() {
        return this.uname;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setMid(long j) {
        this.mid = j;
    }

    public final void setUimage(@Nullable String str) {
        this.uimage = str;
    }

    public final void setUname(@Nullable String str) {
        this.uname = str;
    }
}
