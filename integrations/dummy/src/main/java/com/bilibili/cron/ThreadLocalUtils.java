package com.bilibili.cron;

import androidx.annotation.NonNull;

public class ThreadLocalUtils {

    public interface InstanceCreator<T> {
        @NonNull
        T create();
    }

    ThreadLocalUtils() {
    }

    @NonNull
    public static <T> T getInstance(@NonNull ThreadLocal<T> threadLocal, @NonNull InstanceCreator<T> instanceCreator) {
        T t = threadLocal.get();
        if (t == null) {
            T create = instanceCreator.create();
            threadLocal.set(create);
            return create;
        }
        return t;
    }
}
