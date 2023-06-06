package app.revanced.bilibili.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;


public class ReVancedUtils {
    @SuppressLint("StaticFieldLeak")
    public static Context context;
    private static String mobiApp = "";

    public static Context getContext() {
        if (context == null) {
            LogHelper.error(() -> "Context is null");
        }
        return context;
    }

    @SuppressLint("DiscouragedApi")
    public static int getResId(String name, String type) {
        return context.getResources().getIdentifier(name, type, context.getPackageName());
    }

    public static void reboot() {
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

    public static String getMobiApp() {
        if (TextUtils.isEmpty(mobiApp)) {
            try {
                mobiApp = context.getPackageManager()
                        .getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA)
                        .metaData.getString("MOBI_APP");
                if (TextUtils.isEmpty(mobiApp)) {
                    switch (context.getPackageName()) {
                        case Constants.BLUE_PACKAGE_NAME:
                            mobiApp = "android_b";
                            break;
                        case Constants.PLAY_PACKAGE_NAME:
                            mobiApp = "android_i";
                            break;
                        case Constants.HD_PACKAGE_NAME:
                            mobiApp = "android_hd";
                            break;
                        default:
                            mobiApp = "android";
                            break;
                    }
                }
            } catch (PackageManager.NameNotFoundException ignored) {
            }
        }
        return mobiApp;
    }
}
