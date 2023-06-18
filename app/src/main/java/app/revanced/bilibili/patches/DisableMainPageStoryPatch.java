package app.revanced.bilibili.patches;

import com.bapis.bilibili.app.distribution.Int64ValueEx;
import com.bapis.bilibili.app.distribution.StringValueEx;
import com.bapis.bilibili.app.distribution.setting.experimental.TopLeft;
import com.bapis.bilibili.app.distribution.setting.experimental.TopLeftEx;

import app.revanced.bilibili.settings.Settings;

public class DisableMainPageStoryPatch {
    public static void disableMainPageStory(TopLeft topLeft) {
        if (!Settings.DISABLE_MAIN_PAGE_STORY.getBoolean() || topLeft == null)
            return;
        TopLeftEx.clearBadge(topLeft);
        TopLeftEx.clearListenBackgroundImage(topLeft);
        TopLeftEx.clearListenForegroundImage(topLeft);
        TopLeftEx.clearStoryBackgroundImage(topLeft);
        TopLeftEx.clearStoryForegroundImage(topLeft);
        var tabUrl = "bilibili://root?tab_name=我的";
        StringValueEx.setValue(topLeft.getUrl(), tabUrl);
        StringValueEx.setValue(topLeft.getUrlV2(), tabUrl);
        StringValueEx.setValue(topLeft.getGoto(), "1");
        Int64ValueEx.setValue(topLeft.getGotoV2(), 1L);
    }
}
