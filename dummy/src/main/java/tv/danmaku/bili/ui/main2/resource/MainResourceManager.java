package tv.danmaku.bili.ui.main2.resource;

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

        Tab() {
        }
    }
}
