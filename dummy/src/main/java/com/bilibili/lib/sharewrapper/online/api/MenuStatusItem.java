package com.bilibili.lib.sharewrapper.online.api;

import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

@Keep
public class MenuStatusItem {
    @Nullable
    public Drawable iconDrawable;
    @DrawableRes
    public int iconResId;
    public String iconUrl;
    public String level;
    public String name;

    public MenuStatusItem() {
        this.iconResId = 0;
    }

    public String toString() {
        return "MenuStatusItem{name='" + this.name + "', iconUrl='" + this.iconUrl + "', level='" + this.level + "', iconResId=" + this.iconResId + ", iconDrawable=" + this.iconDrawable + '}';
    }

    public MenuStatusItem(String str, String str2, String str3) {
        this.iconResId = 0;
        this.name = str;
        this.iconUrl = str2;
        this.level = str3;
    }

    public MenuStatusItem(String str, String str2, int i) {
        this.iconResId = 0;
        this.name = str;
        this.level = str2;
        this.iconResId = i;
    }

    public MenuStatusItem(String str, String str2, @Nullable Drawable drawable) {
        this.iconResId = 0;
        this.name = str;
        this.level = str2;
        this.iconDrawable = drawable;
    }

    public MenuStatusItem(String str, String str2, String str3, int i) {
        this.iconResId = 0;
        this.name = str;
        this.iconUrl = str2;
        this.level = str3;
        this.iconResId = i;
    }
}
