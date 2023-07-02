package com.bilibili.lib.ui.garb;

import android.content.Context;
import android.text.TextUtils;

import androidx.annotation.ColorInt;
import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: BL */
@Keep
/* loaded from: classes4.dex */
public final class Garb {
    private int btnBgEndColor;
    private int btnBgStartColor;
    private int btnIconColor;
    @ColorInt
    private int fontColor;
    private boolean hasAnimate;
    private long id;
    private boolean isAnimateLoop;
    private boolean isForce;
    private boolean isLoadAllFile;
    private boolean isMineAnimateLoop;
    private boolean isOp;
    private boolean isPrimaryOnly;
    private boolean isTailColorModel;
    @ColorInt
    private int mainFontColor;
    @ColorInt
    private int secondaryPageColor;
    @ColorInt
    private int sideBgColor;
    private int sideLineColor;
    private int tailColor;
    private int tailIconColor;
    private int tailIconColorNight;
    private int tailIconColorSelected;
    private int tailIconColorSelectedNight;
    private int tailSelectedColor;
    private long ver;
    @Nullable
    private String name = "";
    @Nullable
    private String colorName = "";
    @Nullable
    private String headBgPath = "";
    @Nullable
    private String headTabBgPath = "";
    @Nullable
    private String sideBgPath = "";
    @Nullable
    private String sideBottomBgPath = "";
    @Nullable
    private String tailBgPath = "";
    @Nullable
    private String headMineBgPath = "";
    @Nullable
    private String headMineSquaredBgPath = "";
    @Nullable
    private String headMineBgAnimatorPath = "";
    @NotNull
    private List<String> tailIconPath = new ArrayList<>();
    @NotNull
    private List<String> tailIconSelectedPath = new ArrayList<>();
    private boolean isDarkMode = true;
    private boolean isMainDarkMode = true;
    private boolean changeable = true;
    @Nullable
    private String btnIconPath = "";
    @Nullable
    private String btnIconSelectedPath = "";

    private final boolean isEmptyList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    public final int getBtnBgEndColor() {
        return this.btnBgEndColor;
    }

    public final int getBtnBgStartColor() {
        return this.btnBgStartColor;
    }

    public final int getBtnIconColor() {
        return this.btnIconColor;
    }

    @Nullable
    public final String getBtnIconPath() {
        return this.btnIconPath;
    }

    @Nullable
    public final String getBtnIconSelectedPath() {
        return this.btnIconSelectedPath;
    }

    public final boolean getChangeable() {
        return this.changeable;
    }

    @Nullable
    public final String getColorName() {
        return this.colorName;
    }

    public final int getFontColor() {
        return this.fontColor;
    }

    public final boolean getHasAnimate() {
        return this.hasAnimate;
    }

    @Nullable
    public final String getHeadBgPath() {
        return this.headBgPath;
    }

    @Nullable
    public final String getHeadMineBgAnimatorPath() {
        return this.headMineBgAnimatorPath;
    }

    @Nullable
    public final String getHeadMineBgPath() {
        return this.headMineBgPath;
    }

    @Nullable
    public final String getHeadMineSquaredBgPath() {
        return this.headMineSquaredBgPath;
    }

    @Nullable
    public final String getHeadTabBgPath() {
        return this.headTabBgPath;
    }

    public final long getId() {
        return this.id;
    }

    public final int getMainFontColor() {
        return this.mainFontColor;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getSecondaryPageColor() {
        return this.secondaryPageColor;
    }

    public final int getSideBgColor() {
        return this.sideBgColor;
    }

    @Nullable
    public final String getSideBgPath() {
        return this.sideBgPath;
    }

    @Nullable
    public final String getSideBottomBgPath() {
        return this.sideBottomBgPath;
    }

    public final int getSideLineColor() {
        return this.sideLineColor;
    }

    @Nullable
    public final String getTailBgPath() {
        return this.tailBgPath;
    }

    public final int getTailColor() {
        return this.tailColor;
    }

    public final int getTailIconColor() {
        return this.tailIconColor;
    }

    public final int getTailIconColorNight() {
        return this.tailIconColorNight;
    }

    public final int getTailIconColorSelected() {
        return this.tailIconColorSelected;
    }

    public final int getTailIconColorSelectedNight() {
        return this.tailIconColorSelectedNight;
    }

    @NotNull
    public final List<String> getTailIconPath() {
        return this.tailIconPath;
    }

    @NotNull
    public final List<String> getTailIconSelectedPath() {
        return this.tailIconSelectedPath;
    }

    public final int getTailSelectedColor() {
        return this.tailSelectedColor;
    }

    public final long getVer() {
        return this.ver;
    }

    public final boolean isAnimateLoop() {
        return this.isAnimateLoop;
    }

    public final boolean isBottomIconsEmpty() {
        return isEmptyList(this.tailIconPath) || isEmptyList(this.tailIconSelectedPath);
    }

    public final boolean isDarkMode() {
        return this.isDarkMode;
    }

    public final boolean isForce() {
        return this.isForce;
    }

    public final boolean isLoadAllFile() {
        return this.isLoadAllFile;
    }

    public final boolean isMainDarkMode() {
        return this.isMainDarkMode;
    }

    public final boolean isMineAnimateLoop() {
        return this.isMineAnimateLoop;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isNight() {
        if (TextUtils.isEmpty(this.colorName)) {
            return false;
        }
        return Intrinsics.areEqual(this.colorName, "black");
    }

    public final boolean isNightTheme(@NotNull Context context) {
        return false;
    }

    public final boolean isOp() {
        return this.isOp;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isPink() {
        if (TextUtils.isEmpty(this.colorName)) {
            return false;
        }
        return Intrinsics.areEqual(this.colorName, "pink");
    }

    public final boolean isPrimaryOnly() {
        return this.isPrimaryOnly;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isPure() {
        return true;
    }

    public final boolean isTailColorModel() {
        return this.isTailColorModel;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isWhite() {
        if (TextUtils.isEmpty(this.colorName)) {
            return false;
        }
        return Intrinsics.areEqual(this.colorName, "white");
    }

    public final void setAnimateLoop(boolean z) {
        this.isAnimateLoop = z;
    }

    public final void setBtnBgEndColor(int i) {
        this.btnBgEndColor = i;
    }

    public final void setBtnBgStartColor(int i) {
        this.btnBgStartColor = i;
    }

    public final void setBtnIconColor(int i) {
        this.btnIconColor = i;
    }

    public final void setBtnIconPath(@Nullable String str) {
        this.btnIconPath = str;
    }

    public final void setBtnIconSelectedPath(@Nullable String str) {
        this.btnIconSelectedPath = str;
    }

    public final void setChangeable(boolean z) {
        this.changeable = z;
    }

    public final void setColorName(@Nullable String str) {
        this.colorName = str;
    }

    public final void setDarkMode(boolean z) {
        this.isDarkMode = z;
    }

    public final void setFontColor(int i) {
        this.fontColor = i;
    }

    public final void setForce(boolean z) {
        this.isForce = z;
    }

    public final void setHasAnimate(boolean z) {
        this.hasAnimate = z;
    }

    public final void setHeadBgPath(@Nullable String str) {
        this.headBgPath = str;
    }

    public final void setHeadMineBgAnimatorPath(@Nullable String str) {
        this.headMineBgAnimatorPath = str;
    }

    public final void setHeadMineBgPath(@Nullable String str) {
        this.headMineBgPath = str;
    }

    public final void setHeadMineSquaredBgPath(@Nullable String str) {
        this.headMineSquaredBgPath = str;
    }

    public final void setHeadTabBgPath(@Nullable String str) {
        this.headTabBgPath = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLoadAllFile(boolean z) {
        this.isLoadAllFile = z;
    }

    public final void setMainDarkMode(boolean z) {
        this.isMainDarkMode = z;
    }

    public final void setMainFontColor(int i) {
        this.mainFontColor = i;
    }

    public final void setMineAnimateLoop(boolean z) {
        this.isMineAnimateLoop = z;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOp(boolean z) {
        this.isOp = z;
    }

    public final void setPrimaryOnly(boolean z) {
        this.isPrimaryOnly = z;
    }

    public final void setSecondaryPageColor(int i) {
        this.secondaryPageColor = i;
    }

    public final void setSideBgColor(int i) {
        this.sideBgColor = i;
    }

    public final void setSideBgPath(@Nullable String str) {
        this.sideBgPath = str;
    }

    public final void setSideBottomBgPath(@Nullable String str) {
        this.sideBottomBgPath = str;
    }

    public final void setSideLineColor(int i) {
        this.sideLineColor = i;
    }

    public final void setTailBgPath(@Nullable String str) {
        this.tailBgPath = str;
    }

    public final void setTailColor(int i) {
        this.tailColor = i;
    }

    public final void setTailColorModel(boolean z) {
        this.isTailColorModel = z;
    }

    public final void setTailIconColor(int i) {
        this.tailIconColor = i;
    }

    public final void setTailIconColorNight(int i) {
        this.tailIconColorNight = i;
    }

    public final void setTailIconColorSelected(int i) {
        this.tailIconColorSelected = i;
    }

    public final void setTailIconColorSelectedNight(int i) {
        this.tailIconColorSelectedNight = i;
    }

    public final void setTailIconPath(@NotNull List<String> list) {
        this.tailIconPath = list;
    }

    public final void setTailIconSelectedPath(@NotNull List<String> list) {
        this.tailIconSelectedPath = list;
    }

    public final void setTailSelectedColor(int i) {
        this.tailSelectedColor = i;
    }

    public final void setVer(long j) {
        this.ver = j;
    }
}
