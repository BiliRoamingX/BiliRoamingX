package app.revanced.bilibili.patches;

import com.bapis.bilibili.app.distribution.setting.experimental.TopLeft;

import app.revanced.bilibili.settings.Settings;

public class DisableMainPageStoryPatch {
    public static void disableMainPageStory(TopLeft topLeft) {
        if (!Settings.DISABLE_MAIN_PAGE_STORY.getBoolean() || topLeft == null)
            return;
        topLeft.clearBadge();
        topLeft.clearListenBackgroundImage();
        topLeft.clearListenForegroundImage();
        topLeft.clearStoryBackgroundImage();
        topLeft.clearStoryForegroundImage();
        var tabUrl = "bilibili://root?tab_name=我的";
        topLeft.getUrl().setValue(tabUrl);
        topLeft.getUrlV2().setValue(tabUrl);
        topLeft.getGoto().setValue("1");
        topLeft.getGotoV2().setValue(1L);
    }
}
