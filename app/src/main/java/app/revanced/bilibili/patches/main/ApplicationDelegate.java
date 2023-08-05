package app.revanced.bilibili.patches.main;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.Utils;

public class ApplicationDelegate {
    private static final ArrayDeque<WeakReference<Activity>> activityRefs = new ArrayDeque<>();

    public static void onCreate(Application app) {
        if (Utils.isInMainProcess()) {
            Utils.async(ApplicationDelegate::startLog);
            app.registerActivityLifecycleCallbacks(new ActivityLifecycleCallback());
        }
    }

    @Nullable
    public static Activity getTopActivity() {
        var ref = activityRefs.peek();
        if (ref != null)
            return ref.get();
        return null;
    }

    @NonNull
    public static Activity requireTopActivity() {
        return Objects.requireNonNull(getTopActivity());
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void startLog() {
        if (!Settings.DEBUG.getBoolean())
            return;
        try {
            File logFile = KtUtils.getLogFile();
            File oldLogFile = KtUtils.getOldLogFile();
            if (logFile.exists()) {
                if (oldLogFile.exists())
                    oldLogFile.delete();
                logFile.renameTo(oldLogFile);
            }
            logFile.delete();
            logFile.createNewFile();
            Runtime.getRuntime().exec(
                    new String[]{
                            "logcat",
                            "-T",
                            "100",
                            "-f",
                            logFile.getAbsolutePath()
                    }
            );
        } catch (Throwable ignored) {
        }
    }

    public static class ActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
            activityRefs.push(new WeakReference<>(activity));
        }

        @Override
        public void onActivityDestroyed(@NonNull Activity activity) {
            var iterator = activityRefs.iterator();
            while (iterator.hasNext()) {
                var activityRef = iterator.next();
                if (activityRef.get() == activity) {
                    iterator.remove();
                    break;
                }
            }
        }

        @Override
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
        }
    }
}
