package app.revanced.bilibili.patches.main;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bilibili.multitypeplayerV2.MultiTypeVideoContentActivity;
import com.bilibili.ship.theseus.all.UnitedBizDetailsActivity;
import com.bilibili.video.videodetail.VideoDetailsActivity;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;

import app.revanced.bilibili.patches.CustomThemePatch;
import app.revanced.bilibili.patches.PlaybackSpeedPatch;
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook;
import app.revanced.bilibili.patches.protobuf.ViewUniteReplyHook;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.SubtitleParamsCache;
import app.revanced.bilibili.utils.UposReplacer;
import app.revanced.bilibili.utils.Utils;
import app.revanced.bilibili.utils.Versions;
import tv.danmaku.bili.MainActivityV2;

public class ApplicationDelegate {
    private static final ArrayDeque<WeakReference<Activity>> activityRefs = new ArrayDeque<>();

    public static void onCreate(Application app) {
        if (Utils.isInMainProcess()) {
            app.registerActivityLifecycleCallbacks(new ActivityLifecycleCallback());
            Utils.async(ApplicationDelegate::startLog);
            CustomThemePatch.refresh();
            Utils.async(PlaybackSpeedPatch::refreshOverrideSpeedList);
            SubtitleParamsCache.updateFont();
            KtUtils.getCountryTask();
            UposReplacer.getBaseUposList();
            Utils.runOnMainThread(500L, () -> Utils.async(BangumiSeasonHook::injectExtraSearchTypes));
            Utils.runOnMainThread(500L, () -> Utils.async(BangumiSeasonHook::injectExtraSearchTypesV2));
            Utils.runOnMainThread(2000L, () -> Utils.async(CouponAutoReceiver::check));
        }
    }

    public static void onActivityPreConfigurationChanged(Activity activity, Configuration newConfig) {
        var newDpi = Settings.CUSTOM_DPI.getInt();
        if (newDpi != 0) {
            newConfig.densityDpi = newDpi;
            updateDpi(activity, newDpi);
        }
    }

    static void updateDpi(Activity activity, int newDpi) {
        var dm = activity.getResources().getDisplayMetrics();
        var scale = dm.scaledDensity / dm.density;
        var newDensity = newDpi / 160f;
        dm.densityDpi = newDpi;
        dm.density = newDensity;
        dm.scaledDensity = scale * newDensity;
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
    static void startLog() {
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

    static class ActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
            var newDpi = Settings.CUSTOM_DPI.getInt();
            if (newDpi != 0)
                updateDpi(activity, newDpi);
        }

        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
            printLifecycle(activity, "onActivityCreated", true);
            activityRefs.push(new WeakReference<>(activity));
        }

        @Override
        public void onActivityDestroyed(@NonNull Activity activity) {
            printLifecycle(activity, "onActivityDestroyed", true);
            var iterator = activityRefs.iterator();
            while (iterator.hasNext()) {
                var activityRef = iterator.next();
                if (activityRef.get() == activity) {
                    iterator.remove();
                    break;
                }
            }
            if ((Versions.ge7_39_0() && !Versions.ge7_47_0() && activity instanceof UnitedBizDetailsActivity)
                    || (Versions.ge7_47_0() && activity instanceof com.bilibili.ship.theseus.detail.UnitedBizDetailsActivity)) {
                ViewUniteReplyHook.getViewUniteMap().remove(activity.hashCode());
            } else if (activity instanceof VideoDetailsActivity || activity instanceof MultiTypeVideoContentActivity) {
                ViewUniteReplyHook.getViewMap().remove(activity.hashCode());
            }
        }

        @Override
        public void onActivityStarted(@NonNull Activity activity) {
            printLifecycle(activity, "onActivityStarted", false);
        }

        @Override
        public void onActivityResumed(@NonNull Activity activity) {
            printLifecycle(activity, "onActivityResumed", false);
            if (activity instanceof MainActivityV2) {
                ViewUniteReplyHook.getViewMap().clear();
                if (Versions.ge7_39_0())
                    ViewUniteReplyHook.getViewUniteMap().clear();
            }
        }

        @Override
        public void onActivityPaused(@NonNull Activity activity) {
            printLifecycle(activity, "onActivityPaused", false);
        }

        @Override
        public void onActivityStopped(@NonNull Activity activity) {
            printLifecycle(activity, "onActivityStopped", false);
        }

        @Override
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
            printLifecycle(activity, "onActivitySaveInstanceState", false);
        }

        private void printLifecycle(Activity activity, String name, boolean printIntent) {
            if (Settings.DEBUG.getBoolean()) {
                var extras = activity.getIntent().getExtras();
                LogHelper.debug(() -> name + ", activity: " + activity.getClass().getName());
                if (printIntent && extras != null) {
                    for (String key : extras.keySet()) {
                        var value = extras.get(key);
                        LogHelper.debug(() -> "intent.extra, " + key + ": " + value + ", type: " + (value != null ? value.getClass().getName() : null));
                    }
                }
            }
        }
    }
}
