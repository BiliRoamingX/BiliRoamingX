package app.revanced.bilibili.patches;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Constants;

public class TextFoldPatch {
    public static long getCommentMaxLines(long original) {
        var maxLines = Settings.TEXT_FOLD_COMMENT_MAX_LINES.getInt();
        if (maxLines != Constants.DEF_COMMENT_MAX_LINES)
            return maxLines;
        return original;
    }

    public static int getDynMaxLines(int original) {
        var maxLines = Settings.TEXT_FOLD_DYN_MAX_LINES.getInt();
        if (original == Constants.DEF_DYN_MAX_LINES && maxLines != Constants.DEF_DYN_MAX_LINES)
            return maxLines;
        return original;
    }

    public static int getDynLinesToAll(int original) {
        var linesToAll = Settings.TEXT_FOLD_DYN_LINES_TO_ALL.getInt();
        if (linesToAll != Constants.DEF_DYN_LINES_TO_ALL)
            return linesToAll;
        return original;
    }
}
