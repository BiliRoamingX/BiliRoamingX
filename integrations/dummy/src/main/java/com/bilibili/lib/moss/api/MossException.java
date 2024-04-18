package com.bilibili.lib.moss.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MossException extends Exception {
    public MossException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }

    @NonNull
    public String toPrintString() {
        return getClass() + ", " + getMessage();
    }
}
