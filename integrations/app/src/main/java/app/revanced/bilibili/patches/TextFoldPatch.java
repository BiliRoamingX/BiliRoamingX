package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Constants;

@Keep
public class TextFoldPatch {
    public static long getCommentMaxLines(long original) {
        int maxLines = Settings.TextFoldCommentMaxLines.get();
        if (maxLines != Constants.DEF_COMMENT_MAX_LINES)
            return maxLines;
        return original;
    }

    public static int getDynMaxLines(int original) {
        int maxLines = Settings.TextFoldDynMaxLines.get();
        if (original == Constants.DEF_DYN_MAX_LINES && maxLines != Constants.DEF_DYN_MAX_LINES)
            return maxLines;
        return original;
    }

    public static int getDynLinesToAll(int original) {
        int linesToAll = Settings.TextFoldDynLinesToAll.get();
        if (linesToAll != Constants.DEF_DYN_LINES_TO_ALL)
            return linesToAll;
        return original;
    }
}
