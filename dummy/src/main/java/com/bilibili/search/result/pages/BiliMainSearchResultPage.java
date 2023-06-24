package com.bilibili.search.result.pages;

public class BiliMainSearchResultPage {
    public static class PageTypes {
        public static final PageTypes PAGE_ALL = new PageTypes("PAGE_ALL", 0, "bilibili://search-result/all", 0, "all");
        public static final PageTypes PAGE_USER = new PageTypes("PAGE_USER", 1, "bilibili://search-result/upuser", 2, "user");
        public static final PageTypes PAGE_LIVE = new PAGE_LIVE("PAGE_LIVE", 2);
        public static final PageTypes PAGE_COLUME = new PageTypes("PAGE_COLUME", 3, "bilibili://search-result/column", 6, "read");
        public static final PageTypes PAGE_BANGUMI = new PageTypes("PAGE_BANGUMI", 4, "bilibili://search-result/new-bangumi", 7, "bangumi");
        public static final PageTypes PAGE_MOVIE = new PageTypes("PAGE_MOVIE", 5, "bilibili://search-result/new-movie", 8, "media");
        public static PageTypes[] $VALUES = $values();

        private String pageProviderUri;
        private int pageType;
        private String reportTitle;

        private static final boolean SEARCH_NEW_LIVE_FRAGMENT = true;

        static final class PAGE_LIVE extends PageTypes {
            PAGE_LIVE(String str, int i) {
                super(str, i, "bilibili://search-result/live", 4, "live");
            }

            @Override
            public String pageProviderUri() {
                return SEARCH_NEW_LIVE_FRAGMENT ? "bilibili://search-result2/live" : "bilibili://search-result/live";
            }
        }

        public PageTypes(String name, int ordinal, String pageProviderUri, int pageType, String reportTitle) {
            this.pageProviderUri = pageProviderUri;
            this.pageType = pageType;
            this.reportTitle = reportTitle;
        }

        private static /* synthetic */ PageTypes[] $values() {
            return new PageTypes[]{PAGE_ALL, PAGE_USER, PAGE_LIVE, PAGE_COLUME, PAGE_BANGUMI, PAGE_MOVIE};
        }

        public static PageTypes[] values() {
            return $VALUES.clone();
        }

        public String getPageProviderUri() {
            return this.pageProviderUri;
        }

        public int getPageType() {
            return this.pageType;
        }

        public String getReportTitle() {
            return this.reportTitle;
        }

        public String pageProviderUri() {
            return this.pageProviderUri;
        }

        public void setPageProviderUri(String str) {
            this.pageProviderUri = str;
        }

        public void setPageType(int i) {
            this.pageType = i;
        }

        public void setReportTitle(String str) {
            this.reportTitle = str;
        }
    }
}
