package com.bapis.bilibili.polymer.app.search.v1;

public class SearchAllResponseEx {
    public static void addNav(SearchAllResponse response, int index, Nav nav) {
        SearchAllResponse.access$900(response, index, nav);
    }

    public static void removeItem(SearchAllResponse response, int index) {
        SearchAllResponse.access$1800(response, index);
    }
}
