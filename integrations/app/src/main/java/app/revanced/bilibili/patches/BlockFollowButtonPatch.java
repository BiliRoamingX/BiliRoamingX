package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

@Keep
public class BlockFollowButtonPatch {
    public static boolean shouldShowCommentFollow(boolean original) {
        if (Settings.BLOCK_FOLLOW_BUTTON.getStringSet().contains("comment"))
            return false;
        return original;
    }

    public static boolean shouldShowDynamicFollow(boolean original) {
        if (Settings.BLOCK_FOLLOW_BUTTON.getStringSet().contains("dynamic"))
            return false;
        return original;
    }
}
