package com.bilibili.lib.moss.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.protobuf.Any;

import java.util.List;

public class BusinessException extends MossException {
    private int code;
    @Nullable
    private final List<Any> details;
    @Nullable
    private final String reason;

    public BusinessException(int code, @Nullable String message, @Nullable Throwable cause, @Nullable String reason, @Nullable List<Any> details) {
        super(message, cause);
        this.code = code;
        this.reason = reason;
        this.details = details;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final List<Any> getDetails() {
        return this.details;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public final void setCode(int code) {
        this.code = code;
    }

    @NonNull
    @Override
    public String toPrintString() {
        return getClass() + ", " + this.code + ", " + getMessage() + ", " + this.reason;
    }
}
