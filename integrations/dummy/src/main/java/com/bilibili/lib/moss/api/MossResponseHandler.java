package com.bilibili.lib.moss.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Map;

public interface MossResponseHandler<V> {
    void onCompleted();

    void onError(@Nullable MossException error);

    void onHeaders(@NonNull Map<String, List<String>> headers);

    void onNext(@Nullable V v);

    Long onNextForAck(V v);

    void onUpstreamAck(Long ack);

    void onValid();
}
