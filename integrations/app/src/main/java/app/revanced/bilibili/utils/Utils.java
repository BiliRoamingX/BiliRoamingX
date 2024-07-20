package app.revanced.bilibili.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.WindowManager;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bapis.bilibili.app.distribution.setting.night.NightSettingsConfig;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import javax.crypto.spec.IvParameterSpec;

import kotlin.Lazy;
import kotlin.LazyKt;

@SuppressWarnings("unused")
public class Utils {
    /**
     * Note: don't use directly, instead of {@link Utils#getContext()}.
     */
    @SuppressLint("StaticFieldLeak")
    public static Context context;
    public static Handler mainHandler = new Handler(Looper.getMainLooper());

    private static String mobiApp = "";
    private static final Lazy<Handler> asyncHandler;
    private static Boolean isPink = null;
    private static Boolean isBlue = null;
    private static Boolean isPlay = null;
    private static Boolean isHd = null;
    private static final ConcurrentHashMap<String, Integer> idsCache = new ConcurrentHashMap<>();

    static {
        asyncHandler = LazyKt.lazy(() -> {
            HandlerThread thread = new HandlerThread("UtilsAsyncThread");
            thread.start();
            return new Handler(thread.getLooper());
        });
    }

    @Keep
    public static Context getContext() {
        if (context == null) {
            context = ActivityThread.currentActivityThread().getApplication();
            if (context == null)
                Logger.error(() -> "Context is null");
        }
        return context;
    }

    @Keep
    public static Resources getResources() {
        return getContext().getResources();
    }

    @SuppressLint("DiscouragedApi")
    public static int getResId(String name, String type) {
        Context context = getContext();
        String fullName = context.getPackageName() + ":" + type + "/" + name;
        return idsCache.computeIfAbsent(fullName, (key) -> context.getResources().getIdentifier(key, null, null));
    }

    public static String getString(String idName) {
        return getContext().getString(getResId(idName, "string"));
    }

    public static String getString(String idName, Object... formatArgs) {
        return getContext().getString(getResId(idName, "string"), formatArgs);
    }

    public static String[] getStringArray(String idName) {
        return getContext().getResources().getStringArray(getResId(idName, "array"));
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public static Drawable getDrawable(String idName) {
        return getContext().getDrawable(getResId(idName, "drawable"));
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public static Drawable getDrawable(Context context, String idName) {
        return context.getDrawable(getResId(idName, "drawable"));
    }

    public static int getColor(String idName) {
        return getContext().getColor(getResId(idName, "color"));
    }

    public static int getColor(Context context, String idName) {
        return context.getColor(getResId(idName, "color"));
    }

    public static ColorStateList getColorStateList(String idName) {
        return getContext().getColorStateList(getResId(idName, "color"));
    }

    public static ColorStateList getColorStateList(Context context, String idName) {
        return context.getColorStateList(getResId(idName, "color"));
    }

    public static void reboot() {
        Context context = getContext();
        PackageManager pm = context.getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage(context.getPackageName());
        if (intent != null)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ActivityManager am = context.getSystemService(ActivityManager.class);
        if (am != null)
            for (ActivityManager.AppTask task : am.getAppTasks())
                task.finishAndRemoveTask();
        context.startActivity(intent);
        System.exit(0);
    }

    @Keep
    public static String getMobiApp() {
        if (TextUtils.isEmpty(mobiApp)) {
            String mobiApp = null;
            Context context = getContext();
            try {
                mobiApp = context.getPackageManager()
                        .getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA)
                        .metaData.getString("MOBI_APP");
            } catch (PackageManager.NameNotFoundException ignored) {
            }
            if (TextUtils.isEmpty(mobiApp)) {
                mobiApp = switch (context.getPackageName()) {
                    case Constants.BLUE_PACKAGE_NAME -> "android_b";
                    case Constants.PLAY_PACKAGE_NAME -> "android_i";
                    case Constants.HD_PACKAGE_NAME -> "android_hd";
                    default -> "android";
                };
            }
            Utils.mobiApp = mobiApp;
        }
        return mobiApp;
    }

    public static boolean isPink() {
        Boolean pink = isPink;
        if (pink == null) {
            pink = "android".equals(getMobiApp());
            isPink = pink;
        }
        return pink;
    }

    public static boolean isBlue() {
        Boolean blue = isBlue;
        if (blue == null) {
            blue = "android_b".equals(getMobiApp());
            isBlue = blue;
        }
        return blue;
    }

    public static boolean isPlay() {
        Boolean play = isPlay;
        if (play == null) {
            play = "android_i".equals(getMobiApp());
            isPlay = play;
        }
        return play;
    }

    public static boolean isHd() {
        Boolean hd = isHd;
        if (hd == null) {
            hd = "android_hd".equals(getMobiApp());
            isHd = hd;
        }
        return hd;
    }

    public static boolean isCurrentlyOnMainThread() {
        return Looper.getMainLooper().isCurrentThread();
    }

    public static void runOnMainThread(Runnable runnable) {
        runOnMainThread(0L, runnable);
    }

    public static void runOnMainThread(long delayMills, Runnable runnable) {
        if (delayMills == 0L) {
            if (isCurrentlyOnMainThread()) {
                runnable.run();
            } else {
                mainHandler.post(runnable);
            }
        } else {
            mainHandler.postDelayed(runnable, delayMills);
        }
    }

    public static void async(Runnable runnable) {
        asyncHandler.getValue().post(runnable);
    }

    public static void async(long delay, Runnable runnable) {
        asyncHandler.getValue().postDelayed(runnable, delay);
    }

    public static <T> Future<T> submitTask(Callable<T> task) {
        FutureTask<T> futureTask = new FutureTask<>(task);
        asyncHandler.getValue().post(futureTask);
        return futureTask;
    }

    @SuppressWarnings("deprecation")
    public static boolean currentIsLandscape() {
        WindowManager windowManager = getContext().getSystemService(WindowManager.class);
        int orientation = windowManager.getDefaultDisplay().getOrientation();
        return orientation == Surface.ROTATION_90 || orientation == Surface.ROTATION_270;
    }

    @Keep
    // codes will filled by patcher
    public static String signQuery(Map<String, String> params) {
        return "";
    }

    @Keep
    // codes will filled by patcher
    public static String getAppKey() {
        return "";
    }

    @Keep
    public static IvParameterSpec getAesIv(String appKey) {
        return null;
    }

    @Keep
    // codes will filled by patcher
    @NonNull
    public static SharedPreferences blkvPrefsByName(String name, boolean multiProcess) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public static SharedPreferences rawBlkvPrefsByFile(String name, boolean multiProcess) {
        return blkvPrefsByFile(new File(getContext().getDir("blkv", Context.MODE_PRIVATE), name + ".raw_kv"), multiProcess);
    }

    @Keep
    // codes will filled by patcher
    @NonNull
    public static SharedPreferences blkvPrefsByFile(File file, boolean multiProcess) {
        throw new UnsupportedOperationException();
    }

    @Keep
    // codes will filled by patcher
    public static boolean getAb(String key, boolean defValue) {
        return false;
    }

    @Keep
    // codes will filled by patcher
    @Nullable
    public static String getConfig(String key, @Nullable String defValue) {
        throw new UnsupportedOperationException();
    }

    @Keep
    public static void routeTo(Uri uri, Context context) {
    }

    public static boolean isNightFollowSystem() {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.O)
            return false;
        var setting = KtUtils.getDeviceSetting(NightSettingsConfig.class);
        if (setting == null)
            return false;
        return setting.getIsNightFollowSystem().getValue();
    }

    public static String currentProcessName() {
        String name = "";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            name = Application.getProcessName();
        } else try {
            name = ActivityThread.currentProcessName();
        } catch (Throwable ignored) {
        }
        return name;
    }

    public static String currentPackageName() {
        String name = "";
        Context context = getContext();
        if (context != null) {
            name = context.getPackageName();
        } else try {
            name = ActivityThread.currentPackageName();
        } catch (Throwable ignored) {
        }
        return name;
    }

    public static boolean isMainProcess() {
        String name = currentProcessName();
        return !name.isEmpty() && !name.contains(":");
    }

    public static boolean isWebProcess() {
        return currentProcessName().endsWith(":web");
    }

    public static boolean newPlayerEnabled() {
        if (Versions.ge7_39_0())
            return getAb("ff_unite_detail2", false);
        return getAb("ff_unite_player", false);
    }

    @Keep
    // used by patcher
    public static String[] removeHeader(String[] namesAndValues, String name) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, namesAndValues);
        int i = 0;
        while (i < list.size()) {
            if (name.equalsIgnoreCase(list.get(i))) {
                list.remove(i);
                list.remove(i);
                i -= 2;
            }
            i += 2;
        }
        return list.toArray(new String[0]);
    }
}
