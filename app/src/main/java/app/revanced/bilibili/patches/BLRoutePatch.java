package app.revanced.bilibili.patches;

import android.net.Uri;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;

public class BLRoutePatch {
    public static Uri intercept(Uri uri) {
        String scheme = uri.getScheme();
        if ("bilibili".equals(scheme)) {
            if (Settings.REPLACE_STORY_VIDEO.getBoolean()
                    && "story".equals(uri.getAuthority())) {
                return uri.buildUpon().authority("video")
                        .build();
            }
        }
        LogHelper.debug(() -> "kofua, route uri: " + uri);
        return uri;
    }
}
