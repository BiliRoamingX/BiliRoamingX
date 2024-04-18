package com.bilibili.lib.homepage.mine;

import androidx.annotation.Nullable;

import java.util.List;

public class MenuGroup {

    @Nullable
    public MineButton button;
    @Nullable
    public List<Item> itemList;
    public int style;
    public String title;

    public static class Item {
        public String icon;
        public long id;
        public int redDot;
        public boolean redDotRorNew;
        public String title;
        public String uri;
    }

    public static class MineButton {
        public String icon;
        public String jumpUrl;
        public int style;
        public String text;
    }
}
