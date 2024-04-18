package app.revanced.bilibili.api;

import androidx.annotation.Nullable;

public interface MossResponseOnNext<V> {
    @Nullable
    V onNext(@Nullable V v);
}
