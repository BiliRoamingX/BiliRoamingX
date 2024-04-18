package app.revanced.bilibili.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

@SuppressWarnings("unchecked")
public class Widgets {
    public static <T extends View> T createTintView(Context context, String name) {
        //noinspection DataFlowIssue
        return (T) LayoutInflater.from(context).getFactory2().onCreateView(name, context, null);
    }
}
