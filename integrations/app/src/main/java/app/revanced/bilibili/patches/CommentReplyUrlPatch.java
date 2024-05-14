package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import com.bapis.bilibili.main.community.reply.v1.Url;
import com.google.protobuf.MapFieldLite;

import app.revanced.bilibili.settings.Settings;

public class CommentReplyUrlPatch {
    @Keep
    public static void filterUrls(MapFieldLite<String, Url> urls) {
        if (!Settings.BlockWordSearch.get()) return;
        var iterator = urls.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            var url = entry.getValue().getAppUrlSchema();
            if (url.startsWith("bilibili://search?from=appcommentline_search"))
                iterator.remove();
        }
    }
}
