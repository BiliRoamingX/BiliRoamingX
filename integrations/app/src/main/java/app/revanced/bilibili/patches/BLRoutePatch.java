package app.revanced.bilibili.patches;

import android.net.Uri;
import android.text.TextUtils;

import androidx.annotation.Keep;

import com.bapis.bilibili.app.view.v1.Relate;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bapis.bilibili.app.viewunite.common.RelateCardType;

import java.util.List;
import java.util.regex.Pattern;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Logger;

public class BLRoutePatch {
    private static final String STORY_ROUTER_QUERY = "&-Arouter=story";
    private static final String STORY_TYPE_QUERY = "&-Atype=story";
    private static final Pattern playerPreloadRegex = Pattern.compile("&player_preload=[^&]*");

    private static boolean needRemovePayload() {
        return VideoQualityPatch.halfScreenQuality() != 0 || VideoQualityPatch.getMatchedFullScreenQuality() != 0 || Settings.DefaultPlaybackSpeed.get() != 0f;
    }

    @Keep
    public static Uri intercept(Uri uri) {
        if (uri == null) return null;
        Logger.debug(() -> "Route uri: " + uri);
        String scheme = uri.getScheme();
        String url = uri.toString();
        if ("bilibili".equals(scheme)) {
            boolean needRemovePayload = needRemovePayload();
            String authority = uri.getEncodedAuthority();
            if ("story".equals(authority) || "video".equals(authority)) {
                Uri.Builder newUri = uri.buildUpon();
                if ("story".equals(authority) && Settings.ReplaceStoryVideo.get())
                    newUri.authority("video");
                String newQuery = uri.getEncodedQuery();
                if (!TextUtils.isEmpty(newQuery)) {
                    if (Settings.ReplaceStoryVideo.get())
                        newQuery = newQuery.replace(STORY_ROUTER_QUERY, "").replace(STORY_TYPE_QUERY, "");
                    if (needRemovePayload)
                        newQuery = playerPreloadRegex.matcher(newQuery).replaceAll("");
                }
                newUri.encodedQuery(newQuery);
                return newUri.build();
            } else if (url.startsWith("bilibili://music/playlist/playpage") && !url.equals("bilibili://music/playlist/playpage/0")) {
                String aid = uri.getQueryParameter("aid");
                String pageType = uri.getQueryParameter("page_type");
                var newUri = uri.buildUpon();
                if (needRemovePayload) {
                    String newQuery = playerPreloadRegex.matcher(uri.getEncodedQuery()).replaceAll("");
                    newUri.encodedQuery(newQuery);
                }
                if ("1".equals(Settings.PlayerVersion.get())) {
                    newUri.appendQueryParameter("force_old_playlist", "1");
                    if ("10".equals(pageType) && !TextUtils.isEmpty(aid))
                        newUri.encodedAuthority("video").encodedPath(aid);
                }
                return newUri.build();
            } else if (Settings.AddChannel.get() && url.startsWith("bilibili://pegasus/channel/v2")) {
                // for hd, consistent with the default behavior of selecting "select" tab before deleting the "topic" tab
                if (TextUtils.isEmpty(uri.getQueryParameter("tab")))
                    return uri.buildUpon().appendQueryParameter("tab", "select").build();
            }
        } else if ("https".equals(scheme)) {
            if (url.startsWith("https://www.bilibili.com/bangumi/play")) {
                if (needRemovePayload())
                    return Uri.parse(playerPreloadRegex.matcher(url).replaceAll(""));
            } else if (Settings.ReplaceStoryVideo.get() && url.startsWith("https://www.bilibili.com/video")) {
                return Uri.parse(url.replace(STORY_ROUTER_QUERY, "").replace(STORY_TYPE_QUERY, ""));
            } else if (Settings.DefaultMaxQn.get() && url.startsWith("https://live.bilibili.com")) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    Uri.Builder builder = uri.buildUpon().clearQuery();
                    for (String name : uri.getQueryParameterNames()) {
                        if (!"current_qn".equals(name) && !"current_quality".equals(name)
                                && !"playurl_h264".equals(name) && !"playurl_h265".equals(name)) {
                            String value = uri.getQueryParameter(name);
                            builder.appendQueryParameter(name, value);
                        }
                    }
                    return builder.build();
                }
            }
        }
        return uri;
    }

    public static void removePayloadIfNeeded(List<Relate> cards) {
        if (!needRemovePayload()) return;
        for (int i = 0; i < cards.size(); i++) {
            var card = cards.get(i);
            var aGoto = card.getGoto();
            if ("av".equals(aGoto)) {
                var newUri = playerPreloadRegex.matcher(card.getUri()).replaceAll("");
                card.setUri(newUri);
            }
        }
    }

    public static void removePayloadUniteIfNeeded(List<RelateCard> cards) {
        if (!needRemovePayload()) return;
        for (int i = 0; i < cards.size(); i++) {
            var card = cards.get(i);
            var cardType = card.getRelateCardType();
            if (cardType == RelateCardType.AV) {
                var basicInfo = card.getBasicInfo();
                var newUri = playerPreloadRegex.matcher(basicInfo.getUri()).replaceAll("");
                basicInfo.setUri(newUri);
            }
        }
    }
}
