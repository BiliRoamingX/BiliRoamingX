package app.revanced.bilibili.patches.main;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.WindowManager;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.lsposed.hiddenapibypass.HiddenApiBypass;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;

import app.revanced.bilibili.patches.CustomThemePatch;
import app.revanced.bilibili.patches.DpiPatch;
import app.revanced.bilibili.patches.PlaybackSpeedPatch;
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.Reflex;
import app.revanced.bilibili.utils.SubtitleParamsCache;
import app.revanced.bilibili.utils.UposReplacer;
import app.revanced.bilibili.utils.Utils;
import tv.danmaku.bili.MainActivityV2;

public class ApplicationDelegate {
    private static final ArrayDeque<WeakReference<Activity>> activityRefs = new ArrayDeque<>();
    private static volatile boolean appCreated = false;
    private static final Point screenSize = new Point();

    @Keep
    public static void onCreate(Application app) {
        appCreated = true;
        app.registerActivityLifecycleCallbacks(new ActivityLifecycleCallback());
        app.registerComponentCallbacks(new ComponentCallbacks());
        setBitmapDefaultDensity();
        CustomThemePatch.refresh();
        if (Utils.isInMainProcess()) {
            Utils.async(ApplicationDelegate::startLog);
            Utils.async(PlaybackSpeedPatch::refreshOverrideSpeedList);
            SubtitleParamsCache.updateFont();
            KtUtils.getCountryTask();
            UposReplacer.getBaseUposList();
            Utils.runOnMainThread(500L, () -> Utils.async(BangumiSeasonHook::injectExtraSearchTypes));
            Utils.runOnMainThread(500L, () -> Utils.async(BangumiSeasonHook::injectExtraSearchTypesV2));
            Utils.runOnMainThread(2000L, () -> Utils.async(CouponAutoReceiver::check));
        }
    }

    @Keep
    public static Resources getResources(Resources resources) {
        // We can not access application context to get customize dpi
        // when content provider initializing, just let them go first.
        if (appCreated) {
            int newDpi = getCustomDpi();
            if (newDpi != 0) {
                updateDpi(resources.getDisplayMetrics(), newDpi);
                Configuration configuration = resources.getConfiguration();
                configuration.densityDpi = newDpi;
                var newAxisDpi = calcNewAxisDpi();
                configuration.screenWidthDp = newAxisDpi.first;
                configuration.screenHeightDp = newAxisDpi.second;
            }
        }
        return resources;
    }

    static void setBitmapDefaultDensity() {
        // to let pictures like cover show correctly when customizing dpi.
        float scale = DpiPatch.displayScale;
        if (scale != 0f) {
            float density = Resources.getSystem().getDisplayMetrics().density;
            int newDpi = (int) ((density + scale) * 160);
            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
                    HiddenApiBypass.addHiddenApiExemptions("Landroid/graphics/Bitmap;");
                Reflex.setStaticIntField(Bitmap.class, "sDefaultDensity", newDpi);
            } catch (Throwable t) {
                LogHelper.error(() -> "Failed to setting Bitmap default density", t);
            }
        }
    }

    static int getCustomDpi() {
        float scale = DpiPatch.displayScale;
        if (scale == 0f) return 0;
        float sysDensity = Resources.getSystem().getDisplayMetrics().density;
        float newDensity = sysDensity + scale;
        return (int) (160 * newDensity);
    }

    @Keep
    public static void onActivityPreConfigurationChanged(Activity activity, Configuration newConfig) {
        ActivityLifecycleCallback.printLifecycle(activity, "onActivityPreConfigurationChanged", false);
        var newDpi = getCustomDpi();
        if (newDpi != 0) {
            newConfig.densityDpi = newDpi;
            var newAxisDpi = calcNewAxisDpi();
            newConfig.screenWidthDp = newAxisDpi.first;
            newConfig.screenHeightDp = newAxisDpi.second;
            updateDpi(activity, newDpi);
        }
    }

    @Keep
    public static Context onActivityPreAttachBaseContext(Activity activity, Context base) {
        ActivityLifecycleCallback.printLifecycle(activity, "onActivityPreAttachBaseContext", false);
        var newDpi = getCustomDpi();
        if (newDpi == 0) return base;
        var configuration = base.getResources().getConfiguration();
        configuration.densityDpi = newDpi;
        var newAxisDpi = calcNewAxisDpi();
        configuration.screenWidthDp = newAxisDpi.first;
        configuration.screenHeightDp = newAxisDpi.second;
        return base.createConfigurationContext(configuration);
    }

    private static Pair<Integer, Integer> calcNewAxisDpi() {
        Resources sysRes = Resources.getSystem();
        float sysDensity = sysRes.getDisplayMetrics().density;
        int sysWidthDp = sysRes.getConfiguration().screenWidthDp;
        int sysHeightDp = sysRes.getConfiguration().screenHeightDp;
        var windowManager = (WindowManager) Utils.getContext().getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getRealSize(screenSize);
        int widthPixels = screenSize.x;
        int heightPixels = screenSize.y;
        int widthInsets = Math.max(0, widthPixels - (int) (sysWidthDp * sysDensity));
        int heightInsets = Math.max(0, heightPixels - (int) (sysHeightDp * sysDensity));
        float customDensity = DpiPatch.displayScale + sysDensity;
        int newWidthDp = (int) ((widthPixels - widthInsets) / customDensity);
        int newHeightDp = (int) ((heightPixels - heightInsets) / customDensity);
        return Pair.create(newWidthDp, newHeightDp);
    }

    static void updateDpi(Activity activity, int newDpi) {
        updateDpi(activity.getResources().getDisplayMetrics(), newDpi);
    }

    static void updateDpi(DisplayMetrics dm, int newDpi) {
        var systemDm = Resources.getSystem().getDisplayMetrics();
        var scale = systemDm.scaledDensity / systemDm.density;
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
                            logFile.getAbsolutePath(),
                            LogHelper.LOG_TAG,
                            "*:S"
                    }
            );
        } catch (Throwable ignored) {
        }
    }

    static class ActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
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
            VideoInfoHolder.removeCache(activity);
        }

        @Override
        public void onActivityStarted(@NonNull Activity activity) {
            printLifecycle(activity, "onActivityStarted", false);
        }

        @Override
        public void onActivityResumed(@NonNull Activity activity) {
            printLifecycle(activity, "onActivityResumed", false);
            if (activity instanceof MainActivityV2)
                VideoInfoHolder.clearCache();
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

        static void printLifecycle(Activity activity, String name, boolean printIntent) {
            if (!Settings.DEBUG.getBoolean()) return;
            LogHelper.debug(() -> name + ", activity: " + activity.getClass().getName());
            if (!printIntent) return;
            var extras = activity.getIntent().getExtras();
            if (extras == null) return;
            for (String key : extras.keySet()) {
                var value = extras.get(key);
                LogHelper.debug(() -> "intent.extra, " + key + ": " + value + ", type: " + (value != null ? value.getClass().getName() : null));
            }
        }
    }

    static class ComponentCallbacks implements android.content.ComponentCallbacks {

        @Override
        public void onConfigurationChanged(@NonNull Configuration newConfig) {
            setBitmapDefaultDensity();
        }

        @Override
        public void onLowMemory() {
        }
    }
}
