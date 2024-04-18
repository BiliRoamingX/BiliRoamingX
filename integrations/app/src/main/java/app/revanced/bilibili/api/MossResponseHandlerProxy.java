package app.revanced.bilibili.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;

import java.util.List;
import java.util.Map;

/**
 * static proxy moss response handler, to improve performance
 *
 * @param <V> response type
 */
public class MossResponseHandlerProxy<V> implements MossResponseHandler<V> {
    @NonNull
    private final MossResponseHandler<V> delegate;
    @Nullable
    private final MossResponseOnNext<V> onNext;
    @Nullable
    private final MossResponseOnError<V> onError;

    public MossResponseHandlerProxy(@NonNull MossResponseHandler<V> delegate, @Nullable MossResponseOnNext<V> onNext, @Nullable MossResponseOnError<V> onError) {
        this.delegate = delegate;
        this.onNext = onNext;
        this.onError = onError;
    }

    @Override
    public void onCompleted() {
        delegate.onCompleted();
    }

    @Override
    public void onError(@Nullable MossException error) {
        if (onError == null || !onError.onError(delegate, error))
            delegate.onError(error);
    }

    @Override
    public void onHeaders(@NonNull Map<String, List<String>> headers) {
        delegate.onHeaders(headers);
    }

    @Override
    public void onNext(@Nullable V v) {
        if (onNext != null) {
            V newV = onNext.onNext(v);
            delegate.onNext(newV);
        } else {
            delegate.onNext(v);
        }
    }

    @Override
    public Long onNextForAck(V v) {
        return delegate.onNextForAck(v);
    }

    @Override
    public void onUpstreamAck(Long ack) {
        delegate.onUpstreamAck(ack);
    }

    @Override
    public void onValid() {
        delegate.onValid();
    }

    public static <V> MossResponseHandlerProxy<V> get(@NonNull MossResponseHandler<V> delegate, @Nullable MossResponseOnNext<V> onNext) {
        return new MossResponseHandlerProxy<>(delegate, onNext, null);
    }

    public static <V> MossResponseHandlerProxy<V> get(@NonNull MossResponseHandler<V> delegate, @Nullable MossResponseOnNext<V> onNext, @Nullable MossResponseOnError<V> onError) {
        return new MossResponseHandlerProxy<>(delegate, onNext, onError);
    }
}
