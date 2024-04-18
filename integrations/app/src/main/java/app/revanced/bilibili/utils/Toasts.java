package app.revanced.bilibili.utils;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.Keep;

public class Toasts {

    private Toasts() {
        throw new AssertionError("no instance for you!");
    }

    public static void showShortWithId(String idName) {
        var message = Utils.getString(idName);
        show(message, Toast.LENGTH_SHORT);
    }

    public static void showLongWithId(String idName) {
        var message = Utils.getString(idName);
        show(message, Toast.LENGTH_LONG);
    }

    public static void showShortWithId(String idName, Object... formatArgs) {
        var message = Utils.getString(idName, formatArgs);
        show(message, Toast.LENGTH_SHORT);
    }

    public static void showLongWithId(String idName, Object... formatArgs) {
        var message = Utils.getString(idName, formatArgs);
        show(message, Toast.LENGTH_LONG);
    }

    public static void showShort(String message) {
        show(message, Toast.LENGTH_SHORT);
    }

    public static void showLong(String message) {
        show(message, Toast.LENGTH_LONG);
    }

    private static void show(String message, int duration) {
        var prefixMessage = Utils.getString("biliroaming_toast_prefix");
        var finalMessage = prefixMessage + message;
        Utils.runOnMainThread(() -> {
            cancel();
            show(Utils.getContext(), finalMessage, duration);
        });
    }

    @Keep
    // codes will filled by patcher
    static void cancel() {
        // nop
    }

    @Keep
    // codes will filled by patcher
    static void show(Context context, String message, int duration) {
        // nop
    }
}
