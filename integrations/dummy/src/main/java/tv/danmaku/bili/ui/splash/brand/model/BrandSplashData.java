package tv.danmaku.bili.ui.splash.brand.model;

import androidx.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.bili.ui.splash.common.search.QueryItem;

/* compiled from: BL */
@Keep
/* loaded from: classes17.dex */
public final class BrandSplashData {
    @Nullable
    private List<BrandSplash> brandList;
    @Nullable
    private String forceShowHash;
    private int forceShowTimes;
    private boolean forcibly;
    @Nullable
    private List<PreloadBrandData> preloadList;
    private long pullInterval;
    @Nullable
    private List<QueryItem> queryList;
    @NotNull
    private String rule;
    @Nullable
    private List<NormalBrandShow> showList;

    public BrandSplashData(long j, @NotNull String str, boolean z, @Nullable List<NormalBrandShow> list, @Nullable List<BrandSplash> list2, @Nullable List<PreloadBrandData> list3, @Nullable List<QueryItem> list4, int i, @Nullable String str2) {
        this.pullInterval = j;
        this.rule = str;
        this.forcibly = z;
        this.showList = list;
        this.brandList = list2;
        this.preloadList = list3;
        this.queryList = list4;
        this.forceShowTimes = i;
        this.forceShowHash = str2;
    }

    public final long component1() {
        return this.pullInterval;
    }

    @NotNull
    public final String component2() {
        return this.rule;
    }

    public final boolean component3() {
        return this.forcibly;
    }

    @Nullable
    public final List<NormalBrandShow> component4() {
        return this.showList;
    }

    @Nullable
    public final List<BrandSplash> component5() {
        return this.brandList;
    }

    @Nullable
    public final List<PreloadBrandData> component6() {
        return this.preloadList;
    }

    @Nullable
    public final List<QueryItem> component7() {
        return this.queryList;
    }

    public final int component8() {
        return this.forceShowTimes;
    }

    @Nullable
    public final String component9() {
        return this.forceShowHash;
    }

    @NotNull
    public final BrandSplashData copy(long j, @NotNull String str, boolean z, @Nullable List<NormalBrandShow> list, @Nullable List<BrandSplash> list2, @Nullable List<PreloadBrandData> list3, @Nullable List<QueryItem> list4, int i, @Nullable String str2) {
        return new BrandSplashData(j, str, z, list, list2, list3, list4, i, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrandSplashData) {
            BrandSplashData brandSplashData = (BrandSplashData) obj;
            return this.pullInterval == brandSplashData.pullInterval && Intrinsics.areEqual(this.rule, brandSplashData.rule) && this.forcibly == brandSplashData.forcibly && Intrinsics.areEqual(this.showList, brandSplashData.showList) && Intrinsics.areEqual(this.brandList, brandSplashData.brandList) && Intrinsics.areEqual(this.preloadList, brandSplashData.preloadList) && Intrinsics.areEqual(this.queryList, brandSplashData.queryList) && this.forceShowTimes == brandSplashData.forceShowTimes && Intrinsics.areEqual(this.forceShowHash, brandSplashData.forceShowHash);
        }
        return false;
    }

    @Nullable
    public final List<BrandSplash> getBrandList() {
        return this.brandList;
    }

    @Nullable
    public final String getForceShowHash() {
        return this.forceShowHash;
    }

    public final int getForceShowTimes() {
        return this.forceShowTimes;
    }

    public final boolean getForcibly() {
        return this.forcibly;
    }

    @Nullable
    public final List<PreloadBrandData> getPreloadList() {
        return this.preloadList;
    }

    public final long getPullInterval() {
        return this.pullInterval;
    }

    @Nullable
    public final List<QueryItem> getQueryList() {
        return this.queryList;
    }

    @NotNull
    public final String getRule() {
        return this.rule;
    }

    @Nullable
    public final List<NormalBrandShow> getShowList() {
        return this.showList;
    }

    public final void setBrandList(@Nullable List<BrandSplash> list) {
        this.brandList = list;
    }

    public final void setForceShowHash(@Nullable String str) {
        this.forceShowHash = str;
    }

    public final void setForceShowTimes(int i) {
        this.forceShowTimes = i;
    }

    public final void setForcibly(boolean z) {
        this.forcibly = z;
    }

    public final void setPreloadList(@Nullable List<PreloadBrandData> list) {
        this.preloadList = list;
    }

    public final void setPullInterval(long j) {
        this.pullInterval = j;
    }

    public final void setQueryList(@Nullable List<QueryItem> list) {
        this.queryList = list;
    }

    public final void setRule(@NotNull String str) {
        this.rule = str;
    }

    public final void setShowList(@Nullable List<NormalBrandShow> list) {
        this.showList = list;
    }

    @NotNull
    public String toString() {
        return "BrandSplashData(pullInterval=" + this.pullInterval + ", rule=" + this.rule + ", forcibly=" + this.forcibly + ", showList=" + this.showList + ", brandList=" + this.brandList + ", preloadList=" + this.preloadList + ", queryList=" + this.queryList + ", forceShowTimes=" + this.forceShowTimes + ", forceShowHash=" + this.forceShowHash + ')';
    }
}
