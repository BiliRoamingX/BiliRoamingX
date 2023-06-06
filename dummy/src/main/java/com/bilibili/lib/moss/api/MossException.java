package com.bilibili.lib.moss.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MossException extends Exception {
    private static final MossException UNSUPPORTED = new MossException("Unsupported", null);

    public MossException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }

    @NonNull
    public String toPrintString() {
        throw new UnsupportedOperationException("Stub");
    }
}
