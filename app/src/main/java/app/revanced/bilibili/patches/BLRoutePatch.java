package app.revanced.bilibili.patches;

import android.net.Uri;
import android.text.TextUtils;

import java.util.regex.Pattern;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;

public class BLRoutePatch {
    private static final String STORY_ROUTER_PARAM = "&-Arouter=story";
    private static final Pattern playerPreloadRegex = Pattern.compile("&player_preload=[^&]*");

    public static Uri intercept(Uri uri) {
        if (uri == null) return null;
        LogHelper.debug(() -> "Route uri: " + uri);
        String scheme = uri.getScheme();
        if ("bilibili".equals(scheme)) {
            String authority = uri.getEncodedAuthority();
            if ("story".equals(authority) || "video".equals(authority)) {
                Uri.Builder newUri = uri.buildUpon();
                if ("story".equals(authority) && Settings.REPLACE_STORY_VIDEO.getBoolean())
                    newUri.authority("video");
                String newQuery = uri.getEncodedQuery();
                if (!TextUtils.isEmpty(newQuery)) {
                    if (Settings.REPLACE_STORY_VIDEO.getBoolean())
                        newQuery = newQuery.replace(STORY_ROUTER_PARAM, "");
                    boolean needRemovePayload = VideoQualityPatch.halfScreenQuality() != 0 || VideoQualityPatch.fullScreenQuality() != 0;
                    if (needRemovePayload)
                        newQuery = playerPreloadRegex.matcher(newQuery).replaceAll("");
                }
                newUri.encodedQuery(newQuery);
                return newUri.build();
            }
        } else if ("https".equals(scheme)) {
            String url;
            boolean needRemovePayload = VideoQualityPatch.halfScreenQuality() != 0 || VideoQualityPatch.fullScreenQuality() != 0;
            if (needRemovePayload && (url = uri.toString()).startsWith("https://www.bilibili.com/bangumi/play"))
                return Uri.parse(playerPreloadRegex.matcher(url).replaceAll(""));
        }
        return uri;
    }
}
