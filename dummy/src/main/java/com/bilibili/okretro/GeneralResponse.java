package com.bilibili.okretro;

import androidx.annotation.Keep;

@Keep
public class GeneralResponse<T> extends BaseResponse {
    public T data;
}
