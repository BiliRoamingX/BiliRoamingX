package tv.danmaku.bili.ui.offline.api;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
public class EpPlayable {
    public long epid;
    @JSONField(name = "is_playable")
    public int isPlayable = 1;
}
