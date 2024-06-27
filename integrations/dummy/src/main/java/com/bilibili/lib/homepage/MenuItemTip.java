package com.bilibili.lib.homepage;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: BL */
@Keep
/* loaded from: classes8.dex */
public final class MenuItemTip implements Comparable<MenuItemTip> {

    @JSONField(deserialize = false, serialize = false)
    private boolean clicked;

    @JSONField(name = "content")
    @Nullable
    private String content;

    @JSONField(deserialize = false, serialize = false)
    private boolean exposed;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    /* renamed from: id, reason: collision with root package name */
    @JSONField(name = "id")
    @Nullable
    private String f121018id;

    @JSONField(deserialize = false, serialize = false)
    private boolean localDefault;

    @JSONField(name = "prank")
    private int prank;

    @JSONField(deserialize = false, serialize = false)
    private boolean tempHidden;

    @JSONField(name = "url")
    @Nullable
    private String url;

    public final boolean checkValid() {
        if (!this.clicked && !this.tempHidden) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z14;
        boolean z15;
        boolean z16;
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(MenuItemTip.class, obj.getClass())) {
            return false;
        }
        MenuItemTip menuItemTip = (MenuItemTip) obj;
        String str = this.f121018id;
        if (str == null ? menuItemTip.f121018id != null : !Intrinsics.areEqual(str, menuItemTip.f121018id)) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            return false;
        }
        String str2 = this.content;
        if (str2 == null ? menuItemTip.content != null : !Intrinsics.areEqual(str2, menuItemTip.content)) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            return false;
        }
        String str3 = this.icon;
        if (str3 == null ? menuItemTip.icon != null : !Intrinsics.areEqual(str3, menuItemTip.icon)) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 || this.prank != menuItemTip.prank) {
            return false;
        }
        String str4 = this.url;
        String str5 = menuItemTip.url;
        if (str4 != null) {
            return Intrinsics.areEqual(str4, str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public final boolean getClicked() {
        return this.clicked;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final boolean getExposed() {
        return this.exposed;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getId() {
        return this.f121018id;
    }

    public final boolean getLocalDefault() {
        return this.localDefault;
    }

    public final int getPrank() {
        return this.prank;
    }

    public final boolean getTempHidden() {
        return this.tempHidden;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean hasIcon() {
        return true;
    }

    public int hashCode() {
        int i14;
        int i15;
        int i16;
        String str = this.f121018id;
        int i17 = 0;
        if (str != null && str != null) {
            i14 = str.hashCode();
        } else {
            i14 = 0;
        }
        int i18 = i14 * 31;
        String str2 = this.content;
        if (str2 != null && str2 != null) {
            i15 = str2.hashCode();
        } else {
            i15 = 0;
        }
        int i19 = (i18 + i15) * 31;
        String str3 = this.icon;
        if (str3 != null && str3 != null) {
            i16 = str3.hashCode();
        } else {
            i16 = 0;
        }
        int i24 = (i19 + i16) * 31;
        String str4 = this.url;
        if (str4 != null && str4 != null) {
            i17 = str4.hashCode();
        }
        return ((i24 + i17) * 31) + this.prank;
    }

    public final void setClicked(boolean z14) {
        this.clicked = z14;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setExposed(boolean z14) {
        this.exposed = z14;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(@Nullable String str) {
        this.f121018id = str;
    }

    public final void setLocalDefault(boolean z14) {
        this.localDefault = z14;
    }

    public final void setPrank(int i14) {
        this.prank = i14;
    }

    public final void setTempHidden(boolean z14) {
        this.tempHidden = z14;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "GameTip{id='" + this.f121018id + "', content='" + this.content + "', icon='" + this.icon + "', url=" + this.url + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nullable MenuItemTip menuItemTip) {
        return Intrinsics.compare(this.prank, menuItemTip != null ? menuItemTip.prank : 0);
    }
}
