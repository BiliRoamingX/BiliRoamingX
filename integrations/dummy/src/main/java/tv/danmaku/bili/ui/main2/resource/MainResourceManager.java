package tv.danmaku.bili.ui.main2.resource;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class MainResourceManager {
    public static class TabResponse {
        public TabData tabData;
    }

    public static class TabData {
        public List<Tab> bottom;
        public List<Tab> moreCategory;
        public List<Tab> tab;
        public List<Tab> top;
        public TopLeftInfo topLeftInfo;
    }

    public static class Tab {
        public String icon;
        public String iconSelected;
        public String name;
        public int pos;
        public String reportId;
        public int selected;
        public String tabId;
        public int type;
        public String uri;

        public Tab() {
        }
    }

    @Keep
    /* loaded from: classes18.dex */
    public static class TopLeftInfo {
        @Nullable
        @JSONField(name = "game_background_image")
        public String gameBackgroundImage;
        @Nullable
        @JSONField(name = "game_foreground_image")
        public String gameForegroundImage;
        @JSONField(name = "goto")
        public int gotoFlag;
        @JSONField(name = "has_recent_tab")
        public int hasRecentTab;
        @Nullable
        @JSONField(name = "listen_background_image")
        public String podcastBackgroundImage;
        @Nullable
        @JSONField(name = "listen_foreground_image")
        public String podcastForegroundImage;
        @Nullable
        @JSONField(name = "story_background_image")
        public String storyBackgroundImage;
        @Nullable
        @JSONField(name = "story_foreground_image")
        public String storyForegroundImage;
        @Nullable
        @JSONField(name = "url")
        public String url;
    }
}
