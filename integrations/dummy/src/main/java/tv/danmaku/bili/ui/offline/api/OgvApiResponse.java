package tv.danmaku.bili.ui.offline.api;

import androidx.annotation.Keep;

import com.bilibili.okretro.BaseResponse;

@Keep
public class OgvApiResponse<T> extends BaseResponse {
    public T result;
}
