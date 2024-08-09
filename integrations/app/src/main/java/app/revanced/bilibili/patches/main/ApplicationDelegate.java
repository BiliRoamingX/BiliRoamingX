package app.revanced.bilibili.patches.main;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;

import com.bilibili.app.preferences.BiliPreferencesActivity;
import com.bilibili.bplus.im.setting.MessageTipItemActivity;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.magicasakura.widgets.TintRadioButton;
import com.bilibili.magicasakura.widgets.TintSwitchCompat;
import com.bilibili.video.story.StoryVideoActivity;

import org.lsposed.hiddenapibypass.HiddenApiBypass;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import app.revanced.bilibili.account.PassportChangeReceiver;
import app.revanced.bilibili.patches.CustomThemePatch;
import app.revanced.bilibili.patches.DpiPatch;
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.CrossProcessPreferences;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.Logger;
import app.revanced.bilibili.utils.Reflex;
import app.revanced.bilibili.utils.SubtitleParamsCache;
import app.revanced.bilibili.utils.Themes;
import app.revanced.bilibili.utils.UposReplacer;
import app.revanced.bilibili.utils.Utils;
import app.revanced.bilibili.utils.Versions;
import tv.danmaku.bili.MainActivityV2;

public abstract class ApplicationDelegate extends Application {
    private static final ArrayDeque<WeakReference<Activity>> activityRefs = new ArrayDeque<>();
    private static final Point screenSize = new Point();
    private static final Map<String, String> originalSignatures = new HashMap<>();
    private static boolean attached = false;

    static {
        try {
            System.loadLibrary("biliroamingx");
        } catch (Throwable t) {
            Logger.error(t, () -> "Failed to load biliroamingx library");
        }
        String officialSignature = "MIICVzCCAcCgAwIBAgIETzuw7DANBgkqhkiG9w0BAQUFADBvMQswCQYDVQQGEwJDTjESMBAGA1UECBMJR3Vhbmdkb25nMQ8wDQYDVQQHEwZaaHVoYWkxEzARBgNVBAoTCmRhbm1ha3UudHYxEzARBgNVBAsTCmRhbm1ha3UudHYxETAPBgNVBAMTCEJiY2FsbGVuMCAXDTEyMDIxNTEzMTk0MFoYDzIwNjYxMTE4MTMxOTQwWjBvMQswCQYDVQQGEwJDTjESMBAGA1UECBMJR3Vhbmdkb25nMQ8wDQYDVQQHEwZaaHVoYWkxEzARBgNVBAoTCmRhbm1ha3UudHYxEzARBgNVBAsTCmRhbm1ha3UudHYxETAPBgNVBAMTCEJiY2FsbGVuMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC/yXoLdjq+kkrwvAanfPzULANSIYvflMMGnuAEbXOazIDymmNXaUPTEL3Jn9+Ssxiyvrgqpu18HaK4MJtzaj1ajUU3BMXdtCL83POUW37sFWhOiYbKW+K87VYq/utk+ZIplrXtWKB4P3Ll1sUNsfsxQmrR9kpVWkhUMUNgH2wcEQIDAQABMA0GCSqGSIb3DQEBBQUAA4GBAAC3ZtZ7Mw69jZSmcEH8TNxjM36q5V9rsntK+o92nW1wIKoSoQRMN4SfJumqqrou4T4aAcRDMkKNeYMiE+GCOJQMy5WnhvpMhgLkmajgBo4tTIQnNzqeDUt429HxpcpBBpjM+YrYdGhKb+xUd4lzvJFPRKp7DmPt6c5SwM6ZtiB/";
        fakeSignatures(Pair.create(Utils.currentPackageName(), officialSignature));
    }

    public static Map<String, String> originalSignatures() {
        return Collections.unmodifiableMap(originalSignatures);
    }

    public static boolean attached() {
        return attached;
    }

    @Keep // anti R8 virtual method auto final, see https://issuetracker.google.com/issues/329541426
    @Override
    public void onCreate() {
        super.onCreate();
        long start = System.currentTimeMillis();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallback());
        registerComponentCallbacks(new ComponentCallbacks());
        updateBitmapDefaultDensity();
        PassportChangeReceiver.register();
        CustomThemePatch.refresh();
        Utils.async(2000L, CustomThemePatch::delayRefresh);
        if (Utils.isMainProcess()) {
            Utils.async(ApplicationDelegate::startLog);
            SubtitleParamsCache.updateFont();
            KtUtils.getAreaTask();
            UposReplacer.getBaseUposList();
            Themes.registerGarbChangeObserver();
            Utils.async(500L, BangumiSeasonHook::injectExtraSearchTypes);
            Utils.async(500L, BangumiSeasonHook::injectExtraSearchTypesV2);
            Utils.async(2000L, CouponAutoReceiver::check);
        }
        long end = System.currentTimeMillis();
        Logger.debug(() -> String.format("Initializing BiliRoamingX on process %s cost %s ms", Utils.currentProcessName(), end - start));
    }

    @Keep // anti R8 virtual method auto final, see https://issuetracker.google.com/issues/329541426
    @Override
    protected void attachBaseContext(Context base) {
        Utils.context = this;
        super.attachBaseContext(base);
        CrossProcessPreferences.init(this);
        attached = true;
    }

    @Keep
    public static Resources getAppResources() {
        if (!attached) {
            return Resources.getSystem();
        } else {
            return Utils.getContext().getResources();
        }
    }

    @SafeVarargs
    private static void fakeSignatures(Pair<String, String>... pairs) {
        Parcelable.Creator<PackageInfo> originalCreator = PackageInfo.CREATOR;
        Parcelable.Creator<PackageInfo> newCreator = new Parcelable.Creator<>() {
            @Override
            public PackageInfo createFromParcel(Parcel source) {
                PackageInfo packageInfo = originalCreator.createFromParcel(source);
                if (!originalSignatures.containsKey(packageInfo.packageName) && packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                    Signature signature = packageInfo.signatures[0];
                    String signatureBase64 = Base64.encodeToString(signature.toByteArray(), Base64.NO_WRAP);
                    originalSignatures.put(packageInfo.packageName, signatureBase64);
                }
                for (Pair<String, String> pair : pairs) {
                    String packageName = pair.first;
                    String signatureData = pair.second;
                    if (packageInfo.packageName.equals(packageName)) {
                        Signature fakeSignature = new Signature(Base64.decode(signatureData, Base64.DEFAULT));
                        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                            packageInfo.signatures[0] = fakeSignature;
                        }
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                            if (packageInfo.signingInfo != null) {
                                Signature[] signaturesArray = packageInfo.signingInfo.getApkContentsSigners();
                                if (signaturesArray != null && signaturesArray.length > 0) {
                                    signaturesArray[0] = fakeSignature;
                                }
                            }
                        }
                        break;
                    }
                }
                return packageInfo;
            }

            @Override
            public PackageInfo[] newArray(int size) {
                return originalCreator.newArray(size);
            }
        };
        try {
            Reflex.setStaticObjectField(PackageInfo.class, "CREATOR", newCreator);
        } catch (Throwable t) {
            Logger.error(t, () -> "Failed to set PackageInfo.CREATOR");
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            HiddenApiBypass.addHiddenApiExemptions("Landroid/os/Parcel;", "Landroid/content/pm/PackageManager;", "Landroid/app/PropertyInvalidatedCache;");
        }
        try {
            Object cache = Reflex.getStaticObjectField(PackageManager.class, "sPackageInfoCache");
            Reflex.callMethod(cache, "clear");
        } catch (NoSuchFieldError ignored) {
        } catch (Throwable t) {
            Logger.error(t, () -> "Failed to clear PackageManager.sPackageInfoCache");
        }
        try {
            Map<?, ?> mCreators = Reflex.getStaticObjectField(Parcel.class, "mCreators");
            mCreators.clear();
        } catch (NoSuchFieldError ignored) {
        } catch (Throwable t) {
            Logger.error(t, () -> "Failed to clear Parcel.mCreators");
        }
        try {
            Map<?, ?> sPairedCreators = Reflex.getStaticObjectField(Parcel.class, "sPairedCreators");
            sPairedCreators.clear();
        } catch (NoSuchFieldError ignored) {
        } catch (Throwable t) {
            Logger.error(t, () -> "Failed to clear Parcel.sPairedCreators");
        }
    }

    @Keep // anti R8 virtual method auto final, see https://issuetracker.google.com/issues/329541426
    @Override
    public Resources getResources() {
        var resources = super.getResources();
        if (!attached) return resources;
        int newDpi = getCustomDpi();
        if (newDpi != 0) {
            updateDpi(resources.getDisplayMetrics(), newDpi);
            Configuration configuration = resources.getConfiguration();
            configuration.densityDpi = newDpi;
            var newAxisDpi = calcNewAxisDpi();
            configuration.screenWidthDp = newAxisDpi.first;
            configuration.screenHeightDp = newAxisDpi.second;
        }
        return resources;
    }

    @Keep
    static void updateBitmapDefaultDensity() {
        // to let pictures like cover show correctly when customizing dpi.
        float scale = DpiPatch.displayScale;
        if (scale != 0f) {
            float density = Resources.getSystem().getDisplayMetrics().density;
            int newDpi = (int) ((density + scale) * 160);
            try {
                Reflex.callStaticMethod(Bitmap.class, "setDefaultDensity", newDpi);
            } catch (Throwable t) {
                Logger.error(t, () -> "Failed to update bitmap default density");
            }
        }
    }

    @Keep
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

    @Keep
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
        var newDensity = newDpi / 160f;
        dm.densityDpi = newDpi;
        dm.density = newDensity;
        dm.scaledDensity = newDensity;
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
        if (!Settings.Debug.get())
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
                            Logger.LOG_TAG,
                            "*:S"
                    }
            );
        } catch (Throwable ignored) {
        }
    }

    static class SettingsLayoutFactory implements LayoutInflater.Factory2 {

        private final LayoutInflater.Factory2 delegate;

        public SettingsLayoutFactory(LayoutInflater.Factory2 delegate) {
            this.delegate = delegate;
        }

        public View redirectView(String name, Context context, AttributeSet attrs) {
            if (name.equals("CheckBox")) {
                TintCheckBox checkBox = new TintCheckBox(context, attrs);
                int drawableId = Utils.getResId("abc_btn_check_material_anim", "drawable");
                int tintId = Utils.getResId("selector_compoundbutton_normal", "color");
                checkBox.setButtonDrawable(drawableId);
                checkBox.setCompoundButtonTintList(tintId);
                return checkBox;
            } else if (name.equals("RadioButton")) {
                TintRadioButton radioButton = new TintRadioButton(context, attrs);
                int drawableId = Utils.getResId("abc_btn_radio_material_anim", "drawable");
                int tintId = Utils.getResId("selector_radiobutton_preference_tint", "color");
                radioButton.setButtonDrawable(drawableId);
                radioButton.setCompoundButtonTintList(tintId);
                radioButton.setText(null);
                return radioButton;
            } else if (name.equals(SwitchCompat.class.getName())) {
                TintSwitchCompat switchCompat = new TintSwitchCompat(context, attrs);
                Drawable trackDrawable = Utils.getDrawable("abc_switch_track_mtrl_alpha");
                Drawable thumbDrawable = Utils.getDrawable("abc_switch_thumb_material");
                switchCompat.setTrackDrawable(trackDrawable);
                switchCompat.setThumbDrawable(thumbDrawable);
                switchCompat.setTrackTintList(Utils.getResId("selector_switch_track", "color"));
                switchCompat.setThumbTintList(Utils.getResId("selector_switch_thumb", "color"));
                trackDrawable.setTintMode(PorterDuff.Mode.SRC_IN);
                thumbDrawable.setTintMode(PorterDuff.Mode.MULTIPLY);
                return switchCompat;
            } else if (context instanceof Activity activity) {
                return activity.onCreateView(name, context, attrs);
            }
            return null;
        }

        @Nullable
        @Override
        public View onCreateView(@Nullable View parent, @NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
            View view = redirectView(name, context, attrs);
            return view != null ? view : delegate.onCreateView(parent, name, context, attrs);
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
            View view = redirectView(name, context, attrs);
            return view != null ? view : delegate.onCreateView(name, context, attrs);
        }
    }

    static class ActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
            printLifecycle(activity, "onActivityCreated", true);
            activityRefs.push(new WeakReference<>(activity));
            if (activity instanceof BiliPreferencesActivity
                    || activity instanceof MessageTipItemActivity
                    || (Utils.isHd() && activity instanceof MainActivityV2)) {
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                LayoutInflater.Factory2 factory2 = layoutInflater.getFactory2();
                Reflex.setObjectField(layoutInflater, "mFactory2", new SettingsLayoutFactory(factory2));
            } else if (activity instanceof StoryVideoActivity && !Versions.ge8_9_0()) {
                int storyUIStyle = Integer.parseInt(Settings.StoryUIStyle.get());
                if (storyUIStyle != 0) {
                    SharedPreferences storyPrefs = KtUtils.getStoryPrefs();
                    if (storyPrefs.getInt("pref_story_ui_exp_style", 0) != storyUIStyle) {
                        SharedPreferences.Editor editor = storyPrefs.edit();
                        editor.putInt("pref_story_ui_exp_style", storyUIStyle);
                        editor.apply();
                    }
                }
            }
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
            Player.remove(activity);
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
            if (!Settings.Debug.get()) return;
            Logger.debug(() -> name + ", activity: " + activity.getClass().getName());
            if (!printIntent) return;
            var extras = activity.getIntent().getExtras();
            if (extras == null) return;
            for (String key : extras.keySet()) {
                var value = extras.get(key);
                Logger.debug(() -> "intent.extra, " + key + ": " + value + ", type: " + (value != null ? value.getClass().getName() : null));
            }
        }
    }

    static class ComponentCallbacks implements android.content.ComponentCallbacks {

        @Override
        public void onConfigurationChanged(@NonNull Configuration newConfig) {
            updateBitmapDefaultDensity();
        }

        @Override
        public void onLowMemory() {
        }
    }
}
