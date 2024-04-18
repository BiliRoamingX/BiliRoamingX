package com.bilibili.okretro;

import androidx.annotation.Nullable;

public abstract class BaseResponse {
    public int code;
    @Nullable
    public String message;
    public int ttl;

    public boolean isSuccess() {
        return code == 0;
    }
}
