package app.revanced.bilibili.utils;

import android.content.Context;
import android.widget.Toast;

public class Toasts {

    private Toasts() {
        throw new AssertionError("no instance for you!");
    }

    public static void showWithId(String idName, int duration) {
        var message = Utils.getString(idName);
        show(Utils.getContext(), prefixMessage() + message, duration);
    }

    public static void showShortWithId(String idName) {
        showWithId(idName, Toast.LENGTH_SHORT);
    }

    public static void show(String message, int duration) {
        show(Utils.getContext(), prefixMessage() + message, duration);
    }

    public static void showShort(String message) {
        show(Utils.getContext(), prefixMessage() + message, Toast.LENGTH_SHORT);
    }

    private static String prefixMessage() {
        return Utils.getString("biliroaming_toast_prefix");
    }

    // codes will filled by patcher
    public static void cancel() {
        // nop
    }

    // codes will filled by patcher
    private static void show(Context context, String message, int duration) {
        // nop
    }
}
