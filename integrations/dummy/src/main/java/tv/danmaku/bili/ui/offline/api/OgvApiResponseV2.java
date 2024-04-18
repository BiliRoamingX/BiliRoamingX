package tv.danmaku.bili.ui.offline.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

@Keep
public final class OgvApiResponseV2 {
    public static final int $stable = 8;
    @JSONField(name = "code")
    private int code;
    @JSONField(name = "data")
    @Nullable
    private EpPlayableV2 data;
    @JSONField(name = "message")
    @Nullable
    private String message;

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final EpPlayableV2 getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable EpPlayableV2 epPlayableV2) {
        this.data = epPlayableV2;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }
}
