package com.bilibili.lib.moss.api;

import androidx.annotation.Nullable;

public class NetworkException extends MossException {
    public NetworkException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }
}
