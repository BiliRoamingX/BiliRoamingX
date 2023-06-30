package app.revanced.bilibili.patches;

import android.net.Uri;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;

public class BLRoutePatch {
    private static final String STORY_ROUTER_PARAM = "&-Arouter=story";

    public static Uri intercept(Uri uri) {
        String scheme = uri.getScheme();
        String url;
        if ("bilibili".equals(scheme)) {
            if (Settings.REPLACE_STORY_VIDEO.getBoolean()) {
                if ("story".equals(uri.getAuthority()))
                    return uri.buildUpon().authority("video").build();
                else if ("video".equals(uri.getAuthority()) && (url = uri.toString()).contains(STORY_ROUTER_PARAM))
                    return Uri.parse(url.replace(STORY_ROUTER_PARAM, ""));
            }
        }
        LogHelper.debug(() -> "Route uri: " + uri);
        return uri;
    }
}
