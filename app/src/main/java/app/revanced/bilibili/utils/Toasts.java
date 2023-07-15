package app.revanced.bilibili.utils;

import android.content.Context;
import android.widget.Toast;

public class Toasts {

    private Toasts() {
        throw new AssertionError("no instance for you!");
    }

    public static void showWithId(String idName, int duration) {
        var message = Utils.getString(idName);
        showOnMainThread(Utils.getContext(), prefixMessage() + message, duration);
    }

    public static void showShortWithId(String idName) {
        showWithId(idName, Toast.LENGTH_SHORT);
    }

    public static void showShortWithId(String idName, Object... formatArgs) {
        var message = Utils.getString(idName, formatArgs);
        showOnMainThread(Utils.getContext(), prefixMessage() + message, Toast.LENGTH_SHORT);
    }

    public static void show(String message, int duration) {
        showOnMainThread(Utils.getContext(), prefixMessage() + message, duration);
    }

    public static void showShort(String message) {
        showOnMainThread(Utils.getContext(), prefixMessage() + message, Toast.LENGTH_SHORT);
    }

    private static String prefixMessage() {
        return Utils.getString("biliroaming_toast_prefix");
    }

    private static void showOnMainThread(Context context, String message, int duration) {
        Utils.runOnMainThread(() -> {
            cancel();
            show(context, message, duration);
        });
    }

    // codes will filled by patcher
    static void cancel() {
        // nop
    }

    // codes will filled by patcher
    static void show(Context context, String message, int duration) {
        // nop
    }
}
