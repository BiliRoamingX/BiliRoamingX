package app.revanced.bilibili.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;

public interface MossResponseOnError<V> {
    /**
     * @return true indicate error handled
     */
    boolean onError(@NonNull MossResponseHandler<V> delegate, @Nullable MossException error);
}
